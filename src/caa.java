import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class caa extends byc {
   public static final blz bU = blz.b(0.9F, 1.3F).a(0.7F);
   private static final int cb = 2;
   private static final int cc = 1;
   protected static final ImmutableList<bwx<? extends bww<? super caa>>> bV = ImmutableList.of(bwx.c, bwx.d, bwx.b, bwx.o, bwx.f, bwx.r);
   protected static final ImmutableList<bvq<?>> bX = ImmutableList.of(
      bvq.n, bvq.h, bvq.m, bvq.E, bvq.t, bvq.av, bvq.r, bvq.S, bvq.T, bvq.O, bvq.K, bvq.P, new bvq[]{bvq.R, bvq.V, bvq.W, bvq.Z}
   );
   public static final int bY = 10;
   public static final double bZ = 0.02;
   public static final double ca = 0.1F;
   private static final agn<Boolean> cd = agq.a(caa.class, agp.k);
   private static final agn<Boolean> ce = agq.a(caa.class, agp.k);
   private static final agn<Boolean> cf = agq.a(caa.class, agp.k);
   private boolean cg;
   private int ch;

   public caa(bmc<? extends caa> $$0, ctx $$1) {
      super($$0, $$1);
      this.N().a(true);
      this.a(efk.f, -1.0F);
      this.a(efk.g, -1.0F);
   }

   public cng u() {
      auw $$0 = auw.a((long)this.cw().hashCode());
      asx<cmy> $$1 = this.gp() ? asp.b : asp.a;
      il<cmy> $$2 = kd.an.a($$1);
      return cmz.a(cnj.vY, $$2.a($$0).get());
   }

   @Override
   protected bno.b<caa> dO() {
      return bno.a(bX, bV);
   }

   @Override
   protected bno<?> a(Dynamic<?> $$0) {
      return cab.a(this.dO().a($$0));
   }

   public static bnt.a w() {
      return bmq.C().a(bnu.n, 10.0).a(bnu.o, 0.2F).a(bnu.c, 2.0);
   }

   @Override
   protected void m() {
      if (this.o_()) {
         this.f(bnu.c).a(1.0);
         this.go();
      } else {
         this.f(bnu.c).a(2.0);
         this.gn();
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 10;
   }

   @Override
   protected ars y() {
      return this.gp() ? art.kF : art.kv;
   }

   @Override
   protected ars d(bkv $$0) {
      return this.gp() ? art.kI : art.ky;
   }

   @Override
   protected ars n_() {
      return this.gp() ? art.kG : art.kw;
   }

   @Override
   protected void b(hx $$0, djp $$1) {
      this.a(art.kO, 0.15F, 1.0F);
   }

   protected ars A() {
      return this.gp() ? art.kK : art.kA;
   }

   @Nullable
   public caa b(ane $$0, blr $$1) {
      caa $$2 = bmc.W.a((ctx)$$0);
      if ($$2 != null) {
         cab.a($$2, $$0.F_());
         blr $$3 = (blr)($$0.F_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof caa $$4 && $$4.gp() || $$0.F_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public bno<caa> dN() {
      return (bno<caa>)super.dN();
   }

   @Override
   protected void aa() {
      this.dL().af().a("goatBrain");
      this.dN().a((ane)this.dL(), this);
      this.dL().af().c();
      this.dL().af().a("goatActivityUpdate");
      cab.a(this);
      this.dL().af().c();
      super.aa();
   }

   @Override
   public int fH() {
      return 15;
   }

   @Override
   public void n(float $$0) {
      int $$1 = this.fH();
      float $$2 = aup.c(this.aU, $$0);
      float $$3 = aup.a($$2, (float)(-$$1), (float)$$1);
      super.n(this.aU + $$3);
   }

   @Override
   public ars d(cng $$0) {
      return this.gp() ? art.kH : art.kx;
   }

   @Override
   public bkc b(cfq $$0, bkb $$1) {
      cng $$2 = $$0.b($$1);
      if ($$2.a(cnj.qx) && !this.o_()) {
         $$0.a(this.A(), 1.0F, 1.0F);
         cng $$3 = cni.a($$2, $$0, cnj.qD.ao_());
         $$0.a($$1, $$3);
         return bkc.a(this.dL().B);
      } else {
         bkc $$4 = super.b($$0, $$1);
         if ($$4.a() && this.m($$2)) {
            this.dL().a(null, this, this.d($$2), aru.g, 1.0F, aup.b(this.dL().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      auw $$5 = $$0.F_();
      cab.a(this, $$5);
      this.w($$5.j() < 0.02);
      this.m();
      if (!this.o_() && (double)$$5.i() < 0.1F) {
         agn<Boolean> $$6 = $$5.h() ? ce : cf;
         this.an.b($$6, false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void Z() {
      super.Z();
      adj.a(this);
   }

   @Override
   public blz e(bna $$0) {
      return $$0 == bna.g ? bU.a(this.dY()) : super.e($$0);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gp());
      $$0.a("HasLeftHorn", this.gf());
      $$0.a("HasRightHorn", this.gl());
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.w($$0.q("IsScreamingGoat"));
      this.an.b(ce, $$0.q("HasLeftHorn"));
      this.an.b(cf, $$0.q("HasRightHorn"));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 58) {
         this.cg = true;
      } else if ($$0 == 59) {
         this.cg = false;
      } else {
         super.b($$0);
      }
   }

   @Override
   public void d_() {
      if (this.cg) {
         this.ch++;
      } else {
         this.ch -= 2;
      }

      this.ch = aup.a(this.ch, 0, 20);
      super.d_();
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(cd, false);
      this.an.a(ce, true);
      this.an.a(cf, true);
   }

   public boolean gf() {
      return this.an.b(ce);
   }

   public boolean gl() {
      return this.an.b(cf);
   }

   public boolean gm() {
      boolean $$0 = this.gf();
      boolean $$1 = this.gl();
      if (!$$0 && !$$1) {
         return false;
      } else {
         agn<Boolean> $$2;
         if (!$$0) {
            $$2 = cf;
         } else if (!$$1) {
            $$2 = ce;
         } else {
            $$2 = this.ag.h() ? ce : cf;
         }

         this.an.b($$2, false);
         emc $$5 = this.dj();
         cng $$6 = this.u();
         double $$7 = (double)aup.b(this.ag, -0.2F, 0.2F);
         double $$8 = (double)aup.b(this.ag, 0.3F, 0.7F);
         double $$9 = (double)aup.b(this.ag, -0.2F, 0.2F);
         ccb $$10 = new ccb(this.dL(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dL().b($$10);
         return true;
      }
   }

   public void gn() {
      this.an.b(ce, true);
      this.an.b(cf, true);
   }

   public void go() {
      this.an.b(ce, false);
      this.an.b(cf, false);
   }

   public boolean gp() {
      return this.an.b(cd);
   }

   public void w(boolean $$0) {
      this.an.b(cd, $$0);
   }

   public float gq() {
      return (float)this.ch / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bmc<? extends byc> $$0, cty $$1, bms $$2, hx $$3, auw $$4) {
      return $$1.a_($$3.d()).a(asi.bR) && a($$1, $$3);
   }
}
