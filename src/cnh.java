import com.google.common.annotations.VisibleForTesting;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cnh extends cmo {
   private static final alp a = alp.b("baby");
   private static final bxd b = new bxd(a, 0.5, bxd.a.b);
   private static final alp c = alp.b("reinforcement_caller_charge");
   private static final bxd cc = new bxd(alp.b("reinforcement_callee_charge"), -0.05F, bxd.a.a);
   private static final alp cd = alp.b("leader_zombie_bonus");
   private static final alp ce = alp.b("zombie_random_spawn_bonus");
   private static final aks<Boolean> cf = akw.a(cnh.class, aku.k);
   private static final aks<Integer> cg = akw.a(cnh.class, aku.b);
   private static final aks<Boolean> ch = akw.a(cnh.class, aku.k);
   public static final float d = 0.05F;
   public static final int bZ = 50;
   public static final int ca = 40;
   public static final int cb = 7;
   private static final bve ci = bvi.bO.n().a(0.5F).b(0.93F);
   private static final float cj = 0.1F;
   private static final Predicate<bsx> ck = $$0 -> $$0 == bsx.d;
   private final ccf cl = new ccf(this, ck);
   private boolean cm;
   private int cn;
   private int co;

   public cnh(bvi<? extends cnh> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cnh(dgz $$0) {
      this(bvi.bO, $$0);
   }

   @Override
   protected void B() {
      this.bT.a(4, new cnh.a(this, 1.0, 3));
      this.bT.a(8, new cdd(this, cpo.class, 8.0F));
      this.bT.a(8, new cdq(this));
      this.p();
   }

   protected void p() {
      this.bT.a(2, new cek(this, 1.0, false));
      this.bT.a(6, new cdh(this, 1.0, true, 4, this::gv));
      this.bT.a(7, new cei(this, 1.0));
      this.bU.a(1, new cen(this).a(cnj.class));
      this.bU.a(2, new ceo<>(this, cpo.class, true));
      this.bU.a(3, new ceo<>(this, cov.class, false));
      this.bU.a(3, new ceo<>(this, cia.class, true));
      this.bU.a(5, new ceo<>(this, cip.class, 10, true, false, cip.bZ));
   }

   public static bxe.a gr() {
      return cmo.gt().a(bxf.m, 35.0).a(bxf.v, 0.23F).a(bxf.c, 3.0).a(bxf.a, 2.0).a(bxf.A);
   }

   @Override
   protected void a(akw.a $$0) {
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
      if (cgt.a(this)) {
         if (this.cm != $$0) {
            this.cm = $$0;
            ((cfi)this.L()).b($$0);
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
   protected int e(arx $$0) {
      if (this.e_()) {
         this.bO = (int)((double)this.bO * 2.5);
      }

      return super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(cf, $$0);
      if (this.dW() != null && !this.dW().C) {
         bxb $$1 = this.g(bxf.v);
         $$1.c(a);
         if ($$0) {
            $$1.b(b);
         }
      }
   }

   @Override
   public void a(aks<?> $$0) {
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
            if (this.a(axq.a)) {
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
            cxg $$1 = this.a(bvj.f);
            if (!$$1.f()) {
               if ($$1.m()) {
                  cxc $$2 = $$1.h();
                  $$1.b($$1.o() + this.ae.a(2));
                  if ($$1.o() >= $$1.p()) {
                     this.a($$2, bvj.f);
                     this.a(bvj.f, cxg.j);
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
      this.b(bvi.L);
      if (!this.bb()) {
         this.dW().a(null, 1040, this.dw(), 0);
      }
   }

   protected void b(bvi<? extends cnh> $$0) {
      this.a($$0, buw.a(this, true, true), $$0x -> $$0x.J($$0x.dW().d_($$0x.dw()).d()));
   }

   @VisibleForTesting
   public boolean a(arx $$0, cpa $$1) {
      cni $$2 = $$1.a(bvi.bQ, buw.a($$1, true, true), $$2x -> {
         $$2x.a($$0, $$0.d_($$2x.dw()), bvh.i, new cnh.b(false, true));
         $$2x.a($$1.gy());
         $$2x.a($$1.gI().a(va.a));
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
   public boolean a(arx $$0, btr $$1, float $$2) {
      if (!super.a($$0, $$1, $$2)) {
         return false;
      } else {
         bvx $$3 = this.O_();
         if ($$3 == null && $$1.d() instanceof bvx) {
            $$3 = (bvx)$$1.d();
         }

         if ($$3 != null && $$0.am() == bsx.d && (double)this.ae.i() < this.h(bxf.A) && $$0.O().b(dgv.e)) {
            int $$4 = azu.a(this.dB());
            int $$5 = azu.a(this.dD());
            int $$6 = azu.a(this.dH());
            bvi<? extends cnh> $$7 = this.aq();
            cnh $$8 = $$7.a($$0, bvh.j);
            if ($$8 == null) {
               return true;
            }

            for (int $$9 = 0; $$9 < 50; $$9++) {
               int $$10 = $$4 + azu.a(this.ae, 7, 40) * azu.a(this.ae, -1, 1);
               int $$11 = $$5 + azu.a(this.ae, 7, 40) * azu.a(this.ae, -1, 1);
               int $$12 = $$6 + azu.a(this.ae, 7, 40) * azu.a(this.ae, -1, 1);
               jh $$13 = new jh($$10, $$11, $$12);
               if (bwt.a($$7, $$0, $$13) && bwt.a($$7, $$0, bvh.j, $$13, $$0.A)) {
                  $$8.a_((double)$$10, (double)$$11, (double)$$12);
                  if (!$$0.a((double)$$10, (double)$$11, (double)$$12, 7.0) && $$0.f($$8) && $$0.g($$8) && ($$8.x() || !$$0.d($$8.cR()))) {
                     $$8.h($$3);
                     $$8.a($$0, $$0.d_($$8.dw()), bvh.j, null);
                     $$0.a_($$8);
                     bxb $$14 = this.g(bxf.A);
                     bxd $$15 = $$14.a(c);
                     double $$16 = $$15 != null ? $$15.c() : 0.0;
                     $$14.c(c);
                     $$14.d(new bxd(c, $$16 - 0.05, bxd.a.a));
                     $$8.g(bxf.A).d(cc);
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean c(arx $$0, bvb $$1) {
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
   protected awu u() {
      return awv.Ei;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.Es;
   }

   @Override
   protected awu o_() {
      return awv.En;
   }

   protected awu t() {
      return awv.Ey;
   }

   @Override
   protected void b(jh $$0, dxo $$1) {
      this.a(this.t(), 0.15F, 1.0F);
   }

   @Override
   public bvi<? extends cnh> aq() {
      return (bvi<? extends cnh>)super.aq();
   }

   protected boolean x() {
      return false;
   }

   @Override
   protected void a(bac $$0, bsy $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dW().am() == bsx.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bvj.a, new cxg(cxk.pG));
         } else {
            this.a(bvj.a, new cxg(cxk.pH));
         }
      }
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.e_());
      $$0.a("CanBreakDoors", this.gv());
      $$0.a("InWaterTime", this.bj() ? this.cn : -1);
      $$0.a("DrownedConversionTime", this.gu() ? this.co : -1);
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CanBreakDoors"));
      this.cn = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.r($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(arx $$0, bvx $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.am() == bsx.c || $$0.am() == bsx.d) && $$1 instanceof cpa $$3) {
         if ($$0.am() != bsx.d && this.ae.h()) {
            return $$2;
         }

         if (this.a($$0, $$3)) {
            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public bve e(bwj $$0) {
      return this.e_() ? ci : super.e($$0);
   }

   @Override
   public boolean g(cxg $$0) {
      return $$0.a(cxk.ry) && this.e_() && this.bZ() ? false : super.g($$0);
   }

   @Override
   public boolean c(arx $$0, cxg $$1) {
      return $$1.a(cxk.sd) ? false : super.c($$0, $$1);
   }

   @Nullable
   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      bac $$4 = $$0.H_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      if ($$2 != bvh.i) {
         this.a_($$4.i() < 0.55F * $$5);
      }

      if ($$3 == null) {
         $$3 = new cnh.b(a($$4), true);
      }

      if ($$3 instanceof cnh.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<cht> $$7 = $$0.a(cht.class, this.cR().c(5.0, 3.0, 5.0), bvg.c);
                  if (!$$7.isEmpty()) {
                     cht $$8 = $$7.get(0);
                     $$8.x(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  cht $$9 = bvi.z.a(this.dW(), bvh.g);
                  if ($$9 != null) {
                     $$9.b(this.dB(), this.dD(), this.dH(), this.dM(), 0.0F);
                     $$9.a($$0, $$1, bvh.g, null);
                     $$9.x(true);
                     this.n($$9);
                     $$0.b($$9);
                  }
               }
            }
         }

         this.y($$4.i() < $$5 * 0.1F);
         if ($$2 != bvh.i) {
            this.a($$4, $$1);
            this.a($$0, $$4, $$1);
         }
      }

      if (this.a(bvj.f).f()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(bvj.f, new cxg($$4.i() < 0.1F ? dkf.es : dkf.er));
            this.bW[bvj.f.b()] = 0.0F;
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

   public static boolean a(bac $$0) {
      return $$0.i() < 0.05F;
   }

   protected void J(float $$0) {
      this.gw();
      this.g(bxf.p).c(new bxd(bM, this.ae.j() * 0.05F, bxd.a.a));
      double $$1 = this.ae.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.g(bxf.m).c(new bxd(ce, $$1, bxd.a.c));
      }

      if (this.ae.i() < $$0 * 0.05F) {
         this.g(bxf.A).c(new bxd(cd, this.ae.j() * 0.25 + 0.5, bxd.a.a));
         this.g(bxf.s).c(new bxd(cd, this.ae.j() * 3.0 + 1.0, bxd.a.c));
         this.y(true);
      }
   }

   protected void gw() {
      this.g(bxf.A).a(this.ae.j() * 0.1F);
   }

   @Override
   protected void a(arx $$0, btr $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cma $$4 && $$4.gp()) {
         cxg $$5 = this.go();
         if (!$$5.f()) {
            $$4.gq();
            this.a($$0, $$5);
         }
      }
   }

   protected cxg go() {
      return new cxg(cxk.vn);
   }

   class a extends cdx {
      a(final bwf $$0, final double $$1, final int $$2) {
         super(dkf.mH, $$0, $$1, $$2);
      }

      @Override
      public void a(dha $$0, jh $$1) {
         $$0.a(null, $$1, awv.Eo, aww.f, 0.5F, 0.9F + cnh.this.ae.i() * 0.2F);
      }

      @Override
      public void a(dgz $$0, jh $$1) {
         $$0.a(null, $$1, awv.AX, aww.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bwq {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
