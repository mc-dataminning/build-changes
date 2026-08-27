import com.google.common.base.Strings;
import com.google.common.base.Suppliers;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class eyt extends epo<eyr> {
   private final eyu a;
   private final List<eyr> l = Lists.newArrayList();
   @Nullable
   private String m;

   public eyt(eyu $$0, enn $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      super($$1, $$2, $$3, $$4, $$5, $$6);
      this.a = $$0;
      this.b(false);
      this.c(false);
   }

   @Override
   protected void b(eox $$0) {
      $$0.c(this.i, this.f + 4, this.h, this.g);
   }

   public void a(Collection<UUID> $$0, double $$1, boolean $$2) {
      Map<UUID, eyr> $$3 = new HashMap<>();
      this.a($$0, $$3);
      this.a($$3, $$2);
      this.a($$3.values(), $$1);
   }

   private void a(Collection<UUID> $$0, Map<UUID, eyr> $$1) {
      fex $$2 = this.b.t.cl;

      for (UUID $$3 : $$0) {
         ffb $$4 = $$2.a($$3);
         if ($$4 != null) {
            boolean $$5 = $$4.d();
            $$1.put($$3, new eyr(this.b, this.a, $$3, $$4.a().getName(), $$4::j, $$5));
         }
      }
   }

   private void a(Map<UUID, eyr> $$0, boolean $$1) {
      for (GameProfile $$3 : a(this.b.aW().b())) {
         eyr $$4;
         if ($$1) {
            $$4 = $$0.computeIfAbsent($$3.getId(), $$1x -> {
               eyr $$2 = new eyr(this.b, this.a, $$3.getId(), $$3.getName(), Suppliers.memoize(() -> this.b.ak().b($$3)), true);
               $$2.c(true);
               return $$2;
            });
         } else {
            $$4 = $$0.get($$3.getId());
            if ($$4 == null) {
               continue;
            }
         }

         $$4.d(true);
      }
   }

   private static Collection<GameProfile> a(ffh $$0) {
      Set<GameProfile> $$1 = new ObjectLinkedOpenHashSet();

      for (int $$2 = $$0.b(); $$2 >= $$0.a(); $$2--) {
         ffj $$3 = $$0.b($$2);
         if ($$3 instanceof ffk.a) {
            ffk.a $$4 = (ffk.a)$$3;
            if ($$4.g().h()) {
               $$1.add($$4.f());
            }
         }
      }

      return $$1;
   }

   private void e() {
      this.l.sort(Comparator.<eyr, Integer>comparing($$0 -> {
         if ($$0.e().equals(this.b.U().g())) {
            return 0;
         } else if ($$0.e().version() == 2) {
            return 4;
         } else if (this.b.aW().a($$0.e())) {
            return 1;
         } else {
            return $$0.g() ? 2 : 3;
         }
      }).thenComparing($$0 -> {
         if (!$$0.d().isBlank()) {
            int $$1 = $$0.d().codePointAt(0);
            if ($$1 == 95 || $$1 >= 97 && $$1 <= 122 || $$1 >= 65 && $$1 <= 90 || $$1 >= 48 && $$1 <= 57) {
               return 0;
            }
         }

         return 1;
      }).thenComparing(eyr::d, String::compareToIgnoreCase));
   }

   private void a(Collection<eyr> $$0, double $$1) {
      this.l.clear();
      this.l.addAll($$0);
      this.e();
      this.v();
      this.a(this.l);
      this.a($$1);
   }

   private void v() {
      if (this.m != null) {
         this.l.removeIf($$0 -> !$$0.d().toLowerCase(Locale.ROOT).contains(this.m));
         this.a(this.l);
      }
   }

   public void a(String $$0) {
      this.m = $$0;
   }

   public boolean d() {
      return this.l.isEmpty();
   }

   public void a(ffb $$0, eyu.a $$1) {
      UUID $$2 = $$0.a().getId();

      for (eyr $$3 : this.l) {
         if ($$3.e().equals($$2)) {
            $$3.c(false);
            return;
         }
      }

      if (($$1 == eyu.a.a || this.b.aK().c($$2)) && (Strings.isNullOrEmpty(this.m) || $$0.a().getName().toLowerCase(Locale.ROOT).contains(this.m))) {
         boolean $$4 = $$0.d();
         eyr $$5 = new eyr(this.b, this.a, $$0.a().getId(), $$0.a().getName(), $$0::j, $$4);
         this.b((eyr)$$5);
         this.l.add($$5);
      }
   }

   public void a(UUID $$0) {
      for (eyr $$1 : this.l) {
         if ($$1.e().equals($$0)) {
            $$1.c(true);
            return;
         }
      }
   }
}
