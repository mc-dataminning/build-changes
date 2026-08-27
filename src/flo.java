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

public class flo extends fbm<flm> {
   private final flp a;
   private final List<flm> m = Lists.newArrayList();
   @Nullable
   private String n;

   public flo(flp $$0, ezg $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.a = $$0;
      this.c(false);
   }

   @Override
   protected void a(fat $$0) {
      $$0.c(this.B(), this.C() + 4, this.D(), this.E());
   }

   public void a(Collection<UUID> $$0, double $$1, boolean $$2) {
      Map<UUID, flm> $$3 = new HashMap<>();
      this.a($$0, $$3);
      this.a($$3, $$2);
      this.a($$3.values(), $$1);
   }

   private void a(Collection<UUID> $$0, Map<UUID, flm> $$1) {
      frz $$2 = this.c.s.cu;

      for (UUID $$3 : $$0) {
         fsj $$4 = $$2.a($$3);
         if ($$4 != null) {
            boolean $$5 = $$4.d();
            $$1.put($$3, new flm(this.c, this.a, $$3, $$4.a().getName(), $$4::g, $$5));
         }
      }
   }

   private void a(Map<UUID, flm> $$0, boolean $$1) {
      for (GameProfile $$3 : a(this.c.ba().b())) {
         flm $$4;
         if ($$1) {
            $$4 = $$0.computeIfAbsent($$3.getId(), $$1x -> {
               flm $$2 = new flm(this.c, this.a, $$3.getId(), $$3.getName(), this.c.an().a($$3), true);
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

   private static Collection<GameProfile> a(fss $$0) {
      Set<GameProfile> $$1 = new ObjectLinkedOpenHashSet();

      for (int $$2 = $$0.b(); $$2 >= $$0.a(); $$2--) {
         fsu $$3 = $$0.b($$2);
         if ($$3 instanceof fsv.a) {
            fsv.a $$4 = (fsv.a)$$3;
            if ($$4.g().i()) {
               $$1.add($$4.f());
            }
         }
      }

      return $$1;
   }

   private void e() {
      this.m.sort(Comparator.<flm, Integer>comparing($$0 -> {
         if (this.c.b($$0.c())) {
            return 0;
         } else if (this.c.ba().a($$0.c())) {
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
      }).thenComparing(flm::b, String::compareToIgnoreCase));
   }

   private void a(Collection<flm> $$0, double $$1) {
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

   public void a(fsj $$0, flp.a $$1) {
      UUID $$2 = $$0.a().getId();

      for (flm $$3 : this.m) {
         if ($$3.c().equals($$2)) {
            $$3.c(false);
            return;
         }
      }

      if (($$1 == flp.a.a || this.c.aM().c($$2)) && (Strings.isNullOrEmpty(this.n) || $$0.a().getName().toLowerCase(Locale.ROOT).contains(this.n))) {
         boolean $$4 = $$0.d();
         flm $$5 = new flm(this.c, this.a, $$0.a().getId(), $$0.a().getName(), $$0::g, $$4);
         this.b($$5);
         this.m.add($$5);
      }
   }

   public void a(UUID $$0) {
      for (flm $$1 : this.m) {
         if ($$1.c().equals($$0)) {
            $$1.c(true);
            return;
         }
      }
   }
}
