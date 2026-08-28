import java.util.EnumSet;
import javax.annotation.Nullable;

public class cka extends cjv {
   private int bZ = 47999;

   public cka(bvi<? extends cka> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gr() {
      return true;
   }

   @Nullable
   @Override
   protected cjv gC() {
      return bvi.by.a(this.dW(), bvh.e);
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bZ);
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bZ = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(1, new cdo(this, 2.0));
      this.bU.a(1, new cka.a(this));
      this.bU.a(2, new ceo<>(this, cnh.class, true, ($$0, $$1) -> $$0.aq() != bvi.bR));
      this.bU.a(2, new ceo<>(this, clv.class, true));
   }

   @Override
   public void w(int $$0) {
      this.bZ = $$0;
   }

   @Override
   protected void a(cpo $$0) {
      bvb $$1 = this.A();
      if (!($$1 instanceof cpg)) {
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
         this.bZ = this.hf() ? ((cpg)this.A()).gx() - 1 : this.bZ - 1;
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
      return this.A() instanceof cpg;
   }

   private boolean hg() {
      return this.P_() && !this.hf();
   }

   @Nullable
   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      if ($$2 == bvh.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bus.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends cev {
      private final cjv a;
      private bvx b;
      private int c;

      public a(cjv $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(ccv.a.d));
      }

      @Override
      public boolean b() {
         if (!this.a.P_()) {
            return false;
         } else if (!(this.a.A() instanceof cpg $$1)) {
            return false;
         } else {
            this.b = $$1.eq();
            int $$2 = $$1.er();
            return $$2 != this.c && this.a(this.b, cgo.a);
         }
      }

      @Override
      public void d() {
         this.e.h(this.b);
         bvb $$0 = this.a.A();
         if ($$0 instanceof cpg) {
            this.c = ((cpg)$$0).er();
         }

         super.d();
      }
   }
}
