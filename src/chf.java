import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chf extends cin implements bsm, cir {
   private static final ajm<Integer> b = ajq.a(chf.class, ajo.b);
   private static final ajm<Integer> c = ajq.a(chf.class, ajo.b);
   private static final ajm<Integer> d = ajq.a(chf.class, ajo.b);
   private static final List<ajm<Integer>> e = ImmutableList.of(b, c, d);
   private static final ajm<Integer> bY = ajq.a(chf.class, ajo.b);
   private static final int bZ = 220;
   private final float[] ca = new float[2];
   private final float[] cb = new float[2];
   private final float[] cc = new float[2];
   private final float[] cd = new float[2];
   private final int[] ce = new int[2];
   private final int[] cf = new int[2];
   private int cg;
   private final aqe ch = (aqe)new aqe(this.O_(), bpc.a.f, bpc.b.a).a(true);
   private static final Predicate<bsa> ci = $$0 -> !$$0.ai().a(avu.y) && $$0.fF();
   private static final ccq cj = ccq.a().a(20.0).a(ci);

   public chf(brn<? extends chf> $$0, dad $$1) {
      super($$0, $$1);
      this.bP = new bxx(this, 10, false);
      this.t(this.eP());
      this.bN = 50;
   }

   @Override
   protected cbl b(dad $$0) {
      cbj $$1 = new cbj(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void z() {
      this.bS.a(0, new chf.a());
      this.bS.a(2, new bzw(this, 1.0, 40, 20.0F));
      this.bS.a(5, new caj(this, 1.0));
      this.bS.a(6, new bzf(this, clh.class, 8.0F));
      this.bS.a(7, new bzs(this));
      this.bT.a(1, new cap(this));
      this.bT.a(2, new caq<>(this, bsa.class, 0, false, false, ci));
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(b, 0);
      $$0.a(c, 0);
      $$0.a(d, 0);
      $$0.a(bY, 0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Invul", this.y());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.t($$0.h("Invul"));
      if (this.ae()) {
         this.ch.a(this.O_());
      }
   }

   @Override
   public void b(@Nullable wu $$0) {
      super.b($$0);
      this.ch.a(this.O_());
   }

   @Override
   protected avb v() {
      return avc.Cj;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.Cm;
   }

   @Override
   protected avb o_() {
      return avc.Cl;
   }

   @Override
   public void n_() {
      etp $$0 = this.dq().d(1.0, 0.6, 1.0);
      if (!this.dN().B && this.u(0) > 0) {
         brh $$1 = this.dN().a(this.u(0));
         if ($$1 != null) {
            double $$2 = $$0.d;
            if (this.du() < $$1.du() || !this.a() && this.du() < $$1.du() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new etp($$0.c, $$2, $$0.e);
            etp $$3 = new etp($$1.ds() - this.ds(), 0.0, $$1.dy() - this.dy());
            if ($$3.i() > 9.0) {
               etp $$4 = $$3.d();
               $$0 = $$0.b($$4.c * 0.3 - $$0.c * 0.6, 0.0, $$4.e * 0.3 - $$0.e * 0.6);
            }
         }
      }

      this.g($$0);
      if ($$0.i() > 0.05) {
         this.r((float)axz.d($$0.e, $$0.c) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.n_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.cd[$$5] = this.cb[$$5];
         this.cc[$$5] = this.ca[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.u($$6 + 1);
         brh $$8 = null;
         if ($$7 > 0) {
            $$8 = this.dN().a($$7);
         }

         if ($$8 != null) {
            double $$9 = this.v($$6 + 1);
            double $$10 = this.w($$6 + 1);
            double $$11 = this.x($$6 + 1);
            double $$12 = $$8.ds() - $$9;
            double $$13 = $$8.dw() - $$10;
            double $$14 = $$8.dy() - $$11;
            double $$15 = Math.sqrt($$12 * $$12 + $$14 * $$14);
            float $$16 = (float)(axz.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(axz.d($$13, $$15) * 180.0F / (float)Math.PI));
            this.ca[$$6] = this.a(this.ca[$$6], $$17, 40.0F);
            this.cb[$$6] = this.a(this.cb[$$6], $$16, 10.0F);
         } else {
            this.cb[$$6] = this.a(this.cb[$$6], this.aZ, 10.0F);
         }
      }

      boolean $$18 = this.a();

      for (int $$19 = 0; $$19 < 3; $$19++) {
         double $$20 = this.v($$19);
         double $$21 = this.w($$19);
         double $$22 = this.x($$19);
         float $$23 = 0.3F * this.ec();
         this.dN().a(kx.ab, $$20 + this.ah.k() * (double)$$23, $$21 + this.ah.k() * (double)$$23, $$22 + this.ah.k() * (double)$$23, 0.0, 0.0, 0.0);
         if ($$18 && this.dN().z.a(4) == 0) {
            this.dN()
               .a(
                  kp.a(kx.u, 0.7F, 0.7F, 0.5F),
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
         float $$24 = 3.3F * this.ec();

         for (int $$25 = 0; $$25 < 3; $$25++) {
            this.dN()
               .a(kp.a(kx.u, 0.7F, 0.7F, 0.9F), this.ds() + this.ah.k(), this.du() + (double)(this.ah.i() * $$24), this.dy() + this.ah.k(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void Y() {
      if (this.y() > 0) {
         int $$0 = this.y() - 1;
         this.ch.a(1.0F - (float)$$0 / 220.0F);
         if ($$0 <= 0) {
            this.dN().a(this, this.ds(), this.dw(), this.dy(), 7.0F, false, dad.a.c);
            if (!this.aU()) {
               this.dN().b(1023, this.dn(), 0);
            }
         }

         this.t($$0);
         if (this.ai % 10 == 0) {
            this.c(10.0F);
         }
      } else {
         super.Y();

         for (int $$1 = 1; $$1 < 3; $$1++) {
            if (this.ai >= this.ce[$$1 - 1]) {
               this.ce[$$1 - 1] = this.ai + 10 + this.ah.a(10);
               if ((this.dN().ak() == bpj.c || this.dN().ak() == bpj.d) && this.cf[$$1 - 1]++ > 15) {
                  float $$2 = 10.0F;
                  float $$3 = 5.0F;
                  double $$4 = axz.a(this.ah, this.ds() - 10.0, this.ds() + 10.0);
                  double $$5 = axz.a(this.ah, this.du() - 5.0, this.du() + 5.0);
                  double $$6 = axz.a(this.ah, this.dy() - 10.0, this.dy() + 10.0);
                  this.a($$1 + 1, $$4, $$5, $$6, true);
                  this.cf[$$1 - 1] = 0;
               }

               int $$7 = this.u($$1);
               if ($$7 > 0) {
                  bsa $$8 = (bsa)this.dN().a($$7);
                  if ($$8 != null && this.c($$8) && !(this.g((brh)$$8) > 900.0) && this.E($$8)) {
                     this.a($$1 + 1, $$8);
                     this.ce[$$1 - 1] = this.ai + 40 + this.ah.a(20);
                     this.cf[$$1 - 1] = 0;
                  } else {
                     this.a($$1, 0);
                  }
               } else {
                  List<bsa> $$9 = this.dN().a(bsa.class, cj, this, this.cI().c(20.0, 8.0, 20.0));
                  if (!$$9.isEmpty()) {
                     bsa $$10 = $$9.get(this.ah.a($$9.size()));
                     this.a($$1, $$10.aj());
                  }
               }
            }
         }

         if (this.p() != null) {
            this.a(0, this.p().aj());
         } else {
            this.a(0, 0);
         }

         if (this.cg > 0) {
            this.cg--;
            if (this.cg == 0 && this.dN().aa().b(czz.c)) {
               boolean $$11 = false;
               int $$12 = axz.d(this.dh() / 2.0F + 1.0F);
               int $$13 = axz.d(this.di());

               for (in $$14 : in.b(this.dr() - $$12, this.dt(), this.dx() - $$12, this.dr() + $$12, this.dt() + $$13, this.dx() + $$12)) {
                  dqh $$15 = this.dN().a_($$14);
                  if (d($$15)) {
                     $$11 = this.dN().a($$14, true, this) || $$11;
                  }
               }

               if ($$11) {
                  this.dN().a(null, 1022, this.dn(), 0);
               }
            }
         }

         if (this.ai % 20 == 0) {
            this.c(1.0F);
         }

         this.ch.a(this.ey() / this.eP());
      }
   }

   public static boolean d(dqh $$0) {
      return !$$0.i() && !$$0.a(avr.aE);
   }

   @Override
   public void r() {
      this.t(220);
      this.ch.a(0.0F);
      this.t(this.eP() / 3.0F);
   }

   @Override
   public void a(dqh $$0, etp $$1) {
   }

   @Override
   public void c(aqi $$0) {
      super.c($$0);
      this.ch.a($$0);
   }

   @Override
   public void d(aqi $$0) {
      super.d($$0);
      this.ch.b($$0);
   }

   private double v(int $$0) {
      if ($$0 <= 0) {
         return this.ds();
      } else {
         float $$1 = (this.aZ + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = axz.b($$1);
         return this.ds() + (double)$$2 * 1.3 * (double)this.ec();
      }
   }

   private double w(int $$0) {
      float $$1 = $$0 <= 0 ? 3.0F : 2.2F;
      return this.du() + (double)($$1 * this.ec());
   }

   private double x(int $$0) {
      if ($$0 <= 0) {
         return this.dy();
      } else {
         float $$1 = (this.aZ + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = axz.a($$1);
         return this.dy() + (double)$$2 * 1.3 * (double)this.ec();
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = axz.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, bsa $$1) {
      this.a($$0, $$1.ds(), $$1.du() + (double)$$1.cJ() * 0.5, $$1.dy(), $$0 == 0 && this.ah.i() < 0.001F);
   }

   private void a(int $$0, double $$1, double $$2, double $$3, boolean $$4) {
      if (!this.aU()) {
         this.dN().a(null, 1024, this.dn(), 0);
      }

      double $$5 = this.v($$0);
      double $$6 = this.w($$0);
      double $$7 = this.x($$0);
      double $$8 = $$1 - $$5;
      double $$9 = $$2 - $$6;
      double $$10 = $$3 - $$7;
      cmn $$11 = new cmn(this.dN(), this, $$8, $$9, $$10);
      $$11.c(this);
      if ($$4) {
         $$11.a(true);
      }

      $$11.p($$5, $$6, $$7);
      this.dN().b($$11);
   }

   @Override
   public void a(bsa $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(bqf $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.a(avt.u) || $$0.d() instanceof chf) {
         return false;
      } else if (this.y() > 0 && !$$0.a(avt.e)) {
         return false;
      } else {
         if (this.a()) {
            brh $$2 = $$0.c();
            if ($$2 instanceof cln) {
               return false;
            }
         }

         brh $$3 = $$0.d();
         if ($$3 != null && $$3.ai().a(avu.y)) {
            return false;
         } else {
            if (this.cg <= 0) {
               this.cg = 20;
            }

            for (int $$4 = 0; $$4 < this.cf.length; $$4++) {
               this.cf[$$4] = this.cf[$$4] + 3;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void a(bqf $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      chr $$3 = this.a(ctc.us);
      if ($$3 != null) {
         $$3.A();
      }
   }

   @Override
   public void dz() {
      if (this.dN().ak() == bpj.a && this.W()) {
         this.am();
      } else {
         this.bg = 0;
      }
   }

   @Override
   public boolean b(bqt $$0, @Nullable brh $$1) {
      return false;
   }

   public static btg.a u() {
      return cin.gv().a(bth.q, 300.0).a(bth.r, 0.6F).a(bth.j, 0.6F).a(bth.k, 40.0).a(bth.a, 4.0);
   }

   public float b(int $$0) {
      return this.cb[$$0];
   }

   public float c(int $$0) {
      return this.ca[$$0];
   }

   public int y() {
      return this.ao.a(bY);
   }

   public void t(int $$0) {
      this.ao.a(bY, $$0);
   }

   public int u(int $$0) {
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
   protected boolean o(brh $$0) {
      return false;
   }

   @Override
   public boolean cu() {
      return false;
   }

   @Override
   public boolean c(bqt $$0) {
      return $$0.a(bqv.t) ? false : super.c($$0);
   }

   class a extends byx {
      public a() {
         this.a(EnumSet.of(byx.a.a, byx.a.c, byx.a.b));
      }

      @Override
      public boolean a() {
         return chf.this.y() > 0;
      }
   }
}
