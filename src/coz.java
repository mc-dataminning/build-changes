import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class coz extends cnx implements cof {
   public static final ddl e = new dek(true, false, Optional.empty(), lu.e.a(aws.cz).map(Function.identity()));
   public static final double f = 0.25;

   public coz(btq<? extends coz> $$0, dds $$1) {
      super($$0, $$1);
      this.d = 0.0;
   }

   public coz(btq<? extends coz> $$0, dds $$1, btj $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
      this.d = 0.0;
   }

   coz(btq<? extends coz> $$0, double $$1, double $$2, double $$3, eye $$4, dds $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.d = 0.0;
   }

   @Override
   protected exz aw() {
      float $$0 = this.ao().n().a() / 2.0F;
      float $$1 = this.ao().n().b();
      float $$2 = 0.15F;
      return new exz(
         this.dq().d - (double)$$0,
         this.dq().e - 0.15F,
         this.dq().f - (double)$$0,
         this.dq().d + (double)$$0,
         this.dq().e - 0.15F + (double)$$1,
         this.dq().f + (double)$$0
      );
   }

   @Override
   public boolean i(btj $$0) {
      return $$0 instanceof coz ? false : super.i($$0);
   }

   @Override
   protected boolean b(btj $$0) {
      if ($$0 instanceof coz) {
         return false;
      } else {
         return $$0.ao() == btq.E ? false : super.b($$0);
      }
   }

   @Override
   protected void a(eyb $$0) {
      super.a($$0);
      if (!this.dS().B) {
         buf $$2 = this.s() instanceof buf $$1 ? $$1 : null;
         btj $$3 = $$0.a();
         if ($$2 != null) {
            $$2.B($$3);
         }

         bsb $$4 = this.dT().c(this, $$2);
         if ($$3.a($$4, 1.0F) && $$3 instanceof buf $$5) {
            day.a((arg)this.dS(), (btj)$$5, $$4);
         }

         this.a(this.dq());
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
   }

   protected abstract void a(eye var1);

   @Override
   protected void a(eya $$0) {
      super.a($$0);
      if (!this.dS().B) {
         ki $$1 = $$0.b().q();
         eye $$2 = eye.a($$1).d(0.25, 0.25, 0.25);
         eye $$3 = $$0.e().e($$2);
         this.a($$3);
         this.as();
      }
   }

   @Override
   protected void a(eyc $$0) {
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
   public cvl m() {
      return cvl.k;
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
   public boolean a(bsb $$0, float $$1) {
      return false;
   }
}
