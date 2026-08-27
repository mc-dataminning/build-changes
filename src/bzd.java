import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzd extends bxi {
   public static final blg bT = blg.b(0.9F, 1.3F).a(0.7F);
   private static final int ca = 2;
   private static final int cb = 1;
   protected static final ImmutableList<bwd<? extends bwc<? super bzd>>> bU = ImmutableList.of(bwd.c, bwd.d, bwd.b, bwd.n, bwd.f, bwd.q);
   protected static final ImmutableList<bux<?>> bW = ImmutableList.of(
      bux.n, bux.h, bux.m, bux.E, bux.t, bux.au, bux.r, bux.R, bux.S, bux.N, bux.J, bux.O, new bux[]{bux.Q, bux.U, bux.V, bux.Y}
   );
   public static final int bX = 10;
   public static final double bY = 0.02;
   public static final double bZ = 0.1F;
   private static final afz<Boolean> cc = agc.a(bzd.class, agb.k);
   private static final afz<Boolean> cd = agc.a(bzd.class, agb.k);
   private static final afz<Boolean> ce = agc.a(bzd.class, agb.k);
   private boolean cf;
   private int cg;

   public bzd(blj<? extends bzd> $$0, csy $$1) {
      super($$0, $$1);
      this.N().a(true);
      this.a(eek.f, -1.0F);
      this.a(eek.g, -1.0F);
   }

   public cmh u() {
      auf $$0 = auf.a((long)this.cw().hashCode());
      asg<clz> $$1 = this.go() ? ary.b : ary.a;
      ij<clz> $$2 = kb.an.a($$1);
      return cma.a(cmk.vV, $$2.a($$0).get());
   }

   @Override
   protected bmv.b<bzd> dP() {
      return bmv.a(bW, bU);
   }

   @Override
   protected bmv<?> a(Dynamic<?> $$0) {
      return bze.a(this.dP().a($$0));
   }

   public static bna.a w() {
      return blx.C().a(bnb.l, 10.0).a(bnb.m, 0.2F).a(bnb.c, 2.0);
   }

   @Override
   protected void m() {
      if (this.o_()) {
         this.a(bnb.c).a(1.0);
         this.gn();
      } else {
         this.a(bnb.c).a(2.0);
         this.gm();
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 10;
   }

   @Override
   protected arb y() {
      return this.go() ? arc.kq : arc.kg;
   }

   @Override
   protected arb d(bkd $$0) {
      return this.go() ? arc.kt : arc.kj;
   }

   @Override
   protected arb n_() {
      return this.go() ? arc.kr : arc.kh;
   }

   @Override
   protected void b(hv $$0, dip $$1) {
      this.a(arc.kz, 0.15F, 1.0F);
   }

   protected arb A() {
      return this.go() ? arc.kv : arc.kl;
   }

   @Nullable
   public bzd b(amp $$0, bla $$1) {
      bzd $$2 = blj.V.a((csy)$$0);
      if ($$2 != null) {
         bze.a($$2, $$0.F_());
         bla $$3 = (bla)($$0.F_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof bzd $$4 && $$4.go() || $$0.F_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public bmv<bzd> dO() {
      return (bmv<bzd>)super.dO();
   }

   @Override
   protected void Z() {
      this.dM().ae().a("goatBrain");
      this.dO().a((amp)this.dM(), this);
      this.dM().ae().c();
      this.dM().ae().a("goatActivityUpdate");
      bze.a(this);
      this.dM().ae().c();
      super.Z();
   }

   @Override
   public int ab() {
      return 15;
   }

   @Override
   public void n(float $$0) {
      int $$1 = this.ab();
      float $$2 = aty.c(this.aU, $$0);
      float $$3 = aty.a($$2, (float)(-$$1), (float)$$1);
      super.n(this.aU + $$3);
   }

   @Override
   public arb d(cmh $$0) {
      return this.go() ? arc.ks : arc.ki;
   }

   @Override
   public bjl b(cer $$0, bjk $$1) {
      cmh $$2 = $$0.b($$1);
      if ($$2.a(cmk.qv) && !this.o_()) {
         $$0.a(this.A(), 1.0F, 1.0F);
         cmh $$3 = cmj.a($$2, $$0, cmk.qB.am_());
         $$0.a($$1, $$3);
         return bjl.a(this.dM().B);
      } else {
         bjl $$4 = super.b($$0, $$1);
         if ($$4.a() && this.m($$2)) {
            this.dM().a(null, this, this.d($$2), ard.g, 1.0F, aty.b(this.dM().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      auf $$5 = $$0.F_();
      bze.a(this, $$5);
      this.w($$5.j() < 0.02);
      this.m();
      if (!this.o_() && (double)$$5.i() < 0.1F) {
         afz<Boolean> $$6 = $$5.h() ? cd : ce;
         this.an.b($$6, false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void Y() {
      super.Y();
      acv.a(this);
   }

   @Override
   public blg a(bmh $$0) {
      return $$0 == bmh.g ? bT.a(this.dZ()) : super.a($$0);
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.go());
      $$0.a("HasLeftHorn", this.ge());
      $$0.a("HasRightHorn", this.gk());
   }

   @Override
   public void a(sj $$0) {
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

      this.cg = aty.a(this.cg, 0, 20);
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
         afz<Boolean> $$2;
         if (!$$0) {
            $$2 = ce;
         } else if (!$$1) {
            $$2 = cd;
         } else {
            $$2 = this.ag.h() ? cd : ce;
         }

         this.an.b($$2, false);
         elb $$5 = this.dk();
         cmh $$6 = this.u();
         double $$7 = (double)aty.b(this.ag, -0.2F, 0.2F);
         double $$8 = (double)aty.b(this.ag, 0.3F, 0.7F);
         double $$9 = (double)aty.b(this.ag, -0.2F, 0.2F);
         cbe $$10 = new cbe(this.dM(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
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

   public static boolean c(blj<? extends bxi> $$0, csz $$1, blz $$2, hv $$3, auf $$4) {
      return $$1.a_($$3.d()).a(arr.bR) && a($$1, $$3);
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.1875F * $$2, 0.0F);
   }
}
