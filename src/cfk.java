import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfk extends cge {
   private static final ajv<jd> d = ajz.a(cfk.class, ajx.o);
   private static final ajv<Boolean> e = ajz.a(cfk.class, ajx.k);
   private static final ajv<Integer> ca = ajz.a(cfk.class, ajx.b);
   static final ced cb = ced.b().a(10.0).d();
   public static final int b = 4800;
   private static final int cc = 2400;
   public static final Predicate<cjf> c = $$0 -> !$$0.y() && $$0.bE() && $$0.bf();

   public cfk(bsw<? extends cfk> $$0, dcu $$1) {
      super($$0, $$1);
      this.bR = new bzp(this, 85, 10, 0.02F, 0.1F, true);
      this.bQ = new bzo(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      this.j(this.cl());
      this.t(0.0F);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(int $$0) {
   }

   public void g(jd $$0) {
      this.ao.a(d, $$0);
   }

   public jd s() {
      return this.ao.a(d);
   }

   public boolean t() {
      return this.ao.a(e);
   }

   public void w(boolean $$0) {
      this.ao.a(e, $$0);
   }

   public int x() {
      return this.ao.a(ca);
   }

   public void c(int $$0) {
      this.ao.a(ca, $$0);
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(d, jd.c);
      $$0.a(e, false);
      $$0.a(ca, 2400);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.s().u());
      $$0.a("TreasurePosY", this.s().v());
      $$0.a("TreasurePosZ", this.s().w());
      $$0.a("GotFish", this.t());
      $$0.a("Moistness", this.x());
   }

   @Override
   public void a(ua $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.g(new jd($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("GotFish"));
      this.c($$0.h("Moistness"));
   }

   @Override
   protected void z() {
      this.bU.a(0, new bzv(this));
      this.bU.a(0, new cbu(this));
      this.bU.a(1, new cfk.a(this));
      this.bU.a(2, new cfk.b(this, 4.0));
      this.bU.a(4, new cbi(this, 1.0, 10));
      this.bU.a(4, new cbf(this));
      this.bU.a(5, new cas(this, cmv.class, 6.0F));
      this.bU.a(5, new caa(this, 10));
      this.bU.a(6, new cau(this, 1.2F, true));
      this.bU.a(8, new cfk.c());
      this.bU.a(8, new caf(this));
      this.bU.a(9, new bzr<>(this, cjx.class, 8.0F, 1.0, 1.0));
      this.bV.a(1, new ccc(this, cjx.class).a());
   }

   public static but.a gm() {
      return btn.A().a(buu.s, 10.0).a(buu.v, 1.2F).a(buu.c, 3.0);
   }

   @Override
   protected ccy b(dcu $$0) {
      return new cda(this, $$0);
   }

   @Override
   public void gf() {
      this.a(avo.gX, 1.0F, 1.0F);
   }

   @Override
   public int cl() {
      return 4800;
   }

   @Override
   protected int n(int $$0) {
      return this.cl();
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
   protected boolean o(bsq $$0) {
      return true;
   }

   @Override
   public boolean f(cuo $$0) {
      bsx $$1 = this.h($$0);
      return !this.a($$1).e() ? false : $$1 == bsx.a && super.f($$0);
   }

   @Override
   protected void b(cjf $$0) {
      if (this.a(bsx.a).e()) {
         cuo $$1 = $$0.p();
         if (this.j($$1)) {
            this.a($$0);
            this.a(bsx.a, $$1);
            this.e(bsx.a);
            this.a($$0, $$1.H());
            $$0.aq();
         }
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.gb()) {
         this.j(this.cl());
      } else {
         if (this.bh()) {
            this.c(2400);
         } else {
            this.c(this.x() - 1);
            if (this.x() <= 0) {
               this.a(this.dR().s(), 1.0F);
            }

            if (this.aF()) {
               this.i(this.dt().b((double)((this.ah.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ah.i() * 2.0F - 1.0F) * 0.2F)));
               this.s(this.ah.i() * 360.0F);
               this.e(false);
               this.av = true;
            }
         }

         if (this.dQ().B && this.bf() && this.dt().g() > 0.03) {
            eww $$0 = this.g(0.0F);
            float $$1 = ayn.b(this.dG() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = ayn.a(this.dG() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ah.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dQ()
                  .a(lm.as, this.dv() - $$0.c * (double)$$3 + (double)$$1, this.dx() - $$0.d, this.dB() - $$0.e * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dQ()
                  .a(lm.as, this.dv() - $$0.c * (double)$$3 - (double)$$1, this.dx() - $$0.d, this.dB() - $$0.e * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(lm.O);
      } else {
         super.b($$0);
      }
   }

   private void a(lk $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ah.k() * 0.01;
         double $$3 = this.ah.k() * 0.01;
         double $$4 = this.ah.k() * 0.01;
         this.dQ().a($$0, this.d(1.0), this.dy() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bqq b(cmv $$0, bqp $$1) {
      cuo $$2 = $$0.b($$1);
      if (!$$2.e() && $$2.a(awm.aP)) {
         if (!this.dQ().B) {
            this.a(avo.gZ, 1.0F, 1.0F);
         }

         this.w(true);
         $$2.a(1, $$0);
         return bqq.a(this.dQ().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected avn d(brj $$0) {
      return avo.ha;
   }

   @Nullable
   @Override
   protected avn n_() {
      return avo.gY;
   }

   @Nullable
   @Override
   protected avn v() {
      return this.bf() ? avo.gW : avo.gV;
   }

   @Override
   protected avn aR() {
      return avo.hd;
   }

   @Override
   protected avn aQ() {
      return avo.he;
   }

   protected boolean gn() {
      jd $$0 = this.J().h();
      return $$0 != null ? $$0.a(this.do(), 12.0) : false;
   }

   @Override
   public void a(eww $$0) {
      if (this.dc() && this.bf()) {
         this.a(this.fk(), $$0);
         this.a(btq.a, this.dt());
         this.i(this.dt().a(0.9));
         if (this.p() == null) {
            this.i(this.dt().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(cmv $$0) {
      return true;
   }

   static class a extends cak {
      private final cfk a;
      private boolean b;

      a(cfk $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cak.a.a, cak.a.b));
      }

      @Override
      public boolean Q_() {
         return false;
      }

      @Override
      public boolean b() {
         return this.a.t() && this.a.cm() >= 100;
      }

      @Override
      public boolean c() {
         jd $$0 = this.a.s();
         return !jd.a((double)$$0.u(), this.a.dx(), (double)$$0.w()).a(this.a.do(), 4.0) && !this.b && this.a.cm() >= 100;
      }

      @Override
      public void d() {
         if (this.a.dQ() instanceof aqt) {
            aqt $$0 = (aqt)this.a.dQ();
            this.b = false;
            this.a.J().n();
            jd $$1 = this.a.dq();
            jd $$2 = $$0.a(awp.b, $$1, 50, false);
            if ($$2 != null) {
               this.a.g($$2);
               $$0.a(this.a, (byte)38);
            } else {
               this.b = true;
            }
         }
      }

      @Override
      public void e() {
         jd $$0 = this.a.s();
         if (jd.a((double)$$0.u(), this.a.dx(), (double)$$0.w()).a(this.a.do(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void a() {
         dcu $$0 = this.a.dQ();
         if (this.a.gn() || this.a.J().l()) {
            eww $$1 = eww.b(this.a.s());
            eww $$2 = ceh.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = ceh.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               jd $$3 = jd.a((jw)$$2);
               if (!$$0.b_($$3).a(awj.a) || !$$0.a_($$3).a(epn.b)) {
                  $$2 = ceh.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.F().a($$2.c, $$2.d, $$2.e, (float)(this.a.ab() + 20), (float)this.a.aa());
            this.a.J().a($$2.c, $$2.d, $$2.e, 1.3);
            if ($$0.z.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }
      }
   }

   static class b extends cak {
      private final cfk a;
      private final double b;
      @Nullable
      private cmv c;

      b(cfk $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(cak.a.a, cak.a.b));
      }

      @Override
      public boolean b() {
         this.c = this.a.dQ().a(cfk.cb, this.a);
         return this.c == null ? false : this.c.cd() && this.a.p() != this.c;
      }

      @Override
      public boolean c() {
         return this.c != null && this.c.cd() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void d() {
         this.c.b(new bry(bsa.D, 100), this.a);
      }

      @Override
      public void e() {
         this.c = null;
         this.a.J().n();
      }

      @Override
      public void a() {
         this.a.F().a(this.c, (float)(this.a.ab() + 20), (float)this.a.aa());
         if (this.a.g(this.c) < 6.25) {
            this.a.J().n();
         } else {
            this.a.J().a(this.c, this.b);
         }

         if (this.c.cd() && this.c.dQ().z.a(6) == 0) {
            this.c.b(new bry(bsa.D, 100), this.a);
         }
      }
   }

   class c extends cak {
      private int b;

      @Override
      public boolean b() {
         if (this.b > cfk.this.ai) {
            return false;
         } else {
            List<cjf> $$0 = cfk.this.dQ().a(cjf.class, cfk.this.cL().c(8.0, 8.0, 8.0), cfk.c);
            return !$$0.isEmpty() || !cfk.this.a(bsx.a).e();
         }
      }

      @Override
      public void d() {
         List<cjf> $$0 = cfk.this.dQ().a(cjf.class, cfk.this.cL().c(8.0, 8.0, 8.0), cfk.c);
         if (!$$0.isEmpty()) {
            cfk.this.J().a($$0.get(0), 1.2F);
            cfk.this.a(avo.hc, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cuo $$0 = cfk.this.a(bsx.a);
         if (!$$0.e()) {
            this.a($$0);
            cfk.this.a(bsx.a, cuo.l);
            this.b = cfk.this.ai + cfk.this.ah.a(100);
         }
      }

      @Override
      public void a() {
         List<cjf> $$0 = cfk.this.dQ().a(cjf.class, cfk.this.cL().c(8.0, 8.0, 8.0), cfk.c);
         cuo $$1 = cfk.this.a(bsx.a);
         if (!$$1.e()) {
            this.a($$1);
            cfk.this.a(bsx.a, cuo.l);
         } else if (!$$0.isEmpty()) {
            cfk.this.J().a($$0.get(0), 1.2F);
         }
      }

      private void a(cuo $$0) {
         if (!$$0.e()) {
            double $$1 = cfk.this.dz() - 0.3F;
            cjf $$2 = new cjf(cfk.this.dQ(), cfk.this.dv(), $$1, cfk.this.dB(), $$0);
            $$2.b(40);
            $$2.b(cfk.this);
            float $$3 = 0.3F;
            float $$4 = cfk.this.ah.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * cfk.this.ah.i();
            $$2.n(
               (double)(0.3F * -ayn.a(cfk.this.dG() * (float) (Math.PI / 180.0)) * ayn.b(cfk.this.dI() * (float) (Math.PI / 180.0)) + ayn.b($$4) * $$5),
               (double)(0.3F * ayn.a(cfk.this.dI() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * ayn.b(cfk.this.dG() * (float) (Math.PI / 180.0)) * ayn.b(cfk.this.dI() * (float) (Math.PI / 180.0)) + ayn.a($$4) * $$5)
            );
            cfk.this.dQ().b($$2);
         }
      }
   }
}
