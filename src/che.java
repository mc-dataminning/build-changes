import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class che extends cgv {
   private static final ajx<ji> cb = akb.a(che.class, ajz.o);
   private static final ajx<Boolean> cc = akb.a(che.class, ajz.k);
   private static final ajx<Integer> cd = akb.a(che.class, ajz.b);
   static final cfw ce = cfw.b().a(10.0).d();
   public static final int bY = 4800;
   private static final int cf = 2400;
   public static final Predicate<cla> bZ = $$0 -> !$$0.v() && $$0.bL() && $$0.bj();
   public static final float ca = 0.65F;

   public che(buq<? extends che> $$0, dgg $$1) {
      super($$0, $$1);
      this.bP = new cbi(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new cbh(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      this.j(this.cs());
      this.w(0.0F);
      bvy $$4 = Objects.requireNonNullElseGet($$3, () -> new bua.a(0.1F));
      return super.a($$0, $$1, $$2, $$4);
   }

   @Nullable
   public che b(arc $$0, bua $$1) {
      return buq.H.a($$0, bup.e);
   }

   @Override
   public float ej() {
      return this.e_() ? 0.65F : 1.0F;
   }

   @Override
   protected void r(int $$0) {
   }

   public void h(ji $$0) {
      this.al.a(cb, $$0);
   }

   public ji p() {
      return this.al.a(cb);
   }

   public boolean t() {
      return this.al.a(cc);
   }

   public void x(boolean $$0) {
      this.al.a(cc, $$0);
   }

   public int x() {
      return this.al.a(cd);
   }

   public void s(int $$0) {
      this.al.a(cd, $$0);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(cb, ji.c);
      $$0.a(cc, false);
      $$0.a(cd, 2400);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.p().u());
      $$0.a("TreasurePosY", this.p().v());
      $$0.a("TreasurePosZ", this.p().w());
      $$0.a("GotFish", this.t());
      $$0.a("Moistness", this.x());
   }

   @Override
   public void a(tq $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.h(new ji($$1, $$2, $$3));
      super.a($$0);
      this.x($$0.q("GotFish"));
      this.s($$0.h("Moistness"));
   }

   @Override
   protected void B() {
      this.bS.a(0, new cbo(this));
      this.bS.a(0, new cdn(this));
      this.bS.a(1, new che.a(this));
      this.bS.a(2, new che.b(this, 4.0));
      this.bS.a(4, new cdb(this, 1.0, 10));
      this.bS.a(4, new ccy(this));
      this.bS.a(5, new ccl(this, cov.class, 6.0F));
      this.bS.a(5, new cbt(this, 10));
      this.bS.a(6, new ccn(this, 1.2F, true));
      this.bS.a(8, new che.c());
      this.bS.a(8, new cby(this));
      this.bS.a(9, new cbk<>(this, cls.class, 8.0F, 1.0, 1.0));
      this.bT.a(1, new cdv(this, cls.class).a());
   }

   public static bwm.a gp() {
      return bvh.C().a(bwn.s, 10.0).a(bwn.v, 1.2F).a(bwn.c, 3.0);
   }

   @Override
   protected cer b(dgg $$0) {
      return new cet(this, $$0);
   }

   @Override
   public void gg() {
      this.a(avz.hs, 1.0F, 1.0F);
   }

   @Override
   public boolean c(bvf $$0) {
      return !this.e_() && super.c($$0);
   }

   @Override
   public int cs() {
      return 4800;
   }

   @Override
   protected int m(int $$0) {
      return this.cs();
   }

   @Override
   public int aa() {
      return 1;
   }

   @Override
   public int ab() {
      return 1;
   }

   @Override
   protected boolean o(buj $$0) {
      return true;
   }

   @Override
   protected boolean f(bur $$0) {
      return $$0 == bur.a && this.fN();
   }

   @Override
   protected void a(arc $$0, cla $$1) {
      if (this.a(bur.a).f()) {
         cwn $$2 = $$1.l();
         if (this.g($$2)) {
            this.a($$1);
            this.a(bur.a, $$2);
            this.g(bur.a);
            this.a($$1, $$2.M());
            $$1.at();
         }
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.gc()) {
         this.j(this.cs());
      } else {
         if (this.bl()) {
            this.s(2400);
         } else {
            this.s(this.x() - 1);
            if (this.x() <= 0) {
               this.a(this.dX().t(), 1.0F);
            }

            if (this.aJ()) {
               this.h(this.dz().b((double)((this.ae.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ae.i() * 2.0F - 1.0F) * 0.2F)));
               this.v(this.ae.i() * 360.0F);
               this.d(false);
               this.ar = true;
            }
         }

         if (this.dW().C && this.bj() && this.dz().h() > 0.03) {
            fay $$0 = this.g(0.0F);
            float $$1 = ayy.b(this.dM() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = ayy.a(this.dM() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ae.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dW()
                  .a(lt.au, this.dB() - $$0.d * (double)$$3 + (double)$$1, this.dD() - $$0.e, this.dH() - $$0.f * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dW()
                  .a(lt.au, this.dB() - $$0.d * (double)$$3 - (double)$$1, this.dD() - $$0.e, this.dH() - $$0.f * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(lt.P);
      } else {
         super.b($$0);
      }
   }

   private void a(lr $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ae.k() * 0.01;
         double $$3 = this.ae.k() * 0.01;
         double $$4 = this.ae.k() * 0.01;
         this.dW().a($$0, this.d(1.0), this.dE() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bsi b(cov $$0, bsh $$1) {
      cwn $$2 = $$0.b($$1);
      if (!$$2.f() && $$2.a(awx.aT)) {
         if (!this.dW().C) {
            this.a(avz.hu, 1.0F, 1.0F);
         }

         if (this.e_()) {
            $$2.a(1, $$0);
            this.a(d_(-this.b), true);
         } else {
            this.x(true);
            $$2.a(1, $$0);
         }

         return bsi.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.hv;
   }

   @Nullable
   @Override
   protected avy o_() {
      return avz.ht;
   }

   @Nullable
   @Override
   protected avy u() {
      return this.bj() ? avz.hr : avz.hq;
   }

   @Override
   protected avy aW() {
      return avz.hy;
   }

   @Override
   protected avy aV() {
      return avz.hz;
   }

   protected boolean gq() {
      ji $$0 = this.L().g();
      return $$0 != null ? $$0.a(this.du(), 12.0) : false;
   }

   @Override
   public void a_(fay $$0) {
      if (this.di() && this.bj()) {
         this.a(this.fp(), $$0);
         this.a(bvj.a, this.dz());
         this.h(this.dz().c(0.9));
         if (this.O_() == null) {
            this.h(this.dz().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public boolean y() {
      return true;
   }

   static class a extends ccd {
      private final che a;
      private boolean b;

      a(che $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccd.a.a, ccd.a.b));
      }

      @Override
      public boolean U_() {
         return false;
      }

      @Override
      public boolean b() {
         return this.a.t() && this.a.ct() >= 100;
      }

      @Override
      public boolean c() {
         ji $$0 = this.a.p();
         return !ji.a((double)$$0.u(), this.a.dD(), (double)$$0.w()).a(this.a.du(), 4.0) && !this.b && this.a.ct() >= 100;
      }

      @Override
      public void d() {
         if (this.a.dW() instanceof arc) {
            arc $$0 = (arc)this.a.dW();
            this.b = false;
            this.a.L().m();
            ji $$1 = this.a.dw();
            ji $$2 = $$0.a(axa.b, $$1, 50, false);
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
         ji $$0 = this.a.p();
         if (ji.a((double)$$0.u(), this.a.dD(), (double)$$0.w()).a(this.a.du(), 4.0) || this.b) {
            this.a.x(false);
         }
      }

      @Override
      public void a() {
         dgg $$0 = this.a.dW();
         if (this.a.gq() || this.a.L().k()) {
            fay $$1 = fay.b(this.a.p());
            fay $$2 = cga.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = cga.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               ji $$3 = ji.a((kb)$$2);
               if (!$$0.b_($$3).a(awu.a) || !$$0.a_($$3).a(etm.b)) {
                  $$2 = cga.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.H().a($$2.d, $$2.e, $$2.f, (float)(this.a.ab() + 20), (float)this.a.aa());
            this.a.L().a($$2.d, $$2.e, $$2.f, 1.3);
            if ($$0.A.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }
      }
   }

   static class b extends ccd {
      private final che a;
      private final double b;
      @Nullable
      private cov c;

      b(che $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(ccd.a.a, ccd.a.b));
      }

      @Override
      public boolean b() {
         this.c = a(this.a).a(che.ce, this.a);
         return this.c == null ? false : this.c.ck() && this.a.O_() != this.c;
      }

      @Override
      public boolean c() {
         return this.c != null && this.c.ck() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void d() {
         this.c.b(new bto(btq.D, 100), this.a);
      }

      @Override
      public void e() {
         this.c = null;
         this.a.L().m();
      }

      @Override
      public void a() {
         this.a.H().a(this.c, (float)(this.a.ab() + 20), (float)this.a.aa());
         if (this.a.g(this.c) < 6.25) {
            this.a.L().m();
         } else {
            this.a.L().a(this.c, this.b);
         }

         if (this.c.ck() && this.c.dW().A.a(6) == 0) {
            this.c.b(new bto(btq.D, 100), this.a);
         }
      }
   }

   class c extends ccd {
      private int b;

      @Override
      public boolean b() {
         if (this.b > che.this.af) {
            return false;
         } else {
            List<cla> $$0 = che.this.dW().a(cla.class, che.this.cR().c(8.0, 8.0, 8.0), che.bZ);
            return !$$0.isEmpty() || !che.this.a(bur.a).f();
         }
      }

      @Override
      public void d() {
         List<cla> $$0 = che.this.dW().a(cla.class, che.this.cR().c(8.0, 8.0, 8.0), che.bZ);
         if (!$$0.isEmpty()) {
            che.this.L().a($$0.get(0), 1.2F);
            che.this.a(avz.hx, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cwn $$0 = che.this.a(bur.a);
         if (!$$0.f()) {
            this.a($$0);
            che.this.a(bur.a, cwn.j);
            this.b = che.this.af + che.this.ae.a(100);
         }
      }

      @Override
      public void a() {
         List<cla> $$0 = che.this.dW().a(cla.class, che.this.cR().c(8.0, 8.0, 8.0), che.bZ);
         cwn $$1 = che.this.a(bur.a);
         if (!$$1.f()) {
            this.a($$1);
            che.this.a(bur.a, cwn.j);
         } else if (!$$0.isEmpty()) {
            che.this.L().a($$0.get(0), 1.2F);
         }
      }

      private void a(cwn $$0) {
         if (!$$0.f()) {
            double $$1 = che.this.dF() - 0.3F;
            cla $$2 = new cla(che.this.dW(), che.this.dB(), $$1, che.this.dH(), $$0);
            $$2.b(40);
            $$2.b(che.this);
            float $$3 = 0.3F;
            float $$4 = che.this.ae.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * che.this.ae.i();
            $$2.n(
               (double)(0.3F * -ayy.a(che.this.dM() * (float) (Math.PI / 180.0)) * ayy.b(che.this.dO() * (float) (Math.PI / 180.0)) + ayy.b($$4) * $$5),
               (double)(0.3F * ayy.a(che.this.dO() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * ayy.b(che.this.dM() * (float) (Math.PI / 180.0)) * ayy.b(che.this.dO() * (float) (Math.PI / 180.0)) + ayy.a($$4) * $$5)
            );
            che.this.dW().b($$2);
         }
      }
   }
}
