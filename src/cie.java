import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cie extends cjn implements btl, cjr {
   private static final ajp<Integer> b = ajt.a(cie.class, ajr.b);
   private static final ajp<Integer> c = ajt.a(cie.class, ajr.b);
   private static final ajp<Integer> d = ajt.a(cie.class, ajr.b);
   private static final List<ajp<Integer>> e = ImmutableList.of(b, c, d);
   private static final ajp<Integer> ca = ajt.a(cie.class, ajr.b);
   private static final int cb = 220;
   private final float[] cc = new float[2];
   private final float[] cd = new float[2];
   private final float[] ce = new float[2];
   private final float[] cf = new float[2];
   private final int[] cg = new int[2];
   private final int[] ch = new int[2];
   private int ci;
   private final aqh cj = (aqh)new aqh(this.O_(), bpt.a.f, bpt.b.a).a(true);
   private static final Predicate<bsy> ck = $$0 -> !$$0.ak().a(avy.y) && $$0.fD();
   private static final cdp cl = cdp.a().a(20.0).a(ck);

   public cie(bsj<? extends cie> $$0, dcd $$1) {
      super($$0, $$1);
      this.bR = new byw(this, 10, false);
      this.u(this.eN());
      this.bP = 50;
   }

   @Override
   protected cck b(dcd $$0) {
      cci $$1 = new cci(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void z() {
      this.bU.a(0, new cie.a());
      this.bU.a(2, new cav(this, 1.0, 40, 20.0F));
      this.bU.a(5, new cbi(this, 1.0));
      this.bU.a(6, new cae(this, cmh.class, 8.0F));
      this.bU.a(7, new car(this));
      this.bV.a(1, new cbo(this));
      this.bV.a(2, new cbp<>(this, bsy.class, 0, false, false, ck));
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(b, 0);
      $$0.a(c, 0);
      $$0.a(d, 0);
      $$0.a(ca, 0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Invul", this.y());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.s($$0.h("Invul"));
      if (this.ag()) {
         this.cj.a(this.O_());
      }
   }

   @Override
   public void b(@Nullable wu $$0) {
      super.b($$0);
      this.cj.a(this.O_());
   }

   @Override
   protected ave v() {
      return avf.Cx;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.CA;
   }

   @Override
   protected ave o_() {
      return avf.Cz;
   }

   @Override
   public void n_() {
      evz $$0 = this.ds().d(1.0, 0.6, 1.0);
      if (!this.dP().B && this.t(0) > 0) {
         bsd $$1 = this.dP().a(this.t(0));
         if ($$1 != null) {
            double $$2 = $$0.d;
            if (this.dw() < $$1.dw() || !this.a() && this.dw() < $$1.dw() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new evz($$0.c, $$2, $$0.e);
            evz $$3 = new evz($$1.du() - this.du(), 0.0, $$1.dA() - this.dA());
            if ($$3.i() > 9.0) {
               evz $$4 = $$3.d();
               $$0 = $$0.b($$4.c * 0.3 - $$0.c * 0.6, 0.0, $$4.e * 0.3 - $$0.e * 0.6);
            }
         }
      }

      this.h($$0);
      if ($$0.i() > 0.05) {
         this.s((float)aye.d($$0.e, $$0.c) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.n_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.cf[$$5] = this.cd[$$5];
         this.ce[$$5] = this.cc[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.t($$6 + 1);
         bsd $$8 = null;
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
            float $$16 = (float)(aye.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(aye.d($$13, $$15) * 180.0F / (float)Math.PI));
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
         float $$23 = 0.3F * this.eb();
         this.dP().a(lj.ae, $$20 + this.ah.k() * (double)$$23, $$21 + this.ah.k() * (double)$$23, $$22 + this.ah.k() * (double)$$23, 0.0, 0.0, 0.0);
         if ($$18 && this.dP().z.a(4) == 0) {
            this.dP()
               .a(
                  lc.a(lj.u, 0.7F, 0.7F, 0.5F),
                  $$20 + this.ah.k() * (double)$$23,
                  $$21 + this.ah.k() * (double)$$23,
                  $$22 + this.ah.k() * (double)$$23,
                  0.0,
                  0.0,
                  0.0
               );
         }
      }

      if (this.y() > 0) {
         float $$24 = 3.3F * this.eb();

         for (int $$25 = 0; $$25 < 3; $$25++) {
            this.dP()
               .a(lc.a(lj.u, 0.7F, 0.7F, 0.9F), this.du() + this.ah.k(), this.dw() + (double)(this.ah.i() * $$24), this.dA() + this.ah.k(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void Z() {
      if (this.y() > 0) {
         int $$0 = this.y() - 1;
         this.cj.a(1.0F - (float)$$0 / 220.0F);
         if ($$0 <= 0) {
            this.dP().a(this, this.du(), this.dy(), this.dA(), 7.0F, false, dcd.a.c);
            if (!this.aW()) {
               this.dP().b(1023, this.dp(), 0);
            }
         }

         this.s($$0);
         if (this.ai % 10 == 0) {
            this.c(10.0F);
         }
      } else {
         super.Z();

         for (int $$1 = 1; $$1 < 3; $$1++) {
            if (this.ai >= this.cg[$$1 - 1]) {
               this.cg[$$1 - 1] = this.ai + 10 + this.ah.a(10);
               if ((this.dP().al() == bqa.c || this.dP().al() == bqa.d) && this.ch[$$1 - 1]++ > 15) {
                  float $$2 = 10.0F;
                  float $$3 = 5.0F;
                  double $$4 = aye.a(this.ah, this.du() - 10.0, this.du() + 10.0);
                  double $$5 = aye.a(this.ah, this.dw() - 5.0, this.dw() + 5.0);
                  double $$6 = aye.a(this.ah, this.dA() - 10.0, this.dA() + 10.0);
                  this.a($$1 + 1, $$4, $$5, $$6, true);
                  this.ch[$$1 - 1] = 0;
               }

               int $$7 = this.t($$1);
               if ($$7 > 0) {
                  bsy $$8 = (bsy)this.dP().a($$7);
                  if ($$8 != null && this.c($$8) && !(this.g((bsd)$$8) > 900.0) && this.F($$8)) {
                     this.a($$1 + 1, $$8);
                     this.cg[$$1 - 1] = this.ai + 40 + this.ah.a(20);
                     this.ch[$$1 - 1] = 0;
                  } else {
                     this.a($$1, 0);
                  }
               } else {
                  List<bsy> $$9 = this.dP().a(bsy.class, cl, this, this.cK().c(20.0, 8.0, 20.0));
                  if (!$$9.isEmpty()) {
                     bsy $$10 = $$9.get(this.ah.a($$9.size()));
                     this.a($$1, $$10.al());
                  }
               }
            }
         }

         if (this.p() != null) {
            this.a(0, this.p().al());
         } else {
            this.a(0, 0);
         }

         if (this.ci > 0) {
            this.ci--;
            if (this.ci == 0 && this.dP().ab().b(dbz.c)) {
               boolean $$11 = false;
               int $$12 = aye.d(this.dj() / 2.0F + 1.0F);
               int $$13 = aye.d(this.dk());

               for (ja $$14 : ja.b(this.dt() - $$12, this.dv(), this.dz() - $$12, this.dt() + $$12, this.dv() + $$13, this.dz() + $$12)) {
                  dsh $$15 = this.dP().a_($$14);
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

         this.cj.a(this.ew() / this.eN());
      }
   }

   public static boolean c(dsh $$0) {
      return !$$0.i() && !$$0.a(avu.aE);
   }

   @Override
   public void s() {
      this.s(220);
      this.cj.a(0.0F);
      this.u(this.eN() / 3.0F);
   }

   @Override
   public void a(dsh $$0, evz $$1) {
   }

   @Override
   public void c(aql $$0) {
      super.c($$0);
      this.cj.a($$0);
   }

   @Override
   public void d(aql $$0) {
      super.d($$0);
      this.cj.b($$0);
   }

   private double u(int $$0) {
      if ($$0 <= 0) {
         return this.du();
      } else {
         float $$1 = (this.aY + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = aye.b($$1);
         return this.du() + (double)$$2 * 1.3 * (double)this.eb();
      }
   }

   private double v(int $$0) {
      float $$1 = $$0 <= 0 ? 3.0F : 2.2F;
      return this.dw() + (double)($$1 * this.eb());
   }

   private double w(int $$0) {
      if ($$0 <= 0) {
         return this.dA();
      } else {
         float $$1 = (this.aY + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = aye.a($$1);
         return this.dA() + (double)$$2 * 1.3 * (double)this.eb();
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = aye.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, bsy $$1) {
      this.a($$0, $$1.du(), $$1.dw() + (double)$$1.cL() * 0.5, $$1.dA(), $$0 == 0 && this.ah.i() < 0.001F);
   }

   private void a(int $$0, double $$1, double $$2, double $$3, boolean $$4) {
      if (!this.aW()) {
         this.dP().a(null, 1024, this.dp(), 0);
      }

      double $$5 = this.u($$0);
      double $$6 = this.v($$0);
      double $$7 = this.w($$0);
      double $$8 = $$1 - $$5;
      double $$9 = $$2 - $$6;
      double $$10 = $$3 - $$7;
      cnn $$11 = new cnn(this.dP(), this, $$8, $$9, $$10);
      $$11.c(this);
      if ($$4) {
         $$11.a(true);
      }

      $$11.p($$5, $$6, $$7);
      this.dP().b($$11);
   }

   @Override
   public void a(bsy $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.a(avw.u) || $$0.d() instanceof cie) {
         return false;
      } else if (this.y() > 0 && !$$0.a(avw.e)) {
         return false;
      } else {
         if (this.a()) {
            bsd $$2 = $$0.c();
            if ($$2 instanceof cmn || $$2 instanceof cnr) {
               return false;
            }
         }

         bsd $$3 = $$0.d();
         if ($$3 != null && $$3.ak().a(avy.y)) {
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
   protected void a(bqw $$0, boolean $$1) {
      super.a($$0, $$1);
      cir $$2 = this.a(cud.us);
      if ($$2 != null) {
         $$2.A();
      }
   }

   @Override
   public void dB() {
      if (this.dP().al() == bqa.a && this.X()) {
         this.ao();
      } else {
         this.bf = 0;
      }
   }

   @Override
   public boolean b(brl $$0, @Nullable bsd $$1) {
      return false;
   }

   public static buf.a u() {
      return cjn.gt().a(bug.s, 300.0).a(bug.v, 0.6F).a(bug.l, 0.6F).a(bug.m, 40.0).a(bug.a, 4.0);
   }

   public float b(int $$0) {
      return this.cd[$$0];
   }

   public float c(int $$0) {
      return this.cc[$$0];
   }

   public int y() {
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
      return this.ew() <= this.eN() / 2.0F;
   }

   @Override
   protected boolean o(bsd $$0) {
      return false;
   }

   @Override
   public boolean cw() {
      return false;
   }

   @Override
   public boolean c(brl $$0) {
      return $$0.a(brn.t) ? false : super.c($$0);
   }

   class a extends bzw {
      public a() {
         this.a(EnumSet.of(bzw.a.a, bzw.a.c, bzw.a.b));
      }

      @Override
      public boolean a() {
         return cie.this.y() > 0;
      }
   }
}
