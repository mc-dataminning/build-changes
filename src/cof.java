import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class cof extends cne implements cnm {
   public static final dcp e = new ddn(true, false, Optional.empty(), lt.e.b(awe.cy).map(Function.identity()));
   public static final double f = 0.25;

   public cof(bsx<? extends cof> $$0, dcw $$1) {
      super($$0, $$1);
      this.d = 0.0;
   }

   public cof(bsx<? extends cof> $$0, dcw $$1, bsr $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
      this.d = 0.0;
   }

   cof(bsx<? extends cof> $$0, double $$1, double $$2, double $$3, exa $$4, dcw $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.d = 0.0;
   }

   @Override
   protected ewv au() {
      float $$0 = this.am().n().a() / 2.0F;
      float $$1 = this.am().n().b();
      float $$2 = 0.15F;
      return new ewv(
         this.dn().c - (double)$$0,
         this.dn().d - 0.15F,
         this.dn().e - (double)$$0,
         this.dn().c + (double)$$0,
         this.dn().d - 0.15F + (double)$$1,
         this.dn().e + (double)$$0
      );
   }

   @Override
   public boolean i(bsr $$0) {
      return $$0 instanceof cof ? false : super.i($$0);
   }

   @Override
   protected boolean b(bsr $$0) {
      if ($$0 instanceof cof) {
         return false;
      } else {
         return $$0.am() == bsx.E ? false : super.b($$0);
      }
   }

   @Override
   protected void a(ewx $$0) {
      super.a($$0);
      if (!this.dP().B) {
         btn $$2 = this.s() instanceof btn $$1 ? $$1 : null;
         bsr $$3 = $$0.a();
         if ($$2 != null) {
            $$2.A($$3);
         }

         brk $$4 = this.dQ().c(this, $$2);
         if ($$3.a($$4, 1.0F) && $$3 instanceof btn $$5) {
            dae.a((aqu)this.dP(), (bsr)$$5, $$4);
         }

         this.a(this.dn());
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
   }

   protected abstract void a(exa var1);

   @Override
   protected void a(eww $$0) {
      super.a($$0);
      if (!this.dP().B) {
         kh $$1 = $$0.b().q();
         exa $$2 = exa.a($$1).d(0.25, 0.25, 0.25);
         exa $$3 = $$0.e().e($$2);
         this.a($$3);
         this.aq();
      }
   }

   @Override
   protected void a(ewy $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.aq();
      }
   }

   @Override
   protected boolean t() {
      return false;
   }

   @Override
   public cuq p() {
      return cuq.l;
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
      if (!this.dP().B && this.dv() > this.dP().am() + 30) {
         this.a(this.dn());
         this.aq();
      } else {
         super.l();
      }
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      return false;
   }
}
