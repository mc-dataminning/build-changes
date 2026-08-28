import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chn extends cgz {
   public static final double bY = 0.6;
   public static final double bZ = 0.8;
   public static final double ca = 1.33;
   private static final ajy<Boolean> cc = akc.a(chn.class, aka.k);
   @Nullable
   private chn.a<coy> cd;
   @Nullable
   private chn.b ce;

   public chn(but<? extends chn> $$0, dgj $$1) {
      super($$0, $$1);
      this.t();
   }

   boolean x() {
      return this.al.a(cc);
   }

   private void x(boolean $$0) {
      this.al.a(cc, $$0);
      this.t();
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Trusting", this.x());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.x($$0.q("Trusting"));
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
   }

   @Override
   protected void E() {
      this.ce = new chn.b(this, 0.6, $$0 -> $$0.a(awy.as), true);
      this.bS.a(1, new cca(this));
      this.bS.a(3, this.ce);
      this.bS.a(7, new ccm(this, 0.3F));
      this.bS.a(8, new ccw(this));
      this.bS.a(9, new cbs(this, 0.8));
      this.bS.a(10, new cdt(this, 0.8, 1.0000001E-5F));
      this.bS.a(11, new cco(this, coy.class, 10.0F));
      this.bT.a(1, new cdz<>(this, che.class, false));
      this.bT.a(1, new cdz<>(this, cia.class, 10, false, false, cia.bY));
   }

   @Override
   public void a(ard $$0) {
      if (this.N().b()) {
         double $$1 = this.N().c();
         if ($$1 == 0.6) {
            this.b(bvu.f);
            this.h(false);
         } else if ($$1 == 1.33) {
            this.b(bvu.a);
            this.h(true);
         } else {
            this.b(bvu.a);
            this.h(false);
         }
      } else {
         this.b(bvu.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.x() && this.af > 2400;
   }

   public static bwp.a p() {
      return cgz.gx().a(bwq.s, 10.0).a(bwq.v, 0.3F).a(bwq.c, 3.0);
   }

   @Nullable
   @Override
   protected avz u() {
      return awa.sN;
   }

   @Override
   public int T() {
      return 900;
   }

   @Override
   protected avz e(btc $$0) {
      return awa.sM;
   }

   @Override
   protected avz o_() {
      return awa.sO;
   }

   @Override
   public bsl b(coy $$0, bsk $$1) {
      cwq $$2 = $$0.b($$1);
      if ((this.ce == null || this.ce.i()) && !this.x() && this.j($$2) && $$0.g(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dV().C) {
            if (this.ae.a(3) == 0) {
               this.x(true);
               this.y(true);
               this.dV().a(this, (byte)41);
            } else {
               this.y(false);
               this.dV().a(this, (byte)40);
            }
         }

         return bsl.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 41) {
         this.y(true);
      } else if ($$0 == 40) {
         this.y(false);
      } else {
         super.b($$0);
      }
   }

   private void y(boolean $$0) {
      lr $$1 = lt.R;
      if (!$$0) {
         $$1 = lt.ag;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ae.k() * 0.02;
         double $$4 = this.ae.k() * 0.02;
         double $$5 = this.ae.k() * 0.02;
         this.dV().a($$1, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void t() {
      if (this.cd == null) {
         this.cd = new chn.a<>(this, coy.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.cd);
      if (!this.x()) {
         this.bS.a(4, this.cd);
      }
   }

   @Nullable
   public chn b(ard $$0, bud $$1) {
      return but.aI.a($$0, bus.e);
   }

   @Override
   public boolean j(cwq $$0) {
      return $$0.a(awy.as);
   }

   public static boolean c(but<chn> $$0, dgk $$1, bus $$2, ji $$3, azh $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(dgm $$0) {
      if ($$0.f(this) && !$$0.d(this.cR())) {
         ji $$1 = this.dv();
         if ($$1.v() < $$0.P()) {
            return false;
         }

         dwy $$2 = $$0.a_($$1.e());
         if ($$2.a(djp.i) || $$2.a(awp.Q)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bwb a(dha $$0, bsj $$1, bus $$2, @Nullable bwb $$3) {
      if ($$3 == null) {
         $$3 = new bud.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public fbb cT() {
      return new fbb(0.0, (double)(0.5F * this.cS()), (double)(this.dq() * 0.4F));
   }

   @Override
   public boolean ce() {
      return this.ci() || super.ce();
   }

   static class a<T extends bvi> extends cbn<T> {
      private final chn i;

      public a(chn $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bur.e::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.i.x() && super.b();
      }

      @Override
      public boolean c() {
         return !this.i.x() && super.c();
      }
   }

   static class b extends cdo {
      private final chn c;

      public b(chn $$0, double $$1, Predicate<cwq> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.x();
      }
   }
}
