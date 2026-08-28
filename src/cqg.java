import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class cqg extends cpf implements cpn {
   public static final dgb d = new dhb(true, false, Optional.empty(), mb.e.a(awp.cB).map(Function.identity()));
   public static final double e = 0.25;

   public cqg(bur<? extends cqg> $$0, dgi $$1) {
      super($$0, $$1);
      this.c = 0.0;
   }

   public cqg(bur<? extends cqg> $$0, dgi $$1, buk $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
      this.c = 0.0;
   }

   cqg(bur<? extends cqg> $$0, double $$1, double $$2, double $$3, fba $$4, dgi $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.c = 0.0;
   }

   @Override
   protected fav ax() {
      float $$0 = this.aq().n().a() / 2.0F;
      float $$1 = this.aq().n().b();
      float $$2 = 0.15F;
      return new fav(
         this.du().d - (double)$$0,
         this.du().e - 0.15F,
         this.du().f - (double)$$0,
         this.du().d + (double)$$0,
         this.du().e - 0.15F + (double)$$1,
         this.du().f + (double)$$0
      );
   }

   @Override
   public boolean i(buk $$0) {
      return $$0 instanceof cqg ? false : super.i($$0);
   }

   @Override
   protected boolean b(buk $$0) {
      if ($$0 instanceof cqg) {
         return false;
      } else {
         return $$0.aq() == bur.S ? false : super.b($$0);
      }
   }

   @Override
   protected void a(fax $$0) {
      super.a($$0);
      if (this.dW() instanceof arc $$1) {
         bvg $$4 = this.p() instanceof bvg $$3 ? $$3 : null;
         buk $$5 = $$0.a();
         if ($$4 != null) {
            $$4.B($$5);
         }

         bta $$6 = this.dX().c(this, $$4);
         if ($$5.a($$1, $$6, 1.0F) && $$5 instanceof bvg $$7) {
            ddb.a($$1, (buk)$$7, $$6);
         }

         this.a(this.du());
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
   }

   protected abstract void a(fba var1);

   @Override
   protected void a(faw $$0) {
      super.a($$0);
      if (!this.dW().C) {
         km $$1 = $$0.c().q();
         fba $$2 = fba.a($$1).d(0.25, 0.25, 0.25);
         fba $$3 = $$0.g().e($$2);
         this.a($$3);
         this.at();
      }
   }

   @Override
   protected void a(fay $$0) {
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
   public cwp l() {
      return cwp.j;
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
