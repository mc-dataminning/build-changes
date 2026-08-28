import com.google.common.annotations.VisibleForTesting;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cmp extends clw {
   private static final aku a = aku.b("baby");
   private static final bwl b = new bwl(a, 0.5, bwl.a.b);
   private static final aku c = aku.b("reinforcement_caller_charge");
   private static final bwl cb = new bwl(aku.b("reinforcement_callee_charge"), -0.05F, bwl.a.a);
   private static final aku cc = aku.b("leader_zombie_bonus");
   private static final aku cd = aku.b("zombie_random_spawn_bonus");
   private static final ajx<Boolean> ce = akb.a(cmp.class, ajz.k);
   private static final ajx<Integer> cf = akb.a(cmp.class, ajz.b);
   private static final ajx<Boolean> cg = akb.a(cmp.class, ajz.k);
   public static final float d = 0.05F;
   public static final int bY = 50;
   public static final int bZ = 40;
   public static final int ca = 7;
   private static final bum ch = buq.bN.n().a(0.5F).b(0.93F);
   private static final float ci = 0.1F;
   private static final Predicate<bsf> cj = $$0 -> $$0 == bsf.d;
   private final cbn ck = new cbn(this, cj);
   private boolean cl;
   private int cm;
   private int cn;

   public cmp(buq<? extends cmp> $$0, dgg $$1) {
      super($$0, $$1);
   }

   public cmp(dgg $$0) {
      this(buq.bN, $$0);
   }

   @Override
   protected void B() {
      this.bS.a(4, new cmp.a(this, 1.0, 3));
      this.bS.a(8, new ccl(this, cov.class, 8.0F));
      this.bS.a(8, new ccy(this));
      this.p();
   }

   protected void p() {
      this.bS.a(2, new cds(this, 1.0, false));
      this.bS.a(6, new ccp(this, 1.0, true, 4, this::gw));
      this.bS.a(7, new cdq(this, 1.0));
      this.bT.a(1, new cdv(this).a(cmr.class));
      this.bT.a(2, new cdw<>(this, cov.class, true));
      this.bT.a(3, new cdw<>(this, cob.class, false));
      this.bT.a(3, new cdw<>(this, chi.class, true));
      this.bT.a(5, new cdw<>(this, chx.class, 10, true, false, chx.bY));
   }

   public static bwm.a gs() {
      return clw.gu().a(bwn.m, 35.0).a(bwn.v, 0.23F).a(bwn.c, 3.0).a(bwn.a, 2.0).a(bwn.A);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(ce, false);
      $$0.a(cf, 0);
      $$0.a(cg, false);
   }

   public boolean gv() {
      return this.au().a(cg);
   }

   public boolean gw() {
      return this.cl;
   }

   public void y(boolean $$0) {
      if (cgb.a(this)) {
         if (this.cl != $$0) {
            this.cl = $$0;
            ((ceq)this.L()).b($$0);
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
   protected int e(arc $$0) {
      if (this.e_()) {
         this.bN = (int)((double)this.bN * 2.5);
      }

      return super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(ce, $$0);
      if (this.dW() != null && !this.dW().C) {
         bwj $$1 = this.g(bwn.v);
         $$1.c(a);
         if ($$0) {
            $$1.b(b);
         }
      }
   }

   @Override
   public void a(ajx<?> $$0) {
      if (ce.equals($$0)) {
         this.m_();
      }

      super.a($$0);
   }

   protected boolean gq() {
      return true;
   }

   @Override
   public void h() {
      if (!this.dW().C && this.bL() && !this.gc()) {
         if (this.gv()) {
            this.cn--;
            if (this.cn < 0) {
               this.ah_();
            }
         } else if (this.gq()) {
            if (this.a(awu.a)) {
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
         boolean $$0 = this.ai_() && this.gh();
         if ($$0) {
            cwn $$1 = this.a(bur.f);
            if (!$$1.f()) {
               if ($$1.m()) {
                  cwj $$2 = $$1.h();
                  $$1.b($$1.o() + this.ae.a(2));
                  if ($$1.o() >= $$1.p()) {
                     this.a($$2, bur.f);
                     this.a(bur.f, cwn.j);
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
      this.b(buq.K);
      if (!this.bb()) {
         this.dW().a(null, 1040, this.dw(), 0);
      }
   }

   protected void b(buq<? extends cmp> $$0) {
      this.a($$0, bue.a(this, true, true), $$0x -> $$0x.J($$0x.dW().d_($$0x.dw()).d()));
   }

   @VisibleForTesting
   public boolean a(arc $$0, cog $$1) {
      cmq $$2 = $$1.a(buq.bP, bue.a($$1, true, true), $$2x -> {
         $$2x.a($$0, $$0.d_($$2x.dw()), bup.i, new cmp.b(false, true));
         $$2x.a($$1.gz());
         $$2x.a($$1.gJ().a(ue.a));
         $$2x.a($$1.gr().a());
         $$2x.s($$1.x());
         if (!this.bb()) {
            $$0.a(null, 1026, this.dw(), 0);
         }
      });
      return $$2 != null;
   }

   protected boolean ai_() {
      return true;
   }

   @Override
   public boolean a(arc $$0, bsz $$1, float $$2) {
      if (!super.a($$0, $$1, $$2)) {
         return false;
      } else {
         bvf $$3 = this.O_();
         if ($$3 == null && $$1.d() instanceof bvf) {
            $$3 = (bvf)$$1.d();
         }

         if ($$3 != null && $$0.am() == bsf.d && (double)this.ae.i() < this.h(bwn.A) && $$0.O().b(dgc.e)) {
            int $$4 = ayy.a(this.dB());
            int $$5 = ayy.a(this.dD());
            int $$6 = ayy.a(this.dH());
            buq<? extends cmp> $$7 = this.aq();
            cmp $$8 = $$7.a($$0, bup.j);
            if ($$8 == null) {
               return true;
            }

            for (int $$9 = 0; $$9 < 50; $$9++) {
               int $$10 = $$4 + ayy.a(this.ae, 7, 40) * ayy.a(this.ae, -1, 1);
               int $$11 = $$5 + ayy.a(this.ae, 7, 40) * ayy.a(this.ae, -1, 1);
               int $$12 = $$6 + ayy.a(this.ae, 7, 40) * ayy.a(this.ae, -1, 1);
               ji $$13 = new ji($$10, $$11, $$12);
               if (bwb.a($$7, $$0, $$13) && bwb.a($$7, $$0, bup.j, $$13, $$0.A)) {
                  $$8.a_((double)$$10, (double)$$11, (double)$$12);
                  if (!$$0.a((double)$$10, (double)$$11, (double)$$12, 7.0) && $$0.f($$8) && $$0.g($$8) && ($$8.x() || !$$0.d($$8.cR()))) {
                     $$8.h($$3);
                     $$8.a($$0, $$0.d_($$8.dw()), bup.j, null);
                     $$0.a_($$8);
                     bwj $$14 = this.g(bwn.A);
                     bwl $$15 = $$14.a(c);
                     double $$16 = $$15 != null ? $$15.c() : 0.0;
                     $$14.c(c);
                     $$14.d(new bwl(c, $$16 - 0.05, bwl.a.a));
                     $$8.g(bwn.A).d(cb);
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean c(arc $$0, buj $$1) {
      boolean $$2 = super.c($$0, $$1);
      if ($$2) {
         float $$3 = this.dW().d_(this.dw()).b();
         if (this.eZ().f() && this.bY() && this.ae.i() < $$3 * 0.3F) {
            $$1.d((float)(2 * (int)$$3));
         }
      }

      return $$2;
   }

   @Override
   protected avy u() {
      return avz.Eh;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.Er;
   }

   @Override
   protected avy o_() {
      return avz.Em;
   }

   protected avy t() {
      return avz.Ex;
   }

   @Override
   protected void b(ji $$0, dwv $$1) {
      this.a(this.t(), 0.15F, 1.0F);
   }

   @Override
   public buq<? extends cmp> aq() {
      return (buq<? extends cmp>)super.aq();
   }

   protected boolean x() {
      return false;
   }

   @Override
   protected void a(azg $$0, bsg $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dW().am() == bsf.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bur.a, new cwn(cwr.pG));
         } else {
            this.a(bur.a, new cwn(cwr.pH));
         }
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.e_());
      $$0.a("CanBreakDoors", this.gw());
      $$0.a("InWaterTime", this.bj() ? this.cm : -1);
      $$0.a("DrownedConversionTime", this.gv() ? this.cn : -1);
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
   public boolean a(arc $$0, bvf $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.am() == bsf.c || $$0.am() == bsf.d) && $$1 instanceof cog $$3) {
         if ($$0.am() != bsf.d && this.ae.h()) {
            return $$2;
         }

         if (this.a($$0, $$3)) {
            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public bum e(bvr $$0) {
      return this.e_() ? ch : super.e($$0);
   }

   @Override
   public boolean g(cwn $$0) {
      return $$0.a(cwr.ry) && this.e_() && this.bZ() ? false : super.g($$0);
   }

   @Override
   public boolean c(arc $$0, cwn $$1) {
      return $$1.a(cwr.sd) ? false : super.c($$0, $$1);
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      azg $$4 = $$0.H_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      if ($$2 != bup.i) {
         this.a_($$4.i() < 0.55F * $$5);
      }

      if ($$3 == null) {
         $$3 = new cmp.b(a($$4), true);
      }

      if ($$3 instanceof cmp.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<chb> $$7 = $$0.a(chb.class, this.cR().c(5.0, 3.0, 5.0), buo.c);
                  if (!$$7.isEmpty()) {
                     chb $$8 = $$7.get(0);
                     $$8.x(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  chb $$9 = buq.z.a(this.dW(), bup.g);
                  if ($$9 != null) {
                     $$9.b(this.dB(), this.dD(), this.dH(), this.dM(), 0.0F);
                     $$9.a($$0, $$1, bup.g, null);
                     $$9.x(true);
                     this.n($$9);
                     $$0.b($$9);
                  }
               }
            }
         }

         this.y($$4.i() < $$5 * 0.1F);
         if ($$2 != bup.i) {
            this.a($$4, $$1);
            this.a($$0, $$4, $$1);
         }
      }

      if (this.a(bur.f).f()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(bur.f, new cwn($$4.i() < 0.1F ? djm.es : djm.er));
            this.bV[bur.f.b()] = 0.0F;
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

   public static boolean a(azg $$0) {
      return $$0.i() < 0.05F;
   }

   protected void J(float $$0) {
      this.gx();
      this.g(bwn.p).c(new bwl(bL, this.ae.j() * 0.05F, bwl.a.a));
      double $$1 = this.ae.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.g(bwn.m).c(new bwl(cd, $$1, bwl.a.c));
      }

      if (this.ae.i() < $$0 * 0.05F) {
         this.g(bwn.A).c(new bwl(cc, this.ae.j() * 0.25 + 0.5, bwl.a.a));
         this.g(bwn.s).c(new bwl(cc, this.ae.j() * 3.0 + 1.0, bwl.a.c));
         this.y(true);
      }
   }

   protected void gx() {
      this.g(bwn.A).a(this.ae.j() * 0.1F);
   }

   @Override
   protected void a(arc $$0, bsz $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cli $$4 && $$4.gq()) {
         cwn $$5 = this.gp();
         if (!$$5.f()) {
            $$4.gr();
            this.a($$0, $$5);
         }
      }
   }

   protected cwn gp() {
      return new cwn(cwr.vn);
   }

   class a extends cdf {
      a(final bvn $$0, final double $$1, final int $$2) {
         super(djm.mH, $$0, $$1, $$2);
      }

      @Override
      public void a(dgh $$0, ji $$1) {
         $$0.a(null, $$1, avz.En, awa.f, 0.5F, 0.9F + cmp.this.ae.i() * 0.2F);
      }

      @Override
      public void a(dgg $$0, ji $$1) {
         $$0.a(null, $$1, avz.AW, awa.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bvy {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
