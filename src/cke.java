import java.util.EnumSet;
import javax.annotation.Nullable;

public class cke extends cjz {
   private int bF = 47999;

   public cke(bvi<? extends cke> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gv() {
      return true;
   }

   @Nullable
   @Override
   protected cjz gG() {
      return bvi.bx.a(this.dU(), bvh.e);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bF);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bF = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(1, new cdp(this, 2.0));
      this.bD.a(1, new cke.a(this));
      this.bD.a(2, new cep<>(this, cnl.class, true, ($$0, $$1) -> $$0.aq() != bvi.bQ));
      this.bD.a(2, new cep<>(this, clz.class, true));
   }

   @Override
   public void w(int $$0) {
      this.bF = $$0;
   }

   @Override
   protected void a(cpr $$0) {
      bva $$1 = this.C();
      if (!($$1 instanceof cpj)) {
         super.a($$0);
      }
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dU().C) {
         this.hh();
      }
   }

   private void hh() {
      if (this.hi()) {
         this.bF = this.hj() ? ((cpj)this.C()).gA() - 1 : this.bF - 1;
         if (this.bF <= 0) {
            this.z();
            this.at();
         }
      }
   }

   private boolean hi() {
      return !this.gJ() && !this.hk() && !this.dd();
   }

   private boolean hj() {
      return this.C() instanceof cpj;
   }

   private boolean hk() {
      return this.O_() && !this.hj();
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      if ($$2 == bvh.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new buq.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends cew {
      private final cjz a;
      private bvy b;
      private int c;

      public a(cjz $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(ccw.a.d));
      }

      @Override
      public boolean b() {
         if (!this.a.O_()) {
            return false;
         } else if (!(this.a.C() instanceof cpj $$1)) {
            return false;
         } else {
            this.b = $$1.ep();
            int $$2 = $$1.er();
            return $$2 != this.c && this.a(this.b, cgp.a);
         }
      }

      @Override
      public void d() {
         this.e.h(this.b);
         bva $$0 = this.a.C();
         if ($$0 instanceof cpj) {
            this.c = ((cpj)$$0).er();
         }

         super.d();
      }
   }
}
