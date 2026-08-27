import java.util.Optional;
import javax.annotation.Nullable;

public abstract class clb extends cka implements cki {
   public clb(bqb<? extends clb> $$0, cyx $$1) {
      super($$0, $$1);
   }

   public clb(bqb<? extends clb> $$0, cyx $$1, bpv $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
   }

   clb(bqb<? extends clb> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, cyx $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected erv aq() {
      float $$0 = this.ai().n().a() / 2.0F;
      float $$1 = this.ai().n().b();
      float $$2 = 0.15F;
      return new erv(
         this.dk().c - (double)$$0,
         this.dk().d - 0.15F,
         this.dk().e - (double)$$0,
         this.dk().c + (double)$$0,
         this.dk().d - 0.15F + (double)$$1,
         this.dk().e + (double)$$0
      );
   }

   @Override
   public boolean i(bpv $$0) {
      return $$0 instanceof clb ? false : super.i($$0);
   }

   @Override
   protected boolean b(bpv $$0) {
      return $$0 instanceof clb ? false : super.b($$0);
   }

   @Override
   protected void a(erx $$0) {
      super.a($$0);
      if (!this.dM().B) {
         $$0.a().a(this.dN().c(this, this.u() instanceof bqo $$1 ? $$1 : null), 1.0F);
         this.y();
      }
   }

   protected abstract void y();

   @Override
   protected void a(erw $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.y();
         this.am();
      }
   }

   @Override
   protected void a(ery $$0) {
      cyx $$1 = this.dM();
      if ($$0.c() == ery.a.b) {
         ib $$2 = ((erw)$$0).a();
         doz $$3 = $$1.a_($$2);
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
   public crj p() {
      return crj.i;
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
   protected kj v() {
      return null;
   }

   @Override
   protected cyg.a af_() {
      return cyg.a.b;
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

   public static class a extends cyq {
      @Override
      public boolean a(cyp $$0, bpv $$1) {
         return false;
      }

      @Override
      public Optional<Float> a(cyp $$0, cyd $$1, ib $$2, doz $$3, eks $$4) {
         return $$3.a(avc.cs) ? Optional.of(3600000.0F) : Optional.empty();
      }
   }
}
