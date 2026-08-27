import java.util.EnumSet;
import javax.annotation.Nullable;

public class cch extends ccc {
   private int bU = 47999;

   public cch(bnw<? extends cch> $$0, cvr $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gp() {
      return true;
   }

   @Nullable
   @Override
   protected ccc gu() {
      return bnw.bc.a(this.dM());
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bU);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bU = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(1, new bvy(this, 2.0));
      this.bP.a(1, new cch.a(this));
   }

   @Override
   public void x(int $$0) {
      this.bU = $$0;
   }

   @Override
   protected void f(chl $$0) {
      bnq $$1 = this.fV();
      if (!($$1 instanceof che)) {
         super.f($$0);
      }
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dM().B) {
         this.gX();
      }
   }

   private void gX() {
      if (this.gY()) {
         this.bU = this.gZ() ? ((che)this.fV()).gp() - 1 : this.bU - 1;
         if (this.bU <= 0) {
            this.a(true, false);
            this.am();
         }
      }
   }

   private boolean gY() {
      return !this.gv() && !this.ha() && !this.cV();
   }

   private boolean gZ() {
      return this.fV() instanceof che;
   }

   private boolean ha() {
      return this.fU() && !this.gZ();
   }

   @Nullable
   @Override
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      if ($$2 == bom.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bnl.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   protected static class a extends bxf {
      private final ccc a;
      private boi b;
      private int c;

      public a(ccc $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(bvf.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.fU()) {
            return false;
         } else if (!(this.a.fV() instanceof che $$1)) {
            return false;
         } else {
            this.b = $$1.ei();
            int $$2 = $$1.ej();
            return $$2 != this.c && this.a(this.b, byy.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         bnq $$0 = this.a.fV();
         if ($$0 instanceof che) {
            this.c = ((che)$$0).ej();
         }

         super.c();
      }
   }
}
