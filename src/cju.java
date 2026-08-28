import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cju extends cld implements clh {
   private static final akh<Integer> b = akl.a(cju.class, akj.b);
   private static final akh<Integer> c = akl.a(cju.class, akj.b);
   private static final akh<Integer> d = akl.a(cju.class, akj.b);
   private static final List<akh<Integer>> e = ImmutableList.of(b, c, d);
   private static final akh<Integer> bY = akl.a(cju.class, akj.b);
   private static final int bZ = 220;
   private final float[] ca = new float[2];
   private final float[] cb = new float[2];
   private final float[] cc = new float[2];
   private final float[] cd = new float[2];
   private final int[] ce = new int[2];
   private final int[] cf = new int[2];
   private int cg;
   private final arg ch = (arg)new arg(this.R_(), bri.a.f, bri.b.a).a(true);
   private static final Predicate<bun> ci = $$0 -> !$$0.ao().a(awz.y) && $$0.fI();
   private static final cfd cj = cfd.a().a(20.0).a(ci);

   public cju(bty<? extends cju> $$0, dej $$1) {
      super($$0, $$1);
      this.bP = new cak(this, 10, false);
      this.x(this.eQ());
      this.bN = 50;
   }

   @Override
   protected cdy b(dej $$0) {
      cdw $$1 = new cdw(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void D() {
      this.bS.a(0, new cju.a());
      this.bS.a(2, new ccj(this, 1.0, 40, 20.0F));
      this.bS.a(5, new ccw(this, 1.0));
      this.bS.a(6, new cbs(this, cnx.class, 8.0F));
      this.bS.a(7, new ccf(this));
      this.bT.a(1, new cdc(this));
      this.bT.a(2, new cdd<>(this, bun.class, 0, false, false, ci));
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(b, 0);
      $$0.a(c, 0);
      $$0.a(d, 0);
      $$0.a(bY, 0);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("Invul", this.gp());
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.b($$0.h("Invul"));
      if (this.ak()) {
         this.ch.a(this.R_());
      }
   }

   @Override
   public void b(@Nullable xe $$0) {
      super.b($$0);
      this.ch.a(this.R_());
   }

   @Override
   protected awf w() {
      return awg.CE;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.CH;
   }

   @Override
   protected awf o_() {
      return awg.CG;
   }

   @Override
   public void n_() {
      eyw $$0 = this.dv().d(1.0, 0.6, 1.0);
      if (!this.dS().B && this.c(0) > 0) {
         btr $$1 = this.dS().a(this.c(0));
         if ($$1 != null) {
            double $$2 = $$0.e;
            if (this.dz() < $$1.dz() || !this.gq() && this.dz() < $$1.dz() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new eyw($$0.d, $$2, $$0.f);
            eyw $$3 = new eyw($$1.dx() - this.dx(), 0.0, $$1.dD() - this.dD());
            if ($$3.j() > 9.0) {
               eyw $$4 = $$3.d();
               $$0 = $$0.b($$4.d * 0.3 - $$0.d * 0.6, 0.0, $$4.f * 0.3 - $$0.f * 0.6);
            }
         }
      }

      this.h($$0);
      if ($$0.j() > 0.05) {
         this.v((float)azf.d($$0.f, $$0.d) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.n_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.cd[$$5] = this.cb[$$5];
         this.cc[$$5] = this.ca[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.c($$6 + 1);
         btr $$8 = null;
         if ($$7 > 0) {
            $$8 = this.dS().a($$7);
         }

         if ($$8 != null) {
            double $$9 = this.s($$6 + 1);
            double $$10 = this.t($$6 + 1);
            double $$11 = this.u($$6 + 1);
            double $$12 = $$8.dx() - $$9;
            double $$13 = $$8.dB() - $$10;
            double $$14 = $$8.dD() - $$11;
            double $$15 = Math.sqrt($$12 * $$12 + $$14 * $$14);
            float $$16 = (float)(azf.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(azf.d($$13, $$15) * 180.0F / (float)Math.PI));
            this.ca[$$6] = this.a(this.ca[$$6], $$17, 40.0F);
            this.cb[$$6] = this.a(this.cb[$$6], $$16, 10.0F);
         } else {
            this.cb[$$6] = this.a(this.cb[$$6], this.aT, 10.0F);
         }
      }

      boolean $$18 = this.gq();

      for (int $$19 = 0; $$19 < 3; $$19++) {
         double $$20 = this.s($$19);
         double $$21 = this.t($$19);
         double $$22 = this.u($$19);
         float $$23 = 0.3F * this.eg();
         this.dS().a(lo.ae, $$20 + this.af.k() * (double)$$23, $$21 + this.af.k() * (double)$$23, $$22 + this.af.k() * (double)$$23, 0.0, 0.0, 0.0);
         if ($$18 && this.dS().z.a(4) == 0) {
            this.dS()
               .a(
                  lh.a(lo.u, 0.7F, 0.7F, 0.5F),
                  $$20 + this.af.k() * (double)$$23,
                  $$21 + this.af.k() * (double)$$23,
                  $$22 + this.af.k() * (double)$$23,
                  0.0,
                  0.0,
                  0.0
               );
         }
      }

      if (this.gp() > 0) {
         float $$24 = 3.3F * this.eg();

         for (int $$25 = 0; $$25 < 3; $$25++) {
            this.dS()
               .a(lh.a(lo.u, 0.7F, 0.7F, 0.9F), this.dx() + this.af.k(), this.dz() + (double)(this.af.i() * $$24), this.dD() + this.af.k(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void ac() {
      if (this.gp() > 0) {
         int $$0 = this.gp() - 1;
         this.ch.a(1.0F - (float)$$0 / 220.0F);
         if ($$0 <= 0) {
            this.dS().a(this, this.dx(), this.dB(), this.dD(), 7.0F, false, dej.a.c);
            if (!this.ba()) {
               this.dS().b(1023, this.ds(), 0);
            }
         }

         this.b($$0);
         if (this.ag % 10 == 0) {
            this.c(10.0F);
         }
      } else {
         super.ac();

         for (int $$1 = 1; $$1 < 3; $$1++) {
            if (this.ag >= this.ce[$$1 - 1]) {
               this.ce[$$1 - 1] = this.ag + 10 + this.af.a(10);
               if ((this.dS().am() == brp.c || this.dS().am() == brp.d) && this.cf[$$1 - 1]++ > 15) {
                  float $$2 = 10.0F;
                  float $$3 = 5.0F;
                  double $$4 = azf.a(this.af, this.dx() - 10.0, this.dx() + 10.0);
                  double $$5 = azf.a(this.af, this.dz() - 5.0, this.dz() + 5.0);
                  double $$6 = azf.a(this.af, this.dD() - 10.0, this.dD() + 10.0);
                  this.a($$1 + 1, $$4, $$5, $$6, true);
                  this.cf[$$1 - 1] = 0;
               }

               int $$7 = this.c($$1);
               if ($$7 > 0) {
                  bun $$8 = (bun)this.dS().a($$7);
                  if ($$8 != null && this.c($$8) && !(this.g((btr)$$8) > 900.0) && this.G($$8)) {
                     this.a($$1 + 1, $$8);
                     this.ce[$$1 - 1] = this.ag + 40 + this.af.a(20);
                     this.cf[$$1 - 1] = 0;
                  } else {
                     this.a($$1, 0);
                  }
               } else {
                  List<bun> $$9 = this.dS().a(bun.class, cj, this, this.cO().c(20.0, 8.0, 20.0));
                  if (!$$9.isEmpty()) {
                     bun $$10 = $$9.get(this.af.a($$9.size()));
                     this.a($$1, $$10.ap());
                  }
               }
            }
         }

         if (this.m() != null) {
            this.a(0, this.m().ap());
         } else {
            this.a(0, 0);
         }

         if (this.cg > 0) {
            this.cg--;
            if (this.cg == 0 && this.dS().ac().b(def.c)) {
               boolean $$11 = false;
               int $$12 = azf.d(this.dn() / 2.0F + 1.0F);
               int $$13 = azf.d(this.do());

               for (jf $$14 : jf.b(this.dw() - $$12, this.dy(), this.dC() - $$12, this.dw() + $$12, this.dy() + $$13, this.dC() + $$12)) {
                  dus $$15 = this.dS().a_($$14);
                  if (c($$15)) {
                     $$11 = this.dS().a($$14, true, this) || $$11;
                  }
               }

               if ($$11) {
                  this.dS().a(null, 1022, this.ds(), 0);
               }
            }
         }

         if (this.ag % 20 == 0) {
            this.c(1.0F);
         }

         this.ch.a(this.eB() / this.eQ());
      }
   }

   public static boolean c(dus $$0) {
      return !$$0.l() && !$$0.a(awv.aF);
   }

   @Override
   public void q() {
      this.b(220);
      this.ch.a(0.0F);
      this.x(this.eQ() / 3.0F);
   }

   @Override
   public void a(dus $$0, eyw $$1) {
   }

   @Override
   public void d(ark $$0) {
      super.d($$0);
      this.ch.a($$0);
   }

   @Override
   public void e(ark $$0) {
      super.e($$0);
      this.ch.b($$0);
   }

   private double s(int $$0) {
      if ($$0 <= 0) {
         return this.dx();
      } else {
         float $$1 = (this.aT + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = azf.b($$1);
         return this.dx() + (double)$$2 * 1.3 * (double)this.eg();
      }
   }

   private double t(int $$0) {
      float $$1 = $$0 <= 0 ? 3.0F : 2.2F;
      return this.dz() + (double)($$1 * this.eg());
   }

   private double u(int $$0) {
      if ($$0 <= 0) {
         return this.dD();
      } else {
         float $$1 = (this.aT + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = azf.a($$1);
         return this.dD() + (double)$$2 * 1.3 * (double)this.eg();
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = azf.h($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, bun $$1) {
      this.a($$0, $$1.dx(), $$1.dz() + (double)$$1.cP() * 0.5, $$1.dD(), $$0 == 0 && this.af.i() < 0.001F);
   }

   private void a(int $$0, double $$1, double $$2, double $$3, boolean $$4) {
      if (!this.ba()) {
         this.dS().a(null, 1024, this.ds(), 0);
      }

      double $$5 = this.s($$0);
      double $$6 = this.t($$0);
      double $$7 = this.u($$0);
      double $$8 = $$1 - $$5;
      double $$9 = $$2 - $$6;
      double $$10 = $$3 - $$7;
      eyw $$11 = new eyw($$8, $$9, $$10);
      cpf $$12 = new cpf(this.dS(), this, $$11.d());
      $$12.c(this);
      if ($$4) {
         $$12.a(true);
      }

      $$12.a_($$5, $$6, $$7);
      this.dS().b($$12);
   }

   @Override
   public void a(bun $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.a(awx.t) || $$0.d() instanceof cju) {
         return false;
      } else if (this.gp() > 0 && !$$0.a(awx.d)) {
         return false;
      } else {
         if (this.gq()) {
            btr $$2 = $$0.c();
            if ($$2 instanceof coe || $$2 instanceof cpj) {
               return false;
            }
         }

         btr $$3 = $$0.d();
         if ($$3 != null && $$3.ao().a(awz.y)) {
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
   protected void a(arj $$0, bsj $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      ckh $$3 = this.a(cvw.uu);
      if ($$3 != null) {
         $$3.y();
      }
   }

   @Override
   public void dE() {
      if (this.dS().am() == brp.a && this.aa()) {
         this.as();
      } else {
         this.bb = 0;
      }
   }

   @Override
   public boolean b(bsy $$0, @Nullable btr $$1) {
      return false;
   }

   public static bvt.a t() {
      return cld.gu().a(bvu.s, 300.0).a(bvu.v, 0.6F).a(bvu.l, 0.6F).a(bvu.m, 40.0).a(bvu.a, 4.0);
   }

   public float[] y() {
      return this.cb;
   }

   public float[] go() {
      return this.ca;
   }

   public int gp() {
      return this.am.a(bY);
   }

   public void b(int $$0) {
      this.am.a(bY, $$0);
   }

   public int c(int $$0) {
      return this.am.a(e.get($$0));
   }

   public void a(int $$0, int $$1) {
      this.am.a(e.get($$0), $$1);
   }

   public boolean gq() {
      return this.eB() <= this.eQ() / 2.0F;
   }

   @Override
   protected boolean o(btr $$0) {
      return false;
   }

   @Override
   public boolean o(boolean $$0) {
      return false;
   }

   @Override
   public boolean b(bsy $$0) {
      return $$0.a(bta.t) ? false : super.b($$0);
   }

   class a extends cbk {
      public a() {
         this.a(EnumSet.of(cbk.a.a, cbk.a.c, cbk.a.b));
      }

      @Override
      public boolean b() {
         return cju.this.gp() > 0;
      }
   }
}
