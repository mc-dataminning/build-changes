import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class cof extends cne implements cnm {
   public static final dcp e = new ddn(true, false, Optional.empty(), lt.e.b(awe.cz).map(Function.identity()));
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

   cof(bsx<? extends cof> $$0, double $$1, double $$2, double $$3, exc $$4, dcw $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.d = 0.0;
   }

   @Override
   protected ewx au() {
      float $$0 = this.am().n().a() / 2.0F;
      float $$1 = this.am().n().b();
      float $$2 = 0.15F;
      return new ewx(
         this.dm().c - (double)$$0,
         this.dm().d - 0.15F,
         this.dm().e - (double)$$0,
         this.dm().c + (double)$$0,
         this.dm().d - 0.15F + (double)$$1,
         this.dm().e + (double)$$0
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
   protected void a(ewz $$0) {
      super.a($$0);
      if (!this.dO().B) {
         btn $$2 = this.s() instanceof btn $$1 ? $$1 : null;
         bsr $$3 = $$0.a();
         if ($$2 != null) {
            $$2.A($$3);
         }

         brk $$4 = this.dP().c(this, $$2);
         if ($$3.a($$4, 1.0F) && $$3 instanceof btn $$5) {
            dae.a((aqu)this.dO(), (bsr)$$5, $$4);
         }

         this.a(this.dm());
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
   }

   protected abstract void a(exc var1);

   @Override
   protected void a(ewy $$0) {
      super.a($$0);
      if (!this.dO().B) {
         kh $$1 = $$0.b().q();
         exc $$2 = exc.a($$1).d(0.25, 0.25, 0.25);
         exc $$3 = $$0.e().e($$2);
         this.a($$3);
         this.aq();
      }
   }

   @Override
   protected void a(exa $$0) {
      super.a($$0);
      if (!this.dO().B) {
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
      if (!this.dO().B && this.du() > this.dO().am() + 30) {
         this.a(this.dm());
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
