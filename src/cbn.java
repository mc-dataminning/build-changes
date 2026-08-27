import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbn extends cam {
   private static final aii<ib> bY = ail.a(cbn.class, aik.n);
   private static final aii<Boolean> bZ = ail.a(cbn.class, aik.k);
   private static final aii<Boolean> ca = ail.a(cbn.class, aik.k);
   private static final aii<ib> cb = ail.a(cbn.class, aik.n);
   private static final aii<Boolean> cc = ail.a(cbn.class, aik.k);
   private static final aii<Boolean> cd = ail.a(cbn.class, aik.k);
   public static final csp bV = csp.a(czh.bw.l());
   private static final float ce = 0.3F;
   private static final boi cf = bol.bf.n().a(boh.a().a(bog.a, 0.0F, bol.bf.l(), -0.25F)).a(0.3F);
   int cg;
   public static final Predicate<box> bW = $$0 -> $$0.o_() && !$$0.aZ();

   public cbn(bol<? extends cbn> $$0, cwe $$1) {
      super($$0, $$1);
      this.a(eic.j, 0.0F);
      this.a(eic.t, -1.0F);
      this.a(eic.s, -1.0F);
      this.a(eic.r, -1.0F);
      this.bM = new cbn.e(this);
   }

   public void i(ib $$0) {
      this.am.b(bY, $$0);
   }

   ib gl() {
      return this.am.b(bY);
   }

   void j(ib $$0) {
      this.am.b(cb, $$0);
   }

   ib gr() {
      return this.am.b(cb);
   }

   @Override
   public boolean u() {
      return this.am.b(bZ);
   }

   void w(boolean $$0) {
      this.am.b(bZ, $$0);
   }

   public boolean w() {
      return this.am.b(ca);
   }

   void x(boolean $$0) {
      this.cg = $$0 ? 1 : 0;
      this.am.b(ca, $$0);
   }

   boolean gs() {
      return this.am.b(cc);
   }

   void y(boolean $$0) {
      this.am.b(cc, $$0);
   }

   boolean gt() {
      return this.am.b(cd);
   }

   void z(boolean $$0) {
      this.am.b(cd, $$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bY, ib.c);
      this.am.a(bZ, false);
      this.am.a(cb, ib.c);
      this.am.a(cc, false);
      this.am.a(cd, false);
      this.am.a(ca, false);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("HomePosX", this.gl().u());
      $$0.a("HomePosY", this.gl().v());
      $$0.a("HomePosZ", this.gl().w());
      $$0.a("HasEgg", this.u());
      $$0.a("TravelPosX", this.gr().u());
      $$0.a("TravelPosY", this.gr().v());
      $$0.a("TravelPosZ", this.gr().w());
   }

   @Override
   public void a(sy $$0) {
      int $$1 = $$0.h("HomePosX");
      int $$2 = $$0.h("HomePosY");
      int $$3 = $$0.h("HomePosZ");
      this.i(new ib($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("HasEgg"));
      int $$4 = $$0.h("TravelPosX");
      int $$5 = $$0.h("TravelPosY");
      int $$6 = $$0.h("TravelPosZ");
      this.j(new ib($$4, $$5, $$6));
   }

   @Nullable
   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      this.i(this.dj());
      this.j(ib.c);
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bol<cbn> $$0, cwf $$1, bpb $$2, ib $$3, awt $$4) {
      return $$3.v() < $$1.A_() + 4 && dhw.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void B() {
      this.bP.a(0, new cbn.f(this, 1.2));
      this.bP.a(1, new cbn.a(this, 1.0));
      this.bP.a(1, new cbn.d(this, 1.0));
      this.bP.a(2, new bxc(this, 1.1, bV, false));
      this.bP.a(3, new cbn.c(this, 1.0));
      this.bP.a(4, new cbn.b(this, 1.0));
      this.bP.a(7, new cbn.i(this, 1.0));
      this.bP.a(8, new bwc(this, cia.class, 8.0F));
      this.bP.a(9, new cbn.h(this, 1.0, 100));
   }

   public static bqd.a A() {
      return boz.C().a(bqe.n, 30.0).a(bqe.o, 0.25).a(bqe.r, 1.0);
   }

   @Override
   public boolean cw() {
      return false;
   }

   @Override
   public int Q() {
      return 200;
   }

   @Nullable
   @Override
   protected ato y() {
      return !this.aZ() && this.aC() && !this.o_() ? atp.zy : super.y();
   }

   @Override
   protected void e(float $$0) {
      super.e($$0 * 1.5F);
   }

   @Override
   protected ato aN() {
      return atp.zJ;
   }

   @Nullable
   @Override
   protected ato d(bne $$0) {
      return this.o_() ? atp.zF : atp.zE;
   }

   @Nullable
   @Override
   protected ato n_() {
      return this.o_() ? atp.zA : atp.zz;
   }

   @Override
   protected void b(ib $$0, dme $$1) {
      ato $$2 = this.o_() ? atp.zI : atp.zH;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean gm() {
      return super.gm() && !this.u();
   }

   @Override
   protected float aM() {
      return this.Y + 0.15F;
   }

   @Override
   public float dX() {
      return this.o_() ? 0.3F : 1.0F;
   }

   @Override
   protected byi b(cwe $$0) {
      return new cbn.g(this, $$0);
   }

   @Nullable
   @Override
   public boa a(apa $$0, boa $$1) {
      return bol.bf.a((cwe)$$0);
   }

   @Override
   public boolean o(cpq $$0) {
      return $$0.a(czh.bw.l());
   }

   @Override
   public float a(ib $$0, cwh $$1) {
      if (!this.gs() && $$1.b_($$0).a(auj.a)) {
         return 10.0F;
      } else {
         return dhw.a($$1, $$0) ? 10.0F : $$1.w($$0);
      }
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bx() && this.w() && this.cg >= 1 && this.cg % 5 == 0) {
         ib $$0 = this.dj();
         if (dhw.a(this.dJ(), $$0)) {
            this.dJ().c(2001, $$0, czf.i(this.dJ().a_($$0.d())));
            this.b(dqr.u);
         }
      }
   }

   @Override
   protected void m() {
      super.m();
      if (!this.o_() && this.dJ().Z().b(cwa.f)) {
         this.a(cpt.oo, 1);
      }
   }

   @Override
   public void a(eov $$0) {
      if (this.cU() && this.aZ()) {
         this.a(0.1F, $$0);
         this.a(bpc.a, this.dm());
         this.g(this.dm().a(0.9));
         if (this.q() == null && (!this.gs() || !this.gl().a(this.dh(), 20.0))) {
            this.g(this.dm().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(cia $$0) {
      return false;
   }

   @Override
   public void a(apa $$0, bow $$1) {
      this.a(this.dK().b(), Float.MAX_VALUE);
   }

   @Override
   public boi e(bpi $$0) {
      return this.o_() ? cf : super.e($$0);
   }

   static class a extends bvg {
      private final cbn d;

      a(cbn $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.u();
      }

      @Override
      protected void g() {
         apb $$0 = this.a.go();
         if ($$0 == null && this.c.go() != null) {
            $$0 = this.c.go();
         }

         if ($$0 != null) {
            $$0.a(atz.P);
            am.p.a($$0, this.a, this.c, null);
         }

         this.d.w(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gq();
         this.c.gq();
         awt $$1 = this.a.ef();
         if (this.b.Z().b(cwa.f)) {
            this.b.b(new bon(this.b, this.a.do(), this.a.dq(), this.a.du(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends bvu {
      private final cbn a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(cbn $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean a() {
         if (this.a.o_()) {
            return false;
         } else if (this.a.u()) {
            return true;
         } else {
            return this.a.ef().a(b(700)) != 0 ? false : !this.a.gl().a(this.a.dh(), 64.0);
         }
      }

      @Override
      public void c() {
         this.a.y(true);
         this.c = false;
         this.d = 0;
      }

      @Override
      public void d() {
         this.a.y(false);
      }

      @Override
      public boolean b() {
         return !this.a.gl().a(this.a.dh(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void e() {
         ib $$0 = this.a.gl();
         boolean $$1 = $$0.a(this.a.dh(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.N().l()) {
            eov $$2 = eov.c($$0);
            eov $$3 = bzr.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = bzr.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dJ().a_(ib.a($$3)).a(czh.G)) {
               $$3 = bzr.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.N().a($$3.c, $$3.d, $$3.e, this.b);
         }
      }
   }

   static class c extends bwh {
      private static final int g = 1200;
      private final cbn h;

      c(cbn $$0, double $$1) {
         super($$0, $$0.o_() ? 2.0 : $$1, 24);
         this.h = $$0;
         this.f = -1;
      }

      @Override
      public boolean b() {
         return !this.h.aZ() && this.d <= 1200 && this.a(this.h.dJ(), this.e);
      }

      @Override
      public boolean a() {
         if (this.h.o_() && !this.h.aZ()) {
            return super.a();
         } else {
            return !this.h.gs() && !this.h.aZ() && !this.h.u() ? super.a() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(cwh $$0, ib $$1) {
         return $$0.a_($$1).a(czh.G);
      }
   }

   static class d extends bwh {
      private final cbn g;

      d(cbn $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return this.g.u() && this.g.gl().a(this.g.dh(), 9.0) ? super.a() : false;
      }

      @Override
      public boolean b() {
         return super.b() && this.g.u() && this.g.gl().a(this.g.dh(), 9.0);
      }

      @Override
      public void e() {
         super.e();
         ib $$0 = this.g.dj();
         if (!this.g.aZ() && this.m()) {
            if (this.g.cg < 1) {
               this.g.x(true);
            } else if (this.g.cg > this.a(200)) {
               cwe $$1 = this.g.dJ();
               $$1.a(null, $$0, atp.zG, atq.e, 0.3F, 0.9F + $$1.z.i() * 0.2F);
               ib $$2 = this.e.c();
               dme $$3 = czh.mf.o().a(dhw.f, Integer.valueOf(this.g.af.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(dqr.i, $$2, dqr.a.a(this.g, $$3));
               this.g.w(false);
               this.g.x(false);
               this.g.t(600);
            }

            if (this.g.w()) {
               this.g.cg++;
            }
         }
      }

      @Override
      protected boolean a(cwh $$0, ib $$1) {
         return !$$0.u($$1.c()) ? false : dhw.b($$0, $$1);
      }
   }

   static class e extends bux {
      private final cbn l;

      e(cbn $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.aZ()) {
            this.l.g(this.l.dm().b(0.0, 0.005, 0.0));
            if (!this.l.gl().a(this.l.dh(), 16.0)) {
               this.l.w(Math.max(this.l.fh() / 2.0F, 0.08F));
            }

            if (this.l.o_()) {
               this.l.w(Math.max(this.l.fh() / 3.0F, 0.06F));
            }
         } else if (this.l.aC()) {
            this.l.w(Math.max(this.l.fh() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == bux.a.b && !this.l.N().l()) {
            double $$0 = this.e - this.l.do();
            double $$1 = this.f - this.l.dq();
            double $$2 = this.g - this.l.du();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.w(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(awm.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dz(), $$4, 90.0F));
               this.l.aV = this.l.dz();
               float $$5 = (float)(this.h * this.l.g(bqe.o));
               this.l.w(awm.i(0.125F, this.l.fh(), $$5));
               this.l.g(this.l.dm().b(0.0, (double)this.l.fh() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.w(0.0F);
         }
      }
   }

   static class f extends bwn {
      f(cbn $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a() {
         if (!this.h()) {
            return false;
         } else {
            ib $$0 = this.a(this.b.dJ(), this.b, 7);
            if ($$0 != null) {
               this.d = (double)$$0.u();
               this.e = (double)$$0.v();
               this.f = (double)$$0.w();
               return true;
            } else {
               return this.i();
            }
         }
      }
   }

   static class g extends byf {
      g(cbn $$0, cwe $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(ib $$0) {
         if (this.a instanceof cbn $$1 && $$1.gt()) {
            return this.b.a_($$0).a(czh.G);
         }

         return !this.b.a_($$0.d()).i();
      }
   }

   static class h extends bwr {
      private final cbn i;

      h(cbn $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.b.aZ() && !this.i.gs() && !this.i.u() ? super.a() : false;
      }
   }

   static class i extends bvu {
      private final cbn a;
      private final double b;
      private boolean c;

      i(cbn $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean a() {
         return !this.a.gs() && !this.a.u() && this.a.aZ();
      }

      @Override
      public void c() {
         int $$0 = 512;
         int $$1 = 4;
         awt $$2 = this.a.af;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.dq() > (double)(this.a.dJ().A_() - 1)) {
            $$4 = 0;
         }

         ib $$6 = ib.a((double)$$3 + this.a.do(), (double)$$4 + this.a.dq(), (double)$$5 + this.a.du());
         this.a.j($$6);
         this.a.z(true);
         this.c = false;
      }

      @Override
      public void e() {
         if (this.a.N().l()) {
            eov $$0 = eov.c(this.a.gr());
            eov $$1 = bzr.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = bzr.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = awm.a($$1.c);
               int $$3 = awm.a($$1.e);
               int $$4 = 34;
               if (!this.a.dJ().b($$2 - 34, $$3 - 34, $$2 + 34, $$3 + 34)) {
                  $$1 = null;
               }
            }

            if ($$1 == null) {
               this.c = true;
               return;
            }

            this.a.N().a($$1.c, $$1.d, $$1.e, this.b);
         }
      }

      @Override
      public boolean b() {
         return !this.a.N().l() && !this.c && !this.a.gs() && !this.a.gp() && !this.a.u();
      }

      @Override
      public void d() {
         this.a.z(false);
         super.d();
      }
   }
}
