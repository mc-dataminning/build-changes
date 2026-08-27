import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fid extends fht implements fhc, fjt {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final wx e = wx.c("narration.tab_navigation.usage");
   private final fjq f = fjq.e();
   private int g;
   private final fic h;
   private final ImmutableList<fib> i;
   private final ImmutableList<fhi> j;

   fid(int $$0, fic $$1, Iterable<fib> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f.c().b();
      Builder<fhi> $$3 = ImmutableList.builder();

      for (fib $$4 : $$2) {
         $$3.add(this.f.a(new fhi($$1, $$4, 0, 24)));
      }

      this.j = $$3.build();
   }

   public static fid.a a(fic $$0, int $$1) {
      return new fid.a($$0, $$1);
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   @Override
   public void a(boolean $$0) {
      super.a($$0);
      if (this.aH_() != null) {
         this.aH_().a($$0);
      }
   }

   @Override
   public void a(@Nullable fhv $$0) {
      super.a($$0);
      if ($$0 instanceof fhi $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public ffj a(fkb $$0) {
      if (!this.aI_()) {
         fhi $$1 = this.d();
         if ($$1 != null) {
            return ffj.a(this, ffj.a($$1));
         }
      }

      return $$0 instanceof fkb.c ? null : super.a($$0);
   }

   @Override
   public List<? extends fhv> aE_() {
      return this.j;
   }

   @Override
   public fjt.a t() {
      return this.j.stream().map(ffx::t).max(Comparator.naturalOrder()).orElse(fjt.a.a);
   }

   @Override
   public void b(fjv $$0) {
      Optional<fhi> $$1 = this.j.stream().filter(ffx::z).findFirst().or(() -> Optional.ofNullable(this.d()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aI_()) {
         $$0.a(fju.d, e);
      }
   }

   protected void a(fjv $$0, fhi $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(fju.b, wx.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(ffm $$0, int $$1, int $$2, float $$3) {
      RenderSystem.enableBlend();
      $$0.a(fly.h, 0, this.f.D() + this.f.v() - 2, 0.0F, 0.0F, ((fhi)this.j.get(0)).C(), 2, 32, 2);
      int $$4 = ((fhi)this.j.get(this.j.size() - 1)).E();
      $$0.a(fly.h, $$4, this.f.D() + this.f.v() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      RenderSystem.disableBlend();
      UnmodifiableIterator var6 = this.j.iterator();

      while (var6.hasNext()) {
         fhi $$5 = (fhi)var6.next();
         $$5.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public fkf G() {
      return this.f.G();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = ayd.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         fhi $$2 = (fhi)var3.next();
         $$2.k($$1);
      }

      this.f.a();
      this.f.m(ayd.d((this.g - $$0) / 2, 2));
      this.f.n(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aI_()) {
         this.a((fhv)this.j.get($$0));
      } else {
         this.h.a((fib)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (fly.r()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(ayd.a($$1, 0, this.i.size() - 1), true);
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
               int $$2 = fly.s() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int c() {
      fib $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private fhi d() {
      int $$0 = this.c();
      return $$0 != -1 ? (fhi)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final fic b;
      private final List<fib> c = new ArrayList<>();

      a(fic $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public fid.a a(fib... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public fid a() {
         return new fid(this.a, this.b, this.c);
      }
   }
}
