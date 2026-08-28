import java.util.EnumSet;
import javax.annotation.Nullable;

public class cho extends chj {
   private int cb = 47999;

   public cho(bsw<? extends cho> $$0, dcu $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gq() {
      return true;
   }

   @Nullable
   @Override
   protected chj gA() {
      return bsw.be.a(this.dQ());
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.cb);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.cb = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(1, new cbd(this, 2.0));
      this.bV.a(1, new cho.a(this));
   }

   @Override
   public void w(int $$0) {
      this.cb = $$0;
   }

   @Override
   protected void f(cmv $$0) {
      bsq $$1 = this.ga();
      if (!($$1 instanceof cmo)) {
         super.f($$0);
      }
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dQ().B) {
         this.hb();
      }
   }

   private void hb() {
      if (this.hc()) {
         this.cb = this.hd() ? ((cmo)this.ga()).gv() - 1 : this.cb - 1;
         if (this.cb <= 0) {
            this.a(true, false);
            this.aq();
         }
      }
   }

   private boolean hc() {
      return !this.gB() && !this.he() && !this.cZ();
   }

   private boolean hd() {
      return this.ga() instanceof cmo;
   }

   private boolean he() {
      return this.fY() && !this.hd();
   }

   @Nullable
   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      if ($$2 == btp.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bsk.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends cck {
      private final chj a;
      private btl b;
      private int c;

      public a(chj $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(cak.a.d));
      }

      @Override
      public boolean b() {
         if (!this.a.fY()) {
            return false;
         } else if (!(this.a.ga() instanceof cmo $$1)) {
            return false;
         } else {
            this.b = $$1.ej();
            int $$2 = $$1.ek();
            return $$2 != this.c && this.a(this.b, ced.a);
         }
      }

      @Override
      public void d() {
         this.e.h(this.b);
         bsq $$0 = this.a.ga();
         if ($$0 instanceof cmo) {
            this.c = ((cmo)$$0).ek();
         }

         super.d();
      }
   }
}
