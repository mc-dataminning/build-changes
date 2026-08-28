import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class clj extends cms implements cmw {
   private static final alc<Integer> a = alg.a(clj.class, ale.b);
   private static final alc<Integer> b = alg.a(clj.class, ale.b);
   private static final alc<Integer> c = alg.a(clj.class, ale.b);
   private static final List<alc<Integer>> d = ImmutableList.of(a, b, c);
   private static final alc<Integer> bZ = alg.a(clj.class, ale.b);
   private static final int ca = 220;
   private final float[] cb = new float[2];
   private final float[] cc = new float[2];
   private final float[] cd = new float[2];
   private final float[] ce = new float[2];
   private final int[] cf = new int[2];
   private final int[] cg = new int[2];
   private int ch;
   private final asd ci = (asd)new asd(this.p_(), bsu.a.f, bsu.b.a).a(true);
   private static final cgs.a cj = ($$0, $$1) -> !$$0.aq().a(axy.y) && $$0.fK();
   private static final cgs ck = cgs.a().a(20.0).a(cj);

   public clj(bvm<? extends clj> $$0, dha $$1) {
      super($$0, $$1);
      this.bQ = new cbz(this, 10, false);
      this.x(this.eR());
      this.bO = 50;
   }

   @Override
   protected cfn b(dha $$0) {
      cfl $$1 = new cfl(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void B() {
      this.bT.a(0, new clj.a());
      this.bT.a(2, new cdy(this, 1.0, 40, 20.0F));
      this.bT.a(5, new cel(this, 1.0));
      this.bT.a(6, new cdh(this, cps.class, 8.0F));
      this.bT.a(7, new cdu(this));
      this.bU.a(1, new cer(this));
      this.bU.a(2, new ces<>(this, bwb.class, 0, false, false, cj));
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(a, 0);
      $$0.a(b, 0);
      $$0.a(c, 0);
      $$0.a(bZ, 0);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("Invul", this.gm());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.b($$0.h("Invul"));
      if (this.l_()) {
         this.ci.a(this.p_());
      }
   }

   @Override
   public void b(@Nullable xv $$0) {
      super.b($$0);
      this.ci.a(this.p_());
   }

   @Override
   protected axe u() {
      return axf.CW;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.CZ;
   }

   @Override
   protected axe o_() {
      return axf.CY;
   }

   @Override
   public void d_() {
      fbs $$0 = this.dy().d(1.0, 0.6, 1.0);
      if (!this.dV().C && this.c(0) > 0) {
         bvf $$1 = this.dV().a(this.c(0));
         if ($$1 != null) {
            double $$2 = $$0.e;
            if (this.dC() < $$1.dC() || !this.gn() && this.dC() < $$1.dC() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new fbs($$0.d, $$2, $$0.f);
            fbs $$3 = new fbs($$1.dA() - this.dA(), 0.0, $$1.dG() - this.dG());
            if ($$3.j() > 9.0) {
               fbs $$4 = $$3.d();
               $$0 = $$0.b($$4.d * 0.3 - $$0.d * 0.6, 0.0, $$4.f * 0.3 - $$0.f * 0.6);
            }
         }
      }

      this.h($$0);
      if ($$0.j() > 0.05) {
         this.v((float)bae.d($$0.f, $$0.d) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.d_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.ce[$$5] = this.cc[$$5];
         this.cd[$$5] = this.cb[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.c($$6 + 1);
         bvf $$8 = null;
         if ($$7 > 0) {
            $$8 = this.dV().a($$7);
         }

         if ($$8 != null) {
            double $$9 = this.r($$6 + 1);
            double $$10 = this.s($$6 + 1);
            double $$11 = this.t($$6 + 1);
            double $$12 = $$8.dA() - $$9;
            double $$13 = $$8.dE() - $$10;
            double $$14 = $$8.dG() - $$11;
            double $$15 = Math.sqrt($$12 * $$12 + $$14 * $$14);
            float $$16 = (float)(bae.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(bae.d($$13, $$15) * 180.0F / (float)Math.PI));
            this.cb[$$6] = this.a(this.cb[$$6], $$17, 40.0F);
            this.cc[$$6] = this.a(this.cc[$$6], $$16, 10.0F);
         } else {
            this.cc[$$6] = this.a(this.cc[$$6], this.aX, 10.0F);
         }
      }

      boolean $$18 = this.gn();

      for (int $$19 = 0; $$19 < 3; $$19++) {
         double $$20 = this.r($$19);
         double $$21 = this.s($$19);
         double $$22 = this.t($$19);
         float $$23 = 0.3F * this.ej();
         this.dV().a(ls.af, $$20 + this.ae.k() * (double)$$23, $$21 + this.ae.k() * (double)$$23, $$22 + this.ae.k() * (double)$$23, 0.0, 0.0, 0.0);
         if ($$18 && this.dV().A.a(4) == 0) {
            this.dV()
               .a(
                  ll.a(ls.u, 0.7F, 0.7F, 0.5F),
                  $$20 + this.ae.k() * (double)$$23,
                  $$21 + this.ae.k() * (double)$$23,
                  $$22 + this.ae.k() * (double)$$23,
                  0.0,
                  0.0,
                  0.0
               );
         }
      }

      if (this.gm() > 0) {
         float $$24 = 3.3F * this.ej();

         for (int $$25 = 0; $$25 < 3; $$25++) {
            this.dV()
               .a(ll.a(ls.u, 0.7F, 0.7F, 0.9F), this.dA() + this.ae.k(), this.dC() + (double)(this.ae.i() * $$24), this.dG() + this.ae.k(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(ash $$0) {
      if (this.gm() > 0) {
         int $$1 = this.gm() - 1;
         this.ci.a(1.0F - (float)$$1 / 220.0F);
         if ($$1 <= 0) {
            $$0.a(this, this.dA(), this.dE(), this.dG(), 7.0F, false, dha.a.c);
            if (!this.bb()) {
               $$0.b(1023, this.dv(), 0);
            }
         }

         this.b($$1);
         if (this.af % 10 == 0) {
            this.c(10.0F);
         }
      } else {
         super.a($$0);

         for (int $$2 = 1; $$2 < 3; $$2++) {
            if (this.af >= this.cf[$$2 - 1]) {
               this.cf[$$2 - 1] = this.af + 10 + this.ae.a(10);
               if (($$0.al() == btb.c || $$0.al() == btb.d) && this.cg[$$2 - 1]++ > 15) {
                  float $$3 = 10.0F;
                  float $$4 = 5.0F;
                  double $$5 = bae.a(this.ae, this.dA() - 10.0, this.dA() + 10.0);
                  double $$6 = bae.a(this.ae, this.dC() - 5.0, this.dC() + 5.0);
                  double $$7 = bae.a(this.ae, this.dG() - 10.0, this.dG() + 10.0);
                  this.a($$2 + 1, $$5, $$6, $$7, true);
                  this.cg[$$2 - 1] = 0;
               }

               int $$8 = this.c($$2);
               if ($$8 > 0) {
                  bwb $$9 = (bwb)$$0.a($$8);
                  if ($$9 != null && this.c($$9) && !(this.g((bvf)$$9) > 900.0) && this.E($$9)) {
                     this.a($$2 + 1, $$9);
                     this.cf[$$2 - 1] = this.af + 40 + this.ae.a(20);
                     this.cg[$$2 - 1] = 0;
                  } else {
                     this.a($$2, 0);
                  }
               } else {
                  List<bwb> $$10 = $$0.a(bwb.class, ck, this, this.cR().c(20.0, 8.0, 20.0));
                  if (!$$10.isEmpty()) {
                     bwb $$11 = $$10.get(this.ae.a($$10.size()));
                     this.a($$2, $$11.ar());
                  }
               }
            }
         }

         if (this.O_() != null) {
            this.a(0, this.O_().ar());
         } else {
            this.a(0, 0);
         }

         if (this.ch > 0) {
            this.ch--;
            if (this.ch == 0 && $$0.N().b(dgw.c)) {
               boolean $$12 = false;
               int $$13 = bae.d(this.dq() / 2.0F + 1.0F);
               int $$14 = bae.d(this.dr());

               for (jh $$15 : jh.b(this.dz() - $$13, this.dB(), this.dF() - $$13, this.dz() + $$13, this.dB() + $$14, this.dF() + $$13)) {
                  dxn $$16 = $$0.a_($$15);
                  if (c($$16)) {
                     $$12 = $$0.a($$15, true, this) || $$12;
                  }
               }

               if ($$12) {
                  $$0.a(null, 1022, this.dv(), 0);
               }
            }
         }

         if (this.af % 20 == 0) {
            this.c(1.0F);
         }

         this.ci.a(this.eD() / this.eR());
      }
   }

   public static boolean c(dxn $$0) {
      return !$$0.l() && !$$0.a(axu.aH);
   }

   @Override
   public void m() {
      this.b(220);
      this.ci.a(0.0F);
      this.x(this.eR() / 3.0F);
   }

   @Override
   public void a(dxn $$0, fbs $$1) {
   }

   @Override
   public void d(asi $$0) {
      super.d($$0);
      this.ci.a($$0);
   }

   @Override
   public void e(asi $$0) {
      super.e($$0);
      this.ci.b($$0);
   }

   private double r(int $$0) {
      if ($$0 <= 0) {
         return this.dA();
      } else {
         float $$1 = (this.aX + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = bae.b($$1);
         return this.dA() + (double)$$2 * 1.3 * (double)this.ej();
      }
   }

   private double s(int $$0) {
      float $$1 = $$0 <= 0 ? 3.0F : 2.2F;
      return this.dC() + (double)($$1 * this.ej());
   }

   private double t(int $$0) {
      if ($$0 <= 0) {
         return this.dG();
      } else {
         float $$1 = (this.aX + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = bae.a($$1);
         return this.dG() + (double)$$2 * 1.3 * (double)this.ej();
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = bae.h($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, bwb $$1) {
      this.a($$0, $$1.dA(), $$1.dC() + (double)$$1.cS() * 0.5, $$1.dG(), $$0 == 0 && this.ae.i() < 0.001F);
   }

   private void a(int $$0, double $$1, double $$2, double $$3, boolean $$4) {
      if (!this.bb()) {
         this.dV().a(null, 1024, this.dv(), 0);
      }

      double $$5 = this.r($$0);
      double $$6 = this.s($$0);
      double $$7 = this.t($$0);
      double $$8 = $$1 - $$5;
      double $$9 = $$2 - $$6;
      double $$10 = $$3 - $$7;
      fbs $$11 = new fbs($$8, $$9, $$10);
      cqz $$12 = new cqz(this.dV(), this, $$11.d());
      $$12.c(this);
      if ($$4) {
         $$12.a(true);
      }

      $$12.a_($$5, $$6, $$7);
      this.dV().b($$12);
   }

   @Override
   public void a(bwb $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(ash $$0, btv $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if ($$1.a(axw.t) || $$1.d() instanceof clj) {
         return false;
      } else if (this.gm() > 0 && !$$1.a(axw.d)) {
         return false;
      } else {
         if (this.gn()) {
            bvf $$3 = $$1.c();
            if ($$3 instanceof cpz || $$3 instanceof crd) {
               return false;
            }
         }

         bvf $$4 = $$1.d();
         if ($$4 != null && $$4.aq().a(axy.y)) {
            return false;
         } else {
            if (this.ch <= 0) {
               this.ch = 20;
            }

            for (int $$5 = 0; $$5 < this.cg.length; $$5++) {
               this.cg[$$5] = this.cg[$$5] + 3;
            }

            return super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(ash $$0, btv $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      clw $$3 = this.a($$0, cxo.vi);
      if ($$3 != null) {
         $$3.x();
      }
   }

   @Override
   public void dH() {
      if (this.dV().al() == btb.a && this.X()) {
         this.at();
      } else {
         this.bf = 0;
      }
   }

   @Override
   public boolean b(buk $$0, @Nullable bvf $$1) {
      return false;
   }

   public static bxi.a p() {
      return cms.gr().a(bxj.s, 300.0).a(bxj.v, 0.6F).a(bxj.l, 0.6F).a(bxj.m, 40.0).a(bxj.a, 4.0);
   }

   public float[] t() {
      return this.cc;
   }

   public float[] x() {
      return this.cb;
   }

   public int gm() {
      return this.al.a(bZ);
   }

   public void b(int $$0) {
      this.al.a(bZ, $$0);
   }

   public int c(int $$0) {
      return this.al.a(d.get($$0));
   }

   public void a(int $$0, int $$1) {
      this.al.a(d.get($$0), $$1);
   }

   public boolean gn() {
      return this.eD() <= this.eR() / 2.0F;
   }

   @Override
   protected boolean o(bvf $$0) {
      return false;
   }

   @Override
   public boolean o(boolean $$0) {
      return false;
   }

   @Override
   public boolean b(buk $$0) {
      return $$0.a(bum.t) ? false : super.b($$0);
   }

   class a extends ccz {
      public a() {
         this.a(EnumSet.of(ccz.a.a, ccz.a.c, ccz.a.b));
      }

      @Override
      public boolean b() {
         return clj.this.gm() > 0;
      }
   }
}
