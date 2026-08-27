import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfy extends chg implements brf, chk {
   private static final aja<Integer> b = aje.a(cfy.class, ajc.b);
   private static final aja<Integer> c = aje.a(cfy.class, ajc.b);
   private static final aja<Integer> d = aje.a(cfy.class, ajc.b);
   private static final List<aja<Integer>> e = ImmutableList.of(b, c, d);
   private static final aja<Integer> bX = aje.a(cfy.class, ajc.b);
   private static final int bY = 220;
   private final float[] bZ = new float[2];
   private final float[] ca = new float[2];
   private final float[] cb = new float[2];
   private final float[] cc = new float[2];
   private final int[] cd = new int[2];
   private final int[] ce = new int[2];
   private int cf;
   private final apr cg = (apr)new apr(this.O_(), bnv.a.f, bnv.b.a).a(true);
   private static final Predicate<bqt> ch = $$0 -> !$$0.ai().a(avh.y) && $$0.fE();
   private static final cbj ci = cbj.a().a(20.0).a(ch);

   public cfy(bqg<? extends cfy> $$0, czg $$1) {
      super($$0, $$1);
      this.bO = new bwq(this, 10, false);
      this.t(this.eO());
      this.bM = 50;
   }

   @Override
   protected cae b(czg $$0) {
      cac $$1 = new cac(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void z() {
      this.bR.a(0, new cfy.a());
      this.bR.a(2, new byp(this, 1.0, 40, 20.0F));
      this.bR.a(5, new bzc(this, 1.0));
      this.bR.a(6, new bxy(this, cka.class, 8.0F));
      this.bR.a(7, new byl(this));
      this.bS.a(1, new bzi(this));
      this.bS.a(2, new bzj<>(this, bqt.class, 0, false, false, ch));
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(b, 0);
      $$0.a(c, 0);
      $$0.a(d, 0);
      $$0.a(bX, 0);
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("Invul", this.y());
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.t($$0.h("Invul"));
      if (this.ae()) {
         this.cg.a(this.O_());
      }
   }

   @Override
   public void b(@Nullable wi $$0) {
      super.b($$0);
      this.cg.a(this.O_());
   }

   @Override
   protected aun v() {
      return auo.Cb;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.Ce;
   }

   @Override
   protected aun o_() {
      return auo.Cd;
   }

   @Override
   public void n_() {
      esj $$0 = this.dp().d(1.0, 0.6, 1.0);
      if (!this.dM().B && this.u(0) > 0) {
         bqa $$1 = this.dM().a(this.u(0));
         if ($$1 != null) {
            double $$2 = $$0.d;
            if (this.dt() < $$1.dt() || !this.a() && this.dt() < $$1.dt() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new esj($$0.c, $$2, $$0.e);
            esj $$3 = new esj($$1.dr() - this.dr(), 0.0, $$1.dx() - this.dx());
            if ($$3.i() > 9.0) {
               esj $$4 = $$3.d();
               $$0 = $$0.b($$4.c * 0.3 - $$0.c * 0.6, 0.0, $$4.e * 0.3 - $$0.e * 0.6);
            }
         }
      }

      this.g($$0);
      if ($$0.i() > 0.05) {
         this.r((float)axm.d($$0.e, $$0.c) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.n_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.cc[$$5] = this.ca[$$5];
         this.cb[$$5] = this.bZ[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.u($$6 + 1);
         bqa $$8 = null;
         if ($$7 > 0) {
            $$8 = this.dM().a($$7);
         }

         if ($$8 != null) {
            double $$9 = this.v($$6 + 1);
            double $$10 = this.w($$6 + 1);
            double $$11 = this.x($$6 + 1);
            double $$12 = $$8.dr() - $$9;
            double $$13 = $$8.dv() - $$10;
            double $$14 = $$8.dx() - $$11;
            double $$15 = Math.sqrt($$12 * $$12 + $$14 * $$14);
            float $$16 = (float)(axm.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(axm.d($$13, $$15) * 180.0F / (float)Math.PI));
            this.bZ[$$6] = this.a(this.bZ[$$6], $$17, 40.0F);
            this.ca[$$6] = this.a(this.ca[$$6], $$16, 10.0F);
         } else {
            this.ca[$$6] = this.a(this.ca[$$6], this.aX, 10.0F);
         }
      }

      boolean $$18 = this.a();

      for (int $$19 = 0; $$19 < 3; $$19++) {
         double $$20 = this.v($$19);
         double $$21 = this.w($$19);
         double $$22 = this.x($$19);
         float $$23 = 0.3F * this.eb();
         this.dM().a(kn.ac, $$20 + this.ag.k() * (double)$$23, $$21 + this.ag.k() * (double)$$23, $$22 + this.ag.k() * (double)$$23, 0.0, 0.0, 0.0);
         if ($$18 && this.dM().z.a(4) == 0) {
            this.dM().a(kn.v, $$20 + this.ag.k() * (double)$$23, $$21 + this.ag.k() * (double)$$23, $$22 + this.ag.k() * (double)$$23, 0.7F, 0.7F, 0.5);
         }
      }

      if (this.y() > 0) {
         float $$24 = 3.3F * this.eb();

         for (int $$25 = 0; $$25 < 3; $$25++) {
            this.dM().a(kn.v, this.dr() + this.ag.k(), this.dt() + (double)(this.ag.i() * $$24), this.dx() + this.ag.k(), 0.7F, 0.7F, 0.9F);
         }
      }
   }

   @Override
   protected void Y() {
      if (this.y() > 0) {
         int $$0 = this.y() - 1;
         this.cg.a(1.0F - (float)$$0 / 220.0F);
         if ($$0 <= 0) {
            this.dM().a(this, this.dr(), this.dv(), this.dx(), 7.0F, false, czg.a.c);
            if (!this.aU()) {
               this.dM().b(1023, this.dm(), 0);
            }
         }

         this.t($$0);
         if (this.ah % 10 == 0) {
            this.c(10.0F);
         }
      } else {
         super.Y();

         for (int $$1 = 1; $$1 < 3; $$1++) {
            if (this.ah >= this.cd[$$1 - 1]) {
               this.cd[$$1 - 1] = this.ah + 10 + this.ag.a(10);
               if ((this.dM().ak() == boc.c || this.dM().ak() == boc.d) && this.ce[$$1 - 1]++ > 15) {
                  float $$2 = 10.0F;
                  float $$3 = 5.0F;
                  double $$4 = axm.a(this.ag, this.dr() - 10.0, this.dr() + 10.0);
                  double $$5 = axm.a(this.ag, this.dt() - 5.0, this.dt() + 5.0);
                  double $$6 = axm.a(this.ag, this.dx() - 10.0, this.dx() + 10.0);
                  this.a($$1 + 1, $$4, $$5, $$6, true);
                  this.ce[$$1 - 1] = 0;
               }

               int $$7 = this.u($$1);
               if ($$7 > 0) {
                  bqt $$8 = (bqt)this.dM().a($$7);
                  if ($$8 != null && this.c($$8) && !(this.g((bqa)$$8) > 900.0) && this.E($$8)) {
                     this.a($$1 + 1, $$8);
                     this.cd[$$1 - 1] = this.ah + 40 + this.ag.a(20);
                     this.ce[$$1 - 1] = 0;
                  } else {
                     this.a($$1, 0);
                  }
               } else {
                  List<bqt> $$9 = this.dM().a(bqt.class, ci, this, this.cH().c(20.0, 8.0, 20.0));
                  if (!$$9.isEmpty()) {
                     bqt $$10 = $$9.get(this.ag.a($$9.size()));
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

         if (this.cf > 0) {
            this.cf--;
            if (this.cf == 0 && this.dM().aa().b(czc.c)) {
               boolean $$11 = false;
               int $$12 = axm.d(this.dg() / 2.0F + 1.0F);
               int $$13 = axm.d(this.dh());

               for (id $$14 : id.b(this.dq() - $$12, this.ds(), this.dw() - $$12, this.dq() + $$12, this.ds() + $$13, this.dw() + $$12)) {
                  dpi $$15 = this.dM().a_($$14);
                  if (d($$15)) {
                     $$11 = this.dM().a($$14, true, this) || $$11;
                  }
               }

               if ($$11) {
                  this.dM().a(null, 1022, this.dm(), 0);
               }
            }
         }

         if (this.ah % 20 == 0) {
            this.c(1.0F);
         }

         this.cg.a(this.ex() / this.eO());
      }
   }

   public static boolean d(dpi $$0) {
      return !$$0.i() && !$$0.a(ave.aE);
   }

   @Override
   public void r() {
      this.t(220);
      this.cg.a(0.0F);
      this.t(this.eO() / 3.0F);
   }

   @Override
   public void a(dpi $$0, esj $$1) {
   }

   @Override
   public void c(apv $$0) {
      super.c($$0);
      this.cg.a($$0);
   }

   @Override
   public void d(apv $$0) {
      super.d($$0);
      this.cg.b($$0);
   }

   private double v(int $$0) {
      if ($$0 <= 0) {
         return this.dr();
      } else {
         float $$1 = (this.aX + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = axm.b($$1);
         return this.dr() + (double)$$2 * 1.3 * (double)this.eb();
      }
   }

   private double w(int $$0) {
      float $$1 = $$0 <= 0 ? 3.0F : 2.2F;
      return this.dt() + (double)($$1 * this.eb());
   }

   private double x(int $$0) {
      if ($$0 <= 0) {
         return this.dx();
      } else {
         float $$1 = (this.aX + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = axm.a($$1);
         return this.dx() + (double)$$2 * 1.3 * (double)this.eb();
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = axm.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, bqt $$1) {
      this.a($$0, $$1.dr(), $$1.dt() + (double)$$1.cI() * 0.5, $$1.dx(), $$0 == 0 && this.ag.i() < 0.001F);
   }

   private void a(int $$0, double $$1, double $$2, double $$3, boolean $$4) {
      if (!this.aU()) {
         this.dM().a(null, 1024, this.dm(), 0);
      }

      double $$5 = this.v($$0);
      double $$6 = this.w($$0);
      double $$7 = this.x($$0);
      double $$8 = $$1 - $$5;
      double $$9 = $$2 - $$6;
      double $$10 = $$3 - $$7;
      clg $$11 = new clg(this.dM(), this, $$8, $$9, $$10);
      $$11.c(this);
      if ($$4) {
         $$11.a(true);
      }

      $$11.p($$5, $$6, $$7);
      this.dM().b($$11);
   }

   @Override
   public void a(bqt $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(boy $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.a(avg.u) || $$0.d() instanceof cfy) {
         return false;
      } else if (this.y() > 0 && !$$0.a(avg.e)) {
         return false;
      } else {
         if (this.a()) {
            bqa $$2 = $$0.c();
            if ($$2 instanceof ckg) {
               return false;
            }
         }

         bqa $$3 = $$0.d();
         if ($$3 != null && $$3.ai().a(avh.y)) {
            return false;
         } else {
            if (this.cf <= 0) {
               this.cf = 20;
            }

            for (int $$4 = 0; $$4 < this.ce.length; $$4++) {
               this.ce[$$4] = this.ce[$$4] + 3;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void a(boy $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      cgk $$3 = this.a(crv.uq);
      if ($$3 != null) {
         $$3.A();
      }
   }

   @Override
   public void dy() {
      if (this.dM().ak() == boc.a && this.W()) {
         this.am();
      } else {
         this.be = 0;
      }
   }

   @Override
   public boolean b(bpm $$0, @Nullable bqa $$1) {
      return false;
   }

   public static brz.a u() {
      return chg.gt().a(bsa.q, 300.0).a(bsa.r, 0.6F).a(bsa.j, 0.6F).a(bsa.k, 40.0).a(bsa.a, 4.0);
   }

   public float b(int $$0) {
      return this.ca[$$0];
   }

   public float c(int $$0) {
      return this.bZ[$$0];
   }

   public int y() {
      return this.an.a(bX);
   }

   public void t(int $$0) {
      this.an.a(bX, $$0);
   }

   public int u(int $$0) {
      return this.an.a(e.get($$0));
   }

   public void a(int $$0, int $$1) {
      this.an.a(e.get($$0), $$1);
   }

   @Override
   public boolean a() {
      return this.ex() <= this.eO() / 2.0F;
   }

   @Override
   protected boolean o(bqa $$0) {
      return false;
   }

   @Override
   public boolean ct() {
      return false;
   }

   @Override
   public boolean c(bpm $$0) {
      return $$0.a(bpo.t) ? false : super.c($$0);
   }

   class a extends bxq {
      public a() {
         this.a(EnumSet.of(bxq.a.a, bxq.a.c, bxq.a.b));
      }

      @Override
      public boolean a() {
         return cfy.this.y() > 0;
      }
   }
}
