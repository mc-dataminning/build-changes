import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgt extends cga {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final bqu c = new bqu(b, "Baby speed boost", 0.5, bqu.a.b);
   private static final aim<Boolean> d = aiq.a(cgt.class, aio.k);
   private static final aim<Integer> ca = aiq.a(cgt.class, aio.b);
   private static final aim<Boolean> cb = aiq.a(cgt.class, aio.k);
   public static final float e = 0.05F;
   public static final int bX = 50;
   public static final int bY = 40;
   public static final int bZ = 7;
   private static final bpa cc = bpd.bu.n().a(0.5F).b(0.93F);
   private static final float cd = 0.1F;
   private static final Predicate<bna> ce = $$0 -> $$0 == bna.d;
   private final bvw cf = new bvw(this, ce);
   private boolean cg;
   private int ch;
   private int ci;

   public cgt(bpd<? extends cgt> $$0, cxb $$1) {
      super($$0, $$1);
   }

   public cgt(cxb $$0) {
      this(bpd.bu, $$0);
   }

   @Override
   protected void z() {
      this.bR.a(4, new cgt.a(this, 1.0, 3));
      this.bR.a(8, new bwu(this, ciu.class, 8.0F));
      this.bR.a(8, new bxh(this));
      this.s();
   }

   protected void s() {
      this.bR.a(2, new byb(this, 1.0, false));
      this.bR.a(6, new bwy(this, 1.0, true, 4, this::gv));
      this.bR.a(7, new bxz(this, 1.0));
      this.bS.a(1, new bye(this).a(cgv.class));
      this.bS.a(2, new byf<>(this, ciu.class, true));
      this.bS.a(3, new byf<>(this, cic.class, false));
      this.bS.a(3, new byf<>(this, cbq.class, true));
      this.bS.a(5, new byf<>(this, ccf.class, 10, true, false, ccf.bY));
   }

   public static bqv.a gr() {
      return cga.gt().a(bqw.k, 35.0).a(bqw.r, 0.23F).a(bqw.c, 3.0).a(bqw.a, 2.0).a(bqw.u);
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
      if (this.y() && cak.a(this)) {
         if (this.cg != $$0) {
            this.cg = $$0;
            ((byz)this.K()).b($$0);
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
         bqs $$1 = this.f(bqw.r);
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
            cqm $$1 = this.d(bpe.f);
            if (!$$1.b()) {
               if ($$1.i()) {
                  $$1.b($$1.l() + this.ag.a(2));
                  if ($$1.l() >= $$1.m()) {
                     this.e(bpe.f);
                     this.a(bpe.f, cqm.h);
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
      this.b(bpd.C);
      if (!this.aU()) {
         this.dM().a(null, 1040, this.dm(), 0);
      }
   }

   protected void b(bpd<? extends cgt> $$0) {
      cgt $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.G($$1.dM().d_($$1.dm()).d());
         $$1.x($$1.y() && this.gv());
      }
   }

   protected boolean ad_() {
      return true;
   }

   @Override
   public boolean a(bnw $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dM() instanceof apf)) {
         return false;
      } else {
         apf $$2 = (apf)this.dM();
         bpp $$3 = this.p();
         if ($$3 == null && $$0.d() instanceof bpp) {
            $$3 = (bpp)$$0.d();
         }

         if ($$3 != null && this.dM().aj() == bna.d && (double)this.ag.i() < this.g(bqw.u) && this.dM().Z().b(cwx.e)) {
            int $$4 = aww.a(this.dr());
            int $$5 = aww.a(this.dt());
            int $$6 = aww.a(this.dx());
            cgt $$7 = new cgt(this.dM());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + aww.a(this.ag, 7, 40) * aww.a(this.ag, -1, 1);
               int $$10 = $$5 + aww.a(this.ag, 7, 40) * aww.a(this.ag, -1, 1);
               int $$11 = $$6 + aww.a(this.ag, 7, 40) * aww.a(this.ag, -1, 1);
               ib $$12 = new ib($$9, $$10, $$11);
               bpd<?> $$13 = $$7.ai();
               if (bqk.a($$13, this.dM(), $$12) && bqk.a($$13, $$2, bpt.j, $$12, this.dM().z)) {
                  $$7.a_((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dM().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dM().f($$7) && this.dM().g($$7) && !this.dM().d($$7.cH())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dM().d_($$7.dm()), bpt.j, null);
                     $$2.a_($$7);
                     this.f(bqw.u).d(new bqu("Zombie reinforcement caller charge", -0.05F, bqu.a.a));
                     $$7.f(bqw.u).d(new bqu("Zombie reinforcement callee charge", -0.05F, bqu.a.a));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean C(box $$0) {
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
      return aty.CO;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.CY;
   }

   @Override
   protected atx n_() {
      return aty.CT;
   }

   protected atx gn() {
      return aty.De;
   }

   @Override
   protected void b(ib $$0, dnb $$1) {
      this.a(this.gn(), 0.15F, 1.0F);
   }

   @Override
   protected void a(axd $$0, bnb $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dM().aj() == bna.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bpe.a, new cqm(cqp.oZ));
         } else {
            this.a(bpe.a, new cqm(cqp.pa));
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
   public boolean a(apf $$0, bpp $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.aj() == bna.c || $$0.aj() == bna.d) && $$1 instanceof cih $$3) {
         if ($$0.aj() != bna.d && this.ag.h()) {
            return $$2;
         }

         cgu $$4 = $$3.a(bpd.bw, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.dm()), bpt.i, new cgt.b(false, true));
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
   public bpa e(bqa $$0) {
      return this.o_() ? cc : super.e($$0);
   }

   @Override
   public boolean j(cqm $$0) {
      return $$0.a(cqp.qQ) && this.o_() && this.bO() ? false : super.j($$0);
   }

   @Override
   public boolean k(cqm $$0) {
      return $$0.a(cqp.rf) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      axd $$4 = $$0.E_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      this.s($$4.i() < 0.55F * $$5);
      if ($$3 == null) {
         $$3 = new cgt.b(a($$4), true);
      }

      if ($$3 instanceof cgt.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<cbj> $$7 = $$0.a(cbj.class, this.cH().c(5.0, 3.0, 5.0), bpc.c);
                  if (!$$7.isEmpty()) {
                     cbj $$8 = $$7.get(0);
                     $$8.w(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  cbj $$9 = bpd.u.a(this.dM());
                  if ($$9 != null) {
                     $$9.b(this.dr(), this.dt(), this.dx(), this.dC(), 0.0F);
                     $$9.a($$0, $$1, bpt.g, null);
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

      if (this.d(bpe.f).b()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(bpe.f, new cqm($$4.i() < 0.1F ? dae.ef : dae.ee));
            this.bU[bpe.f.b()] = 0.0F;
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
      this.f(bqw.n).d(new bqu("Random spawn bonus", this.ag.j() * 0.05F, bqu.a.a));
      double $$1 = this.ag.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.f(bqw.k).d(new bqu("Random zombie-spawn bonus", $$1, bqu.a.c));
      }

      if (this.ag.i() < $$0 * 0.05F) {
         this.f(bqw.u).d(new bqu("Leader zombie bonus", this.ag.j() * 0.25 + 0.5, bqu.a.a));
         this.f(bqw.q).d(new bqu("Leader zombie bonus", this.ag.j() * 3.0 + 1.0, bqu.a.c));
         this.x(this.y());
      }
   }

   protected void gw() {
      this.f(bqw.u).a(this.ag.j() * 0.1F);
   }

   @Override
   protected void a(bnw $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cfm $$4 && $$4.go()) {
         cqm $$5 = this.go();
         if (!$$5.b()) {
            $$4.gp();
            this.b($$5);
         }
      }
   }

   protected cqm go() {
      return new cqm(cqp.um);
   }

   class a extends bxo {
      a(bpx $$0, double $$1, int $$2) {
         super(dae.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(cxc $$0, ib $$1) {
         $$0.a(null, $$1, aty.CU, atz.f, 0.5F, 0.9F + cgt.this.ag.i() * 0.2F);
      }

      @Override
      public void a(cxb $$0, ib $$1) {
         $$0.a(null, $$1, aty.zJ, atz.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bqh {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
