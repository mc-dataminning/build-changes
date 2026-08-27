import java.util.EnumSet;
import javax.annotation.Nullable;

public class cbx extends cdc implements ccn {
   public static final float b = 0.03F;
   boolean bX;
   protected final bvr c;
   protected final bvo d;

   public cbx(blt<? extends cbx> $$0, cti $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.bL = new cbx.d(this);
      this.a(eev.j, 0.0F);
      this.c = new bvr(this, $$1);
      this.d = new bvo(this, $$1);
   }

   @Override
   protected void u() {
      this.bO.a(1, new cbx.c(this, 1.0));
      this.bO.a(2, new cbx.f(this, 1.0, 40, 10.0F));
      this.bO.a(2, new cbx.a(this, 1.0, false));
      this.bO.a(5, new cbx.b(this, 1.0));
      this.bO.a(6, new cbx.e(this, 1.0, this.dM().A_()));
      this.bO.a(7, new bty(this, 1.0));
      this.bP.a(1, new but(this, cbx.class).a(cde.class));
      this.bP.a(2, new buu<>(this, cfb.class, 10, true, false, this::j));
      this.bP.a(3, new buu<>(this, cej.class, false));
      this.bP.a(3, new buu<>(this, bye.class, true));
      this.bP.a(3, new buu<>(this, byz.class, true, false));
      this.bP.a(5, new buu<>(this, byt.class, 10, true, false, byt.bU));
   }

   @Override
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if (this.c(blu.b).b() && $$0.F_().i() < 0.03F) {
         this.a(blu.b, new cmr(cmu.vK));
         this.e(blu.b);
      }

