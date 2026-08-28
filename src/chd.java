import java.util.EnumSet;
import javax.annotation.Nullable;

public class chd extends cgy {
   private int cb = 47999;

   public chd(bsm<? extends chd> $$0, dcf $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gx() {
      return true;
   }

   @Nullable
   @Override
   protected cgy gC() {
      return bsm.be.a(this.dQ());
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.cb);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.cb = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(1, new cas(this, 2.0));
      this.bV.a(1, new chd.a(this));
   }

   @Override
   public void w(int $$0) {
      this.cb = $$0;
   }

   @Override
   protected void f(cmk $$0) {
      bsg $$1 = this.gc();
      if (!($$1 instanceof cmd)) {
         super.f($$0);
      }
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dQ().B) {
         this.hd();
      }
   }

   private void hd() {
      if (this.he()) {
         this.cb = this.hf() ? ((cmd)this.gc()).gx() - 1 : this.cb - 1;
         if (this.cb <= 0) {
            this.a(true, false);
            this.ap();
         }
      }
   }

   private boolean he() {
      return !this.gD() && !this.hg() && !this.cZ();
   }

   private boolean hf() {
      return this.gc() instanceof cmd;
   }

   private boolean hg() {
      return this.ga() && !this.hf();
   }

   @Nullable
   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      if ($$2 == btf.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bsa.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends cbz {
      private final cgy a;
      private btb b;
      private int c;

      public a(cgy $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(bzz.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.ga()) {
            return false;
         } else if (!(this.a.gc() instanceof cmd $$1)) {
            return false;
         } else {
            this.b = $$1.ej();
            int $$2 = $$1.ek();
            return $$2 != this.c && this.a(this.b, cds.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         bsg $$0 = this.a.gc();
         if ($$0 instanceof cmd) {
            this.c = ((cmd)$$0).ek();
         }

         super.c();
      }
   }
}
