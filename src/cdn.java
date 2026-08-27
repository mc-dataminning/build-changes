import java.util.EnumSet;
import javax.annotation.Nullable;

public class cdn extends cdi {
   private int bY = 47999;

   public cdn(bpc<? extends cdn> $$0, cwz $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gw() {
      return true;
   }

   @Nullable
   @Override
   protected cdi gB() {
      return bpc.bd.a(this.dM());
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bY);
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bY = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(1, new bxe(this, 2.0));
      this.bS.a(1, new cdn.a(this));
   }

   @Override
   public void x(int $$0) {
      this.bY = $$0;
   }

   @Override
   protected void f(cis $$0) {
      bow $$1 = this.gc();
      if (!($$1 instanceof cil)) {
         super.f($$0);
      }
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dM().B) {
         this.hc();
      }
   }

   private void hc() {
      if (this.hd()) {
         this.bY = this.he() ? ((cil)this.gc()).gw() - 1 : this.bY - 1;
         if (this.bY <= 0) {
            this.a(true, false);
            this.am();
         }
      }
   }

   private boolean hd() {
      return !this.gC() && !this.hf() && !this.cV();
   }

   private boolean he() {
      return this.gc() instanceof cil;
   }

   private boolean hf() {
      return this.gb() && !this.he();
   }

   @Nullable
   @Override
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
      if ($$2 == bps.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bor.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends byl {
      private final cdi a;
      private bpo b;
      private int c;

      public a(cdi $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(bwl.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.gb()) {
            return false;
         } else if (!(this.a.gc() instanceof cil $$1)) {
            return false;
         } else {
            this.b = $$1.ej();
            int $$2 = $$1.ek();
            return $$2 != this.c && this.a(this.b, cae.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         bow $$0 = this.a.gc();
         if ($$0 instanceof cil) {
            this.c = ((cil)$$0).ek();
         }

         super.c();
      }
   }
}
