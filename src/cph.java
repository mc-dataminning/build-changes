import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class cph extends cof implements coo {
   public static final dec e = new dfb(true, false, Optional.empty(), lv.e.a(awv.cz).map(Function.identity()));
   public static final double f = 0.25;

   public cph(bty<? extends cph> $$0, dej $$1) {
      super($$0, $$1);
      this.d = 0.0;
   }

   public cph(bty<? extends cph> $$0, dej $$1, btr $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
      this.d = 0.0;
   }

   cph(bty<? extends cph> $$0, double $$1, double $$2, double $$3, eyw $$4, dej $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.d = 0.0;
   }

   @Override
   protected eyr aw() {
      float $$0 = this.ao().n().a() / 2.0F;
      float $$1 = this.ao().n().b();
      float $$2 = 0.15F;
      return new eyr(
         this.dq().d - (double)$$0,
         this.dq().e - 0.15F,
         this.dq().f - (double)$$0,
         this.dq().d + (double)$$0,
         this.dq().e - 0.15F + (double)$$1,
         this.dq().f + (double)$$0
      );
   }

   @Override
   public boolean i(btr $$0) {
      return $$0 instanceof cph ? false : super.i($$0);
   }

   @Override
   protected boolean b(btr $$0) {
      if ($$0 instanceof cph) {
         return false;
      } else {
         return $$0.ao() == bty.E ? false : super.b($$0);
      }
   }

   @Override
   protected void a(eyt $$0) {
      super.a($$0);
      if (!this.dS().B) {
         bun $$2 = this.s() instanceof bun $$1 ? $$1 : null;
         btr $$3 = $$0.a();
         if ($$2 != null) {
            $$2.B($$3);
         }

         bsj $$4 = this.dT().c(this, $$2);
         if ($$3.a($$4, 1.0F) && $$3 instanceof bun $$5) {
            dbp.a((arj)this.dS(), (btr)$$5, $$4);
         }

         this.a(this.dq());
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
   }

   protected abstract void a(eyw var1);

   @Override
   protected void a(eys $$0) {
      super.a($$0);
      if (!this.dS().B) {
         kj $$1 = $$0.c().q();
         eyw $$2 = eyw.a($$1).d(0.25, 0.25, 0.25);
         eyw $$3 = $$0.g().e($$2);
         this.a($$3);
         this.as();
      }
   }

   @Override
   protected void a(eyu $$0) {
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
   public cvs m() {
      return cvs.k;
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
   protected lm q() {
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
   public boolean a(bsj $$0, float $$1) {
      return false;
   }
}
