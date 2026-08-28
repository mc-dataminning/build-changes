import java.util.EnumSet;
import javax.annotation.Nullable;

public class cjq extends ckv implements ckg {
   public static final float b = 0.03F;
   boolean cb;
   protected final cdc c;
   protected final ccz d;

   public cjq(bsz<? extends cjq> $$0, dbx $$1) {
      super($$0, $$1);
      this.bP = new cjq.d(this);
      this.a(eol.j, 0.0F);
      this.c = new cdc(this, $$1);
      this.d = new ccz(this, $$1);
   }

   public static buv.a s() {
      return ckv.gu().a(buw.v, 1.0);
   }

   @Override
   protected void u() {
      this.bS.a(1, new cjq.c(this, 1.0));
      this.bS.a(2, new cjq.f(this, 1.0, 40, 10.0F));
      this.bS.a(2, new cjq.a(this, 1.0, false));
      this.bS.a(5, new cjq.b(this, 1.0));
      this.bS.a(6, new cjq.e(this, 1.0, this.dP().z_()));
      this.bS.a(7, new cbj(this, 1.0));
      this.bT.a(1, new cce(this, cjq.class).a(ckx.class));
      this.bT.a(2, new ccf<>(this, cmw.class, 10, true, false, this::j));
      this.bT.a(3, new ccf<>(this, cme.class, false));
      this.bT.a(3, new ccf<>(this, cfq.class, true));
      this.bT.a(3, new ccf<>(this, cgq.class, true, false));
      this.bT.a(5, new ccf<>(this, cgf.class, 10, true, false, cgf.bY));
   }

