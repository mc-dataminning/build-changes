import java.util.EnumSet;
import javax.annotation.Nullable;

public class cjd extends ciy {
   private int bY = 47999;

   public cjd(bul<? extends cjd> $$0, dfb $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gx() {
      return true;
   }

   @Nullable
   @Override
   protected ciy gI() {
      return bul.be.a(this.dX(), buk.e);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bY);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bY = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(1, new ccr(this, 2.0));
      this.bT.a(1, new cjd.a(this));
      this.bT.a(2, new cdr<>(this, cmk.class, true, $$0 -> $$0.ar() != bul.bx));
      this.bT.a(2, new cdr<>(this, cky.class, true));
   }

   @Override
   public void x(int $$0) {
      this.bY = $$0;
   }

   @Override
   protected void a(com $$0) {
      bue $$1 = this.C();
      if (!($$1 instanceof coe)) {
         super.a($$0);
      }
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dX().C) {
         this.hk();
      }
   }

   private void hk() {
      if (this.hl()) {
         this.bY = this.hm() ? ((coe)this.C()).gD() - 1 : this.bY - 1;
         if (this.bY <= 0) {
            this.a(true, false);
            this.av();
         }
      }
   }

   private boolean hl() {
      return !this.gL() && !this.hn() && !this.dg();
   }

   private boolean hm() {
      return this.C() instanceof coe;
   }

   private boolean hn() {
      return this.M_() && !this.hm();
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      if ($$2 == buk.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new btv.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends cdy {
      private final ciy a;
      private bva b;
      private int c;

      public a(ciy $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(cby.a.d));
      }

      @Override
      public boolean b() {
         if (!this.a.M_()) {
            return false;
         } else if (!(this.a.C() instanceof coe $$1)) {
            return false;
         } else {
            this.b = $$1.es();
            int $$2 = $$1.et();
            return $$2 != this.c && this.a(this.b, cfr.a);
         }
      }

      @Override
      public void d() {
         this.e.h(this.b);
         bue $$0 = this.a.C();
         if ($$0 instanceof coe) {
            this.c = ((coe)$$0).et();
         }

         super.d();
      }
   }
}
