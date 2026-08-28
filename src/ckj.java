import java.util.EnumSet;
import javax.annotation.Nullable;

public class ckj extends cke {
   private int bZ = 47999;

   public ckj(bvr<? extends ckj> $$0, dhi $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gr() {
      return true;
   }

   @Nullable
   @Override
   protected cke gC() {
      return bvr.by.a(this.dW(), bvq.e);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bZ);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bZ = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(1, new cdx(this, 2.0));
      this.bU.a(1, new ckj.a(this));
      this.bU.a(2, new cex<>(this, cnq.class, true, ($$0, $$1) -> $$0.aq() != bvr.bR));
      this.bU.a(2, new cex<>(this, cme.class, true));
   }

   @Override
   public void w(int $$0) {
      this.bZ = $$0;
   }

   @Override
   protected void a(cpx $$0) {
      bvk $$1 = this.A();
      if (!($$1 instanceof cpp)) {
         super.a($$0);
      }
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dW().C) {
         this.hd();
      }
   }

   private void hd() {
      if (this.he()) {
         this.bZ = this.hf() ? ((cpp)this.A()).gx() - 1 : this.bZ - 1;
         if (this.bZ <= 0) {
            this.a(true, false);
            this.at();
         }
      }
   }

   private boolean he() {
      return !this.gF() && !this.hg() && !this.df();
   }

   private boolean hf() {
      return this.A() instanceof cpp;
   }

   private boolean hg() {
      return this.P_() && !this.hf();
   }

   @Nullable
   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      if ($$2 == bvq.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bvb.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends cfe {
      private final cke a;
      private bwg b;
      private int c;

      public a(cke $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(cde.a.d));
      }

      @Override
      public boolean b() {
         if (!this.a.P_()) {
            return false;
         } else if (!(this.a.A() instanceof cpp $$1)) {
            return false;
         } else {
            this.b = $$1.eq();
            int $$2 = $$1.er();
            return $$2 != this.c && this.a(this.b, cgx.a);
         }
      }

      @Override
      public void d() {
         this.e.h(this.b);
         bvk $$0 = this.a.A();
         if ($$0 instanceof cpp) {
            this.c = ((cpp)$$0).er();
         }

         super.d();
      }
   }
}
