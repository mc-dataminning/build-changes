import java.util.EnumSet;
import javax.annotation.Nullable;

public class ciq extends cjv implements cjg {
   public static final float b = 0.03F;
   boolean cb;
   protected final ccc c;
   protected final cbz d;

   public ciq(bsa<? extends ciq> $$0, dax $$1) {
      super($$0, $$1);
      this.bP = new ciq.d(this);
      this.a(enl.j, 0.0F);
      this.c = new ccc(this, $$1);
      this.d = new cbz(this, $$1);
   }

   public static btv.a s() {
      return cjv.gt().a(btw.v, 1.0);
   }

   @Override
   protected void u() {
      this.bS.a(1, new ciq.c(this, 1.0));
      this.bS.a(2, new ciq.f(this, 1.0, 40, 10.0F));
      this.bS.a(2, new ciq.a(this, 1.0, false));
      this.bS.a(5, new ciq.b(this, 1.0));
      this.bS.a(6, new ciq.e(this, 1.0, this.dP().z_()));
      this.bS.a(7, new caj(this, 1.0));
      this.bT.a(1, new cbe(this, ciq.class).a(cjx.class));
      this.bT.a(2, new cbf<>(this, clw.class, 10, true, false, this::j));
      this.bT.a(3, new cbf<>(this, cle.class, false));
      this.bT.a(3, new cbf<>(this, ceq.class, true));
      this.bT.a(3, new cbf<>(this, cfq.class, true, false));
      this.bT.a(5, new cbf<>(this, cff.class, 10, true, false, cff.bY));
   }

   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.a(bsb.b).e() && $$0.E_().i() < 0.03F) {
         this.a(bsb.b, new cto(ctr.vR));
         this.f(bsb.b);
      }

      return $$3;
   }

   public static boolean a(bsa<ciq> $$0, dbm $$1, bss $$2, io $$3, ayk $$4) {
      if (!$$1.b_($$3.d()).a(awb.a) && !bss.a($$2)) {
         return false;
      } else {
         ix<dbw> $$5 = $$1.t($$3);
         boolean $$6 = $$1.ak() != bpr.a && (bss.b($$2) || a($$1, $$3, $$4)) && (bss.a($$2) || $$1.b_($$3).a(awb.a));
         if ($$6 && bss.a($$2)) {
            return true;
         } else {
            return $$5.a(avv.ap) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         }
      }
   }

   private static boolean a(day $$0, io $$1) {
      return $$1.v() < $$0.z_() - 5;
   }

   @Override
   protected boolean y() {
      return false;
   }

   @Override
   protected avg v() {
      return this.be() ? avh.hE : avh.hD;
   }

   @Override
   protected avg d(bqn $$0) {
      return this.be() ? avh.hI : avh.hH;
   }

   @Override
   protected avg o_() {
      return this.be() ? avh.hG : avh.hF;
   }

   @Override
   protected avg gp() {
      return avh.hK;
   }

   @Override
   protected avg aP() {
      return avh.hL;
   }

   @Override
   protected cto gq() {
      return cto.i;
   }

   @Override
   protected void a(ayk $$0, bps $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bsb.a, new cto(ctr.vP));
         } else {
            this.a(bsb.a, new cto(ctr.qV));
         }
      }
   }

   @Override
   protected boolean b(cto $$0, cto $$1) {
      if ($$1.a(ctr.vR)) {
         return false;
      } else if ($$1.a(ctr.vP)) {
         return $$0.a(ctr.vP) ? $$0.n() < $$1.n() : false;
      } else {
         return $$0.a(ctr.vP) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gr() {
      return false;
   }

   @Override
   public boolean a(dba $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable bso $$0) {
      return $$0 != null ? !this.dP().Q() || $$0.be() : false;
   }

   @Override
   public boolean cC() {
      return !this.cc();
   }

   boolean gz() {
      if (this.cb) {
         return true;
      } else {
         bso $$0 = this.p();
         return $$0 != null && $$0.be();
      }
   }

   @Override
   public void a(euk $$0) {
      if (this.da() && this.be() && this.gz()) {
         this.a(0.01F, $$0);
         this.a(bst.a, this.ds());
         this.g(this.ds().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   public void bk() {
      if (!this.dP().B) {
         if (this.db() && this.be() && this.gz()) {
            this.bR = this.c;
            this.i(true);
         } else {
            this.bR = this.d;
            this.i(false);
         }
      }
   }

   @Override
   public boolean cd() {
      return this.cc();
   }

   protected boolean gs() {
      eni $$0 = this.K().j();
      if ($$0 != null) {
         io $$1 = $$0.l();
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
   public void a(bso $$0, float $$1) {
      cnb $$2 = new cnb(this.dP(), this, new cto(ctr.vP));
      double $$3 = $$0.du() - this.du();
      double $$4 = $$0.e(0.3333333333333333) - $$2.dw();
      double $$5 = $$0.dA() - this.dA();
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      $$2.c($$3, $$4 + $$6 * 0.2F, $$5, 1.6F, (float)(14 - this.dP().ak().a() * 4));
      this.a(avh.hJ, 1.0F, 1.0F / (this.el().i() * 0.4F + 0.8F));
      this.dP().b($$2);
   }

   public void w(boolean $$0) {
      this.cb = $$0;
   }

   static class a extends cbb {
      private final ciq b;

      public a(ciq $$0, double $$1, boolean $$2) {
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

   static class b extends bzz {
      private final ciq g;

      public b(ciq $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.g.dP().Q() && this.g.be() && this.g.dw() >= (double)(this.g.dP().z_() - 3);
      }

      @Override
      public boolean b() {
         return super.b();
      }

      @Override
      protected boolean a(dba $$0, io $$1) {
         io $$2 = $$1.c();
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

   static class c extends bzm {
      private final bsx a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final dax f;

      public c(bsx $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dP();
         this.a(EnumSet.of(bzm.a.a));
      }

      @Override
      public boolean a() {
         if (!this.f.Q()) {
            return false;
         } else if (this.a.be()) {
            return false;
         } else {
            euk $$0 = this.h();
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
      private euk h() {
         ayk $$0 = this.a.el();
         io $$1 = this.a.dp();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            io $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dea.G)) {
               return euk.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends byp {
      private final ciq l;

      public d(ciq $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bso $$0 = this.l.p();
         if (this.l.gz() && this.l.be()) {
            if ($$0 != null && $$0.dw() > this.l.dw() || this.l.cb) {
               this.l.g(this.l.ds().b(0.0, 0.002, 0.0));
            }

            if (this.k != byp.a.b || this.l.K().l()) {
               this.l.y(0.0F);
               return;
            }

            double $$1 = this.e - this.l.du();
            double $$2 = this.f - this.l.dw();
            double $$3 = this.g - this.l.dA();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(ayd.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dF(), $$5, 90.0F));
            this.l.aZ = this.l.dF();
            float $$6 = (float)(this.h * this.l.g(btw.r));
            float $$7 = ayd.i(0.125F, this.l.fn(), $$6);
            this.l.y($$7);
            this.l.g(this.l.ds().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aE()) {
               this.l.g(this.l.ds().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends bzm {
      private final ciq a;
      private final double b;
      private final int c;
      private boolean d;

      public e(ciq $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean a() {
         return !this.a.dP().Q() && this.a.be() && this.a.dw() < (double)(this.c - 2);
      }

      @Override
      public boolean b() {
         return this.a() && !this.d;
      }

      @Override
      public void e() {
         if (this.a.dw() < (double)(this.c - 1) && (this.a.K().l() || this.a.gs())) {
            euk $$0 = cdj.a(this.a, 4, 8, new euk(this.a.du(), (double)(this.c - 1), this.a.dA()), (float) (Math.PI / 2));
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

   static class f extends cal {
      private final ciq a;

      public f(cjg $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (ciq)$$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.a.eX().a(ctr.vP);
      }

      @Override
      public void c() {
         super.c();
         this.a.v(true);
         this.a.c(bpt.a);
      }

      @Override
      public void d() {
         super.d();
         this.a.fB();
         this.a.v(false);
      }
   }
}
