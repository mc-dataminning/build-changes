import java.util.Optional;
import javax.annotation.Nullable;

public abstract class clt extends cks implements cla {
   public clt(bqr<? extends clt> $$0, czu $$1) {
      super($$0, $$1);
   }

   public clt(bqr<? extends clt> $$0, czu $$1, bql $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
   }

   clt(bqr<? extends clt> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, czu $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eta aq() {
      float $$0 = this.ai().n().a() / 2.0F;
      float $$1 = this.ai().n().b();
      float $$2 = 0.15F;
      return new eta(
         this.dl().c - (double)$$0,
         this.dl().d - 0.15F,
         this.dl().e - (double)$$0,
         this.dl().c + (double)$$0,
         this.dl().d - 0.15F + (double)$$1,
         this.dl().e + (double)$$0
      );
   }

   @Override
   public boolean i(bql $$0) {
      return $$0 instanceof clt ? false : super.i($$0);
   }

   @Override
   protected boolean b(bql $$0) {
      return $$0 instanceof clt ? false : super.b($$0);
   }

   @Override
   protected void a(etc $$0) {
      super.a($$0);
      if (!this.dN().B) {
         $$0.a().a(this.dO().c(this, this.u() instanceof bre $$1 ? $$1 : null), 1.0F);
         this.y();
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
   }

   protected abstract void y();

   @Override
   protected void a(etb $$0) {
      super.a($$0);
      if (!this.dN().B) {
         this.y();
         this.am();
      }
   }

   @Override
   protected void a(etd $$0) {
      czu $$1 = this.dN();
      if ($$0.c() == etd.a.b) {
         im $$2 = ((etb)$$0).a();
         dpy $$3 = $$1.a_($$2);
         if (!$$3.r($$1, $$2)) {
            return;
         }
      }

      super.a($$0);
      if (!this.dN().B && !this.f) {
         this.am();
      }

      this.f = false;
   }

   @Override
   protected boolean r() {
      return false;
   }

   @Override
   public csd p() {
      return csd.i;
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
   protected ku v() {
      return null;
   }

   @Override
   protected czd.a af_() {
      return czd.a.b;
   }

   @Override
   public void l() {
      if (!this.dN().B && this.dt() > this.dN().al() + 30) {
         this.y();
         this.am();
      } else {
         super.l();
      }
   }

   public static class a extends czn {
      @Override
      public boolean a(czm $$0, bql $$1) {
         return false;
      }

      @Override
      public Optional<Float> a(czm $$0, cza $$1, im $$2, dpy $$3, elr $$4) {
         return $$3.a(avo.cs) ? Optional.of(3600000.0F) : Optional.empty();
      }
   }
}
