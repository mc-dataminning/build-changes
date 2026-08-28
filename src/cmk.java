import com.google.common.annotations.VisibleForTesting;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cmk extends clr {
   private static final ali b = ali.b("baby");
   private static final bwg c = new bwg(b, 0.5, bwg.a.b);
   private static final ali d = ali.b("reinforcement_caller_charge");
   private static final bwg cb = new bwg(ali.b("reinforcement_callee_charge"), -0.05F, bwg.a.a);
   private static final ali cc = ali.b("leader_zombie_bonus");
   private static final ali cd = ali.b("zombie_random_spawn_bonus");
   private static final akl<Boolean> ce = akp.a(cmk.class, akn.k);
   private static final akl<Integer> cf = akp.a(cmk.class, akn.b);
   private static final akl<Boolean> cg = akp.a(cmk.class, akn.k);
   public static final float e = 0.05F;
   public static final int bY = 50;
   public static final int bZ = 40;
   public static final int ca = 7;
   private static final buh ch = bul.bu.n().a(0.5F).b(0.93F);
   private static final float ci = 0.1F;
   private static final Predicate<bsa> cj = $$0 -> $$0 == bsa.d;
   private final cbi ck = new cbi(this, cj);
   private boolean cl;
   private int cm;
   private int cn;

   public cmk(bul<? extends cmk> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public cmk(dfb $$0) {
      this(bul.bu, $$0);
   }

   @Override
   protected void D() {
      this.bS.a(4, new cmk.a(this, 1.0, 3));
      this.bS.a(8, new ccg(this, com.class, 8.0F));
      this.bS.a(8, new cct(this));
      this.t();
   }

   protected void t() {
      this.bS.a(2, new cdn(this, 1.0, false));
      this.bS.a(6, new cck(this, 1.0, true, 4, this::gB));
      this.bS.a(7, new cdl(this, 1.0));
      this.bT.a(1, new cdq(this).a(cmm.class));
      this.bT.a(2, new cdr<>(this, com.class, true));
      this.bT.a(3, new cdr<>(this, cnt.class, false));
      this.bT.a(3, new cdr<>(this, chd.class, true));
      this.bT.a(5, new cdr<>(this, chs.class, 10, true, false, chs.bY));
   }

   public static bwh.a gx() {
      return clr.gA().a(bwi.m, 35.0).a(bwi.v, 0.23F).a(bwi.c, 3.0).a(bwi.a, 2.0).a(bwi.A);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(ce, false);
      $$0.a(cf, 0);
      $$0.a(cg, false);
   }

   public boolean gy() {
      return this.aw().a(cg);
   }

   public boolean gB() {
      return this.cl;
   }

   public void y(boolean $$0) {
      if (cfw.a(this)) {
         if (this.cl != $$0) {
            this.cl = $$0;
            ((cel)this.P()).b($$0);
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
      return this.aw().a(ce);
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
      this.aw().a(ce, $$0);
      if (this.dX() != null && !this.dX().C) {
         bwe $$1 = this.g(bwi.v);
         $$1.c(b);
         if ($$0) {
            $$1.b(c);
         }
      }
   }

   @Override
   public void a(akl<?> $$0) {
      if (ce.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   protected boolean gv() {
      return true;
   }

   @Override
   public void l() {
      if (!this.dX().C && this.bM() && !this.gh()) {
         if (this.gy()) {
            this.cn--;
            if (this.cn < 0) {
               this.ah_();
            }
         } else if (this.gv()) {
            if (this.a(axg.a)) {
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
         boolean $$0 = this.ai_() && this.gm();
         if ($$0) {
            cwb $$1 = this.a(bum.f);
            if (!$$1.f()) {
               if ($$1.m()) {
                  cvx $$2 = $$1.h();
                  $$1.b($$1.o() + this.af.a(2));
                  if ($$1.o() >= $$1.p()) {
                     this.a($$2, bum.f);
                     this.a(bum.f, cwb.k);
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
      this.aw().a(cg, true);
   }

   protected void ah_() {
      this.b(bul.B);
      if (!this.bc()) {
         this.dX().a(null, 1040, this.dx(), 0);
      }
   }

   protected void b(bul<? extends cmk> $$0) {
      this.a($$0, btz.a(this, true, true), $$0x -> $$0x.J($$0x.dX().d_($$0x.dx()).d()));
   }

   @VisibleForTesting
   public boolean a(arn $$0, cny $$1) {
      cml $$2 = $$1.a(bul.bw, btz.a($$1, true, true), $$2x -> {
         $$2x.a($$0, $$0.d_($$2x.dx()), buk.i, new cmk.b(false, true));
         $$2x.a($$1.gE());
         $$2x.a($$1.gO().a(uy.a));
         $$2x.a($$1.gw().a());
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
   public boolean a(bsu $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (this.dX() instanceof arn $$2) {
         bva $$4 = this.m();
         if ($$4 == null && $$0.d() instanceof bva) {
            $$4 = (bva)$$0.d();
         }

         if ($$4 != null && this.dX().ak() == bsa.d && (double)this.af.i() < this.h(bwi.A) && this.dX().ac().b(dex.e)) {
            int $$5 = azk.a(this.dC());
            int $$6 = azk.a(this.dE());
            int $$7 = azk.a(this.dI());
            bul<? extends cmk> $$8 = this.ar();
            cmk $$9 = $$8.a(this.dX(), buk.j);
            if ($$9 == null) {
               return true;
            }

            for (int $$10 = 0; $$10 < 50; $$10++) {
               int $$11 = $$5 + azk.a(this.af, 7, 40) * azk.a(this.af, -1, 1);
               int $$12 = $$6 + azk.a(this.af, 7, 40) * azk.a(this.af, -1, 1);
               int $$13 = $$7 + azk.a(this.af, 7, 40) * azk.a(this.af, -1, 1);
               jh $$14 = new jh($$11, $$12, $$13);
               if (bvw.a($$8, this.dX(), $$14) && bvw.a($$8, $$2, buk.j, $$14, this.dX().A)) {
                  $$9.a_((double)$$11, (double)$$12, (double)$$13);
                  if (!this.dX().a((double)$$11, (double)$$12, (double)$$13, 7.0) && this.dX().f($$9) && this.dX().g($$9) && !this.dX().d($$9.cS())) {
                     $$9.h($$4);
                     $$9.a($$2, this.dX().d_($$9.dx()), buk.j, null);
                     $$2.a_($$9);
                     bwe $$15 = this.g(bwi.A);
                     bwg $$16 = $$15.a(d);
                     double $$17 = $$16 != null ? $$16.c() : 0.0;
                     $$15.c(d);
                     $$15.d(new bwg(d, $$17 - 0.05, bwg.a.a));
                     $$9.g(bwi.A).d(cb);
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
   public boolean E(bue $$0) {
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
   protected awk w() {
      return awl.Dx;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.DH;
   }

   @Override
   protected awk o_() {
      return awl.DC;
   }

   protected awk y() {
      return awl.DN;
   }

   @Override
   protected void b(jh $$0, dvj $$1) {
      this.a(this.y(), 0.15F, 1.0F);
   }

   @Override
   public bul<? extends cmk> ar() {
      return (bul<? extends cmk>)super.ar();
   }

   @Override
   protected void a(azs $$0, bsb $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dX().ak() == bsa.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bum.a, new cwb(cwf.pc));
         } else {
            this.a(bum.a, new cwb(cwf.pd));
         }
      }
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.p_());
      $$0.a("CanBreakDoors", this.gB());
      $$0.a("InWaterTime", this.bk() ? this.cm : -1);
      $$0.a("DrownedConversionTime", this.gy() ? this.cn : -1);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CanBreakDoors"));
      this.cm = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.s($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(arn $$0, bva $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.ak() == bsa.c || $$0.ak() == bsa.d) && $$1 instanceof cny $$3) {
         if ($$0.ak() != bsa.d && this.af.h()) {
            return $$2;
         }

         if (this.a($$0, $$3)) {
            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public buh e(bvm $$0) {
      return this.p_() ? ch : super.e($$0);
   }

   @Override
   public boolean h(cwb $$0) {
      return $$0.a(cwf.qS) && this.p_() && this.ca() ? false : super.h($$0);
   }

   @Override
   public boolean i(cwb $$0) {
      return $$0.a(cwf.rh) ? false : super.i($$0);
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      azs $$4 = $$0.E_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      if ($$2 != buk.i) {
         this.a_($$4.i() < 0.55F * $$5);
      }

      if ($$3 == null) {
         $$3 = new cmk.b(a($$4), true);
      }

      if ($$3 instanceof cmk.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<cgw> $$7 = $$0.a(cgw.class, this.cS().c(5.0, 3.0, 5.0), buj.c);
                  if (!$$7.isEmpty()) {
                     cgw $$8 = $$7.get(0);
                     $$8.x(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  cgw $$9 = bul.t.a(this.dX(), buk.g);
                  if ($$9 != null) {
                     $$9.b(this.dC(), this.dE(), this.dI(), this.dN(), 0.0F);
                     $$9.a($$0, $$1, buk.g, null);
                     $$9.x(true);
                     this.n($$9);
                     $$0.b($$9);
                  }
               }
            }
         }

         this.y($$4.i() < $$5 * 0.1F);
         if ($$2 != buk.i) {
            this.a($$4, $$1);
            this.a($$0, $$4, $$1);
         }
      }

      if (this.a(bum.f).f()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(bum.f, new cwb($$4.i() < 0.1F ? dig.ef : dig.ee));
            this.bV[bum.f.b()] = 0.0F;
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

   public static boolean a(azs $$0) {
      return $$0.i() < 0.05F;
   }

   protected void J(float $$0) {
      this.gC();
      this.g(bwi.p).c(new bwg(bL, this.af.j() * 0.05F, bwg.a.a));
      double $$1 = this.af.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.g(bwi.m).c(new bwg(cd, $$1, bwg.a.c));
      }

      if (this.af.i() < $$0 * 0.05F) {
         this.g(bwi.A).c(new bwg(cc, this.af.j() * 0.25 + 0.5, bwg.a.a));
         this.g(bwi.s).c(new bwg(cc, this.af.j() * 3.0 + 1.0, bwg.a.c));
         this.y(true);
      }
   }

   protected void gC() {
      this.g(bwi.A).a(this.af.j() * 0.1F);
   }

   @Override
   protected void a(arn $$0, bsu $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cld $$4 && $$4.gw()) {
         cwb $$5 = this.gu();
         if (!$$5.f()) {
            $$4.gx();
            this.b($$5);
         }
      }
   }

   protected cwb gu() {
      return new cwb(cwf.uq);
   }

   class a extends cda {
      a(final bvi $$0, final double $$1, final int $$2) {
         super(dig.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(dfc $$0, jh $$1) {
         $$0.a(null, $$1, awl.DD, awm.f, 0.5F, 0.9F + cmk.this.af.i() * 0.2F);
      }

      @Override
      public void a(dfb $$0, jh $$1) {
         $$0.a(null, $$1, awl.Am, awm.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bvt {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
