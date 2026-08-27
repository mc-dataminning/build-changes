import java.util.EnumSet;
import javax.annotation.Nullable;

public class chf extends cik implements chv {
   public static final float b = 0.03F;
   boolean cb;
   protected final car c;
   protected final cao d;

   public chf(bqr<? extends chf> $$0, czu $$1) {
      super($$0, $$1);
      this.bP = new chf.d(this);
      this.a(emi.j, 0.0F);
      this.c = new car(this, $$1);
      this.d = new cao(this, $$1);
   }

   public static bsk.a r() {
      return cik.gt().a(bsl.v, 1.0);
   }

   @Override
   protected void u() {
      this.bS.a(1, new chf.c(this, 1.0));
      this.bS.a(2, new chf.f(this, 1.0, 40, 10.0F));
      this.bS.a(2, new chf.a(this, 1.0, false));
      this.bS.a(5, new chf.b(this, 1.0));
      this.bS.a(6, new chf.e(this, 1.0, this.dN().z_()));
      this.bS.a(7, new byy(this, 1.0));
      this.bT.a(1, new bzt(this, chf.class).a(cim.class));
      this.bT.a(2, new bzu<>(this, ckl.class, 10, true, false, this::j));
      this.bT.a(3, new bzu<>(this, cjt.class, false));
      this.bT.a(3, new bzu<>(this, cdf.class, true));
      this.bT.a(3, new bzu<>(this, cef.class, true, false));
      this.bT.a(5, new bzu<>(this, cdu.class, 10, true, false, cdu.bZ));
   }

   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.d(bqs.b).d() && $$0.E_().i() < 0.03F) {
         this.a(bqs.b, new csd(csg.vR));
         this.f(bqs.b);
      }

      return $$3;
   }

   public static boolean a(bqr<chf> $$0, daj $$1, bri $$2, im $$3, ayd $$4) {
      if (!$$1.b_($$3.d()).a(avt.a) && !bri.a($$2)) {
         return false;
      } else {
         iv<dat> $$5 = $$1.t($$3);
         boolean $$6 = $$1.ak() != bon.a && (bri.b($$2) || a($$1, $$3, $$4)) && (bri.a($$2) || $$1.b_($$3).a(avt.a));
         if ($$6 && bri.a($$2)) {
            return true;
         } else {
            return $$5.a(avn.ap) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         }
      }
   }

   private static boolean a(czv $$0, im $$1) {
      return $$1.v() < $$0.z_() - 5;
   }

   @Override
   protected boolean y() {
      return false;
   }

   @Override
   protected auy v() {
      return this.bc() ? auz.hz : auz.hy;
   }

   @Override
   protected auy d(bpj $$0) {
      return this.bc() ? auz.hD : auz.hC;
   }

   @Override
   protected auy o_() {
      return this.bc() ? auz.hB : auz.hA;
   }

   @Override
   protected auy gp() {
      return auz.hF;
   }

   @Override
   protected auy aN() {
      return auz.hG;
   }

   @Override
   protected csd gq() {
      return csd.i;
   }

   @Override
   protected void a(ayd $$0, boo $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bqs.a, new csd(csg.vP));
         } else {
            this.a(bqs.a, new csd(csg.qV));
         }
      }
   }

   @Override
   protected boolean b(csd $$0, csd $$1) {
      if ($$1.a(csg.vR)) {
         return false;
      } else if ($$1.a(csg.vP)) {
         return $$0.a(csg.vP) ? $$0.m() < $$1.m() : false;
      } else {
         return $$0.a(csg.vP) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gr() {
      return false;
   }

   @Override
   public boolean a(czx $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable bre $$0) {
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
         bre $$0 = this.p();
         return $$0 != null && $$0.bc();
      }
   }

   @Override
   public void a(etf $$0) {
      if (this.cY() && this.bc() && this.gz()) {
         this.a(0.01F, $$0);
         this.a(brj.a, this.dq());
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
      emf $$0 = this.K().j();
      if ($$0 != null) {
         im $$1 = $$0.l();
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
   public void a(bre $$0, float $$1) {
      clq $$2 = new clq(this.dN(), this, new csd(csg.vP));
      double $$3 = $$0.ds() - this.ds();
      double $$4 = $$0.e(0.3333333333333333) - $$2.du();
      double $$5 = $$0.dy() - this.dy();
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      $$2.c($$3, $$4 + $$6 * 0.2F, $$5, 1.6F, (float)(14 - this.dN().ak().a() * 4));
      this.a(auz.hE, 1.0F, 1.0F / (this.ej().i() * 0.4F + 0.8F));
      this.dN().b($$2);
   }

   public void w(boolean $$0) {
      this.cb = $$0;
   }

   static class a extends bzq {
      private final chf b;

      public a(chf $$0, double $$1, boolean $$2) {
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

   static class b extends byo {
      private final chf g;

      public b(chf $$0, double $$1) {
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
      protected boolean a(czx $$0, im $$1) {
         im $$2 = $$1.c();
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

   static class c extends byb {
      private final brm a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final czu f;

      public c(brm $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dN();
         this.a(EnumSet.of(byb.a.a));
      }

      @Override
      public boolean a() {
         if (!this.f.Q()) {
            return false;
         } else if (this.a.bc()) {
            return false;
         } else {
            etf $$0 = this.h();
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
      private etf h() {
         ayd $$0 = this.a.ej();
         im $$1 = this.a.dn();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            im $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dcx.G)) {
               return etf.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends bxe {
      private final chf l;

      public d(chf $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bre $$0 = this.l.p();
         if (this.l.gz() && this.l.bc()) {
            if ($$0 != null && $$0.du() > this.l.du() || this.l.cb) {
               this.l.g(this.l.dq().b(0.0, 0.002, 0.0));
            }

            if (this.k != bxe.a.b || this.l.K().l()) {
               this.l.y(0.0F);
               return;
            }

            double $$1 = this.e - this.l.ds();
            double $$2 = this.f - this.l.du();
            double $$3 = this.g - this.l.dy();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(axw.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dD(), $$5, 90.0F));
            this.l.aZ = this.l.dD();
            float $$6 = (float)(this.h * this.l.g(bsl.r));
            float $$7 = axw.i(0.125F, this.l.fl(), $$6);
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

   static class e extends byb {
      private final chf a;
      private final double b;
      private final int c;
      private boolean d;

      public e(chf $$0, double $$1, int $$2) {
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
            etf $$0 = cby.a(this.a, 4, 8, new etf(this.a.ds(), (double)(this.c - 1), this.a.dy()), (float) (Math.PI / 2));
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

   static class f extends bza {
      private final chf a;

      public f(chv $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (chf)$$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.a.eV().a(csg.vP);
      }

      @Override
      public void c() {
         super.c();
         this.a.v(true);
         this.a.c(bop.a);
      }

      @Override
      public void d() {
         super.d();
         this.a.fz();
         this.a.v(false);
      }
   }
}
