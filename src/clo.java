import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class clo extends ckv {
   private static final alb b = alb.b("baby");
   private static final bvk c = new bvk(b, 0.5, bvk.a.b);
   private static final alb d = alb.b("reinforcement_caller_charge");
   private static final bvk cc = new bvk(alb.b("reinforcement_callee_charge"), -0.05F, bvk.a.a);
   private static final alb cd = alb.b("leader_zombie_bonus");
   private static final alb ce = alb.b("zombie_random_spawn_bonus");
   private static final akg<Boolean> cf = akk.a(clo.class, aki.k);
   private static final akg<Integer> cg = akk.a(clo.class, aki.b);
   private static final akg<Boolean> ch = akk.a(clo.class, aki.k);
   public static final float e = 0.05F;
   public static final int bZ = 50;
   public static final int ca = 40;
   public static final int cb = 7;
   private static final btm ci = btq.bu.n().a(0.5F).b(0.93F);
   private static final float cj = 0.1F;
   private static final Predicate<brh> ck = $$0 -> $$0 == brh.d;
   private final cam cl = new cam(this, ck);
   private boolean cm;
   private int cn;
   private int co;

   public clo(btq<? extends clo> $$0, dds $$1) {
      super($$0, $$1);
   }

   public clo(dds $$0) {
      this(btq.bu, $$0);
   }

   @Override
   protected void D() {
      this.bT.a(4, new clo.a(this, 1.0, 3));
      this.bT.a(8, new cbk(this, cnp.class, 8.0F));
      this.bT.a(8, new cbx(this));
      this.t();
   }

   protected void t() {
      this.bT.a(2, new ccr(this, 1.0, false));
      this.bT.a(6, new cbo(this, 1.0, true, 4, this::gv));
      this.bT.a(7, new ccp(this, 1.0));
      this.bU.a(1, new ccu(this).a(clq.class));
      this.bU.a(2, new ccv<>(this, cnp.class, true));
      this.bU.a(3, new ccv<>(this, cmx.class, false));
      this.bU.a(3, new ccv<>(this, cgh.class, true));
      this.bU.a(5, new ccv<>(this, cgw.class, 10, true, false, cgw.bZ));
   }

   public static bvl.a gr() {
      return ckv.gu().a(bvm.m, 35.0).a(bvm.v, 0.23F).a(bvm.c, 3.0).a(bvm.a, 2.0).a(bvm.A);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cf, false);
      $$0.a(cg, 0);
      $$0.a(ch, false);
   }

   public boolean gs() {
      return this.at().a(ch);
   }

   public boolean gv() {
      return this.cm;
   }

   public void y(boolean $$0) {
      if (cfa.a(this)) {
         if (this.cm != $$0) {
            this.cm = $$0;
            ((cdp)this.P()).b($$0);
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
   public boolean o_() {
      return this.at().a(cf);
   }

   @Override
   protected int ek() {
      if (this.o_()) {
         this.bO = (int)((double)this.bO * 2.5);
      }

      return super.ek();
   }

   @Override
   public void a(boolean $$0) {
      this.at().a(cf, $$0);
      if (this.dS() != null && !this.dS().B) {
         bvi $$1 = this.g(bvm.v);
         $$1.c(b);
         if ($$0) {
            $$1.b(c);
         }
      }
   }

   @Override
   public void a(akg<?> $$0) {
      if (cf.equals($$0)) {
         this.i_();
      }

      super.a($$0);
   }

   protected boolean gp() {
      return true;
   }

   @Override
   public void l() {
      if (!this.dS().B && this.bI() && !this.gd()) {
         if (this.gs()) {
            this.co--;
            if (this.co < 0) {
               this.af_();
            }
         } else if (this.gp()) {
            if (this.a(awy.a)) {
               this.cn++;
               if (this.cn >= 600) {
                  this.b(300);
               }
            } else {
               this.cn = -1;
            }
         }
      }

      super.l();
   }

   @Override
   public void m_() {
      if (this.bI()) {
         boolean $$0 = this.ag_() && this.gi();
         if ($$0) {
            cvl $$1 = this.a(btr.f);
            if (!$$1.f()) {
               if ($$1.m()) {
                  cvg $$2 = $$1.h();
                  $$1.b($$1.o() + this.af.a(2));
                  if ($$1.o() >= $$1.p()) {
                     this.a($$2, btr.f);
                     this.a(btr.f, cvl.k);
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
      this.co = $$0;
      this.at().a(ch, true);
   }

   protected void af_() {
      this.b(btq.B);
      if (!this.ba()) {
         this.dS().a(null, 1040, this.ds(), 0);
      }
   }

   protected void b(btq<? extends clo> $$0) {
      clo $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.J($$1.dS().d_($$1.ds()).d());
         $$1.y(this.gv());
      }
   }

   protected boolean ag_() {
      return true;
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (this.dS() instanceof arg $$2) {
         buf $$4 = this.m();
         if ($$4 == null && $$0.d() instanceof buf) {
            $$4 = (buf)$$0.d();
         }

         if ($$4 != null && this.dS().am() == brh.d && (double)this.af.i() < this.h(bvm.A) && this.dS().ac().b(ddo.e)) {
            int $$5 = azc.a(this.dx());
            int $$6 = azc.a(this.dz());
            int $$7 = azc.a(this.dD());
            btq<? extends clo> $$8 = this.ao();
            clo $$9 = $$8.a(this.dS(), btp.j);
            if ($$9 == null) {
               return true;
            }

            for (int $$10 = 0; $$10 < 50; $$10++) {
               int $$11 = $$5 + azc.a(this.af, 7, 40) * azc.a(this.af, -1, 1);
               int $$12 = $$6 + azc.a(this.af, 7, 40) * azc.a(this.af, -1, 1);
               int $$13 = $$7 + azc.a(this.af, 7, 40) * azc.a(this.af, -1, 1);
               je $$14 = new je($$11, $$12, $$13);
               if (bva.a($$8, this.dS(), $$14) && bva.a($$8, $$2, btp.j, $$14, this.dS().z)) {
                  $$9.a_((double)$$11, (double)$$12, (double)$$13);
                  if (!this.dS().a((double)$$11, (double)$$12, (double)$$13, 7.0) && this.dS().f($$9) && this.dS().g($$9) && !this.dS().d($$9.cO())) {
                     $$9.h($$4);
                     $$9.a($$2, this.dS().d_($$9.ds()), btp.j, null);
                     $$2.a_($$9);
                     bvi $$15 = this.g(bvm.A);
                     bvk $$16 = $$15.a(d);
                     double $$17 = $$16 != null ? $$16.c() : 0.0;
                     $$15.c(d);
                     $$15.d(new bvk(d, $$17 - 0.05, bvk.a.a));
                     $$9.g(bvm.A).d(cc);
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
   public boolean E(btj $$0) {
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
   protected awc w() {
      return awd.Dz;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.DJ;
   }

   @Override
   protected awc n_() {
      return awd.DE;
   }

   protected awc y() {
      return awd.DP;
   }

   @Override
   protected void b(je $$0, dua $$1) {
      this.a(this.y(), 0.15F, 1.0F);
   }

   @Override
   public btq<? extends clo> ao() {
      return (btq<? extends clo>)super.ao();
   }

   @Override
   protected void a(azk $$0, bri $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dS().am() == brh.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(btr.a, new cvl(cvo.pc));
         } else {
            this.a(btr.a, new cvl(cvo.pd));
         }
      }
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.o_());
      $$0.a("CanBreakDoors", this.gv());
      $$0.a("InWaterTime", this.bi() ? this.cn : -1);
      $$0.a("DrownedConversionTime", this.gs() ? this.co : -1);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CanBreakDoors"));
      this.cn = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.b($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(arg $$0, buf $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.am() == brh.c || $$0.am() == brh.d) && $$1 instanceof cnc $$3) {
         if ($$0.am() != brh.d && this.af.h()) {
            return $$2;
         }

         clp $$4 = $$3.a(btq.bw, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.ds()), btp.i, new clo.b(false, true));
            $$4.a($$3.gy());
            $$4.a($$3.gJ().a(ut.a));
            $$4.a($$3.gq().a());
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
   public btm e(bur $$0) {
      return this.o_() ? ci : super.e($$0);
   }

   @Override
   public boolean k(cvl $$0) {
      return $$0.a(cvo.qS) && this.o_() && this.bW() ? false : super.k($$0);
   }

   @Override
   public boolean l(cvl $$0) {
      return $$0.a(cvo.rh) ? false : super.l($$0);
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      azk $$4 = $$0.C_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      this.a_($$4.i() < 0.55F * $$5);
      if ($$3 == null) {
         $$3 = new clo.b(a($$4), true);
      }

      if ($$3 instanceof clo.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<cga> $$7 = $$0.a(cga.class, this.cO().c(5.0, 3.0, 5.0), bto.c);
                  if (!$$7.isEmpty()) {
                     cga $$8 = $$7.get(0);
                     $$8.x(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  cga $$9 = btq.t.a(this.dS(), btp.g);
                  if ($$9 != null) {
                     $$9.b(this.dx(), this.dz(), this.dD(), this.dI(), 0.0F);
                     $$9.a($$0, $$1, btp.g, null);
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

      if (this.a(btr.f).f()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(btr.f, new cvl($$4.i() < 0.1F ? dgx.ef : dgx.ee));
            this.bW[btr.f.b()] = 0.0F;
         }
      }

      this.J($$5);
      return $$3;
   }

   public static boolean a(azk $$0) {
      return $$0.i() < 0.05F;
   }

   protected void J(float $$0) {
      this.gw();
      this.g(bvm.p).c(new bvk(bM, this.af.j() * 0.05F, bvk.a.a));
      double $$1 = this.af.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.g(bvm.m).c(new bvk(ce, $$1, bvk.a.c));
      }

      if (this.af.i() < $$0 * 0.05F) {
         this.g(bvm.A).c(new bvk(cd, this.af.j() * 0.25 + 0.5, bvk.a.a));
         this.g(bvm.s).c(new bvk(cd, this.af.j() * 3.0 + 1.0, bvk.a.c));
         this.y(true);
      }
   }

   protected void gw() {
      this.g(bvm.A).a(this.af.j() * 0.1F);
   }

   @Override
   protected void a(arg $$0, bsb $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof ckh $$4 && $$4.gq()) {
         cvl $$5 = this.go();
         if (!$$5.f()) {
            $$4.gr();
            this.b($$5);
         }
      }
   }

   protected cvl go() {
      return new cvl(cvo.uq);
   }

   class a extends cce {
      a(final bun $$0, final double $$1, final int $$2) {
         super(dgx.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(ddt $$0, je $$1) {
         $$0.a(null, $$1, awd.DF, awe.f, 0.5F, 0.9F + clo.this.af.i() * 0.2F);
      }

      @Override
      public void a(dds $$0, je $$1) {
         $$0.a(null, $$1, awd.Ao, awe.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bux {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
