import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class clt extends cla {
   private static final alc b = alc.b("baby");
   private static final bvp c = new bvp(b, 0.5, bvp.a.b);
   private static final alc d = alc.b("reinforcement_caller_charge");
   private static final bvp cb = new bvp(alc.b("reinforcement_callee_charge"), -0.05F, bvp.a.a);
   private static final alc cc = alc.b("leader_zombie_bonus");
   private static final alc cd = alc.b("zombie_random_spawn_bonus");
   private static final akg<Boolean> ce = akk.a(clt.class, aki.k);
   private static final akg<Integer> cf = akk.a(clt.class, aki.b);
   private static final akg<Boolean> cg = akk.a(clt.class, aki.k);
   public static final float e = 0.05F;
   public static final int bY = 50;
   public static final int bZ = 40;
   public static final int ca = 7;
   private static final btr ch = btv.bu.n().a(0.5F).b(0.93F);
   private static final float ci = 0.1F;
   private static final Predicate<brm> cj = $$0 -> $$0 == brm.d;
   private final car ck = new car(this, cj);
   private boolean cl;
   private int cm;
   private int cn;

   public clt(btv<? extends clt> $$0, deg $$1) {
      super($$0, $$1);
   }

   public clt(deg $$0) {
      this(btv.bu, $$0);
   }

   @Override
   protected void D() {
      this.bS.a(4, new clt.a(this, 1.0, 3));
      this.bS.a(8, new cbp(this, cnu.class, 8.0F));
      this.bS.a(8, new ccc(this));
      this.t();
   }

   protected void t() {
      this.bS.a(2, new ccw(this, 1.0, false));
      this.bS.a(6, new cbt(this, 1.0, true, 4, this::gw));
      this.bS.a(7, new ccu(this, 1.0));
      this.bT.a(1, new ccz(this).a(clv.class));
      this.bT.a(2, new cda<>(this, cnu.class, true));
      this.bT.a(3, new cda<>(this, cnc.class, false));
      this.bT.a(3, new cda<>(this, cgm.class, true));
      this.bT.a(5, new cda<>(this, chb.class, 10, true, false, chb.bY));
   }

   public static bvq.a gs() {
      return cla.gv().a(bvr.m, 35.0).a(bvr.v, 0.23F).a(bvr.c, 3.0).a(bvr.a, 2.0).a(bvr.A);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(ce, false);
      $$0.a(cf, 0);
      $$0.a(cg, false);
   }

   public boolean gt() {
      return this.at().a(cg);
   }

   public boolean gw() {
      return this.cl;
   }

   public void y(boolean $$0) {
      if (cff.a(this)) {
         if (this.cl != $$0) {
            this.cl = $$0;
            ((cdu)this.P()).b($$0);
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
   public boolean o_() {
      return this.at().a(ce);
   }

   @Override
   protected int ek() {
      if (this.o_()) {
         this.bN = (int)((double)this.bN * 2.5);
      }

      return super.ek();
   }

   @Override
   public void a(boolean $$0) {
      this.at().a(ce, $$0);
      if (this.dS() != null && !this.dS().B) {
         bvn $$1 = this.g(bvr.v);
         $$1.c(b);
         if ($$0) {
            $$1.b(c);
         }
      }
   }

   @Override
   public void a(akg<?> $$0) {
      if (ce.equals($$0)) {
         this.i_();
      }

      super.a($$0);
   }

   protected boolean gq() {
      return true;
   }

   @Override
   public void l() {
      if (!this.dS().B && this.bI() && !this.ge()) {
         if (this.gt()) {
            this.cn--;
            if (this.cn < 0) {
               this.af_();
            }
         } else if (this.gq()) {
            if (this.a(awz.a)) {
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
   public void m_() {
      if (this.bI()) {
         boolean $$0 = this.ag_() && this.gj();
         if ($$0) {
            cvp $$1 = this.a(btw.f);
            if (!$$1.f()) {
               if ($$1.m()) {
                  cvk $$2 = $$1.h();
                  $$1.b($$1.o() + this.af.a(2));
                  if ($$1.o() >= $$1.p()) {
                     this.a($$2, btw.f);
                     this.a(btw.f, cvp.k);
                  }
               }

               $$0 = false;
            }

            if ($$0) {
               this.d(8.0F);
            }
         }
      }

      super.m_();
   }

   private void b(int $$0) {
      this.cn = $$0;
      this.at().a(cg, true);
   }

   protected void af_() {
      this.b(btv.B);
      if (!this.ba()) {
         this.dS().a(null, 1040, this.ds(), 0);
      }
   }

   protected void b(btv<? extends clt> $$0) {
      clt $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.J($$1.dS().d_($$1.ds()).d());
         $$1.y(this.gw());
      }
   }

   protected boolean ag_() {
      return true;
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (this.dS() instanceof arh $$2) {
         buk $$4 = this.m();
         if ($$4 == null && $$0.d() instanceof buk) {
            $$4 = (buk)$$0.d();
         }

         if ($$4 != null && this.dS().am() == brm.d && (double)this.af.i() < this.h(bvr.A) && this.dS().ac().b(dec.e)) {
            int $$5 = azd.a(this.dx());
            int $$6 = azd.a(this.dz());
            int $$7 = azd.a(this.dD());
            btv<? extends clt> $$8 = this.ao();
            clt $$9 = $$8.a(this.dS(), btu.j);
            if ($$9 == null) {
               return true;
            }

            for (int $$10 = 0; $$10 < 50; $$10++) {
               int $$11 = $$5 + azd.a(this.af, 7, 40) * azd.a(this.af, -1, 1);
               int $$12 = $$6 + azd.a(this.af, 7, 40) * azd.a(this.af, -1, 1);
               int $$13 = $$7 + azd.a(this.af, 7, 40) * azd.a(this.af, -1, 1);
               je $$14 = new je($$11, $$12, $$13);
               if (bvf.a($$8, this.dS(), $$14) && bvf.a($$8, $$2, btu.j, $$14, this.dS().z)) {
                  $$9.a_((double)$$11, (double)$$12, (double)$$13);
                  if (!this.dS().a((double)$$11, (double)$$12, (double)$$13, 7.0) && this.dS().f($$9) && this.dS().g($$9) && !this.dS().d($$9.cO())) {
                     $$9.h($$4);
                     $$9.a($$2, this.dS().d_($$9.ds()), btu.j, null);
                     $$2.a_($$9);
                     bvn $$15 = this.g(bvr.A);
                     bvp $$16 = $$15.a(d);
                     double $$17 = $$16 != null ? $$16.c() : 0.0;
                     $$15.c(d);
                     $$15.d(new bvp(d, $$17 - 0.05, bvp.a.a));
                     $$9.g(bvr.A).d(cb);
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
   public boolean E(bto $$0) {
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
   protected awd w() {
      return awe.Dz;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.DJ;
   }

   @Override
   protected awd n_() {
      return awe.DE;
   }

   protected awd y() {
      return awe.DP;
   }

   @Override
   protected void b(je $$0, duo $$1) {
      this.a(this.y(), 0.15F, 1.0F);
   }

   @Override
   public btv<? extends clt> ao() {
      return (btv<? extends clt>)super.ao();
   }

   @Override
   protected void a(azl $$0, brn $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dS().am() == brm.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(btw.a, new cvp(cvt.pc));
         } else {
            this.a(btw.a, new cvp(cvt.pd));
         }
      }
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.o_());
      $$0.a("CanBreakDoors", this.gw());
      $$0.a("InWaterTime", this.bi() ? this.cm : -1);
      $$0.a("DrownedConversionTime", this.gt() ? this.cn : -1);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CanBreakDoors"));
      this.cm = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.b($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(arh $$0, buk $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.am() == brm.c || $$0.am() == brm.d) && $$1 instanceof cnh $$3) {
         if ($$0.am() != brm.d && this.af.h()) {
            return $$2;
         }

         clu $$4 = $$3.a(btv.bw, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.ds()), btu.i, new clt.b(false, true));
            $$4.a($$3.gz());
            $$4.a($$3.gK().a(ut.a));
            $$4.a($$3.gr().a());
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
   public btr e(buw $$0) {
      return this.o_() ? ch : super.e($$0);
   }

   @Override
   public boolean i(cvp $$0) {
      return $$0.a(cvt.qS) && this.o_() && this.bW() ? false : super.i($$0);
   }

   @Override
   public boolean j(cvp $$0) {
      return $$0.a(cvt.rh) ? false : super.j($$0);
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      azl $$4 = $$0.C_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      this.a_($$4.i() < 0.55F * $$5);
      if ($$3 == null) {
         $$3 = new clt.b(a($$4), true);
      }

      if ($$3 instanceof clt.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<cgf> $$7 = $$0.a(cgf.class, this.cO().c(5.0, 3.0, 5.0), btt.c);
                  if (!$$7.isEmpty()) {
                     cgf $$8 = $$7.get(0);
                     $$8.x(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  cgf $$9 = btv.t.a(this.dS(), btu.g);
                  if ($$9 != null) {
                     $$9.b(this.dx(), this.dz(), this.dD(), this.dI(), 0.0F);
                     $$9.a($$0, $$1, btu.g, null);
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

      if (this.a(btw.f).f()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(btw.f, new cvp($$4.i() < 0.1F ? dhl.ef : dhl.ee));
            this.bV[btw.f.b()] = 0.0F;
         }
      }

      this.J($$5);
      return $$3;
   }

   public static boolean a(azl $$0) {
      return $$0.i() < 0.05F;
   }

   protected void J(float $$0) {
      this.gx();
      this.g(bvr.p).c(new bvp(bL, this.af.j() * 0.05F, bvp.a.a));
      double $$1 = this.af.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.g(bvr.m).c(new bvp(cd, $$1, bvp.a.c));
      }

      if (this.af.i() < $$0 * 0.05F) {
         this.g(bvr.A).c(new bvp(cc, this.af.j() * 0.25 + 0.5, bvp.a.a));
         this.g(bvr.s).c(new bvp(cc, this.af.j() * 3.0 + 1.0, bvp.a.c));
         this.y(true);
      }
   }

   protected void gx() {
      this.g(bvr.A).a(this.af.j() * 0.1F);
   }

   @Override
   protected void a(arh $$0, bsg $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof ckm $$4 && $$4.gr()) {
         cvp $$5 = this.gp();
         if (!$$5.f()) {
            $$4.gs();
            this.b($$5);
         }
      }
   }

   protected cvp gp() {
      return new cvp(cvt.uq);
   }

   class a extends ccj {
      a(final bus $$0, final double $$1, final int $$2) {
         super(dhl.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(deh $$0, je $$1) {
         $$0.a(null, $$1, awe.DF, awf.f, 0.5F, 0.9F + clt.this.af.i() * 0.2F);
      }

      @Override
      public void a(deg $$0, je $$1) {
         $$0.a(null, $$1, awe.Ao, awf.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bvc {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
