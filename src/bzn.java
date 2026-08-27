import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzn extends bxs {
   public static final blq bT = blq.b(0.9F, 1.3F).a(0.7F);
   private static final int ca = 2;
   private static final int cb = 1;
   protected static final ImmutableList<bwn<? extends bwm<? super bzn>>> bU = ImmutableList.of(bwn.c, bwn.d, bwn.b, bwn.n, bwn.f, bwn.q);
   protected static final ImmutableList<bvh<?>> bW = ImmutableList.of(
      bvh.n, bvh.h, bvh.m, bvh.E, bvh.t, bvh.au, bvh.r, bvh.R, bvh.S, bvh.N, bvh.J, bvh.O, new bvh[]{bvh.Q, bvh.U, bvh.V, bvh.Y}
   );
   public static final int bX = 10;
   public static final double bY = 0.02;
   public static final double bZ = 0.1F;
   private static final agj<Boolean> cc = agm.a(bzn.class, agl.k);
   private static final agj<Boolean> cd = agm.a(bzn.class, agl.k);
   private static final agj<Boolean> ce = agm.a(bzn.class, agl.k);
   private boolean cf;
   private int cg;

   public bzn(blt<? extends bzn> $$0, cti $$1) {
      super($$0, $$1);
      this.N().a(true);
      this.a(eev.f, -1.0F);
      this.a(eev.g, -1.0F);
   }

   public cmr u() {
      aup $$0 = aup.a((long)this.cw().hashCode());
      asq<cmj> $$1 = this.go() ? asi.b : asi.a;
      il<cmj> $$2 = kd.an.a($$1);
      return cmk.a(cmu.vV, $$2.a($$0).get());
   }

   @Override
   protected bnf.b<bzn> dP() {
      return bnf.a(bW, bU);
   }

   @Override
   protected bnf<?> a(Dynamic<?> $$0) {
      return bzo.a(this.dP().a($$0));
   }

   public static bnk.a w() {
      return bmh.C().a(bnl.l, 10.0).a(bnl.m, 0.2F).a(bnl.c, 2.0);
   }

   @Override
   protected void m() {
      if (this.o_()) {
         this.a(bnl.c).a(1.0);
         this.gn();
      } else {
         this.a(bnl.c).a(2.0);
         this.gm();
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 10;
   }

   @Override
   protected arl y() {
      return this.go() ? arm.kq : arm.kg;
   }

   @Override
   protected arl d(bkn $$0) {
      return this.go() ? arm.kt : arm.kj;
   }

   @Override
   protected arl n_() {
      return this.go() ? arm.kr : arm.kh;
   }

   @Override
   protected void b(hx $$0, dja $$1) {
      this.a(arm.kz, 0.15F, 1.0F);
   }

   protected arl A() {
      return this.go() ? arm.kv : arm.kl;
   }

   @Nullable
   public bzn b(amz $$0, blk $$1) {
      bzn $$2 = blt.V.a((cti)$$0);
      if ($$2 != null) {
         bzo.a($$2, $$0.F_());
         blk $$3 = (blk)($$0.F_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof bzn $$4 && $$4.go() || $$0.F_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public bnf<bzn> dO() {
      return (bnf<bzn>)super.dO();
   }

   @Override
   protected void Z() {
      this.dM().af().a("goatBrain");
      this.dO().a((amz)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("goatActivityUpdate");
      bzo.a(this);
      this.dM().af().c();
      super.Z();
   }

   @Override
   public int ab() {
      return 15;
   }

   @Override
   public void n(float $$0) {
      int $$1 = this.ab();
      float $$2 = aui.c(this.aU, $$0);
      float $$3 = aui.a($$2, (float)(-$$1), (float)$$1);
      super.n(this.aU + $$3);
   }

   @Override
   public arl d(cmr $$0) {
      return this.go() ? arm.ks : arm.ki;
   }

   @Override
   public bjv b(cfb $$0, bju $$1) {
      cmr $$2 = $$0.b($$1);
      if ($$2.a(cmu.qv) && !this.o_()) {
         $$0.a(this.A(), 1.0F, 1.0F);
         cmr $$3 = cmt.a($$2, $$0, cmu.qB.am_());
         $$0.a($$1, $$3);
         return bjv.a(this.dM().B);
      } else {
         bjv $$4 = super.b($$0, $$1);
         if ($$4.a() && this.m($$2)) {
            this.dM().a(null, this, this.d($$2), arn.g, 1.0F, aui.b(this.dM().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      aup $$5 = $$0.F_();
      bzo.a(this, $$5);
      this.w($$5.j() < 0.02);
      this.m();
      if (!this.o_() && (double)$$5.i() < 0.1F) {
         agj<Boolean> $$6 = $$5.h() ? cd : ce;
         this.an.b($$6, false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void Y() {
      super.Y();
      adf.a(this);
   }

   @Override
   public blq a(bmr $$0) {
      return $$0 == bmr.g ? bT.a(this.dZ()) : super.a($$0);
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.go());
      $$0.a("HasLeftHorn", this.ge());
      $$0.a("HasRightHorn", this.gk());
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.w($$0.q("IsScreamingGoat"));
      this.an.b(cd, $$0.q("HasLeftHorn"));
      this.an.b(ce, $$0.q("HasRightHorn"));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 58) {
         this.cf = true;
      } else if ($$0 == 59) {
         this.cf = false;
      } else {
         super.b($$0);
      }
   }

   @Override
   public void d_() {
      if (this.cf) {
         this.cg++;
      } else {
         this.cg -= 2;
      }

      this.cg = aui.a(this.cg, 0, 20);
      super.d_();
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(cc, false);
      this.an.a(cd, true);
      this.an.a(ce, true);
   }

   public boolean ge() {
      return this.an.b(cd);
   }

   public boolean gk() {
      return this.an.b(ce);
   }

   public boolean gl() {
      boolean $$0 = this.ge();
      boolean $$1 = this.gk();
      if (!$$0 && !$$1) {
         return false;
      } else {
         agj<Boolean> $$2;
         if (!$$0) {
            $$2 = ce;
         } else if (!$$1) {
            $$2 = cd;
         } else {
            $$2 = this.ag.h() ? cd : ce;
         }

         this.an.b($$2, false);
         elm $$5 = this.dk();
         cmr $$6 = this.u();
         double $$7 = (double)aui.b(this.ag, -0.2F, 0.2F);
         double $$8 = (double)aui.b(this.ag, 0.3F, 0.7F);
         double $$9 = (double)aui.b(this.ag, -0.2F, 0.2F);
         cbo $$10 = new cbo(this.dM(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dM().b($$10);
         return true;
      }
   }

   public void gm() {
      this.an.b(cd, true);
      this.an.b(ce, true);
   }

   public void gn() {
      this.an.b(cd, false);
      this.an.b(ce, false);
   }

   public boolean go() {
      return this.an.b(cc);
   }

   public void w(boolean $$0) {
      this.an.b(cc, $$0);
   }

   public float gp() {
      return (float)this.cg / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(blt<? extends bxs> $$0, ctj $$1, bmj $$2, hx $$3, aup $$4) {
      return $$1.a_($$3.d()).a(asb.bR) && a($$1, $$3);
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.1875F * $$2, 0.0F);
   }
}
