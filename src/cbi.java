import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbi extends ccp implements bmy, cct {
   private static final agm<Integer> b = agp.a(cbi.class, ago.b);
   private static final agm<Integer> c = agp.a(cbi.class, ago.b);
   private static final agm<Integer> d = agp.a(cbi.class, ago.b);
   private static final List<agm<Integer>> e = ImmutableList.of(b, c, d);
   private static final agm<Integer> bT = agp.a(cbi.class, ago.b);
   private static final int bU = 220;
   private final float[] bV = new float[2];
   private final float[] bW = new float[2];
   private final float[] bX = new float[2];
   private final float[] bY = new float[2];
   private final int[] bZ = new int[2];
   private final int[] ca = new int[2];
   private int cb;
   private final ana cc = (ana)new ana(this.Q_(), bjr.a.f, bjr.b.a).a(true);
   private static final Predicate<bml> cd = $$0 -> $$0.eS() != bmq.b && $$0.fz();
   private static final bwz ce = bwz.a().a(20.0).a(cd);

   public cbi(blz<? extends cbi> $$0, ctp $$1) {
      super($$0, $$1);
      this.bL = new bsh(this, 10, false);
      this.c(this.eM());
      this.bJ = 50;
   }

   @Override
   protected bvv b(ctp $$0) {
      bvt $$1 = new bvt(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void B() {
      this.bO.a(0, new cbi.a());
      this.bO.a(2, new bug(this, 1.0, 40, 20.0F));
      this.bO.a(5, new but(this, 1.0));
      this.bO.a(6, new btp(this, cfi.class, 8.0F));
      this.bO.a(7, new buc(this));
      this.bP.a(1, new buz(this));
      this.bP.a(2, new bva<>(this, bml.class, 0, false, false, cd));
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, 0);
      this.an.a(c, 0);
      this.an.a(d, 0);
      this.an.a(bT, 0);
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("Invul", this.A());
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.s($$0.h("Invul"));
      if (this.ae()) {
         this.cc.a(this.Q_());
      }
   }

   @Override
   public void b(@Nullable vf $$0) {
      super.b($$0);
      this.cc.a(this.Q_());
   }

   @Override
   protected arr y() {
      return ars.Bl;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.Bo;
   }

   @Override
   protected arr n_() {
      return ars.Bn;
   }

   @Override
   public void d_() {
      elt $$0 = this.dp().d(1.0, 0.6, 1.0);
      if (!this.dM().B && this.t(0) > 0) {
         blv $$1 = this.dM().a(this.t(0));
         if ($$1 != null) {
            double $$2 = $$0.d;
            if (this.dt() < $$1.dt() || !this.a() && this.dt() < $$1.dt() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new elt($$0.c, $$2, $$0.e);
            elt $$3 = new elt($$1.dr() - this.dr(), 0.0, $$1.dx() - this.dx());
            if ($$3.i() > 9.0) {
               elt $$4 = $$3.d();
               $$0 = $$0.b($$4.c * 0.3 - $$0.c * 0.6, 0.0, $$4.e * 0.3 - $$0.e * 0.6);
            }
         }
      }

      this.g($$0);
      if ($$0.i() > 0.05) {
         this.r((float)auo.d($$0.e, $$0.c) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.d_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.bY[$$5] = this.bW[$$5];
         this.bX[$$5] = this.bV[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.t($$6 + 1);
         blv $$8 = null;
         if ($$7 > 0) {
            $$8 = this.dM().a($$7);
         }

         if ($$8 != null) {
            double $$9 = this.u($$6 + 1);
            double $$10 = this.v($$6 + 1);
            double $$11 = this.w($$6 + 1);
            double $$12 = $$8.dr() - $$9;
            double $$13 = $$8.dv() - $$10;
            double $$14 = $$8.dx() - $$11;
            double $$15 = Math.sqrt($$12 * $$12 + $$14 * $$14);
            float $$16 = (float)(auo.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(auo.d($$13, $$15) * 180.0F / (float)Math.PI));
            this.bV[$$6] = this.a(this.bV[$$6], $$17, 40.0F);
            this.bW[$$6] = this.a(this.bW[$$6], $$16, 10.0F);
         } else {
            this.bW[$$6] = this.a(this.bW[$$6], this.aU, 10.0F);
         }
      }

      boolean $$18 = this.a();

      for (int $$19 = 0; $$19 < 3; $$19++) {
         double $$20 = this.u($$19);
         double $$21 = this.v($$19);
         double $$22 = this.w($$19);
         this.dM().a(jx.ab, $$20 + this.ag.k() * 0.3F, $$21 + this.ag.k() * 0.3F, $$22 + this.ag.k() * 0.3F, 0.0, 0.0, 0.0);
         if ($$18 && this.dM().z.a(4) == 0) {
            this.dM().a(jx.v, $$20 + this.ag.k() * 0.3F, $$21 + this.ag.k() * 0.3F, $$22 + this.ag.k() * 0.3F, 0.7F, 0.7F, 0.5);
         }
      }

      if (this.A() > 0) {
         for (int $$23 = 0; $$23 < 3; $$23++) {
            this.dM().a(jx.v, this.dr() + this.ag.k(), this.dt() + (double)(this.ag.i() * 3.3F), this.dx() + this.ag.k(), 0.7F, 0.7F, 0.9F);
         }
      }
   }

   @Override
   protected void Z() {
      if (this.A() > 0) {
         int $$0 = this.A() - 1;
         this.cc.a(1.0F - (float)$$0 / 220.0F);
         if ($$0 <= 0) {
            this.dM().a(this, this.dr(), this.dv(), this.dx(), 7.0F, false, ctp.a.c);
            if (!this.aU()) {
               this.dM().b(1023, this.dm(), 0);
            }
         }

         this.s($$0);
         if (this.ah % 10 == 0) {
            this.b(10.0F);
         }
      } else {
         super.Z();

         for (int $$1 = 1; $$1 < 3; $$1++) {
            if (this.ah >= this.bZ[$$1 - 1]) {
               this.bZ[$$1 - 1] = this.ah + 10 + this.ag.a(10);
               if ((this.dM().ak() == bjy.c || this.dM().ak() == bjy.d) && this.ca[$$1 - 1]++ > 15) {
                  float $$2 = 10.0F;
                  float $$3 = 5.0F;
                  double $$4 = auo.a(this.ag, this.dr() - 10.0, this.dr() + 10.0);
                  double $$5 = auo.a(this.ag, this.dt() - 5.0, this.dt() + 5.0);
                  double $$6 = auo.a(this.ag, this.dx() - 10.0, this.dx() + 10.0);
                  this.a($$1 + 1, $$4, $$5, $$6, true);
                  this.ca[$$1 - 1] = 0;
               }

               int $$7 = this.t($$1);
               if ($$7 > 0) {
                  bml $$8 = (bml)this.dM().a($$7);
                  if ($$8 != null && this.c($$8) && !(this.f((blv)$$8) > 900.0) && this.E($$8)) {
                     this.a($$1 + 1, $$8);
                     this.bZ[$$1 - 1] = this.ah + 40 + this.ag.a(20);
                     this.ca[$$1 - 1] = 0;
                  } else {
                     this.a($$1, 0);
                  }
               } else {
                  List<bml> $$9 = this.dM().a(bml.class, ce, this, this.cH().c(20.0, 8.0, 20.0));
                  if (!$$9.isEmpty()) {
                     bml $$10 = $$9.get(this.ag.a($$9.size()));
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

         if (this.cb > 0) {
            this.cb--;
            if (this.cb == 0 && this.dM().Z().b(ctl.c)) {
               int $$11 = auo.a(this.dt());
               int $$12 = auo.a(this.dr());
               int $$13 = auo.a(this.dx());
               boolean $$14 = false;

               for (int $$15 = -1; $$15 <= 1; $$15++) {
                  for (int $$16 = -1; $$16 <= 1; $$16++) {
                     for (int $$17 = 0; $$17 <= 3; $$17++) {
                        int $$18 = $$12 + $$15;
                        int $$19 = $$11 + $$17;
                        int $$20 = $$13 + $$16;
                        hx $$21 = new hx($$18, $$19, $$20);
                        djh $$22 = this.dM().a_($$21);
                        if (d($$22)) {
                           $$14 = this.dM().a($$21, true, this) || $$14;
                        }
                     }
                  }
               }

               if ($$14) {
                  this.dM().a(null, 1022, this.dm(), 0);
               }
            }
         }

         if (this.ah % 20 == 0) {
            this.b(1.0F);
         }

         this.cc.a(this.ev() / this.eM());
      }
   }

   public static boolean d(djh $$0) {
      return !$$0.i() && !$$0.a(ash.aD);
   }

   @Override
   public void u() {
      this.s(220);
      this.cc.a(0.0F);
      this.c(this.eM() / 3.0F);
   }

   @Override
   public void a(djh $$0, elt $$1) {
   }

   @Override
   public void c(ane $$0) {
      super.c($$0);
      this.cc.a($$0);
   }

   @Override
   public void d(ane $$0) {
      super.d($$0);
      this.cc.b($$0);
   }

   private double u(int $$0) {
      if ($$0 <= 0) {
         return this.dr();
      } else {
         float $$1 = (this.aU + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = auo.b($$1);
         return this.dr() + (double)$$2 * 1.3;
      }
   }

   private double v(int $$0) {
      return $$0 <= 0 ? this.dt() + 3.0 : this.dt() + 2.2;
   }

   private double w(int $$0) {
      if ($$0 <= 0) {
         return this.dx();
      } else {
         float $$1 = (this.aU + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = auo.a($$1);
         return this.dx() + (double)$$2 * 1.3;
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = auo.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, bml $$1) {
      this.a($$0, $$1.dr(), $$1.dt() + (double)$$1.cI() * 0.5, $$1.dx(), $$0 == 0 && this.ag.i() < 0.001F);
   }

   private void a(int $$0, double $$1, double $$2, double $$3, boolean $$4) {
      if (!this.aU()) {
         this.dM().a(null, 1024, this.dm(), 0);
      }

      double $$5 = this.u($$0);
      double $$6 = this.v($$0);
      double $$7 = this.w($$0);
      double $$8 = $$1 - $$5;
      double $$9 = $$2 - $$6;
      double $$10 = $$3 - $$7;
      cgo $$11 = new cgo(this.dM(), this, $$8, $$9, $$10);
      $$11.b(this);
      if ($$4) {
         $$11.a(true);
      }

      $$11.p($$5, $$6, $$7);
      this.dM().b($$11);
   }

   @Override
   public void a(bml $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(bkt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.a(asj.u) || $$0.d() instanceof cbi) {
         return false;
      } else if (this.A() > 0 && !$$0.a(asj.e)) {
         return false;
      } else {
         if (this.a()) {
            blv $$2 = $$0.c();
            if ($$2 instanceof cfo) {
               return false;
            }
         }

         blv $$3 = $$0.d();
         if ($$3 != null && !($$3 instanceof cfi) && $$3 instanceof bml && ((bml)$$3).eS() == this.eS()) {
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
   protected void a(bkt $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      cbu $$3 = this.a(cnb.ul);
      if ($$3 != null) {
         $$3.B();
      }
   }

   @Override
   public void dy() {
      if (this.dM().ak() == bjy.a && this.X()) {
         this.am();
      } else {
         this.bb = 0;
      }
   }

   @Override
   public boolean b(bli $$0, @Nullable blv $$1) {
      return false;
   }

   public static bnq.a w() {
      return ccp.gk().a(bnr.l, 300.0).a(bnr.m, 0.6F).a(bnr.f, 0.6F).a(bnr.g, 40.0).a(bnr.a, 4.0);
   }

   public float b(int $$0) {
      return this.bW[$$0];
   }

   public float c(int $$0) {
      return this.bV[$$0];
   }

   public int A() {
      return this.an.b(bT);
   }

   public void s(int $$0) {
      this.an.b(bT, $$0);
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
   public bmq eS() {
      return bmq.b;
   }

   @Override
   protected boolean o(blv $$0) {
      return false;
   }

   @Override
   public boolean ct() {
      return false;
   }

   @Override
   public boolean c(bli $$0) {
      return $$0.c() == blk.t ? false : super.c($$0);
   }

   class a extends bth {
      public a() {
         this.a(EnumSet.of(bth.a.a, bth.a.c, bth.a.b));
      }

      @Override
      public boolean a() {
         return cbi.this.A() > 0;
      }
   }
}
