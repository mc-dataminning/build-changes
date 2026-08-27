import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgr extends cfy {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final bqt c = new bqt(b, "Baby speed boost", 0.5, bqt.a.b);
   private static final aim<Boolean> d = aiq.a(cgr.class, aio.k);
   private static final aim<Integer> ca = aiq.a(cgr.class, aio.b);
   private static final aim<Boolean> cb = aiq.a(cgr.class, aio.k);
   public static final float e = 0.05F;
   public static final int bX = 50;
   public static final int bY = 40;
   public static final int bZ = 7;
   private static final boz cc = bpc.bt.n().a(0.5F).b(0.93F);
   private static final float cd = 0.1F;
   private static final Predicate<bmz> ce = $$0 -> $$0 == bmz.d;
   private final bvv cf = new bvv(this, ce);
   private boolean cg;
   private int ch;
   private int ci;

   public cgr(bpc<? extends cgr> $$0, cwz $$1) {
      super($$0, $$1);
   }

   public cgr(cwz $$0) {
      this(bpc.bt, $$0);
   }

   @Override
   protected void z() {
      this.bR.a(4, new cgr.a(this, 1.0, 3));
      this.bR.a(8, new bwt(this, cis.class, 8.0F));
      this.bR.a(8, new bxg(this));
      this.s();
   }

   protected void s() {
      this.bR.a(2, new bya(this, 1.0, false));
      this.bR.a(6, new bwx(this, 1.0, true, 4, this::gv));
      this.bR.a(7, new bxy(this, 1.0));
      this.bS.a(1, new byd(this).a(cgt.class));
      this.bS.a(2, new bye<>(this, cis.class, true));
      this.bS.a(3, new bye<>(this, cia.class, false));
      this.bS.a(3, new bye<>(this, cbp.class, true));
      this.bS.a(5, new bye<>(this, cce.class, 10, true, false, cce.bY));
   }

   public static bqu.a gr() {
      return cfy.gt().a(bqv.k, 35.0).a(bqv.r, 0.23F).a(bqv.c, 3.0).a(bqv.a, 2.0).a(bqv.u);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(d, false);
      $$0.a(ca, 0);
      $$0.a(cb, false);
   }

   public boolean gu() {
      return this.an().a(cb);
   }

   public boolean gv() {
      return this.cg;
   }

   public void x(boolean $$0) {
      if (this.y() && caj.a(this)) {
         if (this.cg != $$0) {
            this.cg = $$0;
            ((byy)this.K()).b($$0);
            if ($$0) {
               this.bR.a(1, this.cf);
            } else {
               this.bR.a(this.cf);
            }
         }
      } else if (this.cg) {
         this.bR.a(this.cf);
         this.cg = false;
      }
   }

   protected boolean y() {
      return true;
   }

   @Override
   public boolean o_() {
      return this.an().a(d);
   }

   @Override
   public int eg() {
      if (this.o_()) {
         this.bM = (int)((double)this.bM * 2.5);
      }

      return super.eg();
   }

   @Override
   public void a(boolean $$0) {
      this.an().a(d, $$0);
      if (this.dM() != null && !this.dM().B) {
         bqr $$1 = this.f(bqv.r);
         $$1.b(c.a());
         if ($$0) {
            $$1.c(c);
         }
      }
   }

   @Override
   public void a(aim<?> $$0) {
      if (d.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   protected boolean gp() {
      return true;
   }

   @Override
   public void l() {
      if (!this.dM().B && this.bA() && !this.gd()) {
         if (this.gu()) {
            this.ci--;
            if (this.ci < 0) {
               this.ac_();
            }
         } else if (this.gp()) {
            if (this.a(aus.a)) {
               this.ch++;
               if (this.ch >= 600) {
                  this.b(300);
               }
            } else {
               this.ch = -1;
            }
         }
      }

      super.l();
   }

   @Override
   public void m_() {
      if (this.bA()) {
         boolean $$0 = this.ad_() && this.gh();
         if ($$0) {
            cqk $$1 = this.d(bpd.f);
            if (!$$1.b()) {
               if ($$1.i()) {
                  $$1.b($$1.l() + this.ag.a(2));
                  if ($$1.l() >= $$1.m()) {
                     this.e(bpd.f);
                     this.a(bpd.f, cqk.h);
                  }
               }

               $$0 = false;
            }

            if ($$0) {
               this.g(8);
            }
         }
      }

      super.m_();
   }

   private void b(int $$0) {
      this.ci = $$0;
      this.an().a(cb, true);
   }

   protected void ac_() {
      this.b(bpc.B);
      if (!this.aU()) {
         this.dM().a(null, 1040, this.dm(), 0);
      }
   }

   protected void b(bpc<? extends cgr> $$0) {
      cgr $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.G($$1.dM().d_($$1.dm()).d());
         $$1.x($$1.y() && this.gv());
      }
   }

   protected boolean ad_() {
      return true;
   }

   @Override
   public boolean a(bnv $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dM() instanceof apf)) {
         return false;
      } else {
         apf $$2 = (apf)this.dM();
         bpo $$3 = this.p();
         if ($$3 == null && $$0.d() instanceof bpo) {
            $$3 = (bpo)$$0.d();
         }

         if ($$3 != null && this.dM().aj() == bmz.d && (double)this.ag.i() < this.g(bqv.u) && this.dM().Z().b(cwv.e)) {
            int $$4 = aww.a(this.dr());
            int $$5 = aww.a(this.dt());
            int $$6 = aww.a(this.dx());
            cgr $$7 = new cgr(this.dM());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + aww.a(this.ag, 7, 40) * aww.a(this.ag, -1, 1);
               int $$10 = $$5 + aww.a(this.ag, 7, 40) * aww.a(this.ag, -1, 1);
               int $$11 = $$6 + aww.a(this.ag, 7, 40) * aww.a(this.ag, -1, 1);
               ib $$12 = new ib($$9, $$10, $$11);
               bpc<?> $$13 = $$7.ai();
               if (bqj.a($$13, this.dM(), $$12) && bqj.a($$13, $$2, bps.j, $$12, this.dM().z)) {
                  $$7.a_((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dM().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dM().f($$7) && this.dM().g($$7) && !this.dM().d($$7.cH())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dM().d_($$7.dm()), bps.j, null);
                     $$2.a_($$7);
                     this.f(bqv.u).d(new bqt("Zombie reinforcement caller charge", -0.05F, bqt.a.a));
                     $$7.f(bqv.u).d(new bqt("Zombie reinforcement callee charge", -0.05F, bqt.a.a));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean C(bow $$0) {
      boolean $$1 = super.C($$0);
      if ($$1) {
         float $$2 = this.dM().d_(this.dm()).b();
         if (this.eU().b() && this.bN() && this.ag.i() < $$2 * 0.3F) {
            $$0.g(2 * (int)$$2);
         }
      }

      return $$1;
   }

   @Override
   protected atx v() {
      return aty.CJ;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.CT;
   }

   @Override
   protected atx n_() {
      return aty.CO;
   }

   protected atx gn() {
      return aty.CZ;
   }

   @Override
   protected void b(ib $$0, dmz $$1) {
      this.a(this.gn(), 0.15F, 1.0F);
   }

   @Override
   protected void a(axd $$0, bna $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dM().aj() == bmz.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bpd.a, new cqk(cqn.oZ));
         } else {
            this.a(bpd.a, new cqk(cqn.pa));
         }
      }
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.o_());
      $$0.a("CanBreakDoors", this.gv());
      $$0.a("InWaterTime", this.bc() ? this.ch : -1);
      $$0.a("DrownedConversionTime", this.gu() ? this.ci : -1);
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.ch = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.b($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(apf $$0, bpo $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.aj() == bmz.c || $$0.aj() == bmz.d) && $$1 instanceof cif $$3) {
         if ($$0.aj() != bmz.d && this.ag.h()) {
            return $$2;
         }

         cgs $$4 = $$3.a(bpc.bv, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.dm()), bps.i, new cgr.b(false, true));
            $$4.a($$3.gy());
            $$4.a($$3.gI().a(to.a));
            $$4.a($$3.gp().a());
            $$4.b($$3.s());
            if (!this.aU()) {
               $$0.a(null, 1026, this.dm(), 0);
            }

            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public boz e(bpz $$0) {
      return this.o_() ? cc : super.e($$0);
   }

   @Override
   public boolean j(cqk $$0) {
      return $$0.a(cqn.qQ) && this.o_() && this.bO() ? false : super.j($$0);
   }

   @Override
   public boolean k(cqk $$0) {
      return $$0.a(cqn.rf) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
      axd $$4 = $$0.E_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      this.s($$4.i() < 0.55F * $$5);
      if ($$3 == null) {
         $$3 = new cgr.b(a($$4), true);
      }

      if ($$3 instanceof cgr.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<cbi> $$7 = $$0.a(cbi.class, this.cH().c(5.0, 3.0, 5.0), bpb.c);
                  if (!$$7.isEmpty()) {
                     cbi $$8 = $$7.get(0);
                     $$8.w(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  cbi $$9 = bpc.t.a(this.dM());
                  if ($$9 != null) {
                     $$9.b(this.dr(), this.dt(), this.dx(), this.dC(), 0.0F);
                     $$9.a($$0, $$1, bps.g, null);
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

      if (this.d(bpd.f).b()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(bpd.f, new cqk($$4.i() < 0.1F ? dac.ef : dac.ee));
            this.bU[bpd.f.b()] = 0.0F;
         }
      }

      this.G($$5);
      return $$3;
   }

   public static boolean a(axd $$0) {
      return $$0.i() < 0.05F;
   }

   protected void G(float $$0) {
      this.gw();
      this.f(bqv.n).d(new bqt("Random spawn bonus", this.ag.j() * 0.05F, bqt.a.a));
      double $$1 = this.ag.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.f(bqv.k).d(new bqt("Random zombie-spawn bonus", $$1, bqt.a.c));
      }

      if (this.ag.i() < $$0 * 0.05F) {
         this.f(bqv.u).d(new bqt("Leader zombie bonus", this.ag.j() * 0.25 + 0.5, bqt.a.a));
         this.f(bqv.q).d(new bqt("Leader zombie bonus", this.ag.j() * 3.0 + 1.0, bqt.a.c));
         this.x(this.y());
      }
   }

   protected void gw() {
      this.f(bqv.u).a(this.ag.j() * 0.1F);
   }

   @Override
   protected void a(bnv $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cfk $$4 && $$4.go()) {
         cqk $$5 = this.go();
         if (!$$5.b()) {
            $$4.gp();
            this.b($$5);
         }
      }
   }

   protected cqk go() {
      return new cqk(cqn.ul);
   }

   class a extends bxn {
      a(bpw $$0, double $$1, int $$2) {
         super(dac.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(cxa $$0, ib $$1) {
         $$0.a(null, $$1, aty.CP, atz.f, 0.5F, 0.9F + cgr.this.ag.i() * 0.2F);
      }

      @Override
      public void a(cwz $$0, ib $$1) {
         $$0.a(null, $$1, aty.zE, atz.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bqg {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
