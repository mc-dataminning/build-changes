import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cff extends buj implements bum<jm<cfg>> {
   public static final double ce = 0.6;
   public static final double cf = 0.8;
   public static final double cg = 1.33;
   private static final ajv<jm<cfg>> ch = ajz.a(cff.class, ajx.x);
   private static final ajv<Boolean> ci = ajz.a(cff.class, ajx.k);
   private static final ajv<Boolean> cj = ajz.a(cff.class, ajx.k);
   private static final ajv<Integer> ck = ajz.a(cff.class, ajx.b);
   private static final akp<cfg> cl = cfg.c;
   @Nullable
   private cff.a<cmv> cm;
   @Nullable
   private cbs cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   private float cs;
   private float ct;

   public cff(bsw<? extends cff> $$0, dcu $$1) {
      super($$0, $$1);
      this.gC();
   }

   public akq gw() {
      return this.gx().a().a();
   }

   @Override
   protected void z() {
      this.cn = new cff.c(this, 0.6, $$0 -> $$0.a(awm.ae), true);
      this.bU.a(1, new cae(this));
      this.bU.a(1, new buj.a(1.5));
      this.bU.a(2, new cbp(this));
      this.bU.a(3, new cff.b(this));
      this.bU.a(4, this.cn);
      this.bU.a(5, new bzx(this, 1.1, 8));
      this.bU.a(6, new cai(this, 1.0, 10.0F, 5.0F));
      this.bU.a(7, new bzy(this, 0.8));
      this.bU.a(8, new caq(this, 0.3F));
      this.bU.a(9, new cba(this));
      this.bU.a(10, new bzw(this, 0.8));
      this.bU.a(11, new cbx(this, 0.8, 1.0000001E-5F));
      this.bU.a(12, new cas(this, cmv.class, 10.0F));
      this.bV.a(1, new ccg<>(this, cfw.class, false, null));
      this.bV.a(1, new ccg<>(this, cgd.class, false, cgd.ca));
   }

   public jm<cfg> gx() {
      return this.ao.a(ch);
   }

   @Override
   public void i(jm<cfg> $$0) {
      this.ao.a(ch, $$0);
   }

   public void z(boolean $$0) {
      this.ao.a(ci, $$0);
   }

   public boolean gy() {
      return this.ao.a(ci);
   }

   void A(boolean $$0) {
      this.ao.a(cj, $$0);
   }

   boolean gD() {
      return this.ao.a(cj);
   }

   public ctg gz() {
      return ctg.a(this.ao.a(ck));
   }

   private void a(ctg $$0) {
      this.ao.a(ck, $$0.a());
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(ch, lt.ai.g(cl));
      $$0.a(ci, false);
      $$0.a(cj, false);
      $$0.a(ck, ctg.o.a());
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("variant", this.gx().e().orElse(cl).a().toString());
      $$0.a("CollarColor", (byte)this.gz().a());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      Optional.ofNullable(akq.c($$0.l("variant"))).map($$0x -> akp.a(lu.l, $$0x)).flatMap(lt.ai::b).ifPresent(this::i);
      if ($$0.b("CollarColor", 99)) {
         this.a(ctg.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void Z() {
      if (this.H().b()) {
         double $$0 = this.H().c();
         if ($$0 == 0.6) {
            this.b(bty.f);
            this.i(false);
         } else if ($$0 == 1.33) {
            this.b(bty.a);
            this.i(true);
         } else {
            this.b(bty.a);
            this.i(false);
         }
      } else {
         this.b(bty.a);
         this.i(false);
      }
   }

   @Nullable
   @Override
   protected avn v() {
      if (this.s()) {
         if (this.gu()) {
            return avo.dX;
         } else {
            return this.ah.a(4) == 0 ? avo.dY : avo.dQ;
         }
      } else {
         return avo.dR;
      }
   }

   @Override
   public int P() {
      return 120;
   }

   public void gA() {
      this.b(avo.dU);
   }

   @Override
   protected avn d(brj $$0) {
      return avo.dW;
   }

   @Override
   protected avn n_() {
      return avo.dS;
   }

   public static but.a gB() {
      return btn.A().a(buu.s, 10.0).a(buu.v, 0.3F).a(buu.c, 3.0);
   }

   @Override
   protected void a(cmv $$0, bqp $$1, cuo $$2) {
      if (this.o($$2)) {
         this.a(avo.dT, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   public void l() {
      super.l();
      if (this.cn != null && this.cn.i() && !this.s() && this.ai % 100 == 0) {
         this.a(avo.dV, 1.0F, 1.0F);
      }

      this.gE();
   }

   private void gE() {
      if ((this.gy() || this.gD()) && this.ai % 5 == 0) {
         this.a(avo.dX, 0.6F + 0.4F * (this.ah.i() - this.ah.i()), 1.0F);
      }

      this.gF();
      this.gG();
   }

   private void gF() {
      this.cp = this.co;
      this.cr = this.cq;
      if (this.gy()) {
         this.co = Math.min(1.0F, this.co + 0.15F);
         this.cq = Math.min(1.0F, this.cq + 0.08F);
      } else {
         this.co = Math.max(0.0F, this.co - 0.22F);
         this.cq = Math.max(0.0F, this.cq - 0.13F);
      }
   }

   private void gG() {
      this.ct = this.cs;
      if (this.gD()) {
         this.cs = Math.min(1.0F, this.cs + 0.1F);
      } else {
         this.cs = Math.max(0.0F, this.cs - 0.13F);
      }
   }

   public float H(float $$0) {
      return ayn.i($$0, this.cp, this.co);
   }

   public float I(float $$0) {
      return ayn.i($$0, this.cr, this.cq);
   }

   public float J(float $$0) {
      return ayn.i($$0, this.ct, this.cs);
   }

   @Nullable
   public cff b(aqt $$0, bsk $$1) {
      cff $$2 = bsw.p.a((dcu)$$0);
      if ($$2 != null && $$1 instanceof cff $$3) {
         if (this.ah.h()) {
            $$2.i(this.gx());
         } else {
            $$2.i($$3.gx());
         }

         if (this.s()) {
            $$2.b(this.W_());
            $$2.b(true, true);
            if (this.ah.h()) {
               $$2.a(this.gz());
            } else {
               $$2.a($$3.gz());
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cfc $$0) {
      if (!this.s()) {
         return false;
      } else {
         return !($$0 instanceof cff $$1) ? false : $$1.s() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      boolean $$4 = $$0.aq() > 0.9F;
      awt<cfg> $$5 = $$4 ? awe.b : awe.a;
      lt.ai.a($$5, $$0.E_()).ifPresent(this::i);
      aqt $$6 = $$0.E();
      if ($$6.a().a(this.dq(), awp.o).b()) {
         this.i(lt.ai.g(cfg.l));
         this.fP();
      }

      return $$3;
   }

   @Override
   public bqq b(cmv $$0, bqp $$1) {
      cuo $$2 = $$0.b($$1);
      cuj $$3 = $$2.g();
      if (this.s()) {
         if (this.j($$0)) {
            if ($$3 instanceof cth $$4) {
               ctg $$5 = $$4.c();
               if ($$5 != this.gz()) {
                  if (!this.dQ().x_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.fP();
                  }

                  return bqq.a(this.dQ().x_());
               }
            } else if (this.o($$2) && this.ex() < this.eO()) {
               if (!this.dQ().x_()) {
                  this.a($$0, $$1, $$2);
                  cpp $$6 = $$2.a(kq.v);
                  this.c($$6 != null ? (float)$$6.b() : 1.0F);
               }

               return bqq.a(this.dQ().x_());
            }

            bqq $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.y(!this.gm());
               return bqq.a(this.dQ().x_());
            }

            return $$7;
         }
      } else if (this.o($$2)) {
         if (!this.dQ().x_()) {
            this.a($$0, $$1, $$2);
            this.h($$0);
            this.fP();
         }

         return bqq.a(this.dQ().x_());
      }

      bqq $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.fP();
      }

      return $$8;
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awm.ae);
   }

   @Override
   public boolean h(double $$0) {
      return !this.s() && this.ai > 2400;
   }

   @Override
   public void b(boolean $$0, boolean $$1) {
      super.b($$0, $$1);
      this.gC();
   }

   protected void gC() {
      if (this.cm == null) {
         this.cm = new cff.a<>(this, cmv.class, 16.0F, 0.8, 1.33);
      }

      this.bU.a(this.cm);
      if (!this.s()) {
         this.bU.a(4, this.cm);
      }
   }

   private void h(cmv $$0) {
      if (this.ah.a(3) == 0) {
         this.f($$0);
         this.y(true);
         this.dQ().a(this, (byte)7);
      } else {
         this.dQ().a(this, (byte)6);
      }
   }

   @Override
   public boolean bX() {
      return this.cb() || super.bX();
   }

   static class a<T extends btl> extends bzr<T> {
      private final cff i;

      public a(cff $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bsv.e::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.i.s() && super.b();
      }

      @Override
      public boolean c() {
         return !this.i.s() && super.c();
      }
   }

   static class b extends cak {
      private final cff a;
      @Nullable
      private cmv b;
      @Nullable
      private jd c;
      private int d;

      public b(cff $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.s()) {
            return false;
         } else if (this.a.gm()) {
            return false;
         } else {
            btl $$0 = this.a.P_();
            if ($$0 instanceof cmv) {
               this.b = (cmv)$$0;
               if (!$$0.fI()) {
                  return false;
               }

               if (this.a.g((bsq)this.b) > 100.0) {
                  return false;
               }

               jd $$1 = this.b.dq();
               dta $$2 = this.a.dQ().a_($$1);
               if ($$2.a(awd.R)) {
                  this.c = $$2.d(dfp.aE).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new jd($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (cff $$1 : this.a.dQ().a(cff.class, new ewr(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gy() || $$1.gD())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean c() {
         return this.a.s() && !this.a.gm() && this.b != null && this.b.fI() && this.c != null && !this.h();
      }

      @Override
      public void d() {
         if (this.c != null) {
            this.a.x(false);
            this.a.J().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
         }
      }

      @Override
      public void e() {
         this.a.z(false);
         float $$0 = this.a.dQ().f(1.0F);
         if (this.b.gd() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dQ().E_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.A(false);
         this.a.J().n();
      }

      private void i() {
         ayv $$0 = this.a.dT();
         jd.a $$1 = new jd.a();
         $$1.g(this.a.fY() ? this.a.ga().dq() : this.a.dq());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dq());
         erq $$2 = this.a.dQ().o().be().b(erh.aG);
         ero $$3 = new ero.a((aqt)this.a.dQ()).a(euh.f, this.a.do()).a(euh.a, this.a).a(eug.j);

         for (cuo $$5 : $$2.a($$3)) {
            this.a
               .dQ()
               .b(
                  new cjf(
                     this.a.dQ(),
                     (double)$$1.u() - (double)ayn.a(this.a.aY * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)ayn.b(this.a.aY * (float) (Math.PI / 180.0)),
                     $$5
                  )
               );
         }
      }

      @Override
      public void a() {
         if (this.b != null && this.c != null) {
            this.a.x(false);
            this.a.J().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
            if (this.a.g((bsq)this.b) < 2.5) {
               this.d++;
               if (this.d > this.a(16)) {
                  this.a.z(true);
                  this.a.A(false);
               } else {
                  this.a.a(this.b, 45.0F, 45.0F);
                  this.a.A(true);
               }
            } else {
               this.a.z(false);
            }
         }
      }
   }

   static class c extends cbs {
      @Nullable
      private cmv c;
      private final cff d;

      public c(cff $$0, double $$1, Predicate<cuo> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void a() {
         super.a();
         if (this.c == null && this.a.dT().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.dT().a(this.a(500)) == 0) {
            this.c = null;
         }
      }

      @Override
      protected boolean h() {
         return this.c != null && this.c.equals(this.b) ? false : super.h();
      }

      @Override
      public boolean b() {
         return super.b() && !this.d.s();
      }
   }
}
