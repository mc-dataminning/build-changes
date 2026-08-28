import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cnr extends cpb implements cpf {
   private static final akn<Integer> a = akr.a(cnr.class, akp.b);
   private static final akn<Integer> b = akr.a(cnr.class, akp.b);
   private static final akn<Integer> c = akr.a(cnr.class, akp.b);
   private static final List<akn<Integer>> d = ImmutableList.of(a, b, c);
   private static final akn<Integer> e = akr.a(cnr.class, akp.b);
   private static final int f = 220;
   private static final int bI = 0;
   private final float[] bJ = new float[2];
   private final float[] bK = new float[2];
   private final float[] bL = new float[2];
   private final float[] bM = new float[2];
   private final int[] bN = new int[2];
   private final int[] bO = new int[2];
   private int bP;
   private final arq bQ = (arq)new arq(this.m_(), buj.a.f, buj.b.a).a(true);
   private static final cil.a bR = ($$0, $$1) -> !$$0.an().a(axj.y) && $$0.fM();
   private static final cil bS = cil.a().a(20.0).a(bR);

   public cnr(bxe<? extends cnr> $$0, djz $$1) {
      super($$0, $$1);
      this.bC = new cds(this, 10, false);
      this.d(this.eU());
      this.bA = 50;
   }

   @Override
   protected chg b(djz $$0) {
      che $$1 = new che(this, $$0);
      $$1.b(false);
      $$1.a(true);
      return $$1;
   }

   @Override
   protected void D() {
      this.bF.a(0, new cnr.a());
      this.bF.a(2, new cfr(this, 1.0, 40, 20.0F));
      this.bF.a(5, new cge(this, 1.0));
      this.bF.a(6, new cfa(this, crz.class, 8.0F));
      this.bF.a(7, new cfn(this));
      this.bG.a(1, new cgk(this));
      this.bG.a(2, new cgl<>(this, bxw.class, 0, false, false, bR));
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(a, 0);
      $$0.a(b, 0);
      $$0.a(c, 0);
      $$0.a(e, 0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Invul", this.t());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.b($$0.b("Invul", 0));
      if (this.h_()) {
         this.bQ.a(this.m_());
      }
   }

   @Override
   public void b(@Nullable xc $$0) {
      super.b($$0);
      this.bQ.a(this.m_());
   }

   @Override
   protected awq u() {
      return awr.DC;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.DF;
   }

   @Override
   protected awq l_() {
      return awr.DE;
   }

   @Override
   public void k_() {
      ffs $$0 = this.dy().d(1.0, 0.6, 1.0);
      if (!this.dV().C && this.c(0) > 0) {
         bwv $$1 = this.dV().a(this.c(0));
         if ($$1 != null) {
            double $$2 = $$0.e;
            if (this.dC() < $$1.dC() || !this.x() && this.dC() < $$1.dC() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new ffs($$0.d, $$2, $$0.f);
            ffs $$3 = new ffs($$1.dA() - this.dA(), 0.0, $$1.dG() - this.dG());
            if ($$3.j() > 9.0) {
               ffs $$4 = $$3.d();
               $$0 = $$0.b($$4.d * 0.3 - $$0.d * 0.6, 0.0, $$4.f * 0.3 - $$0.f * 0.6);
            }
         }
      }

      this.i($$0);
      if ($$0.j() > 0.05) {
         this.w((float)azq.d($$0.f, $$0.d) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.k_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.bM[$$5] = this.bK[$$5];
         this.bL[$$5] = this.bJ[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.c($$6 + 1);
         bwv $$8 = null;
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
            float $$16 = (float)(azq.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(azq.d($$13, $$15) * 180.0F / (float)Math.PI));
            this.bJ[$$6] = this.a(this.bJ[$$6], $$17, 40.0F);
            this.bK[$$6] = this.a(this.bK[$$6], $$16, 10.0F);
         } else {
            this.bK[$$6] = this.a(this.bK[$$6], this.aV, 10.0F);
         }
      }

      boolean $$18 = this.x();

      for (int $$19 = 0; $$19 < 3; $$19++) {
         double $$20 = this.r($$19);
         double $$21 = this.s($$19);
         double $$22 = this.t($$19);
         float $$23 = 0.3F * this.el();
         this.dV().a(lz.ah, $$20 + this.ae.k() * (double)$$23, $$21 + this.ae.k() * (double)$$23, $$22 + this.ae.k() * (double)$$23, 0.0, 0.0, 0.0);
         if ($$18 && this.dV().A.a(4) == 0) {
            this.dV()
               .a(
                  ls.a(lz.u, 0.7F, 0.7F, 0.5F),
                  $$20 + this.ae.k() * (double)$$23,
                  $$21 + this.ae.k() * (double)$$23,
                  $$22 + this.ae.k() * (double)$$23,
                  0.0,
                  0.0,
                  0.0
               );
         }
      }

      if (this.t() > 0) {
         float $$24 = 3.3F * this.el();

         for (int $$25 = 0; $$25 < 3; $$25++) {
            this.dV()
               .a(ls.a(lz.u, 0.7F, 0.7F, 0.9F), this.dA() + this.ae.k(), this.dC() + (double)(this.ae.i() * $$24), this.dG() + this.ae.k(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(aru $$0) {
      if (this.t() > 0) {
         int $$1 = this.t() - 1;
         this.bQ.a(1.0F - (float)$$1 / 220.0F);
         if ($$1 <= 0) {
            $$0.a(this, this.dA(), this.dE(), this.dG(), 7.0F, false, djz.a.c);
            if (!this.ba()) {
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
            if (this.af >= this.bN[$$2 - 1]) {
               this.bN[$$2 - 1] = this.af + 10 + this.ae.a(10);
               if (($$0.an() == buq.c || $$0.an() == buq.d) && this.bO[$$2 - 1]++ > 15) {
                  float $$3 = 10.0F;
                  float $$4 = 5.0F;
                  double $$5 = azq.a(this.ae, this.dA() - 10.0, this.dA() + 10.0);
                  double $$6 = azq.a(this.ae, this.dC() - 5.0, this.dC() + 5.0);
                  double $$7 = azq.a(this.ae, this.dG() - 10.0, this.dG() + 10.0);
                  this.a($$2 + 1, $$5, $$6, $$7, true);
                  this.bO[$$2 - 1] = 0;
               }

               int $$8 = this.c($$2);
               if ($$8 > 0) {
                  bxw $$9 = (bxw)$$0.a($$8);
                  if ($$9 != null && this.c($$9) && !(this.g((bwv)$$9) > 900.0) && this.E($$9)) {
                     this.a($$2 + 1, $$9);
                     this.bN[$$2 - 1] = this.af + 40 + this.ae.a(20);
                     this.bO[$$2 - 1] = 0;
                  } else {
                     this.a($$2, 0);
                  }
               } else {
                  List<bxw> $$10 = $$0.a(bxw.class, bS, this, this.cR().c(20.0, 8.0, 20.0));
                  if (!$$10.isEmpty()) {
                     bxw $$11 = $$10.get(this.ae.a($$10.size()));
                     this.a($$2, $$11.ao());
                  }
               }
            }
         }

         if (this.f() != null) {
            this.a(0, this.f().ao());
         } else {
            this.a(0, 0);
         }

         if (this.bP > 0) {
            this.bP--;
            if (this.bP == 0 && $$0.O().c(djv.d)) {
               boolean $$12 = false;
               int $$13 = azq.d(this.dq() / 2.0F + 1.0F);
               int $$14 = azq.d(this.dr());

               for (iw $$15 : iw.b(this.dz() - $$13, this.dB(), this.dF() - $$13, this.dz() + $$13, this.dB() + $$14, this.dF() + $$13)) {
                  ebg $$16 = $$0.a_($$15);
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

         this.bQ.a(this.eG() / this.eU());
      }
   }

   public static boolean c(ebg $$0) {
      return !$$0.l() && !$$0.a(axg.aH);
   }

   @Override
   public void j() {
      this.b(220);
      this.bQ.a(0.0F);
      this.d(this.eU() / 3.0F);
   }

   @Override
   public void a(ebg $$0, ffs $$1) {
   }

   @Override
   public void d(arv $$0) {
      super.d($$0);
      this.bQ.a($$0);
   }

   @Override
   public void e(arv $$0) {
      super.e($$0);
      this.bQ.b($$0);
   }

   private double r(int $$0) {
      if ($$0 <= 0) {
         return this.dA();
      } else {
         float $$1 = (this.aV + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = azq.b($$1);
         return this.dA() + (double)$$2 * 1.3 * (double)this.el();
      }
   }

   private double s(int $$0) {
      float $$1 = $$0 <= 0 ? 3.0F : 2.2F;
      return this.dC() + (double)($$1 * this.el());
   }

   private double t(int $$0) {
      if ($$0 <= 0) {
         return this.dG();
      } else {
         float $$1 = (this.aV + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = azq.a($$1);
         return this.dG() + (double)$$2 * 1.3 * (double)this.el();
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = azq.h($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, bxw $$1) {
      this.a($$0, $$1.dA(), $$1.dC() + (double)$$1.cS() * 0.5, $$1.dG(), $$0 == 0 && this.ae.i() < 0.001F);
   }

   private void a(int $$0, double $$1, double $$2, double $$3, boolean $$4) {
      if (!this.ba()) {
         this.dV().a(null, 1024, this.dv(), 0);
      }

      double $$5 = this.r($$0);
      double $$6 = this.s($$0);
      double $$7 = this.t($$0);
      double $$8 = $$1 - $$5;
      double $$9 = $$2 - $$6;
      double $$10 = $$3 - $$7;
      ffs $$11 = new ffs($$8, $$9, $$10);
      ctj $$12 = new ctj(this.dV(), this, $$11.d());
      $$12.c(this);
      if ($$4) {
         $$12.a(true);
      }

      $$12.a_($$5, $$6, $$7);
      this.dV().b($$12);
   }

   @Override
   public void a(bxw $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(aru $$0, bvk $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if ($$1.a(axh.t) || $$1.d() instanceof cnr) {
         return false;
      } else if (this.t() > 0 && !$$1.a(axh.d)) {
         return false;
      } else {
         if (this.x()) {
            bwv $$3 = $$1.c();
            if ($$3 instanceof csh || $$3 instanceof ctn) {
               return false;
            }
         }

         bwv $$4 = $$1.d();
         if ($$4 != null && $$4.an().a(axj.y)) {
            return false;
         } else {
            if (this.bP <= 0) {
               this.bP = 20;
            }

            for (int $$5 = 0; $$5 < this.bO.length; $$5++) {
               this.bO[$$5] = this.bO[$$5] + 3;
            }

            return super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(aru $$0, bvk $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      coe $$3 = this.a($$0, dae.vC);
      if ($$3 != null) {
         $$3.t();
      }
   }

   @Override
   public void dH() {
      if (this.dV().an() == buq.a && this.aa()) {
         this.aq();
      } else {
         this.bd = 0;
      }
   }

   @Override
   public boolean b(bvz $$0, @Nullable bwv $$1) {
      return false;
   }

   public static bzb.a m() {
      return cpb.gx().a(bzc.s, 300.0).a(bzc.v, 0.6F).a(bzc.l, 0.6F).a(bzc.m, 40.0).a(bzc.a, 4.0);
   }

   public float[] n() {
      return this.bK;
   }

   public float[] q() {
      return this.bJ;
   }

   public int t() {
      return this.al.a(e);
   }

   public void b(int $$0) {
      this.al.a(e, $$0);
   }

   public int c(int $$0) {
      return this.al.a(d.get($$0));
   }

   public void a(int $$0, int $$1) {
      this.al.a(d.get($$0), $$1);
   }

   public boolean x() {
      return this.eG() <= this.eU() / 2.0F;
   }

   @Override
   protected boolean o(bwv $$0) {
      return false;
   }

   @Override
   public boolean n(boolean $$0) {
      return false;
   }

   @Override
   public boolean b(bvz $$0) {
      return $$0.a(bwb.t) ? false : super.b($$0);
   }

   class a extends ces {
      public a() {
         this.a(EnumSet.of(ces.a.a, ces.a.c, ces.a.b));
      }

      @Override
      public boolean b() {
         return cnr.this.t() > 0;
      }
   }
}
