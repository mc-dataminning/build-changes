import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class cod extends cnc implements cnk {
   public static final dcn e = new ddl(true, false, Optional.empty(), lt.e.b(awd.cy).map(Function.identity()));

   public cod(bsw<? extends cod> $$0, dcu $$1) {
      super($$0, $$1);
      this.d = 0.0;
   }

   public cod(bsw<? extends cod> $$0, dcu $$1, bsq $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
      this.d = 0.0;
   }

   cod(bsw<? extends cod> $$0, double $$1, double $$2, double $$3, eww $$4, dcu $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.d = 0.0;
   }

   @Override
   protected ewr au() {
      float $$0 = this.am().n().a() / 2.0F;
      float $$1 = this.am().n().b();
      float $$2 = 0.15F;
      return new ewr(
         this.do().c - (double)$$0,
         this.do().d - 0.15F,
         this.do().e - (double)$$0,
         this.do().c + (double)$$0,
         this.do().d - 0.15F + (double)$$1,
         this.do().e + (double)$$0
      );
   }

   @Override
   public boolean i(bsq $$0) {
      return $$0 instanceof cod ? false : super.i($$0);
   }

   @Override
   protected boolean b(bsq $$0) {
      if ($$0 instanceof cod) {
         return false;
      } else {
         return $$0.am() == bsw.E ? false : super.b($$0);
      }
   }

   @Override
   protected void a(ewt $$0) {
      super.a($$0);
      if (!this.dQ().B) {
         btl $$2 = this.s() instanceof btl $$1 ? $$1 : null;
         bsq $$3 = $$0.a();
         if ($$2 != null) {
            $$2.A($$3);
         }

         brj $$4 = this.dR().c(this, $$2);
         if ($$3.a($$4, 1.0F) && $$3 instanceof btl $$5) {
            dac.a((aqt)this.dQ(), (bsq)$$5, $$4);
         }

         this.y();
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
   }

   protected abstract void y();

   @Override
   protected void a(ews $$0) {
      super.a($$0);
      if (!this.dQ().B) {
         this.y();
         this.aq();
      }
   }

   @Override
   protected void a(ewu $$0) {
      super.a($$0);
      if (!this.dQ().B) {
         this.aq();
      }
   }

   @Override
   protected boolean t() {
      return false;
   }

   @Override
   public cuo p() {
      return cuo.l;
   }

   @Override
   protected float w() {
      return 1.0F;
   }

   @Override
   protected float x() {
      return this.w();
   }

   @Nullable
   @Override
   protected lk v() {
      return null;
   }

   @Override
   public void l() {
      if (!this.dQ().B && this.dw() > this.dQ().am() + 30) {
         this.y();
         this.aq();
      } else {
         super.l();
      }
   }
}
