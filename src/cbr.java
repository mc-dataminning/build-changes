import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cbr extends bzt {
   public static final bnr bT = bnr.b(0.9F, 1.3F).a(0.7F);
   private static final int ca = 2;
   private static final int cb = 1;
   protected static final ImmutableList<byo<? extends byn<? super cbr>>> bU = ImmutableList.of(byo.c, byo.d, byo.b, byo.o, byo.f, byo.r);
   protected static final ImmutableList<bxh<?>> bW = ImmutableList.of(
      bxh.n, bxh.h, bxh.m, bxh.E, bxh.t, bxh.av, bxh.r, bxh.S, bxh.T, bxh.O, bxh.K, bxh.P, new bxh[]{bxh.R, bxh.V, bxh.W, bxh.Z}
   );
   public static final int bX = 10;
   public static final double bY = 0.02;
   public static final double bZ = 0.1F;
   private static final aie<Boolean> cc = aih.a(cbr.class, aig.k);
   private static final aie<Boolean> cd = aih.a(cbr.class, aig.k);
   private static final aie<Boolean> ce = aih.a(cbr.class, aig.k);
   private boolean cf;
   private int cg;

   public cbr(bnu<? extends cbr> $$0, cvn $$1) {
      super($$0, $$1);
      this.N().a(true);
      this.a(eha.f, -1.0F);
      this.a(eha.g, -1.0F);
   }

   public coz u() {
      awo $$0 = awo.a((long)this.cw().hashCode());
      auo<cor> $$1 = this.gq() ? aug.b : aug.a;
      in<cor> $$2 = kf.an.a($$1);
      return cos.a(cpc.vY, $$2.a($$0).get());
   }

   @Override
   protected bpf.b<cbr> dP() {
      return bpf.a(bW, bU);
   }

   @Override
   protected bpf<?> a(Dynamic<?> $$0) {
      return cbs.a(this.dP().a($$0));
   }

   public static bpk.a w() {
      return boi.C().a(bpl.n, 10.0).a(bpl.o, 0.2F).a(bpl.c, 2.0);
   }

   @Override
   protected void m() {
      if (this.o_()) {
         this.f(bpl.c).a(1.0);
         this.gp();
      } else {
         this.f(bpl.c).a(2.0);
         this.go();
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 10;
   }

   @Override
   protected atj y() {
      return this.gq() ? atk.kF : atk.kv;
   }

   @Override
   protected atj d(bmn $$0) {
      return this.gq() ? atk.kI : atk.ky;
   }

   @Override
   protected atj n_() {
      return this.gq() ? atk.kG : atk.kw;
   }

   @Override
   protected void b(hz $$0, dlf $$1) {
      this.a(atk.kO, 0.15F, 1.0F);
   }

   protected atj A() {
      return this.gq() ? atk.kK : atk.kA;
   }

   @Nullable
   public cbr b(aov $$0, bnj $$1) {
      cbr $$2 = bnu.W.a((cvn)$$0);
      if ($$2 != null) {
         cbs.a($$2, $$0.F_());
         bnj $$3 = (bnj)($$0.F_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof cbr $$4 && $$4.gq() || $$0.F_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public bpf<cbr> dO() {
      return (bpf<cbr>)super.dO();
   }

   @Override
   protected void aa() {
      this.dM().af().a("goatBrain");
      this.dO().a((aov)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("goatActivityUpdate");
      cbs.a(this);
      this.dM().af().c();
      super.aa();
   }

   @Override
   public int fH() {
      return 15;
   }

   @Override
   public void n(float $$0) {
      int $$1 = this.fH();
      float $$2 = awh.c(this.aU, $$0);
      float $$3 = awh.a($$2, (float)(-$$1), (float)$$1);
      super.n(this.aU + $$3);
   }

   @Override
   public atj d(coz $$0) {
      return this.gq() ? atk.kH : atk.kx;
   }

   @Override
   public blu b(chh $$0, blt $$1) {
      coz $$2 = $$0.b($$1);
      if ($$2.a(cpc.qx) && !this.o_()) {
         $$0.a(this.A(), 1.0F, 1.0F);
         coz $$3 = cpb.a($$2, $$0, cpc.qD.ao_());
         $$0.a($$1, $$3);
         return blu.a(this.dM().B);
      } else {
         blu $$4 = super.b($$0, $$1);
         if ($$4.a() && this.m($$2)) {
            this.dM().a(null, this, this.d($$2), atl.g, 1.0F, awh.b(this.dM().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      awo $$5 = $$0.F_();
      cbs.a(this, $$5);
      this.w($$5.j() < 0.02);
      this.m();
      if (!this.o_() && (double)$$5.i() < 0.1F) {
         aie<Boolean> $$6 = $$5.h() ? cd : ce;
         this.am.b($$6, false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void Z() {
      super.Z();
      aep.a(this);
   }

   @Override
   public bnr e(bor $$0) {
      return $$0 == bor.g ? bT.a(this.dZ()) : super.e($$0);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gq());
      $$0.a("HasLeftHorn", this.gg());
      $$0.a("HasRightHorn", this.gm());
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.w($$0.q("IsScreamingGoat"));
      this.am.b(cd, $$0.q("HasLeftHorn"));
      this.am.b(ce, $$0.q("HasRightHorn"));
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

      this.cg = awh.a(this.cg, 0, 20);
      super.d_();
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(cc, false);
      this.am.a(cd, true);
      this.am.a(ce, true);
   }

   public boolean gg() {
      return this.am.b(cd);
   }

   public boolean gm() {
      return this.am.b(ce);
   }

   public boolean gn() {
      boolean $$0 = this.gg();
      boolean $$1 = this.gm();
      if (!$$0 && !$$1) {
         return false;
      } else {
         aie<Boolean> $$2;
         if (!$$0) {
            $$2 = ce;
         } else if (!$$1) {
            $$2 = cd;
         } else {
            $$2 = this.af.h() ? cd : ce;
         }

         this.am.b($$2, false);
         ens $$5 = this.dk();
         coz $$6 = this.u();
         double $$7 = (double)awh.b(this.af, -0.2F, 0.2F);
         double $$8 = (double)awh.b(this.af, 0.3F, 0.7F);
         double $$9 = (double)awh.b(this.af, -0.2F, 0.2F);
         cds $$10 = new cds(this.dM(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dM().b($$10);
         return true;
      }
   }

   public void go() {
      this.am.b(cd, true);
      this.am.b(ce, true);
   }

   public void gp() {
      this.am.b(cd, false);
      this.am.b(ce, false);
   }

   public boolean gq() {
      return this.am.b(cc);
   }

   public void w(boolean $$0) {
      this.am.b(cc, $$0);
   }

   public float gr() {
      return (float)this.cg / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bnu<? extends bzt> $$0, cvo $$1, bok $$2, hz $$3, awo $$4) {
      return $$1.a_($$3.d()).a(atz.bS) && a($$1, $$3);
   }
}
