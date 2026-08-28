import com.google.common.annotations.VisibleForTesting;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cmf extends clm {
   private static final alh b = alh.b("baby");
   private static final bwb c = new bwb(b, 0.5, bwb.a.b);
   private static final alh d = alh.b("reinforcement_caller_charge");
   private static final bwb cb = new bwb(alh.b("reinforcement_callee_charge"), -0.05F, bwb.a.a);
   private static final alh cc = alh.b("leader_zombie_bonus");
   private static final alh cd = alh.b("zombie_random_spawn_bonus");
   private static final akk<Boolean> ce = ako.a(cmf.class, akm.k);
   private static final akk<Integer> cf = ako.a(cmf.class, akm.b);
   private static final akk<Boolean> cg = ako.a(cmf.class, akm.k);
   public static final float e = 0.05F;
   public static final int bY = 50;
   public static final int bZ = 40;
   public static final int ca = 7;
   private static final buc ch = bug.bu.n().a(0.5F).b(0.93F);
   private static final float ci = 0.1F;
   private static final Predicate<brv> cj = $$0 -> $$0 == brv.d;
   private final cbd ck = new cbd(this, cj);
   private boolean cl;
   private int cm;
   private int cn;

   public cmf(bug<? extends cmf> $$0, dev $$1) {
      super($$0, $$1);
   }

   public cmf(dev $$0) {
      this(bug.bu, $$0);
   }

   @Override
   protected void D() {
      this.bS.a(4, new cmf.a(this, 1.0, 3));
      this.bS.a(8, new ccb(this, coh.class, 8.0F));
      this.bS.a(8, new cco(this));
      this.t();
   }

   protected void t() {
      this.bS.a(2, new cdi(this, 1.0, false));
      this.bS.a(6, new ccf(this, 1.0, true, 4, this::gC));
      this.bS.a(7, new cdg(this, 1.0));
      this.bT.a(1, new cdl(this).a(cmh.class));
      this.bT.a(2, new cdm<>(this, coh.class, true));
      this.bT.a(3, new cdm<>(this, cno.class, false));
      this.bT.a(3, new cdm<>(this, cgy.class, true));
      this.bT.a(5, new cdm<>(this, chn.class, 10, true, false, chn.bY));
   }

   public static bwc.a gy() {
      return clm.gB().a(bwd.m, 35.0).a(bwd.v, 0.23F).a(bwd.c, 3.0).a(bwd.a, 2.0).a(bwd.A);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(ce, false);
      $$0.a(cf, 0);
      $$0.a(cg, false);
   }

   public boolean gz() {
      return this.av().a(cg);
   }

   public boolean gC() {
      return this.cl;
   }

   public void y(boolean $$0) {
      if (cfr.a(this)) {
         if (this.cl != $$0) {
            this.cl = $$0;
            ((ceg)this.P()).b($$0);
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
   public boolean p_() {
      return this.av().a(ce);
   }

   @Override
   protected int eq() {
      if (this.p_()) {
         this.bN = (int)((double)this.bN * 2.5);
      }

      return super.eq();
   }

   @Override
   public void a(boolean $$0) {
      this.av().a(ce, $$0);
      if (this.dX() != null && !this.dX().C) {
         bvz $$1 = this.g(bwd.v);
         $$1.c(b);
         if ($$0) {
            $$1.b(c);
         }
      }
   }

   @Override
   public void a(akk<?> $$0) {
      if (ce.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   protected boolean gw() {
      return true;
   }

   @Override
   public void l() {
      if (!this.dX().C && this.bM() && !this.gi()) {
         if (this.gz()) {
            this.cn--;
            if (this.cn < 0) {
               this.ah_();
            }
         } else if (this.gw()) {
            if (this.a(axf.a)) {
               this.cm++;
               if (this.cm >= 600) {
                  this.s(300);
               }
            } else {
               this.cm = -1;
            }
         }
      }

      super.l();
   }

   @Override
   public void n_() {
      if (this.bM()) {
         boolean $$0 = this.ai_() && this.gn();
         if ($$0) {
            cvx $$1 = this.a(buh.f);
            if (!$$1.f()) {
               if ($$1.m()) {
                  cvt $$2 = $$1.h();
                  $$1.b($$1.o() + this.af.a(2));
                  if ($$1.o() >= $$1.p()) {
                     this.a($$2, buh.f);
                     this.a(buh.f, cvx.k);
                  }
               }

               $$0 = false;
            }

            if ($$0) {
               this.d(8.0F);
            }
         }
      }

      super.n_();
   }

   private void s(int $$0) {
      this.cn = $$0;
      this.av().a(cg, true);
   }

   protected void ah_() {
      this.b(bug.B);
      if (!this.bc()) {
         this.dX().a(null, 1040, this.dx(), 0);
      }
   }

   protected void b(bug<? extends cmf> $$0) {
      this.a($$0, btu.a(this, true, true), $$0x -> $$0x.J($$0x.dX().d_($$0x.dx()).d()));
   }

   @VisibleForTesting
   public boolean a(arm $$0, cnt $$1) {
      cmg $$2 = $$1.a(bug.bw, btu.a($$1, true, true), $$2x -> {
         $$2x.a($$0, $$0.d_($$2x.dx()), buf.i, new cmf.b(false, true));
         $$2x.a($$1.gF());
         $$2x.a($$1.gP().a(ux.a));
         $$2x.a($$1.gx().a());
         $$2x.t($$1.t());
         if (!this.bc()) {
            $$0.a(null, 1026, this.dx(), 0);
         }
      });
      return $$2 != null;
   }

   protected boolean ai_() {
      return true;
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (this.dX() instanceof arm $$2) {
         buv $$4 = this.m();
         if ($$4 == null && $$0.d() instanceof buv) {
            $$4 = (buv)$$0.d();
         }

         if ($$4 != null && this.dX().am() == brv.d && (double)this.af.i() < this.h(bwd.A) && this.dX().ac().b(der.e)) {
            int $$5 = azj.a(this.dC());
            int $$6 = azj.a(this.dE());
            int $$7 = azj.a(this.dI());
            bug<? extends cmf> $$8 = this.aq();
            cmf $$9 = $$8.a(this.dX(), buf.j);
            if ($$9 == null) {
               return true;
            }

            for (int $$10 = 0; $$10 < 50; $$10++) {
               int $$11 = $$5 + azj.a(this.af, 7, 40) * azj.a(this.af, -1, 1);
               int $$12 = $$6 + azj.a(this.af, 7, 40) * azj.a(this.af, -1, 1);
               int $$13 = $$7 + azj.a(this.af, 7, 40) * azj.a(this.af, -1, 1);
               jg $$14 = new jg($$11, $$12, $$13);
               if (bvr.a($$8, this.dX(), $$14) && bvr.a($$8, $$2, buf.j, $$14, this.dX().A)) {
                  $$9.a_((double)$$11, (double)$$12, (double)$$13);
                  if (!this.dX().a((double)$$11, (double)$$12, (double)$$13, 7.0) && this.dX().f($$9) && this.dX().g($$9) && !this.dX().d($$9.cS())) {
                     $$9.h($$4);
                     $$9.a($$2, this.dX().d_($$9.dx()), buf.j, null);
                     $$2.a_($$9);
                     bvz $$15 = this.g(bwd.A);
                     bwb $$16 = $$15.a(d);
                     double $$17 = $$16 != null ? $$16.c() : 0.0;
                     $$15.c(d);
                     $$15.d(new bwb(d, $$17 - 0.05, bwb.a.a));
                     $$9.g(bwd.A).d(cb);
                     break;
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean E(btz $$0) {
      boolean $$1 = super.E($$0);
      if ($$1) {
         float $$2 = this.dX().d_(this.dx()).b();
         if (this.fb().f() && this.bZ() && this.af.i() < $$2 * 0.3F) {
            $$0.d((float)(2 * (int)$$2));
         }
      }

      return $$1;
   }

   @Override
   protected awj w() {
      return awk.Dx;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.DH;
   }

   @Override
   protected awj o_() {
      return awk.DC;
   }

   protected awj y() {
      return awk.DN;
   }

   @Override
   protected void b(jg $$0, dvd $$1) {
      this.a(this.y(), 0.15F, 1.0F);
   }

   @Override
   public bug<? extends cmf> aq() {
      return (bug<? extends cmf>)super.aq();
   }

   @Override
   protected void a(azr $$0, brw $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dX().am() == brv.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(buh.a, new cvx(cwb.pc));
         } else {
            this.a(buh.a, new cvx(cwb.pd));
         }
      }
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.p_());
      $$0.a("CanBreakDoors", this.gC());
      $$0.a("InWaterTime", this.bk() ? this.cm : -1);
      $$0.a("DrownedConversionTime", this.gz() ? this.cn : -1);
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CanBreakDoors"));
      this.cm = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.s($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(arm $$0, buv $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.am() == brv.c || $$0.am() == brv.d) && $$1 instanceof cnt $$3) {
         if ($$0.am() != brv.d && this.af.h()) {
            return $$2;
         }

         if (this.a($$0, $$3)) {
            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public buc e(bvh $$0) {
      return this.p_() ? ch : super.e($$0);
   }

   @Override
   public boolean h(cvx $$0) {
      return $$0.a(cwb.qS) && this.p_() && this.ca() ? false : super.h($$0);
   }

   @Override
   public boolean i(cvx $$0) {
      return $$0.a(cwb.rh) ? false : super.i($$0);
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      azr $$4 = $$0.E_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      if ($$2 != buf.i) {
         this.a_($$4.i() < 0.55F * $$5);
      }

      if ($$3 == null) {
         $$3 = new cmf.b(a($$4), true);
      }

      if ($$3 instanceof cmf.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<cgr> $$7 = $$0.a(cgr.class, this.cS().c(5.0, 3.0, 5.0), bue.c);
                  if (!$$7.isEmpty()) {
                     cgr $$8 = $$7.get(0);
                     $$8.x(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  cgr $$9 = bug.t.a(this.dX(), buf.g);
                  if ($$9 != null) {
                     $$9.b(this.dC(), this.dE(), this.dI(), this.dN(), 0.0F);
                     $$9.a($$0, $$1, buf.g, null);
                     $$9.x(true);
                     this.n($$9);
                     $$0.b($$9);
                  }
               }
            }
         }

         this.y($$4.i() < $$5 * 0.1F);
         if ($$2 != buf.i) {
            this.a($$4, $$1);
            this.a($$0, $$4, $$1);
         }
      }

      if (this.a(buh.f).f()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(buh.f, new cvx($$4.i() < 0.1F ? dia.ef : dia.ee));
            this.bV[buh.f.b()] = 0.0F;
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

   public static boolean a(azr $$0) {
      return $$0.i() < 0.05F;
   }

   protected void J(float $$0) {
      this.gD();
      this.g(bwd.p).c(new bwb(bL, this.af.j() * 0.05F, bwb.a.a));
      double $$1 = this.af.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.g(bwd.m).c(new bwb(cd, $$1, bwb.a.c));
      }

      if (this.af.i() < $$0 * 0.05F) {
         this.g(bwd.A).c(new bwb(cc, this.af.j() * 0.25 + 0.5, bwb.a.a));
         this.g(bwd.s).c(new bwb(cc, this.af.j() * 3.0 + 1.0, bwb.a.c));
         this.y(true);
      }
   }

   protected void gD() {
      this.g(bwd.A).a(this.af.j() * 0.1F);
   }

   @Override
   protected void a(arm $$0, bsp $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cky $$4 && $$4.gx()) {
         cvx $$5 = this.gv();
         if (!$$5.f()) {
            $$4.gy();
            this.b($$5);
         }
      }
   }

   protected cvx gv() {
      return new cvx(cwb.uq);
   }

   class a extends ccv {
      a(final bvd $$0, final double $$1, final int $$2) {
         super(dia.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(dew $$0, jg $$1) {
         $$0.a(null, $$1, awk.DD, awl.f, 0.5F, 0.9F + cmf.this.af.i() * 0.2F);
      }

      @Override
      public void a(dev $$0, jg $$1) {
         $$0.a(null, $$1, awk.Am, awl.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bvo {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
