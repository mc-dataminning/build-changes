import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class ciw extends cgw {
   public static final bum bY = bum.b(0.9F, 1.3F).a(0.7F);
   private static final int cf = 2;
   private static final int cg = 1;
   protected static final ImmutableList<cfq<? extends cfp<? super ciw>>> bZ = ImmutableList.of(cfq.c, cfq.d, cfq.b, cfq.o, cfq.f, cfq.r);
   protected static final ImmutableList<cej<?>> ca = ImmutableList.of(
      cej.n, cej.h, cej.m, cej.E, cej.t, cej.av, cej.r, cej.S, cej.T, cej.O, cej.K, cej.P, new cej[]{cej.R, cej.V, cej.W, cej.Z}
   );
   public static final int cc = 10;
   public static final double cd = 0.02;
   public static final double ce = 0.1F;
   private static final ajx<Boolean> ch = akb.a(ciw.class, ajz.k);
   private static final ajx<Boolean> ci = akb.a(ciw.class, ajz.k);
   private static final ajx<Boolean> cj = akb.a(ciw.class, ajz.k);
   private boolean ck;
   private int cl;

   public ciw(buq<? extends ciw> $$0, dgg $$1) {
      super($$0, $$1);
      this.L().a(true);
      this.a(eto.f, -1.0F);
      this.a(eto.g, -1.0F);
   }

   public cwn p() {
      azg $$0 = azg.a((long)this.cG().hashCode());
      axe<cwg> $$1 = this.gB() ? aww.b : aww.a;
      return this.dW().K_().e(mc.I).a($$1, $$0).map($$0x -> cwh.a(cwr.xi, $$0x)).orElseGet(() -> new cwn(cwr.xi));
   }

   @Override
   protected bwh.b<ciw> ed() {
      return bwh.a(ca, bZ);
   }

   @Override
   protected bwh<?> a(Dynamic<?> $$0) {
      return cix.a(this.ed().a($$0));
   }

   public static bwm.a t() {
      return cgw.gu().a(bwn.s, 10.0).a(bwn.v, 0.2F).a(bwn.c, 2.0);
   }

   @Override
   protected void i() {
      if (this.e_()) {
         this.g(bwn.c).a(1.0);
         this.gt();
      } else {
         this.g(bwn.c).a(2.0);
         this.gs();
      }
   }

   @Override
   protected int f(float $$0, float $$1) {
      return super.f($$0, $$1) - 10;
   }

   @Override
   protected avy u() {
      return this.gB() ? avz.lt : avz.lk;
   }

   @Override
   protected avy e(bsz $$0) {
      return this.gB() ? avz.lw : avz.ln;
   }

   @Override
   protected avy o_() {
      return this.gB() ? avz.lu : avz.ll;
   }

   @Override
   protected void b(ji $$0, dwv $$1) {
      this.a(avz.lB, 0.15F, 1.0F);
   }

   protected avy x() {
      return this.gB() ? avz.ly : avz.lp;
   }

   @Nullable
   public ciw b(arc $$0, bua $$1) {
      ciw $$2 = buq.ah.a($$0, bup.e);
      if ($$2 != null) {
         cix.a($$2, $$0.H_());
         bua $$3 = (bua)($$0.H_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof ciw $$4 && $$4.gB() || $$0.H_().j() < 0.02;
         $$2.x($$5);
      }

      return $$2;
   }

   @Override
   public bwh<ciw> ec() {
      return (bwh<ciw>)super.ec();
   }

   @Override
   protected void a(arc $$0) {
      bor $$1 = boq.a();
      $$1.a("goatBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("goatActivityUpdate");
      cix.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public int ab() {
      return 15;
   }

   @Override
   public void q(float $$0) {
      int $$1 = this.ab();
      float $$2 = ayy.c(this.aX, $$0);
      float $$3 = ayy.a($$2, (float)(-$$1), (float)$$1);
      super.q(this.aX + $$3);
   }

   @Override
   protected void gv() {
      this.dW().a(null, this, this.gB() ? avz.lv : avz.lm, awa.g, 1.0F, ayy.b(this.dW().A, 0.8F, 1.2F));
   }

   @Override
   public boolean j(cwn $$0) {
      return $$0.a(awx.ae);
   }

   @Override
   public bsi b(cov $$0, bsh $$1) {
      cwn $$2 = $$0.b($$1);
      if ($$2.a(cwr.rf) && !this.e_()) {
         $$0.a(this.x(), 1.0F, 1.0F);
         cwn $$3 = cwq.a($$2, $$0, cwr.rl.n());
         $$0.a($$1, $$3);
         return bsi.a;
      } else {
         bsi $$4 = super.b($$0, $$1);
         if ($$4.a() && this.j($$2)) {
            this.gv();
         }

         return $$4;
      }
   }

   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      azg $$4 = $$0.H_();
      cix.a(this, $$4);
      this.x($$4.j() < 0.02);
      this.i();
      if (!this.e_() && (double)$$4.i() < 0.1F) {
         ajx<Boolean> $$5 = $$4.h() ? ci : cj;
         this.al.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void Z() {
      super.Z();
      agc.a(this);
   }

   @Override
   public bum e(bvr $$0) {
      return $$0 == bvr.g ? bY.a(this.ej()) : super.e($$0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gB());
      $$0.a("HasLeftHorn", this.gp());
      $$0.a("HasRightHorn", this.gq());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.x($$0.q("IsScreamingGoat"));
      this.al.a(ci, $$0.q("HasLeftHorn"));
      this.al.a(cj, $$0.q("HasRightHorn"));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 58) {
         this.ck = true;
      } else if ($$0 == 59) {
         this.ck = false;
      } else {
         super.b($$0);
      }
   }

   @Override
   public void d_() {
      if (this.ck) {
         this.cl++;
      } else {
         this.cl -= 2;
      }

      this.cl = ayy.a(this.cl, 0, 20);
      super.d_();
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(ch, false);
      $$0.a(ci, true);
      $$0.a(cj, true);
   }

   public boolean gp() {
      return this.al.a(ci);
   }

   public boolean gq() {
      return this.al.a(cj);
   }

   public boolean gr() {
      boolean $$0 = this.gp();
      boolean $$1 = this.gq();
      if (!$$0 && !$$1) {
         return false;
      } else {
         ajx<Boolean> $$2;
         if (!$$0) {
            $$2 = cj;
         } else if (!$$1) {
            $$2 = ci;
         } else {
            $$2 = this.ae.h() ? ci : cj;
         }

         this.al.a($$2, false);
         fay $$5 = this.du();
         cwn $$6 = this.p();
         double $$7 = (double)ayy.b(this.ae, -0.2F, 0.2F);
         double $$8 = (double)ayy.b(this.ae, 0.3F, 0.7F);
         double $$9 = (double)ayy.b(this.ae, -0.2F, 0.2F);
         cla $$10 = new cla(this.dW(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dW().b($$10);
         return true;
      }
   }

   public void gs() {
      this.al.a(ci, true);
      this.al.a(cj, true);
   }

   public void gt() {
      this.al.a(ci, false);
      this.al.a(cj, false);
   }

   public boolean gB() {
      return this.al.a(ch);
   }

   public void x(boolean $$0) {
      this.al.a(ch, $$0);
   }

   public float gC() {
      return (float)this.cl / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(buq<? extends cgw> $$0, dgh $$1, bup $$2, ji $$3, azg $$4) {
      return $$1.a_($$3.e()).a(awo.cb) && a($$1, $$3);
   }
}
