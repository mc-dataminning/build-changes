import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class buv extends bwc implements bgm, bwg {
   private static final aby<Integer> b = acb.a(buv.class, aca.b);
   private static final aby<Integer> c = acb.a(buv.class, aca.b);
   private static final aby<Integer> d = acb.a(buv.class, aca.b);
   private static final List<aby<Integer>> e = ImmutableList.of(b, c, d);
   private static final aby<Integer> bT = acb.a(buv.class, aca.b);
   private static final int bU = 220;
   private final float[] bV = new float[2];
   private final float[] bW = new float[2];
   private final float[] bX = new float[2];
   private final float[] bY = new float[2];
   private final int[] bZ = new int[2];
   private final int[] ca = new int[2];
   private int cb;
   private final aic cc = (aic)new aic(this.H_(), bdn.a.f, bdn.b.a).a(true);
   private static final Predicate<bfz> cd = $$0 -> $$0.eN() != bge.b && $$0.fu();
   private static final bqm ce = bqm.a().a(20.0).a(cd);

   public buv(bfn<? extends buv> $$0, cmm $$1) {
      super($$0, $$1);
      this.bL = new blv(this, 10, false);
      this.t(this.eI());
      this.bJ = 50;
   }

   @Override
   protected bpj b(cmm $$0) {
      bph $$1 = new bph(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void x() {
      this.bO.a(0, new buv.a());
      this.bO.a(2, new bnu(this, 1.0, 40, 20.0F));
      this.bO.a(5, new boh(this, 1.0));
      this.bO.a(6, new bnd(this, byo.class, 8.0F));
      this.bO.a(7, new bnq(this));
      this.bP.a(1, new bon(this));
      this.bP.a(2, new boo<>(this, bfz.class, 0, false, false, cd));
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(b, 0);
      this.am.a(c, 0);
      this.am.a(d, 0);
      this.am.a(bT, 0);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("Invul", this.w());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.s($$0.h("Invul"));
      if (this.aa()) {
         this.cc.a(this.H_());
      }
   }

   @Override
   public void b(@Nullable sw $$0) {
      super.b($$0);
      this.cc.a(this.H_());
   }

   @Override
   protected amg s() {
      return amh.zY;
   }

   @Override
   protected amg d(ben $$0) {
      return amh.Ab;
   }

   @Override
   protected amg g_() {
      return amh.Aa;
   }

   @Override
   public void b_() {
      eei $$0 = this.dl().d(1.0, 0.6, 1.0);
      if (!this.dI().B && this.t(0) > 0) {
         bfj $$1 = this.dI().a(this.t(0));
         if ($$1 != null) {
            double $$2 = $$0.d;
            if (this.dp() < $$1.dp() || !this.a() && this.dp() < $$1.dp() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new eei($$0.c, $$2, $$0.e);
            eei $$3 = new eei($$1.dn() - this.dn(), 0.0, $$1.dt() - this.dt());
            if ($$3.i() > 9.0) {
               eei $$4 = $$3.d();
               $$0 = $$0.b($$4.c * 0.3 - $$0.c * 0.6, 0.0, $$4.e * 0.3 - $$0.e * 0.6);
            }
         }
      }

      this.f($$0);
      if ($$0.i() > 0.05) {
         this.a_((float)apa.d($$0.e, $$0.c) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.b_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.bY[$$5] = this.bW[$$5];
         this.bX[$$5] = this.bV[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.t($$6 + 1);
         bfj $$8 = null;
         if ($$7 > 0) {
            $$8 = this.dI().a($$7);
         }

         if ($$8 != null) {
            double $$9 = this.u($$6 + 1);
            double $$10 = this.v($$6 + 1);
            double $$11 = this.w($$6 + 1);
            double $$12 = $$8.dn() - $$9;
            double $$13 = $$8.dr() - $$10;
            double $$14 = $$8.dt() - $$11;
            double $$15 = Math.sqrt($$12 * $$12 + $$14 * $$14);
            float $$16 = (float)(apa.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(apa.d($$13, $$15) * 180.0F / (float)Math.PI));
            this.bV[$$6] = this.a(this.bV[$$6], $$17, 40.0F);
            this.bW[$$6] = this.a(this.bW[$$6], $$16, 10.0F);
         } else {
            this.bW[$$6] = this.a(this.bW[$$6], this.aV, 10.0F);
         }
      }

      boolean $$18 = this.a();

      for (int $$19 = 0; $$19 < 3; $$19++) {
         double $$20 = this.u($$19);
         double $$21 = this.v($$19);
         double $$22 = this.w($$19);
         this.dI().a(iv.Z, $$20 + this.af.k() * 0.3F, $$21 + this.af.k() * 0.3F, $$22 + this.af.k() * 0.3F, 0.0, 0.0, 0.0);
         if ($$18 && this.dI().z.a(4) == 0) {
            this.dI().a(iv.v, $$20 + this.af.k() * 0.3F, $$21 + this.af.k() * 0.3F, $$22 + this.af.k() * 0.3F, 0.7F, 0.7F, 0.5);
         }
      }

      if (this.w() > 0) {
         for (int $$23 = 0; $$23 < 3; $$23++) {
            this.dI().a(iv.v, this.dn() + this.af.k(), this.dp() + (double)(this.af.i() * 3.3F), this.dt() + this.af.k(), 0.7F, 0.7F, 0.9F);
         }
      }
   }

   @Override
   protected void W() {
      if (this.w() > 0) {
         int $$0 = this.w() - 1;
         this.cc.a(1.0F - (float)$$0 / 220.0F);
         if ($$0 <= 0) {
            this.dI().a(this, this.dn(), this.dr(), this.dt(), 7.0F, false, cmm.a.c);
            if (!this.aQ()) {
               this.dI().b(1023, this.di(), 0);
            }
         }

         this.s($$0);
         if (this.ag % 10 == 0) {
            this.s(10.0F);
         }
      } else {
         super.W();

         for (int $$1 = 1; $$1 < 3; $$1++) {
            if (this.ag >= this.bZ[$$1 - 1]) {
               this.bZ[$$1 - 1] = this.ag + 10 + this.af.a(10);
               if ((this.dI().ai() == bdu.c || this.dI().ai() == bdu.d) && this.ca[$$1 - 1]++ > 15) {
                  float $$2 = 10.0F;
                  float $$3 = 5.0F;
                  double $$4 = apa.a(this.af, this.dn() - 10.0, this.dn() + 10.0);
                  double $$5 = apa.a(this.af, this.dp() - 5.0, this.dp() + 5.0);
                  double $$6 = apa.a(this.af, this.dt() - 10.0, this.dt() + 10.0);
                  this.a($$1 + 1, $$4, $$5, $$6, true);
                  this.ca[$$1 - 1] = 0;
               }

               int $$7 = this.t($$1);
               if ($$7 > 0) {
                  bfz $$8 = (bfz)this.dI().a($$7);
                  if ($$8 != null && this.c($$8) && !(this.f((bfj)$$8) > 900.0) && this.B($$8)) {
                     this.a($$1 + 1, $$8);
                     this.bZ[$$1 - 1] = this.ag + 40 + this.af.a(20);
                     this.ca[$$1 - 1] = 0;
                  } else {
                     this.a($$1, 0);
                  }
               } else {
                  List<bfz> $$9 = this.dI().a(bfz.class, ce, this, this.cE().c(20.0, 8.0, 20.0));
                  if (!$$9.isEmpty()) {
                     bfz $$10 = $$9.get(this.af.a($$9.size()));
                     this.a($$1, $$10.af());
                  }
               }
            }
         }

         if (this.j() != null) {
            this.a(0, this.j().af());
         } else {
            this.a(0, 0);
         }

         if (this.cb > 0) {
            this.cb--;
            if (this.cb == 0 && this.dI().X().b(cmi.c)) {
               int $$11 = apa.a(this.dp());
               int $$12 = apa.a(this.dn());
               int $$13 = apa.a(this.dt());
               boolean $$14 = false;

               for (int $$15 = -1; $$15 <= 1; $$15++) {
                  for (int $$16 = -1; $$16 <= 1; $$16++) {
                     for (int $$17 = 0; $$17 <= 3; $$17++) {
                        int $$18 = $$12 + $$15;
                        int $$19 = $$11 + $$17;
                        int $$20 = $$13 + $$16;
                        gu $$21 = new gu($$18, $$19, $$20);
                        dcb $$22 = this.dI().a_($$21);
                        if (d($$22)) {
                           $$14 = this.dI().a($$21, true, this) || $$14;
                        }
                     }
                  }
               }

               if ($$14) {
                  this.dI().a(null, 1022, this.di(), 0);
               }
            }
         }

         if (this.ag % 20 == 0) {
            this.s(1.0F);
         }

         this.cc.a(this.er() / this.eI());
      }
   }

   public static boolean d(dcb $$0) {
      return !$$0.i() && !$$0.a(amw.aC);
   }

   @Override
   public void q() {
      this.s(220);
      this.cc.a(0.0F);
      this.t(this.eI() / 3.0F);
   }

   @Override
   public void a(dcb $$0, eei $$1) {
   }

   @Override
   public void c(aig $$0) {
      super.c($$0);
      this.cc.a($$0);
   }

   @Override
   public void d(aig $$0) {
      super.d($$0);
      this.cc.b($$0);
   }

   private double u(int $$0) {
      if ($$0 <= 0) {
         return this.dn();
      } else {
         float $$1 = (this.aV + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = apa.b($$1);
         return this.dn() + (double)$$2 * 1.3;
      }
   }

   private double v(int $$0) {
      return $$0 <= 0 ? this.dp() + 3.0 : this.dp() + 2.2;
   }

   private double w(int $$0) {
      if ($$0 <= 0) {
         return this.dt();
      } else {
         float $$1 = (this.aV + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = apa.a($$1);
         return this.dt() + (double)$$2 * 1.3;
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = apa.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, bfz $$1) {
      this.a($$0, $$1.dn(), $$1.dp() + (double)$$1.cF() * 0.5, $$1.dt(), $$0 == 0 && this.af.i() < 0.001F);
   }

   private void a(int $$0, double $$1, double $$2, double $$3, boolean $$4) {
      if (!this.aQ()) {
         this.dI().a(null, 1024, this.di(), 0);
      }

      double $$5 = this.u($$0);
      double $$6 = this.v($$0);
      double $$7 = this.w($$0);
      double $$8 = $$1 - $$5;
      double $$9 = $$2 - $$6;
      double $$10 = $$3 - $$7;
      bzt $$11 = new bzt(this.dI(), this, $$8, $$9, $$10);
      $$11.b(this);
      if ($$4) {
         $$11.a(true);
      }

      $$11.p($$5, $$6, $$7);
      this.dI().b($$11);
   }

   @Override
   public void a(bfz $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(ben $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.a(amy.t) || $$0.d() instanceof buv) {
         return false;
      } else if (this.w() > 0 && !$$0.a(amy.d)) {
         return false;
      } else {
         if (this.a()) {
            bfj $$2 = $$0.c();
            if ($$2 instanceof byu) {
               return false;
            }
         }

         bfj $$3 = $$0.d();
         if ($$3 != null && !($$3 instanceof byo) && $$3 instanceof bfz && ((bfz)$$3).eN() == this.eN()) {
            return false;
         } else {
            if (this.cb <= 0) {
               this.cb = 20;
            }

            for (int $$4 = 0; $$4 < this.ca.length; $$4++) {
               this.ca[$$4] = this.ca[$$4] + 3;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void a(ben $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bvh $$3 = this.a(cgc.ty);
      if ($$3 != null) {
         $$3.t();
      }
   }

   @Override
   public void du() {
      if (this.dI().ai() == bdu.a && this.U()) {
         this.ai();
      } else {
         this.bc = 0;
      }
   }

   @Override
   public boolean b(bfa $$0, @Nullable bfj $$1) {
      return false;
   }

   public static bhf.a r() {
      return bwc.ge().a(bhg.a, 300.0).a(bhg.d, 0.6F).a(bhg.e, 0.6F).a(bhg.b, 40.0).a(bhg.i, 4.0);
   }

   public float b(int $$0) {
      return this.bW[$$0];
   }

   public float c(int $$0) {
      return this.bV[$$0];
   }

   public int w() {
      return this.am.b(bT);
   }

   public void s(int $$0) {
      this.am.b(bT, $$0);
   }

   public int t(int $$0) {
      return this.am.b(e.get($$0));
   }

   public void a(int $$0, int $$1) {
      this.am.b(e.get($$0), $$1);
   }

   @Override
   public boolean a() {
      return this.er() <= this.eI() / 2.0F;
   }

   @Override
   public bge eN() {
      return bge.b;
   }

   @Override
   protected boolean l(bfj $$0) {
      return false;
   }

   @Override
   public boolean cq() {
      return false;
   }

   @Override
   public boolean c(bfa $$0) {
      return $$0.c() == bfc.t ? false : super.c($$0);
   }

   class a extends bmv {
      public a() {
         this.a(EnumSet.of(bmv.a.a, bmv.a.c, bmv.a.b));
      }

      @Override
      public boolean a() {
         return buv.this.w() > 0;
      }
   }
}
