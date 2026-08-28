import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ciu extends ckd implements bub, ckh {
   private static final ajw<Integer> b = aka.a(ciu.class, ajy.b);
   private static final ajw<Integer> c = aka.a(ciu.class, ajy.b);
   private static final ajw<Integer> d = aka.a(ciu.class, ajy.b);
   private static final List<ajw<Integer>> e = ImmutableList.of(b, c, d);
   private static final ajw<Integer> ca = aka.a(ciu.class, ajy.b);
   private static final int cb = 220;
   private final float[] cc = new float[2];
   private final float[] cd = new float[2];
   private final float[] ce = new float[2];
   private final float[] cf = new float[2];
   private final int[] cg = new int[2];
   private final int[] ch = new int[2];
   private int ci;
   private final aqr cj = (aqr)new aqr(this.S_(), bqh.a.f, bqh.b.a).a(true);
   private static final Predicate<btn> ck = $$0 -> !$$0.am().a(awi.y) && $$0.fE();
   private static final cef cl = cef.a().a(20.0).a(ck);

   public ciu(bsx<? extends ciu> $$0, dcw $$1) {
      super($$0, $$1);
      this.bR = new bzm(this, 10, false);
      this.v(this.eO());
      this.bP = 50;
   }

   @Override
   protected cda b(dcw $$0) {
      ccy $$1 = new ccy(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void B() {
      this.bU.a(0, new ciu.a());
      this.bU.a(2, new cbl(this, 1.0, 40, 20.0F));
      this.bU.a(5, new cby(this, 1.0));
      this.bU.a(6, new cau(this, cmx.class, 8.0F));
      this.bU.a(7, new cbh(this));
      this.bV.a(1, new cce(this));
      this.bV.a(2, new ccf<>(this, btn.class, 0, false, false, ck));
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(b, 0);
      $$0.a(c, 0);
      $$0.a(d, 0);
      $$0.a(ca, 0);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("Invul", this.x());
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.s($$0.h("Invul"));
      if (this.ai()) {
         this.cj.a(this.S_());
      }
   }

   @Override
   public void b(@Nullable wz $$0) {
      super.b($$0);
      this.cj.a(this.S_());
   }

   @Override
   protected avo v() {
      return avp.Cy;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.CB;
   }

   @Override
   protected avo n_() {
      return avp.CA;
   }

   @Override
   public void m_() {
      exa $$0 = this.ds().d(1.0, 0.6, 1.0);
      if (!this.dP().B && this.t(0) > 0) {
         bsr $$1 = this.dP().a(this.t(0));
         if ($$1 != null) {
            double $$2 = $$0.d;
            if (this.dw() < $$1.dw() || !this.a() && this.dw() < $$1.dw() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new exa($$0.c, $$2, $$0.e);
            exa $$3 = new exa($$1.du() - this.du(), 0.0, $$1.dA() - this.dA());
            if ($$3.i() > 9.0) {
               exa $$4 = $$3.d();
               $$0 = $$0.b($$4.c * 0.3 - $$0.c * 0.6, 0.0, $$4.e * 0.3 - $$0.e * 0.6);
            }
         }
      }

      this.i($$0);
      if ($$0.i() > 0.05) {
         this.t((float)ayo.d($$0.e, $$0.c) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.m_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.cf[$$5] = this.cd[$$5];
         this.ce[$$5] = this.cc[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.t($$6 + 1);
         bsr $$8 = null;
         if ($$7 > 0) {
            $$8 = this.dP().a($$7);
         }

         if ($$8 != null) {
            double $$9 = this.u($$6 + 1);
            double $$10 = this.v($$6 + 1);
            double $$11 = this.w($$6 + 1);
            double $$12 = $$8.du() - $$9;
            double $$13 = $$8.dy() - $$10;
            double $$14 = $$8.dA() - $$11;
            double $$15 = Math.sqrt($$12 * $$12 + $$14 * $$14);
            float $$16 = (float)(ayo.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(ayo.d($$13, $$15) * 180.0F / (float)Math.PI));
            this.cc[$$6] = this.a(this.cc[$$6], $$17, 40.0F);
            this.cd[$$6] = this.a(this.cd[$$6], $$16, 10.0F);
         } else {
            this.cd[$$6] = this.a(this.cd[$$6], this.aY, 10.0F);
         }
      }

      boolean $$18 = this.a();

      for (int $$19 = 0; $$19 < 3; $$19++) {
         double $$20 = this.u($$19);
         double $$21 = this.v($$19);
         double $$22 = this.w($$19);
         float $$23 = 0.3F * this.ec();
         this.dP().a(lm.ae, $$20 + this.ah.k() * (double)$$23, $$21 + this.ah.k() * (double)$$23, $$22 + this.ah.k() * (double)$$23, 0.0, 0.0, 0.0);
         if ($$18 && this.dP().z.a(4) == 0) {
            this.dP()
               .a(
                  lf.a(lm.u, 0.7F, 0.7F, 0.5F),
                  $$20 + this.ah.k() * (double)$$23,
                  $$21 + this.ah.k() * (double)$$23,
                  $$22 + this.ah.k() * (double)$$23,
                  0.0,
                  0.0,
                  0.0
               );
         }
      }

      if (this.x() > 0) {
         float $$24 = 3.3F * this.ec();

         for (int $$25 = 0; $$25 < 3; $$25++) {
            this.dP()
               .a(lf.a(lm.u, 0.7F, 0.7F, 0.9F), this.du() + this.ah.k(), this.dw() + (double)(this.ah.i() * $$24), this.dA() + this.ah.k(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void ab() {
      if (this.x() > 0) {
         int $$0 = this.x() - 1;
         this.cj.a(1.0F - (float)$$0 / 220.0F);
         if ($$0 <= 0) {
            this.dP().a(this, this.du(), this.dy(), this.dA(), 7.0F, false, dcw.a.c);
            if (!this.aX()) {
               this.dP().b(1023, this.dp(), 0);
            }
         }

         this.s($$0);
         if (this.ai % 10 == 0) {
            this.c(10.0F);
         }
      } else {
         super.ab();

         for (int $$1 = 1; $$1 < 3; $$1++) {
            if (this.ai >= this.cg[$$1 - 1]) {
               this.cg[$$1 - 1] = this.ai + 10 + this.ah.a(10);
               if ((this.dP().al() == bqo.c || this.dP().al() == bqo.d) && this.ch[$$1 - 1]++ > 15) {
                  float $$2 = 10.0F;
                  float $$3 = 5.0F;
                  double $$4 = ayo.a(this.ah, this.du() - 10.0, this.du() + 10.0);
                  double $$5 = ayo.a(this.ah, this.dw() - 5.0, this.dw() + 5.0);
                  double $$6 = ayo.a(this.ah, this.dA() - 10.0, this.dA() + 10.0);
                  this.a($$1 + 1, $$4, $$5, $$6, true);
                  this.ch[$$1 - 1] = 0;
               }

               int $$7 = this.t($$1);
               if ($$7 > 0) {
                  btn $$8 = (btn)this.dP().a($$7);
                  if ($$8 != null && this.c($$8) && !(this.g((bsr)$$8) > 900.0) && this.F($$8)) {
                     this.a($$1 + 1, $$8);
                     this.cg[$$1 - 1] = this.ai + 40 + this.ah.a(20);
                     this.ch[$$1 - 1] = 0;
                  } else {
                     this.a($$1, 0);
                  }
               } else {
                  List<btn> $$9 = this.dP().a(btn.class, cl, this, this.cL().c(20.0, 8.0, 20.0));
                  if (!$$9.isEmpty()) {
                     btn $$10 = $$9.get(this.ah.a($$9.size()));
                     this.a($$1, $$10.an());
                  }
               }
            }
         }

         if (this.p() != null) {
            this.a(0, this.p().an());
         } else {
            this.a(0, 0);
         }

         if (this.ci > 0) {
            this.ci--;
            if (this.ci == 0 && this.dP().ab().b(dcs.c)) {
               boolean $$11 = false;
               int $$12 = ayo.d(this.dk() / 2.0F + 1.0F);
               int $$13 = ayo.d(this.dl());

               for (jd $$14 : jd.b(this.dt() - $$12, this.dv(), this.dz() - $$12, this.dt() + $$12, this.dv() + $$13, this.dz() + $$12)) {
                  dtc $$15 = this.dP().a_($$14);
                  if (c($$15)) {
                     $$11 = this.dP().a($$14, true, this) || $$11;
                  }
               }

               if ($$11) {
                  this.dP().a(null, 1022, this.dp(), 0);
               }
            }
         }

         if (this.ai % 20 == 0) {
            this.c(1.0F);
         }

         this.cj.a(this.ex() / this.eO());
      }
   }

   public static boolean c(dtc $$0) {
      return !$$0.i() && !$$0.a(awe.aE);
   }

   @Override
   public void s() {
      this.s(220);
      this.cj.a(0.0F);
      this.v(this.eO() / 3.0F);
   }

   @Override
   public void a(dtc $$0, exa $$1) {
   }

   @Override
   public void d(aqv $$0) {
      super.d($$0);
      this.cj.a($$0);
   }

   @Override
   public void e(aqv $$0) {
      super.e($$0);
      this.cj.b($$0);
   }

   private double u(int $$0) {
      if ($$0 <= 0) {
         return this.du();
      } else {
         float $$1 = (this.aY + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = ayo.b($$1);
         return this.du() + (double)$$2 * 1.3 * (double)this.ec();
      }
   }

   private double v(int $$0) {
      float $$1 = $$0 <= 0 ? 3.0F : 2.2F;
      return this.dw() + (double)($$1 * this.ec());
   }

   private double w(int $$0) {
      if ($$0 <= 0) {
         return this.dA();
      } else {
         float $$1 = (this.aY + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = ayo.a($$1);
         return this.dA() + (double)$$2 * 1.3 * (double)this.ec();
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = ayo.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, btn $$1) {
      this.a($$0, $$1.du(), $$1.dw() + (double)$$1.cM() * 0.5, $$1.dA(), $$0 == 0 && this.ah.i() < 0.001F);
   }

   private void a(int $$0, double $$1, double $$2, double $$3, boolean $$4) {
      if (!this.aX()) {
         this.dP().a(null, 1024, this.dp(), 0);
      }

      double $$5 = this.u($$0);
      double $$6 = this.v($$0);
      double $$7 = this.w($$0);
      double $$8 = $$1 - $$5;
      double $$9 = $$2 - $$6;
      double $$10 = $$3 - $$7;
      exa $$11 = new exa($$8, $$9, $$10);
      cod $$12 = new cod(this.dP(), this, $$11.d());
      $$12.c(this);
      if ($$4) {
         $$12.a(true);
      }

      $$12.o($$5, $$6, $$7);
      this.dP().b($$12);
   }

   @Override
   public void a(btn $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.a(awg.t) || $$0.d() instanceof ciu) {
         return false;
      } else if (this.x() > 0 && !$$0.a(awg.d)) {
         return false;
      } else {
         if (this.a()) {
            bsr $$2 = $$0.c();
            if ($$2 instanceof cnd || $$2 instanceof coh) {
               return false;
            }
         }

         bsr $$3 = $$0.d();
         if ($$3 != null && $$3.am().a(awi.y)) {
            return false;
         } else {
            if (this.ci <= 0) {
               this.ci = 20;
            }

            for (int $$4 = 0; $$4 < this.ch.length; $$4++) {
               this.ch[$$4] = this.ch[$$4] + 3;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void a(aqu $$0, brk $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      cjh $$3 = this.a(cut.us);
      if ($$3 != null) {
         $$3.A();
      }
   }

   @Override
   public void dB() {
      if (this.dP().al() == bqo.a && this.Z()) {
         this.aq();
      } else {
         this.bf = 0;
      }
   }

   @Override
   public boolean b(brz $$0, @Nullable bsr $$1) {
      return false;
   }

   public static buv.a t() {
      return ckd.gr().a(buw.s, 300.0).a(buw.v, 0.6F).a(buw.l, 0.6F).a(buw.m, 40.0).a(buw.a, 4.0);
   }

   public float b(int $$0) {
      return this.cd[$$0];
   }

   public float c(int $$0) {
      return this.cc[$$0];
   }

   public int x() {
      return this.ao.a(ca);
   }

   public void s(int $$0) {
      this.ao.a(ca, $$0);
   }

   public int t(int $$0) {
      return this.ao.a(e.get($$0));
   }

   public void a(int $$0, int $$1) {
      this.ao.a(e.get($$0), $$1);
   }

   @Override
   public boolean a() {
      return this.ex() <= this.eO() / 2.0F;
   }

   @Override
   protected boolean o(bsr $$0) {
      return false;
   }

   @Override
   public boolean cx() {
      return false;
   }

   @Override
   public boolean c(brz $$0) {
      return $$0.a(bsb.t) ? false : super.c($$0);
   }

   class a extends cam {
      public a() {
         this.a(EnumSet.of(cam.a.a, cam.a.c, cam.a.b));
      }

      @Override
      public boolean b() {
         return ciu.this.x() > 0;
      }
   }
}
