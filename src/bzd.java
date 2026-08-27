import java.util.EnumSet;
import javax.annotation.Nullable;

public class bzd extends byy {
   private int bU = 47999;

   public bzd(bkz<? extends bzd> $$0, csf $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean go() {
      return true;
   }

   @Nullable
   @Override
   protected byy gt() {
      return bkz.ba.a(this.dN());
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bU);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bU = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(1, new bsz(this, 2.0));
      this.bP.a(1, new bzd.a(this));
   }

   @Override
   public void w(int $$0) {
      this.bU = $$0;
   }

   @Override
   protected void f(cdz $$0) {
      bkv $$1 = this.fU();
      if (!($$1 instanceof cds)) {
         super.f($$0);
      }
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dN().B) {
         this.gV();
      }
   }

   private void gV() {
      if (this.gW()) {
         this.bU = this.gX() ? ((cds)this.fU()).go() - 1 : this.bU - 1;
         if (this.bU <= 0) {
            this.a(true, false);
            this.am();
         }
      }
   }

   private boolean gW() {
      return !this.gu() && !this.gY() && !this.cW();
   }

   private boolean gX() {
      return this.fU() instanceof cds;
   }

   private boolean gY() {
      return this.fT() && !this.gX();
   }

   @Nullable
   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      if ($$2 == blp.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bkq.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   protected static class a extends bug {
      private final byy a;
      private bll b;
      private int c;

      public a(byy $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(bsg.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.fT()) {
            return false;
         } else if (!(this.a.fU() instanceof cds $$1)) {
            return false;
         } else {
            this.b = $$1.ei();
            int $$2 = $$1.ej();
            return $$2 != this.c && this.a(this.b, bvx.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         bkv $$0 = this.a.fU();
         if ($$0 instanceof cds) {
            this.c = ((cds)$$0).ej();
         }

         super.c();
      }
   }
}
