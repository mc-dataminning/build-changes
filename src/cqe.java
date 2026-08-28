import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class cqe extends cpd implements cpl {
   public static final dfz d = new dgz(true, false, Optional.empty(), mb.e.a(awo.cB).map(Function.identity()));
   public static final double e = 0.25;

   public cqe(buq<? extends cqe> $$0, dgg $$1) {
      super($$0, $$1);
      this.c = 0.0;
   }

   public cqe(buq<? extends cqe> $$0, dgg $$1, buj $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
      this.c = 0.0;
   }

   cqe(buq<? extends cqe> $$0, double $$1, double $$2, double $$3, fay $$4, dgg $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.c = 0.0;
   }

   @Override
   protected fat ax() {
      float $$0 = this.aq().n().a() / 2.0F;
      float $$1 = this.aq().n().b();
      float $$2 = 0.15F;
      return new fat(
         this.du().d - (double)$$0,
         this.du().e - 0.15F,
         this.du().f - (double)$$0,
         this.du().d + (double)$$0,
         this.du().e - 0.15F + (double)$$1,
         this.du().f + (double)$$0
      );
   }

   @Override
   public boolean i(buj $$0) {
      return $$0 instanceof cqe ? false : super.i($$0);
   }

   @Override
   protected boolean b(buj $$0) {
      if ($$0 instanceof cqe) {
         return false;
      } else {
         return $$0.aq() == buq.R ? false : super.b($$0);
      }
   }

   @Override
   protected void a(fav $$0) {
      super.a($$0);
      if (this.dW() instanceof arc $$1) {
         bvf $$4 = this.p() instanceof bvf $$3 ? $$3 : null;
         buj $$5 = $$0.a();
         if ($$4 != null) {
            $$4.B($$5);
         }

         bsz $$6 = this.dX().c(this, $$4);
         if ($$5.a($$1, $$6, 1.0F) && $$5 instanceof bvf $$7) {
            dcz.a($$1, (buj)$$7, $$6);
         }

         this.a(this.du());
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
   }

   protected abstract void a(fay var1);

   @Override
   protected void a(fau $$0) {
      super.a($$0);
      if (!this.dW().C) {
         km $$1 = $$0.c().q();
         fay $$2 = fay.a($$1).d(0.25, 0.25, 0.25);
         fay $$3 = $$0.g().e($$2);
         this.a($$3);
         this.at();
      }
   }

   @Override
   protected void a(faw $$0) {
      super.a($$0);
      if (!this.dW().C) {
         this.at();
      }
   }

   @Override
   protected boolean m() {
      return false;
   }

   @Override
   public cwn l() {
      return cwn.j;
   }

   @Override
   protected float t() {
      return 1.0F;
   }

   @Override
   protected float u() {
      return this.t();
   }

   @Nullable
   @Override
   protected lr s() {
      return null;
   }

   @Override
   public void h() {
      if (!this.dW().C && this.dC() > this.dW().an() + 30) {
         this.a(this.du());
         this.at();
      } else {
         super.h();
      }
   }
}
