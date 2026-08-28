import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import javax.annotation.Nullable;

public class cpn extends cpm implements cnm, cqi {
   private static final akj<Boolean> bG = akn.a(cpn.class, akl.k);
   private static final akj<Boolean> bH = akn.a(cpn.class, akl.k);
   private static final akj<Boolean> bI = akn.a(cpn.class, akl.k);
   private static final alg bJ = alg.b("baby");
   private static final byg bK = new byg(bJ, 0.2F, byg.a.b);
   private static final int bL = 16;
   private static final float bM = 0.35F;
   private static final int bN = 5;
   private static final float bO = 0.1F;
   private static final int bP = 3;
   private static final float bQ = 0.2F;
   private static final bwg bR = bwm.aR.n().a(0.5F).b(0.97F);
   private static final double bS = 0.5;
   private final bui bT = new bui(8);
   private boolean bU;
   protected static final ImmutableList<chl<? extends chk<? super cpn>>> d = ImmutableList.of(chl.c, chl.d, chl.b, chl.f, chl.l);
   protected static final ImmutableList<cge<?>> bF = ImmutableList.of(
      cge.o,
      cge.w,
      cge.g,
      cge.h,
      cge.k,
      cge.l,
      cge.ap,
      cge.ao,
      cge.M,
      cge.aQ,
      cge.y,
      cge.z,
      new cge[]{
         cge.n,
         cge.F,
         cge.p,
         cge.q,
         cge.r,
         cge.u,
         cge.ac,
         cge.ad,
         cge.A,
         cge.ae,
         cge.af,
         cge.ah,
         cge.ag,
         cge.aj,
         cge.ak,
         cge.ai,
         cge.am,
         cge.N,
         cge.as,
         cge.t,
         cge.at,
         cge.au,
         cge.al,
         cge.an,
         cge.av,
         cge.aw,
         cge.ax
      }
   );

   public cpn(bwm<? extends cpm> $$0, div $$1) {
      super($$0, $$1);
      this.bx = 5;
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      if (this.n_()) {
         $$0.a("IsBaby", true);
      }

      if (this.bU) {
         $$0.a("CannotHunt", true);
      }

      this.b($$0, this.dX());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.a($$0, this.dX());
   }

   @bav
   @Override
   public bui n() {
      return this.bT;
   }

   @Override
   protected void a(arq $$0, bus $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cnl $$4 && $$4.x()) {
         cyy $$5 = new cyy(czc.vw);
         $$4.gq();
         this.a($$0, $$5);
      }

