import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cnf extends cgx implements clp, cnh {
   private static final ajx<Boolean> cc = akb.a(cnf.class, ajz.k);
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
   protected static final ImmutableList<? extends cfr<? extends cfq<? super cnf>>> bZ = ImmutableList.of(cfr.c, cfr.d, cfr.o, cfr.n);
   protected static final ImmutableList<? extends cek<?>> ca = ImmutableList.of(
      cek.r,
      cek.g,
      cek.h,
      cek.k,
      cek.l,
      cek.n,
      cek.m,
      cek.E,
      cek.t,
      cek.o,
      cek.p,
      cek.aq,
      new cek[]{cek.z, cek.as, cek.at, cek.ap, cek.K, cek.aw, cek.ax, cek.Z}
   );

   public cnf(bur<? extends cnf> $$0, dgi $$1) {
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

   public static bwn.a p() {
      return clx.gu().a(bwo.s, 40.0).a(bwo.v, 0.3F).a(bwo.p, 0.6F).a(bwo.d, 1.0).a(bwo.c, 6.0);
   }

   @Override
   public boolean c(arc $$0, buk $$1) {
      if ($$1 instanceof bvg $$2) {
         this.cj = 10;
         this.dW().a(this, (byte)4);
         this.b(awa.mO);
         cng.a(this, $$2);
         return cnh.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   protected void e(bvg $$0) {
      if (this.t()) {
         cnh.a(this, $$0);
      }
   }

   @Override
   public boolean a(arc $$0, bta $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bvg $$4) {
         cng.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected bwi.b<cnf> ed() {
      return bwi.a(ca, bZ);
   }

   @Override
   protected bwi<?> a(Dynamic<?> $$0) {
      return cng.a(this.ed().a($$0));
   }

   @Override
   public bwi<cnf> ec() {
      return (bwi<cnf>)super.ec();
   }

   @Override
   protected void a(arc $$0) {
      bos $$1 = bor.a();
      $$1.a("hoglinBrain");
      this.ec().a($$0, this);
      $$1.c();
      cng.a(this);
      if (this.gp()) {
         this.ck++;
         if (this.ck > 300) {
            this.b(awa.mP);
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
         this.g(bwo.c).a(0.5);
      } else {
         this.bN = 5;
         this.g(bwo.c).a(6.0);
      }
   }

   public static boolean c(bur<cnf> $$0, dgj $$1, buq $$2, ji $$3, azh $$4) {
      return !$$1.a_($$3.e()).a(djo.lm);
   }

   @Nullable
   @Override
   public bvz a(dgz $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
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
   public float a(ji $$0, dgl $$1) {
      if (cng.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.e()).a(djo.oY) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bsj b(cox $$0, bsi $$1) {
      bsj $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.aj();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cj = 10;
         this.b(awa.mO);
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
      this.a(bur.bN, buf.a(this, true, false), $$0 -> $$0.a(new btp(btr.i, 200, 0)));
   }

   @Override
   public boolean j(cwp $$0) {
      return $$0.a(awy.ap);
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
   public bub a(arc $$0, bub $$1) {
      cnf $$2 = bur.ak.a($$0, buq.e);
      if ($$2 != null) {
         $$2.aj();
      }

      return $$2;
   }

   @Override
   public boolean gw() {
      return !cng.c(this) && super.gw();
   }

   @Override
   public awb dn() {
      return awb.f;
   }

   @Override
   protected avz u() {
      return this.dW().C ? null : cng.b(this).orElse(null);
   }

   @Override
   protected avz e(bta $$0) {
      return awa.mR;
   }

   @Override
   protected avz o_() {
      return awa.mQ;
   }

   @Override
   protected avz aV() {
      return awa.nw;
   }

   @Override
   protected avz aW() {
      return awa.nv;
   }

   @Override
   protected void b(ji $$0, dwx $$1) {
      this.a(awa.mT, 0.15F, 1.0F);
   }

   @Override
   protected void Z() {
      super.Z();
      agc.a(this);
   }

   @Nullable
   @Override
   public bvg O_() {
      return this.O();
   }
}
