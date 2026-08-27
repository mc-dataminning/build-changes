import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chs extends cgz {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final brt c = new brt(b, "Baby speed boost", 0.5, brt.a.b);
   private static final aiy<Boolean> d = ajc.a(chs.class, aja.k);
   private static final aiy<Integer> ca = ajc.a(chs.class, aja.b);
   private static final aiy<Boolean> cb = ajc.a(chs.class, aja.k);
   public static final float e = 0.05F;
   public static final int bX = 50;
   public static final int bY = 40;
   public static final int bZ = 7;
   private static final bpy cc = bqb.bt.n().a(0.5F).b(0.93F);
   private static final float cd = 0.1F;
   private static final Predicate<bnx> ce = $$0 -> $$0 == bnx.d;
   private final bwv cf = new bwv(this, ce);
   private boolean cg;
   private int ch;
   private int ci;

   public chs(bqb<? extends chs> $$0, cyx $$1) {
      super($$0, $$1);
   }

   public chs(cyx $$0) {
      this(bqb.bt, $$0);
   }

   @Override
   protected void z() {
      this.bR.a(4, new chs.a(this, 1.0, 3));
      this.bR.a(8, new bxt(this, cjt.class, 8.0F));
      this.bR.a(8, new byg(this));
      this.u();
   }

   protected void u() {
      this.bR.a(2, new bza(this, 1.0, false));
      this.bR.a(6, new bxx(this, 1.0, true, 4, this::gv));
      this.bR.a(7, new byy(this, 1.0));
      this.bS.a(1, new bzd(this).a(chu.class));
      this.bS.a(2, new bze<>(this, cjt.class, true));
      this.bS.a(3, new bze<>(this, cjb.class, false));
      this.bS.a(3, new bze<>(this, ccp.class, true));
      this.bS.a(5, new bze<>(this, cde.class, 10, true, false, cde.bY));
   }

   public static bru.a gr() {
      return cgz.gt().a(brv.k, 35.0).a(brv.r, 0.23F).a(brv.c, 3.0).a(brv.a, 2.0).a(brv.u);
   }

   @Override
   protected void a(ajc.a $$0) {
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
      if (this.y() && cbj.a(this)) {
         if (this.cg != $$0) {
            this.cg = $$0;
            ((bzy)this.K()).b($$0);
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
   public boolean p_() {
      return this.an().a(d);
   }

   @Override
   public int eg() {
      if (this.p_()) {
         this.bM = (int)((double)this.bM * 2.5);
      }

      return super.eg();
   }

   @Override
   public void a(boolean $$0) {
      this.an().a(d, $$0);
      if (this.dM() != null && !this.dM().B) {
         brr $$1 = this.f(brv.r);
         $$1.b(c.a());
         if ($$0) {
            $$1.c(c);
         }
      }
   }

   @Override
   public void a(aiy<?> $$0) {
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
            if (this.a(avh.a)) {
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
   public void n_() {
      if (this.bA()) {
         boolean $$0 = this.ad_() && this.gh();
         if ($$0) {
            crj $$1 = this.d(bqc.f);
            if (!$$1.d()) {
               if ($$1.k()) {
                  $$1.b($$1.m() + this.ag.a(2));
                  if ($$1.m() >= $$1.n()) {
                     this.e(bqc.f);
                     this.a(bqc.f, crj.i);
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
      this.ci = $$0;
      this.an().a(cb, true);
   }

   protected void ac_() {
      this.b(bqb.B);
      if (!this.aU()) {
         this.dM().a(null, 1040, this.dm(), 0);
      }
   }

   protected void b(bqb<? extends chs> $$0) {
      chs $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.G($$1.dM().d_($$1.dm()).d());
         $$1.x($$1.y() && this.gv());
      }
   }

   protected boolean ad_() {
      return true;
   }

   @Override
   public boolean a(bot $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dM() instanceof aps)) {
         return false;
      } else {
         aps $$2 = (aps)this.dM();
         bqo $$3 = this.p();
         if ($$3 == null && $$0.d() instanceof bqo) {
            $$3 = (bqo)$$0.d();
         }

         if ($$3 != null && this.dM().ak() == bnx.d && (double)this.ag.i() < this.g(brv.u) && this.dM().aa().b(cyt.e)) {
            int $$4 = axk.a(this.dr());
            int $$5 = axk.a(this.dt());
            int $$6 = axk.a(this.dx());
            chs $$7 = new chs(this.dM());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + axk.a(this.ag, 7, 40) * axk.a(this.ag, -1, 1);
               int $$10 = $$5 + axk.a(this.ag, 7, 40) * axk.a(this.ag, -1, 1);
               int $$11 = $$6 + axk.a(this.ag, 7, 40) * axk.a(this.ag, -1, 1);
               ib $$12 = new ib($$9, $$10, $$11);
               bqb<?> $$13 = $$7.ai();
               if (brj.a($$13, this.dM(), $$12) && brj.a($$13, $$2, bqs.j, $$12, this.dM().z)) {
                  $$7.a_((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dM().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dM().f($$7) && this.dM().g($$7) && !this.dM().d($$7.cH())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dM().d_($$7.dm()), bqs.j, null);
                     $$2.a_($$7);
                     this.f(brv.u).d(new brt("Zombie reinforcement caller charge", -0.05F, brt.a.a));
                     $$7.f(brv.u).d(new brt("Zombie reinforcement callee charge", -0.05F, brt.a.a));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean C(bpv $$0) {
      boolean $$1 = super.C($$0);
      if ($$1) {
         float $$2 = this.dM().d_(this.dm()).b();
         if (this.eU().d() && this.bN() && this.ag.i() < $$2 * 0.3F) {
            $$0.g(2 * (int)$$2);
         }
      }

      return $$1;
   }

   @Override
   protected aul v() {
      return aum.CW;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.Dg;
   }

   @Override
   protected aul o_() {
      return aum.Db;
   }

   protected aul gn() {
      return aum.Dm;
   }

   @Override
   protected void b(ib $$0, doz $$1) {
      this.a(this.gn(), 0.15F, 1.0F);
   }

   @Override
   protected void a(axr $$0, bny $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dM().ak() == bnx.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bqc.a, new crj(crm.oZ));
         } else {
            this.a(bqc.a, new crj(crm.pa));
         }
      }
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.p_());
      $$0.a("CanBreakDoors", this.gv());
      $$0.a("InWaterTime", this.bc() ? this.ch : -1);
      $$0.a("DrownedConversionTime", this.gu() ? this.ci : -1);
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.ch = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.b($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(aps $$0, bqo $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.ak() == bnx.c || $$0.ak() == bnx.d) && $$1 instanceof cjg $$3) {
         if ($$0.ak() != bnx.d && this.ag.h()) {
            return $$2;
         }

         cht $$4 = $$3.a(bqb.bv, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.dm()), bqs.i, new chs.b(false, true));
            $$4.a($$3.gy());
            $$4.a($$3.gI().a(ua.a));
            $$4.a($$3.gp().a());
            $$4.b($$3.u());
            if (!this.aU()) {
               $$0.a(null, 1026, this.dm(), 0);
            }

            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public bpy e(bqz $$0) {
      return this.p_() ? cc : super.e($$0);
   }

   @Override
   public boolean j(crj $$0) {
      return $$0.a(crm.qQ) && this.p_() && this.bO() ? false : super.j($$0);
   }

   @Override
   public boolean k(crj $$0) {
      return $$0.a(crm.rf) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      axr $$4 = $$0.E_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      this.s($$4.i() < 0.55F * $$5);
      if ($$3 == null) {
         $$3 = new chs.b(a($$4), true);
      }

      if ($$3 instanceof chs.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<cci> $$7 = $$0.a(cci.class, this.cH().c(5.0, 3.0, 5.0), bqa.c);
                  if (!$$7.isEmpty()) {
                     cci $$8 = $$7.get(0);
                     $$8.w(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  cci $$9 = bqb.t.a(this.dM());
                  if ($$9 != null) {
                     $$9.b(this.dr(), this.dt(), this.dx(), this.dC(), 0.0F);
                     $$9.a($$0, $$1, bqs.g, null);
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

      if (this.d(bqc.f).d()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(bqc.f, new crj($$4.i() < 0.1F ? dca.ef : dca.ee));
            this.bU[bqc.f.b()] = 0.0F;
         }
      }

      this.G($$5);
      return $$3;
   }

   public static boolean a(axr $$0) {
      return $$0.i() < 0.05F;
   }

   protected void G(float $$0) {
      this.gw();
      this.f(brv.n).d(new brt("Random spawn bonus", this.ag.j() * 0.05F, brt.a.a));
      double $$1 = this.ag.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.f(brv.k).d(new brt("Random zombie-spawn bonus", $$1, brt.a.c));
      }

      if (this.ag.i() < $$0 * 0.05F) {
         this.f(brv.u).d(new brt("Leader zombie bonus", this.ag.j() * 0.25 + 0.5, brt.a.a));
         this.f(brv.q).d(new brt("Leader zombie bonus", this.ag.j() * 3.0 + 1.0, brt.a.c));
         this.x(this.y());
      }
   }

   protected void gw() {
      this.f(brv.u).a(this.ag.j() * 0.1F);
   }

   @Override
   protected void a(bot $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cgl $$4 && $$4.go()) {
         crj $$5 = this.go();
         if (!$$5.d()) {
            $$4.gp();
            this.b($$5);
         }
      }
   }

   protected crj go() {
      return new crj(crm.um);
   }

   class a extends byn {
      a(bqw $$0, double $$1, int $$2) {
         super(dca.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(cyy $$0, ib $$1) {
         $$0.a(null, $$1, aum.Dc, aun.f, 0.5F, 0.9F + chs.this.ag.i() * 0.2F);
      }

      @Override
      public void a(cyx $$0, ib $$1) {
         $$0.a(null, $$1, aum.zM, aun.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements brg {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