      this.bT.f().forEach($$1x -> this.a($$0, $$1x));
   }

   protected cyy j(cyy $$0) {
      return this.bT.b($$0);
   }

   protected boolean k(cyy $$0) {
      return this.bT.c($$0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bG, false);
      $$0.a(bH, false);
      $$0.a(bI, false);
   }

   @Override
   public void a(akj<?> $$0) {
      super.a($$0);
      if (bG.equals($$0)) {
         this.i_();
      }
   }

   public static byh.a gu() {
      return cnz.gt().a(byi.s, 16.0).a(byi.v, 0.35F).a(byi.c, 5.0);
   }

   public static boolean b(bwm<cpn> $$0, diw $$1, bwl $$2, iu $$3, azv $$4) {
      return !$$1.a_($$3.e()).a(dmc.ln);
   }

   @Nullable
   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      azv $$4 = $$0.C_();
      if ($$2 != bwl.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.t()) {
            this.a(bwn.a, this.gw());
         }
      }

      cpo.a(this, $$0.C_());
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
      return !this.fZ();
   }

   @Override
   protected void a(azv $$0, btz $$1) {
      if (this.t()) {
         this.a(bwn.f, new cyy(czc.qz), $$0);
         this.a(bwn.e, new cyy(czc.qA), $$0);
         this.a(bwn.d, new cyy(czc.qB), $$0);
         this.a(bwn.c, new cyy(czc.qC), $$0);
      }
   }

   private void a(bwn $$0, cyy $$1, azv $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected byc.b<cpn> ec() {
      return byc.a(bF, d);
   }

   @Override
   protected byc<?> a(Dynamic<?> $$0) {
      return cpo.a(this, this.ec().a($$0));
   }

   @Override
   public byc<cpn> eb() {
      return (byc<cpn>)super.eb();
   }

   @Override
   public bub b(cqy $$0, bua $$1) {
      bub $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (this.dV() instanceof arq $$3) {
         return cpo.a($$3, this, $$0, $$1);
      } else {
         boolean $$4 = cpo.b(this, $$0.b($$1)) && this.x() != cpp.d;
         return (bub)($$4 ? bub.a : bub.e);
      }
   }

   @Override
   public bwg e(bxo $$0) {
      return this.n_() ? bR : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(bG, $$0);
      if (!this.dV().C) {
         bye $$1 = this.g(byi.v);
         $$1.c(bK.a());
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
   protected void a(arq $$0) {
      bqm $$1 = bql.a();
      $$1.a("piglinBrain");
      this.eb().a($$0, this);
      $$1.c();
      cpo.a(this);
      super.a($$0);
   }

   @Override
   protected int e(arq $$0) {
      return this.bx;
   }

   @Override
   protected void g(arq $$0) {
      cpo.a($$0, this);
      this.bT.f().forEach($$1 -> this.a($$0, $$1));
      super.g($$0);
   }

   private cyy gw() {
      return (double)this.ae.i() < 0.5 ? new cyy(czc.xb) : new cyy(czc.pH);
   }

   @Nullable
   @Override
   public axr<cyu> Y() {
      return this.n_() ? null : axk.bU;
   }

   private boolean gx() {
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
   public cpp x() {
      if (this.gv()) {
         return cpp.e;
      } else if (cpo.a(this.fb())) {
         return cpp.d;
      } else if (this.gh() && this.gq()) {
         return cpp.a;
      } else if (this.gx()) {
         return cpp.c;
      } else {
         return this.b(czc.xb) && cxr.g(this.dZ()) ? cpp.b : cpp.f;
      }
   }

   public boolean gv() {
      return this.al.a(bI);
   }

   public void x(boolean $$0) {
      this.al.a(bI, $$0);
   }

   @Override
   public boolean a(arq $$0, bus $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bxc $$4) {
         cpo.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   public void a(bxc $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(czt $$0) {
      return $$0 == czc.xb;
   }

   protected void l(cyy $$0) {
      this.b(bwn.a, $$0);
   }

   protected void m(cyy $$0) {
      if ($$0.a(cpo.c)) {
         this.a(bwn.b, $$0);
         this.g(bwn.b);
      } else {
         this.b(bwn.b, $$0);
      }
   }

   @Override
   public boolean c(arq $$0, cyy $$1) {
      return $$0.O().c(dir.c) && this.fM() && cpo.a(this, $$1);
   }

   protected boolean n(cyy $$0) {
      bwn $$1 = this.g($$0);
      cyy $$2 = this.a($$1);
      return this.a($$0, $$2, $$1);
   }

   @Override
   protected boolean a(cyy $$0, cyy $$1, bwn $$2) {
      if (dfn.a($$1, dfm.E)) {
         return false;
      } else {
         axr<cyu> $$3 = this.Y();
         boolean $$4 = cpo.a($$0) || $$3 != null && $$0.a($$3);
         boolean $$5 = cpo.a($$1) || $$3 != null && $$1.a($$3);
         if ($$4 && !$$5) {
            return true;
         } else {
            return !$$4 && $$5 ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(arq $$0, cnd $$1) {
      this.a($$1);
      cpo.a($$0, this, $$1);
   }

   @Override
   public boolean a(bwd $$0, boolean $$1) {
      if (this.n_() && $$0.aq() == bwm.aj) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bwd b(bwd $$0, int $$1) {
      List<bwd> $$2 = $$0.cY();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.getFirst(), $$1 - 1) : $$0;
   }

   @Nullable
   @Override
   protected awm u() {
      return this.dV().C ? null : cpo.b(this).orElse(null);
   }

   @Override
   protected awm e(bus $$0) {
      return awn.uw;
   }

   @Override
   protected awm l_() {
      return awn.uu;
   }

   @Override
   protected void b(iu $$0, dzz $$1) {
      this.a(awn.uy, 0.15F, 1.0F);
   }

   @Override
   protected void gr() {
      this.b(awn.uz);
   }
}
