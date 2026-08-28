import com.google.common.annotations.VisibleForTesting;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cox extends cod {
   private static final alg a = alg.b("baby");
   private static final byi b = new byi(a, 0.5, byi.a.b);
   private static final alg c = alg.b("reinforcement_caller_charge");
   private static final byi bJ = new byi(alg.b("reinforcement_callee_charge"), -0.05F, byi.a.a);
   private static final alg bK = alg.b("leader_zombie_bonus");
   private static final alg bL = alg.b("zombie_random_spawn_bonus");
   private static final akj<Boolean> bM = akn.a(cox.class, akl.k);
   private static final akj<Integer> bN = akn.a(cox.class, akl.b);
   private static final akj<Boolean> bO = akn.a(cox.class, akl.k);
   public static final float d = 0.05F;
   public static final int bG = 50;
   public static final int bH = 40;
   public static final int bI = 7;
   private static final bwi bP = bwo.bO.n().a(0.5F).b(0.93F);
   private static final float bQ = 0.1F;
   private static final Predicate<bua> bR = $$0 -> $$0 == bua.d;
   private final cdk bS = new cdk(this, bR);
   private boolean bT;
   private int bU;
   private int bV;

   public cox(bwo<? extends cox> $$0, dja $$1) {
      super($$0, $$1);
   }

   public cox(dja $$0) {
      this(bwo.bO, $$0);
   }

   @Override
   protected void D() {
      this.bD.a(4, new cox.a(this, 1.0, 3));
      this.bD.a(8, new cei(this, crc.class, 8.0F));
      this.bD.a(8, new cev(this));
      this.m();
   }

   protected void m() {
      this.bD.a(2, new cfp(this, 1.0, false));
      this.bD.a(6, new cem(this, 1.0, true, 4, this::gw));
      this.bD.a(7, new cfn(this, 1.0));
      this.bE.a(1, new cfs(this).a(coz.class));
      this.bE.a(2, new cft<>(this, crc.class, true));
      this.bE.a(3, new cft<>(this, cqj.class, false));
      this.bE.a(3, new cft<>(this, cjk.class, true));
      this.bE.a(5, new cft<>(this, ckc.class, 10, true, false, ckc.bG));
   }

   public static byj.a gs() {
      return cod.gu().a(byk.m, 35.0).a(byk.v, 0.23F).a(byk.c, 3.0).a(byk.a, 2.0).a(byk.A);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bM, false);
      $$0.a(bN, 0);
      $$0.a(bO, false);
   }

   public boolean gv() {
      return this.au().a(bO);
   }

   public boolean gw() {
      return this.bT;
   }

   public void x(boolean $$0) {
      if (chy.a(this)) {
         if (this.bT != $$0) {
            this.bT = $$0;
            ((cgn)this.O()).b($$0);
            if ($$0) {
               this.bD.a(1, this.bS);
            } else {
               this.bD.a(this.bS);
            }
         }
      } else if (this.bT) {
         this.bD.a(this.bS);
         this.bT = false;
      }
   }

   @Override
   public boolean n_() {
      return this.au().a(bM);
   }

   @Override
   protected int e(arq $$0) {
      if (this.n_()) {
         this.by = (int)((double)this.by * 2.5);
      }

      return super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(bM, $$0);
      if (this.dV() != null && !this.dV().C) {
         byg $$1 = this.g(byk.v);
         $$1.c(a);
         if ($$0) {
            $$1.b(b);
         }
      }
   }

   @Override
   public void a(akj<?> $$0) {
      if (bM.equals($$0)) {
         this.i_();
      }

      super.a($$0);
   }

   protected boolean x() {
      return true;
   }

   @Override
   public void h() {
      if (!this.dV().C && this.bK() && !this.gg()) {
         if (this.gv()) {
            this.bV--;
            if (this.bV < 0) {
               this.ac_();
            }
         } else if (this.x()) {
            if (this.a(axh.a)) {
               this.bU++;
               if (this.bU >= 600) {
                  this.r(300);
               }
            } else {
               this.bU = -1;
            }
         }
      }

      super.h();
   }

   @Override
   public void k_() {
      if (this.bK()) {
         boolean $$0 = this.ad_() && this.gl();
         if ($$0) {
            czd $$1 = this.a(bwp.f);
            if (!$$1.f()) {
               if ($$1.m()) {
                  cyz $$2 = $$1.h();
                  $$1.b($$1.o() + this.ae.a(2));
                  if ($$1.o() >= $$1.p()) {
                     this.a($$2, bwp.f);
                     this.a(bwp.f, czd.k);
                  }
               }

               $$0 = false;
            }

            if ($$0) {
               this.e(8.0F);
            }
         }
      }

      super.k_();
   }

   private void r(int $$0) {
      this.bV = $$0;
      this.au().a(bO, true);
   }

   protected void ac_() {
      this.b(bwo.K);
      if (!this.bb()) {
         this.dV().a(null, 1040, this.dv(), 0);
      }
   }

   protected void b(bwo<? extends cox> $$0) {
      this.a($$0, bvz.a(this, true, true), $$0x -> $$0x.J($$0x.dV().d_($$0x.dv()).d()));
   }

   @VisibleForTesting
   public boolean a(arq $$0, cqo $$1) {
      coy $$2 = $$1.a(bwo.bQ, bvz.a($$1, true, true), $$2x -> {
         $$2x.a($$0, $$0.d_($$2x.dv()), bwn.i, new cox.b(false, true));
         $$2x.a($$1.gz());
         $$2x.a($$1.gL().a(un.a));
         $$2x.a($$1.gs().a());
         $$2x.s($$1.t());
         if (!this.bb()) {
            $$0.a(null, 1026, this.dv(), 0);
         }
      });
      return $$2 != null;
   }

   protected boolean ad_() {
      return true;
   }

   @Override
   public boolean a(arq $$0, buu $$1, float $$2) {
      if (!super.a($$0, $$1, $$2)) {
         return false;
      } else {
         bxe $$3 = this.f();
         if ($$3 == null && $$1.d() instanceof bxe) {
            $$3 = (bxe)$$1.d();
         }

         if ($$3 != null && $$0.an() == bua.d && (double)this.ae.i() < this.h(byk.A) && $$0.O().c(diw.f)) {
            int $$4 = azm.a(this.dA());
            int $$5 = azm.a(this.dC());
            int $$6 = azm.a(this.dG());
            bwo<? extends cox> $$7 = this.aq();
            cox $$8 = $$7.a($$0, bwn.j);
            if ($$8 == null) {
               return true;
            }

            for (int $$9 = 0; $$9 < 50; $$9++) {
               int $$10 = $$4 + azm.a(this.ae, 7, 40) * azm.a(this.ae, -1, 1);
               int $$11 = $$5 + azm.a(this.ae, 7, 40) * azm.a(this.ae, -1, 1);
               int $$12 = $$6 + azm.a(this.ae, 7, 40) * azm.a(this.ae, -1, 1);
               iu $$13 = new iu($$10, $$11, $$12);
               if (bxz.a($$7, $$0, $$13) && bxz.a($$7, $$0, bwn.j, $$13, $$0.A)) {
                  $$8.a_((double)$$10, (double)$$11, (double)$$12);
                  if (!$$0.a((double)$$10, (double)$$11, (double)$$12, 7.0) && $$0.f($$8) && $$0.g($$8) && ($$8.q() || !$$0.d($$8.cR()))) {
                     $$8.g($$3);
                     $$8.a($$0, $$0.d_($$8.dv()), bwn.j, null);
                     $$0.a_($$8);
                     byg $$14 = this.g(byk.A);
                     byi $$15 = $$14.a(c);
                     double $$16 = $$15 != null ? $$15.b() : 0.0;
                     $$14.c(c);
                     $$14.d(new byi(c, $$16 - 0.05, byi.a.a));
                     $$8.g(byk.A).d(bJ);
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean c(arq $$0, bwf $$1) {
      boolean $$2 = super.c($$0, $$1);
      if ($$2) {
         float $$3 = this.dV().d_(this.dv()).b();
         if (this.fb().f() && this.bY() && this.ae.i() < $$3 * 0.3F) {
            $$1.e((float)(2 * (int)$$3));
         }
      }

      return $$2;
   }

   @Override
   protected awm u() {
      return awn.Ex;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.EH;
   }

   @Override
   protected awm l_() {
      return awn.EC;
   }

   protected awm n() {
      return awn.EN;
   }

   @Override
   protected void b(iu $$0, eah $$1) {
      this.a(this.n(), 0.15F, 1.0F);
   }

   @Override
   public bwo<? extends cox> aq() {
      return (bwo<? extends cox>)super.aq();
   }

   protected boolean q() {
      return false;
   }

   @Override
   protected void a(azv $$0, bub $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dV().an() == bua.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bwp.a, new czd(czh.pP));
         } else {
            this.a(bwp.a, new czd(czh.pQ));
         }
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.n_());
      $$0.a("CanBreakDoors", this.gw());
      $$0.a("InWaterTime", this.bj() ? this.bU : -1);
      $$0.a("DrownedConversionTime", this.gv() ? this.bV : -1);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.bU = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.r($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(arq $$0, bxe $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.an() == bua.c || $$0.an() == bua.d) && $$1 instanceof cqo $$3) {
         if ($$0.an() != bua.d && this.ae.h()) {
            return $$2;
         }

         if (this.a($$0, $$3)) {
            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public bwi e(bxq $$0) {
      return this.n_() ? bP : super.e($$0);
   }

   @Override
   public boolean g(czd $$0) {
      return $$0.a(axk.Z) && this.n_() && this.bZ() ? false : super.g($$0);
   }

   @Override
   public boolean c(arq $$0, czd $$1) {
      return $$1.a(czh.so) ? false : super.c($$0, $$1);
   }

   @Nullable
   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      azv $$4 = $$0.C_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      if ($$2 != bwn.i) {
         this.a_($$4.i() < 0.55F * $$5);
      }

      if ($$3 == null) {
         $$3 = new cox.b(a($$4), true);
      }

      if ($$3 instanceof cox.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<cja> $$7 = $$0.a(cja.class, this.cR().c(5.0, 3.0, 5.0), bwm.c);
                  if (!$$7.isEmpty()) {
                     cja $$8 = $$7.get(0);
                     $$8.w(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  cja $$9 = bwo.z.a(this.dV(), bwn.g);
                  if ($$9 != null) {
                     $$9.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
                     $$9.a($$0, $$1, bwn.g, null);
                     $$9.w(true);
                     this.n($$9);
                     $$0.b($$9);
                  }
               }
            }
         }

         this.x($$4.i() < $$5 * 0.1F);
         if ($$2 != bwn.i) {
            this.a($$4, $$1);
            this.a($$0, $$4, $$1);
         }
      }

      if (this.a(bwp.f).f()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(bwp.f, new czd($$4.i() < 0.1F ? dmh.ew : dmh.ev));
            this.a(bwp.f, 0.0F);
         }
      }

      this.J($$5);
      return $$3;
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.bU = $$0;
   }

   @VisibleForTesting
   public void c(int $$0) {
      this.bV = $$0;
   }

   public static boolean a(azv $$0) {
      return $$0.i() < 0.05F;
   }

   protected void J(float $$0) {
      this.gx();
      this.g(byk.p).c(new byi(bw, this.ae.j() * 0.05F, byi.a.a));
      double $$1 = this.ae.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.g(byk.m).c(new byi(bL, $$1, byi.a.c));
      }

      if (this.ae.i() < $$0 * 0.05F) {
         this.g(byk.A).c(new byi(bK, this.ae.j() * 0.25 + 0.5, byi.a.a));
         this.g(byk.s).c(new byi(bK, this.ae.j() * 3.0 + 1.0, byi.a.c));
         this.x(true);
      }
   }

   protected void gx() {
      this.g(byk.A).a(this.ae.j() * 0.1F);
   }

   @Override
   protected void a(arq $$0, buu $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cnp $$4 && $$4.x()) {
         czd $$5 = this.t();
         if (!$$5.f()) {
            $$4.gr();
            this.a($$0, $$5);
         }
      }
   }

   protected czd t() {
      return new czd(czh.vy);
   }

   class a extends cfc {
      a(final bxm $$0, final double $$1, final int $$2) {
         super(dmh.mL, $$0, $$1, $$2);
      }

      @Override
      public void a(djb $$0, iu $$1) {
         $$0.a(null, $$1, awn.ED, awo.f, 0.5F, 0.9F + cox.this.ae.i() * 0.2F);
      }

      @Override
      public void a(dja $$0, iu $$1) {
         $$0.a(null, $$1, awn.Bm, awo.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bxw {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
