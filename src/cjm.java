import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjm extends ckv implements ckz {
   private static final akg<Integer> b = akk.a(cjm.class, aki.b);
   private static final akg<Integer> c = akk.a(cjm.class, aki.b);
   private static final akg<Integer> d = akk.a(cjm.class, aki.b);
   private static final List<akg<Integer>> e = ImmutableList.of(b, c, d);
   private static final akg<Integer> bZ = akk.a(cjm.class, aki.b);
   private static final int ca = 220;
   private final float[] cb = new float[2];
   private final float[] cc = new float[2];
   private final float[] cd = new float[2];
   private final float[] ce = new float[2];
   private final int[] cf = new int[2];
   private final int[] cg = new int[2];
   private int ch;
   private final ard ci = (ard)new ard(this.Q_(), bra.a.f, bra.b.a).a(true);
   private static final Predicate<buf> cj = $$0 -> !$$0.ao().a(aww.y) && $$0.fH();
   private static final cev ck = cev.a().a(20.0).a(cj);

   public cjm(btq<? extends cjm> $$0, dds $$1) {
      super($$0, $$1);
      this.bQ = new cac(this, 10, false);
      this.x(this.eQ());
      this.bO = 50;
   }

   @Override
   protected cdq b(dds $$0) {
      cdo $$1 = new cdo(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void D() {
      this.bT.a(0, new cjm.a());
      this.bT.a(2, new ccb(this, 1.0, 40, 20.0F));
      this.bT.a(5, new cco(this, 1.0));
      this.bT.a(6, new cbk(this, cnp.class, 8.0F));
      this.bT.a(7, new cbx(this));
      this.bU.a(1, new ccu(this));
      this.bU.a(2, new ccv<>(this, buf.class, 0, false, false, cj));
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(b, 0);
      $$0.a(c, 0);
      $$0.a(d, 0);
      $$0.a(bZ, 0);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("Invul", this.gp());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.b($$0.h("Invul"));
      if (this.ak()) {
         this.ci.a(this.Q_());
      }
   }

   @Override
   public void b(@Nullable xd $$0) {
      super.b($$0);
      this.ci.a(this.Q_());
   }

   @Override
   protected awc w() {
      return awd.CE;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.CH;
   }

   @Override
   protected awc n_() {
      return awd.CG;
   }

   @Override
   public void m_() {
      eye $$0 = this.dv().d(1.0, 0.6, 1.0);
      if (!this.dS().B && this.c(0) > 0) {
         btj $$1 = this.dS().a(this.c(0));
         if ($$1 != null) {
            double $$2 = $$0.e;
            if (this.dz() < $$1.dz() || !this.gq() && this.dz() < $$1.dz() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new eye($$0.d, $$2, $$0.f);
            eye $$3 = new eye($$1.dx() - this.dx(), 0.0, $$1.dD() - this.dD());
            if ($$3.j() > 9.0) {
               eye $$4 = $$3.d();
               $$0 = $$0.b($$4.d * 0.3 - $$0.d * 0.6, 0.0, $$4.f * 0.3 - $$0.f * 0.6);
            }
         }
      }

      this.h($$0);
      if ($$0.j() > 0.05) {
         this.v((float)azc.d($$0.f, $$0.d) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.m_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.ce[$$5] = this.cc[$$5];
         this.cd[$$5] = this.cb[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.c($$6 + 1);
         btj $$8 = null;
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
            float $$16 = (float)(azc.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(azc.d($$13, $$15) * 180.0F / (float)Math.PI));
            this.cb[$$6] = this.a(this.cb[$$6], $$17, 40.0F);
            this.cc[$$6] = this.a(this.cc[$$6], $$16, 10.0F);
         } else {
            this.cc[$$6] = this.a(this.cc[$$6], this.aU, 10.0F);
         }
      }

      boolean $$18 = this.gq();

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

      if (this.gp() > 0) {
         float $$24 = 3.3F * this.ef();

         for (int $$25 = 0; $$25 < 3; $$25++) {
            this.dS()
               .a(lg.a(ln.u, 0.7F, 0.7F, 0.9F), this.dx() + this.af.k(), this.dz() + (double)(this.af.i() * $$24), this.dD() + this.af.k(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void ad() {
      if (this.gp() > 0) {
         int $$0 = this.gp() - 1;
         this.ci.a(1.0F - (float)$$0 / 220.0F);
         if ($$0 <= 0) {
            this.dS().a(this, this.dx(), this.dB(), this.dD(), 7.0F, false, dds.a.c);
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
            if (this.ag >= this.cf[$$1 - 1]) {
               this.cf[$$1 - 1] = this.ag + 10 + this.af.a(10);
               if ((this.dS().am() == brh.c || this.dS().am() == brh.d) && this.cg[$$1 - 1]++ > 15) {
                  float $$2 = 10.0F;
                  float $$3 = 5.0F;
                  double $$4 = azc.a(this.af, this.dx() - 10.0, this.dx() + 10.0);
                  double $$5 = azc.a(this.af, this.dz() - 5.0, this.dz() + 5.0);
                  double $$6 = azc.a(this.af, this.dD() - 10.0, this.dD() + 10.0);
                  this.a($$1 + 1, $$4, $$5, $$6, true);
                  this.cg[$$1 - 1] = 0;
               }

               int $$7 = this.c($$1);
               if ($$7 > 0) {
                  buf $$8 = (buf)this.dS().a($$7);
                  if ($$8 != null && this.c($$8) && !(this.g((btj)$$8) > 900.0) && this.G($$8)) {
                     this.a($$1 + 1, $$8);
                     this.cf[$$1 - 1] = this.ag + 40 + this.af.a(20);
                     this.cg[$$1 - 1] = 0;
                  } else {
                     this.a($$1, 0);
                  }
               } else {
                  List<buf> $$9 = this.dS().a(buf.class, ck, this, this.cO().c(20.0, 8.0, 20.0));
                  if (!$$9.isEmpty()) {
                     buf $$10 = $$9.get(this.af.a($$9.size()));
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

         if (this.ch > 0) {
            this.ch--;
            if (this.ch == 0 && this.dS().ac().b(ddo.c)) {
               boolean $$11 = false;
               int $$12 = azc.d(this.dn() / 2.0F + 1.0F);
               int $$13 = azc.d(this.do());

               for (je $$14 : je.b(this.dw() - $$12, this.dy(), this.dC() - $$12, this.dw() + $$12, this.dy() + $$13, this.dC() + $$12)) {
                  dua $$15 = this.dS().a_($$14);
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

         this.ci.a(this.eA() / this.eQ());
      }
   }

   public static boolean c(dua $$0) {
      return !$$0.l() && !$$0.a(aws.aF);
   }

   @Override
   public void q() {
      this.b(220);
      this.ci.a(0.0F);
      this.x(this.eQ() / 3.0F);
   }

   @Override
   public void a(dua $$0, eye $$1) {
   }

   @Override
   public void d(arh $$0) {
      super.d($$0);
      this.ci.a($$0);
   }

   @Override
   public void e(arh $$0) {
      super.e($$0);
      this.ci.b($$0);
   }

   private double s(int $$0) {
      if ($$0 <= 0) {
         return this.dx();
      } else {
         float $$1 = (this.aU + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = azc.b($$1);
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
         float $$1 = (this.aU + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = azc.a($$1);
         return this.dD() + (double)$$2 * 1.3 * (double)this.ef();
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = azc.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, buf $$1) {
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
      eye $$11 = new eye($$8, $$9, $$10);
      cox $$12 = new cox(this.dS(), this, $$11.d());
      $$12.c(this);
      if ($$4) {
         $$12.a(true);
      }

      $$12.a_($$5, $$6, $$7);
      this.dS().b($$12);
   }

   @Override
   public void a(buf $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.a(awu.t) || $$0.d() instanceof cjm) {
         return false;
      } else if (this.gp() > 0 && !$$0.a(awu.d)) {
         return false;
      } else {
         if (this.gq()) {
            btj $$2 = $$0.c();
            if ($$2 instanceof cnw || $$2 instanceof cpb) {
               return false;
            }
         }

         btj $$3 = $$0.d();
         if ($$3 != null && $$3.ao().a(aww.y)) {
            return false;
         } else {
            if (this.ch <= 0) {
               this.ch = 20;
            }

            for (int $$4 = 0; $$4 < this.cg.length; $$4++) {
               this.cg[$$4] = this.cg[$$4] + 3;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void a(arg $$0, bsb $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      cjz $$3 = this.a(cvo.uu);
      if ($$3 != null) {
         $$3.y();
      }
   }

   @Override
   public void dE() {
      if (this.dS().am() == brh.a && this.ab()) {
         this.as();
      } else {
         this.bc = 0;
      }
   }

   @Override
   public boolean b(bsq $$0, @Nullable btj $$1) {
      return false;
   }

   public static bvl.a t() {
      return ckv.gu().a(bvm.s, 300.0).a(bvm.v, 0.6F).a(bvm.l, 0.6F).a(bvm.m, 40.0).a(bvm.a, 4.0);
   }

   public float[] y() {
      return this.cc;
   }

   public float[] go() {
      return this.cb;
   }

   public int gp() {
      return this.am.a(bZ);
   }

   public void b(int $$0) {
      this.am.a(bZ, $$0);
   }

   public int c(int $$0) {
      return this.am.a(e.get($$0));
   }

   public void a(int $$0, int $$1) {
      this.am.a(e.get($$0), $$1);
   }

   public boolean gq() {
      return this.eA() <= this.eQ() / 2.0F;
   }

   @Override
   protected boolean o(btj $$0) {
      return false;
   }

   @Override
   public boolean o(boolean $$0) {
      return false;
   }

   @Override
   public boolean c(bsq $$0) {
      return $$0.a(bss.t) ? false : super.c($$0);
   }

   class a extends cbc {
      public a() {
         this.a(EnumSet.of(cbc.a.a, cbc.a.c, cbc.a.b));
      }

      @Override
      public boolean b() {
         return cjm.this.gp() > 0;
      }
   }
}
