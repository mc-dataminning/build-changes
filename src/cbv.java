import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cbv extends bzx {
   public static final bnt bT = bnt.b(0.9F, 1.3F).a(0.7F);
   private static final int ca = 2;
   private static final int cb = 1;
   protected static final ImmutableList<bys<? extends byr<? super cbv>>> bU = ImmutableList.of(bys.c, bys.d, bys.b, bys.o, bys.f, bys.r);
   protected static final ImmutableList<bxl<?>> bW = ImmutableList.of(
      bxl.n, bxl.h, bxl.m, bxl.E, bxl.t, bxl.av, bxl.r, bxl.S, bxl.T, bxl.O, bxl.K, bxl.P, new bxl[]{bxl.R, bxl.V, bxl.W, bxl.Z}
   );
   public static final int bX = 10;
   public static final double bY = 0.02;
   public static final double bZ = 0.1F;
   private static final aie<Boolean> cc = aih.a(cbv.class, aig.k);
   private static final aie<Boolean> cd = aih.a(cbv.class, aig.k);
   private static final aie<Boolean> ce = aih.a(cbv.class, aig.k);
   private boolean cf;
   private int cg;

   public cbv(bnw<? extends cbv> $$0, cvr $$1) {
      super($$0, $$1);
      this.N().a(true);
      this.a(ehh.f, -1.0F);
      this.a(ehh.g, -1.0F);
   }

   public cpd u() {
      awp $$0 = awp.a((long)this.cw().hashCode());
      aup<cov> $$1 = this.gq() ? auh.b : auh.a;
      in<cov> $$2 = kf.an.a($$1);
      return cow.a(cpg.vY, $$2.a($$0).get());
   }

   @Override
   protected bpj.b<cbv> dP() {
      return bpj.a(bW, bU);
   }

   @Override
   protected bpj<?> a(Dynamic<?> $$0) {
      return cbw.a(this.dP().a($$0));
   }

   public static bpo.a w() {
      return bok.C().a(bpp.n, 10.0).a(bpp.o, 0.2F).a(bpp.c, 2.0);
   }

   @Override
   protected void m() {
      if (this.o_()) {
         this.f(bpp.c).a(1.0);
         this.gp();
      } else {
         this.f(bpp.c).a(2.0);
         this.go();
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 10;
   }

   @Override
   protected atk y() {
      return this.gq() ? atl.kG : atl.kw;
   }

   @Override
   protected atk d(bmp $$0) {
      return this.gq() ? atl.kJ : atl.kz;
   }

   @Override
   protected atk n_() {
      return this.gq() ? atl.kH : atl.kx;
   }

   @Override
   protected void b(hz $$0, dlj $$1) {
      this.a(atl.kP, 0.15F, 1.0F);
   }

   protected atk A() {
      return this.gq() ? atl.kL : atl.kB;
   }

   @Nullable
   public cbv b(aow $$0, bnl $$1) {
      cbv $$2 = bnw.W.a((cvr)$$0);
      if ($$2 != null) {
         cbw.a($$2, $$0.F_());
         bnl $$3 = (bnl)($$0.F_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof cbv $$4 && $$4.gq() || $$0.F_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public bpj<cbv> dO() {
      return (bpj<cbv>)super.dO();
   }

   @Override
   protected void aa() {
      this.dM().ae().a("goatBrain");
      this.dO().a((aow)this.dM(), this);
      this.dM().ae().c();
      this.dM().ae().a("goatActivityUpdate");
      cbw.a(this);
      this.dM().ae().c();
      super.aa();
   }

   @Override
   public int fH() {
      return 15;
   }

   @Override
   public void n(float $$0) {
      int $$1 = this.fH();
      float $$2 = awi.c(this.aU, $$0);
      float $$3 = awi.a($$2, (float)(-$$1), (float)$$1);
      super.n(this.aU + $$3);
   }

   @Override
   public atk d(cpd $$0) {
      return this.gq() ? atl.kI : atl.ky;
   }

   @Override
   public blw b(chl $$0, blv $$1) {
      cpd $$2 = $$0.b($$1);
      if ($$2.a(cpg.qx) && !this.o_()) {
         $$0.a(this.A(), 1.0F, 1.0F);
         cpd $$3 = cpf.a($$2, $$0, cpg.qD.ao_());
         $$0.a($$1, $$3);
         return blw.a(this.dM().B);
      } else {
         blw $$4 = super.b($$0, $$1);
         if ($$4.a() && this.m($$2)) {
            this.dM().a(null, this, this.d($$2), atm.g, 1.0F, awi.b(this.dM().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      awp $$5 = $$0.F_();
      cbw.a(this, $$5);
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
   public bnt e(bot $$0) {
      return $$0 == bot.g ? bT.a(this.dZ()) : super.e($$0);
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

      this.cg = awi.a(this.cg, 0, 20);
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
         enz $$5 = this.dk();
         cpd $$6 = this.u();
         double $$7 = (double)awi.b(this.af, -0.2F, 0.2F);
         double $$8 = (double)awi.b(this.af, 0.3F, 0.7F);
         double $$9 = (double)awi.b(this.af, -0.2F, 0.2F);
         cdw $$10 = new cdw(this.dM(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
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

   public static boolean c(bnw<? extends bzx> $$0, cvs $$1, bom $$2, hz $$3, awp $$4) {
      return $$1.a_($$3.d()).a(aua.bS) && a($$1, $$3);
   }
}
