import java.util.EnumSet;
import javax.annotation.Nullable;

public class byy extends byt {
   private int bU = 47999;

   public byy(bku<? extends byy> $$0, csa $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean go() {
      return true;
   }

   @Nullable
   @Override
   protected byt gt() {
      return bku.ba.a(this.dN());
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
   protected void B() {
      super.B();
      this.bO.a(1, new bsu(this, 2.0));
      this.bP.a(1, new byy.a(this));
   }

   @Override
   public void w(int $$0) {
      this.bU = $$0;
   }

   @Override
   protected void f(cdu $$0) {
      bkq $$1 = this.fU();
      if (!($$1 instanceof cdn)) {
         super.f($$0);
      }
   }

   @Override
   public void c_() {
      super.c_();
      if (!this.dN().B) {
         this.gV();
      }
   }

   private void gV() {
      if (this.gW()) {
         this.bU = this.gX() ? ((cdn)this.fU()).go() - 1 : this.bU - 1;
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
      return this.fU() instanceof cdn;
   }

   private boolean gY() {
      return this.fT() && !this.gX();
   }

   @Nullable
   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      if ($$2 == blk.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bkl.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   protected static class a extends bub {
      private final byt a;
      private blg b;
      private int c;

      public a(byt $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(bsb.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.fT()) {
            return false;
         } else if (!(this.a.fU() instanceof cdn $$1)) {
            return false;
         } else {
            this.b = $$1.ei();
            int $$2 = $$1.ej();
            return $$2 != this.c && this.a(this.b, bvs.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         bkq $$0 = this.a.fU();
         if ($$0 instanceof cdn) {
            this.c = ((cdn)$$0).ej();
         }

         super.c();
      }
   }
}
