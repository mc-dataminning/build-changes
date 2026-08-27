import java.util.EnumSet;
import javax.annotation.Nullable;

public class cib extends cjg implements cir {
   public static final float b = 0.03F;
   boolean cb;
   protected final cbn c;
   protected final cbk d;

   public cib(brn<? extends cib> $$0, dad $$1) {
      super($$0, $$1);
      this.bP = new cib.d(this);
      this.a(emr.j, 0.0F);
      this.c = new cbn(this, $$1);
      this.d = new cbk(this, $$1);
   }

   public static btg.a r() {
      return cjg.gt().a(bth.v, 1.0);
   }

   @Override
   protected void u() {
      this.bS.a(1, new cib.c(this, 1.0));
      this.bS.a(2, new cib.f(this, 1.0, 40, 10.0F));
      this.bS.a(2, new cib.a(this, 1.0, false));
      this.bS.a(5, new cib.b(this, 1.0));
      this.bS.a(6, new cib.e(this, 1.0, this.dN().z_()));
      this.bS.a(7, new bzu(this, 1.0));
      this.bT.a(1, new cap(this, cib.class).a(cji.class));
      this.bT.a(2, new caq<>(this, clh.class, 10, true, false, this::j));
      this.bT.a(3, new caq<>(this, ckp.class, false));
      this.bT.a(3, new caq<>(this, ceb.class, true));
      this.bT.a(3, new caq<>(this, cfb.class, true, false));
      this.bT.a(5, new caq<>(this, ceq.class, 10, true, false, ceq.bY));
   }

   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.d(bro.b).d() && $$0.E_().i() < 0.03F) {
         this.a(bro.b, new csz(ctc.vR));
         this.f(bro.b);
      }

      return $$3;
   }

   public static boolean a(brn<cib> $$0, das $$1, bse $$2, in $$3, ayg $$4) {
      if (!$$1.b_($$3.d()).a(avw.a) && !bse.a($$2)) {
         return false;
      } else {
         iw<dbc> $$5 = $$1.t($$3);
         boolean $$6 = $$1.ak() != bpj.a && (bse.b($$2) || a($$1, $$3, $$4)) && (bse.a($$2) || $$1.b_($$3).a(avw.a));
         if ($$6 && bse.a($$2)) {
            return true;
         } else {
            return $$5.a(avq.ap) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         }
      }
   }

   private static boolean a(dae $$0, in $$1) {
      return $$1.v() < $$0.z_() - 5;
   }

   @Override
   protected boolean y() {
      return false;
   }

   @Override
   protected avb v() {
      return this.bc() ? avc.hz : avc.hy;
   }

   @Override
   protected avb d(bqf $$0) {
      return this.bc() ? avc.hD : avc.hC;
   }

   @Override
   protected avb o_() {
      return this.bc() ? avc.hB : avc.hA;
   }

   @Override
   protected avb gp() {
      return avc.hF;
   }

   @Override
   protected avb aN() {
      return avc.hG;
   }

   @Override
   protected csz gq() {
      return csz.i;
   }

   @Override
   protected void a(ayg $$0, bpk $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bro.a, new csz(ctc.vP));
         } else {
            this.a(bro.a, new csz(ctc.qV));
         }
      }
   }

   @Override
   protected boolean b(csz $$0, csz $$1) {
      if ($$1.a(ctc.vR)) {
         return false;
      } else if ($$1.a(ctc.vP)) {
         return $$0.a(ctc.vP) ? $$0.m() < $$1.m() : false;
      } else {
         return $$0.a(ctc.vP) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gr() {
      return false;
   }

   @Override
   public boolean a(dag $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable bsa $$0) {
      return $$0 != null ? !this.dN().Q() || $$0.bc() : false;
   }

   @Override
   public boolean cA() {
      return !this.ca();
   }

   boolean gz() {
      if (this.cb) {
         return true;
      } else {
         bsa $$0 = this.p();
         return $$0 != null && $$0.bc();
      }
   }

   @Override
   public void a(etp $$0) {
      if (this.cY() && this.bc() && this.gz()) {
         this.a(0.01F, $$0);
         this.a(bsf.a, this.dq());
         this.g(this.dq().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   public void bi() {
      if (!this.dN().B) {
         if (this.cZ() && this.bc() && this.gz()) {
            this.bR = this.c;
            this.i(true);
         } else {
            this.bR = this.d;
            this.i(false);
         }
      }
   }

   @Override
   public boolean cb() {
      return this.ca();
   }

   protected boolean gs() {
      emo $$0 = this.K().j();
      if ($$0 != null) {
         in $$1 = $$0.l();
         if ($$1 != null) {
            double $$2 = this.i((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            if ($$2 < 4.0) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void a(bsa $$0, float $$1) {
      cmm $$2 = new cmm(this.dN(), this, new csz(ctc.vP));
      double $$3 = $$0.ds() - this.ds();
      double $$4 = $$0.e(0.3333333333333333) - $$2.du();
      double $$5 = $$0.dy() - this.dy();
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      $$2.c($$3, $$4 + $$6 * 0.2F, $$5, 1.6F, (float)(14 - this.dN().ak().a() * 4));
      this.a(avc.hE, 1.0F, 1.0F / (this.ej().i() * 0.4F + 0.8F));
      this.dN().b($$2);
   }

   public void w(boolean $$0) {
      this.cb = $$0;
   }

   static class a extends cam {
      private final cib b;

      public a(cib $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b.j(this.b.p());
      }

      @Override
      public boolean b() {
         return super.b() && this.b.j(this.b.p());
      }
   }

   static class b extends bzk {
      private final cib g;

      public b(cib $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.g.dN().Q() && this.g.bc() && this.g.du() >= (double)(this.g.dN().z_() - 3);
      }

      @Override
      public boolean b() {
         return super.b();
      }

      @Override
      protected boolean a(dag $$0, in $$1) {
         in $$2 = $$1.c();
         return $$0.u($$2) && $$0.u($$2.c()) ? $$0.a_($$1).a($$0, $$1, this.g) : false;
      }

      @Override
      public void c() {
         this.g.w(false);
         this.g.bR = this.g.d;
         super.c();
      }

      @Override
      public void d() {
         super.d();
      }
   }

   static class c extends byx {
      private final bsi a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final dad f;

      public c(bsi $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dN();
         this.a(EnumSet.of(byx.a.a));
      }

      @Override
      public boolean a() {
         if (!this.f.Q()) {
            return false;
         } else if (this.a.bc()) {
            return false;
         } else {
            etp $$0 = this.h();
            if ($$0 == null) {
               return false;
            } else {
               this.b = $$0.c;
               this.c = $$0.d;
               this.d = $$0.e;
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return !this.a.K().l();
      }

      @Override
      public void c() {
         this.a.K().a(this.b, this.c, this.d, this.e);
      }

      @Nullable
      private etp h() {
         ayg $$0 = this.a.ej();
         in $$1 = this.a.dn();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            in $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(ddg.G)) {
               return etp.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends bya {
      private final cib l;

      public d(cib $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bsa $$0 = this.l.p();
         if (this.l.gz() && this.l.bc()) {
            if ($$0 != null && $$0.du() > this.l.du() || this.l.cb) {
               this.l.g(this.l.dq().b(0.0, 0.002, 0.0));
            }

            if (this.k != bya.a.b || this.l.K().l()) {
               this.l.y(0.0F);
               return;
            }

            double $$1 = this.e - this.l.ds();
            double $$2 = this.f - this.l.du();
            double $$3 = this.g - this.l.dy();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(axz.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dD(), $$5, 90.0F));
            this.l.aZ = this.l.dD();
            float $$6 = (float)(this.h * this.l.g(bth.r));
            float $$7 = axz.i(0.125F, this.l.fl(), $$6);
            this.l.y($$7);
            this.l.g(this.l.dq().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aC()) {
               this.l.g(this.l.dq().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends byx {
      private final cib a;
      private final double b;
      private final int c;
      private boolean d;

      public e(cib $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean a() {
         return !this.a.dN().Q() && this.a.bc() && this.a.du() < (double)(this.c - 2);
      }

      @Override
      public boolean b() {
         return this.a() && !this.d;
      }

      @Override
      public void e() {
         if (this.a.du() < (double)(this.c - 1) && (this.a.K().l() || this.a.gs())) {
            etp $$0 = ccu.a(this.a, 4, 8, new etp(this.a.ds(), (double)(this.c - 1), this.a.dy()), (float) (Math.PI / 2));
            if ($$0 == null) {
               this.d = true;
               return;
            }

            this.a.K().a($$0.c, $$0.d, $$0.e, this.b);
         }
      }

      @Override
      public void c() {
         this.a.w(true);
         this.d = false;
      }

      @Override
      public void d() {
         this.a.w(false);
      }
   }

   static class f extends bzw {
      private final cib a;

      public f(cir $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (cib)$$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.a.eV().a(ctc.vP);
      }

      @Override
      public void c() {
         super.c();
         this.a.v(true);
         this.a.c(bpl.a);
      }

      @Override
      public void d() {
         super.d();
         this.a.fz();
         this.a.v(false);
      }
   }
}
