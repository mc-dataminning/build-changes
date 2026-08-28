import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fne extends fmu implements fmc, fov {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final xh e = xh.c("narration.tab_navigation.usage");
   private final fos f = fos.e();
   private int g;
   private final fnd h;
   private final ImmutableList<fnc> i;
   private final ImmutableList<fmi> j;

   fne(int $$0, fnd $$1, Iterable<fnc> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f.c().b();
      Builder<fmi> $$3 = ImmutableList.builder();

      for (fnc $$4 : $$2) {
         $$3.add(this.f.a(new fmi($$1, $$4, 0, 24)));
      }

      this.j = $$3.build();
   }

   public static fne.a a(fnd $$0, int $$1) {
      return new fne.a($$0, $$1);
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   @Override
   public void a(boolean $$0) {
      super.a($$0);
      if (this.aM_() != null) {
         this.aM_().a($$0);
      }
   }

   @Override
   public void a(@Nullable fmw $$0) {
      super.a($$0);
      if ($$0 instanceof fmi $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public fkj a(fpd $$0) {
      if (!this.aN_()) {
         fmi $$1 = this.d();
         if ($$1 != null) {
            return fkj.a(this, fkj.a($$1));
         }
      }

      return $$0 instanceof fpd.c ? null : super.a($$0);
   }

   @Override
   public List<? extends fmw> aJ_() {
      return this.j;
   }

   @Override
   public fov.a u() {
      return this.j.stream().map(fkx::u).max(Comparator.naturalOrder()).orElse(fov.a.a);
   }

   @Override
   public void b(fox $$0) {
      Optional<fmi> $$1 = this.j.stream().filter(fkx::A).findFirst().or(() -> Optional.ofNullable(this.d()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aN_()) {
         $$0.a(fow.d, e);
      }
   }

   protected void a(fox $$0, fmi $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(fow.b, xh.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
      $$0.a(gig::B, fqs.h, 0, this.f.E() + this.f.w() - 2, 0.0F, 0.0F, ((fmi)this.j.get(0)).D(), 2, 32, 2);
      int $$4 = ((fmi)this.j.get(this.j.size() - 1)).F();
      $$0.a(gig::B, fqs.h, $$4, this.f.E() + this.f.w() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      UnmodifiableIterator var6 = this.j.iterator();

      while (var6.hasNext()) {
         fmi $$5 = (fmi)var6.next();
         $$5.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public fph H() {
      return this.f.H();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = azj.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         fmi $$2 = (fmi)var3.next();
         $$2.k($$1);
      }

      this.f.a();
      this.f.m(azj.d((this.g - $$0) / 2, 2));
      this.f.n(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aN_()) {
         this.a((fmw)this.j.get($$0));
      } else {
         this.h.a((fnc)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (fqs.s()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(azj.a($$1, 0, this.i.size() - 1), true);
            return true;
         }
      }

      return false;
   }

   private int c(int $$0) {
      if ($$0 >= 49 && $$0 <= 57) {
         return $$0 - 49;
      } else {
         if ($$0 == 258) {
            int $$1 = this.c();
            if ($$1 != -1) {
               int $$2 = fqs.t() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int c() {
      fnc $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private fmi d() {
      int $$0 = this.c();
      return $$0 != -1 ? (fmi)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final fnd b;
      private final List<fnc> c = new ArrayList<>();

      a(fnd $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public fne.a a(fnc... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public fne a() {
         return new fne(this.a, this.b, this.c);
      }
   }
}
