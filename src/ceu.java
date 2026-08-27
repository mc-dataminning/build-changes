import java.util.EnumSet;
import javax.annotation.Nullable;

public class ceu extends cep {
   private int bY = 47999;

   public ceu(bqg<? extends ceu> $$0, czg $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gw() {
      return true;
   }

   @Nullable
   @Override
   protected cep gB() {
      return bqg.bd.a(this.dM());
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bY);
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bY = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(1, new byj(this, 2.0));
      this.bS.a(1, new ceu.a(this));
   }

   @Override
   public void x(int $$0) {
      this.bY = $$0;
   }

   @Override
   protected void f(cka $$0) {
      bqa $$1 = this.gc();
      if (!($$1 instanceof cjt)) {
         super.f($$0);
      }
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dM().B) {
         this.hc();
      }
   }

   private void hc() {
      if (this.hd()) {
         this.bY = this.he() ? ((cjt)this.gc()).gw() - 1 : this.bY - 1;
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
      return this.gc() instanceof cjt;
   }

   private boolean hf() {
      return this.gb() && !this.he();
   }

   @Nullable
   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      if ($$2 == bqx.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bpu.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends bzq {
      private final cep a;
      private bqt b;
      private int c;

      public a(cep $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(bxq.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.gb()) {
            return false;
         } else if (!(this.a.gc() instanceof cjt $$1)) {
            return false;
         } else {
            this.b = $$1.ej();
            int $$2 = $$1.ek();
            return $$2 != this.c && this.a(this.b, cbj.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         bqa $$0 = this.a.gc();
         if ($$0 instanceof cjt) {
            this.c = ((cjt)$$0).ek();
         }

         super.c();
      }
   }
}
