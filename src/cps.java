import com.google.common.annotations.VisibleForTesting;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cps extends coz {
   private static final ali a = ali.b("baby");
   private static final byy b = new byy(a, 0.5, byy.a.b);
   private static final ali c = ali.b("reinforcement_caller_charge");
   private static final byy bJ = new byy(ali.b("reinforcement_callee_charge"), -0.05F, byy.a.a);
   private static final ali bK = ali.b("leader_zombie_bonus");
   private static final ali bL = ali.b("zombie_random_spawn_bonus");
   private static final akl<Boolean> bM = akp.a(cps.class, akn.k);
   private static final akl<Integer> bN = akp.a(cps.class, akn.b);
   private static final akl<Boolean> bO = akp.a(cps.class, akn.k);
   public static final float d = 0.05F;
   public static final int e = 50;
   public static final int f = 40;
   public static final int bI = 7;
   private static final int bP = -1;
   private static final bww bQ = bxc.bP.n().a(0.5F).b(0.93F);
   private static final float bR = 0.1F;
   private static final Predicate<buo> bS = $$0 -> $$0 == buo.d;
   private static final boolean bT = false;
   private static final boolean bU = false;
   private static final int bV = 0;
   private final cea bW = new cea(this, bS);
   private boolean bX = false;
   private int bY = 0;
   private int bZ;

   public cps(bxc<? extends cps> $$0, djx $$1) {
      super($$0, $$1);
   }

   public cps(djx $$0) {
      this(bxc.bP, $$0);
   }

   @Override
   protected void D() {
      this.bF.a(4, new cps.a(this, 1.0, 3));
      this.bF.a(8, new cey(this, crx.class, 8.0F));
      this.bF.a(8, new cfl(this));
      this.m();
   }

   protected void m() {
      this.bF.a(2, new cgf(this, 1.0, false));
      this.bF.a(6, new cfc(this, 1.0, true, 4, this::gz));
      this.bF.a(7, new cgd(this, 1.0));
      this.bG.a(1, new cgi(this).a(cpu.class));
      this.bG.a(2, new cgj<>(this, crx.class, true));
      this.bG.a(3, new cgj<>(this, cre.class, false));
      this.bG.a(3, new cgj<>(this, cka.class, true));
      this.bG.a(5, new cgj<>(this, ckr.class, 10, true, false, ckr.bI));
   }

   public static byz.a gv() {
      return coz.gx().a(bza.m, 35.0).a(bza.v, 0.23F).a(bza.c, 3.0).a(bza.a, 2.0).a(bza.A);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bM, false);
      $$0.a(bN, 0);
      $$0.a(bO, false);
   }

   public boolean gy() {
      return this.ar().a(bO);
   }

   public boolean gz() {
      return this.bX;
   }

   public void x(boolean $$0) {
      if (cio.a(this)) {
         if (this.bX != $$0) {
            this.bX = $$0;
            ((chd)this.O()).b($$0);
            if ($$0) {
               this.bF.a(1, this.bW);
            } else {
               this.bF.a(this.bW);
            }
         }
      } else if (this.bX) {
         this.bF.a(this.bW);
         this.bX = false;
      }
   }

   @Override
   public boolean n_() {
      return this.ar().a(bM);
   }

   @Override
   protected int e(ars $$0) {
      if (this.n_()) {
         this.bA = (int)((double)this.bA * 2.5);
      }

      return super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.ar().a(bM, $$0);
      if (this.dV() != null && !this.dV().C) {
         byw $$1 = this.g(bza.v);
         $$1.c(a);
         if ($$0) {
            $$1.b(b);
         }
      }
   }

   @Override
   public void a(akl<?> $$0) {
      if (bM.equals($$0)) {
         this.i_();
      }

      super.a($$0);
   }

   protected boolean x() {
      return true;
   }

   @Override
   public void h() {
      if (!this.dV().C && this.bJ() && !this.gj()) {
         if (this.gy()) {
            this.bZ--;
            if (this.bZ < 0) {
               this.ag_();
            }
         } else if (this.x()) {
            if (this.a(axj.a)) {
               this.bY++;
               if (this.bY >= 600) {
                  this.r(300);
               }
            } else {
               this.bY = -1;
            }
         }
      }

      super.h();
   }

   @Override
   public void k_() {
      if (this.bJ()) {
         boolean $$0 = this.ah_() && this.go();
         if ($$0) {
            czy $$1 = this.a(bxd.f);
            if (!$$1.f()) {
               if ($$1.m()) {
                  czu $$2 = $$1.h();
                  $$1.b($$1.o() + this.ae.a(2));
                  if ($$1.o() >= $$1.p()) {
                     this.a($$2, bxd.f);
                     this.a(bxd.f, czy.k);
                  }
               }

               $$0 = false;
            }

            if ($$0) {
               this.e(8.0F);
            }
         }
      }

      super.k_();
   }

   private void r(int $$0) {
      this.bZ = $$0;
      this.ar().a(bO, true);
   }

   protected void ag_() {
      this.b(bxc.L);
      if (!this.ba()) {
         this.dV().a(null, 1040, this.dv(), 0);
      }
   }

   protected void b(bxc<? extends cps> $$0) {
      this.a($$0, bwn.a(this, true, true), $$0x -> $$0x.J($$0x.dV().d_($$0x.dv()).d()));
   }

   @VisibleForTesting
   public boolean a(ars $$0, crj $$1) {
      cpt $$2 = $$1.a(bxc.bR, bwn.a($$1, true, true), $$2x -> {
         $$2x.a($$0, $$0.d_($$2x.dv()), bxb.i, new cps.b(false, true));
         $$2x.a($$1.gC());
         $$2x.a($$1.gO().d());
         $$2x.a($$1.gv().a());
         $$2x.s($$1.t());
         if (!this.ba()) {
            $$0.a(null, 1026, this.dv(), 0);
         }
      });
      return $$2 != null;
   }

   protected boolean ah_() {
      return true;
   }

   @Override
   public boolean a(ars $$0, bvi $$1, float $$2) {
      if (!super.a($$0, $$1, $$2)) {
         return false;
      } else {
         bxu $$3 = this.f();
         if ($$3 == null && $$1.d() instanceof bxu) {
            $$3 = (bxu)$$1.d();
         }

         if ($$3 != null && $$0.an() == buo.d && (double)this.ae.i() < this.h(bza.A) && $$0.O().c(djt.f)) {
            int $$4 = azo.a(this.dA());
            int $$5 = azo.a(this.dC());
            int $$6 = azo.a(this.dG());
            bxc<? extends cps> $$7 = this.an();
            cps $$8 = $$7.a($$0, bxb.j);
            if ($$8 == null) {
               return true;
            }

            for (int $$9 = 0; $$9 < 50; $$9++) {
               int $$10 = $$4 + azo.a(this.ae, 7, 40) * azo.a(this.ae, -1, 1);
               int $$11 = $$5 + azo.a(this.ae, 7, 40) * azo.a(this.ae, -1, 1);
               int $$12 = $$6 + azo.a(this.ae, 7, 40) * azo.a(this.ae, -1, 1);
               iv $$13 = new iv($$10, $$11, $$12);
               if (byp.a($$7, $$0, $$13) && byp.a($$7, $$0, bxb.j, $$13, $$0.A)) {
                  $$8.a_((double)$$10, (double)$$11, (double)$$12);
                  if (!$$0.a((double)$$10, (double)$$11, (double)$$12, 7.0) && $$0.f($$8) && $$0.g($$8) && ($$8.q() || !$$0.d($$8.cR()))) {
                     $$8.g($$3);
                     $$8.a($$0, $$0.d_($$8.dv()), bxb.j, null);
                     $$0.a_($$8);
                     byw $$14 = this.g(bza.A);
                     byy $$15 = $$14.a(c);
                     double $$16 = $$15 != null ? $$15.b() : 0.0;
                     $$14.c(c);
                     $$14.d(new byy(c, $$16 - 0.05, byy.a.a));
                     $$8.g(bza.A).d(bJ);
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean c(ars $$0, bwt $$1) {
      boolean $$2 = super.c($$0, $$1);
      if ($$2) {
         float $$3 = this.dV().d_(this.dv()).b();
         if (this.fb().f() && this.bX() && this.ae.i() < $$3 * 0.3F) {
            $$1.e((float)(2 * (int)$$3));
         }
      }

      return $$2;
   }

   @Override
   protected awo u() {
      return awp.Er;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.EB;
   }

   @Override
   protected awo l_() {
      return awp.Ew;
   }

   protected awo n() {
      return awp.EH;
   }

   @Override
   protected void b(iv $$0, ebe $$1) {
      this.a(this.n(), 0.15F, 1.0F);
   }

   @Override
   public bxc<? extends cps> an() {
      return (bxc<? extends cps>)super.an();
   }

   protected boolean q() {
      return false;
   }

   @Override
   protected void a(azx $$0, bup $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dV().an() == buo.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bxd.a, new czy(dac.pP));
         } else {
            this.a(bxd.a, new czy(dac.pQ));
         }
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.n_());
      $$0.a("CanBreakDoors", this.gz());
      $$0.a("InWaterTime", this.bi() ? this.bY : -1);
      $$0.a("DrownedConversionTime", this.gy() ? this.bZ : -1);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0.b("IsBaby", false));
      this.x($$0.b("CanBreakDoors", false));
      this.bY = $$0.b("InWaterTime", 0);
      int $$1 = $$0.b("DrownedConversionTime", -1);
      if ($$1 != -1) {
         this.r($$1);
      } else {
         this.ar().a(bO, false);
      }
   }

   @Override
   public boolean a(ars $$0, bxu $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.an() == buo.c || $$0.an() == buo.d) && $$1 instanceof crj $$3) {
         if ($$0.an() != buo.d && this.ae.h()) {
            return $$2;
         }

         if (this.a($$0, $$3)) {
            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public bww e(byg $$0) {
      return this.n_() ? bQ : super.e($$0);
   }

   @Override
   public boolean g(czy $$0) {
      return $$0.a(axm.Z) && this.n_() && this.bY() ? false : super.g($$0);
   }

   @Override
   public boolean c(ars $$0, czy $$1) {
      return $$1.a(dac.so) ? false : super.c($$0, $$1);
   }

   @Nullable
   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      azx $$4 = $$0.G_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      if ($$2 != bxb.i) {
         this.a_($$4.i() < 0.55F * $$5);
      }

      if ($$3 == null) {
         $$3 = new cps.b(a($$4), true);
      }

      if ($$3 instanceof cps.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<cjq> $$7 = $$0.a(cjq.class, this.cR().c(5.0, 3.0, 5.0), bxa.c);
                  if (!$$7.isEmpty()) {
                     cjq $$8 = $$7.get(0);
                     $$8.w(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  cjq $$9 = bxc.A.a(this.dV(), bxb.g);
                  if ($$9 != null) {
                     $$9.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
                     $$9.a($$0, $$1, bxb.g, null);
                     $$9.w(true);
                     this.n($$9);
                     $$0.b($$9);
                  }
               }
            }
         }

         this.x($$4.i() < $$5 * 0.1F);
         if ($$2 != bxb.i) {
            this.a($$4, $$1);
            this.a($$0, $$4, $$1);
         }
      }

      if (this.a(bxd.f).f()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(bxd.f, new czy($$4.i() < 0.1F ? dne.ew : dne.ev));
            this.a(bxd.f, 0.0F);
         }
      }

      this.J($$5);
      return $$3;
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.bY = $$0;
   }

   @VisibleForTesting
   public void c(int $$0) {
      this.bZ = $$0;
   }

   public static boolean a(azx $$0) {
      return $$0.i() < 0.05F;
   }

   protected void J(float $$0) {
      this.gA();
      this.g(bza.p).c(new byy(by, this.ae.j() * 0.05F, byy.a.a));
      double $$1 = this.ae.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.g(bza.m).c(new byy(bL, $$1, byy.a.c));
      }

      if (this.ae.i() < $$0 * 0.05F) {
         this.g(bza.A).c(new byy(bK, this.ae.j() * 0.25 + 0.5, byy.a.a));
         this.g(bza.s).c(new byy(bK, this.ae.j() * 3.0 + 1.0, byy.a.c));
         this.x(true);
      }
   }

   protected void gA() {
      this.g(bza.A).a(this.ae.j() * 0.1F);
   }

   @Override
   protected void a(ars $$0, bvi $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cok $$4 && $$4.x()) {
         czy $$5 = this.t();
         if (!$$5.f()) {
            $$4.gu();
            this.a($$0, $$5);
         }
      }
   }

   protected czy t() {
      return new czy(dac.vy);
   }

   class a extends cfs {
      a(final byc $$0, final double $$1, final int $$2) {
         super(dne.mL, $$0, $$1, $$2);
      }

      @Override
      public void a(djy $$0, iv $$1) {
         $$0.a(null, $$1, awp.Ex, awq.f, 0.5F, 0.9F + cps.this.ae.i() * 0.2F);
      }

      @Override
      public void a(djx $$0, iv $$1) {
         $$0.a(null, $$1, awp.Bm, awq.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bym {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
