import com.google.common.annotations.VisibleForTesting;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cnl extends cms {
   private static final alz a = alz.b("baby");
   private static final bxh b = new bxh(a, 0.5, bxh.a.b);
   private static final alz c = alz.b("reinforcement_caller_charge");
   private static final bxh cc = new bxh(alz.b("reinforcement_callee_charge"), -0.05F, bxh.a.a);
   private static final alz cd = alz.b("leader_zombie_bonus");
   private static final alz ce = alz.b("zombie_random_spawn_bonus");
   private static final alc<Boolean> cf = alg.a(cnl.class, ale.k);
   private static final alc<Integer> cg = alg.a(cnl.class, ale.b);
   private static final alc<Boolean> ch = alg.a(cnl.class, ale.k);
   public static final float d = 0.05F;
   public static final int bZ = 50;
   public static final int ca = 40;
   public static final int cb = 7;
   private static final bvi ci = bvm.bO.n().a(0.5F).b(0.93F);
   private static final float cj = 0.1F;
   private static final Predicate<btb> ck = $$0 -> $$0 == btb.d;
   private final ccj cl = new ccj(this, ck);
   private boolean cm;
   private int cn;
   private int co;

   public cnl(bvm<? extends cnl> $$0, dha $$1) {
      super($$0, $$1);
   }

   public cnl(dha $$0) {
      this(bvm.bO, $$0);
   }

   @Override
   protected void B() {
      this.bT.a(4, new cnl.a(this, 1.0, 3));
      this.bT.a(8, new cdh(this, cps.class, 8.0F));
      this.bT.a(8, new cdu(this));
      this.p();
   }

   protected void p() {
      this.bT.a(2, new ceo(this, 1.0, false));
      this.bT.a(6, new cdl(this, 1.0, true, 4, this::gt));
      this.bT.a(7, new cem(this, 1.0));
      this.bU.a(1, new cer(this).a(cnn.class));
      this.bU.a(2, new ces<>(this, cps.class, true));
      this.bU.a(3, new ces<>(this, coz.class, false));
      this.bU.a(3, new ces<>(this, cie.class, true));
      this.bU.a(5, new ces<>(this, cit.class, 10, true, false, cit.bZ));
   }

   public static bxi.a gp() {
      return cms.gr().a(bxj.m, 35.0).a(bxj.v, 0.23F).a(bxj.c, 3.0).a(bxj.a, 2.0).a(bxj.A);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(cf, false);
      $$0.a(cg, 0);
      $$0.a(ch, false);
   }

   public boolean gs() {
      return this.au().a(ch);
   }

   public boolean gt() {
      return this.cm;
   }

   public void y(boolean $$0) {
      if (cgx.a(this)) {
         if (this.cm != $$0) {
            this.cm = $$0;
            ((cfm)this.L()).b($$0);
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
      if (this.dV() != null && !this.dV().C) {
         bxf $$1 = this.g(bxj.v);
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

   protected boolean gn() {
      return true;
   }

   @Override
   public void h() {
      if (!this.dV().C && this.bL() && !this.fZ()) {
         if (this.gs()) {
            this.co--;
            if (this.co < 0) {
               this.ai_();
            }
         } else if (this.gn()) {
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
         boolean $$0 = this.aj_() && this.ge();
         if ($$0) {
            cxk $$1 = this.a(bvn.f);
            if (!$$1.f()) {
               if ($$1.m()) {
                  cxg $$2 = $$1.h();
                  $$1.b($$1.o() + this.ae.a(2));
                  if ($$1.o() >= $$1.p()) {
                     this.a($$2, bvn.f);
                     this.a(bvn.f, cxk.k);
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
      this.b(bvm.L);
      if (!this.bb()) {
         this.dV().a(null, 1040, this.dv(), 0);
      }
   }

   protected void b(bvm<? extends cnl> $$0) {
      this.a($$0, bva.a(this, true, true), $$0x -> $$0x.J($$0x.dV().d_($$0x.dv()).d()));
   }

   @VisibleForTesting
   public boolean a(ash $$0, cpe $$1) {
      cnm $$2 = $$1.a(bvm.bQ, bva.a($$1, true, true), $$2x -> {
         $$2x.a($$0, $$0.d_($$2x.dv()), bvl.i, new cnl.b(false, true));
         $$2x.a($$1.gw());
         $$2x.a($$1.gG().a(vl.a));
         $$2x.a($$1.go().a());
         $$2x.s($$1.x());
         if (!this.bb()) {
            $$0.a(null, 1026, this.dv(), 0);
         }
      });
      return $$2 != null;
   }

   protected boolean aj_() {
      return true;
   }

   @Override
   public boolean a(ash $$0, btv $$1, float $$2) {
      if (!super.a($$0, $$1, $$2)) {
         return false;
      } else {
         bwb $$3 = this.O_();
         if ($$3 == null && $$1.d() instanceof bwb) {
            $$3 = (bwb)$$1.d();
         }

         if ($$3 != null && $$0.al() == btb.d && (double)this.ae.i() < this.h(bxj.A) && $$0.N().b(dgw.e)) {
            int $$4 = bae.a(this.dA());
            int $$5 = bae.a(this.dC());
            int $$6 = bae.a(this.dG());
            bvm<? extends cnl> $$7 = this.aq();
            cnl $$8 = $$7.a($$0, bvl.j);
            if ($$8 == null) {
               return true;
            }

            for (int $$9 = 0; $$9 < 50; $$9++) {
               int $$10 = $$4 + bae.a(this.ae, 7, 40) * bae.a(this.ae, -1, 1);
               int $$11 = $$5 + bae.a(this.ae, 7, 40) * bae.a(this.ae, -1, 1);
               int $$12 = $$6 + bae.a(this.ae, 7, 40) * bae.a(this.ae, -1, 1);
               jh $$13 = new jh($$10, $$11, $$12);
               if (bwx.a($$7, $$0, $$13) && bwx.a($$7, $$0, bvl.j, $$13, $$0.A)) {
                  $$8.a_((double)$$10, (double)$$11, (double)$$12);
                  if (!$$0.a((double)$$10, (double)$$11, (double)$$12, 7.0) && $$0.f($$8) && $$0.g($$8) && ($$8.x() || !$$0.d($$8.cR()))) {
                     $$8.h($$3);
                     $$8.a($$0, $$0.d_($$8.dv()), bvl.j, null);
                     $$0.a_($$8);
                     bxf $$14 = this.g(bxj.A);
                     bxh $$15 = $$14.a(c);
                     double $$16 = $$15 != null ? $$15.c() : 0.0;
                     $$14.c(c);
                     $$14.d(new bxh(c, $$16 - 0.05, bxh.a.a));
                     $$8.g(bxj.A).d(cc);
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean c(ash $$0, bvf $$1) {
      boolean $$2 = super.c($$0, $$1);
      if ($$2) {
         float $$3 = this.dV().d_(this.dv()).b();
         if (this.eX().f() && this.bY() && this.ae.i() < $$3 * 0.3F) {
            $$1.d((float)(2 * (int)$$3));
         }
      }

      return $$2;
   }

   @Override
   protected axe u() {
      return axf.DR;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.Eb;
   }

   @Override
   protected axe o_() {
      return axf.DW;
   }

   protected axe t() {
      return axf.Eh;
   }

   @Override
   protected void b(jh $$0, dxn $$1) {
      this.a(this.t(), 0.15F, 1.0F);
   }

   @Override
   public bvm<? extends cnl> aq() {
      return (bvm<? extends cnl>)super.aq();
   }

   protected boolean x() {
      return false;
   }

   @Override
   protected void a(bam $$0, btc $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dV().al() == btb.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bvn.a, new cxk(cxo.px));
         } else {
            this.a(bvn.a, new cxk(cxo.py));
         }
      }
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.e_());
      $$0.a("CanBreakDoors", this.gt());
      $$0.a("InWaterTime", this.bj() ? this.cn : -1);
      $$0.a("DrownedConversionTime", this.gs() ? this.co : -1);
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
   public boolean a(ash $$0, bwb $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.al() == btb.c || $$0.al() == btb.d) && $$1 instanceof cpe $$3) {
         if ($$0.al() != btb.d && this.ae.h()) {
            return $$2;
         }

         if (this.a($$0, $$3)) {
            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public bvi e(bwn $$0) {
      return this.e_() ? ci : super.e($$0);
   }

   @Override
   public boolean g(cxk $$0) {
      return $$0.a(cxo.rp) && this.e_() && this.bZ() ? false : super.g($$0);
   }

   @Override
   public boolean c(ash $$0, cxk $$1) {
      return $$1.a(cxo.rU) ? false : super.c($$0, $$1);
   }

   @Nullable
   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      bam $$4 = $$0.H_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      if ($$2 != bvl.i) {
         this.a_($$4.i() < 0.55F * $$5);
      }

      if ($$3 == null) {
         $$3 = new cnl.b(a($$4), true);
      }

      if ($$3 instanceof cnl.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<chx> $$7 = $$0.a(chx.class, this.cR().c(5.0, 3.0, 5.0), bvk.c);
                  if (!$$7.isEmpty()) {
                     chx $$8 = $$7.get(0);
                     $$8.x(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  chx $$9 = bvm.z.a(this.dV(), bvl.g);
                  if ($$9 != null) {
                     $$9.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
                     $$9.a($$0, $$1, bvl.g, null);
                     $$9.x(true);
                     this.n($$9);
                     $$0.b($$9);
                  }
               }
            }
         }

         this.y($$4.i() < $$5 * 0.1F);
         if ($$2 != bvl.i) {
            this.a($$4, $$1);
            this.a($$0, $$4, $$1);
         }
      }

      if (this.a(bvn.f).f()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(bvn.f, new cxk($$4.i() < 0.1F ? dkg.es : dkg.er));
            this.bW[bvn.f.b()] = 0.0F;
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
      this.gu();
      this.g(bxj.p).c(new bxh(bM, this.ae.j() * 0.05F, bxh.a.a));
      double $$1 = this.ae.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.g(bxj.m).c(new bxh(ce, $$1, bxh.a.c));
      }

      if (this.ae.i() < $$0 * 0.05F) {
         this.g(bxj.A).c(new bxh(cd, this.ae.j() * 0.25 + 0.5, bxh.a.a));
         this.g(bxj.s).c(new bxh(cd, this.ae.j() * 3.0 + 1.0, bxh.a.c));
         this.y(true);
      }
   }

   protected void gu() {
      this.g(bxj.A).a(this.ae.j() * 0.1F);
   }

   @Override
   protected void a(ash $$0, btv $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cme $$4 && $$4.gn()) {
         cxk $$5 = this.gm();
         if (!$$5.f()) {
            $$4.go();
            this.a($$0, $$5);
         }
      }
   }

   protected cxk gm() {
      return new cxk(cxo.ve);
   }

   class a extends ceb {
      a(final bwj $$0, final double $$1, final int $$2) {
         super(dkg.mA, $$0, $$1, $$2);
      }

      @Override
      public void a(dhb $$0, jh $$1) {
         $$0.a(null, $$1, axf.DX, axg.f, 0.5F, 0.9F + cnl.this.ae.i() * 0.2F);
      }

      @Override
      public void a(dha $$0, jh $$1) {
         $$0.a(null, $$1, axf.AG, axg.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bwu {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
