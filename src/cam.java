import java.util.EnumSet;
import javax.annotation.Nullable;

public class cam extends cah {
   private int bV = 47999;

   public cam(bmc<? extends cam> $$0, ctx $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean go() {
      return true;
   }

   @Nullable
   @Override
   protected cah gt() {
      return bmc.bc.a(this.dL());
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bV);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bV = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bP.a(1, new bud(this, 2.0));
      this.bQ.a(1, new cam.a(this));
   }

   @Override
   public void w(int $$0) {
      this.bV = $$0;
   }

   @Override
   protected void f(cfq $$0) {
      blw $$1 = this.fU();
      if (!($$1 instanceof cfj)) {
         super.f($$0);
      }
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dL().B) {
         this.gW();
      }
   }

   private void gW() {
      if (this.gX()) {
         this.bV = this.gY() ? ((cfj)this.fU()).go() - 1 : this.bV - 1;
         if (this.bV <= 0) {
            this.a(true, false);
            this.am();
         }
      }
   }

   private boolean gX() {
      return !this.gu() && !this.gZ() && !this.cV();
   }

   private boolean gY() {
      return this.fU() instanceof cfj;
   }

   private boolean gZ() {
      return this.fT() && !this.gY();
   }

   @Nullable
   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      if ($$2 == bms.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new blr.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   protected static class a extends bvk {
      private final cah a;
      private bmo b;
      private int c;

      public a(cah $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(btk.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.fT()) {
            return false;
         } else if (!(this.a.fU() instanceof cfj $$1)) {
            return false;
         } else {
            this.b = $$1.eh();
            int $$2 = $$1.ei();
            return $$2 != this.c && this.a(this.b, bxd.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         blw $$0 = this.a.fU();
         if ($$0 instanceof cfj) {
            this.c = ((cfj)$$0).ei();
         }

         super.c();
      }
   }
}
