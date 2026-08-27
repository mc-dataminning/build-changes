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

public class fhc extends exe<fha> {
   private final fhd a;
   private final List<fha> m = Lists.newArrayList();
   @Nullable
   private String n;

   public fhc(fhd $$0, eva $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.a = $$0;
      this.c(false);
   }

   @Override
   protected void a(ewm $$0) {
      $$0.c(this.B(), this.C() + 4, this.D(), this.E());
   }

   public void a(Collection<UUID> $$0, double $$1, boolean $$2) {
      Map<UUID, fha> $$3 = new HashMap<>();
      this.a($$0, $$3);
      this.a($$3, $$2);
      this.a($$3.values(), $$1);
   }

   private void a(Collection<UUID> $$0, Map<UUID, fha> $$1) {
      fnl $$2 = this.c.s.cn;

      for (UUID $$3 : $$0) {
         fnt $$4 = $$2.a($$3);
         if ($$4 != null) {
            boolean $$5 = $$4.d();
            $$1.put($$3, new fha(this.c, this.a, $$3, $$4.a().getName(), $$4::g, $$5));
         }
      }
   }

   private void a(Map<UUID, fha> $$0, boolean $$1) {
      for (GameProfile $$3 : a(this.c.aW().b())) {
         fha $$4;
         if ($$1) {
            $$4 = $$0.computeIfAbsent($$3.getId(), $$1x -> {
               fha $$2 = new fha(this.c, this.a, $$3.getId(), $$3.getName(), this.c.ak().a($$3), true);
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

   private static Collection<GameProfile> a(fnz $$0) {
      Set<GameProfile> $$1 = new ObjectLinkedOpenHashSet();

      for (int $$2 = $$0.b(); $$2 >= $$0.a(); $$2--) {
         fob $$3 = $$0.b($$2);
         if ($$3 instanceof foc.a) {
            foc.a $$4 = (foc.a)$$3;
            if ($$4.g().h()) {
               $$1.add($$4.f());
            }
         }
      }

      return $$1;
   }

   private void e() {
      this.m.sort(Comparator.<fha, Integer>comparing($$0 -> {
         if (this.c.b($$0.c())) {
            return 0;
         } else if (this.c.aW().a($$0.c())) {
            return 1;
         } else if ($$0.c().version() == 2) {
            return 4;
         } else {
            return $$0.i() ? 2 : 3;
         }
      }).thenComparing($$0 -> {
         if (!$$0.b().isBlank()) {
            int $$1 = $$0.b().codePointAt(0);
            if ($$1 == 95 || $$1 >= 97 && $$1 <= 122 || $$1 >= 65 && $$1 <= 90 || $$1 >= 48 && $$1 <= 57) {
               return 0;
            }
         }

         return 1;
      }).thenComparing(fha::b, String::compareToIgnoreCase));
   }

   private void a(Collection<fha> $$0, double $$1) {
      this.m.clear();
      this.m.addAll($$0);
      this.e();
      this.H();
      this.a(this.m);
      this.a($$1);
   }

   private void H() {
      if (this.n != null) {
         this.m.removeIf($$0 -> !$$0.b().toLowerCase(Locale.ROOT).contains(this.n));
         this.a(this.m);
      }
   }

   public void a(String $$0) {
      this.n = $$0;
   }

   public boolean d() {
      return this.m.isEmpty();
   }

   public void a(fnt $$0, fhd.a $$1) {
      UUID $$2 = $$0.a().getId();

      for (fha $$3 : this.m) {
         if ($$3.c().equals($$2)) {
            $$3.c(false);
            return;
         }
      }

      if (($$1 == fhd.a.a || this.c.aJ().c($$2)) && (Strings.isNullOrEmpty(this.n) || $$0.a().getName().toLowerCase(Locale.ROOT).contains(this.n))) {
         boolean $$4 = $$0.d();
         fha $$5 = new fha(this.c, this.a, $$0.a().getId(), $$0.a().getName(), $$0::g, $$4);
         this.b($$5);
         this.m.add($$5);
      }
   }

   public void a(UUID $$0) {
      for (fha $$1 : this.m) {
         if ($$1.c().equals($$0)) {
            $$1.c(true);
            return;
         }
      }
   }
}
