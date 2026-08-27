import java.util.EnumSet;
import javax.annotation.Nullable;

public class byq extends byl {
   private int bU = 47999;

   public byq(bkm<? extends byq> $$0, crs $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gn() {
      return true;
   }

   @Nullable
   @Override
   protected byl gs() {
      return bkm.ba.a(this.dL());
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bU);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bU = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(1, new bsm(this, 2.0));
      this.bP.a(1, new byq.a(this));
   }

   @Override
   public void w(int $$0) {
      this.bU = $$0;
   }

   @Override
   protected void f(cdm $$0) {
      bki $$1 = this.fT();
      if (!($$1 instanceof cdf)) {
         super.f($$0);
      }
   }

   @Override
   public void c_() {
      super.c_();
      if (!this.dL().B) {
         this.gU();
      }
   }

   private void gU() {
      if (this.gV()) {
         this.bU = this.gW() ? ((cdf)this.fT()).gn() - 1 : this.bU - 1;
         if (this.bU <= 0) {
            this.a(true, false);
            this.ak();
         }
      }
   }

   private boolean gV() {
      return !this.gt() && !this.gX() && !this.cU();
   }

   private boolean gW() {
      return this.fT() instanceof cdf;
   }

   private boolean gX() {
      return this.fS() && !this.gW();
   }

   @Nullable
   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      if ($$2 == blc.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bkd.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   protected static class a extends btt {
      private final byl a;
      private bky b;
      private int c;

      public a(byl $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(brt.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.fS()) {
            return false;
         } else if (!(this.a.fT() instanceof cdf $$1)) {
            return false;
         } else {
            this.b = $$1.eg();
            int $$2 = $$1.eh();
            return $$2 != this.c && this.a(this.b, bvk.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         bki $$0 = this.a.fT();
         if ($$0 instanceof cdf) {
            this.c = ((cdf)$$0).eh();
         }

         super.c();
      }
   }
}
