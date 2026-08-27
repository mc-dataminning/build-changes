import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbp extends ccw implements bnb, cda {
   private static final agn<Integer> b = agq.a(cbp.class, agp.b);
   private static final agn<Integer> c = agq.a(cbp.class, agp.b);
   private static final agn<Integer> d = agq.a(cbp.class, agp.b);
   private static final List<agn<Integer>> e = ImmutableList.of(b, c, d);
   private static final agn<Integer> bU = agq.a(cbp.class, agp.b);
   private static final int bV = 220;
   private final float[] bW = new float[2];
   private final float[] bX = new float[2];
   private final float[] bY = new float[2];
   private final float[] bZ = new float[2];
   private final int[] ca = new int[2];
   private final int[] cb = new int[2];
   private int cc;
   private final anb cd = (anb)new anb(this.Q_(), bjs.a.f, bjs.b.a).a(true);
   private static final Predicate<bmo> ce = $$0 -> $$0.eS() != bmt.b && $$0.fz();
   private static final bxd cf = bxd.a().a(20.0).a(ce);

   public cbp(bmc<? extends cbp> $$0, ctx $$1) {
      super($$0, $$1);
      this.bM = new bsk(this, 10, false);
      this.c(this.eM());
      this.bK = 50;
   }

   @Override
   protected bvy b(ctx $$0) {
      bvw $$1 = new bvw(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void B() {
      this.bP.a(0, new cbp.a());
      this.bP.a(2, new buj(this, 1.0, 40, 20.0F));
      this.bP.a(5, new buw(this, 1.0));
      this.bP.a(6, new bts(this, cfq.class, 8.0F));
      this.bP.a(7, new buf(this));
      this.bQ.a(1, new bvc(this));
      this.bQ.a(2, new bvd<>(this, bmo.class, 0, false, false, ce));
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, 0);
      this.an.a(c, 0);
      this.an.a(d, 0);
      this.an.a(bU, 0);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("Invul", this.A());
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.s($$0.h("Invul"));
      if (this.ae()) {
         this.cd.a(this.Q_());
      }
   }

   @Override
   public void b(@Nullable vg $$0) {
      super.b($$0);
      this.cd.a(this.Q_());
   }

   @Override
   protected ars y() {
      return art.BA;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.BD;
   }

   @Override
   protected ars n_() {
      return art.BC;
   }

   @Override
   public void d_() {
      emc $$0 = this.do().d(1.0, 0.6, 1.0);
      if (!this.dL().B && this.t(0) > 0) {
         blw $$1 = this.dL().a(this.t(0));
         if ($$1 != null) {
            double $$2 = $$0.d;
            if (this.ds() < $$1.ds() || !this.a() && this.ds() < $$1.ds() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new emc($$0.c, $$2, $$0.e);
            emc $$3 = new emc($$1.dq() - this.dq(), 0.0, $$1.dw() - this.dw());
            if ($$3.i() > 9.0) {
               emc $$4 = $$3.d();
               $$0 = $$0.b($$4.c * 0.3 - $$0.c * 0.6, 0.0, $$4.e * 0.3 - $$0.e * 0.6);
            }
         }
      }

      this.g($$0);
      if ($$0.i() > 0.05) {
         this.r((float)aup.d($$0.e, $$0.c) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.d_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.bZ[$$5] = this.bX[$$5];
         this.bY[$$5] = this.bW[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.t($$6 + 1);
         blw $$8 = null;
         if ($$7 > 0) {
            $$8 = this.dL().a($$7);
         }

         if ($$8 != null) {
            double $$9 = this.u($$6 + 1);
            double $$10 = this.v($$6 + 1);
            double $$11 = this.w($$6 + 1);
            double $$12 = $$8.dq() - $$9;
            double $$13 = $$8.du() - $$10;
            double $$14 = $$8.dw() - $$11;
            double $$15 = Math.sqrt($$12 * $$12 + $$14 * $$14);
            float $$16 = (float)(aup.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(aup.d($$13, $$15) * 180.0F / (float)Math.PI));
            this.bW[$$6] = this.a(this.bW[$$6], $$17, 40.0F);
            this.bX[$$6] = this.a(this.bX[$$6], $$16, 10.0F);
         } else {
            this.bX[$$6] = this.a(this.bX[$$6], this.aU, 10.0F);
         }
      }

      boolean $$18 = this.a();

      for (int $$19 = 0; $$19 < 3; $$19++) {
         double $$20 = this.u($$19);
         double $$21 = this.v($$19);
         double $$22 = this.w($$19);
         this.dL().a(jx.ab, $$20 + this.ag.k() * 0.3F, $$21 + this.ag.k() * 0.3F, $$22 + this.ag.k() * 0.3F, 0.0, 0.0, 0.0);
         if ($$18 && this.dL().z.a(4) == 0) {
            this.dL().a(jx.v, $$20 + this.ag.k() * 0.3F, $$21 + this.ag.k() * 0.3F, $$22 + this.ag.k() * 0.3F, 0.7F, 0.7F, 0.5);
         }
      }

      if (this.A() > 0) {
         for (int $$23 = 0; $$23 < 3; $$23++) {
            this.dL().a(jx.v, this.dq() + this.ag.k(), this.ds() + (double)(this.ag.i() * 3.3F), this.dw() + this.ag.k(), 0.7F, 0.7F, 0.9F);
         }
      }
   }

   @Override
   protected void aa() {
      if (this.A() > 0) {
         int $$0 = this.A() - 1;
         this.cd.a(1.0F - (float)$$0 / 220.0F);
         if ($$0 <= 0) {
            this.dL().a(this, this.dq(), this.du(), this.dw(), 7.0F, false, ctx.a.c);
            if (!this.aU()) {
               this.dL().b(1023, this.dl(), 0);
            }
         }

         this.s($$0);
         if (this.ah % 10 == 0) {
            this.b(10.0F);
         }
      } else {
         super.aa();

         for (int $$1 = 1; $$1 < 3; $$1++) {
            if (this.ah >= this.ca[$$1 - 1]) {
               this.ca[$$1 - 1] = this.ah + 10 + this.ag.a(10);
               if ((this.dL().ak() == bjz.c || this.dL().ak() == bjz.d) && this.cb[$$1 - 1]++ > 15) {
                  float $$2 = 10.0F;
                  float $$3 = 5.0F;
                  double $$4 = aup.a(this.ag, this.dq() - 10.0, this.dq() + 10.0);
                  double $$5 = aup.a(this.ag, this.ds() - 5.0, this.ds() + 5.0);
                  double $$6 = aup.a(this.ag, this.dw() - 10.0, this.dw() + 10.0);
                  this.a($$1 + 1, $$4, $$5, $$6, true);
                  this.cb[$$1 - 1] = 0;
               }

               int $$7 = this.t($$1);
               if ($$7 > 0) {
                  bmo $$8 = (bmo)this.dL().a($$7);
                  if ($$8 != null && this.c($$8) && !(this.f((blw)$$8) > 900.0) && this.D($$8)) {
                     this.a($$1 + 1, $$8);
                     this.ca[$$1 - 1] = this.ah + 40 + this.ag.a(20);
                     this.cb[$$1 - 1] = 0;
                  } else {
                     this.a($$1, 0);
                  }
               } else {
                  List<bmo> $$9 = this.dL().a(bmo.class, cf, this, this.cH().c(20.0, 8.0, 20.0));
                  if (!$$9.isEmpty()) {
                     bmo $$10 = $$9.get(this.ag.a($$9.size()));
                     this.a($$1, $$10.aj());
                  }
               }
            }
         }

         if (this.q() != null) {
            this.a(0, this.q().aj());
         } else {
            this.a(0, 0);
         }

         if (this.cc > 0) {
            this.cc--;
            if (this.cc == 0 && this.dL().Z().b(ctt.c)) {
               int $$11 = aup.a(this.ds());
               int $$12 = aup.a(this.dq());
               int $$13 = aup.a(this.dw());
               boolean $$14 = false;

               for (int $$15 = -1; $$15 <= 1; $$15++) {
                  for (int $$16 = -1; $$16 <= 1; $$16++) {
                     for (int $$17 = 0; $$17 <= 3; $$17++) {
                        int $$18 = $$12 + $$15;
                        int $$19 = $$11 + $$17;
                        int $$20 = $$13 + $$16;
                        hx $$21 = new hx($$18, $$19, $$20);
                        djp $$22 = this.dL().a_($$21);
                        if (d($$22)) {
                           $$14 = this.dL().a($$21, true, this) || $$14;
                        }
                     }
                  }
               }

               if ($$14) {
                  this.dL().a(null, 1022, this.dl(), 0);
               }
            }
         }

         if (this.ah % 20 == 0) {
            this.b(1.0F);
         }

         this.cd.a(this.ev() / this.eM());
      }
   }

   public static boolean d(djp $$0) {
      return !$$0.i() && !$$0.a(asi.aD);
   }

   @Override
   public void u() {
      this.s(220);
      this.cd.a(0.0F);
      this.c(this.eM() / 3.0F);
   }

   @Override
   public void a(djp $$0, emc $$1) {
   }

   @Override
   public void c(anf $$0) {
      super.c($$0);
      this.cd.a($$0);
   }

   @Override
   public void d(anf $$0) {
      super.d($$0);
      this.cd.b($$0);
   }

   private double u(int $$0) {
      if ($$0 <= 0) {
         return this.dq();
      } else {
         float $$1 = (this.aU + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = aup.b($$1);
         return this.dq() + (double)$$2 * 1.3;
      }
   }

   private double v(int $$0) {
      return $$0 <= 0 ? this.ds() + 3.0 : this.ds() + 2.2;
   }

   private double w(int $$0) {
      if ($$0 <= 0) {
         return this.dw();
      } else {
         float $$1 = (this.aU + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = aup.a($$1);
         return this.dw() + (double)$$2 * 1.3;
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = aup.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, bmo $$1) {
      this.a($$0, $$1.dq(), $$1.ds() + (double)$$1.cI() * 0.5, $$1.dw(), $$0 == 0 && this.ag.i() < 0.001F);
   }

   private void a(int $$0, double $$1, double $$2, double $$3, boolean $$4) {
      if (!this.aU()) {
         this.dL().a(null, 1024, this.dl(), 0);
      }

      double $$5 = this.u($$0);
      double $$6 = this.v($$0);
      double $$7 = this.w($$0);
      double $$8 = $$1 - $$5;
      double $$9 = $$2 - $$6;
      double $$10 = $$3 - $$7;
      cgw $$11 = new cgw(this.dL(), this, $$8, $$9, $$10);
      $$11.c(this);
      if ($$4) {
         $$11.a(true);
      }

      $$11.p($$5, $$6, $$7);
      this.dL().b($$11);
   }

   @Override
   public void a(bmo $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.a(ask.u) || $$0.d() instanceof cbp) {
         return false;
      } else if (this.A() > 0 && !$$0.a(ask.e)) {
         return false;
      } else {
         if (this.a()) {
            blw $$2 = $$0.c();
            if ($$2 instanceof cfw) {
               return false;
            }
         }

         blw $$3 = $$0.d();
         if ($$3 != null && !($$3 instanceof cfq) && $$3 instanceof bmo && ((bmo)$$3).eS() == this.eS()) {
            return false;
         } else {
            if (this.cc <= 0) {
               this.cc = 20;
            }

            for (int $$4 = 0; $$4 < this.cb.length; $$4++) {
               this.cb[$$4] = this.cb[$$4] + 3;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void a(bkv $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      ccb $$3 = this.a(cnj.uo);
      if ($$3 != null) {
         $$3.B();
      }
   }

   @Override
   public void dx() {
      if (this.dL().ak() == bjz.a && this.Y()) {
         this.am();
      } else {
         this.bb = 0;
      }
   }

   @Override
   public boolean b(blj $$0, @Nullable blw $$1) {
      return false;
   }

   public static bnt.a w() {
      return ccw.gl().a(bnu.n, 300.0).a(bnu.o, 0.6F).a(bnu.h, 0.6F).a(bnu.i, 40.0).a(bnu.a, 4.0);
   }

   public float b(int $$0) {
      return this.bX[$$0];
   }

   public float c(int $$0) {
      return this.bW[$$0];
   }

   public int A() {
      return this.an.b(bU);
   }

   public void s(int $$0) {
      this.an.b(bU, $$0);
   }

   public int t(int $$0) {
      return this.an.b(e.get($$0));
   }

   public void a(int $$0, int $$1) {
      this.an.b(e.get($$0), $$1);
   }

   @Override
   public boolean a() {
      return this.ev() <= this.eM() / 2.0F;
   }

   @Override
   public bmt eS() {
      return bmt.b;
   }

   @Override
   protected boolean n(blw $$0) {
      return false;
   }

   @Override
   public boolean ct() {
      return false;
   }

   @Override
   public boolean c(blj $$0) {
      return $$0.a(bll.t) ? false : super.c($$0);
   }

   class a extends btk {
      public a() {
         this.a(EnumSet.of(btk.a.a, btk.a.c, btk.a.b));
      }

      @Override
      public boolean a() {
         return cbp.this.A() > 0;
      }
   }
}
