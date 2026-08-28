import java.util.EnumSet;
import javax.annotation.Nullable;

public class cha extends cgv {
   private int cb = 47999;

   public cha(bsj<? extends cha> $$0, dcd $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gw() {
      return true;
   }

   @Nullable
   @Override
   protected cgv gB() {
      return bsj.be.a(this.dP());
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
      this.bU.a(1, new cap(this, 2.0));
      this.bV.a(1, new cha.a(this));
   }

   @Override
   public void w(int $$0) {
      this.cb = $$0;
   }

   @Override
   protected void f(cmh $$0) {
      bsd $$1 = this.gb();
      if (!($$1 instanceof cma)) {
         super.f($$0);
      }
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dP().B) {
         this.hc();
      }
   }

   private void hc() {
      if (this.hd()) {
         this.cb = this.he() ? ((cma)this.gb()).gw() - 1 : this.cb - 1;
         if (this.cb <= 0) {
            this.a(true, false);
            this.ao();
         }
      }
   }

   private boolean hd() {
      return !this.gC() && !this.hf() && !this.cY();
   }

   private boolean he() {
      return this.gb() instanceof cma;
   }

   private boolean hf() {
      return this.fZ() && !this.he();
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      if ($$2 == btc.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new brx.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends cbw {
      private final cgv a;
      private bsy b;
      private int c;

      public a(cgv $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(bzw.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.fZ()) {
            return false;
         } else if (!(this.a.gb() instanceof cma $$1)) {
            return false;
         } else {
            this.b = $$1.ei();
            int $$2 = $$1.ej();
            return $$2 != this.c && this.a(this.b, cdp.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         bsd $$0 = this.a.gb();
         if ($$0 instanceof cma) {
            this.c = ((cma)$$0).ej();
         }

         super.c();
      }
   }
}
