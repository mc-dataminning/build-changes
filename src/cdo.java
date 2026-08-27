import java.util.EnumSet;
import javax.annotation.Nullable;

public class cdo extends cdj {
   private int bY = 47999;

   public cdo(bpd<? extends cdo> $$0, cxb $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gw() {
      return true;
   }

   @Nullable
   @Override
   protected cdj gB() {
      return bpd.be.a(this.dM());
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
      this.bR.a(1, new bxf(this, 2.0));
      this.bS.a(1, new cdo.a(this));
   }

   @Override
   public void x(int $$0) {
      this.bY = $$0;
   }

   @Override
   protected void f(ciu $$0) {
      box $$1 = this.gc();
      if (!($$1 instanceof cin)) {
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
         this.bY = this.he() ? ((cin)this.gc()).gw() - 1 : this.bY - 1;
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
      return this.gc() instanceof cin;
   }

   private boolean hf() {
      return this.gb() && !this.he();
   }

   @Nullable
   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      if ($$2 == bpt.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bos.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends bym {
      private final cdj a;
      private bpp b;
      private int c;

      public a(cdj $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(bwm.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.gb()) {
            return false;
         } else if (!(this.a.gc() instanceof cin $$1)) {
            return false;
         } else {
            this.b = $$1.ej();
            int $$2 = $$1.ek();
            return $$2 != this.c && this.a(this.b, caf.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         box $$0 = this.a.gc();
         if ($$0 instanceof cin) {
            this.c = ((cin)$$0).ek();
         }

         super.c();
      }
   }
}
