import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import javax.annotation.Nullable;

public class cof extends coe implements cmf, cpb {
   private static final ajx<Boolean> bG = akb.a(cof.class, ajz.k);
   private static final ajx<Boolean> bH = akb.a(cof.class, ajz.k);
   private static final ajx<Boolean> bI = akb.a(cof.class, ajz.k);
   private static final aku bJ = aku.b("baby");
   private static final bxe bK = new bxe(bJ, 0.2F, bxe.a.b);
   private static final int bL = 16;
   private static final float bM = 0.35F;
   private static final int bN = 5;
   private static final float bO = 0.1F;
   private static final int bP = 3;
   private static final float bQ = 0.2F;
   private static final bvd bR = bvi.aR.n().a(0.5F).b(0.97F);
   private static final double bS = 0.5;
   private final btf bT = new btf(8);
   private boolean bU;
   protected static final ImmutableList<cgj<? extends cgi<? super cof>>> d = ImmutableList.of(cgj.c, cgj.d, cgj.b, cgj.f, cgj.l);
   protected static final ImmutableList<cfc<?>> bF = ImmutableList.of(
      cfc.n,
      cfc.v,
      cfc.g,
      cfc.h,
      cfc.k,
      cfc.l,
      cfc.ao,
      cfc.an,
      cfc.L,
      cfc.aP,
      cfc.x,
      cfc.y,
      new cfc[]{
         cfc.m,
         cfc.E,
         cfc.o,
         cfc.p,
         cfc.q,
         cfc.t,
         cfc.ab,
         cfc.ac,
         cfc.z,
         cfc.ad,
         cfc.ae,
         cfc.ag,
         cfc.af,
         cfc.ai,
         cfc.aj,
         cfc.ah,
         cfc.al,
         cfc.M,
         cfc.ar,
         cfc.s,
         cfc.as,
         cfc.at,
         cfc.ak,
         cfc.am,
         cfc.au,
         cfc.av,
         cfc.aw
      }
   );

   public cof(bvi<? extends coe> $$0, dgz $$1) {
      super($$0, $$1);
      this.bx = 5;
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      if (this.n_()) {
         $$0.a("IsBaby", true);
      }

      if (this.bU) {
         $$0.a("CannotHunt", true);
      }

      this.b($$0, this.dW());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.a($$0, this.dW());
   }

   @bag
   @Override
   public btf n() {
      return this.bT;
   }

   @Override
   protected void a(ard $$0, btp $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cme $$4 && $$4.x()) {
         cxh $$5 = new cxh(cxl.vs);
         $$4.gs();
         this.a($$0, $$5);
      }

