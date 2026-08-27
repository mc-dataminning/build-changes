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

public class fgl extends ewn<fgj> {
   private final fgm a;
   private final List<fgj> m = Lists.newArrayList();
   @Nullable
   private String n;

   public fgl(fgm $$0, euk $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      super($$1, $$2, $$3, $$4, $$5, $$6);
      this.a = $$0;
      this.b(false);
   }

   @Override
   protected void a(evw $$0) {
      $$0.c(this.j, this.g + 4, this.i, this.h);
   }

   public void a(Collection<UUID> $$0, double $$1, boolean $$2) {
      Map<UUID, fgj> $$3 = new HashMap<>();
      this.a($$0, $$3);
      this.a($$3, $$2);
      this.a($$3.values(), $$1);
   }

   private void a(Collection<UUID> $$0, Map<UUID, fgj> $$1) {
      fmu $$2 = this.c.s.cn;

      for (UUID $$3 : $$0) {
         fnc $$4 = $$2.a($$3);
         if ($$4 != null) {
            boolean $$5 = $$4.d();
            $$1.put($$3, new fgj(this.c, this.a, $$3, $$4.a().getName(), $$4::g, $$5));
         }
      }
   }

   private void a(Map<UUID, fgj> $$0, boolean $$1) {
      for (GameProfile $$3 : a(this.c.aW().b())) {
         fgj $$4;
         if ($$1) {
            $$4 = $$0.computeIfAbsent($$3.getId(), $$1x -> {
               fgj $$2 = new fgj(this.c, this.a, $$3.getId(), $$3.getName(), this.c.ak().a($$3), true);
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

   private static Collection<GameProfile> a(fni $$0) {
      Set<GameProfile> $$1 = new ObjectLinkedOpenHashSet();

      for (int $$2 = $$0.b(); $$2 >= $$0.a(); $$2--) {
         fnk $$3 = $$0.b($$2);
         if ($$3 instanceof fnl.a) {
            fnl.a $$4 = (fnl.a)$$3;
            if ($$4.g().h()) {
               $$1.add($$4.f());
            }
         }
      }

      return $$1;
   }

   private void v() {
      this.m.sort(Comparator.<fgj, Integer>comparing($$0 -> {
         if (this.c.b($$0.e())) {
            return 0;
         } else if (this.c.aW().a($$0.e())) {
            return 1;
         } else if ($$0.e().version() == 2) {
            return 4;
         } else {
            return $$0.h() ? 2 : 3;
         }
      }).thenComparing($$0 -> {
         if (!$$0.c().isBlank()) {
            int $$1 = $$0.c().codePointAt(0);
            if ($$1 == 95 || $$1 >= 97 && $$1 <= 122 || $$1 >= 65 && $$1 <= 90 || $$1 >= 48 && $$1 <= 57) {
               return 0;
            }
         }

         return 1;
      }).thenComparing(fgj::c, String::compareToIgnoreCase));
   }

   private void a(Collection<fgj> $$0, double $$1) {
      this.m.clear();
      this.m.addAll($$0);
      this.v();
      this.w();
      this.a(this.m);
      this.a($$1);
   }

   private void w() {
      if (this.n != null) {
         this.m.removeIf($$0 -> !$$0.c().toLowerCase(Locale.ROOT).contains(this.n));
         this.a(this.m);
      }
   }

   public void a(String $$0) {
      this.n = $$0;
   }

   public boolean e() {
      return this.m.isEmpty();
   }

   public void a(fnc $$0, fgm.a $$1) {
      UUID $$2 = $$0.a().getId();

      for (fgj $$3 : this.m) {
         if ($$3.e().equals($$2)) {
            $$3.c(false);
            return;
         }
      }

      if (($$1 == fgm.a.a || this.c.aJ().c($$2)) && (Strings.isNullOrEmpty(this.n) || $$0.a().getName().toLowerCase(Locale.ROOT).contains(this.n))) {
         boolean $$4 = $$0.d();
         fgj $$5 = new fgj(this.c, this.a, $$0.a().getId(), $$0.a().getName(), $$0::g, $$4);
         this.b($$5);
         this.m.add($$5);
      }
   }

   public void a(UUID $$0) {
      for (fgj $$1 : this.m) {
         if ($$1.e().equals($$0)) {
            $$1.c(true);
            return;
         }
      }
   }
}
