import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chz extends chg {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final bry c = new bry(b, "Baby speed boost", 0.5, bry.a.b);
   private static final aja<Boolean> d = aje.a(chz.class, ajc.k);
   private static final aja<Integer> ca = aje.a(chz.class, ajc.b);
   private static final aja<Boolean> cb = aje.a(chz.class, ajc.k);
   public static final float e = 0.05F;
   public static final int bX = 50;
   public static final int bY = 40;
   public static final int bZ = 7;
   private static final bqd cc = bqg.bt.n().a(0.5F).b(0.93F);
   private static final float cd = 0.1F;
   private static final Predicate<boc> ce = $$0 -> $$0 == boc.d;
   private final bxa cf = new bxa(this, ce);
   private boolean cg;
   private int ch;
   private int ci;

   public chz(bqg<? extends chz> $$0, czg $$1) {
      super($$0, $$1);
   }

   public chz(czg $$0) {
      this(bqg.bt, $$0);
   }

   @Override
   protected void z() {
      this.bR.a(4, new chz.a(this, 1.0, 3));
      this.bR.a(8, new bxy(this, cka.class, 8.0F));
      this.bR.a(8, new byl(this));
      this.u();
   }

   protected void u() {
      this.bR.a(2, new bzf(this, 1.0, false));
      this.bR.a(6, new byc(this, 1.0, true, 4, this::gv));
      this.bR.a(7, new bzd(this, 1.0));
      this.bS.a(1, new bzi(this).a(cib.class));
      this.bS.a(2, new bzj<>(this, cka.class, true));
      this.bS.a(3, new bzj<>(this, cji.class, false));
      this.bS.a(3, new bzj<>(this, ccu.class, true));
      this.bS.a(5, new bzj<>(this, cdj.class, 10, true, false, cdj.bY));
   }

   public static brz.a gr() {
      return chg.gt().a(bsa.k, 35.0).a(bsa.r, 0.23F).a(bsa.c, 3.0).a(bsa.a, 2.0).a(bsa.u);
   }

   @Override
   protected void a(aje.a $$0) {
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
      if (this.y() && cbo.a(this)) {
         if (this.cg != $$0) {
            this.cg = $$0;
            ((cad)this.K()).b($$0);
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
         brw $$1 = this.f(bsa.r);
         $$1.b(c.b());
         if ($$0) {
            $$1.c(c);
         }
      }
   }

   @Override
   public void a(aja<?> $$0) {
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
            if (this.a(avj.a)) {
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
            crs $$1 = this.d(bqh.f);
            if (!$$1.d()) {
               if ($$1.k()) {
                  $$1.b($$1.m() + this.ag.a(2));
                  if ($$1.m() >= $$1.n()) {
                     this.e(bqh.f);
                     this.a(bqh.f, crs.i);
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
      this.b(bqg.B);
      if (!this.aU()) {
         this.dM().a(null, 1040, this.dm(), 0);
      }
   }

   protected void b(bqg<? extends chz> $$0) {
      chz $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.G($$1.dM().d_($$1.dm()).d());
         $$1.x($$1.y() && this.gv());
      }
   }

   protected boolean ad_() {
      return true;
   }

   @Override
   public boolean a(boy $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dM() instanceof apu)) {
         return false;
      } else {
         apu $$2 = (apu)this.dM();
         bqt $$3 = this.p();
         if ($$3 == null && $$0.d() instanceof bqt) {
            $$3 = (bqt)$$0.d();
         }

         if ($$3 != null && this.dM().ak() == boc.d && (double)this.ag.i() < this.g(bsa.u) && this.dM().aa().b(czc.e)) {
            int $$4 = axm.a(this.dr());
            int $$5 = axm.a(this.dt());
            int $$6 = axm.a(this.dx());
            chz $$7 = new chz(this.dM());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + axm.a(this.ag, 7, 40) * axm.a(this.ag, -1, 1);
               int $$10 = $$5 + axm.a(this.ag, 7, 40) * axm.a(this.ag, -1, 1);
               int $$11 = $$6 + axm.a(this.ag, 7, 40) * axm.a(this.ag, -1, 1);
               id $$12 = new id($$9, $$10, $$11);
               bqg<?> $$13 = $$7.ai();
               if (bro.a($$13, this.dM(), $$12) && bro.a($$13, $$2, bqx.j, $$12, this.dM().z)) {
                  $$7.a_((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dM().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dM().f($$7) && this.dM().g($$7) && !this.dM().d($$7.cH())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dM().d_($$7.dm()), bqx.j, null);
                     $$2.a_($$7);
                     this.f(bsa.u).d(new bry("Zombie reinforcement caller charge", -0.05F, bry.a.a));
                     $$7.f(bsa.u).d(new bry("Zombie reinforcement callee charge", -0.05F, bry.a.a));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean C(bqa $$0) {
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
   protected aun v() {
      return auo.CW;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.Dg;
   }

   @Override
   protected aun o_() {
      return auo.Db;
   }

   protected aun gn() {
      return auo.Dm;
   }

   @Override
   protected void b(id $$0, dpi $$1) {
      this.a(this.gn(), 0.15F, 1.0F);
   }

   @Override
   protected void a(axt $$0, bod $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dM().ak() == boc.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bqh.a, new crs(crv.oZ));
         } else {
            this.a(bqh.a, new crs(crv.pa));
         }
      }
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.p_());
      $$0.a("CanBreakDoors", this.gv());
      $$0.a("InWaterTime", this.bc() ? this.ch : -1);
      $$0.a("DrownedConversionTime", this.gu() ? this.ci : -1);
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.ch = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.b($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(apu $$0, bqt $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.ak() == boc.c || $$0.ak() == boc.d) && $$1 instanceof cjn $$3) {
         if ($$0.ak() != boc.d && this.ag.h()) {
            return $$2;
         }

         cia $$4 = $$3.a(bqg.bv, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.dm()), bqx.i, new chz.b(false, true));
            $$4.a($$3.gy());
            $$4.a($$3.gI().a(uc.a));
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
   public bqd e(bre $$0) {
      return this.p_() ? cc : super.e($$0);
   }

   @Override
   public boolean j(crs $$0) {
      return $$0.a(crv.qQ) && this.p_() && this.bO() ? false : super.j($$0);
   }

   @Override
   public boolean k(crs $$0) {
      return $$0.a(crv.rf) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      axt $$4 = $$0.E_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      this.s($$4.i() < 0.55F * $$5);
      if ($$3 == null) {
         $$3 = new chz.b(a($$4), true);
      }

      if ($$3 instanceof chz.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<ccn> $$7 = $$0.a(ccn.class, this.cH().c(5.0, 3.0, 5.0), bqf.c);
                  if (!$$7.isEmpty()) {
                     ccn $$8 = $$7.get(0);
                     $$8.w(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  ccn $$9 = bqg.t.a(this.dM());
                  if ($$9 != null) {
                     $$9.b(this.dr(), this.dt(), this.dx(), this.dC(), 0.0F);
                     $$9.a($$0, $$1, bqx.g, null);
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

      if (this.d(bqh.f).d()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(bqh.f, new crs($$4.i() < 0.1F ? dcj.ef : dcj.ee));
            this.bU[bqh.f.b()] = 0.0F;
         }
      }

      this.G($$5);
      return $$3;
   }

   public static boolean a(axt $$0) {
      return $$0.i() < 0.05F;
   }

   protected void G(float $$0) {
      this.gw();
      this.f(bsa.n).d(new bry("Random spawn bonus", this.ag.j() * 0.05F, bry.a.a));
      double $$1 = this.ag.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.f(bsa.k).d(new bry("Random zombie-spawn bonus", $$1, bry.a.c));
      }

      if (this.ag.i() < $$0 * 0.05F) {
         this.f(bsa.u).d(new bry("Leader zombie bonus", this.ag.j() * 0.25 + 0.5, bry.a.a));
         this.f(bsa.q).d(new bry("Leader zombie bonus", this.ag.j() * 3.0 + 1.0, bry.a.c));
         this.x(this.y());
      }
   }

   protected void gw() {
      this.f(bsa.u).a(this.ag.j() * 0.1F);
   }

   @Override
   protected void a(boy $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cgs $$4 && $$4.go()) {
         crs $$5 = this.go();
         if (!$$5.d()) {
            $$4.gp();
            this.b($$5);
         }
      }
   }

   protected crs go() {
      return new crs(crv.um);
   }

   class a extends bys {
      a(brb $$0, double $$1, int $$2) {
         super(dcj.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(czh $$0, id $$1) {
         $$0.a(null, $$1, auo.Dc, aup.f, 0.5F, 0.9F + chz.this.ag.i() * 0.2F);
      }

      @Override
      public void a(czg $$0, id $$1) {
         $$0.a(null, $$1, auo.zM, aup.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements brl {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
