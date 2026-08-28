import com.google.common.annotations.VisibleForTesting;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cqd extends cpk {
   private static final alr a = alr.b("baby");
   private static final bzj b = new bzj(a, 0.5, bzj.a.b);
   private static final alr c = alr.b("reinforcement_caller_charge");
   private static final bzj bJ = new bzj(alr.b("reinforcement_callee_charge"), -0.05F, bzj.a.a);
   private static final alr bK = alr.b("leader_zombie_bonus");
   private static final alr bL = alr.b("zombie_random_spawn_bonus");
   private static final aku<Boolean> bM = aky.a(cqd.class, akw.k);
   private static final aku<Integer> bN = aky.a(cqd.class, akw.b);
   private static final aku<Boolean> bO = aky.a(cqd.class, akw.k);
   public static final float d = 0.05F;
   public static final int e = 50;
   public static final int f = 40;
   public static final int bI = 7;
   private static final int bP = -1;
   private static final bxh bQ = bxn.bP.n().a(0.5F).b(0.93F);
   private static final float bR = 0.1F;
   private static final Predicate<buz> bS = $$0 -> $$0 == buz.d;
   private static final boolean bT = false;
   private static final boolean bU = false;
   private static final int bV = 0;
   private final cel bW = new cel(this, bS);
   private boolean bX = false;
   private int bY = 0;
   private int bZ;

   public cqd(bxn<? extends cqd> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public cqd(dkj $$0) {
      this(bxn.bP, $$0);
   }

   @Override
   protected void C() {
      this.bF.a(4, new cqd.a(this, 1.0, 3));
      this.bF.a(8, new cfj(this, csi.class, 8.0F));
      this.bF.a(8, new cfw(this));
      this.p();
   }

   protected void p() {
      this.bF.a(2, new cgq(this, 1.0, false));
      this.bF.a(6, new cfn(this, 1.0, true, 4, this::gC));
      this.bF.a(7, new cgo(this, 1.0));
      this.bG.a(1, new cgt(this).a(cqf.class));
      this.bG.a(2, new cgu<>(this, csi.class, true));
      this.bG.a(3, new cgu<>(this, crp.class, false));
      this.bG.a(3, new cgu<>(this, ckl.class, true));
      this.bG.a(5, new cgu<>(this, clc.class, 10, true, false, clc.bI));
   }

   public static bzk.a gy() {
      return cpk.gA().a(bzl.m, 35.0).a(bzl.v, 0.23F).a(bzl.c, 3.0).a(bzl.a, 2.0).a(bzl.A);
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(bM, false);
      $$0.a(bN, 0);
      $$0.a(bO, false);
   }

   public boolean gB() {
      return this.ar().a(bO);
   }

   public boolean gC() {
      return this.bX;
   }

   public void x(boolean $$0) {
      if (ciz.a(this)) {
         if (this.bX != $$0) {
            this.bX = $$0;
            ((cho)this.N()).b($$0);
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
   public boolean e_() {
      return this.ar().a(bM);
   }

   @Override
   protected int e(asb $$0) {
      if (this.e_()) {
         this.bA = (int)((double)this.bA * 2.5);
      }

      return super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.ar().a(bM, $$0);
      if (this.dV() != null && !this.dV().C) {
         bzh $$1 = this.g(bzl.v);
         $$1.c(a);
         if ($$0) {
            $$1.b(b);
         }
      }
   }

   @Override
   public void a(aku<?> $$0) {
      if (bM.equals($$0)) {
         this.h_();
      }

      super.a($$0);
   }

   protected boolean gw() {
      return true;
   }

   @Override
   public void g() {
      if (!this.dV().C && this.bJ() && !this.gj()) {
         if (this.gB()) {
            this.bZ--;
            if (this.bZ < 0) {
               this.ad_();
            }
         } else if (this.gw()) {
            if (this.a(axs.a)) {
               this.bY++;
               if (this.bY >= 600) {
                  this.r(300);
               }
            } else {
               this.bY = -1;
            }
         }
      }

      super.g();
   }

   @Override
   public void d_() {
      if (this.bJ()) {
         boolean $$0 = this.ae_() && this.go();
         if ($$0) {
            dak $$1 = this.a(bxo.f);
            if (!$$1.f()) {
               if ($$1.m()) {
                  dag $$2 = $$1.h();
                  $$1.b($$1.o() + this.ae.a(2));
                  if ($$1.o() >= $$1.p()) {
                     this.a($$2, bxo.f);
                     this.a(bxo.f, dak.l);
                  }
               }

               $$0 = false;
            }

            if ($$0) {
               this.e(8.0F);
            }
         }
      }

      super.d_();
   }

   private void r(int $$0) {
      this.bZ = $$0;
      this.ar().a(bO, true);
   }

   protected void ad_() {
      this.b(bxn.L);
      if (!this.ba()) {
         this.dV().a(null, 1040, this.dv(), 0);
      }
   }

   protected void b(bxn<? extends cqd> $$0) {
      this.a($$0, bwy.a(this, true, true), $$0x -> $$0x.J($$0x.dV().d_($$0x.dv()).d()));
   }

   @VisibleForTesting
   public boolean a(asb $$0, cru $$1) {
      cqe $$2 = $$1.a(bxn.bR, bwy.a($$1, true, true), $$2x -> {
         $$2x.a($$0, $$0.d_($$2x.dv()), bxm.i, new cqd.b(false, true));
         $$2x.a($$1.gF());
         $$2x.a($$1.gP().d());
         $$2x.a($$1.gw().a());
         $$2x.s($$1.p());
         if (!this.ba()) {
            $$0.a(null, 1026, this.dv(), 0);
         }
      });
      return $$2 != null;
   }

   protected boolean ae_() {
      return true;
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      if (!super.a($$0, $$1, $$2)) {
         return false;
      } else {
         byf $$3 = this.e();
         if ($$3 == null && $$1.d() instanceof byf) {
            $$3 = (byf)$$1.d();
         }

         if ($$3 != null && $$0.an() == buz.d && (double)this.ae.i() < this.h(bzl.A) && $$0.O().c(dkf.f)) {
            int $$4 = azz.a(this.dA());
            int $$5 = azz.a(this.dC());
            int $$6 = azz.a(this.dG());
            bxn<? extends cqd> $$7 = this.an();
            cqd $$8 = $$7.a($$0, bxm.j);
            if ($$8 == null) {
               return true;
            }

            for (int $$9 = 0; $$9 < 50; $$9++) {
               int $$10 = $$4 + azz.a(this.ae, 7, 40) * azz.a(this.ae, -1, 1);
               int $$11 = $$5 + azz.a(this.ae, 7, 40) * azz.a(this.ae, -1, 1);
               int $$12 = $$6 + azz.a(this.ae, 7, 40) * azz.a(this.ae, -1, 1);
               iw $$13 = new iw($$10, $$11, $$12);
               if (bza.a($$7, $$0, $$13) && bza.a($$7, $$0, bxm.j, $$13, $$0.A)) {
                  $$8.a_((double)$$10, (double)$$11, (double)$$12);
                  if (!$$0.a((double)$$10, (double)$$11, (double)$$12, 7.0) && $$0.f($$8) && $$0.g($$8) && ($$8.gu() || !$$0.d($$8.cR()))) {
                     $$8.g($$3);
                     $$8.a($$0, $$0.d_($$8.dv()), bxm.j, null);
                     $$0.a_($$8);
                     bzh $$14 = this.g(bzl.A);
                     bzj $$15 = $$14.a(c);
                     double $$16 = $$15 != null ? $$15.b() : 0.0;
                     $$14.c(c);
                     $$14.d(new bzj(c, $$16 - 0.05, bzj.a.a));
                     $$8.g(bzl.A).d(bJ);
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean c(asb $$0, bxe $$1) {
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
   protected awx s() {
      return awy.Er;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.EB;
   }

   @Override
   protected awx j_() {
      return awy.Ew;
   }

   protected awx u() {
      return awy.EH;
   }

   @Override
   protected void b(iw $$0, ebq $$1) {
      this.a(this.u(), 0.15F, 1.0F);
   }

   @Override
   public bxn<? extends cqd> an() {
      return (bxn<? extends cqd>)super.an();
   }

   protected boolean gu() {
      return false;
   }

   @Override
   protected void a(bai $$0, bva $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dV().an() == buz.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bxo.a, new dak(dao.pP));
         } else {
            this.a(bxo.a, new dak(dao.pQ));
         }
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.e_());
      $$0.a("CanBreakDoors", this.gC());
      $$0.a("InWaterTime", this.bi() ? this.bY : -1);
      $$0.a("DrownedConversionTime", this.gB() ? this.bZ : -1);
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
   public boolean a(asb $$0, byf $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.an() == buz.c || $$0.an() == buz.d) && $$1 instanceof cru $$3) {
         if ($$0.an() != buz.d && this.ae.h()) {
            return $$2;
         }

         if (this.a($$0, $$3)) {
            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public bxh e(byr $$0) {
      return this.e_() ? bQ : super.e($$0);
   }

   @Override
   public boolean g(dak $$0) {
      return $$0.a(axv.aa) && this.e_() && this.bY() ? false : super.g($$0);
   }

   @Override
   public boolean c(asb $$0, dak $$1) {
      return $$1.a(dao.so) ? false : super.c($$0, $$1);
   }

   @Nullable
   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      bai $$4 = $$0.G_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      if ($$2 != bxm.i) {
         this.a_($$4.i() < 0.55F * $$5);
      }

      if ($$3 == null) {
         $$3 = new cqd.b(a($$4), true);
      }

      if ($$3 instanceof cqd.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<ckb> $$7 = $$0.a(ckb.class, this.cR().c(5.0, 3.0, 5.0), bxl.c);
                  if (!$$7.isEmpty()) {
                     ckb $$8 = $$7.get(0);
                     $$8.w(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  ckb $$9 = bxn.A.a(this.dV(), bxm.g);
                  if ($$9 != null) {
                     $$9.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
                     $$9.a($$0, $$1, bxm.g, null);
                     $$9.w(true);
                     this.n($$9);
                     $$0.b($$9);
                  }
               }
            }
         }

         this.x($$4.i() < $$5 * 0.1F);
         if ($$2 != bxm.i) {
            this.a($$4, $$1);
            this.a($$0, $$4, $$1);
         }
      }

      if (this.a(bxo.f).f()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(bxo.f, new dak($$4.i() < 0.1F ? dnq.ew : dnq.ev));
            this.a(bxo.f, 0.0F);
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

   public static boolean a(bai $$0) {
      return $$0.i() < 0.05F;
   }

   protected void J(float $$0) {
      this.gD();
      this.g(bzl.p).c(new bzj(by, this.ae.j() * 0.05F, bzj.a.a));
      double $$1 = this.ae.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.g(bzl.m).c(new bzj(bL, $$1, bzj.a.c));
      }

      if (this.ae.i() < $$0 * 0.05F) {
         this.g(bzl.A).c(new bzj(bK, this.ae.j() * 0.25 + 0.5, bzj.a.a));
         this.g(bzl.s).c(new bzj(bK, this.ae.j() * 3.0 + 1.0, bzj.a.c));
         this.x(true);
      }
   }

   protected void gD() {
      this.g(bzl.A).a(this.ae.j() * 0.1F);
   }

   @Override
   protected void a(asb $$0, bvt $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cow $$4 && $$4.gw()) {
         dak $$5 = this.gv();
         if (!$$5.f()) {
            $$4.gx();
            this.a($$0, $$5);
         }
      }
   }

   protected dak gv() {
      return new dak(dao.vy);
   }

   class a extends cgd {
      a(final byn $$0, final double $$1, final int $$2) {
         super(dnq.mL, $$0, $$1, $$2);
      }

      @Override
      public void a(dkk $$0, iw $$1) {
         $$0.a(null, $$1, awy.Ex, awz.f, 0.5F, 0.9F + cqd.this.ae.i() * 0.2F);
      }

      @Override
      public void a(dkj $$0, iw $$1) {
         $$0.a(null, $$1, awy.Bm, awz.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements byx {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
