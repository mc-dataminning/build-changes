import java.util.EnumSet;
import javax.annotation.Nullable;

public class byb extends bxw {
   private int bU = 47999;

   public byb(bjx<? extends byb> $$0, cqz $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gn() {
      return true;
   }

   @Nullable
   @Override
   protected bxw gs() {
      return bjx.ba.a(this.dL());
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bU);
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bU = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(1, new brx(this, 2.0));
      this.bP.a(1, new byb.a(this));
   }

   @Override
   public void w(int $$0) {
      this.bU = $$0;
   }

   @Override
   protected void f(ccx $$0) {
      bjt $$1 = this.fT();
      if (!($$1 instanceof ccq)) {
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
         this.bU = this.gW() ? ((ccq)this.fT()).gn() - 1 : this.bU - 1;
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
      return this.fT() instanceof ccq;
   }

   private boolean gX() {
      return this.fS() && !this.gW();
   }

   @Nullable
   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      if ($$2 == bkn.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bjo.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   protected static class a extends bte {
      private final bxw a;
      private bkj b;
      private int c;

      public a(bxw $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(bre.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.fS()) {
            return false;
         } else if (!(this.a.fT() instanceof ccq $$1)) {
            return false;
         } else {
            this.b = $$1.eg();
            int $$2 = $$1.eh();
            return $$2 != this.c && this.a(this.b, buv.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         bjt $$0 = this.a.fT();
         if ($$0 instanceof ccq) {
            this.c = ((ccq)$$0).eh();
         }

         super.c();
      }
   }
}
