import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class cnp extends cmo implements cmw {
   public static final dbw g = new dcu(true, false, Optional.empty(), lq.e.b(avu.cy).map(Function.identity()));

   public cnp(bsj<? extends cnp> $$0, dcd $$1) {
      super($$0, $$1);
   }

   public cnp(bsj<? extends cnp> $$0, dcd $$1, bsd $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
   }

   cnp(bsj<? extends cnp> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dcd $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected evu as() {
      float $$0 = this.ak().n().a() / 2.0F;
      float $$1 = this.ak().n().b();
      float $$2 = 0.15F;
      return new evu(
         this.dn().c - (double)$$0,
         this.dn().d - 0.15F,
         this.dn().e - (double)$$0,
         this.dn().c + (double)$$0,
         this.dn().d - 0.15F + (double)$$1,
         this.dn().e + (double)$$0
      );
   }

   @Override
   public boolean i(bsd $$0) {
      return $$0 instanceof cnp ? false : super.i($$0);
   }

   @Override
   protected boolean b(bsd $$0) {
      if ($$0 instanceof cnp) {
         return false;
      } else {
         return $$0.ak() == bsj.E ? false : super.b($$0);
      }
   }

   @Override
   protected void a(evw $$0) {
      super.a($$0);
      if (!this.dP().B) {
         bsy $$2 = this.s() instanceof bsy $$1 ? $$1 : null;
         bsd $$3 = $$0.a().g($$0.e()).orElse($$0.a());
         if ($$2 != null) {
            $$2.A($$3);
         }

         $$3.a(this.dQ().c(this, $$2), 1.0F);
         this.y();
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
   }

   protected abstract void y();

   @Override
   protected void a(evv $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.y();
         this.ao();
      }
   }

   @Override
   protected void a(evx $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.ao();
      }
   }

   @Override
   protected boolean u() {
      return false;
   }

   @Override
   public cua p() {
      return cua.l;
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
      if (!this.dP().B && this.dv() > this.dP().am() + 30) {
         this.y();
         this.ao();
      } else {
         super.l();
      }
   }
}
