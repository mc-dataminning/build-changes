import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class cpe extends coc implements cok {
   public static final ddz e = new dey(true, false, Optional.empty(), lu.e.a(awt.cz).map(Function.identity()));
   public static final double f = 0.25;

   public cpe(btv<? extends cpe> $$0, deg $$1) {
      super($$0, $$1);
      this.d = 0.0;
   }

   public cpe(btv<? extends cpe> $$0, deg $$1, bto $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
      this.d = 0.0;
   }

   cpe(btv<? extends cpe> $$0, double $$1, double $$2, double $$3, eys $$4, deg $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.d = 0.0;
   }

   @Override
   protected eyn aw() {
      float $$0 = this.ao().n().a() / 2.0F;
      float $$1 = this.ao().n().b();
      float $$2 = 0.15F;
      return new eyn(
         this.dq().d - (double)$$0,
         this.dq().e - 0.15F,
         this.dq().f - (double)$$0,
         this.dq().d + (double)$$0,
         this.dq().e - 0.15F + (double)$$1,
         this.dq().f + (double)$$0
      );
   }

   @Override
   public boolean i(bto $$0) {
      return $$0 instanceof cpe ? false : super.i($$0);
   }

   @Override
   protected boolean b(bto $$0) {
      if ($$0 instanceof cpe) {
         return false;
      } else {
         return $$0.ao() == btv.E ? false : super.b($$0);
      }
   }

   @Override
   protected void a(eyp $$0) {
      super.a($$0);
      if (!this.dS().B) {
         buk $$2 = this.s() instanceof buk $$1 ? $$1 : null;
         bto $$3 = $$0.a();
         if ($$2 != null) {
            $$2.B($$3);
         }

         bsg $$4 = this.dT().c(this, $$2);
         if ($$3.a($$4, 1.0F) && $$3 instanceof buk $$5) {
            dbm.a((arh)this.dS(), (bto)$$5, $$4);
         }

         this.a(this.dq());
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
   }

   protected abstract void a(eys var1);

   @Override
   protected void a(eyo $$0) {
      super.a($$0);
      if (!this.dS().B) {
         ki $$1 = $$0.c().q();
         eys $$2 = eys.a($$1).d(0.25, 0.25, 0.25);
         eys $$3 = $$0.g().e($$2);
         this.a($$3);
         this.as();
      }
   }

   @Override
   protected void a(eyq $$0) {
      super.a($$0);
      if (!this.dS().B) {
         this.as();
      }
   }

   @Override
   protected boolean o() {
      return false;
   }

   @Override
   public cvp m() {
      return cvp.k;
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
   protected ll q() {
      return null;
   }

   @Override
   public void l() {
      if (!this.dS().B && this.dy() > this.dS().an() + 30) {
         this.a(this.dq());
         this.as();
      } else {
         super.l();
      }
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      return false;
   }
}
