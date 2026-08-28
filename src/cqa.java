import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class cqa extends coz implements cph {
   public static final dey e = new dfy(true, false, Optional.empty(), lz.e.a(axd.cA).map(Function.identity()));
   public static final double f = 0.25;

   public cqa(bup<? extends cqa> $$0, dff $$1) {
      super($$0, $$1);
      this.d = 0.0;
   }

   public cqa(bup<? extends cqa> $$0, dff $$1, bui $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
      this.d = 0.0;
   }

   cqa(bup<? extends cqa> $$0, double $$1, double $$2, double $$3, ezr $$4, dff $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.d = 0.0;
   }

   @Override
   protected ezm az() {
      float $$0 = this.ar().n().a() / 2.0F;
      float $$1 = this.ar().n().b();
      float $$2 = 0.15F;
      return new ezm(
         this.dw().d - (double)$$0,
         this.dw().e - 0.15F,
         this.dw().f - (double)$$0,
         this.dw().d + (double)$$0,
         this.dw().e - 0.15F + (double)$$1,
         this.dw().f + (double)$$0
      );
   }

   @Override
   public boolean i(bui $$0) {
      return $$0 instanceof cqa ? false : super.i($$0);
   }

   @Override
   protected boolean b(bui $$0) {
      if ($$0 instanceof cqa) {
         return false;
      } else {
         return $$0.ar() == bup.E ? false : super.b($$0);
      }
   }

   @Override
   protected void a(ezo $$0) {
      super.a($$0);
      if (!this.dY().C) {
         bve $$2 = this.s() instanceof bve $$1 ? $$1 : null;
         bui $$3 = $$0.a();
         if ($$2 != null) {
            $$2.B($$3);
         }

         bsy $$4 = this.dZ().c(this, $$2);
         if ($$3.a($$4, 1.0F) && $$3 instanceof bve $$5) {
            dby.a((arq)this.dY(), (bui)$$5, $$4);
         }

         this.a(this.dw());
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
   }

   protected abstract void a(ezr var1);

   @Override
   protected void a(ezn $$0) {
      super.a($$0);
      if (!this.dY().C) {
         kl $$1 = $$0.c().q();
         ezr $$2 = ezr.a($$1).d(0.25, 0.25, 0.25);
         ezr $$3 = $$0.g().e($$2);
         this.a($$3);
         this.av();
      }
   }

   @Override
   protected void a(ezp $$0) {
      super.a($$0);
      if (!this.dY().C) {
         this.av();
      }
   }

   @Override
   protected boolean o() {
      return false;
   }

   @Override
   public cwf m() {
      return cwf.k;
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
   protected lq q() {
      return null;
   }

   @Override
   public void l() {
      if (!this.dY().C && this.dE() > this.dY().al() + 30) {
         this.a(this.dw());
         this.av();
      } else {
         super.l();
      }
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      return false;
   }
}
