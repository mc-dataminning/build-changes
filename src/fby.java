import com.google.common.base.Strings;
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

public class fby extends eso<fbw> {
   private final fbz a;
   private final List<fbw> l = Lists.newArrayList();
   @Nullable
   private String m;

   public fby(fbz $$0, eqn $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      super($$1, $$2, $$3, $$4, $$5, $$6);
      this.a = $$0;
      this.b(false);
   }

   @Override
   protected void a(erx $$0) {
      $$0.c(this.i, this.f + 4, this.h, this.g);
   }

   public void a(Collection<UUID> $$0, double $$1, boolean $$2) {
      Map<UUID, fbw> $$3 = new HashMap<>();
      this.a($$0, $$3);
      this.a($$3, $$2);
      this.a($$3.values(), $$1);
   }

   private void a(Collection<UUID> $$0, Map<UUID, fbw> $$1) {
      fif $$2 = this.b.t.cl;

      for (UUID $$3 : $$0) {
         fil $$4 = $$2.a($$3);
         if ($$4 != null) {
            boolean $$5 = $$4.d();
            $$1.put($$3, new fbw(this.b, this.a, $$3, $$4.a().getName(), $$4::g, $$5));
         }
      }
   }

   private void a(Map<UUID, fbw> $$0, boolean $$1) {
      for (GameProfile $$3 : a(this.b.aW().b())) {
         fbw $$4;
         if ($$1) {
            $$4 = $$0.computeIfAbsent($$3.getId(), $$1x -> {
               fbw $$2 = new fbw(this.b, this.a, $$3.getId(), $$3.getName(), this.b.ak().a($$3), true);
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

   private static Collection<GameProfile> a(fir $$0) {
      Set<GameProfile> $$1 = new ObjectLinkedOpenHashSet();

      for (int $$2 = $$0.b(); $$2 >= $$0.a(); $$2--) {
         fit $$3 = $$0.b($$2);
         if ($$3 instanceof fiu.a) {
            fiu.a $$4 = (fiu.a)$$3;
            if ($$4.g().h()) {
               $$1.add($$4.f());
            }
         }
      }

      return $$1;
   }

   private void e() {
      this.l.sort(Comparator.<fbw, Integer>comparing($$0 -> {
         if (this.b.b($$0.e())) {
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
      }).thenComparing(fbw::d, String::compareToIgnoreCase));
   }

   private void a(Collection<fbw> $$0, double $$1) {
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

   public void a(fil $$0, fbz.a $$1) {
      UUID $$2 = $$0.a().getId();

      for (fbw $$3 : this.l) {
         if ($$3.e().equals($$2)) {
            $$3.c(false);
            return;
         }
      }

      if (($$1 == fbz.a.a || this.b.aK().c($$2)) && (Strings.isNullOrEmpty(this.m) || $$0.a().getName().toLowerCase(Locale.ROOT).contains(this.m))) {
         boolean $$4 = $$0.d();
         fbw $$5 = new fbw(this.b, this.a, $$0.a().getId(), $$0.a().getName(), $$0::g, $$4);
         this.b($$5);
         this.l.add($$5);
      }
   }

   public void a(UUID $$0) {
      for (fbw $$1 : this.l) {
         if ($$1.e().equals($$0)) {
            $$1.c(true);
            return;
         }
      }
   }
}
