import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckv extends ckc {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final buu c = new buu(b, "Baby speed boost", 0.5, buu.a.b);
   private static final akj<Boolean> d = akn.a(ckv.class, akl.k);
   private static final akj<Integer> cb = akn.a(ckv.class, akl.b);
   private static final akj<Boolean> cc = akn.a(ckv.class, akl.k);
   public static final float e = 0.05F;
   public static final int bY = 50;
   public static final int bZ = 40;
   public static final int ca = 7;
   private static final bsw cd = bsz.bu.n().a(0.5F).b(0.93F);
   private static final float ce = 0.1F;
   private static final Predicate<bqq> cf = $$0 -> $$0 == bqq.d;
   private final bzw cg = new bzw(this, cf);
   private boolean ch;
   private int ci;
   private int cj;

   public ckv(bsz<? extends ckv> $$0, dbx $$1) {
      super($$0, $$1);
   }

   public ckv(dbx $$0) {
      this(bsz.bu, $$0);
   }

   @Override
   protected void z() {
      this.bS.a(4, new ckv.a(this, 1.0, 3));
      this.bS.a(8, new cau(this, cmw.class, 8.0F));
      this.bS.a(8, new cbh(this));
      this.u();
   }

   protected void u() {
      this.bS.a(2, new ccb(this, 1.0, false));
      this.bS.a(6, new cay(this, 1.0, true, 4, this::gy));
      this.bS.a(7, new cbz(this, 1.0));
      this.bT.a(1, new cce(this).a(ckx.class));
      this.bT.a(2, new ccf<>(this, cmw.class, true));
      this.bT.a(3, new ccf<>(this, cme.class, false));
      this.bT.a(3, new ccf<>(this, cfq.class, true));
      this.bT.a(5, new ccf<>(this, cgf.class, 10, true, false, cgf.bY));
   }

   public static buv.a gu() {
      return ckc.gw().a(buw.k, 35.0).a(buw.r, 0.23F).a(buw.c, 3.0).a(buw.a, 2.0).a(buw.u);
   }

   @Override
   protected void a(akn.a $$0) {
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
      if (this.y() && cek.a(this)) {
         if (this.ch != $$0) {
            this.ch = $$0;
            ((ccz)this.K()).b($$0);
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
         bus $$1 = this.f(buw.r);
         $$1.b(c.b());
         if ($$0) {
            $$1.c(c);
         }
      }
   }

   @Override
   public void a(akj<?> $$0) {
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
            if (this.a(awu.a)) {
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
            cuo $$1 = this.a(bta.f);
            if (!$$1.e()) {
               if ($$1.l()) {
                  $$1.b($$1.n() + this.ah.a(2));
                  if ($$1.n() >= $$1.o()) {
                     this.e(bta.f);
                     this.a(bta.f, cuo.l);
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
      this.b(bsz.B);
      if (!this.aW()) {
         this.dP().a(null, 1040, this.dp(), 0);
      }
   }

   protected void b(bsz<? extends ckv> $$0) {
      ckv $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.G($$1.dP().d_($$1.dp()).d());
         $$1.x($$1.y() && this.gy());
      }
   }

   protected boolean ad_() {
      return true;
   }

   @Override
   public boolean a(brm $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dP() instanceof are)) {
         return false;
      } else {
         are $$2 = (are)this.dP();
         bto $$3 = this.p();
         if ($$3 == null && $$0.d() instanceof bto) {
            $$3 = (bto)$$0.d();
         }

         if ($$3 != null && this.dP().al() == bqq.d && (double)this.ah.i() < this.g(buw.u) && this.dP().ab().b(dbt.e)) {
            int $$4 = ayy.a(this.du());
            int $$5 = ayy.a(this.dw());
            int $$6 = ayy.a(this.dA());
            ckv $$7 = new ckv(this.dP());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + ayy.a(this.ah, 7, 40) * ayy.a(this.ah, -1, 1);
               int $$10 = $$5 + ayy.a(this.ah, 7, 40) * ayy.a(this.ah, -1, 1);
               int $$11 = $$6 + ayy.a(this.ah, 7, 40) * ayy.a(this.ah, -1, 1);
               iz $$12 = new iz($$9, $$10, $$11);
               bsz<?> $$13 = $$7.ak();
               if (buk.a($$13, this.dP(), $$12) && buk.a($$13, $$2, bts.j, $$12, this.dP().z)) {
                  $$7.a_((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dP().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dP().f($$7) && this.dP().g($$7) && !this.dP().d($$7.cK())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dP().d_($$7.dp()), bts.j, null);
                     $$2.a_($$7);
                     this.f(buw.u).d(new buu("Zombie reinforcement caller charge", -0.05F, buu.a.a));
                     $$7.f(buw.u).d(new buu("Zombie reinforcement callee charge", -0.05F, buu.a.a));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean C(bst $$0) {
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
   protected avy v() {
      return avz.Dp;
   }

   @Override
   protected avy d(brm $$0) {
      return avz.Dz;
   }

   @Override
   protected avy o_() {
      return avz.Du;
   }

   protected avy gq() {
      return avz.DF;
   }

   @Override
   protected void b(iz $$0, dsb $$1) {
      this.a(this.gq(), 0.15F, 1.0F);
   }

   @Override
   protected void a(azg $$0, bqr $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dP().al() == bqq.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bta.a, new cuo(cur.pa));
         } else {
            this.a(bta.a, new cuo(cur.pb));
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
   public boolean a(are $$0, bto $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.al() == bqq.c || $$0.al() == bqq.d) && $$1 instanceof cmj $$3) {
         if ($$0.al() != bqq.d && this.ah.h()) {
            return $$2;
         }

         ckw $$4 = $$3.a(bsz.bw, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.dp()), bts.i, new ckv.b(false, true));
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
   public bsw e(bua $$0) {
      return this.p_() ? cd : super.e($$0);
   }

   @Override
   public boolean j(cuo $$0) {
      return $$0.a(cur.qR) && this.p_() && this.bR() ? false : super.j($$0);
   }

   @Override
   public boolean k(cuo $$0) {
      return $$0.a(cur.rg) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
      azg $$4 = $$0.E_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      this.a_($$4.i() < 0.55F * $$5);
      if ($$3 == null) {
         $$3 = new ckv.b(a($$4), true);
      }

      if ($$3 instanceof ckv.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<cfj> $$7 = $$0.a(cfj.class, this.cK().c(5.0, 3.0, 5.0), bsy.c);
                  if (!$$7.isEmpty()) {
                     cfj $$8 = $$7.get(0);
                     $$8.w(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  cfj $$9 = bsz.t.a(this.dP());
                  if ($$9 != null) {
                     $$9.b(this.du(), this.dw(), this.dA(), this.dF(), 0.0F);
                     $$9.a($$0, $$1, bts.g, null);
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

      if (this.a(bta.f).e()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(bta.f, new cuo($$4.i() < 0.1F ? dfa.ef : dfa.ee));
            this.bV[bta.f.b()] = 0.0F;
         }
      }

      this.G($$5);
      return $$3;
   }

   public static boolean a(azg $$0) {
      return $$0.i() < 0.05F;
   }

   protected void G(float $$0) {
      this.gz();
      this.f(buw.n).d(new buu("Random spawn bonus", this.ah.j() * 0.05F, buu.a.a));
      double $$1 = this.ah.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.f(buw.k).d(new buu("Random zombie-spawn bonus", $$1, buu.a.c));
      }

      if (this.ah.i() < $$0 * 0.05F) {
         this.f(buw.u).d(new buu("Leader zombie bonus", this.ah.j() * 0.25 + 0.5, buu.a.a));
         this.f(buw.q).d(new buu("Leader zombie bonus", this.ah.j() * 3.0 + 1.0, buu.a.c));
         this.x(this.y());
      }
   }

   protected void gz() {
      this.f(buw.u).a(this.ah.j() * 0.1F);
   }

   @Override
   protected void a(brm $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cjo $$4 && $$4.gr()) {
         cuo $$5 = this.gr();
         if (!$$5.e()) {
            $$4.gs();
            this.b($$5);
         }
      }
   }

   protected cuo gr() {
      return new cuo(cur.uo);
   }

   class a extends cbo {
      a(final btx $$0, final double $$1, final int $$2) {
         super(dfa.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(dby $$0, iz $$1) {
         $$0.a(null, $$1, avz.Dv, awa.f, 0.5F, 0.9F + ckv.this.ah.i() * 0.2F);
      }

      @Override
      public void a(dbx $$0, iz $$1) {
         $$0.a(null, $$1, avz.Af, awa.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements buh {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
