import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class clw extends cld {
   private static final ale b = ale.b("baby");
   private static final bvs c = new bvs(b, 0.5, bvs.a.b);
   private static final ale d = ale.b("reinforcement_caller_charge");
   private static final bvs cb = new bvs(ale.b("reinforcement_callee_charge"), -0.05F, bvs.a.a);
   private static final ale cc = ale.b("leader_zombie_bonus");
   private static final ale cd = ale.b("zombie_random_spawn_bonus");
   private static final akh<Boolean> ce = akl.a(clw.class, akj.k);
   private static final akh<Integer> cf = akl.a(clw.class, akj.b);
   private static final akh<Boolean> cg = akl.a(clw.class, akj.k);
   public static final float e = 0.05F;
   public static final int bY = 50;
   public static final int bZ = 40;
   public static final int ca = 7;
   private static final btu ch = bty.bu.n().a(0.5F).b(0.93F);
   private static final float ci = 0.1F;
   private static final Predicate<brp> cj = $$0 -> $$0 == brp.d;
   private final cau ck = new cau(this, cj);
   private boolean cl;
   private int cm;
   private int cn;

   public clw(bty<? extends clw> $$0, dej $$1) {
      super($$0, $$1);
   }

   public clw(dej $$0) {
      this(bty.bu, $$0);
   }

   @Override
   protected void D() {
      this.bS.a(4, new clw.a(this, 1.0, 3));
      this.bS.a(8, new cbs(this, cnx.class, 8.0F));
      this.bS.a(8, new ccf(this));
      this.t();
   }

   protected void t() {
      this.bS.a(2, new ccz(this, 1.0, false));
      this.bS.a(6, new cbw(this, 1.0, true, 4, this::gv));
      this.bS.a(7, new ccx(this, 1.0));
      this.bT.a(1, new cdc(this).a(cly.class));
      this.bT.a(2, new cdd<>(this, cnx.class, true));
      this.bT.a(3, new cdd<>(this, cnf.class, false));
      this.bT.a(3, new cdd<>(this, cgp.class, true));
      this.bT.a(5, new cdd<>(this, che.class, 10, true, false, che.bY));
   }

   public static bvt.a gr() {
      return cld.gu().a(bvu.m, 35.0).a(bvu.v, 0.23F).a(bvu.c, 3.0).a(bvu.a, 2.0).a(bvu.A);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(ce, false);
      $$0.a(cf, 0);
      $$0.a(cg, false);
   }

   public boolean gs() {
      return this.at().a(cg);
   }

   public boolean gv() {
      return this.cl;
   }

   public void y(boolean $$0) {
      if (cfi.a(this)) {
         if (this.cl != $$0) {
            this.cl = $$0;
            ((cdx)this.P()).b($$0);
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
      return this.at().a(ce);
   }

   @Override
   protected int el() {
      if (this.p_()) {
         this.bN = (int)((double)this.bN * 2.5);
      }

      return super.el();
   }

   @Override
   public void a(boolean $$0) {
      this.at().a(ce, $$0);
      if (this.dS() != null && !this.dS().B) {
         bvq $$1 = this.g(bvu.v);
         $$1.c(b);
         if ($$0) {
            $$1.b(c);
         }
      }
   }

   @Override
   public void a(akh<?> $$0) {
      if (ce.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   protected boolean gp() {
      return true;
   }

   @Override
   public void l() {
      if (!this.dS().B && this.bI() && !this.gd()) {
         if (this.gs()) {
            this.cn--;
            if (this.cn < 0) {
               this.ag_();
            }
         } else if (this.gp()) {
            if (this.a(axb.a)) {
               this.cm++;
               if (this.cm >= 600) {
                  this.b(300);
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
      if (this.bI()) {
         boolean $$0 = this.ah_() && this.gi();
         if ($$0) {
            cvs $$1 = this.a(btz.f);
            if (!$$1.f()) {
               if ($$1.m()) {
                  cvn $$2 = $$1.h();
                  $$1.b($$1.o() + this.af.a(2));
                  if ($$1.o() >= $$1.p()) {
                     this.a($$2, btz.f);
                     this.a(btz.f, cvs.k);
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
      this.cn = $$0;
      this.at().a(cg, true);
   }

   protected void ag_() {
      this.b(bty.B);
      if (!this.ba()) {
         this.dS().a(null, 1040, this.ds(), 0);
      }
   }

   protected void b(bty<? extends clw> $$0) {
      clw $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.J($$1.dS().d_($$1.ds()).d());
         $$1.y(this.gv());
      }
   }

   protected boolean ah_() {
      return true;
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (this.dS() instanceof arj $$2) {
         bun $$4 = this.m();
         if ($$4 == null && $$0.d() instanceof bun) {
            $$4 = (bun)$$0.d();
         }

         if ($$4 != null && this.dS().am() == brp.d && (double)this.af.i() < this.h(bvu.A) && this.dS().ac().b(def.e)) {
            int $$5 = azf.a(this.dx());
            int $$6 = azf.a(this.dz());
            int $$7 = azf.a(this.dD());
            bty<? extends clw> $$8 = this.ao();
            clw $$9 = $$8.a(this.dS(), btx.j);
            if ($$9 == null) {
               return true;
            }

            for (int $$10 = 0; $$10 < 50; $$10++) {
               int $$11 = $$5 + azf.a(this.af, 7, 40) * azf.a(this.af, -1, 1);
               int $$12 = $$6 + azf.a(this.af, 7, 40) * azf.a(this.af, -1, 1);
               int $$13 = $$7 + azf.a(this.af, 7, 40) * azf.a(this.af, -1, 1);
               jf $$14 = new jf($$11, $$12, $$13);
               if (bvi.a($$8, this.dS(), $$14) && bvi.a($$8, $$2, btx.j, $$14, this.dS().z)) {
                  $$9.a_((double)$$11, (double)$$12, (double)$$13);
                  if (!this.dS().a((double)$$11, (double)$$12, (double)$$13, 7.0) && this.dS().f($$9) && this.dS().g($$9) && !this.dS().d($$9.cO())) {
                     $$9.h($$4);
                     $$9.a($$2, this.dS().d_($$9.ds()), btx.j, null);
                     $$2.a_($$9);
                     bvq $$15 = this.g(bvu.A);
                     bvs $$16 = $$15.a(d);
                     double $$17 = $$16 != null ? $$16.c() : 0.0;
                     $$15.c(d);
                     $$15.d(new bvs(d, $$17 - 0.05, bvs.a.a));
                     $$9.g(bvu.A).d(cb);
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
   public boolean E(btr $$0) {
      boolean $$1 = super.E($$0);
      if ($$1) {
         float $$2 = this.dS().d_(this.ds()).b();
         if (this.eW().f() && this.bV() && this.af.i() < $$2 * 0.3F) {
            $$0.d((float)(2 * (int)$$2));
         }
      }

      return $$1;
   }

   @Override
   protected awf w() {
      return awg.Dz;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.DJ;
   }

   @Override
   protected awf o_() {
      return awg.DE;
   }

   protected awf y() {
      return awg.DP;
   }

   @Override
   protected void b(jf $$0, dus $$1) {
      this.a(this.y(), 0.15F, 1.0F);
   }

   @Override
   public bty<? extends clw> ao() {
      return (bty<? extends clw>)super.ao();
   }

   @Override
   protected void a(azn $$0, brq $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dS().am() == brp.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(btz.a, new cvs(cvw.pc));
         } else {
            this.a(btz.a, new cvs(cvw.pd));
         }
      }
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.p_());
      $$0.a("CanBreakDoors", this.gv());
      $$0.a("InWaterTime", this.bi() ? this.cm : -1);
      $$0.a("DrownedConversionTime", this.gs() ? this.cn : -1);
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CanBreakDoors"));
      this.cm = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.b($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(arj $$0, bun $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.am() == brp.c || $$0.am() == brp.d) && $$1 instanceof cnk $$3) {
         if ($$0.am() != brp.d && this.af.h()) {
            return $$2;
         }

         clx $$4 = $$3.a(bty.bw, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.ds()), btx.i, new clw.b(false, true));
            $$4.a($$3.gy());
            $$4.a($$3.gI().a(uu.a));
            $$4.a($$3.gq().a());
            $$4.b($$3.t());
            if (!this.ba()) {
               $$0.a(null, 1026, this.ds(), 0);
            }

            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public btu e(buz $$0) {
      return this.p_() ? ch : super.e($$0);
   }

   @Override
   public boolean i(cvs $$0) {
      return $$0.a(cvw.qS) && this.p_() && this.bW() ? false : super.i($$0);
   }

   @Override
   public boolean j(cvs $$0) {
      return $$0.a(cvw.rh) ? false : super.j($$0);
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      azn $$4 = $$0.D_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      this.a_($$4.i() < 0.55F * $$5);
      if ($$3 == null) {
         $$3 = new clw.b(a($$4), true);
      }

      if ($$3 instanceof clw.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<cgi> $$7 = $$0.a(cgi.class, this.cO().c(5.0, 3.0, 5.0), btw.c);
                  if (!$$7.isEmpty()) {
                     cgi $$8 = $$7.get(0);
                     $$8.x(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  cgi $$9 = bty.t.a(this.dS(), btx.g);
                  if ($$9 != null) {
                     $$9.b(this.dx(), this.dz(), this.dD(), this.dI(), 0.0F);
                     $$9.a($$0, $$1, btx.g, null);
                     $$9.x(true);
                     this.n($$9);
                     $$0.b($$9);
                  }
               }
            }
         }

         this.y($$4.i() < $$5 * 0.1F);
         this.a($$4, $$1);
         this.a($$0, $$4, $$1);
      }

      if (this.a(btz.f).f()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(btz.f, new cvs($$4.i() < 0.1F ? dho.ef : dho.ee));
            this.bV[btz.f.b()] = 0.0F;
         }
      }

      this.J($$5);
      return $$3;
   }

   public static boolean a(azn $$0) {
      return $$0.i() < 0.05F;
   }

   protected void J(float $$0) {
      this.gw();
      this.g(bvu.p).c(new bvs(bL, this.af.j() * 0.05F, bvs.a.a));
      double $$1 = this.af.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.g(bvu.m).c(new bvs(cd, $$1, bvs.a.c));
      }

      if (this.af.i() < $$0 * 0.05F) {
         this.g(bvu.A).c(new bvs(cc, this.af.j() * 0.25 + 0.5, bvs.a.a));
         this.g(bvu.s).c(new bvs(cc, this.af.j() * 3.0 + 1.0, bvs.a.c));
         this.y(true);
      }
   }

   protected void gw() {
      this.g(bvu.A).a(this.af.j() * 0.1F);
   }

   @Override
   protected void a(arj $$0, bsj $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof ckp $$4 && $$4.gq()) {
         cvs $$5 = this.go();
         if (!$$5.f()) {
            $$4.gr();
            this.b($$5);
         }
      }
   }

   protected cvs go() {
      return new cvs(cvw.uq);
   }

   class a extends ccm {
      a(final buv $$0, final double $$1, final int $$2) {
         super(dho.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(dek $$0, jf $$1) {
         $$0.a(null, $$1, awg.DF, awh.f, 0.5F, 0.9F + clw.this.af.i() * 0.2F);
      }

      @Override
      public void a(dej $$0, jf $$1) {
         $$0.a(null, $$1, awg.Ao, awh.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bvf {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
