import java.util.EnumSet;
import javax.annotation.Nullable;

public class che extends cgz {
   private int cb = 47999;

   public che(bsn<? extends che> $$0, dcg $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gw() {
      return true;
   }

   @Nullable
   @Override
   protected cgz gB() {
      return bsn.be.a(this.dR());
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
      this.bU.a(1, new cat(this, 2.0));
      this.bV.a(1, new che.a(this));
   }

   @Override
   public void w(int $$0) {
      this.cb = $$0;
   }

   @Override
   protected void f(cml $$0) {
      bsh $$1 = this.gb();
      if (!($$1 instanceof cme)) {
         super.f($$0);
      }
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dR().B) {
         this.hc();
      }
   }

   private void hc() {
      if (this.hd()) {
         this.cb = this.he() ? ((cme)this.gb()).gw() - 1 : this.cb - 1;
         if (this.cb <= 0) {
            this.a(true, false);
            this.aq();
         }
      }
   }

   private boolean hd() {
      return !this.gC() && !this.hf() && !this.da();
   }

   private boolean he() {
      return this.gb() instanceof cme;
   }

   private boolean hf() {
      return this.fZ() && !this.he();
   }

   @Nullable
   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      if ($$2 == btg.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bsb.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends cca {
      private final cgz a;
      private btc b;
      private int c;

      public a(cgz $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(caa.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.fZ()) {
            return false;
         } else if (!(this.a.gb() instanceof cme $$1)) {
            return false;
         } else {
            this.b = $$1.ek();
            int $$2 = $$1.el();
            return $$2 != this.c && this.a(this.b, cdt.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         bsh $$0 = this.a.gb();
         if ($$0 instanceof cme) {
            this.c = ((cme)$$0).el();
         }

         super.c();
      }
   }
}
