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

public class frm extends fhl<frk> {
   private final frn a;
   private final List<frk> m = Lists.newArrayList();
   @Nullable
   private String n;

   public frm(frn $$0, ffg $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.a = $$0;
   }

   @Override
   protected void b(fgs $$0) {
   }

   @Override
   protected void a(fgs $$0) {
   }

   @Override
   protected void c(fgs $$0) {
      $$0.c(this.C(), this.D() + 4, this.E(), this.F());
   }

   public void a(Collection<UUID> $$0, double $$1, boolean $$2) {
      Map<UUID, frk> $$3 = new HashMap<>();
      this.a($$0, $$3);
      this.a($$3, $$2);
      this.a($$3.values(), $$1);
   }

   private void a(Collection<UUID> $$0, Map<UUID, frk> $$1) {
      fxx $$2 = this.c.s.cz;

      for (UUID $$3 : $$0) {
         fyh $$4 = $$2.a($$3);
         if ($$4 != null) {
            boolean $$5 = $$4.d();
            $$1.put($$3, new frk(this.c, this.a, $$3, $$4.a().getName(), $$4::g, $$5));
         }
      }
   }

   private void a(Map<UUID, frk> $$0, boolean $$1) {
      for (GameProfile $$3 : a(this.c.aZ().b())) {
         frk $$4;
         if ($$1) {
            $$4 = $$0.computeIfAbsent($$3.getId(), $$1x -> {
               frk $$2 = new frk(this.c, this.a, $$3.getId(), $$3.getName(), this.c.am().a($$3), true);
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

   private static Collection<GameProfile> a(fyq $$0) {
      Set<GameProfile> $$1 = new ObjectLinkedOpenHashSet();

      for (int $$2 = $$0.b(); $$2 >= $$0.a(); $$2--) {
         fys $$3 = $$0.b($$2);
         if ($$3 instanceof fyt.a) {
            fyt.a $$4 = (fyt.a)$$3;
            if ($$4.g().i()) {
               $$1.add($$4.f());
            }
         }
      }

      return $$1;
   }

   private void I() {
      this.m.sort(Comparator.<frk, Integer>comparing($$0 -> {
         if (this.c.b($$0.d())) {
            return 0;
         } else if (this.c.aZ().a($$0.d())) {
            return 1;
         } else if ($$0.d().version() == 2) {
            return 4;
         } else {
            return $$0.j() ? 2 : 3;
         }
      }).thenComparing($$0 -> {
         if (!$$0.c().isBlank()) {
            int $$1 = $$0.c().codePointAt(0);
            if ($$1 == 95 || $$1 >= 97 && $$1 <= 122 || $$1 >= 65 && $$1 <= 90 || $$1 >= 48 && $$1 <= 57) {
               return 0;
            }
         }

         return 1;
      }).thenComparing(frk::c, String::compareToIgnoreCase));
   }

   private void a(Collection<frk> $$0, double $$1) {
      this.m.clear();
      this.m.addAll($$0);
      this.I();
      this.J();
      this.a(this.m);
      this.a($$1);
   }

   private void J() {
      if (this.n != null) {
         this.m.removeIf($$0 -> !$$0.c().toLowerCase(Locale.ROOT).contains(this.n));
         this.a(this.m);
      }
   }

   public void a(String $$0) {
      this.n = $$0;
   }

   public boolean c() {
      return this.m.isEmpty();
   }

   public void a(fyh $$0, frn.a $$1) {
      UUID $$2 = $$0.a().getId();

      for (frk $$3 : this.m) {
         if ($$3.d().equals($$2)) {
            $$3.c(false);
            return;
         }
      }

      if (($$1 == frn.a.a || this.c.aM().c($$2)) && (Strings.isNullOrEmpty(this.n) || $$0.a().getName().toLowerCase(Locale.ROOT).contains(this.n))) {
         boolean $$4 = $$0.d();
         frk $$5 = new frk(this.c, this.a, $$0.a().getId(), $$0.a().getName(), $$0::g, $$4);
         this.b((frk)$$5);
         this.m.add($$5);
      }
   }

   public void a(UUID $$0) {
      for (frk $$1 : this.m) {
         if ($$1.d().equals($$0)) {
            $$1.c(true);
            return;
         }
      }
   }
}
