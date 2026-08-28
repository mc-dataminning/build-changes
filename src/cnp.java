import com.google.common.annotations.VisibleForTesting;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cnp extends cmw {
   private static final alz a = alz.b("baby");
   private static final bxl b = new bxl(a, 0.5, bxl.a.b);
   private static final alz c = alz.b("reinforcement_caller_charge");
   private static final bxl cc = new bxl(alz.b("reinforcement_callee_charge"), -0.05F, bxl.a.a);
   private static final alz cd = alz.b("leader_zombie_bonus");
   private static final alz ce = alz.b("zombie_random_spawn_bonus");
   private static final alc<Boolean> cf = alg.a(cnp.class, ale.k);
   private static final alc<Integer> cg = alg.a(cnp.class, ale.b);
   private static final alc<Boolean> ch = alg.a(cnp.class, ale.k);
   public static final float d = 0.05F;
   public static final int bZ = 50;
   public static final int ca = 40;
   public static final int cb = 7;
   private static final bvm ci = bvq.bO.n().a(0.5F).b(0.93F);
   private static final float cj = 0.1F;
   private static final Predicate<btf> ck = $$0 -> $$0 == btf.d;
   private final ccn cl = new ccn(this, ck);
   private boolean cm;
   private int cn;
   private int co;

   public cnp(bvq<? extends cnp> $$0, dhh $$1) {
      super($$0, $$1);
   }

   public cnp(dhh $$0) {
      this(bvq.bO, $$0);
   }

   @Override
   protected void B() {
      this.bT.a(4, new cnp.a(this, 1.0, 3));
      this.bT.a(8, new cdl(this, cpw.class, 8.0F));
      this.bT.a(8, new cdy(this));
      this.p();
   }

   protected void p() {
      this.bT.a(2, new ces(this, 1.0, false));
      this.bT.a(6, new cdp(this, 1.0, true, 4, this::gt));
      this.bT.a(7, new ceq(this, 1.0));
      this.bU.a(1, new cev(this).a(cnr.class));
      this.bU.a(2, new cew<>(this, cpw.class, true));
      this.bU.a(3, new cew<>(this, cpd.class, false));
      this.bU.a(3, new cew<>(this, cii.class, true));
      this.bU.a(5, new cew<>(this, cix.class, 10, true, false, cix.bZ));
   }

   public static bxm.a gp() {
      return cmw.gr().a(bxn.m, 35.0).a(bxn.v, 0.23F).a(bxn.c, 3.0).a(bxn.a, 2.0).a(bxn.A);
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
      if (chb.a(this)) {
         if (this.cm != $$0) {
            this.cm = $$0;
            ((cfq)this.L()).b($$0);
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
         bxj $$1 = this.g(bxn.v);
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
            cxo $$1 = this.a(bvr.f);
            if (!$$1.f()) {
               if ($$1.m()) {
                  cxk $$2 = $$1.h();
                  $$1.b($$1.o() + this.ae.a(2));
                  if ($$1.o() >= $$1.p()) {
                     this.a($$2, bvr.f);
                     this.a(bvr.f, cxo.k);
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
      this.b(bvq.L);
      if (!this.bb()) {
         this.dV().a(null, 1040, this.dv(), 0);
      }
   }

   protected void b(bvq<? extends cnp> $$0) {
      this.a($$0, bve.a(this, true, true), $$0x -> $$0x.J($$0x.dV().d_($$0x.dv()).d()));
   }

   @VisibleForTesting
   public boolean a(ash $$0, cpi $$1) {
      cnq $$2 = $$1.a(bvq.bQ, bve.a($$1, true, true), $$2x -> {
         $$2x.a($$0, $$0.d_($$2x.dv()), bvp.i, new cnp.b(false, true));
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
   public boolean a(ash $$0, btz $$1, float $$2) {
      if (!super.a($$0, $$1, $$2)) {
         return false;
      } else {
         bwf $$3 = this.O_();
         if ($$3 == null && $$1.d() instanceof bwf) {
            $$3 = (bwf)$$1.d();
         }

         if ($$3 != null && $$0.al() == btf.d && (double)this.ae.i() < this.h(bxn.A) && $$0.N().b(dhd.e)) {
            int $$4 = bae.a(this.dA());
            int $$5 = bae.a(this.dC());
            int $$6 = bae.a(this.dG());
            bvq<? extends cnp> $$7 = this.aq();
            cnp $$8 = $$7.a($$0, bvp.j);
            if ($$8 == null) {
               return true;
            }

            for (int $$9 = 0; $$9 < 50; $$9++) {
               int $$10 = $$4 + bae.a(this.ae, 7, 40) * bae.a(this.ae, -1, 1);
               int $$11 = $$5 + bae.a(this.ae, 7, 40) * bae.a(this.ae, -1, 1);
               int $$12 = $$6 + bae.a(this.ae, 7, 40) * bae.a(this.ae, -1, 1);
               jh $$13 = new jh($$10, $$11, $$12);
               if (bxb.a($$7, $$0, $$13) && bxb.a($$7, $$0, bvp.j, $$13, $$0.A)) {
                  $$8.a_((double)$$10, (double)$$11, (double)$$12);
                  if (!$$0.a((double)$$10, (double)$$11, (double)$$12, 7.0) && $$0.f($$8) && $$0.g($$8) && ($$8.x() || !$$0.d($$8.cR()))) {
                     $$8.h($$3);
                     $$8.a($$0, $$0.d_($$8.dv()), bvp.j, null);
                     $$0.a_($$8);
                     bxj $$14 = this.g(bxn.A);
                     bxl $$15 = $$14.a(c);
                     double $$16 = $$15 != null ? $$15.c() : 0.0;
                     $$14.c(c);
                     $$14.d(new bxl(c, $$16 - 0.05, bxl.a.a));
                     $$8.g(bxn.A).d(cc);
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean c(ash $$0, bvj $$1) {
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
      return axf.DS;
   }

   @Override
   protected axe e(btz $$0) {
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
   protected void b(jh $$0, dxu $$1) {
      this.a(this.t(), 0.15F, 1.0F);
   }

   @Override
   public bvq<? extends cnp> aq() {
      return (bvq<? extends cnp>)super.aq();
   }

   protected boolean x() {
      return false;
   }

   @Override
   protected void a(bam $$0, btg $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dV().al() == btf.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bvr.a, new cxo(cxs.px));
         } else {
            this.a(bvr.a, new cxo(cxs.py));
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
   public boolean a(ash $$0, bwf $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.al() == btf.c || $$0.al() == btf.d) && $$1 instanceof cpi $$3) {
         if ($$0.al() != btf.d && this.ae.h()) {
            return $$2;
         }

         if (this.a($$0, $$3)) {
            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public bvm e(bwr $$0) {
      return this.e_() ? ci : super.e($$0);
   }

   @Override
   public boolean g(cxo $$0) {
      return $$0.a(cxs.rp) && this.e_() && this.bZ() ? false : super.g($$0);
   }

   @Override
   public boolean c(ash $$0, cxo $$1) {
      return $$1.a(cxs.rU) ? false : super.c($$0, $$1);
   }

   @Nullable
   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      bam $$4 = $$0.H_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      if ($$2 != bvp.i) {
         this.a_($$4.i() < 0.55F * $$5);
      }

      if ($$3 == null) {
         $$3 = new cnp.b(a($$4), true);
      }

      if ($$3 instanceof cnp.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<cib> $$7 = $$0.a(cib.class, this.cR().c(5.0, 3.0, 5.0), bvo.c);
                  if (!$$7.isEmpty()) {
                     cib $$8 = $$7.get(0);
                     $$8.x(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  cib $$9 = bvq.z.a(this.dV(), bvp.g);
                  if ($$9 != null) {
                     $$9.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
                     $$9.a($$0, $$1, bvp.g, null);
                     $$9.x(true);
                     this.n($$9);
                     $$0.b($$9);
                  }
               }
            }
         }

         this.y($$4.i() < $$5 * 0.1F);
         if ($$2 != bvp.i) {
            this.a($$4, $$1);
            this.a($$0, $$4, $$1);
         }
      }

      if (this.a(bvr.f).f()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(bvr.f, new cxo($$4.i() < 0.1F ? dkn.es : dkn.er));
            this.bW[bvr.f.b()] = 0.0F;
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
      this.g(bxn.p).c(new bxl(bM, this.ae.j() * 0.05F, bxl.a.a));
      double $$1 = this.ae.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.g(bxn.m).c(new bxl(ce, $$1, bxl.a.c));
      }

      if (this.ae.i() < $$0 * 0.05F) {
         this.g(bxn.A).c(new bxl(cd, this.ae.j() * 0.25 + 0.5, bxl.a.a));
         this.g(bxn.s).c(new bxl(cd, this.ae.j() * 3.0 + 1.0, bxl.a.c));
         this.y(true);
      }
   }

   protected void gu() {
      this.g(bxn.A).a(this.ae.j() * 0.1F);
   }

   @Override
   protected void a(ash $$0, btz $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cmi $$4 && $$4.gn()) {
         cxo $$5 = this.gm();
         if (!$$5.f()) {
            $$4.go();
            this.a($$0, $$5);
         }
      }
   }

   protected cxo gm() {
      return new cxo(cxs.ve);
   }

   class a extends cef {
      a(final bwn $$0, final double $$1, final int $$2) {
         super(dkn.mA, $$0, $$1, $$2);
      }

      @Override
      public void a(dhi $$0, jh $$1) {
         $$0.a(null, $$1, axf.DY, axg.f, 0.5F, 0.9F + cnp.this.ae.i() * 0.2F);
      }

      @Override
      public void a(dhh $$0, jh $$1) {
         $$0.a(null, $$1, axf.AH, axg.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bwy {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
