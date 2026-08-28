import com.google.common.annotations.VisibleForTesting;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cpe extends cok {
   private static final alg a = alg.b("baby");
   private static final byn b = new byn(a, 0.5, byn.a.b);
   private static final alg c = alg.b("reinforcement_caller_charge");
   private static final byn bJ = new byn(alg.b("reinforcement_callee_charge"), -0.05F, byn.a.a);
   private static final alg bK = alg.b("leader_zombie_bonus");
   private static final alg bL = alg.b("zombie_random_spawn_bonus");
   private static final akj<Boolean> bM = akn.a(cpe.class, akl.k);
   private static final akj<Integer> bN = akn.a(cpe.class, akl.b);
   private static final akj<Boolean> bO = akn.a(cpe.class, akl.k);
   public static final float d = 0.05F;
   public static final int bG = 50;
   public static final int bH = 40;
   public static final int bI = 7;
   private static final bwl bP = bwr.bO.n().a(0.5F).b(0.93F);
   private static final float bQ = 0.1F;
   private static final Predicate<bud> bR = $$0 -> $$0 == bud.d;
   private final cdp bS = new cdp(this, bR);
   private boolean bT;
   private int bU;
   private int bV;

   public cpe(bwr<? extends cpe> $$0, djh $$1) {
      super($$0, $$1);
   }

   public cpe(djh $$0) {
      this(bwr.bO, $$0);
   }

   @Override
   protected void D() {
      this.bD.a(4, new cpe.a(this, 1.0, 3));
      this.bD.a(8, new cen(this, crj.class, 8.0F));
      this.bD.a(8, new cfa(this));
      this.m();
   }

   protected void m() {
      this.bD.a(2, new cfu(this, 1.0, false));
      this.bD.a(6, new cer(this, 1.0, true, 4, this::gy));
      this.bD.a(7, new cfs(this, 1.0));
      this.bE.a(1, new cfx(this).a(cpg.class));
      this.bE.a(2, new cfy<>(this, crj.class, true));
      this.bE.a(3, new cfy<>(this, cqq.class, false));
      this.bE.a(3, new cfy<>(this, cjp.class, true));
      this.bE.a(5, new cfy<>(this, ckg.class, 10, true, false, ckg.bG));
   }

   public static byo.a gu() {
      return cok.gw().a(byp.m, 35.0).a(byp.v, 0.23F).a(byp.c, 3.0).a(byp.a, 2.0).a(byp.A);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bM, false);
      $$0.a(bN, 0);
      $$0.a(bO, false);
   }

   public boolean gx() {
      return this.ar().a(bO);
   }

   public boolean gy() {
      return this.bT;
   }

   public void x(boolean $$0) {
      if (cid.a(this)) {
         if (this.bT != $$0) {
            this.bT = $$0;
            ((cgs)this.O()).b($$0);
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
      return this.ar().a(bM);
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
      this.ar().a(bM, $$0);
      if (this.dU() != null && !this.dU().C) {
         byl $$1 = this.g(byp.v);
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
      if (!this.dU().C && this.bI() && !this.gi()) {
         if (this.gx()) {
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
      if (this.bI()) {
         boolean $$0 = this.ad_() && this.gn();
         if ($$0) {
            czk $$1 = this.a(bws.f);
            if (!$$1.f()) {
               if ($$1.m()) {
                  czg $$2 = $$1.h();
                  $$1.b($$1.o() + this.ae.a(2));
                  if ($$1.o() >= $$1.p()) {
                     this.a($$2, bws.f);
                     this.a(bws.f, czk.k);
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
      this.ar().a(bO, true);
   }

   protected void ac_() {
      this.b(bwr.K);
      if (!this.aZ()) {
         this.dU().a(null, 1040, this.du(), 0);
      }
   }

   protected void b(bwr<? extends cpe> $$0) {
      this.a($$0, bwc.a(this, true, true), $$0x -> $$0x.J($$0x.dU().d_($$0x.du()).d()));
   }

   @VisibleForTesting
   public boolean a(arq $$0, cqv $$1) {
      cpf $$2 = $$1.a(bwr.bQ, bwc.a($$1, true, true), $$2x -> {
         $$2x.a($$0, $$0.d_($$2x.du()), bwq.i, new cpe.b(false, true));
         $$2x.a($$1.gB());
         $$2x.a($$1.gN().d());
         $$2x.a($$1.gu().a());
         $$2x.s($$1.t());
         if (!this.aZ()) {
            $$0.a(null, 1026, this.du(), 0);
         }
      });
      return $$2 != null;
   }

   protected boolean ad_() {
      return true;
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
      if (!super.a($$0, $$1, $$2)) {
         return false;
      } else {
         bxj $$3 = this.f();
         if ($$3 == null && $$1.d() instanceof bxj) {
            $$3 = (bxj)$$1.d();
         }

         if ($$3 != null && $$0.an() == bud.d && (double)this.ae.i() < this.h(byp.A) && $$0.O().c(djd.f)) {
            int $$4 = azm.a(this.dz());
            int $$5 = azm.a(this.dB());
            int $$6 = azm.a(this.dF());
            bwr<? extends cpe> $$7 = this.an();
            cpe $$8 = $$7.a($$0, bwq.j);
            if ($$8 == null) {
               return true;
            }

            for (int $$9 = 0; $$9 < 50; $$9++) {
               int $$10 = $$4 + azm.a(this.ae, 7, 40) * azm.a(this.ae, -1, 1);
               int $$11 = $$5 + azm.a(this.ae, 7, 40) * azm.a(this.ae, -1, 1);
               int $$12 = $$6 + azm.a(this.ae, 7, 40) * azm.a(this.ae, -1, 1);
               iv $$13 = new iv($$10, $$11, $$12);
               if (bye.a($$7, $$0, $$13) && bye.a($$7, $$0, bwq.j, $$13, $$0.A)) {
                  $$8.a_((double)$$10, (double)$$11, (double)$$12);
                  if (!$$0.a((double)$$10, (double)$$11, (double)$$12, 7.0) && $$0.f($$8) && $$0.g($$8) && ($$8.q() || !$$0.d($$8.cQ()))) {
                     $$8.g($$3);
                     $$8.a($$0, $$0.d_($$8.du()), bwq.j, null);
                     $$0.a_($$8);
                     byl $$14 = this.g(byp.A);
                     byn $$15 = $$14.a(c);
                     double $$16 = $$15 != null ? $$15.b() : 0.0;
                     $$14.c(c);
                     $$14.d(new byn(c, $$16 - 0.05, byn.a.a));
                     $$8.g(byp.A).d(bJ);
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean c(arq $$0, bwi $$1) {
      boolean $$2 = super.c($$0, $$1);
      if ($$2) {
         float $$3 = this.dU().d_(this.du()).b();
         if (this.fa().f() && this.bW() && this.ae.i() < $$3 * 0.3F) {
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
   protected awm e(bux $$0) {
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
   protected void b(iv $$0, eao $$1) {
      this.a(this.n(), 0.15F, 1.0F);
   }

   @Override
   public bwr<? extends cpe> an() {
      return (bwr<? extends cpe>)super.an();
   }

   protected boolean q() {
      return false;
   }

   @Override
   protected void a(azv $$0, bue $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dU().an() == bud.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bws.a, new czk(czo.pP));
         } else {
            this.a(bws.a, new czk(czo.pQ));
         }
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.n_());
      $$0.a("CanBreakDoors", this.gy());
      $$0.a("InWaterTime", this.bh() ? this.bU : -1);
      $$0.a("DrownedConversionTime", this.gx() ? this.bV : -1);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0.o("IsBaby"));
      this.x($$0.o("CanBreakDoors"));
      this.bU = $$0.f("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.f("DrownedConversionTime") > -1) {
         this.r($$0.f("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(arq $$0, bxj $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.an() == bud.c || $$0.an() == bud.d) && $$1 instanceof cqv $$3) {
         if ($$0.an() != bud.d && this.ae.h()) {
            return $$2;
         }

         if (this.a($$0, $$3)) {
            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public bwl e(bxv $$0) {
      return this.n_() ? bP : super.e($$0);
   }

   @Override
   public boolean g(czk $$0) {
      return $$0.a(axk.Z) && this.n_() && this.bX() ? false : super.g($$0);
   }

   @Override
   public boolean c(arq $$0, czk $$1) {
      return $$1.a(czo.so) ? false : super.c($$0, $$1);
   }

   @Nullable
   @Override
   public byb a(djy $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      azv $$4 = $$0.C_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      if ($$2 != bwq.i) {
         this.a_($$4.i() < 0.55F * $$5);
      }

      if ($$3 == null) {
         $$3 = new cpe.b(a($$4), true);
      }

      if ($$3 instanceof cpe.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<cjf> $$7 = $$0.a(cjf.class, this.cQ().c(5.0, 3.0, 5.0), bwp.c);
                  if (!$$7.isEmpty()) {
                     cjf $$8 = $$7.get(0);
                     $$8.w(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  cjf $$9 = bwr.z.a(this.dU(), bwq.g);
                  if ($$9 != null) {
                     $$9.b(this.dz(), this.dB(), this.dF(), this.dK(), 0.0F);
                     $$9.a($$0, $$1, bwq.g, null);
                     $$9.w(true);
                     this.n($$9);
                     $$0.b($$9);
                  }
               }
            }
         }

         this.x($$4.i() < $$5 * 0.1F);
         if ($$2 != bwq.i) {
            this.a($$4, $$1);
            this.a($$0, $$4, $$1);
         }
      }

      if (this.a(bws.f).f()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(bws.f, new czk($$4.i() < 0.1F ? dmo.ew : dmo.ev));
            this.a(bws.f, 0.0F);
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
      this.gz();
      this.g(byp.p).c(new byn(bw, this.ae.j() * 0.05F, byn.a.a));
      double $$1 = this.ae.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.g(byp.m).c(new byn(bL, $$1, byn.a.c));
      }

      if (this.ae.i() < $$0 * 0.05F) {
         this.g(byp.A).c(new byn(bK, this.ae.j() * 0.25 + 0.5, byn.a.a));
         this.g(byp.s).c(new byn(bK, this.ae.j() * 3.0 + 1.0, byn.a.c));
         this.x(true);
      }
   }

   protected void gz() {
      this.g(byp.A).a(this.ae.j() * 0.1F);
   }

   @Override
   protected void a(arq $$0, bux $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cnw $$4 && $$4.x()) {
         czk $$5 = this.t();
         if (!$$5.f()) {
            $$4.gt();
            this.a($$0, $$5);
         }
      }
   }

   protected czk t() {
      return new czk(czo.vy);
   }

   class a extends cfh {
      a(final bxr $$0, final double $$1, final int $$2) {
         super(dmo.mL, $$0, $$1, $$2);
      }

      @Override
      public void a(dji $$0, iv $$1) {
         $$0.a(null, $$1, awn.ED, awo.f, 0.5F, 0.9F + cpe.this.ae.i() * 0.2F);
      }

      @Override
      public void a(djh $$0, iv $$1) {
         $$0.a(null, $$1, awn.Bm, awo.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements byb {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
