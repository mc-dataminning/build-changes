import java.util.EnumSet;
import javax.annotation.Nullable;

public class cen extends cei {
   private int bY = 47999;

   public cen(bqb<? extends cen> $$0, cyx $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gw() {
      return true;
   }

   @Nullable
   @Override
   protected cei gB() {
      return bqb.bd.a(this.dM());
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bY);
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bY = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(1, new bye(this, 2.0));
      this.bS.a(1, new cen.a(this));
   }

   @Override
   public void x(int $$0) {
      this.bY = $$0;
   }

   @Override
   protected void f(cjt $$0) {
      bpv $$1 = this.gc();
      if (!($$1 instanceof cjm)) {
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
         this.bY = this.he() ? ((cjm)this.gc()).gw() - 1 : this.bY - 1;
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
      return this.gc() instanceof cjm;
   }

   private boolean hf() {
      return this.gb() && !this.he();
   }

   @Nullable
   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      if ($$2 == bqs.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bpp.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends bzl {
      private final cei a;
      private bqo b;
      private int c;

      public a(cei $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(bxl.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.gb()) {
            return false;
         } else if (!(this.a.gc() instanceof cjm $$1)) {
            return false;
         } else {
            this.b = $$1.ej();
            int $$2 = $$1.ek();
            return $$2 != this.c && this.a(this.b, cbe.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         bpv $$0 = this.a.gc();
         if ($$0 instanceof cjm) {
            this.c = ((cjm)$$0).ek();
         }

         super.c();
      }
   }
}
