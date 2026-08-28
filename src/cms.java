import com.google.common.annotations.VisibleForTesting;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cms extends clz {
   private static final akv a = akv.b("baby");
   private static final bwo b = new bwo(a, 0.5, bwo.a.b);
   private static final akv c = akv.b("reinforcement_caller_charge");
   private static final bwo cb = new bwo(akv.b("reinforcement_callee_charge"), -0.05F, bwo.a.a);
   private static final akv cc = akv.b("leader_zombie_bonus");
   private static final akv cd = akv.b("zombie_random_spawn_bonus");
   private static final ajy<Boolean> ce = akc.a(cms.class, aka.k);
   private static final ajy<Integer> cf = akc.a(cms.class, aka.b);
   private static final ajy<Boolean> cg = akc.a(cms.class, aka.k);
   public static final float d = 0.05F;
   public static final int bY = 50;
   public static final int bZ = 40;
   public static final int ca = 7;
   private static final bup ch = but.bN.n().a(0.5F).b(0.93F);
   private static final float ci = 0.1F;
   private static final Predicate<bsi> cj = $$0 -> $$0 == bsi.d;
   private final cbq ck = new cbq(this, cj);
   private boolean cl;
   private int cm;
   private int cn;

   public cms(but<? extends cms> $$0, dgj $$1) {
      super($$0, $$1);
   }

   public cms(dgj $$0) {
      this(but.bN, $$0);
   }

   @Override
   protected void E() {
      this.bS.a(4, new cms.a(this, 1.0, 3));
      this.bS.a(8, new cco(this, coy.class, 8.0F));
      this.bS.a(8, new cdb(this));
      this.p();
   }

   protected void p() {
      this.bS.a(2, new cdv(this, 1.0, false));
      this.bS.a(6, new ccs(this, 1.0, true, 4, this::gz));
      this.bS.a(7, new cdt(this, 1.0));
      this.bT.a(1, new cdy(this).a(cmu.class));
      this.bT.a(2, new cdz<>(this, coy.class, true));
      this.bT.a(3, new cdz<>(this, coe.class, false));
      this.bT.a(3, new cdz<>(this, chl.class, true));
      this.bT.a(5, new cdz<>(this, cia.class, 10, true, false, cia.bY));
   }

   public static bwp.a gv() {
      return clz.gx().a(bwq.m, 35.0).a(bwq.v, 0.23F).a(bwq.c, 3.0).a(bwq.a, 2.0).a(bwq.A);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(ce, false);
      $$0.a(cf, 0);
      $$0.a(cg, false);
   }

   public boolean gy() {
      return this.au().a(cg);
   }

   public boolean gz() {
      return this.cl;
   }

   public void y(boolean $$0) {
      if (cge.a(this)) {
         if (this.cl != $$0) {
            this.cl = $$0;
            ((cet)this.P()).b($$0);
            if ($$0) {
               this.bS.a(1, this.ck);
            } else {
               this.bS.a(this.ck);
            }
         }
      } else if (this.cl) {
         this.bS.a(this.ck);
         this.cl = false;
      }
   }

   @Override
   public boolean e_() {
      return this.au().a(ce);
   }

   @Override
   protected int e(ard $$0) {
      if (this.e_()) {
         this.bN = (int)((double)this.bN * 2.5);
      }

      return super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(ce, $$0);
      if (this.dV() != null && !this.dV().C) {
         bwm $$1 = this.g(bwq.v);
         $$1.c(a);
         if ($$0) {
            $$1.b(b);
         }
      }
   }

   @Override
   public void a(ajy<?> $$0) {
      if (ce.equals($$0)) {
         this.m_();
      }

      super.a($$0);
   }

   protected boolean gt() {
      return true;
   }

   @Override
   public void h() {
      if (!this.dV().C && this.bL() && !this.gf()) {
         if (this.gy()) {
            this.cn--;
            if (this.cn < 0) {
               this.ah_();
            }
         } else if (this.gt()) {
            if (this.a(awv.a)) {
               this.cm++;
               if (this.cm >= 600) {
                  this.r(300);
               }
            } else {
               this.cm = -1;
            }
         }
      }

      super.h();
   }

   @Override
   public void d_() {
      if (this.bL()) {
         boolean $$0 = this.ai_() && this.gk();
         if ($$0) {
            cwq $$1 = this.a(buu.f);
            if (!$$1.f()) {
               if ($$1.m()) {
                  cwm $$2 = $$1.h();
                  $$1.b($$1.o() + this.ae.a(2));
                  if ($$1.o() >= $$1.p()) {
                     this.a($$2, buu.f);
                     this.a(buu.f, cwq.j);
                  }
               }

               $$0 = false;
            }

            if ($$0) {
               this.d(8.0F);
            }
         }
      }

      super.d_();
   }

   private void r(int $$0) {
      this.cn = $$0;
      this.au().a(cg, true);
   }

   protected void ah_() {
      this.b(but.K);
      if (!this.bb()) {
         this.dV().a(null, 1040, this.dv(), 0);
      }
   }

   protected void b(but<? extends cms> $$0) {
      this.a($$0, buh.a(this, true, true), $$0x -> $$0x.J($$0x.dV().d_($$0x.dv()).d()));
   }

   @VisibleForTesting
   public boolean a(ard $$0, coj $$1) {
      cmt $$2 = $$1.a(but.bP, buh.a($$1, true, true), $$2x -> {
         $$2x.a($$0, $$0.d_($$2x.dv()), bus.i, new cms.b(false, true));
         $$2x.a($$1.gC());
         $$2x.a($$1.gM().a(ue.a));
         $$2x.a($$1.gu().a());
         $$2x.s($$1.x());
         if (!this.bb()) {
            $$0.a(null, 1026, this.dv(), 0);
         }
      });
      return $$2 != null;
   }

   protected boolean ai_() {
      return true;
   }

   @Override
   public boolean a(ard $$0, btc $$1, float $$2) {
      if (!super.a($$0, $$1, $$2)) {
         return false;
      } else {
         bvi $$3 = this.O_();
         if ($$3 == null && $$1.d() instanceof bvi) {
            $$3 = (bvi)$$1.d();
         }

         if ($$3 != null && $$0.am() == bsi.d && (double)this.ae.i() < this.h(bwq.A) && $$0.O().b(dgf.e)) {
            int $$4 = ayz.a(this.dA());
            int $$5 = ayz.a(this.dC());
            int $$6 = ayz.a(this.dG());
            but<? extends cms> $$7 = this.aq();
            cms $$8 = $$7.a($$0, bus.j);
            if ($$8 == null) {
               return true;
            }

            for (int $$9 = 0; $$9 < 50; $$9++) {
               int $$10 = $$4 + ayz.a(this.ae, 7, 40) * ayz.a(this.ae, -1, 1);
               int $$11 = $$5 + ayz.a(this.ae, 7, 40) * ayz.a(this.ae, -1, 1);
               int $$12 = $$6 + ayz.a(this.ae, 7, 40) * ayz.a(this.ae, -1, 1);
               ji $$13 = new ji($$10, $$11, $$12);
               if (bwe.a($$7, $$0, $$13) && bwe.a($$7, $$0, bus.j, $$13, $$0.A)) {
                  $$8.a_((double)$$10, (double)$$11, (double)$$12);
                  if (!$$0.a((double)$$10, (double)$$11, (double)$$12, 7.0) && $$0.f($$8) && $$0.g($$8) && ($$8.x() || !$$0.d($$8.cR()))) {
                     $$8.h($$3);
                     $$8.a($$0, $$0.d_($$8.dv()), bus.j, null);
                     $$0.a_($$8);
                     bwm $$14 = this.g(bwq.A);
                     bwo $$15 = $$14.a(c);
                     double $$16 = $$15 != null ? $$15.c() : 0.0;
                     $$14.c(c);
                     $$14.d(new bwo(c, $$16 - 0.05, bwo.a.a));
                     $$8.g(bwq.A).d(cb);
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean c(ard $$0, bum $$1) {
      boolean $$2 = super.c($$0, $$1);
      if ($$2) {
         float $$3 = this.dV().d_(this.dv()).b();
         if (this.eZ().f() && this.bY() && this.ae.i() < $$3 * 0.3F) {
            $$1.d((float)(2 * (int)$$3));
         }
      }

      return $$2;
   }

   @Override
   protected avz u() {
      return awa.Eh;
   }

   @Override
   protected avz e(btc $$0) {
      return awa.Er;
   }

   @Override
   protected avz o_() {
      return awa.Em;
   }

   protected avz t() {
      return awa.Ex;
   }

   @Override
   protected void b(ji $$0, dwy $$1) {
      this.a(this.t(), 0.15F, 1.0F);
   }

   @Override
   public but<? extends cms> aq() {
      return (but<? extends cms>)super.aq();
   }

   protected boolean x() {
      return false;
   }

   @Override
   protected void a(azh $$0, bsj $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dV().am() == bsi.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(buu.a, new cwq(cwu.pG));
         } else {
            this.a(buu.a, new cwq(cwu.pH));
         }
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.e_());
      $$0.a("CanBreakDoors", this.gz());
      $$0.a("InWaterTime", this.bj() ? this.cm : -1);
      $$0.a("DrownedConversionTime", this.gy() ? this.cn : -1);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CanBreakDoors"));
      this.cm = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.r($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(ard $$0, bvi $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.am() == bsi.c || $$0.am() == bsi.d) && $$1 instanceof coj $$3) {
         if ($$0.am() != bsi.d && this.ae.h()) {
            return $$2;
         }

         if (this.a($$0, $$3)) {
            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public bup e(bvu $$0) {
      return this.e_() ? ch : super.e($$0);
   }

   @Override
   public boolean g(cwq $$0) {
      return $$0.a(cwu.ry) && this.e_() && this.bZ() ? false : super.g($$0);
   }

   @Override
   public boolean c(ard $$0, cwq $$1) {
      return $$1.a(cwu.sd) ? false : super.c($$0, $$1);
   }

   @Nullable
   @Override
   public bwb a(dha $$0, bsj $$1, bus $$2, @Nullable bwb $$3) {
      azh $$4 = $$0.H_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      if ($$2 != bus.i) {
         this.a_($$4.i() < 0.55F * $$5);
      }

      if ($$3 == null) {
         $$3 = new cms.b(a($$4), true);
      }

      if ($$3 instanceof cms.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<che> $$7 = $$0.a(che.class, this.cR().c(5.0, 3.0, 5.0), bur.c);
                  if (!$$7.isEmpty()) {
                     che $$8 = $$7.get(0);
                     $$8.x(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  che $$9 = but.z.a(this.dV(), bus.g);
                  if ($$9 != null) {
                     $$9.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
                     $$9.a($$0, $$1, bus.g, null);
                     $$9.x(true);
                     this.n($$9);
                     $$0.b($$9);
                  }
               }
            }
         }

         this.y($$4.i() < $$5 * 0.1F);
         if ($$2 != bus.i) {
            this.a($$4, $$1);
            this.a($$0, $$4, $$1);
         }
      }

      if (this.a(buu.f).f()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(buu.f, new cwq($$4.i() < 0.1F ? djp.es : djp.er));
            this.bV[buu.f.b()] = 0.0F;
         }
      }

      this.J($$5);
      return $$3;
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.cm = $$0;
   }

   @VisibleForTesting
   public void c(int $$0) {
      this.cn = $$0;
   }

   public static boolean a(azh $$0) {
      return $$0.i() < 0.05F;
   }

   protected void J(float $$0) {
      this.gA();
      this.g(bwq.p).c(new bwo(bL, this.ae.j() * 0.05F, bwo.a.a));
      double $$1 = this.ae.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.g(bwq.m).c(new bwo(cd, $$1, bwo.a.c));
      }

      if (this.ae.i() < $$0 * 0.05F) {
         this.g(bwq.A).c(new bwo(cc, this.ae.j() * 0.25 + 0.5, bwo.a.a));
         this.g(bwq.s).c(new bwo(cc, this.ae.j() * 3.0 + 1.0, bwo.a.c));
         this.y(true);
      }
   }

   protected void gA() {
      this.g(bwq.A).a(this.ae.j() * 0.1F);
   }

   @Override
   protected void a(ard $$0, btc $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cll $$4 && $$4.gt()) {
         cwq $$5 = this.gs();
         if (!$$5.f()) {
            $$4.gu();
            this.a($$0, $$5);
         }
      }
   }

   protected cwq gs() {
      return new cwq(cwu.vn);
   }

   class a extends cdi {
      a(final bvq $$0, final double $$1, final int $$2) {
         super(djp.mH, $$0, $$1, $$2);
      }

      @Override
      public void a(dgk $$0, ji $$1) {
         $$0.a(null, $$1, awa.En, awb.f, 0.5F, 0.9F + cms.this.ae.i() * 0.2F);
      }

      @Override
      public void a(dgj $$0, ji $$1) {
         $$0.a(null, $$1, awa.AW, awb.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bwb {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
