import java.util.EnumSet;
import javax.annotation.Nullable;

public class cff extends cfa {
   private int bZ = 47999;

   public cff(bqr<? extends cff> $$0, czu $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gy() {
      return true;
   }

   @Nullable
   @Override
   protected cfa gD() {
      return bqr.bd.a(this.dN());
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bZ);
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bZ = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(1, new byu(this, 2.0));
      this.bT.a(1, new cff.a(this));
   }

   @Override
   public void x(int $$0) {
      this.bZ = $$0;
   }

   @Override
   protected void f(ckl $$0) {
      bql $$1 = this.ge();
      if (!($$1 instanceof cke)) {
         super.f($$0);
      }
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dN().B) {
         this.he();
      }
   }

   private void he() {
      if (this.hf()) {
         this.bZ = this.hg() ? ((cke)this.ge()).gy() - 1 : this.bZ - 1;
         if (this.bZ <= 0) {
            this.a(true, false);
            this.am();
         }
      }
   }

   private boolean hf() {
      return !this.gE() && !this.hh() && !this.cW();
   }

   private boolean hg() {
      return this.ge() instanceof cke;
   }

   private boolean hh() {
      return this.gc() && !this.hg();
   }

   @Nullable
   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      if ($$2 == bri.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bqf.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends cab {
      private final cfa a;
      private bre b;
      private int c;

      public a(cfa $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(byb.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.gc()) {
            return false;
         } else if (!(this.a.ge() instanceof cke $$1)) {
            return false;
         } else {
            this.b = $$1.ek();
            int $$2 = $$1.el();
            return $$2 != this.c && this.a(this.b, cbu.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         bql $$0 = this.a.ge();
         if ($$0 instanceof cke) {
            this.c = ((cke)$$0).el();
         }

         super.c();
      }
   }
}
