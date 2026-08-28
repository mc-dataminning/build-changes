import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class ctj extends csg implements csp {
   public static final djr d = new dkq(true, false, Optional.empty(), mg.e.a(axe.cF).map(Function.identity()));
   public static final double e = 0.25;

   public ctj(bxc<? extends ctj> $$0, djx $$1) {
      super($$0, $$1);
      this.c = 0.0;
   }

   public ctj(bxc<? extends ctj> $$0, djx $$1, bwt $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
      this.c = 0.0;
   }

   ctj(bxc<? extends ctj> $$0, double $$1, double $$2, double $$3, ffq $$4, djx $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.c = 0.0;
   }

   @Override
   protected ffl c(ffq $$0) {
      float $$1 = this.an().n().a() / 2.0F;
      float $$2 = this.an().n().b();
      float $$3 = 0.15F;
      return new ffl($$0.d - (double)$$1, $$0.e - 0.15F, $$0.f - (double)$$1, $$0.d + (double)$$1, $$0.e - 0.15F + (double)$$2, $$0.f + (double)$$1);
   }

   @Override
   public boolean i(bwt $$0) {
      return $$0 instanceof ctj ? false : super.i($$0);
   }

   @Override
   protected boolean b(bwt $$0) {
      if ($$0 instanceof ctj) {
         return false;
      } else {
         return $$0.an() == bxc.S ? false : super.b($$0);
      }
   }

   @Override
   protected void a(ffn $$0) {
      super.a($$0);
      if (this.dV() instanceof ars $$1) {
         bxu $$4 = this.q() instanceof bxu $$3 ? $$3 : null;
         bwt $$5 = $$0.a();
         if ($$4 != null) {
            $$4.B($$5);
         }

         bvi $$6 = this.dW().c(this, $$4);
         if ($$5.a($$1, $$6, 1.0F) && $$5 instanceof bxu $$7) {
            dgn.a($$1, (bwt)$$7, $$6);
         }

         this.a(this.dt());
      }
   }

   @Override
   public void i(double $$0, double $$1, double $$2) {
   }

   protected abstract void a(ffq var1);

   @Override
   protected void a(ffm $$0) {
      super.a($$0);
      if (!this.dV().C) {
         ka $$1 = $$0.c().q();
         ffq $$2 = ffq.a($$1).d(0.25, 0.25, 0.25);
         ffq $$3 = $$0.g().e($$2);
         this.a($$3);
         this.aq();
      }
   }

   @Override
   protected void a(ffo $$0) {
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
   public czy f() {
      return czy.k;
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
   protected lw j() {
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
