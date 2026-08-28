import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cnd extends cgw implements clo, cnf {
   private static final ajx<Boolean> cc = akb.a(cnd.class, ajz.k);
   private static final int cd = 40;
   private static final float ce = 0.3F;
   private static final int cf = 1;
   private static final float cg = 0.6F;
   private static final int ch = 6;
   private static final float ci = 0.5F;
   public static final int bY = 300;
   private int cj;
   private int ck;
   private boolean cl;
   protected static final ImmutableList<? extends cfq<? extends cfp<? super cnd>>> bZ = ImmutableList.of(cfq.c, cfq.d, cfq.o, cfq.n);
   protected static final ImmutableList<? extends cej<?>> ca = ImmutableList.of(
      cej.r,
      cej.g,
      cej.h,
      cej.k,
      cej.l,
      cej.n,
      cej.m,
      cej.E,
      cej.t,
      cej.o,
      cej.p,
      cej.aq,
      new cej[]{cej.z, cej.as, cej.at, cej.ap, cej.K, cej.aw, cej.ax, cej.Z}
   );

   public cnd(buq<? extends cnd> $$0, dgg $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @VisibleForTesting
   public void s(int $$0) {
      this.ck = $$0;
   }

   @Override
   public boolean y() {
      return true;
   }

   public static bwm.a p() {
      return clw.gu().a(bwn.s, 40.0).a(bwn.v, 0.3F).a(bwn.p, 0.6F).a(bwn.d, 1.0).a(bwn.c, 6.0);
   }

   @Override
   public boolean c(arc $$0, buj $$1) {
      if ($$1 instanceof bvf $$2) {
         this.cj = 10;
         this.dW().a(this, (byte)4);
         this.b(avz.mO);
         cne.a(this, $$2);
         return cnf.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   protected void e(bvf $$0) {
      if (this.t()) {
         cnf.a(this, $$0);
      }
   }

   @Override
   public boolean a(arc $$0, bsz $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bvf $$4) {
         cne.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected bwh.b<cnd> ed() {
      return bwh.a(ca, bZ);
   }

   @Override
   protected bwh<?> a(Dynamic<?> $$0) {
      return cne.a(this.ed().a($$0));
   }

   @Override
   public bwh<cnd> ec() {
      return (bwh<cnd>)super.ec();
   }

   @Override
   protected void a(arc $$0) {
      bor $$1 = boq.a();
      $$1.a("hoglinBrain");
      this.ec().a($$0, this);
      $$1.c();
      cne.a(this);
      if (this.gp()) {
         this.ck++;
         if (this.ck > 300) {
            this.b(avz.mP);
            this.gr();
         }
      } else {
         this.ck = 0;
      }
   }

   @Override
   public void d_() {
      if (this.cj > 0) {
         this.cj--;
      }

      super.d_();
   }

   @Override
   protected void i() {
      if (this.e_()) {
         this.bN = 3;
         this.g(bwn.c).a(0.5);
      } else {
         this.bN = 5;
         this.g(bwn.c).a(6.0);
      }
   }

   public static boolean c(buq<cnd> $$0, dgh $$1, bup $$2, ji $$3, azg $$4) {
      return !$$1.a_($$3.e()).a(djm.lm);
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      if ($$0.H_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean h(double $$0) {
      return !this.ak();
   }

   @Override
   public float a(ji $$0, dgj $$1) {
      if (cne.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.e()).a(djm.oY) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bsi b(cov $$0, bsh $$1) {
      bsi $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.aj();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cj = 10;
         this.b(avz.mO);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int x() {
      return this.cj;
   }

   @Override
   public boolean en() {
      return true;
   }

   @Override
   protected int e(arc $$0) {
      return this.bN;
   }

   private void gr() {
      this.a(buq.bM, bue.a(this, true, false), $$0 -> $$0.a(new bto(btq.i, 200, 0)));
   }

   @Override
   public boolean j(cwn $$0) {
      return $$0.a(awx.ap);
   }

   public boolean t() {
      return !this.e_();
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      if (this.gs()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.ck);
      if (this.cl) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.x($$0.q("IsImmuneToZombification"));
      this.ck = $$0.h("TimeInOverworld");
      this.y($$0.q("CannotBeHunted"));
   }

   public void x(boolean $$0) {
      this.au().a(cc, $$0);
   }

   private boolean gs() {
      return this.au().a(cc);
   }

   public boolean gp() {
      return !this.dW().G_().b() && !this.gs() && !this.gc();
   }

   private void y(boolean $$0) {
      this.cl = $$0;
   }

   public boolean gq() {
      return this.t() && !this.cl;
   }

   @Nullable
   @Override
   public bua a(arc $$0, bua $$1) {
      cnd $$2 = buq.aj.a($$0, bup.e);
      if ($$2 != null) {
         $$2.aj();
      }

      return $$2;
   }

   @Override
   public boolean gw() {
      return !cne.c(this) && super.gw();
   }

   @Override
   public awa dn() {
      return awa.f;
   }

   @Override
   protected avy u() {
      return this.dW().C ? null : cne.b(this).orElse(null);
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.mR;
   }

   @Override
   protected avy o_() {
      return avz.mQ;
   }

   @Override
   protected avy aV() {
      return avz.nw;
   }

   @Override
   protected avy aW() {
      return avz.nv;
   }

   @Override
   protected void b(ji $$0, dwv $$1) {
      this.a(avz.mT, 0.15F, 1.0F);
   }

   @Override
   protected void Z() {
      super.Z();
      agc.a(this);
   }

   @Nullable
   @Override
   public bvf O_() {
      return this.O();
   }
}
