import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class ctl extends csi implements csr {
   public static final djt d = new dks(true, false, Optional.empty(), mh.e.a(axg.cF).map(Function.identity()));
   public static final double e = 0.25;

   public ctl(bxe<? extends ctl> $$0, djz $$1) {
      super($$0, $$1);
      this.c = 0.0;
   }

   public ctl(bxe<? extends ctl> $$0, djz $$1, bwv $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
      this.c = 0.0;
   }

   ctl(bxe<? extends ctl> $$0, double $$1, double $$2, double $$3, ffs $$4, djz $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.c = 0.0;
   }

   @Override
   protected ffn c(ffs $$0) {
      float $$1 = this.an().n().a() / 2.0F;
      float $$2 = this.an().n().b();
      float $$3 = 0.15F;
      return new ffn($$0.d - (double)$$1, $$0.e - 0.15F, $$0.f - (double)$$1, $$0.d + (double)$$1, $$0.e - 0.15F + (double)$$2, $$0.f + (double)$$1);
   }

   @Override
   public boolean i(bwv $$0) {
      return $$0 instanceof ctl ? false : super.i($$0);
   }

   @Override
   protected boolean b(bwv $$0) {
      if ($$0 instanceof ctl) {
         return false;
      } else {
         return $$0.an() == bxe.S ? false : super.b($$0);
      }
   }

   @Override
   protected void a(ffp $$0) {
      super.a($$0);
      if (this.dV() instanceof aru $$1) {
         bxw $$4 = this.q() instanceof bxw $$3 ? $$3 : null;
         bwv $$5 = $$0.a();
         if ($$4 != null) {
            $$4.B($$5);
         }

         bvk $$6 = this.dW().c(this, $$4);
         if ($$5.a($$1, $$6, 1.0F) && $$5 instanceof bxw $$7) {
            dgp.a($$1, (bwv)$$7, $$6);
         }

         this.a(this.dt());
      }
   }

   @Override
   public void i(double $$0, double $$1, double $$2) {
   }

   protected abstract void a(ffs var1);

   @Override
   protected void a(ffo $$0) {
      super.a($$0);
      if (!this.dV().C) {
         kb $$1 = $$0.c().q();
         ffs $$2 = ffs.a($$1).d(0.25, 0.25, 0.25);
         ffs $$3 = $$0.g().e($$2);
         this.a($$3);
         this.aq();
      }
   }

   @Override
   protected void a(ffq $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.aq();
      }
   }

   @Override
   protected boolean g() {
      return false;
   }

   @Override
   public daa f() {
      return daa.k;
   }

   @Override
   protected float m() {
      return 1.0F;
   }

   @Override
   protected float n() {
      return this.m();
   }

   @Nullable
   @Override
   protected lx j() {
      return null;
   }

   @Override
   public void h() {
      if (!this.dV().C && this.dB() > this.dV().ao() + 30) {
         this.a(this.dt());
         this.aq();
      } else {
         super.h();
      }
   }
}
