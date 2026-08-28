import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckr extends cjy {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final buq c = new buq(b, "Baby speed boost", 0.5, buq.a.b);
   private static final akg<Boolean> d = akk.a(ckr.class, aki.k);
   private static final akg<Integer> cb = akk.a(ckr.class, aki.b);
   private static final akg<Boolean> cc = akk.a(ckr.class, aki.k);
   public static final float e = 0.05F;
   public static final int bY = 50;
   public static final int bZ = 40;
   public static final int ca = 7;
   private static final bss cd = bsv.bu.n().a(0.5F).b(0.93F);
   private static final float ce = 0.1F;
   private static final Predicate<bqm> cf = $$0 -> $$0 == bqm.d;
   private final bzs cg = new bzs(this, cf);
   private boolean ch;
   private int ci;
   private int cj;

   public ckr(bsv<? extends ckr> $$0, dbt $$1) {
      super($$0, $$1);
   }

   public ckr(dbt $$0) {
      this(bsv.bu, $$0);
   }

   @Override
   protected void z() {
      this.bS.a(4, new ckr.a(this, 1.0, 3));
      this.bS.a(8, new caq(this, cms.class, 8.0F));
      this.bS.a(8, new cbd(this));
      this.u();
   }

   protected void u() {
      this.bS.a(2, new cbx(this, 1.0, false));
      this.bS.a(6, new cau(this, 1.0, true, 4, this::gy));
      this.bS.a(7, new cbv(this, 1.0));
      this.bT.a(1, new cca(this).a(ckt.class));
      this.bT.a(2, new ccb<>(this, cms.class, true));
      this.bT.a(3, new ccb<>(this, cma.class, false));
      this.bT.a(3, new ccb<>(this, cfm.class, true));
      this.bT.a(5, new ccb<>(this, cgb.class, 10, true, false, cgb.bY));
   }

   public static bur.a gu() {
      return cjy.gw().a(bus.k, 35.0).a(bus.r, 0.23F).a(bus.c, 3.0).a(bus.a, 2.0).a(bus.u);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(d, false);
      $$0.a(cb, 0);
      $$0.a(cc, false);
   }

   public boolean gx() {
      return this.ap().a(cc);
   }

   public boolean gy() {
      return this.ch;
   }

   public void x(boolean $$0) {
      if (this.y() && ceg.a(this)) {
         if (this.ch != $$0) {
            this.ch = $$0;
            ((ccv)this.K()).b($$0);
            if ($$0) {
               this.bS.a(1, this.cg);
            } else {
               this.bS.a(this.cg);
            }
         }
      } else if (this.ch) {
         this.bS.a(this.cg);
         this.ch = false;
      }
   }

   protected boolean y() {
      return true;
   }

   @Override
   public boolean p_() {
      return this.ap().a(d);
   }

   @Override
   public int ej() {
      if (this.p_()) {
         this.bN = (int)((double)this.bN * 2.5);
      }

      return super.ej();
   }

   @Override
   public void a(boolean $$0) {
      this.ap().a(d, $$0);
      if (this.dP() != null && !this.dP().B) {
         buo $$1 = this.f(bus.r);
         $$1.b(c.b());
         if ($$0) {
            $$1.c(c);
         }
      }
   }

   @Override
   public void a(akg<?> $$0) {
      if (d.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   protected boolean gs() {
      return true;
   }

   @Override
   public void l() {
      if (!this.dP().B && this.bD() && !this.gg()) {
         if (this.gx()) {
            this.cj--;
            if (this.cj < 0) {
               this.ac_();
            }
         } else if (this.gs()) {
            if (this.a(awr.a)) {
               this.ci++;
               if (this.ci >= 600) {
                  this.b(300);
               }
            } else {
               this.ci = -1;
            }
         }
      }

      super.l();
   }

   @Override
   public void n_() {
      if (this.bD()) {
         boolean $$0 = this.ad_() && this.gk();
         if ($$0) {
            cuk $$1 = this.a(bsw.f);
            if (!$$1.e()) {
               if ($$1.l()) {
                  $$1.b($$1.n() + this.ah.a(2));
                  if ($$1.n() >= $$1.o()) {
                     this.e(bsw.f);
                     this.a(bsw.f, cuk.l);
                  }
               }

               $$0 = false;
            }

            if ($$0) {
               this.g(8);
            }
         }
      }

      super.n_();
   }

   private void b(int $$0) {
      this.cj = $$0;
      this.ap().a(cc, true);
   }

   protected void ac_() {
      this.b(bsv.B);
      if (!this.aW()) {
         this.dP().a(null, 1040, this.dp(), 0);
      }
   }

   protected void b(bsv<? extends ckr> $$0) {
      ckr $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.G($$1.dP().d_($$1.dp()).d());
         $$1.x($$1.y() && this.gy());
      }
   }

   protected boolean ad_() {
      return true;
   }

   @Override
   public boolean a(bri $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dP() instanceof arb)) {
         return false;
      } else {
         arb $$2 = (arb)this.dP();
         btk $$3 = this.p();
         if ($$3 == null && $$0.d() instanceof btk) {
            $$3 = (btk)$$0.d();
         }

         if ($$3 != null && this.dP().al() == bqm.d && (double)this.ah.i() < this.g(bus.u) && this.dP().ab().b(dbp.e)) {
            int $$4 = ayu.a(this.du());
            int $$5 = ayu.a(this.dw());
            int $$6 = ayu.a(this.dA());
            ckr $$7 = new ckr(this.dP());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + ayu.a(this.ah, 7, 40) * ayu.a(this.ah, -1, 1);
               int $$10 = $$5 + ayu.a(this.ah, 7, 40) * ayu.a(this.ah, -1, 1);
               int $$11 = $$6 + ayu.a(this.ah, 7, 40) * ayu.a(this.ah, -1, 1);
               iz $$12 = new iz($$9, $$10, $$11);
               bsv<?> $$13 = $$7.ak();
               if (bug.a($$13, this.dP(), $$12) && bug.a($$13, $$2, bto.j, $$12, this.dP().z)) {
                  $$7.a_((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dP().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dP().f($$7) && this.dP().g($$7) && !this.dP().d($$7.cK())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dP().d_($$7.dp()), bto.j, null);
                     $$2.a_($$7);
                     this.f(bus.u).d(new buq("Zombie reinforcement caller charge", -0.05F, buq.a.a));
                     $$7.f(bus.u).d(new buq("Zombie reinforcement callee charge", -0.05F, buq.a.a));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean C(bsp $$0) {
      boolean $$1 = super.C($$0);
      if ($$1) {
         float $$2 = this.dP().d_(this.dp()).b();
         if (this.eX().e() && this.bQ() && this.ah.i() < $$2 * 0.3F) {
            $$0.g(2 * (int)$$2);
         }
      }

      return $$1;
   }

   @Override
   protected avv v() {
      return avw.Dp;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.Dz;
   }

   @Override
   protected avv o_() {
      return avw.Du;
   }

   protected avv gq() {
      return avw.DF;
   }

   @Override
   protected void b(iz $$0, drx $$1) {
      this.a(this.gq(), 0.15F, 1.0F);
   }

   @Override
   protected void a(azc $$0, bqn $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dP().al() == bqm.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bsw.a, new cuk(cun.pa));
         } else {
            this.a(bsw.a, new cuk(cun.pb));
         }
      }
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.p_());
      $$0.a("CanBreakDoors", this.gy());
      $$0.a("InWaterTime", this.be() ? this.ci : -1);
      $$0.a("DrownedConversionTime", this.gx() ? this.cj : -1);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.ci = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.b($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(arb $$0, btk $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.al() == bqm.c || $$0.al() == bqm.d) && $$1 instanceof cmf $$3) {
         if ($$0.al() != bqm.d && this.ah.h()) {
            return $$2;
         }

         cks $$4 = $$3.a(bsv.bw, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.dp()), bto.i, new ckr.b(false, true));
            $$4.a($$3.gB());
            $$4.a($$3.gL().a(vf.a));
            $$4.a($$3.gs().a());
            $$4.b($$3.u());
            if (!this.aW()) {
               $$0.a(null, 1026, this.dp(), 0);
            }

            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public bss e(btw $$0) {
      return this.p_() ? cd : super.e($$0);
   }

   @Override
   public boolean j(cuk $$0) {
      return $$0.a(cun.qR) && this.p_() && this.bR() ? false : super.j($$0);
   }

   @Override
   public boolean k(cuk $$0) {
      return $$0.a(cun.rg) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public bud a(dci $$0, bqn $$1, bto $$2, @Nullable bud $$3) {
      azc $$4 = $$0.E_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      this.a_($$4.i() < 0.55F * $$5);
      if ($$3 == null) {
         $$3 = new ckr.b(a($$4), true);
      }

      if ($$3 instanceof ckr.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<cff> $$7 = $$0.a(cff.class, this.cK().c(5.0, 3.0, 5.0), bsu.c);
                  if (!$$7.isEmpty()) {
                     cff $$8 = $$7.get(0);
                     $$8.w(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  cff $$9 = bsv.t.a(this.dP());
                  if ($$9 != null) {
                     $$9.b(this.du(), this.dw(), this.dA(), this.dF(), 0.0F);
                     $$9.a($$0, $$1, bto.g, null);
                     $$9.w(true);
                     this.n($$9);
                     $$0.b($$9);
                  }
               }
            }
         }

         this.x(this.y() && $$4.i() < $$5 * 0.1F);
         this.a($$4, $$1);
         this.b($$4, $$1);
      }

      if (this.a(bsw.f).e()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(bsw.f, new cuk($$4.i() < 0.1F ? dew.ef : dew.ee));
            this.bV[bsw.f.b()] = 0.0F;
         }
      }

      this.G($$5);
      return $$3;
   }

   public static boolean a(azc $$0) {
      return $$0.i() < 0.05F;
   }

   protected void G(float $$0) {
      this.gz();
      this.f(bus.n).d(new buq("Random spawn bonus", this.ah.j() * 0.05F, buq.a.a));
      double $$1 = this.ah.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.f(bus.k).d(new buq("Random zombie-spawn bonus", $$1, buq.a.c));
      }

      if (this.ah.i() < $$0 * 0.05F) {
         this.f(bus.u).d(new buq("Leader zombie bonus", this.ah.j() * 0.25 + 0.5, buq.a.a));
         this.f(bus.q).d(new buq("Leader zombie bonus", this.ah.j() * 3.0 + 1.0, buq.a.c));
         this.x(this.y());
      }
   }

   protected void gz() {
      this.f(bus.u).a(this.ah.j() * 0.1F);
   }

   @Override
   protected void a(bri $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cjk $$4 && $$4.gr()) {
         cuk $$5 = this.gr();
         if (!$$5.e()) {
            $$4.gs();
            this.b($$5);
         }
      }
   }

   protected cuk gr() {
      return new cuk(cun.uo);
   }

   class a extends cbk {
      a(final btt $$0, final double $$1, final int $$2) {
         super(dew.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(dbu $$0, iz $$1) {
         $$0.a(null, $$1, avw.Dv, avx.f, 0.5F, 0.9F + ckr.this.ah.i() * 0.2F);
      }

      @Override
      public void a(dbt $$0, iz $$1) {
         $$0.a(null, $$1, avw.Af, avx.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bud {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
