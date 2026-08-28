import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class cpr extends coq implements coy {
   public static final deo e = new dfn(true, false, Optional.empty(), lx.e.a(awz.cA).map(Function.identity()));
   public static final double f = 0.25;

   public cpr(bug<? extends cpr> $$0, dev $$1) {
      super($$0, $$1);
      this.d = 0.0;
   }

   public cpr(bug<? extends cpr> $$0, dev $$1, btz $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
      this.d = 0.0;
   }

   cpr(bug<? extends cpr> $$0, double $$1, double $$2, double $$3, ezh $$4, dev $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.d = 0.0;
   }

   @Override
   protected ezc ay() {
      float $$0 = this.aq().n().a() / 2.0F;
      float $$1 = this.aq().n().b();
      float $$2 = 0.15F;
      return new ezc(
         this.dv().d - (double)$$0,
         this.dv().e - 0.15F,
         this.dv().f - (double)$$0,
         this.dv().d + (double)$$0,
         this.dv().e - 0.15F + (double)$$1,
         this.dv().f + (double)$$0
      );
   }

   @Override
   public boolean i(btz $$0) {
      return $$0 instanceof cpr ? false : super.i($$0);
   }

   @Override
   protected boolean b(btz $$0) {
      if ($$0 instanceof cpr) {
         return false;
      } else {
         return $$0.aq() == bug.E ? false : super.b($$0);
      }
   }

   @Override
   protected void a(eze $$0) {
      super.a($$0);
      if (!this.dX().C) {
         buv $$2 = this.s() instanceof buv $$1 ? $$1 : null;
         btz $$3 = $$0.a();
         if ($$2 != null) {
            $$2.B($$3);
         }

         bsp $$4 = this.dY().c(this, $$2);
         if ($$3.a($$4, 1.0F) && $$3 instanceof buv $$5) {
            dbo.a((arm)this.dX(), (btz)$$5, $$4);
         }

         this.a(this.dv());
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
   }

   protected abstract void a(ezh var1);

   @Override
   protected void a(ezd $$0) {
      super.a($$0);
      if (!this.dX().C) {
         kk $$1 = $$0.c().q();
         ezh $$2 = ezh.a($$1).d(0.25, 0.25, 0.25);
         ezh $$3 = $$0.g().e($$2);
         this.a($$3);
         this.au();
      }
   }

   @Override
   protected void a(ezf $$0) {
      super.a($$0);
      if (!this.dX().C) {
         this.au();
      }
   }

   @Override
   protected boolean o() {
      return false;
   }

   @Override
   public cvx m() {
      return cvx.k;
   }

   @Override
   protected float t() {
      return 1.0F;
   }

   @Override
   protected float v() {
      return this.t();
   }

   @Nullable
   @Override
   protected lo q() {
      return null;
   }

   @Override
   public void l() {
      if (!this.dX().C && this.dD() > this.dX().an() + 30) {
         this.a(this.dv());
         this.au();
      } else {
         super.l();
      }
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      return false;
   }
}
