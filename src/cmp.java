import java.util.Optional;
import javax.annotation.Nullable;

public abstract class cmp extends clo implements clw {
   public cmp(brn<? extends cmp> $$0, dad $$1) {
      super($$0, $$1);
   }

   public cmp(brn<? extends cmp> $$0, dad $$1, brh $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
   }

   cmp(brn<? extends cmp> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dad $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etk aq() {
      float $$0 = this.ai().n().a() / 2.0F;
      float $$1 = this.ai().n().b();
      float $$2 = 0.15F;
      return new etk(
         this.dl().c - (double)$$0,
         this.dl().d - 0.15F,
         this.dl().e - (double)$$0,
         this.dl().c + (double)$$0,
         this.dl().d - 0.15F + (double)$$1,
         this.dl().e + (double)$$0
      );
   }

   @Override
   public boolean i(brh $$0) {
      return $$0 instanceof cmp ? false : super.i($$0);
   }

   @Override
   protected boolean b(brh $$0) {
      return $$0 instanceof cmp ? false : super.b($$0);
   }

   @Override
   protected void a(etm $$0) {
      super.a($$0);
      if (!this.dN().B) {
         $$0.a().a(this.dO().c(this, this.u() instanceof bsa $$1 ? $$1 : null), 1.0F);
         this.y();
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
   }

   protected abstract void y();

   @Override
   protected void a(etl $$0) {
      super.a($$0);
      if (!this.dN().B) {
         this.y();
         this.am();
      }
   }

   @Override
   protected void a(etn $$0) {
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
   public csz p() {
      return csz.i;
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
   protected kv v() {
      return null;
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

   public static class a extends czw {
      @Override
      public boolean a(czv $$0, brh $$1) {
         return false;
      }

      @Override
      public Optional<Float> a(czv $$0, czj $$1, in $$2, dqh $$3, ema $$4) {
         return $$3.a(avr.cy) ? Optional.of(3600000.0F) : Optional.empty();
      }
   }
}
