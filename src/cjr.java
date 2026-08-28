import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjr extends cla implements cle {
   private static final akg<Integer> b = akk.a(cjr.class, aki.b);
   private static final akg<Integer> c = akk.a(cjr.class, aki.b);
   private static final akg<Integer> d = akk.a(cjr.class, aki.b);
   private static final List<akg<Integer>> e = ImmutableList.of(b, c, d);
   private static final akg<Integer> bY = akk.a(cjr.class, aki.b);
   private static final int bZ = 220;
   private final float[] ca = new float[2];
   private final float[] cb = new float[2];
   private final float[] cc = new float[2];
   private final float[] cd = new float[2];
   private final int[] ce = new int[2];
   private final int[] cf = new int[2];
   private int cg;
   private final are ch = (are)new are(this.Q_(), brf.a.f, brf.b.a).a(true);
   private static final Predicate<buk> ci = $$0 -> !$$0.ao().a(awx.y) && $$0.fI();
   private static final cfa cj = cfa.a().a(20.0).a(ci);

   public cjr(btv<? extends cjr> $$0, deg $$1) {
      super($$0, $$1);
      this.bP = new cah(this, 10, false);
      this.x(this.eQ());
      this.bN = 50;
   }

   @Override
   protected cdv b(deg $$0) {
      cdt $$1 = new cdt(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void D() {
      this.bS.a(0, new cjr.a());
      this.bS.a(2, new ccg(this, 1.0, 40, 20.0F));
      this.bS.a(5, new cct(this, 1.0));
      this.bS.a(6, new cbp(this, cnu.class, 8.0F));
      this.bS.a(7, new ccc(this));
      this.bT.a(1, new ccz(this));
      this.bT.a(2, new cda<>(this, buk.class, 0, false, false, ci));
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(b, 0);
      $$0.a(c, 0);
      $$0.a(d, 0);
      $$0.a(bY, 0);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("Invul", this.gq());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.b($$0.h("Invul"));
      if (this.ak()) {
         this.ch.a(this.Q_());
      }
   }

   @Override
   public void b(@Nullable xd $$0) {
      super.b($$0);
      this.ch.a(this.Q_());
   }

   @Override
   protected awd w() {
      return awe.CE;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.CH;
   }

   @Override
   protected awd n_() {
      return awe.CG;
   }

   @Override
   public void m_() {
      eys $$0 = this.dv().d(1.0, 0.6, 1.0);
      if (!this.dS().B && this.c(0) > 0) {
         bto $$1 = this.dS().a(this.c(0));
         if ($$1 != null) {
            double $$2 = $$0.e;
            if (this.dz() < $$1.dz() || !this.gr() && this.dz() < $$1.dz() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new eys($$0.d, $$2, $$0.f);
            eys $$3 = new eys($$1.dx() - this.dx(), 0.0, $$1.dD() - this.dD());
            if ($$3.j() > 9.0) {
               eys $$4 = $$3.d();
               $$0 = $$0.b($$4.d * 0.3 - $$0.d * 0.6, 0.0, $$4.f * 0.3 - $$0.f * 0.6);
            }
         }
      }

      this.h($$0);
      if ($$0.j() > 0.05) {
         this.v((float)azd.d($$0.f, $$0.d) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.m_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.cd[$$5] = this.cb[$$5];
         this.cc[$$5] = this.ca[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.c($$6 + 1);
         bto $$8 = null;
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
            float $$16 = (float)(azd.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(azd.d($$13, $$15) * 180.0F / (float)Math.PI));
            this.ca[$$6] = this.a(this.ca[$$6], $$17, 40.0F);
            this.cb[$$6] = this.a(this.cb[$$6], $$16, 10.0F);
         } else {
            this.cb[$$6] = this.a(this.cb[$$6], this.aT, 10.0F);
         }
      }

      boolean $$18 = this.gr();

      for (int $$19 = 0; $$19 < 3; $$19++) {
         double $$20 = this.s($$19);
         double $$21 = this.t($$19);
         double $$22 = this.u($$19);
         float $$23 = 0.3F * this.ef();
         this.dS().a(ln.ae, $$20 + this.af.k() * (double)$$23, $$21 + this.af.k() * (double)$$23, $$22 + this.af.k() * (double)$$23, 0.0, 0.0, 0.0);
         if ($$18 && this.dS().z.a(4) == 0) {
            this.dS()
               .a(
                  lg.a(ln.u, 0.7F, 0.7F, 0.5F),
                  $$20 + this.af.k() * (double)$$23,
                  $$21 + this.af.k() * (double)$$23,
                  $$22 + this.af.k() * (double)$$23,
                  0.0,
                  0.0,
                  0.0
               );
         }
      }

      if (this.gq() > 0) {
         float $$24 = 3.3F * this.ef();

         for (int $$25 = 0; $$25 < 3; $$25++) {
            this.dS()
               .a(lg.a(ln.u, 0.7F, 0.7F, 0.9F), this.dx() + this.af.k(), this.dz() + (double)(this.af.i() * $$24), this.dD() + this.af.k(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void ad() {
      if (this.gq() > 0) {
         int $$0 = this.gq() - 1;
         this.ch.a(1.0F - (float)$$0 / 220.0F);
         if ($$0 <= 0) {
            this.dS().a(this, this.dx(), this.dB(), this.dD(), 7.0F, false, deg.a.c);
            if (!this.ba()) {
               this.dS().b(1023, this.ds(), 0);
            }
         }

         this.b($$0);
         if (this.ag % 10 == 0) {
            this.c(10.0F);
         }
      } else {
         super.ad();

         for (int $$1 = 1; $$1 < 3; $$1++) {
            if (this.ag >= this.ce[$$1 - 1]) {
               this.ce[$$1 - 1] = this.ag + 10 + this.af.a(10);
               if ((this.dS().am() == brm.c || this.dS().am() == brm.d) && this.cf[$$1 - 1]++ > 15) {
                  float $$2 = 10.0F;
                  float $$3 = 5.0F;
                  double $$4 = azd.a(this.af, this.dx() - 10.0, this.dx() + 10.0);
                  double $$5 = azd.a(this.af, this.dz() - 5.0, this.dz() + 5.0);
                  double $$6 = azd.a(this.af, this.dD() - 10.0, this.dD() + 10.0);
                  this.a($$1 + 1, $$4, $$5, $$6, true);
                  this.cf[$$1 - 1] = 0;
               }

               int $$7 = this.c($$1);
               if ($$7 > 0) {
                  buk $$8 = (buk)this.dS().a($$7);
                  if ($$8 != null && this.c($$8) && !(this.g((bto)$$8) > 900.0) && this.G($$8)) {
                     this.a($$1 + 1, $$8);
                     this.ce[$$1 - 1] = this.ag + 40 + this.af.a(20);
                     this.cf[$$1 - 1] = 0;
                  } else {
                     this.a($$1, 0);
                  }
               } else {
                  List<buk> $$9 = this.dS().a(buk.class, cj, this, this.cO().c(20.0, 8.0, 20.0));
                  if (!$$9.isEmpty()) {
                     buk $$10 = $$9.get(this.af.a($$9.size()));
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
            if (this.cg == 0 && this.dS().ac().b(dec.c)) {
               boolean $$11 = false;
               int $$12 = azd.d(this.dn() / 2.0F + 1.0F);
               int $$13 = azd.d(this.do());

               for (je $$14 : je.b(this.dw() - $$12, this.dy(), this.dC() - $$12, this.dw() + $$12, this.dy() + $$13, this.dC() + $$12)) {
                  duo $$15 = this.dS().a_($$14);
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

         this.ch.a(this.eA() / this.eQ());
      }
   }

   public static boolean c(duo $$0) {
      return !$$0.l() && !$$0.a(awt.aF);
   }

   @Override
   public void q() {
      this.b(220);
      this.ch.a(0.0F);
      this.x(this.eQ() / 3.0F);
   }

   @Override
   public void a(duo $$0, eys $$1) {
   }

   @Override
   public void d(ari $$0) {
      super.d($$0);
      this.ch.a($$0);
   }

   @Override
   public void e(ari $$0) {
      super.e($$0);
      this.ch.b($$0);
   }

   private double s(int $$0) {
      if ($$0 <= 0) {
         return this.dx();
      } else {
         float $$1 = (this.aT + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = azd.b($$1);
         return this.dx() + (double)$$2 * 1.3 * (double)this.ef();
      }
   }

   private double t(int $$0) {
      float $$1 = $$0 <= 0 ? 3.0F : 2.2F;
      return this.dz() + (double)($$1 * this.ef());
   }

   private double u(int $$0) {
      if ($$0 <= 0) {
         return this.dD();
      } else {
         float $$1 = (this.aT + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = azd.a($$1);
         return this.dD() + (double)$$2 * 1.3 * (double)this.ef();
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = azd.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, buk $$1) {
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
      eys $$11 = new eys($$8, $$9, $$10);
      cpc $$12 = new cpc(this.dS(), this, $$11.d());
      $$12.c(this);
      if ($$4) {
         $$12.a(true);
      }

      $$12.a_($$5, $$6, $$7);
      this.dS().b($$12);
   }

   @Override
   public void a(buk $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.a(awv.t) || $$0.d() instanceof cjr) {
         return false;
      } else if (this.gq() > 0 && !$$0.a(awv.d)) {
         return false;
      } else {
         if (this.gr()) {
            bto $$2 = $$0.c();
            if ($$2 instanceof cob || $$2 instanceof cpg) {
               return false;
            }
         }

         bto $$3 = $$0.d();
         if ($$3 != null && $$3.ao().a(awx.y)) {
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
   protected void a(arh $$0, bsg $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      cke $$3 = this.a(cvt.uu);
      if ($$3 != null) {
         $$3.y();
      }
   }

   @Override
   public void dE() {
      if (this.dS().am() == brm.a && this.ab()) {
         this.as();
      } else {
         this.bb = 0;
      }
   }

   @Override
   public boolean b(bsv $$0, @Nullable bto $$1) {
      return false;
   }

   public static bvq.a t() {
      return cla.gv().a(bvr.s, 300.0).a(bvr.v, 0.6F).a(bvr.l, 0.6F).a(bvr.m, 40.0).a(bvr.a, 4.0);
   }

   public float[] y() {
      return this.cb;
   }

   public float[] gp() {
      return this.ca;
   }

   public int gq() {
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

   public boolean gr() {
      return this.eA() <= this.eQ() / 2.0F;
   }

   @Override
   protected boolean o(bto $$0) {
      return false;
   }

   @Override
   public boolean o(boolean $$0) {
      return false;
   }

   @Override
   public boolean b(bsv $$0) {
      return $$0.a(bsx.t) ? false : super.b($$0);
   }

   class a extends cbh {
      public a() {
         this.a(EnumSet.of(cbh.a.a, cbh.a.c, cbh.a.b));
      }

      @Override
      public boolean b() {
         return cjr.this.gq() > 0;
      }
   }
}