   @Override
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.a(bta.b).e() && $$0.E_().i() < 0.03F) {
         this.a(bta.b, new cuo(cur.vR));
         this.f(bta.b);
      }

      return $$3;
   }

   public static boolean a(bsz<cjq> $$0, dcm $$1, bts $$2, iz $$3, azg $$4) {
      if (!$$1.b_($$3.d()).a(awu.a) && !bts.a($$2)) {
         return false;
      } else {
         ji<dcw> $$5 = $$1.t($$3);
         boolean $$6 = $$1.al() != bqq.a && (bts.b($$2) || a($$1, $$3, $$4)) && (bts.a($$2) || $$1.b_($$3).a(awu.a));
         if ($$6 && bts.a($$2)) {
            return true;
         } else {
            return $$5.a(awn.ap) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         }
      }
   }

   private static boolean a(dby $$0, iz $$1) {
      return $$1.v() < $$0.z_() - 5;
   }

   @Override
   protected boolean y() {
      return false;
   }

   @Override
   protected avy v() {
      return this.be() ? avz.hE : avz.hD;
   }

   @Override
   protected avy d(brm $$0) {
      return this.be() ? avz.hI : avz.hH;
   }

   @Override
   protected avy o_() {
      return this.be() ? avz.hG : avz.hF;
   }

   @Override
   protected avy gq() {
      return avz.hK;
   }

   @Override
   protected avy aP() {
      return avz.hL;
   }

   @Override
   protected cuo gr() {
      return cuo.l;
   }

   @Override
   protected void a(azg $$0, bqr $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bta.a, new cuo(cur.vP));
         } else {
            this.a(bta.a, new cuo(cur.qV));
         }
      }
   }

   @Override
   protected boolean b(cuo $$0, cuo $$1) {
      if ($$1.a(cur.vR)) {
         return false;
      } else if ($$1.a(cur.vP)) {
         return $$0.a(cur.vP) ? $$0.n() < $$1.n() : false;
      } else {
         return $$0.a(cur.vP) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gs() {
      return false;
   }

   @Override
   public boolean a(dca $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable bto $$0) {
      return $$0 != null ? !this.dP().R() || $$0.be() : false;
   }

   @Override
   public boolean cC() {
      return !this.cc();
   }

   boolean gA() {
      if (this.cb) {
         return true;
      } else {
         bto $$0 = this.p();
         return $$0 != null && $$0.be();
      }
   }

   @Override
   public void a(evq $$0) {
      if (this.da() && this.be() && this.gA()) {
         this.a(0.01F, $$0);
         this.a(btt.a, this.ds());
         this.h(this.ds().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   public void bk() {
      if (!this.dP().B) {
         if (this.db() && this.be() && this.gA()) {
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

   protected boolean gt() {
      eoi $$0 = this.K().j();
      if ($$0 != null) {
         iz $$1 = $$0.l();
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
   public void a(bto $$0, float $$1) {
      cob $$2 = new cob(this.dP(), this, new cuo(cur.vP));
      double $$3 = $$0.du() - this.du();
      double $$4 = $$0.e(0.3333333333333333) - $$2.dw();
      double $$5 = $$0.dA() - this.dA();
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      $$2.c($$3, $$4 + $$6 * 0.2F, $$5, 1.6F, (float)(14 - this.dP().al().a() * 4));
      this.a(avz.hJ, 1.0F, 1.0F / (this.el().i() * 0.4F + 0.8F));
      this.dP().b($$2);
   }

   public void w(boolean $$0) {
      this.cb = $$0;
   }

   static class a extends ccb {
      private final cjq b;

      public a(cjq $$0, double $$1, boolean $$2) {
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

   static class b extends caz {
      private final cjq g;

      public b(cjq $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.g.dP().R() && this.g.be() && this.g.dw() >= (double)(this.g.dP().z_() - 3);
      }

      @Override
      public boolean b() {
         return super.b();
      }

      @Override
      protected boolean a(dca $$0, iz $$1) {
         iz $$2 = $$1.c();
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

   static class c extends cam {
      private final btx a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final dbx f;

      public c(btx $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dP();
         this.a(EnumSet.of(cam.a.a));
      }

      @Override
      public boolean a() {
         if (!this.f.R()) {
            return false;
         } else if (this.a.be()) {
            return false;
         } else {
            evq $$0 = this.h();
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
      private evq h() {
         azg $$0 = this.a.el();
         iz $$1 = this.a.dp();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            iz $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dfa.G)) {
               return evq.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends bzp {
      private final cjq l;

      public d(cjq $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bto $$0 = this.l.p();
         if (this.l.gA() && this.l.be()) {
            if ($$0 != null && $$0.dw() > this.l.dw() || this.l.cb) {
               this.l.h(this.l.ds().b(0.0, 0.002, 0.0));
            }

            if (this.k != bzp.a.b || this.l.K().l()) {
               this.l.y(0.0F);
               return;
            }

            double $$1 = this.e - this.l.du();
            double $$2 = this.f - this.l.dw();
            double $$3 = this.g - this.l.dA();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(ayy.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dF(), $$5, 90.0F));
            this.l.aY = this.l.dF();
            float $$6 = (float)(this.h * this.l.g(buw.r));
            float $$7 = ayy.i(0.125F, this.l.fn(), $$6);
            this.l.y($$7);
            this.l.h(this.l.ds().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aE()) {
               this.l.h(this.l.ds().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends cam {
      private final cjq a;
      private final double b;
      private final int c;
      private boolean d;

      public e(cjq $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean a() {
         return !this.a.dP().R() && this.a.be() && this.a.dw() < (double)(this.c - 2);
      }

      @Override
      public boolean b() {
         return this.a() && !this.d;
      }

      @Override
      public void e() {
         if (this.a.dw() < (double)(this.c - 1) && (this.a.K().l() || this.a.gt())) {
            evq $$0 = cej.a(this.a, 4, 8, new evq(this.a.du(), (double)(this.c - 1), this.a.dA()), (float) (Math.PI / 2));
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

   static class f extends cbl {
      private final cjq a;

      public f(ckg $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (cjq)$$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.a.eX().a(cur.vP);
      }

      @Override
      public void c() {
         super.c();
         this.a.v(true);
         this.a.c(bqs.a);
      }

      @Override
      public void d() {
         super.d();
         this.a.fB();
         this.a.v(false);
      }
   }
}
