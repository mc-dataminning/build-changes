import java.util.EnumSet;
import javax.annotation.Nullable;

public class cgs extends cgn {
   private int bZ = 47999;

   public cgs(bsc<? extends cgs> $$0, daz $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gy() {
      return true;
   }

   @Nullable
   @Override
   protected cgn gD() {
      return bsc.be.a(this.dP());
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bZ);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bZ = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(1, new cah(this, 2.0));
      this.bT.a(1, new cgs.a(this));
   }

   @Override
   public void x(int $$0) {
      this.bZ = $$0;
   }

   @Override
   protected void f(cly $$0) {
      brw $$1 = this.ge();
      if (!($$1 instanceof clr)) {
         super.f($$0);
      }
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dP().B) {
         this.he();
      }
   }

   private void he() {
      if (this.hf()) {
         this.bZ = this.hg() ? ((clr)this.ge()).gy() - 1 : this.bZ - 1;
         if (this.bZ <= 0) {
            this.a(true, false);
            this.ao();
         }
      }
   }

   private boolean hf() {
      return !this.gE() && !this.hh() && !this.cY();
   }

   private boolean hg() {
      return this.ge() instanceof clr;
   }

   private boolean hh() {
      return this.gc() && !this.hg();
   }

   @Nullable
   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      if ($$2 == bsu.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new brq.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends cbo {
      private final cgn a;
      private bsq b;
      private int c;

      public a(cgn $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(bzo.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.gc()) {
            return false;
         } else if (!(this.a.ge() instanceof clr $$1)) {
            return false;
         } else {
            this.b = $$1.em();
            int $$2 = $$1.en();
            return $$2 != this.c && this.a(this.b, cdh.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         brw $$0 = this.a.ge();
         if ($$0 instanceof clr) {
            this.c = ((clr)$$0).en();
         }

         super.c();
      }
   }
}
