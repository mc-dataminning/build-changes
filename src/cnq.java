import com.google.common.annotations.VisibleForTesting;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cnq extends cmx {
   private static final alz a = alz.b("baby");
   private static final bxm b = new bxm(a, 0.5, bxm.a.b);
   private static final alz c = alz.b("reinforcement_caller_charge");
   private static final bxm cc = new bxm(alz.b("reinforcement_callee_charge"), -0.05F, bxm.a.a);
   private static final alz cd = alz.b("leader_zombie_bonus");
   private static final alz ce = alz.b("zombie_random_spawn_bonus");
   private static final alc<Boolean> cf = alg.a(cnq.class, ale.k);
   private static final alc<Integer> cg = alg.a(cnq.class, ale.b);
   private static final alc<Boolean> ch = alg.a(cnq.class, ale.k);
   public static final float d = 0.05F;
   public static final int bZ = 50;
   public static final int ca = 40;
   public static final int cb = 7;
   private static final bvn ci = bvr.bO.n().a(0.5F).b(0.93F);
   private static final float cj = 0.1F;
   private static final Predicate<btg> ck = $$0 -> $$0 == btg.d;
   private final cco cl = new cco(this, ck);
   private boolean cm;
   private int cn;
   private int co;

   public cnq(bvr<? extends cnq> $$0, dhi $$1) {
      super($$0, $$1);
   }

   public cnq(dhi $$0) {
      this(bvr.bO, $$0);
   }

   @Override
   protected void B() {
      this.bT.a(4, new cnq.a(this, 1.0, 3));
      this.bT.a(8, new cdm(this, cpx.class, 8.0F));
      this.bT.a(8, new cdz(this));
      this.p();
   }

   protected void p() {
      this.bT.a(2, new cet(this, 1.0, false));
      this.bT.a(6, new cdq(this, 1.0, true, 4, this::gv));
      this.bT.a(7, new cer(this, 1.0));
      this.bU.a(1, new cew(this).a(cns.class));
      this.bU.a(2, new cex<>(this, cpx.class, true));
      this.bU.a(3, new cex<>(this, cpe.class, false));
      this.bU.a(3, new cex<>(this, cij.class, true));
      this.bU.a(5, new cex<>(this, ciy.class, 10, true, false, ciy.bZ));
   }

   public static bxn.a gr() {
      return cmx.gt().a(bxo.m, 35.0).a(bxo.v, 0.23F).a(bxo.c, 3.0).a(bxo.a, 2.0).a(bxo.A);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(cf, false);
      $$0.a(cg, 0);
      $$0.a(ch, false);
   }

   public boolean gu() {
      return this.au().a(ch);
   }

   public boolean gv() {
      return this.cm;
   }

   public void y(boolean $$0) {
      if (chc.a(this)) {
         if (this.cm != $$0) {
            this.cm = $$0;
            ((cfr)this.L()).b($$0);
            if ($$0) {
               this.bT.a(1, this.cl);
            } else {
               this.bT.a(this.cl);
            }
         }
      } else if (this.cm) {
         this.bT.a(this.cl);
         this.cm = false;
      }
   }

   @Override
   public boolean e_() {
      return this.au().a(cf);
   }

   @Override
   protected int e(ash $$0) {
      if (this.e_()) {
         this.bO = (int)((double)this.bO * 2.5);
      }

      return super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(cf, $$0);
      if (this.dW() != null && !this.dW().C) {
         bxk $$1 = this.g(bxo.v);
         $$1.c(a);
         if ($$0) {
            $$1.b(b);
         }
      }
   }

   @Override
   public void a(alc<?> $$0) {
      if (cf.equals($$0)) {
         this.m_();
      }

      super.a($$0);
   }

   protected boolean gp() {
      return true;
   }

   @Override
   public void h() {
      if (!this.dW().C && this.bL() && !this.gb()) {
         if (this.gu()) {
            this.co--;
            if (this.co < 0) {
               this.ai_();
            }
         } else if (this.gp()) {
            if (this.a(aya.a)) {
               this.cn++;
               if (this.cn >= 600) {
                  this.r(300);
               }
            } else {
               this.cn = -1;
            }
         }
      }

      super.h();
   }

   @Override
   public void d_() {
      if (this.bL()) {
         boolean $$0 = this.aj_() && this.gg();
         if ($$0) {
            cxp $$1 = this.a(bvs.f);
            if (!$$1.f()) {
               if ($$1.m()) {
                  cxl $$2 = $$1.h();
                  $$1.b($$1.o() + this.ae.a(2));
                  if ($$1.o() >= $$1.p()) {
                     this.a($$2, bvs.f);
                     this.a(bvs.f, cxp.j);
                  }
               }

               $$0 = false;
            }

            if ($$0) {
               this.d(8.0F);
            }
         }
      }

      super.d_();
   }

   private void r(int $$0) {
      this.co = $$0;
      this.au().a(ch, true);
   }

   protected void ai_() {
      this.b(bvr.L);
      if (!this.bb()) {
         this.dW().a(null, 1040, this.dw(), 0);
      }
   }

   protected void b(bvr<? extends cnq> $$0) {
      this.a($$0, bvf.a(this, true, true), $$0x -> $$0x.J($$0x.dW().d_($$0x.dw()).d()));
   }

   @VisibleForTesting
   public boolean a(ash $$0, cpj $$1) {
      cnr $$2 = $$1.a(bvr.bQ, bvf.a($$1, true, true), $$2x -> {
         $$2x.a($$0, $$0.d_($$2x.dw()), bvq.i, new cnq.b(false, true));
         $$2x.a($$1.gy());
         $$2x.a($$1.gI().a(vl.a));
         $$2x.a($$1.gq().a());
         $$2x.s($$1.x());
         if (!this.bb()) {
            $$0.a(null, 1026, this.dw(), 0);
         }
      });
      return $$2 != null;
   }

   protected boolean aj_() {
      return true;
   }

   @Override
   public boolean a(ash $$0, bua $$1, float $$2) {
      if (!super.a($$0, $$1, $$2)) {
         return false;
      } else {
         bwg $$3 = this.O_();
         if ($$3 == null && $$1.d() instanceof bwg) {
            $$3 = (bwg)$$1.d();
         }

         if ($$3 != null && $$0.al() == btg.d && (double)this.ae.i() < this.h(bxo.A) && $$0.N().b(dhe.e)) {
            int $$4 = bae.a(this.dB());
            int $$5 = bae.a(this.dD());
            int $$6 = bae.a(this.dH());
            bvr<? extends cnq> $$7 = this.aq();
            cnq $$8 = $$7.a($$0, bvq.j);
            if ($$8 == null) {
               return true;
            }

            for (int $$9 = 0; $$9 < 50; $$9++) {
               int $$10 = $$4 + bae.a(this.ae, 7, 40) * bae.a(this.ae, -1, 1);
               int $$11 = $$5 + bae.a(this.ae, 7, 40) * bae.a(this.ae, -1, 1);
               int $$12 = $$6 + bae.a(this.ae, 7, 40) * bae.a(this.ae, -1, 1);
               jh $$13 = new jh($$10, $$11, $$12);
               if (bxc.a($$7, $$0, $$13) && bxc.a($$7, $$0, bvq.j, $$13, $$0.A)) {
                  $$8.a_((double)$$10, (double)$$11, (double)$$12);
                  if (!$$0.a((double)$$10, (double)$$11, (double)$$12, 7.0) && $$0.f($$8) && $$0.g($$8) && ($$8.x() || !$$0.d($$8.cR()))) {
                     $$8.h($$3);
                     $$8.a($$0, $$0.d_($$8.dw()), bvq.j, null);
                     $$0.a_($$8);
                     bxk $$14 = this.g(bxo.A);
                     bxm $$15 = $$14.a(c);
                     double $$16 = $$15 != null ? $$15.c() : 0.0;
                     $$14.c(c);
                     $$14.d(new bxm(c, $$16 - 0.05, bxm.a.a));
                     $$8.g(bxo.A).d(cc);
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean c(ash $$0, bvk $$1) {
      boolean $$2 = super.c($$0, $$1);
      if ($$2) {
         float $$3 = this.dW().d_(this.dw()).b();
         if (this.eZ().f() && this.bY() && this.ae.i() < $$3 * 0.3F) {
            $$1.d((float)(2 * (int)$$3));
         }
      }

      return $$2;
   }

   @Override
   protected axe u() {
      return axf.DS;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.Ec;
   }

   @Override
   protected axe o_() {
      return axf.DX;
   }

   protected axe t() {
      return axf.Ei;
   }

   @Override
   protected void b(jh $$0, dxv $$1) {
      this.a(this.t(), 0.15F, 1.0F);
   }

   @Override
   public bvr<? extends cnq> aq() {
      return (bvr<? extends cnq>)super.aq();
   }

   protected boolean x() {
      return false;
   }

   @Override
   protected void a(bam $$0, bth $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dW().al() == btg.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bvs.a, new cxp(cxt.px));
         } else {
            this.a(bvs.a, new cxp(cxt.py));
         }
      }
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.e_());
      $$0.a("CanBreakDoors", this.gv());
      $$0.a("InWaterTime", this.bj() ? this.cn : -1);
      $$0.a("DrownedConversionTime", this.gu() ? this.co : -1);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CanBreakDoors"));
      this.cn = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.r($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(ash $$0, bwg $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.al() == btg.c || $$0.al() == btg.d) && $$1 instanceof cpj $$3) {
         if ($$0.al() != btg.d && this.ae.h()) {
            return $$2;
         }

         if (this.a($$0, $$3)) {
            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public bvn e(bws $$0) {
      return this.e_() ? ci : super.e($$0);
   }

   @Override
   public boolean g(cxp $$0) {
      return $$0.a(cxt.rp) && this.e_() && this.bZ() ? false : super.g($$0);
   }

   @Override
   public boolean c(ash $$0, cxp $$1) {
      return $$1.a(cxt.rU) ? false : super.c($$0, $$1);
   }

   @Nullable
   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      bam $$4 = $$0.H_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      if ($$2 != bvq.i) {
         this.a_($$4.i() < 0.55F * $$5);
      }

      if ($$3 == null) {
         $$3 = new cnq.b(a($$4), true);
      }

      if ($$3 instanceof cnq.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<cic> $$7 = $$0.a(cic.class, this.cR().c(5.0, 3.0, 5.0), bvp.c);
                  if (!$$7.isEmpty()) {
                     cic $$8 = $$7.get(0);
                     $$8.x(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  cic $$9 = bvr.z.a(this.dW(), bvq.g);
                  if ($$9 != null) {
                     $$9.b(this.dB(), this.dD(), this.dH(), this.dM(), 0.0F);
                     $$9.a($$0, $$1, bvq.g, null);
                     $$9.x(true);
                     this.n($$9);
                     $$0.b($$9);
                  }
               }
            }
         }

         this.y($$4.i() < $$5 * 0.1F);
         if ($$2 != bvq.i) {
            this.a($$4, $$1);
            this.a($$0, $$4, $$1);
         }
      }

      if (this.a(bvs.f).f()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(bvs.f, new cxp($$4.i() < 0.1F ? dko.es : dko.er));
            this.bW[bvs.f.b()] = 0.0F;
         }
      }

      this.J($$5);
      return $$3;
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.cn = $$0;
   }

   @VisibleForTesting
   public void c(int $$0) {
      this.co = $$0;
   }

   public static boolean a(bam $$0) {
      return $$0.i() < 0.05F;
   }

   protected void J(float $$0) {
      this.gw();
      this.g(bxo.p).c(new bxm(bM, this.ae.j() * 0.05F, bxm.a.a));
      double $$1 = this.ae.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.g(bxo.m).c(new bxm(ce, $$1, bxm.a.c));
      }

      if (this.ae.i() < $$0 * 0.05F) {
         this.g(bxo.A).c(new bxm(cd, this.ae.j() * 0.25 + 0.5, bxm.a.a));
         this.g(bxo.s).c(new bxm(cd, this.ae.j() * 3.0 + 1.0, bxm.a.c));
         this.y(true);
      }
   }

   protected void gw() {
      this.g(bxo.A).a(this.ae.j() * 0.1F);
   }

   @Override
   protected void a(ash $$0, bua $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cmj $$4 && $$4.gp()) {
         cxp $$5 = this.go();
         if (!$$5.f()) {
            $$4.gq();
            this.a($$0, $$5);
         }
      }
   }

   protected cxp go() {
      return new cxp(cxt.ve);
   }

   class a extends ceg {
      a(final bwo $$0, final double $$1, final int $$2) {
         super(dko.mA, $$0, $$1, $$2);
      }

      @Override
      public void a(dhj $$0, jh $$1) {
         $$0.a(null, $$1, axf.DY, axg.f, 0.5F, 0.9F + cnq.this.ae.i() * 0.2F);
      }

      @Override
      public void a(dhi $$0, jh $$1) {
         $$0.a(null, $$1, axf.AH, axg.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bwz {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
