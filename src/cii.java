import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cii extends cjr implements btp, cjv {
   private static final ajp<Integer> b = ajt.a(cii.class, ajr.b);
   private static final ajp<Integer> c = ajt.a(cii.class, ajr.b);
   private static final ajp<Integer> d = ajt.a(cii.class, ajr.b);
   private static final List<ajp<Integer>> e = ImmutableList.of(b, c, d);
   private static final ajp<Integer> ca = ajt.a(cii.class, ajr.b);
   private static final int cb = 220;
   private final float[] cc = new float[2];
   private final float[] cd = new float[2];
   private final float[] ce = new float[2];
   private final float[] cf = new float[2];
   private final int[] cg = new int[2];
   private final int[] ch = new int[2];
   private int ci;
   private final aqj cj = (aqj)new aqj(this.O_(), bpx.a.f, bpx.b.a).a(true);
   private static final Predicate<btc> ck = $$0 -> !$$0.am().a(awa.y) && $$0.fF();
   private static final cdt cl = cdt.a().a(20.0).a(ck);

   public cii(bsn<? extends cii> $$0, dcg $$1) {
      super($$0, $$1);
      this.bR = new bza(this, 10, false);
      this.u(this.eP());
      this.bP = 50;
   }

   @Override
   protected cco b(dcg $$0) {
      ccm $$1 = new ccm(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void z() {
      this.bU.a(0, new cii.a());
      this.bU.a(2, new caz(this, 1.0, 40, 20.0F));
      this.bU.a(5, new cbm(this, 1.0));
      this.bU.a(6, new cai(this, cml.class, 8.0F));
      this.bU.a(7, new cav(this));
      this.bV.a(1, new cbs(this));
      this.bV.a(2, new cbt<>(this, btc.class, 0, false, false, ck));
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
      $$0.a("Invul", this.x());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.s($$0.h("Invul"));
      if (this.ai()) {
         this.cj.a(this.O_());
      }
   }

   @Override
   public void b(@Nullable wu $$0) {
      super.b($$0);
      this.cj.a(this.O_());
   }

   @Override
   protected avg v() {
      return avh.Cx;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.CA;
   }

   @Override
   protected avg n_() {
      return avh.Cz;
   }

   @Override
   public void m_() {
      ewh $$0 = this.du().d(1.0, 0.6, 1.0);
      if (!this.dR().B && this.t(0) > 0) {
         bsh $$1 = this.dR().a(this.t(0));
         if ($$1 != null) {
            double $$2 = $$0.d;
            if (this.dy() < $$1.dy() || !this.a() && this.dy() < $$1.dy() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new ewh($$0.c, $$2, $$0.e);
            ewh $$3 = new ewh($$1.dw() - this.dw(), 0.0, $$1.dC() - this.dC());
            if ($$3.i() > 9.0) {
               ewh $$4 = $$3.d();
               $$0 = $$0.b($$4.c * 0.3 - $$0.c * 0.6, 0.0, $$4.e * 0.3 - $$0.e * 0.6);
            }
         }
      }

      this.j($$0);
      if ($$0.i() > 0.05) {
         this.s((float)ayg.d($$0.e, $$0.c) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.m_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.cf[$$5] = this.cd[$$5];
         this.ce[$$5] = this.cc[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.t($$6 + 1);
         bsh $$8 = null;
         if ($$7 > 0) {
            $$8 = this.dR().a($$7);
         }

         if ($$8 != null) {
            double $$9 = this.u($$6 + 1);
            double $$10 = this.v($$6 + 1);
            double $$11 = this.w($$6 + 1);
            double $$12 = $$8.dw() - $$9;
            double $$13 = $$8.dA() - $$10;
            double $$14 = $$8.dC() - $$11;
            double $$15 = Math.sqrt($$12 * $$12 + $$14 * $$14);
            float $$16 = (float)(ayg.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(ayg.d($$13, $$15) * 180.0F / (float)Math.PI));
            this.cc[$$6] = this.a(this.cc[$$6], $$17, 40.0F);
            this.cd[$$6] = this.a(this.cd[$$6], $$16, 10.0F);
         } else {
            this.cd[$$6] = this.a(this.cd[$$6], this.aZ, 10.0F);
         }
      }

      boolean $$18 = this.a();

      for (int $$19 = 0; $$19 < 3; $$19++) {
         double $$20 = this.u($$19);
         double $$21 = this.v($$19);
         double $$22 = this.w($$19);
         float $$23 = 0.3F * this.ed();
         this.dR().a(lj.ae, $$20 + this.ah.k() * (double)$$23, $$21 + this.ah.k() * (double)$$23, $$22 + this.ah.k() * (double)$$23, 0.0, 0.0, 0.0);
         if ($$18 && this.dR().z.a(4) == 0) {
            this.dR()
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

      if (this.x() > 0) {
         float $$24 = 3.3F * this.ed();

         for (int $$25 = 0; $$25 < 3; $$25++) {
            this.dR()
               .a(lc.a(lj.u, 0.7F, 0.7F, 0.9F), this.dw() + this.ah.k(), this.dy() + (double)(this.ah.i() * $$24), this.dC() + this.ah.k(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void Z() {
      if (this.x() > 0) {
         int $$0 = this.x() - 1;
         this.cj.a(1.0F - (float)$$0 / 220.0F);
         if ($$0 <= 0) {
            this.dR().a(this, this.dw(), this.dA(), this.dC(), 7.0F, false, dcg.a.c);
            if (!this.aY()) {
               this.dR().b(1023, this.dr(), 0);
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
               if ((this.dR().al() == bqe.c || this.dR().al() == bqe.d) && this.ch[$$1 - 1]++ > 15) {
                  float $$2 = 10.0F;
                  float $$3 = 5.0F;
                  double $$4 = ayg.a(this.ah, this.dw() - 10.0, this.dw() + 10.0);
                  double $$5 = ayg.a(this.ah, this.dy() - 5.0, this.dy() + 5.0);
                  double $$6 = ayg.a(this.ah, this.dC() - 10.0, this.dC() + 10.0);
                  this.a($$1 + 1, $$4, $$5, $$6, true);
                  this.ch[$$1 - 1] = 0;
               }

               int $$7 = this.t($$1);
               if ($$7 > 0) {
                  btc $$8 = (btc)this.dR().a($$7);
                  if ($$8 != null && this.c($$8) && !(this.g((bsh)$$8) > 900.0) && this.F($$8)) {
                     this.a($$1 + 1, $$8);
                     this.cg[$$1 - 1] = this.ai + 40 + this.ah.a(20);
                     this.ch[$$1 - 1] = 0;
                  } else {
                     this.a($$1, 0);
                  }
               } else {
                  List<btc> $$9 = this.dR().a(btc.class, cl, this, this.cM().c(20.0, 8.0, 20.0));
                  if (!$$9.isEmpty()) {
                     btc $$10 = $$9.get(this.ah.a($$9.size()));
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
            if (this.ci == 0 && this.dR().ab().b(dcc.c)) {
               boolean $$11 = false;
               int $$12 = ayg.d(this.dl() / 2.0F + 1.0F);
               int $$13 = ayg.d(this.dm());

               for (ja $$14 : ja.b(this.dv() - $$12, this.dx(), this.dB() - $$12, this.dv() + $$12, this.dx() + $$13, this.dB() + $$12)) {
                  dsl $$15 = this.dR().a_($$14);
                  if (c($$15)) {
                     $$11 = this.dR().a($$14, true, this) || $$11;
                  }
               }

               if ($$11) {
                  this.dR().a(null, 1022, this.dr(), 0);
               }
            }
         }

         if (this.ai % 20 == 0) {
            this.c(1.0F);
         }

         this.cj.a(this.ey() / this.eP());
      }
   }

   public static boolean c(dsl $$0) {
      return !$$0.i() && !$$0.a(avw.aE);
   }

   @Override
   public void s() {
      this.s(220);
      this.cj.a(0.0F);
      this.u(this.eP() / 3.0F);
   }

   @Override
   public void a(dsl $$0, ewh $$1) {
   }

   @Override
   public void d(aqn $$0) {
      super.d($$0);
      this.cj.a($$0);
   }

   @Override
   public void e(aqn $$0) {
      super.e($$0);
      this.cj.b($$0);
   }

   private double u(int $$0) {
      if ($$0 <= 0) {
         return this.dw();
      } else {
         float $$1 = (this.aZ + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = ayg.b($$1);
         return this.dw() + (double)$$2 * 1.3 * (double)this.ed();
      }
   }

   private double v(int $$0) {
      float $$1 = $$0 <= 0 ? 3.0F : 2.2F;
      return this.dy() + (double)($$1 * this.ed());
   }

   private double w(int $$0) {
      if ($$0 <= 0) {
         return this.dC();
      } else {
         float $$1 = (this.aZ + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = ayg.a($$1);
         return this.dC() + (double)$$2 * 1.3 * (double)this.ed();
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = ayg.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, btc $$1) {
      this.a($$0, $$1.dw(), $$1.dy() + (double)$$1.cN() * 0.5, $$1.dC(), $$0 == 0 && this.ah.i() < 0.001F);
   }

   private void a(int $$0, double $$1, double $$2, double $$3, boolean $$4) {
      if (!this.aY()) {
         this.dR().a(null, 1024, this.dr(), 0);
      }

      double $$5 = this.u($$0);
      double $$6 = this.v($$0);
      double $$7 = this.w($$0);
      double $$8 = $$1 - $$5;
      double $$9 = $$2 - $$6;
      double $$10 = $$3 - $$7;
      ewh $$11 = new ewh($$8, $$9, $$10);
      cnr $$12 = new cnr(this.dR(), this, $$11.d());
      $$12.c(this);
      if ($$4) {
         $$12.a(true);
      }

      $$12.p($$5, $$6, $$7);
      this.dR().b($$12);
   }

   @Override
   public void a(btc $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.a(avy.u) || $$0.d() instanceof cii) {
         return false;
      } else if (this.x() > 0 && !$$0.a(avy.e)) {
         return false;
      } else {
         if (this.a()) {
            bsh $$2 = $$0.c();
            if ($$2 instanceof cmr || $$2 instanceof cnv) {
               return false;
            }
         }

         bsh $$3 = $$0.d();
         if ($$3 != null && $$3.am().a(awa.y)) {
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
   protected void a(aqm $$0, bra $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      civ $$3 = this.a(cug.us);
      if ($$3 != null) {
         $$3.A();
      }
   }

   @Override
   public void dD() {
      if (this.dR().al() == bqe.a && this.X()) {
         this.aq();
      } else {
         this.bg = 0;
      }
   }

   @Override
   public boolean b(brp $$0, @Nullable bsh $$1) {
      return false;
   }

   public static buj.a t() {
      return cjr.gt().a(buk.s, 300.0).a(buk.v, 0.6F).a(buk.l, 0.6F).a(buk.m, 40.0).a(buk.a, 4.0);
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
      return this.ey() <= this.eP() / 2.0F;
   }

   @Override
   protected boolean o(bsh $$0) {
      return false;
   }

   @Override
   public boolean cy() {
      return false;
   }

   @Override
   public boolean c(brp $$0) {
      return $$0.a(brr.t) ? false : super.c($$0);
   }

   class a extends caa {
      public a() {
         this.a(EnumSet.of(caa.a.a, caa.a.c, caa.a.b));
      }

      @Override
      public boolean a() {
         return cii.this.x() > 0;
      }
   }
}
