import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckw extends ckd {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final buv c = new buv(b, "Baby speed boost", 0.5, buv.a.b);
   private static final akk<Boolean> d = ako.a(ckw.class, akm.k);
   private static final akk<Integer> cb = ako.a(ckw.class, akm.b);
   private static final akk<Boolean> cc = ako.a(ckw.class, akm.k);
   public static final float e = 0.05F;
   public static final int bY = 50;
   public static final int bZ = 40;
   public static final int ca = 7;
   private static final bsx cd = bta.bu.n().a(0.5F).b(0.93F);
   private static final float ce = 0.1F;
   private static final Predicate<bqr> cf = $$0 -> $$0 == bqr.d;
   private final bzx cg = new bzx(this, cf);
   private boolean ch;
   private int ci;
   private int cj;

   public ckw(bta<? extends ckw> $$0, dby $$1) {
      super($$0, $$1);
   }

   public ckw(dby $$0) {
      this(bta.bu, $$0);
   }

   @Override
   protected void z() {
      this.bS.a(4, new ckw.a(this, 1.0, 3));
      this.bS.a(8, new cav(this, cmx.class, 8.0F));
      this.bS.a(8, new cbi(this));
      this.u();
   }

   protected void u() {
      this.bS.a(2, new ccc(this, 1.0, false));
      this.bS.a(6, new caz(this, 1.0, true, 4, this::gy));
      this.bS.a(7, new cca(this, 1.0));
      this.bT.a(1, new ccf(this).a(cky.class));
      this.bT.a(2, new ccg<>(this, cmx.class, true));
      this.bT.a(3, new ccg<>(this, cmf.class, false));
      this.bT.a(3, new ccg<>(this, cfr.class, true));
      this.bT.a(5, new ccg<>(this, cgg.class, 10, true, false, cgg.bY));
   }

   public static buw.a gu() {
      return ckd.gw().a(bux.k, 35.0).a(bux.r, 0.23F).a(bux.c, 3.0).a(bux.a, 2.0).a(bux.u);
   }

   @Override
   protected void a(ako.a $$0) {
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
      if (this.y() && cel.a(this)) {
         if (this.ch != $$0) {
            this.ch = $$0;
            ((cda)this.K()).b($$0);
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
         but $$1 = this.f(bux.r);
         $$1.b(c.b());
         if ($$0) {
            $$1.c(c);
         }
      }
   }

   @Override
   public void a(akk<?> $$0) {
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
            if (this.a(awv.a)) {
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
            cup $$1 = this.a(btb.f);
            if (!$$1.e()) {
               if ($$1.l()) {
                  $$1.b($$1.n() + this.ah.a(2));
                  if ($$1.n() >= $$1.o()) {
                     this.e(btb.f);
                     this.a(btb.f, cup.l);
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
      this.b(bta.B);
      if (!this.aW()) {
         this.dP().a(null, 1040, this.dp(), 0);
      }
   }

   protected void b(bta<? extends ckw> $$0) {
      ckw $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.G($$1.dP().d_($$1.dp()).d());
         $$1.x($$1.y() && this.gy());
      }
   }

   protected boolean ad_() {
      return true;
   }

   @Override
   public boolean a(brn $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dP() instanceof arf)) {
         return false;
      } else {
         arf $$2 = (arf)this.dP();
         btp $$3 = this.p();
         if ($$3 == null && $$0.d() instanceof btp) {
            $$3 = (btp)$$0.d();
         }

         if ($$3 != null && this.dP().al() == bqr.d && (double)this.ah.i() < this.g(bux.u) && this.dP().ab().b(dbu.e)) {
            int $$4 = ayz.a(this.du());
            int $$5 = ayz.a(this.dw());
            int $$6 = ayz.a(this.dA());
            ckw $$7 = new ckw(this.dP());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + ayz.a(this.ah, 7, 40) * ayz.a(this.ah, -1, 1);
               int $$10 = $$5 + ayz.a(this.ah, 7, 40) * ayz.a(this.ah, -1, 1);
               int $$11 = $$6 + ayz.a(this.ah, 7, 40) * ayz.a(this.ah, -1, 1);
               iz $$12 = new iz($$9, $$10, $$11);
               bta<?> $$13 = $$7.ak();
               if (bul.a($$13, this.dP(), $$12) && bul.a($$13, $$2, btt.j, $$12, this.dP().z)) {
                  $$7.a_((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dP().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dP().f($$7) && this.dP().g($$7) && !this.dP().d($$7.cK())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dP().d_($$7.dp()), btt.j, null);
                     $$2.a_($$7);
                     this.f(bux.u).d(new buv("Zombie reinforcement caller charge", -0.05F, buv.a.a));
                     $$7.f(bux.u).d(new buv("Zombie reinforcement callee charge", -0.05F, buv.a.a));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean C(bsu $$0) {
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
   protected avz v() {
      return awa.Dp;
   }

   @Override
   protected avz d(brn $$0) {
      return awa.Dz;
   }

   @Override
   protected avz o_() {
      return awa.Du;
   }

   protected avz gq() {
      return awa.DF;
   }

   @Override
   protected void b(iz $$0, dsc $$1) {
      this.a(this.gq(), 0.15F, 1.0F);
   }

   @Override
   protected void a(azh $$0, bqs $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dP().al() == bqr.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(btb.a, new cup(cus.pa));
         } else {
            this.a(btb.a, new cup(cus.pb));
         }
      }
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.p_());
      $$0.a("CanBreakDoors", this.gy());
      $$0.a("InWaterTime", this.be() ? this.ci : -1);
      $$0.a("DrownedConversionTime", this.gx() ? this.cj : -1);
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.ci = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.b($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(arf $$0, btp $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.al() == bqr.c || $$0.al() == bqr.d) && $$1 instanceof cmk $$3) {
         if ($$0.al() != bqr.d && this.ah.h()) {
            return $$2;
         }

         ckx $$4 = $$3.a(bta.bw, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.dp()), btt.i, new ckw.b(false, true));
            $$4.a($$3.gB());
            $$4.a($$3.gL().a(vg.a));
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
   public bsx e(bub $$0) {
      return this.p_() ? cd : super.e($$0);
   }

   @Override
   public boolean j(cup $$0) {
      return $$0.a(cus.qR) && this.p_() && this.bR() ? false : super.j($$0);
   }

   @Override
   public boolean k(cup $$0) {
      return $$0.a(cus.rg) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public bui a(dcn $$0, bqs $$1, btt $$2, @Nullable bui $$3) {
      azh $$4 = $$0.E_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      this.a_($$4.i() < 0.55F * $$5);
      if ($$3 == null) {
         $$3 = new ckw.b(a($$4), true);
      }

      if ($$3 instanceof ckw.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<cfk> $$7 = $$0.a(cfk.class, this.cK().c(5.0, 3.0, 5.0), bsz.c);
                  if (!$$7.isEmpty()) {
                     cfk $$8 = $$7.get(0);
                     $$8.w(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  cfk $$9 = bta.t.a(this.dP());
                  if ($$9 != null) {
                     $$9.b(this.du(), this.dw(), this.dA(), this.dF(), 0.0F);
                     $$9.a($$0, $$1, btt.g, null);
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

      if (this.a(btb.f).e()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(btb.f, new cup($$4.i() < 0.1F ? dfb.ef : dfb.ee));
            this.bV[btb.f.b()] = 0.0F;
         }
      }

      this.G($$5);
      return $$3;
   }

   public static boolean a(azh $$0) {
      return $$0.i() < 0.05F;
   }

   protected void G(float $$0) {
      this.gz();
      this.f(bux.n).d(new buv("Random spawn bonus", this.ah.j() * 0.05F, buv.a.a));
      double $$1 = this.ah.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.f(bux.k).d(new buv("Random zombie-spawn bonus", $$1, buv.a.c));
      }

      if (this.ah.i() < $$0 * 0.05F) {
         this.f(bux.u).d(new buv("Leader zombie bonus", this.ah.j() * 0.25 + 0.5, buv.a.a));
         this.f(bux.q).d(new buv("Leader zombie bonus", this.ah.j() * 3.0 + 1.0, buv.a.c));
         this.x(this.y());
      }
   }

   protected void gz() {
      this.f(bux.u).a(this.ah.j() * 0.1F);
   }

   @Override
   protected void a(brn $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cjp $$4 && $$4.gr()) {
         cup $$5 = this.gr();
         if (!$$5.e()) {
            $$4.gs();
            this.b($$5);
         }
      }
   }

   protected cup gr() {
      return new cup(cus.uo);
   }

   class a extends cbp {
      a(final bty $$0, final double $$1, final int $$2) {
         super(dfb.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(dbz $$0, iz $$1) {
         $$0.a(null, $$1, awa.Dv, awb.f, 0.5F, 0.9F + ckw.this.ah.i() * 0.2F);
      }

      @Override
      public void a(dby $$0, iz $$1) {
         $$0.a(null, $$1, awa.Af, awb.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bui {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
