import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class cqf extends cpe implements cpm {
   public static final dga d = new dha(true, false, Optional.empty(), mb.e.a(awp.cB).map(Function.identity()));
   public static final double e = 0.25;

   public cqf(bur<? extends cqf> $$0, dgh $$1) {
      super($$0, $$1);
      this.c = 0.0;
   }

   public cqf(bur<? extends cqf> $$0, dgh $$1, buk $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
      this.c = 0.0;
   }

   cqf(bur<? extends cqf> $$0, double $$1, double $$2, double $$3, faz $$4, dgh $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.c = 0.0;
   }

   @Override
   protected fau c(faz $$0) {
      float $$1 = this.aq().n().a() / 2.0F;
      float $$2 = this.aq().n().b();
      float $$3 = 0.15F;
      return new fau($$0.d - (double)$$1, $$0.e - 0.15F, $$0.f - (double)$$1, $$0.d + (double)$$1, $$0.e - 0.15F + (double)$$2, $$0.f + (double)$$1);
   }

   @Override
   public boolean i(buk $$0) {
      return $$0 instanceof cqf ? false : super.i($$0);
   }

   @Override
   protected boolean b(buk $$0) {
      if ($$0 instanceof cqf) {
         return false;
      } else {
         return $$0.aq() == bur.R ? false : super.b($$0);
      }
   }

   @Override
   protected void a(faw $$0) {
      super.a($$0);
      if (this.dV() instanceof ard $$1) {
         bvg $$4 = this.p() instanceof bvg $$3 ? $$3 : null;
         buk $$5 = $$0.a();
         if ($$4 != null) {
            $$4.B($$5);
         }

         bta $$6 = this.dW().c(this, $$4);
         if ($$5.a($$1, $$6, 1.0F) && $$5 instanceof bvg $$7) {
            dda.a($$1, (buk)$$7, $$6);
         }

         this.a(this.dt());
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
   }

   protected abstract void a(faz var1);

   @Override
   protected void a(fav $$0) {
      super.a($$0);
      if (!this.dV().C) {
         km $$1 = $$0.c().q();
         faz $$2 = faz.a($$1).d(0.25, 0.25, 0.25);
         faz $$3 = $$0.g().e($$2);
         this.a($$3);
         this.at();
      }
   }

   @Override
   protected void a(fax $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.at();
      }
   }

   @Override
   protected boolean m() {
      return false;
   }

   @Override
   public cwo l() {
      return cwo.j;
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
      if (!this.dV().C && this.dB() > this.dV().an() + 30) {
         this.a(this.dt());
         this.at();
      } else {
         super.h();
      }
   }
}
