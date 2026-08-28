import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgz extends cgq {
   private static final akl<jh> cb = akp.a(cgz.class, akn.o);
   private static final akl<Boolean> cc = akp.a(cgz.class, akn.k);
   private static final akl<Integer> cd = akp.a(cgz.class, akn.b);
   static final cfr ce = cfr.b().a(10.0).d();
   public static final int bY = 4800;
   private static final int cf = 2400;
   public static final Predicate<ckv> bZ = $$0 -> !$$0.w() && $$0.bM() && $$0.bk();
   public static final float ca = 0.65F;

   public cgz(bul<? extends cgz> $$0, dfb $$1) {
      super($$0, $$1);
      this.bP = new cbd(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new cbc(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      this.j(this.ct());
      this.w(0.0F);
      bvt $$4 = Objects.requireNonNullElseGet($$3, () -> new btv.a(0.1F));
      return super.a($$0, $$1, $$2, $$4);
   }

   @Nullable
   public cgz b(arn $$0, btv $$1) {
      return bul.y.a($$0, buk.e);
   }

   @Override
   public float ek() {
      return this.p_() ? 0.65F : 1.0F;
   }

   @Override
   protected void s(int $$0) {
   }

   public void h(jh $$0) {
      this.am.a(cb, $$0);
   }

   public jh q() {
      return this.am.a(cb);
   }

   public boolean t() {
      return this.am.a(cc);
   }

   public void x(boolean $$0) {
      this.am.a(cc, $$0);
   }

   public int y() {
      return this.am.a(cd);
   }

   public void t(int $$0) {
      this.am.a(cd, $$0);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(cb, jh.c);
      $$0.a(cc, false);
      $$0.a(cd, 2400);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.q().u());
      $$0.a("TreasurePosY", this.q().v());
      $$0.a("TreasurePosZ", this.q().w());
      $$0.a("GotFish", this.t());
      $$0.a("Moistness", this.y());
   }

   @Override
   public void a(uk $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.h(new jh($$1, $$2, $$3));
      super.a($$0);
      this.x($$0.q("GotFish"));
      this.t($$0.h("Moistness"));
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbj(this));
      this.bS.a(0, new cdi(this));
      this.bS.a(1, new cgz.a(this));
      this.bS.a(2, new cgz.b(this, 4.0));
      this.bS.a(4, new ccw(this, 1.0, 10));
      this.bS.a(4, new cct(this));
      this.bS.a(5, new ccg(this, com.class, 6.0F));
      this.bS.a(5, new cbo(this, 10));
      this.bS.a(6, new cci(this, 1.2F, true));
      this.bS.a(8, new cgz.c());
      this.bS.a(8, new cbt(this));
      this.bS.a(9, new cbf<>(this, cln.class, 8.0F, 1.0, 1.0));
      this.bT.a(1, new cdq(this, cln.class).a());
   }

   public static bwh.a gu() {
      return bvc.E().a(bwi.s, 10.0).a(bwi.v, 1.2F).a(bwi.c, 3.0);
   }

   @Override
   protected cem b(dfb $$0) {
      return new ceo(this, $$0);
   }

   @Override
   public void gl() {
      this.a(awl.gY, 1.0F, 1.0F);
   }

   @Override
   public boolean c(bva $$0) {
      return !this.p_() && super.c($$0);
   }

   @Override
   public int ct() {
      return 4800;
   }

   @Override
   protected int n(int $$0) {
      return this.ct();
   }

   @Override
   public int ad() {
      return 1;
   }

   @Override
   public int ae() {
      return 1;
   }

   @Override
   protected boolean o(bue $$0) {
      return true;
   }

   @Override
   protected boolean f(bum $$0) {
      return $$0 == bum.a && this.fP();
   }

   @Override
   protected void b(ckv $$0) {
      if (this.a(bum.a).f()) {
         cwb $$1 = $$0.m();
         if (this.h($$1)) {
            this.a($$0);
            this.a(bum.a, $$1);
            this.g(bum.a);
            this.a($$0, $$1.L());
            $$0.av();
         }
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.gh()) {
         this.j(this.ct());
      } else {
         if (this.bm()) {
            this.t(2400);
         } else {
            this.t(this.y() - 1);
            if (this.y() <= 0) {
               this.a(this.dY().t(), 1.0F);
            }

            if (this.aK()) {
               this.h(this.dA().b((double)((this.af.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.af.i() * 2.0F - 1.0F) * 0.2F)));
               this.v(this.af.i() * 360.0F);
               this.d(false);
               this.as = true;
            }
         }

         if (this.dX().C && this.bk() && this.dA().h() > 0.03) {
            ezn $$0 = this.g(0.0F);
            float $$1 = azk.b(this.dN() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = azk.a(this.dN() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.af.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dX()
                  .a(lr.as, this.dC() - $$0.d * (double)$$3 + (double)$$1, this.dE() - $$0.e, this.dI() - $$0.f * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dX()
                  .a(lr.as, this.dC() - $$0.d * (double)$$3 - (double)$$1, this.dE() - $$0.e, this.dI() - $$0.f * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(lr.O);
      } else {
         super.b($$0);
      }
   }

   private void a(lp $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.af.k() * 0.01;
         double $$3 = this.af.k() * 0.01;
         double $$4 = this.af.k() * 0.01;
         this.dX().a($$0, this.d(1.0), this.dF() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bsd b(com $$0, bsc $$1) {
      cwb $$2 = $$0.b($$1);
      if (!$$2.f() && $$2.a(axj.aT)) {
         if (!this.dX().C) {
            this.a(awl.ha, 1.0F, 1.0F);
         }

         if (this.p_()) {
            $$2.a(1, $$0);
            this.a(d_(-this.c), true);
         } else {
            this.x(true);
            $$2.a(1, $$0);
         }

         return bsd.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.hb;
   }

   @Nullable
   @Override
   protected awk o_() {
      return awl.gZ;
   }

   @Nullable
   @Override
   protected awk w() {
      return this.bk() ? awl.gX : awl.gW;
   }

   @Override
   protected awk aX() {
      return awl.he;
   }

   @Override
   protected awk aW() {
      return awl.hf;
   }

   protected boolean gv() {
      jh $$0 = this.P().i();
      return $$0 != null ? $$0.a(this.dv(), 12.0) : false;
   }

   @Override
   public void a_(ezn $$0) {
      if (this.dj() && this.bk()) {
         this.a(this.fr(), $$0);
         this.a(bve.a, this.dA());
         this.h(this.dA().c(0.9));
         if (this.m() == null) {
            this.h(this.dA().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public boolean A() {
      return true;
   }

   static class a extends cby {
      private final cgz a;
      private boolean b;

      a(cgz $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cby.a.a, cby.a.b));
      }

      @Override
      public boolean U_() {
         return false;
      }

      @Override
      public boolean b() {
         return this.a.t() && this.a.cu() >= 100;
      }

      @Override
      public boolean c() {
         jh $$0 = this.a.q();
         return !jh.a((double)$$0.u(), this.a.dE(), (double)$$0.w()).a(this.a.dv(), 4.0) && !this.b && this.a.cu() >= 100;
      }

      @Override
      public void d() {
         if (this.a.dX() instanceof arn) {
            arn $$0 = (arn)this.a.dX();
            this.b = false;
            this.a.P().o();
            jh $$1 = this.a.dx();
            jh $$2 = $$0.a(axm.b, $$1, 50, false);
            if ($$2 != null) {
               this.a.h($$2);
               $$0.a(this.a, (byte)38);
            } else {
               this.b = true;
            }
         }
      }

      @Override
      public void e() {
         jh $$0 = this.a.q();
         if (jh.a((double)$$0.u(), this.a.dE(), (double)$$0.w()).a(this.a.dv(), 4.0) || this.b) {
            this.a.x(false);
         }
      }

      @Override
      public void a() {
         dfb $$0 = this.a.dX();
         if (this.a.gv() || this.a.P().m()) {
            ezn $$1 = ezn.b(this.a.q());
            ezn $$2 = cfv.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = cfv.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               jh $$3 = jh.a((ka)$$2);
               if (!$$0.b_($$3).a(axg.a) || !$$0.a_($$3).a(erz.b)) {
                  $$2 = cfv.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.K().a($$2.d, $$2.e, $$2.f, (float)(this.a.ae() + 20), (float)this.a.ad());
            this.a.P().a($$2.d, $$2.e, $$2.f, 1.3);
            if ($$0.A.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }
      }
   }

   static class b extends cby {
      private final cgz a;
      private final double b;
      @Nullable
      private com c;

      b(cgz $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(cby.a.a, cby.a.b));
      }

      @Override
      public boolean b() {
         this.c = this.a.dX().a(cgz.ce, this.a);
         return this.c == null ? false : this.c.cl() && this.a.m() != this.c;
      }

      @Override
      public boolean c() {
         return this.c != null && this.c.cl() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void d() {
         this.c.b(new btj(btl.D, 100), this.a);
      }

      @Override
      public void e() {
         this.c = null;
         this.a.P().o();
      }

      @Override
      public void a() {
         this.a.K().a(this.c, (float)(this.a.ae() + 20), (float)this.a.ad());
         if (this.a.g(this.c) < 6.25) {
            this.a.P().o();
         } else {
            this.a.P().a(this.c, this.b);
         }

         if (this.c.cl() && this.c.dX().A.a(6) == 0) {
            this.c.b(new btj(btl.D, 100), this.a);
         }
      }
   }

   class c extends cby {
      private int b;

      @Override
      public boolean b() {
         if (this.b > cgz.this.ag) {
            return false;
         } else {
            List<ckv> $$0 = cgz.this.dX().a(ckv.class, cgz.this.cS().c(8.0, 8.0, 8.0), cgz.bZ);
            return !$$0.isEmpty() || !cgz.this.a(bum.a).f();
         }
      }

      @Override
      public void d() {
         List<ckv> $$0 = cgz.this.dX().a(ckv.class, cgz.this.cS().c(8.0, 8.0, 8.0), cgz.bZ);
         if (!$$0.isEmpty()) {
            cgz.this.P().a($$0.get(0), 1.2F);
            cgz.this.a(awl.hd, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cwb $$0 = cgz.this.a(bum.a);
         if (!$$0.f()) {
            this.a($$0);
            cgz.this.a(bum.a, cwb.k);
            this.b = cgz.this.ag + cgz.this.af.a(100);
         }
      }

      @Override
      public void a() {
         List<ckv> $$0 = cgz.this.dX().a(ckv.class, cgz.this.cS().c(8.0, 8.0, 8.0), cgz.bZ);
         cwb $$1 = cgz.this.a(bum.a);
         if (!$$1.f()) {
            this.a($$1);
            cgz.this.a(bum.a, cwb.k);
         } else if (!$$0.isEmpty()) {
            cgz.this.P().a($$0.get(0), 1.2F);
         }
      }

      private void a(cwb $$0) {
         if (!$$0.f()) {
            double $$1 = cgz.this.dG() - 0.3F;
            ckv $$2 = new ckv(cgz.this.dX(), cgz.this.dC(), $$1, cgz.this.dI(), $$0);
            $$2.b(40);
            $$2.b(cgz.this);
            float $$3 = 0.3F;
            float $$4 = cgz.this.af.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * cgz.this.af.i();
            $$2.n(
               (double)(0.3F * -azk.a(cgz.this.dN() * (float) (Math.PI / 180.0)) * azk.b(cgz.this.dP() * (float) (Math.PI / 180.0)) + azk.b($$4) * $$5),
               (double)(0.3F * azk.a(cgz.this.dP() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * azk.b(cgz.this.dN() * (float) (Math.PI / 180.0)) * azk.b(cgz.this.dP() * (float) (Math.PI / 180.0)) + azk.a($$4) * $$5)
            );
            cgz.this.dX().b($$2);
         }
      }
   }
}