      return $$3;
   }

   public static boolean a(blt<cbx> $$0, ctx $$1, bmj $$2, hx $$3, aup $$4) {
      if (!$$1.b_($$3.d()).a(asg.a) && !bmj.a($$2)) {
         return false;
      } else {
         ih<cuh> $$5 = $$1.t($$3);
         boolean $$6 = $$1.ak() != bjs.a && (bmj.b($$2) || a($$1, $$3, $$4)) && (bmj.a($$2) || $$1.b_($$3).a(asg.a));
         if ($$6 && bmj.a($$2)) {
            return true;
         } else {
            return $$5.a(asa.ap) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         }
      }
   }

   private static boolean a(ctj $$0, hx $$1) {
      return $$1.v() < $$0.A_() - 5;
   }

   @Override
   protected boolean w() {
      return false;
   }

   @Override
   protected arl y() {
      return this.aZ() ? arm.ha : arm.gZ;
   }

   @Override
   protected arl d(bkn $$0) {
      return this.aZ() ? arm.he : arm.hd;
   }

   @Override
   protected arl n_() {
      return this.aZ() ? arm.hc : arm.hb;
   }

   @Override
   protected arl A() {
      return arm.hg;
   }

   @Override
   protected arl aN() {
      return arm.hh;
   }

   @Override
   protected cmr ge() {
      return cmr.f;
   }

   @Override
   protected void a(aup $$0, bjt $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(blu.a, new cmr(cmu.vI));
         } else {
            this.a(blu.a, new cmr(cmu.qS));
         }
      }
   }

   @Override
   protected boolean b(cmr $$0, cmr $$1) {
      if ($$1.a(cmu.vK)) {
         return false;
      } else if ($$1.a(cmu.vI)) {
         return $$0.a(cmu.vI) ? $$0.k() < $$1.k() : false;
      } else {
         return $$0.a(cmu.vI) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gf() {
      return false;
   }

   @Override
   public boolean a(ctl $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable bmf $$0) {
      return $$0 != null ? !this.dM().P() || $$0.aZ() : false;
   }

   @Override
   public boolean cz() {
      return !this.bZ();
   }

   boolean go() {
      if (this.bX) {
         return true;
      } else {
         bmf $$0 = this.q();
         return $$0 != null && $$0.aZ();
      }
   }

   @Override
   public void a(elm $$0) {
      if (this.cX() && this.aZ() && this.go()) {
         this.a(0.01F, $$0);
         this.a(bml.a, this.dp());
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
      eez $$0 = this.N().j();
      if ($$0 != null) {
         hx $$1 = $$0.l();
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
   public void a(bmf $$0, float $$1) {
      cgf $$2 = new cgf(this.dM(), this, new cmr(cmu.vI));
      double $$3 = $$0.dr() - this.dr();
      double $$4 = $$0.e(0.3333333333333333) - $$2.dt();
      double $$5 = $$0.dx() - this.dx();
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      $$2.c($$3, $$4 + $$6 * 0.2F, $$5, 1.6F, (float)(14 - this.dM().ak().a() * 4));
      this.a(arm.hf, 1.0F, 1.0F / (this.eg().i() * 0.4F + 0.8F));
      this.dM().b($$2);
   }

   public void w(boolean $$0) {
      this.bX = $$0;
   }

   static class a extends buq {
      private final cbx b;

      public a(cbx $$0, double $$1, boolean $$2) {
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

   static class b extends bto {
      private final cbx g;

      public b(cbx $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.g.dM().P() && this.g.aZ() && this.g.dt() >= (double)(this.g.dM().A_() - 3);
      }

      @Override
      public boolean b() {
         return super.b();
      }

      @Override
      protected boolean a(ctl $$0, hx $$1) {
         hx $$2 = $$1.c();
         return $$0.u($$2) && $$0.u($$2.c()) ? $$0.a_($$1).a($$0, $$1, this.g) : false;
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

   static class c extends btb {
      private final bmo a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final cti f;

      public c(bmo $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dM();
         this.a(EnumSet.of(btb.a.a));
      }

      @Override
      public boolean a() {
         if (!this.f.P()) {
            return false;
         } else if (this.a.aZ()) {
            return false;
         } else {
            elm $$0 = this.h();
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
      private elm h() {
         aup $$0 = this.a.eg();
         hx $$1 = this.a.dm();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            hx $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(cwl.G)) {
               return elm.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends bse {
      private final cbx l;

      public d(cbx $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bmf $$0 = this.l.q();
         if (this.l.go() && this.l.aZ()) {
            if ($$0 != null && $$0.dt() > this.l.dt() || this.l.bX) {
               this.l.g(this.l.dp().b(0.0, 0.002, 0.0));
            }

            if (this.k != bse.a.b || this.l.N().l()) {
               this.l.w(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dr();
            double $$2 = this.f - this.l.dt();
            double $$3 = this.g - this.l.dx();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(aui.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dC(), $$5, 90.0F));
            this.l.aU = this.l.dC();
            float $$6 = (float)(this.h * this.l.b(bnl.m));
            float $$7 = aui.i(0.125F, this.l.ff(), $$6);
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

   static class e extends btb {
      private final cbx a;
      private final double b;
      private final int c;
      private boolean d;

      public e(cbx $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean a() {
         return !this.a.dM().P() && this.a.aZ() && this.a.dt() < (double)(this.c - 2);
      }

      @Override
      public boolean b() {
         return this.a() && !this.d;
      }

      @Override
      public void e() {
         if (this.a.dt() < (double)(this.c - 1) && (this.a.N().l() || this.a.gg())) {
            elm $$0 = bwx.a(this.a, 4, 8, new elm(this.a.dr(), (double)(this.c - 1), this.a.dx()), (float) (Math.PI / 2));
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

   static class f extends bua {
      private final cbx a;

      public f(ccn $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (cbx)$$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.a.eT().a(cmu.vI);
      }

      @Override
      public void c() {
         super.c();
         this.a.v(true);
         this.a.c(bju.a);
      }

      @Override
      public void d() {
         super.d();
         this.a.ft();
         this.a.v(false);
      }
   }
}
