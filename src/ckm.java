import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckm extends clv implements clz {
   private static final ako<Integer> b = aks.a(ckm.class, akq.b);
   private static final ako<Integer> c = aks.a(ckm.class, akq.b);
   private static final ako<Integer> d = aks.a(ckm.class, akq.b);
   private static final List<ako<Integer>> e = ImmutableList.of(b, c, d);
   private static final ako<Integer> bY = aks.a(ckm.class, akq.b);
   private static final int bZ = 220;
   private final float[] ca = new float[2];
   private final float[] cb = new float[2];
   private final float[] cc = new float[2];
   private final float[] cd = new float[2];
   private final int[] ce = new int[2];
   private final int[] cf = new int[2];
   private int cg;
   private final arn ch = (arn)new arn(this.S_(), brx.a.f, brx.b.a).a(true);
   private static final Predicate<bve> ci = $$0 -> !$$0.ar().a(axh.y) && $$0.fP();
   private static final cfv cj = cfv.a().a(20.0).a(ci);

   public ckm(bup<? extends ckm> $$0, dff $$1) {
      super($$0, $$1);
      this.bP = new cbc(this, 10, false);
      this.x(this.eW());
      this.bN = 50;
   }

   @Override
   protected ceq b(dff $$0) {
      ceo $$1 = new ceo(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void D() {
      this.bS.a(0, new ckm.a());
      this.bS.a(2, new cdb(this, 1.0, 40, 20.0F));
      this.bS.a(5, new cdo(this, 1.0));
      this.bS.a(6, new cck(this, cor.class, 8.0F));
      this.bS.a(7, new ccx(this));
      this.bT.a(1, new cdu(this));
      this.bT.a(2, new cdv<>(this, bve.class, 0, false, false, ci));
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(b, 0);
      $$0.a(c, 0);
      $$0.a(d, 0);
      $$0.a(bY, 0);
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("Invul", this.gw());
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.b($$0.h("Invul"));
      if (this.an()) {
         this.ch.a(this.S_());
      }
   }

   @Override
   public void b(@Nullable xl $$0) {
      super.b($$0);
      this.ch.a(this.S_());
   }

   @Override
   protected awn w() {
      return awo.CC;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.CF;
   }

   @Override
   protected awn o_() {
      return awo.CE;
   }

   @Override
   public void n_() {
      ezr $$0 = this.dB().d(1.0, 0.6, 1.0);
      if (!this.dY().C && this.c(0) > 0) {
         bui $$1 = this.dY().a(this.c(0));
         if ($$1 != null) {
            double $$2 = $$0.e;
            if (this.dF() < $$1.dF() || !this.gx() && this.dF() < $$1.dF() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new ezr($$0.d, $$2, $$0.f);
            ezr $$3 = new ezr($$1.dD() - this.dD(), 0.0, $$1.dJ() - this.dJ());
            if ($$3.j() > 9.0) {
               ezr $$4 = $$3.d();
               $$0 = $$0.b($$4.d * 0.3 - $$0.d * 0.6, 0.0, $$4.f * 0.3 - $$0.f * 0.6);
            }
         }
      }

      this.h($$0);
      if ($$0.j() > 0.05) {
         this.v((float)azn.d($$0.f, $$0.d) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.n_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.cd[$$5] = this.cb[$$5];
         this.cc[$$5] = this.ca[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.c($$6 + 1);
         bui $$8 = null;
         if ($$7 > 0) {
            $$8 = this.dY().a($$7);
         }

         if ($$8 != null) {
            double $$9 = this.s($$6 + 1);
            double $$10 = this.t($$6 + 1);
            double $$11 = this.u($$6 + 1);
            double $$12 = $$8.dD() - $$9;
            double $$13 = $$8.dH() - $$10;
            double $$14 = $$8.dJ() - $$11;
            double $$15 = Math.sqrt($$12 * $$12 + $$14 * $$14);
            float $$16 = (float)(azn.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(azn.d($$13, $$15) * 180.0F / (float)Math.PI));
            this.ca[$$6] = this.a(this.ca[$$6], $$17, 40.0F);
            this.cb[$$6] = this.a(this.cb[$$6], $$16, 10.0F);
         } else {
            this.cb[$$6] = this.a(this.cb[$$6], this.aX, 10.0F);
         }
      }

      boolean $$18 = this.gx();

      for (int $$19 = 0; $$19 < 3; $$19++) {
         double $$20 = this.s($$19);
         double $$21 = this.t($$19);
         double $$22 = this.u($$19);
         float $$23 = 0.3F * this.em();
         this.dY().a(ls.ae, $$20 + this.af.k() * (double)$$23, $$21 + this.af.k() * (double)$$23, $$22 + this.af.k() * (double)$$23, 0.0, 0.0, 0.0);
         if ($$18 && this.dY().A.a(4) == 0) {
            this.dY()
               .a(
                  ll.a(ls.u, 0.7F, 0.7F, 0.5F),
                  $$20 + this.af.k() * (double)$$23,
                  $$21 + this.af.k() * (double)$$23,
                  $$22 + this.af.k() * (double)$$23,
                  0.0,
                  0.0,
                  0.0
               );
         }
      }

      if (this.gw() > 0) {
         float $$24 = 3.3F * this.em();

         for (int $$25 = 0; $$25 < 3; $$25++) {
            this.dY()
               .a(ll.a(ls.u, 0.7F, 0.7F, 0.9F), this.dD() + this.af.k(), this.dF() + (double)(this.af.i() * $$24), this.dJ() + this.af.k(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void ac() {
      if (this.gw() > 0) {
         int $$0 = this.gw() - 1;
         this.ch.a(1.0F - (float)$$0 / 220.0F);
         if ($$0 <= 0) {
            this.dY().a(this, this.dD(), this.dH(), this.dJ(), 7.0F, false, dff.a.c);
            if (!this.bd()) {
               this.dY().b(1023, this.dy(), 0);
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
               if ((this.dY().ak() == bse.c || this.dY().ak() == bse.d) && this.cf[$$1 - 1]++ > 15) {
                  float $$2 = 10.0F;
                  float $$3 = 5.0F;
                  double $$4 = azn.a(this.af, this.dD() - 10.0, this.dD() + 10.0);
                  double $$5 = azn.a(this.af, this.dF() - 5.0, this.dF() + 5.0);
                  double $$6 = azn.a(this.af, this.dJ() - 10.0, this.dJ() + 10.0);
                  this.a($$1 + 1, $$4, $$5, $$6, true);
                  this.cf[$$1 - 1] = 0;
               }

               int $$7 = this.c($$1);
               if ($$7 > 0) {
                  bve $$8 = (bve)this.dY().a($$7);
                  if ($$8 != null && this.c($$8) && !(this.g((bui)$$8) > 900.0) && this.G($$8)) {
                     this.a($$1 + 1, $$8);
                     this.ce[$$1 - 1] = this.ag + 40 + this.af.a(20);
                     this.cf[$$1 - 1] = 0;
                  } else {
                     this.a($$1, 0);
                  }
               } else {
                  List<bve> $$9 = this.dY().a(bve.class, cj, this, this.cT().c(20.0, 8.0, 20.0));
                  if (!$$9.isEmpty()) {
                     bve $$10 = $$9.get(this.af.a($$9.size()));
                     this.a($$1, $$10.as());
                  }
               }
            }
         }

         if (this.m() != null) {
            this.a(0, this.m().as());
         } else {
            this.a(0, 0);
         }

         if (this.cg > 0) {
            this.cg--;
            if (this.cg == 0 && this.dY().ac().b(dfb.c)) {
               boolean $$11 = false;
               int $$12 = azn.d(this.dt() / 2.0F + 1.0F);
               int $$13 = azn.d(this.du());

               for (jh $$14 : jh.b(this.dC() - $$12, this.dE(), this.dI() - $$12, this.dC() + $$12, this.dE() + $$13, this.dI() + $$12)) {
                  dvo $$15 = this.dY().a_($$14);
                  if (c($$15)) {
                     $$11 = this.dY().a($$14, true, this) || $$11;
                  }
               }

               if ($$11) {
                  this.dY().a(null, 1022, this.dy(), 0);
               }
            }
         }

         if (this.ag % 20 == 0) {
            this.c(1.0F);
         }

         this.ch.a(this.eH() / this.eW());
      }
   }

   public static boolean c(dvo $$0) {
      return !$$0.l() && !$$0.a(axd.aG);
   }

   @Override
   public void q() {
      this.b(220);
      this.ch.a(0.0F);
      this.x(this.eW() / 3.0F);
   }

   @Override
   public void a(dvo $$0, ezr $$1) {
   }

   @Override
   public void d(arr $$0) {
      super.d($$0);
      this.ch.a($$0);
   }

   @Override
   public void e(arr $$0) {
      super.e($$0);
      this.ch.b($$0);
   }

   private double s(int $$0) {
      if ($$0 <= 0) {
         return this.dD();
      } else {
         float $$1 = (this.aX + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = azn.b($$1);
         return this.dD() + (double)$$2 * 1.3 * (double)this.em();
      }
   }

   private double t(int $$0) {
      float $$1 = $$0 <= 0 ? 3.0F : 2.2F;
      return this.dF() + (double)($$1 * this.em());
   }

   private double u(int $$0) {
      if ($$0 <= 0) {
         return this.dJ();
      } else {
         float $$1 = (this.aX + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = azn.a($$1);
         return this.dJ() + (double)$$2 * 1.3 * (double)this.em();
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = azn.h($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, bve $$1) {
      this.a($$0, $$1.dD(), $$1.dF() + (double)$$1.cU() * 0.5, $$1.dJ(), $$0 == 0 && this.af.i() < 0.001F);
   }

   private void a(int $$0, double $$1, double $$2, double $$3, boolean $$4) {
      if (!this.bd()) {
         this.dY().a(null, 1024, this.dy(), 0);
      }

      double $$5 = this.s($$0);
      double $$6 = this.t($$0);
      double $$7 = this.u($$0);
      double $$8 = $$1 - $$5;
      double $$9 = $$2 - $$6;
      double $$10 = $$3 - $$7;
      ezr $$11 = new ezr($$8, $$9, $$10);
      cpy $$12 = new cpy(this.dY(), this, $$11.d());
      $$12.c(this);
      if ($$4) {
         $$12.a(true);
      }

      $$12.a_($$5, $$6, $$7);
      this.dY().b($$12);
   }

   @Override
   public void a(bve $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.a(axf.t) || $$0.d() instanceof ckm) {
         return false;
      } else if (this.gw() > 0 && !$$0.a(axf.d)) {
         return false;
      } else {
         if (this.gx()) {
            bui $$2 = $$0.c();
            if ($$2 instanceof coy || $$2 instanceof cqc) {
               return false;
            }
         }

         bui $$3 = $$0.d();
         if ($$3 != null && $$3.ar().a(axh.y)) {
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
   protected void a(arq $$0, bsy $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      ckz $$3 = this.a(cwj.uK);
      if ($$3 != null) {
         $$3.y();
      }
   }

   @Override
   public void dK() {
      if (this.dY().ak() == bse.a && this.aa()) {
         this.av();
      } else {
         this.bf = 0;
      }
   }

   @Override
   public boolean b(btn $$0, @Nullable bui $$1) {
      return false;
   }

   public static bwl.a t() {
      return clv.gB().a(bwm.s, 300.0).a(bwm.v, 0.6F).a(bwm.l, 0.6F).a(bwm.m, 40.0).a(bwm.a, 4.0);
   }

   public float[] y() {
      return this.cb;
   }

   public float[] gv() {
      return this.ca;
   }

   public int gw() {
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

   public boolean gx() {
      return this.eH() <= this.eW() / 2.0F;
   }

   @Override
   protected boolean o(bui $$0) {
      return false;
   }

   @Override
   public boolean o(boolean $$0) {
      return false;
   }

   @Override
   public boolean b(btn $$0) {
      return $$0.a(btp.t) ? false : super.b($$0);
   }

   class a extends ccc {
      public a() {
         this.a(EnumSet.of(ccc.a.a, ccc.a.c, ccc.a.b));
      }

      @Override
      public boolean b() {
         return ckm.this.gw() > 0;
      }
   }
}
