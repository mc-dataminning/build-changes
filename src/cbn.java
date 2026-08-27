import java.util.EnumSet;
import javax.annotation.Nullable;

public class cbn extends ccs implements ccd {
   public static final float b = 0.03F;
   boolean bX;
   protected final bvh c;
   protected final bve d;

   public cbn(blj<? extends cbn> $$0, csy $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.bL = new cbn.d(this);
      this.a(eek.j, 0.0F);
      this.c = new bvh(this, $$1);
      this.d = new bve(this, $$1);
   }

   @Override
   protected void u() {
      this.bO.a(1, new cbn.c(this, 1.0));
      this.bO.a(2, new cbn.f(this, 1.0, 40, 10.0F));
      this.bO.a(2, new cbn.a(this, 1.0, false));
      this.bO.a(5, new cbn.b(this, 1.0));
      this.bO.a(6, new cbn.e(this, 1.0, this.dM().A_()));
      this.bO.a(7, new bto(this, 1.0));
      this.bP.a(1, new buj(this, cbn.class).a(ccu.class));
      this.bP.a(2, new buk<>(this, cer.class, 10, true, false, this::j));
      this.bP.a(3, new buk<>(this, cdz.class, false));
      this.bP.a(3, new buk<>(this, bxu.class, true));
      this.bP.a(3, new buk<>(this, byp.class, true, false));
      this.bP.a(5, new buk<>(this, byj.class, 10, true, false, byj.bU));
   }

   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if (this.c(blk.b).b() && $$0.F_().i() < 0.03F) {
         this.a(blk.b, new cmh(cmk.vK));
         this.e(blk.b);
      }

