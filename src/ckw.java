import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckw extends ckd {
   private static final akr b = akr.b("baby");
   private static final buu c = new buu(b, 0.5, buu.a.b);
   private static final akr d = akr.b("reinforcement_caller_charge");
   private static final buu cd = new buu(akr.b("reinforcement_callee_charge"), -0.05F, buu.a.a);
   private static final akr ce = akr.b("leader_zombie_bonus");
   private static final akr cf = akr.b("zombie_random_spawn_bonus");
   private static final ajw<Boolean> cg = aka.a(ckw.class, ajy.k);
   private static final ajw<Integer> ch = aka.a(ckw.class, ajy.b);
   private static final ajw<Boolean> ci = aka.a(ckw.class, ajy.k);
   public static final float e = 0.05F;
   public static final int ca = 50;
   public static final int cb = 40;
   public static final int cc = 7;
   private static final bsu cj = bsx.bu.n().a(0.5F).b(0.93F);
   private static final float ck = 0.1F;
   private static final Predicate<bqo> cl = $$0 -> $$0 == bqo.d;
   private final bzw cm = new bzw(this, cl);
   private boolean cn;
   private int co;
   private int cp;

   public ckw(bsx<? extends ckw> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public ckw(dcw $$0) {
      this(bsx.bu, $$0);
   }

   @Override
   protected void B() {
      this.bU.a(4, new ckw.a(this, 1.0, 3));
      this.bU.a(8, new cau(this, cmx.class, 8.0F));
      this.bU.a(8, new cbh(this));
      this.t();
   }

   protected void t() {
      this.bU.a(2, new ccb(this, 1.0, false));
      this.bU.a(6, new cay(this, 1.0, true, 4, this::gs));
      this.bU.a(7, new cbz(this, 1.0));
      this.bV.a(1, new cce(this).a(cky.class));
      this.bV.a(2, new ccf<>(this, cmx.class, true));
      this.bV.a(3, new ccf<>(this, cmf.class, false));
      this.bV.a(3, new ccf<>(this, cfq.class, true));
      this.bV.a(5, new ccf<>(this, cgf.class, 10, true, false, cgf.ca));
   }

   public static buv.a go() {
      return ckd.gq().a(buw.m, 35.0).a(buw.v, 0.23F).a(buw.c, 3.0).a(buw.a, 2.0).a(buw.A);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(cg, false);
      $$0.a(ch, 0);
      $$0.a(ci, false);
   }

   public boolean gr() {
      return this.ar().a(ci);
   }

   public boolean gs() {
      return this.cn;
   }

   public void y(boolean $$0) {
      if (this.x() && cek.a(this)) {
         if (this.cn != $$0) {
            this.cn = $$0;
            ((ccz)this.N()).b($$0);
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
   protected int eg() {
      if (this.o_()) {
         this.bP = (int)((double)this.bP * 2.5);
      }

      return super.eg();
   }

   @Override
   public void a(boolean $$0) {
      this.ar().a(cg, $$0);
      if (this.dO() != null && !this.dO().B) {
         bus $$1 = this.f(buw.v);
         $$1.c(b);
         if ($$0) {
            $$1.b(c);
         }
      }
   }

   @Override
   public void a(ajw<?> $$0) {
      if (cg.equals($$0)) {
         this.i_();
      }

      super.a($$0);
   }

   protected boolean gm() {
      return true;
   }

   @Override
   public void l() {
      if (!this.dO().B && this.bE() && !this.fZ()) {
         if (this.gr()) {
            this.cp--;
            if (this.cp < 0) {
               this.ag_();
            }
         } else if (this.gm()) {
            if (this.a(awk.a)) {
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
         boolean $$0 = this.ah_() && this.ge();
         if ($$0) {
            cuq $$1 = this.a(bsy.f);
            if (!$$1.e()) {
               if ($$1.l()) {
                  cul $$2 = $$1.g();
                  $$1.b($$1.n() + this.ah.a(2));
                  if ($$1.n() >= $$1.o()) {
                     this.a($$2, bsy.f);
                     this.a(bsy.f, cuq.l);
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

   protected void ag_() {
      this.b(bsx.B);
      if (!this.aX()) {
         this.dO().a(null, 1040, this.do(), 0);
      }
   }

   protected void b(bsx<? extends ckw> $$0) {
      ckw $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.H($$1.dO().d_($$1.do()).d());
         $$1.y($$1.x() && this.gs());
      }
   }

   protected boolean ah_() {
      return true;
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dO() instanceof aqu)) {
         return false;
      } else {
         aqu $$2 = (aqu)this.dO();
         btn $$3 = this.p();
         if ($$3 == null && $$0.d() instanceof btn) {
            $$3 = (btn)$$0.d();
         }

         if ($$3 != null && this.dO().al() == bqo.d && (double)this.ah.i() < this.g(buw.A) && this.dO().ab().b(dcs.e)) {
            int $$4 = ayo.a(this.dt());
            int $$5 = ayo.a(this.dv());
            int $$6 = ayo.a(this.dz());
            ckw $$7 = new ckw(this.dO());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + ayo.a(this.ah, 7, 40) * ayo.a(this.ah, -1, 1);
               int $$10 = $$5 + ayo.a(this.ah, 7, 40) * ayo.a(this.ah, -1, 1);
               int $$11 = $$6 + ayo.a(this.ah, 7, 40) * ayo.a(this.ah, -1, 1);
               jd $$12 = new jd($$9, $$10, $$11);
               bsx<?> $$13 = $$7.am();
               if (buk.a($$13, this.dO(), $$12) && buk.a($$13, $$2, btr.j, $$12, this.dO().z)) {
                  $$7.a_((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dO().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dO().f($$7) && this.dO().g($$7) && !this.dO().d($$7.cK())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dO().d_($$7.do()), btr.j, null);
                     $$2.a_($$7);
                     bus $$14 = this.f(buw.A);
                     buu $$15 = $$14.a(d);
                     double $$16 = $$15 != null ? $$15.c() : 0.0;
                     $$14.c(d);
                     $$14.c(new buu(d, $$16 - 0.05, buu.a.a));
                     $$7.f(buw.A).c(cd);
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean D(bsr $$0) {
      boolean $$1 = super.D($$0);
      if ($$1) {
         float $$2 = this.dO().d_(this.do()).b();
         if (this.eT().e() && this.bR() && this.ah.i() < $$2 * 0.3F) {
            $$0.d((float)(2 * (int)$$2));
         }
      }

      return $$1;
   }

   @Override
   protected avo v() {
      return avp.Dt;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.DD;
   }

   @Override
   protected avo n_() {
      return avp.Dy;
   }

   protected avo gk() {
      return avp.DJ;
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
      this.a(this.gk(), 0.15F, 1.0F);
   }

   @Override
   protected void a(ayw $$0, bqp $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dO().al() == bqo.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bsy.a, new cuq(cut.pb));
         } else {
            this.a(bsy.a, new cuq(cut.pc));
         }
      }
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.o_());
      $$0.a("CanBreakDoors", this.gs());
      $$0.a("InWaterTime", this.bf() ? this.co : -1);
      $$0.a("DrownedConversionTime", this.gr() ? this.cp : -1);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CanBreakDoors"));
      this.co = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.b($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(aqu $$0, btn $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.al() == bqo.c || $$0.al() == bqo.d) && $$1 instanceof cmk $$3) {
         if ($$0.al() != bqo.d && this.ah.h()) {
            return $$2;
         }

         ckx $$4 = $$3.a(bsx.bw, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.do()), btr.i, new ckw.b(false, true));
            $$4.a($$3.gv());
            $$4.a($$3.gF().a(up.a));
            $$4.a($$3.gm().a());
            $$4.b($$3.t());
            if (!this.aX()) {
               $$0.a(null, 1026, this.do(), 0);
            }

            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public bsu e(bua $$0) {
      return this.o_() ? cj : super.e($$0);
   }

   @Override
   public boolean j(cuq $$0) {
      return $$0.a(cut.qR) && this.o_() && this.bS() ? false : super.j($$0);
   }

   @Override
   public boolean k(cuq $$0) {
      return $$0.a(cut.rg) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      ayw $$4 = $$0.E_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      this.a_($$4.i() < 0.55F * $$5);
      if ($$3 == null) {
         $$3 = new ckw.b(a($$4), true);
      }

      if ($$3 instanceof ckw.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<cfj> $$7 = $$0.a(cfj.class, this.cK().c(5.0, 3.0, 5.0), bsw.c);
                  if (!$$7.isEmpty()) {
                     cfj $$8 = $$7.get(0);
                     $$8.x(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  cfj $$9 = bsx.t.a(this.dO());
                  if ($$9 != null) {
                     $$9.b(this.dt(), this.dv(), this.dz(), this.dE(), 0.0F);
                     $$9.a($$0, $$1, btr.g, null);
                     $$9.x(true);
                     this.n($$9);
                     $$0.b($$9);
                  }
               }
            }
         }

         this.y(this.x() && $$4.i() < $$5 * 0.1F);
         this.a($$4, $$1);
         this.a($$0, $$4, $$1);
      }

      if (this.a(bsy.f).e()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(bsy.f, new cuq($$4.i() < 0.1F ? dga.ef : dga.ee));
            this.bX[bsy.f.b()] = 0.0F;
         }
      }

      this.H($$5);
      return $$3;
   }

   public static boolean a(ayw $$0) {
      return $$0.i() < 0.05F;
   }

   protected void H(float $$0) {
      this.gt();
      this.f(buw.p).c(new buu(bN, this.ah.j() * 0.05F, buu.a.a));
      double $$1 = this.ah.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.f(buw.m).c(new buu(cf, $$1, buu.a.c));
      }

      if (this.ah.i() < $$0 * 0.05F) {
         this.f(buw.A).c(new buu(ce, this.ah.j() * 0.25 + 0.5, buu.a.a));
         this.f(buw.s).c(new buu(ce, this.ah.j() * 3.0 + 1.0, buu.a.c));
         this.y(this.x());
      }
   }

   protected void gt() {
      this.f(buw.A).a(this.ah.j() * 0.1F);
   }

   @Override
   protected void a(aqu $$0, brk $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cjp $$4 && $$4.gl()) {
         cuq $$5 = this.gl();
         if (!$$5.e()) {
            $$4.gm();
            this.b($$5);
         }
      }
   }

   protected cuq gl() {
      return new cuq(cut.uo);
   }

   class a extends cbo {
      a(final btw $$0, final double $$1, final int $$2) {
         super(dga.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(dcx $$0, jd $$1) {
         $$0.a(null, $$1, avp.Dz, avq.f, 0.5F, 0.9F + ckw.this.ah.i() * 0.2F);
      }

      @Override
      public void a(dcw $$0, jd $$1) {
         $$0.a(null, $$1, avp.Ai, avq.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
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
