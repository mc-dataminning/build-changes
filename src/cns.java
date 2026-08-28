import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class cns extends cmr implements cmz {
   public static final dby e = new dcw(true, false, Optional.empty(), lq.e.b(avw.cy).map(Function.identity()));

   public cns(bsm<? extends cns> $$0, dcf $$1) {
      super($$0, $$1);
      this.d = 0.0;
   }

   public cns(bsm<? extends cns> $$0, dcf $$1, bsg $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
      this.d = 0.0;
   }

   cns(bsm<? extends cns> $$0, double $$1, double $$2, double $$3, ewf $$4, dcf $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.d = 0.0;
   }

   @Override
   protected ewa at() {
      float $$0 = this.al().n().a() / 2.0F;
      float $$1 = this.al().n().b();
      float $$2 = 0.15F;
      return new ewa(
         this.do().c - (double)$$0,
         this.do().d - 0.15F,
         this.do().e - (double)$$0,
         this.do().c + (double)$$0,
         this.do().d - 0.15F + (double)$$1,
         this.do().e + (double)$$0
      );
   }

   @Override
   public boolean i(bsg $$0) {
      return $$0 instanceof cns ? false : super.i($$0);
   }

   @Override
   protected boolean b(bsg $$0) {
      if ($$0 instanceof cns) {
         return false;
      } else {
         return $$0.al() == bsm.E ? false : super.b($$0);
      }
   }

   @Override
   protected void a(ewc $$0) {
      super.a($$0);
      if (!this.dQ().B) {
         btb $$2 = this.s() instanceof btb $$1 ? $$1 : null;
         bsg $$3 = $$0.a().h($$0.e()).orElse($$0.a());
         if ($$2 != null) {
            $$2.A($$3);
         }

         $$3.a(this.dR().c(this, $$2), 1.0F);
         this.y();
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
   }

   protected abstract void y();

   @Override
   protected void a(ewb $$0) {
      super.a($$0);
      if (!this.dQ().B) {
         this.y();
         this.ap();
      }
   }

   @Override
   protected void a(ewd $$0) {
      super.a($$0);
      if (!this.dQ().B) {
         this.ap();
      }
   }

   @Override
   protected boolean u() {
      return false;
   }

   @Override
   public cuc p() {
      return cuc.l;
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
   protected lh v() {
      return null;
   }

   @Override
   public void l() {
      if (!this.dQ().B && this.dw() > this.dQ().am() + 30) {
         this.y();
         this.ap();
      } else {
         super.l();
      }
   }
}
