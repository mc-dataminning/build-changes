import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjz extends ckd {
   protected static final int c = 80;
   private static final ajw<Boolean> b = aka.a(cjz.class, ajy.k);
   private static final ajw<Integer> e = aka.a(cjz.class, ajy.b);
   private float cc;
   private float cd;
   private float ce;
   private float cf;
   private float cg;
   @Nullable
   private btn ch;
   private int ci;
   private boolean cj;
   @Nullable
   protected cbj d;

   public cjz(bsx<? extends cjz> $$0, dcw $$1) {
      super($$0, $$1);
      this.bR = 10;
      this.a(epv.j, 0.0F);
      this.bT = new cjz.c(this);
      this.cc = this.ah.i();
      this.cd = this.cc;
   }

   @Override
   protected void B() {
      cba $$0 = new cba(this, 1.0);
      this.d = new cbj(this, 1.0, 80);
      this.bW.a(4, new cjz.a(this));
      this.bW.a(5, $$0);
      this.bW.a(7, this.d);
      this.bW.a(8, new cau(this, cmx.class, 8.0F));
      this.bW.a(8, new cau(this, cjz.class, 12.0F, 0.01F));
      this.bW.a(9, new cbh(this));
      this.d.a(EnumSet.of(cam.a.a, cam.a.b));
      $$0.a(EnumSet.of(cam.a.a, cam.a.b));
      this.bX.a(1, new ccf<>(this, btn.class, 10, true, false, new cjz.b(this)));
   }

   public static buv.a gk() {
      return ckd.gq().a(buw.c, 6.0).a(buw.v, 0.5).a(buw.m, 16.0).a(buw.s, 30.0);
   }

   @Override
   protected cda b(dcw $$0) {
      return new cdc(this, $$0);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(b, false);
      $$0.a(e, 0);
   }

   public boolean gl() {
      return this.ao.a(b);
   }

   void x(boolean $$0) {
      this.ao.a(b, $$0);
   }

   public int t() {
      return 80;
   }

   void b(int $$0) {
      this.ao.a(e, $$0);
   }

   public boolean gm() {
      return this.ao.a(e) != 0;
   }

   @Nullable
   public btn gn() {
      if (!this.gm()) {
         return null;
      } else if (this.dO().B) {
         if (this.ch != null) {
            return this.ch;
         } else {
            bsr $$0 = this.dO().a(this.ao.a(e));
            if ($$0 instanceof btn) {
               this.ch = (btn)$$0;
               return this.ch;
            } else {
               return null;
            }
         }
      } else {
         return this.p();
      }
   }

   @Override
   public void a(ajw<?> $$0) {
      super.a($$0);
      if (e.equals($$0)) {
         this.ci = 0;
         this.ch = null;
      }
   }

   @Override
   public int R() {
      return 160;
   }

   @Override
   protected avo v() {
      return this.bi() ? avp.lq : avp.lr;
   }

   @Override
   protected avo d(brk $$0) {
      return this.bi() ? avp.lw : avp.lx;
   }

   @Override
   protected avo n_() {
      return this.bi() ? avp.lt : avp.lu;
   }

   @Override
   protected bsr.b bc() {
      return bsr.b.c;
   }

   @Override
   public float a(jd $$0, dcz $$1) {
      return $$1.b_($$0).a(awk.a) ? 10.0F + $$1.w($$0) : super.a($$0, $$1);
   }

   @Override
   public void m_() {
      if (this.bE()) {
         if (this.dO().B) {
            this.cd = this.cc;
            if (!this.bf()) {
               this.ce = 2.0F;
               exc $$0 = this.dr();
               if ($$0.d > 0.0 && this.cj && !this.aX()) {
                  this.dO().a(this.dt(), this.dv(), this.dz(), this.x(), this.de(), 1.0F, 1.0F, false);
               }

               this.cj = $$0.d < 0.0 && this.dO().a(this.do().e(), this);
            } else if (this.gl()) {
               if (this.ce < 0.5F) {
                  this.ce = 4.0F;
               } else {
                  this.ce = this.ce + (0.5F - this.ce) * 0.1F;
               }
            } else {
               this.ce = this.ce + (0.125F - this.ce) * 0.2F;
            }

            this.cc = this.cc + this.ce;
            this.cg = this.cf;
            if (!this.bi()) {
               this.cf = this.ah.i();
            } else if (this.gl()) {
               this.cf = this.cf + (0.0F - this.cf) * 0.25F;
            } else {
               this.cf = this.cf + (1.0F - this.cf) * 0.06F;
            }

            if (this.gl() && this.bf()) {
               exc $$1 = this.g(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dO().a(lm.d, this.d(0.5) - $$1.c * 1.5, this.dw() - $$1.d * 1.5, this.g(0.5) - $$1.e * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.gm()) {
               if (this.ci < this.t()) {
                  this.ci++;
               }

               btn $$3 = this.gn();
               if ($$3 != null) {
                  this.I().a($$3, 90.0F, 90.0F);
                  this.I().a();
                  double $$4 = (double)this.J(0.0F);
                  double $$5 = $$3.dt() - this.dt();
                  double $$6 = $$3.e(0.5) - this.dx();
                  double $$7 = $$3.dz() - this.dz();
                  double $$8 = Math.sqrt($$5 * $$5 + $$6 * $$6 + $$7 * $$7);
                  $$5 /= $$8;
                  $$6 /= $$8;
                  $$7 /= $$8;
                  double $$9 = this.ah.j();

                  while ($$9 < $$8) {
                     $$9 += 1.8 - $$4 + this.ah.j() * (1.7 - $$4);
                     this.dO().a(lm.d, this.dt() + $$5 * $$9, this.dx() + $$6 * $$9, this.dz() + $$7 * $$9, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.bi()) {
            this.j(300);
         } else if (this.aF()) {
            this.i(this.dr().b((double)((this.ah.i() * 2.0F - 1.0F) * 0.4F), 0.5, (double)((this.ah.i() * 2.0F - 1.0F) * 0.4F)));
            this.t(this.ah.i() * 360.0F);
            this.d(false);
            this.av = true;
         }

         if (this.gm()) {
            this.t(this.ba);
         }
      }

      super.m_();
   }

   protected avo x() {
      return avp.lv;
   }

   public float H(float $$0) {
      return ayo.i($$0, this.cd, this.cc);
   }

   public float I(float $$0) {
      return ayo.i($$0, this.cg, this.cf);
   }

   public float J(float $$0) {
      return ((float)this.ci + $$0) / (float)this.t();
   }

   public float go() {
      return (float)this.ci;
   }

   @Override
   public boolean a(dcz $$0) {
      return $$0.f(this);
   }

   public static boolean b(bsx<? extends cjz> $$0, dcx $$1, btr $$2, jd $$3, ayw $$4) {
      return ($$4.a(20) == 0 || !$$1.v($$3)) && $$1.al() != bqo.a && (btr.a($$2) || $$1.b_($$3).a(awk.a)) && $$1.b_($$3.e()).a(awk.a);
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      if (this.dO().B) {
         return false;
      } else {
         if (!this.gl() && !$$0.a(awg.w) && !$$0.a(brn.O) && $$0.c() instanceof btn $$2) {
            $$2.a(this.dP().d(this), 2.0F);
         }

         if (this.d != null) {
            this.d.i();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public int ac() {
      return 180;
   }

   @Override
   public void a(exc $$0) {
      if (this.da() && this.bf()) {
         this.a(0.1F, $$0);
         this.a(bts.a, this.dr());
         this.i(this.dr().a(0.9));
         if (!this.gl() && this.p() == null) {
            this.i(this.dr().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   static class a extends cam {
      private final cjz a;
      private int b;
      private final boolean c;

      public a(cjz $$0) {
         this.a = $$0;
         this.c = $$0 instanceof cjs;
         this.a(EnumSet.of(cam.a.a, cam.a.b));
      }

      @Override
      public boolean b() {
         btn $$0 = this.a.p();
         return $$0 != null && $$0.bE();
      }

      @Override
      public boolean c() {
         return super.c() && (this.c || this.a.p() != null && this.a.g((bsr)this.a.p()) > 9.0);
      }

      @Override
      public void d() {
         this.b = -10;
         this.a.N().n();
         btn $$0 = this.a.p();
         if ($$0 != null) {
            this.a.I().a($$0, 90.0F, 90.0F);
         }

         this.a.av = true;
      }

      @Override
      public void e() {
         this.a.b(0);
         this.a.h(null);
         this.a.d.i();
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         btn $$0 = this.a.p();
         if ($$0 != null) {
            this.a.N().n();
            this.a.I().a($$0, 90.0F, 90.0F);
            if (!this.a.F($$0)) {
               this.a.h(null);
            } else {
               this.b++;
               if (this.b == 0) {
                  this.a.b($$0.an());
                  if (!this.a.aX()) {
                     this.a.dO().a(this.a, (byte)21);
                  }
               } else if (this.b >= this.a.t()) {
                  float $$1 = 1.0F;
                  if (this.a.dO().al() == bqo.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  $$0.a(this.a.dP().c(this.a, (bsr)this.a), $$1);
                  this.a.D($$0);
                  this.a.h(null);
               }

               super.a();
            }
         }
      }
   }

   static class b implements Predicate<btn> {
      private final cjz a;

      public b(cjz $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable btn $$0) {
         return ($$0 instanceof cmx || $$0 instanceof cgd || $$0 instanceof cgq) && $$0.g(this.a) > 9.0;
      }
   }

   static class c extends bzp {
      private final cjz l;

      public c(cjz $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bzp.a.b && !this.l.N().l()) {
            exc $$0 = new exc(this.e - this.l.dt(), this.f - this.l.dv(), this.g - this.l.dz());
            double $$1 = $$0.f();
            double $$2 = $$0.c / $$1;
            double $$3 = $$0.d / $$1;
            double $$4 = $$0.e / $$1;
            float $$5 = (float)(ayo.d($$0.e, $$0.c) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.t(this.a(this.l.dE(), $$5, 90.0F));
            this.l.aY = this.l.dE();
            float $$6 = (float)(this.h * this.l.g(buw.v));
            float $$7 = ayo.i(0.125F, this.l.fj(), $$6);
            this.l.A($$7);
            double $$8 = Math.sin((double)(this.l.ai + this.l.an()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dE() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dE() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.ai + this.l.an()) * 0.75) * 0.05;
            this.l.i(this.l.dr().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            bzo $$12 = this.l.I();
            double $$13 = this.l.dt() + $$2 * 2.0;
            double $$14 = this.l.dx() + $$3 / $$1;
            double $$15 = this.l.dz() + $$4 * 2.0;
            double $$16 = $$12.e();
            double $$17 = $$12.f();
            double $$18 = $$12.g();
            if (!$$12.d()) {
               $$16 = $$13;
               $$17 = $$14;
               $$18 = $$15;
            }

            this.l.I().a(ayo.d(0.125, $$16, $$13), ayo.d(0.125, $$17, $$14), ayo.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.x(true);
         } else {
            this.l.A(0.0F);
            this.l.x(false);
         }
      }
   }
}
