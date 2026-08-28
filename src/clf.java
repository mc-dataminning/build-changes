import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class clf extends cmo implements cms {
   private static final aks<Integer> a = akw.a(clf.class, aku.b);
   private static final aks<Integer> b = akw.a(clf.class, aku.b);
   private static final aks<Integer> c = akw.a(clf.class, aku.b);
   private static final List<aks<Integer>> d = ImmutableList.of(a, b, c);
   private static final aks<Integer> bZ = akw.a(clf.class, aku.b);
   private static final int ca = 220;
   private final float[] cb = new float[2];
   private final float[] cc = new float[2];
   private final float[] cd = new float[2];
   private final float[] ce = new float[2];
   private final int[] cf = new int[2];
   private final int[] cg = new int[2];
   private int ch;
   private final art ci = (art)new art(this.p_(), bsq.a.f, bsq.b.a).a(true);
   private static final cgo.a cj = ($$0, $$1) -> !$$0.aq().a(axo.y) && $$0.fM();
   private static final cgo ck = cgo.a().a(20.0).a(cj);

   public clf(bvi<? extends clf> $$0, dgz $$1) {
      super($$0, $$1);
      this.bQ = new cbv(this, 10, false);
      this.x(this.eS());
      this.bO = 50;
   }

   @Override
   protected cfj b(dgz $$0) {
      cfh $$1 = new cfh(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void B() {
      this.bT.a(0, new clf.a());
      this.bT.a(2, new cdu(this, 1.0, 40, 20.0F));
      this.bT.a(5, new ceh(this, 1.0));
      this.bT.a(6, new cdd(this, cpo.class, 8.0F));
      this.bT.a(7, new cdq(this));
      this.bU.a(1, new cen(this));
      this.bU.a(2, new ceo<>(this, bvx.class, 0, false, false, cj));
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(a, 0);
      $$0.a(b, 0);
      $$0.a(c, 0);
      $$0.a(bZ, 0);
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("Invul", this.go());
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.b($$0.h("Invul"));
      if (this.l_()) {
         this.ci.a(this.p_());
      }
   }

   @Override
   public void b(@Nullable xk $$0) {
      super.b($$0);
      this.ci.a(this.p_());
   }

   @Override
   protected awu u() {
      return awv.Dn;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.Dq;
   }

   @Override
   protected awu o_() {
      return awv.Dp;
   }

   @Override
   public void d_() {
      fbr $$0 = this.dz().d(1.0, 0.6, 1.0);
      if (!this.dW().C && this.c(0) > 0) {
         bvb $$1 = this.dW().a(this.c(0));
         if ($$1 != null) {
            double $$2 = $$0.e;
            if (this.dD() < $$1.dD() || !this.gp() && this.dD() < $$1.dD() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new fbr($$0.d, $$2, $$0.f);
            fbr $$3 = new fbr($$1.dB() - this.dB(), 0.0, $$1.dH() - this.dH());
            if ($$3.j() > 9.0) {
               fbr $$4 = $$3.d();
               $$0 = $$0.b($$4.d * 0.3 - $$0.d * 0.6, 0.0, $$4.f * 0.3 - $$0.f * 0.6);
            }
         }
      }

      this.h($$0);
      if ($$0.j() > 0.05) {
         this.v((float)azu.d($$0.f, $$0.d) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.d_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.ce[$$5] = this.cc[$$5];
         this.cd[$$5] = this.cb[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.c($$6 + 1);
         bvb $$8 = null;
         if ($$7 > 0) {
            $$8 = this.dW().a($$7);
         }

         if ($$8 != null) {
            double $$9 = this.r($$6 + 1);
            double $$10 = this.s($$6 + 1);
            double $$11 = this.t($$6 + 1);
            double $$12 = $$8.dB() - $$9;
            double $$13 = $$8.dF() - $$10;
            double $$14 = $$8.dH() - $$11;
            double $$15 = Math.sqrt($$12 * $$12 + $$14 * $$14);
            float $$16 = (float)(azu.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(azu.d($$13, $$15) * 180.0F / (float)Math.PI));
            this.cb[$$6] = this.a(this.cb[$$6], $$17, 40.0F);
            this.cc[$$6] = this.a(this.cc[$$6], $$16, 10.0F);
         } else {
            this.cc[$$6] = this.a(this.cc[$$6], this.aX, 10.0F);
         }
      }

      boolean $$18 = this.gp();

      for (int $$19 = 0; $$19 < 3; $$19++) {
         double $$20 = this.r($$19);
         double $$21 = this.s($$19);
         double $$22 = this.t($$19);
         float $$23 = 0.3F * this.ek();
         this.dW().a(ls.ag, $$20 + this.ae.k() * (double)$$23, $$21 + this.ae.k() * (double)$$23, $$22 + this.ae.k() * (double)$$23, 0.0, 0.0, 0.0);
         if ($$18 && this.dW().A.a(4) == 0) {
            this.dW()
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

      if (this.go() > 0) {
         float $$24 = 3.3F * this.ek();

         for (int $$25 = 0; $$25 < 3; $$25++) {
            this.dW()
               .a(ll.a(ls.u, 0.7F, 0.7F, 0.9F), this.dB() + this.ae.k(), this.dD() + (double)(this.ae.i() * $$24), this.dH() + this.ae.k(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(arx $$0) {
      if (this.go() > 0) {
         int $$1 = this.go() - 1;
         this.ci.a(1.0F - (float)$$1 / 220.0F);
         if ($$1 <= 0) {
            $$0.a(this, this.dB(), this.dF(), this.dH(), 7.0F, false, dgz.a.c);
            if (!this.bb()) {
               $$0.b(1023, this.dw(), 0);
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
               if (($$0.am() == bsx.c || $$0.am() == bsx.d) && this.cg[$$2 - 1]++ > 15) {
                  float $$3 = 10.0F;
                  float $$4 = 5.0F;
                  double $$5 = azu.a(this.ae, this.dB() - 10.0, this.dB() + 10.0);
                  double $$6 = azu.a(this.ae, this.dD() - 5.0, this.dD() + 5.0);
                  double $$7 = azu.a(this.ae, this.dH() - 10.0, this.dH() + 10.0);
                  this.a($$2 + 1, $$5, $$6, $$7, true);
                  this.cg[$$2 - 1] = 0;
               }

               int $$8 = this.c($$2);
               if ($$8 > 0) {
                  bvx $$9 = (bvx)$$0.a($$8);
                  if ($$9 != null && this.c($$9) && !(this.g((bvb)$$9) > 900.0) && this.E($$9)) {
                     this.a($$2 + 1, $$9);
                     this.cf[$$2 - 1] = this.af + 40 + this.ae.a(20);
                     this.cg[$$2 - 1] = 0;
                  } else {
                     this.a($$2, 0);
                  }
               } else {
                  List<bvx> $$10 = $$0.a(bvx.class, ck, this, this.cR().c(20.0, 8.0, 20.0));
                  if (!$$10.isEmpty()) {
                     bvx $$11 = $$10.get(this.ae.a($$10.size()));
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
            if (this.ch == 0 && $$0.O().b(dgv.c)) {
               boolean $$12 = false;
               int $$13 = azu.d(this.dr() / 2.0F + 1.0F);
               int $$14 = azu.d(this.ds());

               for (jh $$15 : jh.b(this.dA() - $$13, this.dC(), this.dG() - $$13, this.dA() + $$13, this.dC() + $$14, this.dG() + $$13)) {
                  dxo $$16 = $$0.a_($$15);
                  if (c($$16)) {
                     $$12 = $$0.a($$15, true, this) || $$12;
                  }
               }

               if ($$12) {
                  $$0.a(null, 1022, this.dw(), 0);
               }
            }
         }

         if (this.af % 20 == 0) {
            this.c(1.0F);
         }

         this.ci.a(this.eE() / this.eS());
      }
   }

   public static boolean c(dxo $$0) {
      return !$$0.l() && !$$0.a(axk.aH);
   }

   @Override
   public void m() {
      this.b(220);
      this.ci.a(0.0F);
      this.x(this.eS() / 3.0F);
   }

   @Override
   public void a(dxo $$0, fbr $$1) {
   }

   @Override
   public void d(ary $$0) {
      super.d($$0);
      this.ci.a($$0);
   }

   @Override
   public void e(ary $$0) {
      super.e($$0);
      this.ci.b($$0);
   }

   private double r(int $$0) {
      if ($$0 <= 0) {
         return this.dB();
      } else {
         float $$1 = (this.aX + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = azu.b($$1);
         return this.dB() + (double)$$2 * 1.3 * (double)this.ek();
      }
   }

   private double s(int $$0) {
      float $$1 = $$0 <= 0 ? 3.0F : 2.2F;
      return this.dD() + (double)($$1 * this.ek());
   }

   private double t(int $$0) {
      if ($$0 <= 0) {
         return this.dH();
      } else {
         float $$1 = (this.aX + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = azu.a($$1);
         return this.dH() + (double)$$2 * 1.3 * (double)this.ek();
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = azu.h($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, bvx $$1) {
      this.a($$0, $$1.dB(), $$1.dD() + (double)$$1.cS() * 0.5, $$1.dH(), $$0 == 0 && this.ae.i() < 0.001F);
   }

   private void a(int $$0, double $$1, double $$2, double $$3, boolean $$4) {
      if (!this.bb()) {
         this.dW().a(null, 1024, this.dw(), 0);
      }

      double $$5 = this.r($$0);
      double $$6 = this.s($$0);
      double $$7 = this.t($$0);
      double $$8 = $$1 - $$5;
      double $$9 = $$2 - $$6;
      double $$10 = $$3 - $$7;
      fbr $$11 = new fbr($$8, $$9, $$10);
      cqv $$12 = new cqv(this.dW(), this, $$11.d());
      $$12.c(this);
      if ($$4) {
         $$12.a(true);
      }

      $$12.a_($$5, $$6, $$7);
      this.dW().b($$12);
   }

   @Override
   public void a(bvx $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(arx $$0, btr $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if ($$1.a(axm.t) || $$1.d() instanceof clf) {
         return false;
      } else if (this.go() > 0 && !$$1.a(axm.d)) {
         return false;
      } else {
         if (this.gp()) {
            bvb $$3 = $$1.c();
            if ($$3 instanceof cpv || $$3 instanceof cqz) {
               return false;
            }
         }

         bvb $$4 = $$1.d();
         if ($$4 != null && $$4.aq().a(axo.y)) {
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
   protected void a(arx $$0, btr $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      cls $$3 = this.a($$0, cxk.vr);
      if ($$3 != null) {
         $$3.x();
      }
   }

   @Override
   public void dI() {
      if (this.dW().am() == bsx.a && this.X()) {
         this.at();
      } else {
         this.bf = 0;
      }
   }

   @Override
   public boolean b(bug $$0, @Nullable bvb $$1) {
      return false;
   }

   public static bxe.a p() {
      return cmo.gt().a(bxf.s, 300.0).a(bxf.v, 0.6F).a(bxf.l, 0.6F).a(bxf.m, 40.0).a(bxf.a, 4.0);
   }

   public float[] t() {
      return this.cc;
   }

   public float[] x() {
      return this.cb;
   }

   public int go() {
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

   public boolean gp() {
      return this.eE() <= this.eS() / 2.0F;
   }

   @Override
   protected boolean o(bvb $$0) {
      return false;
   }

   @Override
   public boolean o(boolean $$0) {
      return false;
   }

   @Override
   public boolean b(bug $$0) {
      return $$0.a(bui.t) ? false : super.b($$0);
   }

   class a extends ccv {
      public a() {
         this.a(EnumSet.of(ccv.a.a, ccv.a.c, ccv.a.b));
      }

      @Override
      public boolean b() {
         return clf.this.go() > 0;
      }
   }
}
