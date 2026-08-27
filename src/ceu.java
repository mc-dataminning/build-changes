import java.util.EnumSet;
import javax.annotation.Nullable;

public class ceu extends cfz implements cfk {
   public static final float b = 0.03F;
   boolean bY;
   protected final byk c;
   protected final byh d;

   public ceu(bol<? extends ceu> $$0, cwe $$1) {
      super($$0, $$1);
      this.bM = new ceu.d(this);
      this.a(eic.j, 0.0F);
      this.c = new byk(this, $$1);
      this.d = new byh(this, $$1);
   }

   public static bqd.a u() {
      return cfz.gp().a(bqe.r, 1.0);
   }

   @Override
   protected void w() {
      this.bP.a(1, new ceu.c(this, 1.0));
      this.bP.a(2, new ceu.f(this, 1.0, 40, 10.0F));
      this.bP.a(2, new ceu.a(this, 1.0, false));
      this.bP.a(5, new ceu.b(this, 1.0));
      this.bP.a(6, new ceu.e(this, 1.0, this.dJ().A_()));
      this.bP.a(7, new bwr(this, 1.0));
      this.bQ.a(1, new bxm(this, ceu.class).a(cgb.class));
      this.bQ.a(2, new bxn<>(this, cia.class, 10, true, false, this::j));
      this.bQ.a(3, new bxn<>(this, chi.class, false));
      this.bQ.a(3, new bxn<>(this, cay.class, true));
      this.bQ.a(3, new bxn<>(this, cbw.class, true, false));
      this.bQ.a(5, new bxn<>(this, cbn.class, 10, true, false, cbn.bW));
   }

   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.c(bom.b).b() && $$0.F_().i() < 0.03F) {
         this.a(bom.b, new cpq(cpt.vN));
         this.e(bom.b);
      }

      return $$3;
   }

   public static boolean a(bol<ceu> $$0, cwt $$1, bpb $$2, ib $$3, awt $$4) {
      if (!$$1.b_($$3.d()).a(auj.a) && !bpb.a($$2)) {
         return false;
      } else {
         il<cxd> $$5 = $$1.t($$3);
         boolean $$6 = $$1.aj() != bmi.a && (bpb.b($$2) || a($$1, $$3, $$4)) && (bpb.a($$2) || $$1.b_($$3).a(auj.a));
         if ($$6 && bpb.a($$2)) {
            return true;
         } else {
            return $$5.a(aud.ap) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         }
      }
   }

   private static boolean a(cwf $$0, ib $$1) {
      return $$1.v() < $$0.A_() - 5;
   }

   @Override
   protected boolean A() {
      return false;
   }

   @Override
   protected ato y() {
      return this.aZ() ? atp.hq : atp.hp;
   }

   @Override
   protected ato d(bne $$0) {
      return this.aZ() ? atp.hu : atp.ht;
   }

   @Override
   protected ato n_() {
      return this.aZ() ? atp.hs : atp.hr;
   }

   @Override
   protected ato gl() {
      return atp.hw;
   }

   @Override
   protected ato aN() {
      return atp.hx;
   }

   @Override
   protected cpq gm() {
      return cpq.h;
   }

   @Override
   protected void a(awt $$0, bmj $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bom.a, new cpq(cpt.vL));
         } else {
            this.a(bom.a, new cpq(cpt.qU));
         }
      }
   }

   @Override
   protected boolean b(cpq $$0, cpq $$1) {
      if ($$1.a(cpt.vN)) {
         return false;
      } else if ($$1.a(cpt.vL)) {
         return $$0.a(cpt.vL) ? $$0.l() < $$1.l() : false;
      } else {
         return $$0.a(cpt.vL) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gn() {
      return false;
   }

   @Override
   public boolean a(cwh $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable box $$0) {
      return $$0 != null ? !this.dJ().P() || $$0.aZ() : false;
   }

   @Override
   public boolean cw() {
      return !this.bW();
   }

   boolean gv() {
      if (this.bY) {
         return true;
      } else {
         box $$0 = this.q();
         return $$0 != null && $$0.aZ();
      }
   }

   @Override
   public void a(eov $$0) {
      if (this.cU() && this.aZ() && this.gv()) {
         this.a(0.01F, $$0);
         this.a(bpc.a, this.dm());
         this.g(this.dm().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   public void bf() {
      if (!this.dJ().B) {
         if (this.cV() && this.aZ() && this.gv()) {
            this.bO = this.c;
            this.h(true);
         } else {
            this.bO = this.d;
            this.h(false);
         }
      }
   }

   @Override
   public boolean bX() {
      return this.bW();
   }

   protected boolean go() {
      eig $$0 = this.N().j();
      if ($$0 != null) {
         ib $$1 = $$0.l();
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
   public void a(box $$0, float $$1) {
      cjf $$2 = new cjf(this.dJ(), this, new cpq(cpt.vL));
      double $$3 = $$0.do() - this.do();
      double $$4 = $$0.e(0.3333333333333333) - $$2.dq();
      double $$5 = $$0.du() - this.du();
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      $$2.c($$3, $$4 + $$6 * 0.2F, $$5, 1.6F, (float)(14 - this.dJ().aj().a() * 4));
      this.a(atp.hv, 1.0F, 1.0F / (this.ef().i() * 0.4F + 0.8F));
      this.dJ().b($$2);
   }

   public void w(boolean $$0) {
      this.bY = $$0;
   }

   static class a extends bxj {
      private final ceu b;

      public a(ceu $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b.j(this.b.q());
      }

      @Override
      public boolean b() {
         return super.b() && this.b.j(this.b.q());
      }
   }

   static class b extends bwh {
      private final ceu g;

      public b(ceu $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.g.dJ().P() && this.g.aZ() && this.g.dq() >= (double)(this.g.dJ().A_() - 3);
      }

      @Override
      public boolean b() {
         return super.b();
      }

      @Override
      protected boolean a(cwh $$0, ib $$1) {
         ib $$2 = $$1.c();
         return $$0.u($$2) && $$0.u($$2.c()) ? $$0.a_($$1).a($$0, $$1, this.g) : false;
      }

      @Override
      public void c() {
         this.g.w(false);
         this.g.bO = this.g.d;
         super.c();
      }

      @Override
      public void d() {
         super.d();
      }
   }

   static class c extends bvu {
      private final bpf a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final cwe f;

      public c(bpf $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dJ();
         this.a(EnumSet.of(bvu.a.a));
      }

      @Override
      public boolean a() {
         if (!this.f.P()) {
            return false;
         } else if (this.a.aZ()) {
            return false;
         } else {
            eov $$0 = this.h();
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
         return !this.a.N().l();
      }

      @Override
      public void c() {
         this.a.N().a(this.b, this.c, this.d, this.e);
      }

      @Nullable
      private eov h() {
         awt $$0 = this.a.ef();
         ib $$1 = this.a.dj();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            ib $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(czh.G)) {
               return eov.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends bux {
      private final ceu l;

      public d(ceu $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         box $$0 = this.l.q();
         if (this.l.gv() && this.l.aZ()) {
            if ($$0 != null && $$0.dq() > this.l.dq() || this.l.bY) {
               this.l.g(this.l.dm().b(0.0, 0.002, 0.0));
            }

            if (this.k != bux.a.b || this.l.N().l()) {
               this.l.w(0.0F);
               return;
            }

            double $$1 = this.e - this.l.do();
            double $$2 = this.f - this.l.dq();
            double $$3 = this.g - this.l.du();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(awm.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dz(), $$5, 90.0F));
            this.l.aV = this.l.dz();
            float $$6 = (float)(this.h * this.l.g(bqe.o));
            float $$7 = awm.i(0.125F, this.l.fh(), $$6);
            this.l.w($$7);
            this.l.g(this.l.dm().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aC()) {
               this.l.g(this.l.dm().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends bvu {
      private final ceu a;
      private final double b;
      private final int c;
      private boolean d;

      public e(ceu $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean a() {
         return !this.a.dJ().P() && this.a.aZ() && this.a.dq() < (double)(this.c - 2);
      }

      @Override
      public boolean b() {
         return this.a() && !this.d;
      }

      @Override
      public void e() {
         if (this.a.dq() < (double)(this.c - 1) && (this.a.N().l() || this.a.go())) {
            eov $$0 = bzr.a(this.a, 4, 8, new eov(this.a.do(), (double)(this.c - 1), this.a.du()), (float) (Math.PI / 2));
            if ($$0 == null) {
               this.d = true;
               return;
            }

            this.a.N().a($$0.c, $$0.d, $$0.e, this.b);
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

   static class f extends bwt {
      private final ceu a;

      public f(cfk $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (ceu)$$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.a.eR().a(cpt.vL);
      }

      @Override
      public void c() {
         super.c();
         this.a.v(true);
         this.a.c(bmk.a);
      }

      @Override
      public void d() {
         super.d();
         this.a.fv();
         this.a.v(false);
      }
   }
}
