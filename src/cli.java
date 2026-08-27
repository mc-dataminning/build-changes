import java.util.Optional;
import javax.annotation.Nullable;

public abstract class cli extends ckh implements ckp {
   public cli(bqg<? extends cli> $$0, czg $$1) {
      super($$0, $$1);
   }

   public cli(bqg<? extends cli> $$0, czg $$1, bqa $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
   }

   cli(bqg<? extends cli> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, czg $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ese aq() {
      float $$0 = this.ai().n().a() / 2.0F;
      float $$1 = this.ai().n().b();
      float $$2 = 0.15F;
      return new ese(
         this.dk().c - (double)$$0,
         this.dk().d - 0.15F,
         this.dk().e - (double)$$0,
         this.dk().c + (double)$$0,
         this.dk().d - 0.15F + (double)$$1,
         this.dk().e + (double)$$0
      );
   }

   @Override
   public boolean i(bqa $$0) {
      return $$0 instanceof cli ? false : super.i($$0);
   }

   @Override
   protected boolean b(bqa $$0) {
      return $$0 instanceof cli ? false : super.b($$0);
   }

   @Override
   protected void a(esg $$0) {
      super.a($$0);
      if (!this.dM().B) {
         $$0.a().a(this.dN().c(this, this.u() instanceof bqt $$1 ? $$1 : null), 1.0F);
         this.y();
      }
   }

   protected abstract void y();

   @Override
   protected void a(esf $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.y();
         this.am();
      }
   }

   @Override
   protected void a(esh $$0) {
      czg $$1 = this.dM();
      if ($$0.c() == esh.a.b) {
         id $$2 = ((esf)$$0).a();
         dpi $$3 = $$1.a_($$2);
         if (!$$3.r($$1, $$2)) {
            return;
         }
      }

      super.a($$0);
      if (!this.dM().B && !this.f) {
         this.am();
      }

      this.f = false;
   }

   @Override
   protected boolean r() {
      return false;
   }

   @Override
   public crs p() {
      return crs.i;
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
   protected kl v() {
      return null;
   }

   @Override
   protected cyp.a af_() {
      return cyp.a.b;
   }

   @Override
   public void l() {
      if (!this.dM().B && this.ds() > this.dM().al() + 30) {
         this.y();
         this.am();
      } else {
         super.l();
      }
   }

   public static class a extends cyz {
      @Override
      public boolean a(cyy $$0, bqa $$1) {
         return false;
      }

      @Override
      public Optional<Float> a(cyy $$0, cym $$1, id $$2, dpi $$3, elb $$4) {
         return $$3.a(ave.cs) ? Optional.of(3600000.0F) : Optional.empty();
      }
   }
}
