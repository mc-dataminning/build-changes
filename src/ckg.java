import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckg extends cjn {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final bue c = new bue(b, "Baby speed boost", 0.5, bue.a.b);
   private static final ajp<Boolean> d = ajt.a(ckg.class, ajr.k);
   private static final ajp<Integer> cd = ajt.a(ckg.class, ajr.b);
   private static final ajp<Boolean> ce = ajt.a(ckg.class, ajr.k);
   public static final float e = 0.05F;
   public static final int ca = 50;
   public static final int cb = 40;
   public static final int cc = 7;
   private static final bsg cf = bsj.bu.n().a(0.5F).b(0.93F);
   private static final float cg = 0.1F;
   private static final Predicate<bqa> ch = $$0 -> $$0 == bqa.d;
   private final bzg ci = new bzg(this, ch);
   private boolean cj;
   private int ck;
   private int cl;

   public ckg(bsj<? extends ckg> $$0, dcd $$1) {
      super($$0, $$1);
   }

   public ckg(dcd $$0) {
      this(bsj.bu, $$0);
   }

   @Override
   protected void z() {
      this.bU.a(4, new ckg.a(this, 1.0, 3));
      this.bU.a(8, new cae(this, cmh.class, 8.0F));
      this.bU.a(8, new car(this));
      this.u();
   }

   protected void u() {
      this.bU.a(2, new cbl(this, 1.0, false));
      this.bU.a(6, new cai(this, 1.0, true, 4, this::gv));
      this.bU.a(7, new cbj(this, 1.0));
      this.bV.a(1, new cbo(this).a(cki.class));
      this.bV.a(2, new cbp<>(this, cmh.class, true));
      this.bV.a(3, new cbp<>(this, clp.class, false));
      this.bV.a(3, new cbp<>(this, cfa.class, true));
      this.bV.a(5, new cbp<>(this, cfp.class, 10, true, false, cfp.ca));
   }

   public static buf.a gr() {
      return cjn.gt().a(bug.m, 35.0).a(bug.v, 0.23F).a(bug.c, 3.0).a(bug.a, 2.0).a(bug.A);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(d, false);
      $$0.a(cd, 0);
      $$0.a(ce, false);
   }

   public boolean gu() {
      return this.ap().a(ce);
   }

   public boolean gv() {
      return this.cj;
   }

   public void x(boolean $$0) {
      if (this.y() && cdu.a(this)) {
         if (this.cj != $$0) {
            this.cj = $$0;
            ((ccj)this.K()).b($$0);
            if ($$0) {
               this.bU.a(1, this.ci);
            } else {
               this.bU.a(this.ci);
            }
         }
      } else if (this.cj) {
         this.bU.a(this.ci);
         this.cj = false;
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
   protected int eg() {
      if (this.p_()) {
         this.bP = (int)((double)this.bP * 2.5);
      }

      return super.eg();
   }

   @Override
   public void a(boolean $$0) {
      this.ap().a(d, $$0);
      if (this.dP() != null && !this.dP().B) {
         buc $$1 = this.f(bug.v);
         $$1.b(c.b());
         if ($$0) {
            $$1.c(c);
         }
      }
   }

   @Override
   public void a(ajp<?> $$0) {
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
      if (!this.dP().B && this.bD() && !this.gc()) {
         if (this.gu()) {
            this.cl--;
            if (this.cl < 0) {
               this.ac_();
            }
         } else if (this.gp()) {
            if (this.a(awa.a)) {
               this.ck++;
               if (this.ck >= 600) {
                  this.b(300);
               }
            } else {
               this.ck = -1;
            }
         }
      }

      super.l();
   }

   @Override
   public void n_() {
      if (this.bD()) {
         boolean $$0 = this.ad_() && this.gh();
         if ($$0) {
            cua $$1 = this.a(bsk.f);
            if (!$$1.e()) {
               if ($$1.l()) {
                  $$1.b($$1.n() + this.ah.a(2));
                  if ($$1.n() >= $$1.o()) {
                     this.e(bsk.f);
                     this.a(bsk.f, cua.l);
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

   private void b(int $$0) {
      this.cl = $$0;
      this.ap().a(ce, true);
   }

   protected void ac_() {
      this.b(bsj.B);
      if (!this.aW()) {
         this.dP().a(null, 1040, this.dp(), 0);
      }
   }

   protected void b(bsj<? extends ckg> $$0) {
      ckg $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.H($$1.dP().d_($$1.dp()).d());
         $$1.x($$1.y() && this.gv());
      }
   }

   protected boolean ad_() {
      return true;
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dP() instanceof aqk)) {
         return false;
      } else {
         aqk $$2 = (aqk)this.dP();
         bsy $$3 = this.p();
         if ($$3 == null && $$0.d() instanceof bsy) {
            $$3 = (bsy)$$0.d();
         }

         if ($$3 != null && this.dP().al() == bqa.d && (double)this.ah.i() < this.g(bug.A) && this.dP().ab().b(dbz.e)) {
            int $$4 = aye.a(this.du());
            int $$5 = aye.a(this.dw());
            int $$6 = aye.a(this.dA());
            ckg $$7 = new ckg(this.dP());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + aye.a(this.ah, 7, 40) * aye.a(this.ah, -1, 1);
               int $$10 = $$5 + aye.a(this.ah, 7, 40) * aye.a(this.ah, -1, 1);
               int $$11 = $$6 + aye.a(this.ah, 7, 40) * aye.a(this.ah, -1, 1);
               ja $$12 = new ja($$9, $$10, $$11);
               bsj<?> $$13 = $$7.ak();
               if (btu.a($$13, this.dP(), $$12) && btu.a($$13, $$2, btc.j, $$12, this.dP().z)) {
                  $$7.a_((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dP().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dP().f($$7) && this.dP().g($$7) && !this.dP().d($$7.cK())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dP().d_($$7.dp()), btc.j, null);
                     $$2.a_($$7);
                     this.f(bug.A).d(new bue("Zombie reinforcement caller charge", -0.05F, bue.a.a));
                     $$7.f(bug.A).d(new bue("Zombie reinforcement callee charge", -0.05F, bue.a.a));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean D(bsd $$0) {
      boolean $$1 = super.D($$0);
      if ($$1) {
         float $$2 = this.dP().d_(this.dp()).b();
         if (this.eT().e() && this.bQ() && this.ah.i() < $$2 * 0.3F) {
            $$0.d((float)(2 * (int)$$2));
         }
      }

      return $$1;
   }

   @Override
   protected ave v() {
      return avf.Ds;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.DC;
   }

   @Override
   protected ave o_() {
      return avf.Dx;
   }

   protected ave gn() {
      return avf.DI;
   }

   @Override
   protected void b(ja $$0, dsh $$1) {
      this.a(this.gn(), 0.15F, 1.0F);
   }

   @Override
   protected void a(aym $$0, bqb $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dP().al() == bqa.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bsk.a, new cua(cud.pa));
         } else {
            this.a(bsk.a, new cua(cud.pb));
         }
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.p_());
      $$0.a("CanBreakDoors", this.gv());
      $$0.a("InWaterTime", this.be() ? this.ck : -1);
      $$0.a("DrownedConversionTime", this.gu() ? this.cl : -1);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.ck = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.b($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(aqk $$0, bsy $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.al() == bqa.c || $$0.al() == bqa.d) && $$1 instanceof clu $$3) {
         if ($$0.al() != bqa.d && this.ah.h()) {
            return $$2;
         }

         ckh $$4 = $$3.a(bsj.bw, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.dp()), btc.i, new ckg.b(false, true));
            $$4.a($$3.gy());
            $$4.a($$3.gI().a(ul.a));
            $$4.a($$3.gp().a());
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
   public bsg e(btk $$0) {
      return this.p_() ? cf : super.e($$0);
   }

   @Override
   public boolean j(cua $$0) {
      return $$0.a(cud.qR) && this.p_() && this.bR() ? false : super.j($$0);
   }

   @Override
   public boolean k(cua $$0) {
      return $$0.a(cud.rg) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      aym $$4 = $$0.E_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      this.a_($$4.i() < 0.55F * $$5);
      if ($$3 == null) {
         $$3 = new ckg.b(a($$4), true);
      }

      if ($$3 instanceof ckg.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<cet> $$7 = $$0.a(cet.class, this.cK().c(5.0, 3.0, 5.0), bsi.c);
                  if (!$$7.isEmpty()) {
                     cet $$8 = $$7.get(0);
                     $$8.w(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  cet $$9 = bsj.t.a(this.dP());
                  if ($$9 != null) {
                     $$9.b(this.du(), this.dw(), this.dA(), this.dF(), 0.0F);
                     $$9.a($$0, $$1, btc.g, null);
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

      if (this.a(bsk.f).e()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(bsk.f, new cua($$4.i() < 0.1F ? dfh.ef : dfh.ee));
            this.bX[bsk.f.b()] = 0.0F;
         }
      }

      this.H($$5);
      return $$3;
   }

   public static boolean a(aym $$0) {
      return $$0.i() < 0.05F;
   }

   protected void H(float $$0) {
      this.gw();
      this.f(bug.p).d(new bue("Random spawn bonus", this.ah.j() * 0.05F, bue.a.a));
      double $$1 = this.ah.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.f(bug.m).d(new bue("Random zombie-spawn bonus", $$1, bue.a.c));
      }

      if (this.ah.i() < $$0 * 0.05F) {
         this.f(bug.A).d(new bue("Leader zombie bonus", this.ah.j() * 0.25 + 0.5, bue.a.a));
         this.f(bug.s).d(new bue("Leader zombie bonus", this.ah.j() * 3.0 + 1.0, bue.a.c));
         this.x(this.y());
      }
   }

   protected void gw() {
      this.f(bug.A).a(this.ah.j() * 0.1F);
   }

   @Override
   protected void a(bqw $$0, boolean $$1) {
      super.a($$0, $$1);
      if ($$0.d() instanceof ciz $$3 && $$3.go()) {
         cua $$4 = this.go();
         if (!$$4.e()) {
            $$3.gp();
            this.b($$4);
         }
      }
   }

   protected cua go() {
      return new cua(cud.uo);
   }

   class a extends cay {
      a(final bth $$0, final double $$1, final int $$2) {
         super(dfh.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(dce $$0, ja $$1) {
         $$0.a(null, $$1, avf.Dy, avg.f, 0.5F, 0.9F + ckg.this.ah.i() * 0.2F);
      }

      @Override
      public void a(dcd $$0, ja $$1) {
         $$0.a(null, $$1, avf.Ai, avg.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements btr {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