      return $$3;
   }

   public static boolean a(blj<cbn> $$0, ctn $$1, blz $$2, hv $$3, auf $$4) {
      if (!$$1.b_($$3.d()).a(arw.a) && !blz.a($$2)) {
         return false;
      } else {
         ie<ctx> $$5 = $$1.s($$3);
         boolean $$6 = $$1.aj() != bji.a && (blz.b($$2) || a($$1, $$3, $$4)) && (blz.a($$2) || $$1.b_($$3).a(arw.a));
         if ($$6 && blz.a($$2)) {
            return true;
         } else {
            return $$5.a(arq.ap) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         }
      }
   }

   private static boolean a(csz $$0, hv $$1) {
      return $$1.v() < $$0.A_() - 5;
   }

   @Override
   protected boolean w() {
      return false;
   }

   @Override
   protected arb y() {
      return this.aZ() ? arc.ha : arc.gZ;
   }

   @Override
   protected arb d(bkd $$0) {
      return this.aZ() ? arc.he : arc.hd;
   }

   @Override
   protected arb n_() {
      return this.aZ() ? arc.hc : arc.hb;
   }

   @Override
   protected arb A() {
      return arc.hg;
   }

   @Override
   protected arb aN() {
      return arc.hh;
   }

   @Override
   protected cmh ge() {
      return cmh.f;
   }

   @Override
   protected void a(auf $$0, bjj $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(blk.a, new cmh(cmk.vI));
         } else {
            this.a(blk.a, new cmh(cmk.qS));
         }
      }
   }

   @Override
   protected boolean b(cmh $$0, cmh $$1) {
      if ($$1.a(cmk.vK)) {
         return false;
      } else if ($$1.a(cmk.vI)) {
         return $$0.a(cmk.vI) ? $$0.k() < $$1.k() : false;
      } else {
         return $$0.a(cmk.vI) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gf() {
      return false;
   }

   @Override
   public boolean a(ctb $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable blv $$0) {
      return $$0 != null ? !this.dM().O() || $$0.aZ() : false;
   }

   @Override
   public boolean cz() {
      return !this.bZ();
   }

   boolean go() {
      if (this.bX) {
         return true;
      } else {
         blv $$0 = this.q();
         return $$0 != null && $$0.aZ();
      }
   }

   @Override
   public void a(elb $$0) {
      if (this.cX() && this.aZ() && this.go()) {
         this.a(0.01F, $$0);
         this.a(bmb.a, this.dp());
         this.g(this.dp().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   public void bf() {
      if (!this.dM().B) {
         if (this.cY() && this.aZ() && this.go()) {
            this.bN = this.c;
            this.h(true);
         } else {
            this.bN = this.d;
            this.h(false);
         }
      }
   }

   @Override
   public boolean ca() {
      return this.bZ();
   }

   protected boolean gg() {
      eeo $$0 = this.N().j();
      if ($$0 != null) {
         hv $$1 = $$0.l();
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
   public void a(blv $$0, float $$1) {
      cfv $$2 = new cfv(this.dM(), this, new cmh(cmk.vI));
      double $$3 = $$0.dr() - this.dr();
      double $$4 = $$0.e(0.3333333333333333) - $$2.dt();
      double $$5 = $$0.dx() - this.dx();
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      $$2.c($$3, $$4 + $$6 * 0.2F, $$5, 1.6F, (float)(14 - this.dM().aj().a() * 4));
      this.a(arc.hf, 1.0F, 1.0F / (this.eg().i() * 0.4F + 0.8F));
      this.dM().b($$2);
   }

   public void w(boolean $$0) {
      this.bX = $$0;
   }

   static class a extends bug {
      private final cbn b;

      public a(cbn $$0, double $$1, boolean $$2) {
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

   static class b extends bte {
      private final cbn g;

      public b(cbn $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.g.dM().O() && this.g.aZ() && this.g.dt() >= (double)(this.g.dM().A_() - 3);
      }

      @Override
      public boolean b() {
         return super.b();
      }

      @Override
      protected boolean a(ctb $$0, hv $$1) {
         hv $$2 = $$1.c();
         return $$0.t($$2) && $$0.t($$2.c()) ? $$0.a_($$1).a($$0, $$1, this.g) : false;
      }

      @Override
      public void c() {
         this.g.w(false);
         this.g.bN = this.g.d;
         super.c();
      }

      @Override
      public void d() {
         super.d();
      }
   }

   static class c extends bsr {
      private final bme a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final csy f;

      public c(bme $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dM();
         this.a(EnumSet.of(bsr.a.a));
      }

      @Override
      public boolean a() {
         if (!this.f.O()) {
            return false;
         } else if (this.a.aZ()) {
            return false;
         } else {
            elb $$0 = this.h();
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
      private elb h() {
         auf $$0 = this.a.eg();
         hv $$1 = this.a.dm();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            hv $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(cwb.G)) {
               return elb.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends bru {
      private final cbn l;

      public d(cbn $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         blv $$0 = this.l.q();
         if (this.l.go() && this.l.aZ()) {
            if ($$0 != null && $$0.dt() > this.l.dt() || this.l.bX) {
               this.l.g(this.l.dp().b(0.0, 0.002, 0.0));
            }

            if (this.k != bru.a.b || this.l.N().l()) {
               this.l.w(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dr();
            double $$2 = this.f - this.l.dt();
            double $$3 = this.g - this.l.dx();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(aty.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dC(), $$5, 90.0F));
            this.l.aU = this.l.dC();
            float $$6 = (float)(this.h * this.l.b(bnb.m));
            float $$7 = aty.i(0.125F, this.l.ff(), $$6);
            this.l.w($$7);
            this.l.g(this.l.dp().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aC()) {
               this.l.g(this.l.dp().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends bsr {
      private final cbn a;
      private final double b;
      private final int c;
      private boolean d;

      public e(cbn $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean a() {
         return !this.a.dM().O() && this.a.aZ() && this.a.dt() < (double)(this.c - 2);
      }

      @Override
      public boolean b() {
         return this.a() && !this.d;
      }

      @Override
      public void e() {
         if (this.a.dt() < (double)(this.c - 1) && (this.a.N().l() || this.a.gg())) {
            elb $$0 = bwn.a(this.a, 4, 8, new elb(this.a.dr(), (double)(this.c - 1), this.a.dx()), (float) (Math.PI / 2));
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

   static class f extends btq {
      private final cbn a;

      public f(ccd $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (cbn)$$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.a.eT().a(cmk.vI);
      }

      @Override
      public void c() {
         super.c();
         this.a.v(true);
         this.a.c(bjk.a);
      }

      @Override
      public void d() {
         super.d();
         this.a.ft();
         this.a.v(false);
      }
   }
}