      this.bT.f().forEach($$1x -> this.a($$0, $$1x));
   }

   protected cxh i(cxh $$0) {
      return this.bT.b($$0);
   }

   protected boolean j(cxh $$0) {
      return this.bT.c($$0);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bG, false);
      $$0.a(bH, false);
      $$0.a(bI, false);
   }

   @Override
   public void a(ajx<?> $$0) {
      super.a($$0);
      if (bG.equals($$0)) {
         this.i_();
      }
   }

   public static bxf.a gw() {
      return cms.gv().a(bxg.s, 16.0).a(bxg.v, 0.35F).a(bxg.c, 5.0);
   }

   public static boolean b(bvi<cof> $$0, dha $$1, bvh $$2, ji $$3, azh $$4) {
      return !$$1.a_($$3.e()).a(dkg.lm);
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      azh $$4 = $$0.C_();
      if ($$2 != bvh.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.t()) {
            this.a(bvj.a, this.gy());
         }
      }

      cog.a(this, $$0.C_());
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean aa() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.gb();
   }

   @Override
   protected void a(azh $$0, bsw $$1) {
      if (this.t()) {
         this.a(bvj.f, new cxh(cxl.qv), $$0);
         this.a(bvj.e, new cxh(cxl.qw), $$0);
         this.a(bvj.d, new cxh(cxl.qx), $$0);
         this.a(bvj.c, new cxh(cxl.qy), $$0);
      }
   }

   private void a(bvj $$0, cxh $$1, azh $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bxa.b<cof> eb() {
      return bxa.a(bF, d);
   }

   @Override
   protected bxa<?> a(Dynamic<?> $$0) {
      return cog.a(this, this.eb().a($$0));
   }

   @Override
   public bxa<cof> ea() {
      return (bxa<cof>)super.ea();
   }

   @Override
   public bsy b(cpr $$0, bsx $$1) {
      bsy $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (this.dU() instanceof ard $$3) {
         return cog.a($$3, this, $$0, $$1);
      } else {
         boolean $$4 = cog.b(this, $$0.b($$1)) && this.x() != coh.d;
         return (bsy)($$4 ? bsy.a : bsy.e);
      }
   }

   @Override
   public bvd e(bwk $$0) {
      return this.n_() ? bR : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(bG, $$0);
      if (!this.dU().C) {
         bxc $$1 = this.g(bxg.v);
         $$1.c(bK.b());
         if ($$0) {
            $$1.b(bK);
         }
      }
   }

   @Override
   public boolean n_() {
      return this.au().a(bG);
   }

   private void y(boolean $$0) {
      this.bU = $$0;
   }

   @Override
   protected boolean j() {
      return !this.bU;
   }

   @Override
   protected void a(ard $$0) {
      bpj $$1 = bpi.a();
      $$1.a("piglinBrain");
      this.ea().a($$0, this);
      $$1.c();
      cog.a(this);
      super.a($$0);
   }

   @Override
   protected int e(ard $$0) {
      return this.bx;
   }

   @Override
   protected void g(ard $$0) {
      cog.a($$0, this);
      this.bT.f().forEach($$1 -> this.a($$0, $$1));
      super.g($$0);
   }

   private cxh gy() {
      return (double)this.ae.i() < 0.5 ? new cxh(cxl.wX) : new cxh(cxl.pD);
   }

   @Override
   public axf<cxd> Y() {
      return this.n_() ? null : awy.bU;
   }

   private boolean gz() {
      return this.al.a(bH);
   }

   @Override
   public void b(boolean $$0) {
      this.al.a(bH, $$0);
   }

   @Override
   public void a() {
      this.bd = 0;
   }

   @Override
   public coh x() {
      if (this.gx()) {
         return coh.e;
      } else if (cog.a(this.fa())) {
         return coh.d;
      } else if (this.gj() && this.gs()) {
         return coh.a;
      } else if (this.gz()) {
         return coh.c;
      } else {
         return this.b(cxl.wX) && cvz.g(this.dY()) ? coh.b : coh.f;
      }
   }

   public boolean gx() {
      return this.al.a(bI);
   }

   public void x(boolean $$0) {
      this.al.a(bI, $$0);
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bvy $$4) {
         cog.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   public void a(bvy $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(cyc $$0) {
      return $$0 == cxl.wX;
   }

   protected void k(cxh $$0) {
      this.b(bvj.a, $$0);
   }

   protected void l(cxh $$0) {
      if ($$0.a(cog.c)) {
         this.a(bvj.b, $$0);
         this.g(bvj.b);
      } else {
         this.b(bvj.b, $$0);
      }
   }

   @Override
   public boolean c(ard $$0, cxh $$1) {
      return $$0.O().b(dgv.c) && this.fP() && cog.a(this, $$1);
   }

   protected boolean m(cxh $$0) {
      bvj $$1 = this.f($$0);
      cxh $$2 = this.a($$1);
      return this.a($$0, $$2, $$1);
   }

   @Override
   protected boolean a(cxh $$0, cxh $$1, bvj $$2) {
      if (ddt.a($$1, dds.E)) {
         return false;
      } else {
         axf<cxd> $$3 = this.Y();
         boolean $$4 = cog.a($$0) || $$3 != null && $$0.a($$3);
         boolean $$5 = cog.a($$1) || $$3 != null && $$1.a($$3);
         if ($$4 && !$$5) {
            return true;
         } else {
            return !$$4 && $$5 ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(ard $$0, clw $$1) {
      this.a($$1);
      cog.a($$0, this, $$1);
   }

   @Override
   public boolean a(bva $$0, boolean $$1) {
      if (this.n_() && $$0.aq() == bvi.aj) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bva b(bva $$0, int $$1) {
      List<bva> $$2 = $$0.cX();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected avz u() {
      return this.dU().C ? null : cog.b(this).orElse(null);
   }

   @Override
   protected avz e(btp $$0) {
      return awa.uv;
   }

   @Override
   protected avz l_() {
      return awa.ut;
   }

   @Override
   protected void b(ji $$0, dxq $$1) {
      this.a(awa.ux, 0.15F, 1.0F);
   }

   @Override
   protected void gt() {
      this.b(awa.uy);
   }
}
