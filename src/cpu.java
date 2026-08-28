import com.google.common.annotations.VisibleForTesting;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cpu extends cpb {
   private static final alk a = alk.b("baby");
   private static final bza b = new bza(a, 0.5, bza.a.b);
   private static final alk c = alk.b("reinforcement_caller_charge");
   private static final bza bJ = new bza(alk.b("reinforcement_callee_charge"), -0.05F, bza.a.a);
   private static final alk bK = alk.b("leader_zombie_bonus");
   private static final alk bL = alk.b("zombie_random_spawn_bonus");
   private static final akn<Boolean> bM = akr.a(cpu.class, akp.k);
   private static final akn<Integer> bN = akr.a(cpu.class, akp.b);
   private static final akn<Boolean> bO = akr.a(cpu.class, akp.k);
   public static final float d = 0.05F;
   public static final int e = 50;
   public static final int f = 40;
   public static final int bI = 7;
   private static final int bP = -1;
   private static final bwy bQ = bxe.bP.n().a(0.5F).b(0.93F);
   private static final float bR = 0.1F;
   private static final Predicate<buq> bS = $$0 -> $$0 == buq.d;
   private static final boolean bT = false;
   private static final boolean bU = false;
   private static final int bV = 0;
   private final cec bW = new cec(this, bS);
   private boolean bX = false;
   private int bY = 0;
   private int bZ;

   public cpu(bxe<? extends cpu> $$0, djz $$1) {
      super($$0, $$1);
   }

   public cpu(djz $$0) {
      this(bxe.bP, $$0);
   }

   @Override
   protected void D() {
      this.bF.a(4, new cpu.a(this, 1.0, 3));
      this.bF.a(8, new cfa(this, crz.class, 8.0F));
      this.bF.a(8, new cfn(this));
      this.m();
   }

   protected void m() {
      this.bF.a(2, new cgh(this, 1.0, false));
      this.bF.a(6, new cfe(this, 1.0, true, 4, this::gz));
      this.bF.a(7, new cgf(this, 1.0));
      this.bG.a(1, new cgk(this).a(cpw.class));
      this.bG.a(2, new cgl<>(this, crz.class, true));
      this.bG.a(3, new cgl<>(this, crg.class, false));
      this.bG.a(3, new cgl<>(this, ckc.class, true));
      this.bG.a(5, new cgl<>(this, ckt.class, 10, true, false, ckt.bI));
   }

   public static bzb.a gv() {
      return cpb.gx().a(bzc.m, 35.0).a(bzc.v, 0.23F).a(bzc.c, 3.0).a(bzc.a, 2.0).a(bzc.A);
   }

   @Override
   protected void a(akr.a $$0) {
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
      if (ciq.a(this)) {
         if (this.bX != $$0) {
            this.bX = $$0;
            ((chf)this.O()).b($$0);
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
   protected int e(aru $$0) {
      if (this.n_()) {
         this.bA = (int)((double)this.bA * 2.5);
      }

      return super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.ar().a(bM, $$0);
      if (this.dV() != null && !this.dV().C) {
         byy $$1 = this.g(bzc.v);
         $$1.c(a);
         if ($$0) {
            $$1.b(b);
         }
      }
   }

   @Override
   public void a(akn<?> $$0) {
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
            if (this.a(axl.a)) {
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
            daa $$1 = this.a(bxf.f);
            if (!$$1.f()) {
               if ($$1.m()) {
                  czw $$2 = $$1.h();
                  $$1.b($$1.o() + this.ae.a(2));
                  if ($$1.o() >= $$1.p()) {
                     this.a($$2, bxf.f);
                     this.a(bxf.f, daa.k);
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
      this.b(bxe.L);
      if (!this.ba()) {
         this.dV().a(null, 1040, this.dv(), 0);
      }
   }

   protected void b(bxe<? extends cpu> $$0) {
      this.a($$0, bwp.a(this, true, true), $$0x -> $$0x.J($$0x.dV().d_($$0x.dv()).d()));
   }

   @VisibleForTesting
   public boolean a(aru $$0, crl $$1) {
      cpv $$2 = $$1.a(bxe.bR, bwp.a($$1, true, true), $$2x -> {
         $$2x.a($$0, $$0.d_($$2x.dv()), bxd.i, new cpu.b(false, true));
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
   public boolean a(aru $$0, bvk $$1, float $$2) {
      if (!super.a($$0, $$1, $$2)) {
         return false;
      } else {
         bxw $$3 = this.f();
         if ($$3 == null && $$1.d() instanceof bxw) {
            $$3 = (bxw)$$1.d();
         }

         if ($$3 != null && $$0.an() == buq.d && (double)this.ae.i() < this.h(bzc.A) && $$0.O().c(djv.f)) {
            int $$4 = azq.a(this.dA());
            int $$5 = azq.a(this.dC());
            int $$6 = azq.a(this.dG());
            bxe<? extends cpu> $$7 = this.an();
            cpu $$8 = $$7.a($$0, bxd.j);
            if ($$8 == null) {
               return true;
            }

            for (int $$9 = 0; $$9 < 50; $$9++) {
               int $$10 = $$4 + azq.a(this.ae, 7, 40) * azq.a(this.ae, -1, 1);
               int $$11 = $$5 + azq.a(this.ae, 7, 40) * azq.a(this.ae, -1, 1);
               int $$12 = $$6 + azq.a(this.ae, 7, 40) * azq.a(this.ae, -1, 1);
               iw $$13 = new iw($$10, $$11, $$12);
               if (byr.a($$7, $$0, $$13) && byr.a($$7, $$0, bxd.j, $$13, $$0.A)) {
                  $$8.a_((double)$$10, (double)$$11, (double)$$12);
                  if (!$$0.a((double)$$10, (double)$$11, (double)$$12, 7.0) && $$0.f($$8) && $$0.g($$8) && ($$8.q() || !$$0.d($$8.cR()))) {
                     $$8.g($$3);
                     $$8.a($$0, $$0.d_($$8.dv()), bxd.j, null);
                     $$0.a_($$8);
                     byy $$14 = this.g(bzc.A);
                     bza $$15 = $$14.a(c);
                     double $$16 = $$15 != null ? $$15.b() : 0.0;
                     $$14.c(c);
                     $$14.d(new bza(c, $$16 - 0.05, bza.a.a));
                     $$8.g(bzc.A).d(bJ);
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean c(aru $$0, bwv $$1) {
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
   protected awq u() {
      return awr.Er;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.EB;
   }

   @Override
   protected awq l_() {
      return awr.Ew;
   }

   protected awq n() {
      return awr.EH;
   }

   @Override
   protected void b(iw $$0, ebg $$1) {
      this.a(this.n(), 0.15F, 1.0F);
   }

   @Override
   public bxe<? extends cpu> an() {
      return (bxe<? extends cpu>)super.an();
   }

   protected boolean q() {
      return false;
   }

   @Override
   protected void a(azz $$0, bur $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dV().an() == buq.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bxf.a, new daa(dae.pP));
         } else {
            this.a(bxf.a, new daa(dae.pQ));
         }
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.n_());
      $$0.a("CanBreakDoors", this.gz());
      $$0.a("InWaterTime", this.bi() ? this.bY : -1);
      $$0.a("DrownedConversionTime", this.gy() ? this.bZ : -1);
   }

   @Override
   public void a(ua $$0) {
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
   public boolean a(aru $$0, bxw $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.an() == buq.c || $$0.an() == buq.d) && $$1 instanceof crl $$3) {
         if ($$0.an() != buq.d && this.ae.h()) {
            return $$2;
         }

         if (this.a($$0, $$3)) {
            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public bwy e(byi $$0) {
      return this.n_() ? bQ : super.e($$0);
   }

   @Override
   public boolean g(daa $$0) {
      return $$0.a(axo.aa) && this.n_() && this.bY() ? false : super.g($$0);
   }

   @Override
   public boolean c(aru $$0, daa $$1) {
      return $$1.a(dae.so) ? false : super.c($$0, $$1);
   }

   @Nullable
   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      azz $$4 = $$0.G_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      if ($$2 != bxd.i) {
         this.a_($$4.i() < 0.55F * $$5);
      }

      if ($$3 == null) {
         $$3 = new cpu.b(a($$4), true);
      }

      if ($$3 instanceof cpu.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<cjs> $$7 = $$0.a(cjs.class, this.cR().c(5.0, 3.0, 5.0), bxc.c);
                  if (!$$7.isEmpty()) {
                     cjs $$8 = $$7.get(0);
                     $$8.w(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  cjs $$9 = bxe.A.a(this.dV(), bxd.g);
                  if ($$9 != null) {
                     $$9.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
                     $$9.a($$0, $$1, bxd.g, null);
                     $$9.w(true);
                     this.n($$9);
                     $$0.b($$9);
                  }
               }
            }
         }

         this.x($$4.i() < $$5 * 0.1F);
         if ($$2 != bxd.i) {
            this.a($$4, $$1);
            this.a($$0, $$4, $$1);
         }
      }

      if (this.a(bxf.f).f()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(bxf.f, new daa($$4.i() < 0.1F ? dng.ew : dng.ev));
            this.a(bxf.f, 0.0F);
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

   public static boolean a(azz $$0) {
      return $$0.i() < 0.05F;
   }

   protected void J(float $$0) {
      this.gA();
      this.g(bzc.p).c(new bza(by, this.ae.j() * 0.05F, bza.a.a));
      double $$1 = this.ae.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.g(bzc.m).c(new bza(bL, $$1, bza.a.c));
      }

      if (this.ae.i() < $$0 * 0.05F) {
         this.g(bzc.A).c(new bza(bK, this.ae.j() * 0.25 + 0.5, bza.a.a));
         this.g(bzc.s).c(new bza(bK, this.ae.j() * 3.0 + 1.0, bza.a.c));
         this.x(true);
      }
   }

   protected void gA() {
      this.g(bzc.A).a(this.ae.j() * 0.1F);
   }

   @Override
   protected void a(aru $$0, bvk $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof com $$4 && $$4.x()) {
         daa $$5 = this.t();
         if (!$$5.f()) {
            $$4.gu();
            this.a($$0, $$5);
         }
      }
   }

   protected daa t() {
      return new daa(dae.vy);
   }

   class a extends cfu {
      a(final bye $$0, final double $$1, final int $$2) {
         super(dng.mL, $$0, $$1, $$2);
      }

      @Override
      public void a(dka $$0, iw $$1) {
         $$0.a(null, $$1, awr.Ex, aws.f, 0.5F, 0.9F + cpu.this.ae.i() * 0.2F);
      }

      @Override
      public void a(djz $$0, iw $$1) {
         $$0.a(null, $$1, awr.Bm, aws.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements byo {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
