import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cku extends ckb {
   private static final akq b = akq.b("baby");
   private static final bus c = new bus(b, 0.5, bus.a.b);
   private static final akq d = akq.b("reinforcement_caller_charge");
   private static final bus cd = new bus(akq.b("reinforcement_callee_charge"), -0.05F, bus.a.a);
   private static final akq ce = akq.b("leader_zombie_bonus");
   private static final akq cf = akq.b("zombie_random_spawn_bonus");
   private static final ajv<Boolean> cg = ajz.a(cku.class, ajx.k);
   private static final ajv<Integer> ch = ajz.a(cku.class, ajx.b);
   private static final ajv<Boolean> ci = ajz.a(cku.class, ajx.k);
   public static final float e = 0.05F;
   public static final int ca = 50;
   public static final int cb = 40;
   public static final int cc = 7;
   private static final bst cj = bsw.bu.n().a(0.5F).b(0.93F);
   private static final float ck = 0.1F;
   private static final Predicate<bqn> cl = $$0 -> $$0 == bqn.d;
   private final bzu cm = new bzu(this, cl);
   private boolean cn;
   private int co;
   private int cp;

   public cku(bsw<? extends cku> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public cku(dcu $$0) {
      this(bsw.bu, $$0);
   }

   @Override
   protected void z() {
      this.bU.a(4, new cku.a(this, 1.0, 3));
      this.bU.a(8, new cas(this, cmv.class, 8.0F));
      this.bU.a(8, new cbf(this));
      this.t();
   }

   protected void t() {
      this.bU.a(2, new cbz(this, 1.0, false));
      this.bU.a(6, new caw(this, 1.0, true, 4, this::gu));
      this.bU.a(7, new cbx(this, 1.0));
      this.bV.a(1, new ccc(this).a(ckw.class));
      this.bV.a(2, new ccd<>(this, cmv.class, true));
      this.bV.a(3, new ccd<>(this, cmd.class, false));
      this.bV.a(3, new ccd<>(this, cfo.class, true));
      this.bV.a(5, new ccd<>(this, cgd.class, 10, true, false, cgd.ca));
   }

   public static but.a gq() {
      return ckb.gs().a(buu.m, 35.0).a(buu.v, 0.23F).a(buu.c, 3.0).a(buu.a, 2.0).a(buu.A);
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(cg, false);
      $$0.a(ch, 0);
      $$0.a(ci, false);
   }

   public boolean gt() {
      return this.ar().a(ci);
   }

   public boolean gu() {
      return this.cn;
   }

   public void x(boolean $$0) {
      if (this.x() && cei.a(this)) {
         if (this.cn != $$0) {
            this.cn = $$0;
            ((ccx)this.J()).b($$0);
            if ($$0) {
               this.bU.a(1, this.cm);
            } else {
               this.bU.a(this.cm);
            }
         }
      } else if (this.cn) {
         this.bU.a(this.cm);
         this.cn = false;
      }
   }

   protected boolean x() {
      return true;
   }

   @Override
   public boolean o_() {
      return this.ar().a(cg);
   }

   @Override
   protected int eh() {
      if (this.o_()) {
         this.bP = (int)((double)this.bP * 2.5);
      }

      return super.eh();
   }

   @Override
   public void a(boolean $$0) {
      this.ar().a(cg, $$0);
      if (this.dQ() != null && !this.dQ().B) {
         buq $$1 = this.f(buu.v);
         $$1.c(b);
         if ($$0) {
            $$1.b(c);
         }
      }
   }

   @Override
   public void a(ajv<?> $$0) {
      if (cg.equals($$0)) {
         this.i_();
      }

      super.a($$0);
   }

   protected boolean go() {
      return true;
   }

   @Override
   public void l() {
      if (!this.dQ().B && this.bE() && !this.gb()) {
         if (this.gt()) {
            this.cp--;
            if (this.cp < 0) {
               this.ac_();
            }
         } else if (this.go()) {
            if (this.a(awj.a)) {
               this.co++;
               if (this.co >= 600) {
                  this.b(300);
               }
            } else {
               this.co = -1;
            }
         }
      }

      super.l();
   }

   @Override
   public void m_() {
      if (this.bE()) {
         boolean $$0 = this.ad_() && this.gg();
         if ($$0) {
            cuo $$1 = this.a(bsx.f);
            if (!$$1.e()) {
               if ($$1.l()) {
                  cuj $$2 = $$1.g();
                  $$1.b($$1.n() + this.ah.a(2));
                  if ($$1.n() >= $$1.o()) {
                     this.a($$2, bsx.f);
                     this.a(bsx.f, cuo.l);
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
      this.cp = $$0;
      this.ar().a(ci, true);
   }

   protected void ac_() {
      this.b(bsw.B);
      if (!this.aX()) {
         this.dQ().a(null, 1040, this.dq(), 0);
      }
   }

   protected void b(bsw<? extends cku> $$0) {
      cku $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.H($$1.dQ().d_($$1.dq()).d());
         $$1.x($$1.x() && this.gu());
      }
   }

   protected boolean ad_() {
      return true;
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dQ() instanceof aqt)) {
         return false;
      } else {
         aqt $$2 = (aqt)this.dQ();
         btl $$3 = this.p();
         if ($$3 == null && $$0.d() instanceof btl) {
            $$3 = (btl)$$0.d();
         }

         if ($$3 != null && this.dQ().al() == bqn.d && (double)this.ah.i() < this.g(buu.A) && this.dQ().ab().b(dcq.e)) {
            int $$4 = ayn.a(this.dv());
            int $$5 = ayn.a(this.dx());
            int $$6 = ayn.a(this.dB());
            cku $$7 = new cku(this.dQ());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + ayn.a(this.ah, 7, 40) * ayn.a(this.ah, -1, 1);
               int $$10 = $$5 + ayn.a(this.ah, 7, 40) * ayn.a(this.ah, -1, 1);
               int $$11 = $$6 + ayn.a(this.ah, 7, 40) * ayn.a(this.ah, -1, 1);
               jd $$12 = new jd($$9, $$10, $$11);
               bsw<?> $$13 = $$7.am();
               if (bui.a($$13, this.dQ(), $$12) && bui.a($$13, $$2, btp.j, $$12, this.dQ().z)) {
                  $$7.a_((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dQ().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dQ().f($$7) && this.dQ().g($$7) && !this.dQ().d($$7.cL())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dQ().d_($$7.dq()), btp.j, null);
                     $$2.a_($$7);
                     buq $$14 = this.f(buu.A);
                     bus $$15 = $$14.a(d);
                     double $$16 = $$15 != null ? $$15.c() : 0.0;
                     $$14.c(new bus(d, $$16 - 0.05, bus.a.a));
                     $$7.f(buu.A).c(cd);
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean D(bsq $$0) {
      boolean $$1 = super.D($$0);
      if ($$1) {
         float $$2 = this.dQ().d_(this.dq()).b();
         if (this.eU().e() && this.bR() && this.ah.i() < $$2 * 0.3F) {
            $$0.d((float)(2 * (int)$$2));
         }
      }

      return $$1;
   }

   @Override
   protected avn v() {
      return avo.Dt;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.DD;
   }

   @Override
   protected avn n_() {
      return avo.Dy;
   }

   protected avn gm() {
      return avo.DJ;
   }

   @Override
   protected void b(jd $$0, dta $$1) {
      this.a(this.gm(), 0.15F, 1.0F);
   }

   @Override
   protected void a(ayv $$0, bqo $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dQ().al() == bqn.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bsx.a, new cuo(cur.pb));
         } else {
            this.a(bsx.a, new cuo(cur.pc));
         }
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.o_());
      $$0.a("CanBreakDoors", this.gu());
      $$0.a("InWaterTime", this.bf() ? this.co : -1);
      $$0.a("DrownedConversionTime", this.gt() ? this.cp : -1);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.co = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.b($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(aqt $$0, btl $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.al() == bqn.c || $$0.al() == bqn.d) && $$1 instanceof cmi $$3) {
         if ($$0.al() != bqn.d && this.ah.h()) {
            return $$2;
         }

         ckv $$4 = $$3.a(bsw.bw, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.dq()), btp.i, new cku.b(false, true));
            $$4.a($$3.gx());
            $$4.a($$3.gH().a(uo.a));
            $$4.a($$3.go().a());
            $$4.b($$3.t());
            if (!this.aX()) {
               $$0.a(null, 1026, this.dq(), 0);
            }

            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public bst e(bty $$0) {
      return this.o_() ? cj : super.e($$0);
   }

   @Override
   public boolean j(cuo $$0) {
      return $$0.a(cur.qR) && this.o_() && this.bS() ? false : super.j($$0);
   }

   @Override
   public boolean k(cuo $$0) {
      return $$0.a(cur.rg) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      ayv $$4 = $$0.E_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      this.a_($$4.i() < 0.55F * $$5);
      if ($$3 == null) {
         $$3 = new cku.b(a($$4), true);
      }

      if ($$3 instanceof cku.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<cfh> $$7 = $$0.a(cfh.class, this.cL().c(5.0, 3.0, 5.0), bsv.c);
                  if (!$$7.isEmpty()) {
                     cfh $$8 = $$7.get(0);
                     $$8.w(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  cfh $$9 = bsw.t.a(this.dQ());
                  if ($$9 != null) {
                     $$9.b(this.dv(), this.dx(), this.dB(), this.dG(), 0.0F);
                     $$9.a($$0, $$1, btp.g, null);
                     $$9.w(true);
                     this.n($$9);
                     $$0.b($$9);
                  }
               }
            }
         }

         this.x(this.x() && $$4.i() < $$5 * 0.1F);
         this.a($$4, $$1);
         this.a($$0, $$4, $$1);
      }

      if (this.a(bsx.f).e()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(bsx.f, new cuo($$4.i() < 0.1F ? dfy.ef : dfy.ee));
            this.bX[bsx.f.b()] = 0.0F;
         }
      }

      this.H($$5);
      return $$3;
   }

   public static boolean a(ayv $$0) {
      return $$0.i() < 0.05F;
   }

   protected void H(float $$0) {
      this.gv();
      this.f(buu.p).c(new bus(bN, this.ah.j() * 0.05F, bus.a.a));
      double $$1 = this.ah.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.f(buu.m).c(new bus(cf, $$1, bus.a.c));
      }

      if (this.ah.i() < $$0 * 0.05F) {
         this.f(buu.A).c(new bus(ce, this.ah.j() * 0.25 + 0.5, bus.a.a));
         this.f(buu.s).c(new bus(ce, this.ah.j() * 3.0 + 1.0, bus.a.c));
         this.x(this.x());
      }
   }

   protected void gv() {
      this.f(buu.A).a(this.ah.j() * 0.1F);
   }

   @Override
   protected void a(aqt $$0, brj $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cjn $$4 && $$4.gn()) {
         cuo $$5 = this.gn();
         if (!$$5.e()) {
            $$4.go();
            this.b($$5);
         }
      }
   }

   protected cuo gn() {
      return new cuo(cur.uo);
   }

   class a extends cbm {
      a(final btu $$0, final double $$1, final int $$2) {
         super(dfy.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(dcv $$0, jd $$1) {
         $$0.a(null, $$1, avo.Dz, avp.f, 0.5F, 0.9F + cku.this.ah.i() * 0.2F);
      }

      @Override
      public void a(dcu $$0, jd $$1) {
         $$0.a(null, $$1, avo.Ai, avp.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements buf {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
