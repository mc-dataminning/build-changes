import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjx extends cje {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final btw c = new btw(b, "Baby speed boost", 0.5, btw.a.b);
   private static final ajs<Boolean> d = ajw.a(cjx.class, aju.k);
   private static final ajs<Integer> cb = ajw.a(cjx.class, aju.b);
   private static final ajs<Boolean> cc = ajw.a(cjx.class, aju.k);
   public static final float e = 0.05F;
   public static final int bY = 50;
   public static final int bZ = 40;
   public static final int ca = 7;
   private static final brz cd = bsc.bu.n().a(0.5F).b(0.93F);
   private static final float ce = 0.1F;
   private static final Predicate<bpt> cf = $$0 -> $$0 == bpt.d;
   private final byy cg = new byy(this, cf);
   private boolean ch;
   private int ci;
   private int cj;

   public cjx(bsc<? extends cjx> $$0, daz $$1) {
      super($$0, $$1);
   }

   public cjx(daz $$0) {
      this(bsc.bu, $$0);
   }

   @Override
   protected void z() {
      this.bS.a(4, new cjx.a(this, 1.0, 3));
      this.bS.a(8, new bzw(this, cly.class, 8.0F));
      this.bS.a(8, new caj(this));
      this.u();
   }

   protected void u() {
      this.bS.a(2, new cbd(this, 1.0, false));
      this.bS.a(6, new caa(this, 1.0, true, 4, this::gx));
      this.bS.a(7, new cbb(this, 1.0));
      this.bT.a(1, new cbg(this).a(cjz.class));
      this.bT.a(2, new cbh<>(this, cly.class, true));
      this.bT.a(3, new cbh<>(this, clg.class, false));
      this.bT.a(3, new cbh<>(this, ces.class, true));
      this.bT.a(5, new cbh<>(this, cfh.class, 10, true, false, cfh.bY));
   }

   public static btx.a gt() {
      return cje.gv().a(bty.k, 35.0).a(bty.r, 0.23F).a(bty.c, 3.0).a(bty.a, 2.0).a(bty.u);
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(d, false);
      $$0.a(cb, 0);
      $$0.a(cc, false);
   }

   public boolean gw() {
      return this.ap().a(cc);
   }

   public boolean gx() {
      return this.ch;
   }

   public void x(boolean $$0) {
      if (this.y() && cdm.a(this)) {
         if (this.ch != $$0) {
            this.ch = $$0;
            ((ccb)this.K()).b($$0);
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
         btu $$1 = this.f(bty.r);
         $$1.b(c.b());
         if ($$0) {
            $$1.c(c);
         }
      }
   }

   @Override
   public void a(ajs<?> $$0) {
      if (d.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   protected boolean gr() {
      return true;
   }

   @Override
   public void l() {
      if (!this.dP().B && this.bD() && !this.gf()) {
         if (this.gw()) {
            this.cj--;
            if (this.cj < 0) {
               this.ac_();
            }
         } else if (this.gr()) {
            if (this.a(awc.a)) {
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
         boolean $$0 = this.ad_() && this.gj();
         if ($$0) {
            ctq $$1 = this.a(bsd.f);
            if (!$$1.e()) {
               if ($$1.l()) {
                  $$1.b($$1.n() + this.ah.a(2));
                  if ($$1.n() >= $$1.o()) {
                     this.e(bsd.f);
                     this.a(bsd.f, ctq.i);
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
      this.b(bsc.B);
      if (!this.aW()) {
         this.dP().a(null, 1040, this.dp(), 0);
      }
   }

   protected void b(bsc<? extends cjx> $$0) {
      cjx $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.G($$1.dP().d_($$1.dp()).d());
         $$1.x($$1.y() && this.gx());
      }
   }

   protected boolean ad_() {
      return true;
   }

   @Override
   public boolean a(bqp $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dP() instanceof aqn)) {
         return false;
      } else {
         aqn $$2 = (aqn)this.dP();
         bsq $$3 = this.p();
         if ($$3 == null && $$0.d() instanceof bsq) {
            $$3 = (bsq)$$0.d();
         }

         if ($$3 != null && this.dP().ak() == bpt.d && (double)this.ah.i() < this.g(bty.u) && this.dP().aa().b(dav.e)) {
            int $$4 = ayf.a(this.du());
            int $$5 = ayf.a(this.dw());
            int $$6 = ayf.a(this.dA());
            cjx $$7 = new cjx(this.dP());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + ayf.a(this.ah, 7, 40) * ayf.a(this.ah, -1, 1);
               int $$10 = $$5 + ayf.a(this.ah, 7, 40) * ayf.a(this.ah, -1, 1);
               int $$11 = $$6 + ayf.a(this.ah, 7, 40) * ayf.a(this.ah, -1, 1);
               io $$12 = new io($$9, $$10, $$11);
               bsc<?> $$13 = $$7.ak();
               if (btm.a($$13, this.dP(), $$12) && btm.a($$13, $$2, bsu.j, $$12, this.dP().z)) {
                  $$7.a_((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dP().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dP().f($$7) && this.dP().g($$7) && !this.dP().d($$7.cK())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dP().d_($$7.dp()), bsu.j, null);
                     $$2.a_($$7);
                     this.f(bty.u).d(new btw("Zombie reinforcement caller charge", -0.05F, btw.a.a));
                     $$7.f(bty.u).d(new btw("Zombie reinforcement callee charge", -0.05F, btw.a.a));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean C(brw $$0) {
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
   protected avh v() {
      return avi.Dp;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.Dz;
   }

   @Override
   protected avh o_() {
      return avi.Du;
   }

   protected avh gp() {
      return avi.DF;
   }

   @Override
   protected void b(io $$0, drd $$1) {
      this.a(this.gp(), 0.15F, 1.0F);
   }

   @Override
   protected void a(aym $$0, bpu $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dP().ak() == bpt.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bsd.a, new ctq(ctt.pa));
         } else {
            this.a(bsd.a, new ctq(ctt.pb));
         }
      }
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.p_());
      $$0.a("CanBreakDoors", this.gx());
      $$0.a("InWaterTime", this.be() ? this.ci : -1);
      $$0.a("DrownedConversionTime", this.gw() ? this.cj : -1);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.ci = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.b($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(aqn $$0, bsq $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.ak() == bpt.c || $$0.ak() == bpt.d) && $$1 instanceof cll $$3) {
         if ($$0.ak() != bpt.d && this.ah.h()) {
            return $$2;
         }

         cjy $$4 = $$3.a(bsc.bw, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.dp()), bsu.i, new cjx.b(false, true));
            $$4.a($$3.gA());
            $$4.a($$3.gK().a(ur.a));
            $$4.a($$3.gr().a());
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
   public brz e(btc $$0) {
      return this.p_() ? cd : super.e($$0);
   }

   @Override
   public boolean j(ctq $$0) {
      return $$0.a(ctt.qR) && this.p_() && this.bR() ? false : super.j($$0);
   }

   @Override
   public boolean k(ctq $$0) {
      return $$0.a(ctt.rg) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      aym $$4 = $$0.E_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      this.a_($$4.i() < 0.55F * $$5);
      if ($$3 == null) {
         $$3 = new cjx.b(a($$4), true);
      }

      if ($$3 instanceof cjx.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<cel> $$7 = $$0.a(cel.class, this.cK().c(5.0, 3.0, 5.0), bsb.c);
                  if (!$$7.isEmpty()) {
                     cel $$8 = $$7.get(0);
                     $$8.w(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  cel $$9 = bsc.t.a(this.dP());
                  if ($$9 != null) {
                     $$9.b(this.du(), this.dw(), this.dA(), this.dF(), 0.0F);
                     $$9.a($$0, $$1, bsu.g, null);
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

      if (this.a(bsd.f).e()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(bsd.f, new ctq($$4.i() < 0.1F ? dec.ef : dec.ee));
            this.bV[bsd.f.b()] = 0.0F;
         }
      }

      this.G($$5);
      return $$3;
   }

   public static boolean a(aym $$0) {
      return $$0.i() < 0.05F;
   }

   protected void G(float $$0) {
      this.gy();
      this.f(bty.n).d(new btw("Random spawn bonus", this.ah.j() * 0.05F, btw.a.a));
      double $$1 = this.ah.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.f(bty.k).d(new btw("Random zombie-spawn bonus", $$1, btw.a.c));
      }

      if (this.ah.i() < $$0 * 0.05F) {
         this.f(bty.u).d(new btw("Leader zombie bonus", this.ah.j() * 0.25 + 0.5, btw.a.a));
         this.f(bty.q).d(new btw("Leader zombie bonus", this.ah.j() * 3.0 + 1.0, btw.a.c));
         this.x(this.y());
      }
   }

   protected void gy() {
      this.f(bty.u).a(this.ah.j() * 0.1F);
   }

   @Override
   protected void a(bqp $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof ciq $$4 && $$4.gq()) {
         ctq $$5 = this.gq();
         if (!$$5.e()) {
            $$4.gr();
            this.b($$5);
         }
      }
   }

   protected ctq gq() {
      return new ctq(ctt.uo);
   }

   class a extends caq {
      a(bsz $$0, double $$1, int $$2) {
         super(dec.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(dba $$0, io $$1) {
         $$0.a(null, $$1, avi.Dv, avj.f, 0.5F, 0.9F + cjx.this.ah.i() * 0.2F);
      }

      @Override
      public void a(daz $$0, io $$1) {
         $$0.a(null, $$1, avi.Af, avj.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements btj {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
