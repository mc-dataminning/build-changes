import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfm extends cgg {
   private static final ajw<jd> d = aka.a(cfm.class, ajy.o);
   private static final ajw<Boolean> e = aka.a(cfm.class, ajy.k);
   private static final ajw<Integer> ca = aka.a(cfm.class, ajy.b);
   static final cef cb = cef.b().a(10.0).d();
   public static final int b = 4800;
   private static final int cc = 2400;
   public static final Predicate<cjh> c = $$0 -> !$$0.y() && $$0.bE() && $$0.bf();

   public cfm(bsx<? extends cfm> $$0, dcw $$1) {
      super($$0, $$1);
      this.bR = new bzr(this, 85, 10, 0.02F, 0.1F, true);
      this.bQ = new bzq(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      this.j(this.cl());
      this.u(0.0F);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(int $$0) {
   }

   public void h(jd $$0) {
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
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(d, jd.c);
      $$0.a(e, false);
      $$0.a(ca, 2400);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.s().u());
      $$0.a("TreasurePosY", this.s().v());
      $$0.a("TreasurePosZ", this.s().w());
      $$0.a("GotFish", this.t());
      $$0.a("Moistness", this.x());
   }

   @Override
   public void a(ub $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.h(new jd($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("GotFish"));
      this.c($$0.h("Moistness"));
   }

   @Override
   protected void B() {
      this.bU.a(0, new bzx(this));
      this.bU.a(0, new cbw(this));
      this.bU.a(1, new cfm.a(this));
      this.bU.a(2, new cfm.b(this, 4.0));
      this.bU.a(4, new cbk(this, 1.0, 10));
      this.bU.a(4, new cbh(this));
      this.bU.a(5, new cau(this, cmx.class, 6.0F));
      this.bU.a(5, new cac(this, 10));
      this.bU.a(6, new caw(this, 1.2F, true));
      this.bU.a(8, new cfm.c());
      this.bU.a(8, new cah(this));
      this.bU.a(9, new bzt<>(this, cjz.class, 8.0F, 1.0, 1.0));
      this.bV.a(1, new cce(this, cjz.class).a());
   }

   public static buv.a gl() {
      return btp.C().a(buw.s, 10.0).a(buw.v, 1.2F).a(buw.c, 3.0);
   }

   @Override
   protected cda b(dcw $$0) {
      return new cdc(this, $$0);
   }

   @Override
   public void ge() {
      this.a(avp.gX, 1.0F, 1.0F);
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
   public int ac() {
      return 1;
   }

   @Override
   public int ae() {
      return 1;
   }

   @Override
   protected boolean o(bsr $$0) {
      return true;
   }

   @Override
   public boolean f(cuq $$0) {
      bsy $$1 = this.h($$0);
      return !this.a($$1).e() ? false : $$1 == bsy.a && super.f($$0);
   }

   @Override
   protected void b(cjh $$0) {
      if (this.a(bsy.a).e()) {
         cuq $$1 = $$0.p();
         if (this.j($$1)) {
            this.a($$0);
            this.a(bsy.a, $$1);
            this.e(bsy.a);
            this.a($$0, $$1.H());
            $$0.aq();
         }
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.ga()) {
         this.j(this.cl());
      } else {
         if (this.bh()) {
            this.c(2400);
         } else {
            this.c(this.x() - 1);
            if (this.x() <= 0) {
               this.a(this.dQ().s(), 1.0F);
            }

            if (this.aF()) {
               this.i(this.ds().b((double)((this.ah.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ah.i() * 2.0F - 1.0F) * 0.2F)));
               this.t(this.ah.i() * 360.0F);
               this.d(false);
               this.av = true;
            }
         }

         if (this.dP().B && this.bf() && this.ds().g() > 0.03) {
            exa $$0 = this.g(0.0F);
            float $$1 = ayo.b(this.dF() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = ayo.a(this.dF() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ah.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dP()
                  .a(lm.as, this.du() - $$0.c * (double)$$3 + (double)$$1, this.dw() - $$0.d, this.dA() - $$0.e * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dP()
                  .a(lm.as, this.du() - $$0.c * (double)$$3 - (double)$$1, this.dw() - $$0.d, this.dA() - $$0.e * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
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
         this.dP().a($$0, this.d(1.0), this.dx() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bqr b(cmx $$0, bqq $$1) {
      cuq $$2 = $$0.b($$1);
      if (!$$2.e() && $$2.a(awn.aP)) {
         if (!this.dP().B) {
            this.a(avp.gZ, 1.0F, 1.0F);
         }

         this.w(true);
         $$2.a(1, $$0);
         return bqr.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected avo d(brk $$0) {
      return avp.ha;
   }

   @Nullable
   @Override
   protected avo n_() {
      return avp.gY;
   }

   @Nullable
   @Override
   protected avo v() {
      return this.bf() ? avp.gW : avp.gV;
   }

   @Override
   protected avo aR() {
      return avp.hd;
   }

   @Override
   protected avo aQ() {
      return avp.he;
   }

   protected boolean gm() {
      jd $$0 = this.N().h();
      return $$0 != null ? $$0.a(this.dn(), 12.0) : false;
   }

   @Override
   public void a(exa $$0) {
      if (this.dc() && this.bf()) {
         this.a(this.fk(), $$0);
         this.a(bts.a, this.ds());
         this.i(this.ds().a(0.9));
         if (this.p() == null) {
            this.i(this.ds().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean y() {
      return true;
   }

   static class a extends cam {
      private final cfm a;
      private boolean b;

      a(cfm $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cam.a.a, cam.a.b));
      }

      @Override
      public boolean U_() {
         return false;
      }

      @Override
      public boolean b() {
         return this.a.t() && this.a.cm() >= 100;
      }

      @Override
      public boolean c() {
         jd $$0 = this.a.s();
         return !jd.a((double)$$0.u(), this.a.dw(), (double)$$0.w()).a(this.a.dn(), 4.0) && !this.b && this.a.cm() >= 100;
      }

      @Override
      public void d() {
         if (this.a.dP() instanceof aqu) {
            aqu $$0 = (aqu)this.a.dP();
            this.b = false;
            this.a.N().n();
            jd $$1 = this.a.dp();
            jd $$2 = $$0.a(awq.b, $$1, 50, false);
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
         jd $$0 = this.a.s();
         if (jd.a((double)$$0.u(), this.a.dw(), (double)$$0.w()).a(this.a.dn(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void a() {
         dcw $$0 = this.a.dP();
         if (this.a.gm() || this.a.N().l()) {
            exa $$1 = exa.b(this.a.s());
            exa $$2 = cej.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = cej.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               jd $$3 = jd.a((jw)$$2);
               if (!$$0.b_($$3).a(awk.a) || !$$0.a_($$3).a(epr.b)) {
                  $$2 = cej.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.I().a($$2.c, $$2.d, $$2.e, (float)(this.a.ae() + 20), (float)this.a.ac());
            this.a.N().a($$2.c, $$2.d, $$2.e, 1.3);
            if ($$0.z.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }
      }
   }

   static class b extends cam {
      private final cfm a;
      private final double b;
      @Nullable
      private cmx c;

      b(cfm $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(cam.a.a, cam.a.b));
      }

      @Override
      public boolean b() {
         this.c = this.a.dP().a(cfm.cb, this.a);
         return this.c == null ? false : this.c.cd() && this.a.p() != this.c;
      }

      @Override
      public boolean c() {
         return this.c != null && this.c.cd() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void d() {
         this.c.b(new brz(bsb.D, 100), this.a);
      }

      @Override
      public void e() {
         this.c = null;
         this.a.N().n();
      }

      @Override
      public void a() {
         this.a.I().a(this.c, (float)(this.a.ae() + 20), (float)this.a.ac());
         if (this.a.g(this.c) < 6.25) {
            this.a.N().n();
         } else {
            this.a.N().a(this.c, this.b);
         }

         if (this.c.cd() && this.c.dP().z.a(6) == 0) {
            this.c.b(new brz(bsb.D, 100), this.a);
         }
      }
   }

   class c extends cam {
      private int b;

      @Override
      public boolean b() {
         if (this.b > cfm.this.ai) {
            return false;
         } else {
            List<cjh> $$0 = cfm.this.dP().a(cjh.class, cfm.this.cL().c(8.0, 8.0, 8.0), cfm.c);
            return !$$0.isEmpty() || !cfm.this.a(bsy.a).e();
         }
      }

      @Override
      public void d() {
         List<cjh> $$0 = cfm.this.dP().a(cjh.class, cfm.this.cL().c(8.0, 8.0, 8.0), cfm.c);
         if (!$$0.isEmpty()) {
            cfm.this.N().a($$0.get(0), 1.2F);
            cfm.this.a(avp.hc, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cuq $$0 = cfm.this.a(bsy.a);
         if (!$$0.e()) {
            this.a($$0);
            cfm.this.a(bsy.a, cuq.l);
            this.b = cfm.this.ai + cfm.this.ah.a(100);
         }
      }

      @Override
      public void a() {
         List<cjh> $$0 = cfm.this.dP().a(cjh.class, cfm.this.cL().c(8.0, 8.0, 8.0), cfm.c);
         cuq $$1 = cfm.this.a(bsy.a);
         if (!$$1.e()) {
            this.a($$1);
            cfm.this.a(bsy.a, cuq.l);
         } else if (!$$0.isEmpty()) {
            cfm.this.N().a($$0.get(0), 1.2F);
         }
      }

      private void a(cuq $$0) {
         if (!$$0.e()) {
            double $$1 = cfm.this.dy() - 0.3F;
            cjh $$2 = new cjh(cfm.this.dP(), cfm.this.du(), $$1, cfm.this.dA(), $$0);
            $$2.b(40);
            $$2.b(cfm.this);
            float $$3 = 0.3F;
            float $$4 = cfm.this.ah.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * cfm.this.ah.i();
            $$2.n(
               (double)(0.3F * -ayo.a(cfm.this.dF() * (float) (Math.PI / 180.0)) * ayo.b(cfm.this.dH() * (float) (Math.PI / 180.0)) + ayo.b($$4) * $$5),
               (double)(0.3F * ayo.a(cfm.this.dH() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * ayo.b(cfm.this.dF() * (float) (Math.PI / 180.0)) * ayo.b(cfm.this.dH() * (float) (Math.PI / 180.0)) + ayo.a($$4) * $$5)
            );
            cfm.this.dP().b($$2);
         }
      }
   }
}
