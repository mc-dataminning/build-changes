import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import javax.annotation.Nullable;

public class cpr extends cpq implements cnq, cqm {
   private static final akj<Boolean> bH = akn.a(cpr.class, akl.k);
   private static final akj<Boolean> bI = akn.a(cpr.class, akl.k);
   private static final akj<Boolean> bJ = akn.a(cpr.class, akl.k);
   private static final alg bK = alg.b("baby");
   private static final byi bL = new byi(bK, 0.2F, byi.a.b);
   private static final int bM = 16;
   private static final float bN = 0.35F;
   private static final int bO = 5;
   private static final float bP = 0.1F;
   private static final int bQ = 3;
   private static final float bR = 0.2F;
   private static final bwi bS = bwo.aR.n().a(0.5F).b(0.97F);
   private static final double bT = 0.5;
   private final buk bU = new buk(8);
   private boolean bV;
   protected static final ImmutableList<chn<? extends chm<? super cpr>>> d = ImmutableList.of(chn.c, chn.d, chn.b, chn.f, chn.l);
   protected static final ImmutableList<cgg<?>> bG = ImmutableList.of(
      cgg.o,
      cgg.w,
      cgg.g,
      cgg.h,
      cgg.k,
      cgg.l,
      cgg.ap,
      cgg.ao,
      cgg.M,
      cgg.aQ,
      cgg.y,
      cgg.z,
      new cgg[]{
         cgg.n,
         cgg.F,
         cgg.p,
         cgg.q,
         cgg.r,
         cgg.u,
         cgg.ac,
         cgg.ad,
         cgg.A,
         cgg.ae,
         cgg.af,
         cgg.ah,
         cgg.ag,
         cgg.aj,
         cgg.ak,
         cgg.ai,
         cgg.am,
         cgg.N,
         cgg.as,
         cgg.t,
         cgg.at,
         cgg.au,
         cgg.al,
         cgg.an,
         cgg.av,
         cgg.aw,
         cgg.ax
      }
   );

   public cpr(bwo<? extends cpq> $$0, dja $$1) {
      super($$0, $$1);
      this.by = 5;
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      if (this.n_()) {
         $$0.a("IsBaby", true);
      }

      if (this.bV) {
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
   public buk n() {
      return this.bU;
   }

   @Override
   protected void a(arq $$0, buu $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cnp $$4 && $$4.x()) {
         czd $$5 = new czd(czh.vB);
         $$4.gr();
         this.a($$0, $$5);
      }

      this.bU.f().forEach($$1x -> this.a($$0, $$1x));
   }

   protected czd i(czd $$0) {
      return this.bU.b($$0);
   }

   protected boolean j(czd $$0) {
      return this.bU.c($$0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bH, false);
      $$0.a(bI, false);
      $$0.a(bJ, false);
   }

   @Override
   public void a(akj<?> $$0) {
      super.a($$0);
      if (bH.equals($$0)) {
         this.i_();
      }
   }

   public static byj.a gv() {
      return cod.gu().a(byk.s, 16.0).a(byk.v, 0.35F).a(byk.c, 5.0);
   }

   public static boolean b(bwo<cpr> $$0, djb $$1, bwn $$2, iu $$3, azv $$4) {
      return !$$1.a_($$3.e()).a(dmh.lq);
   }

   @Nullable
   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      azv $$4 = $$0.C_();
      if ($$2 != bwn.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.t()) {
            this.a(bwp.a, this.gx());
         }
      }

      cps.a(this, $$0.C_());
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
      return !this.ga();
   }

   @Override
   protected void a(azv $$0, bub $$1) {
      if (this.t()) {
         this.a(bwp.f, new czd(czh.qC), $$0);
         this.a(bwp.e, new czd(czh.qD), $$0);
         this.a(bwp.d, new czd(czh.qE), $$0);
         this.a(bwp.c, new czd(czh.qF), $$0);
      }
   }

   private void a(bwp $$0, czd $$1, azv $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bye.b<cpr> ed() {
      return bye.a(bG, d);
   }

   @Override
   protected bye<?> a(Dynamic<?> $$0) {
      return cps.a(this, this.ed().a($$0));
   }

   @Override
   public bye<cpr> ec() {
      return (bye<cpr>)super.ec();
   }

   @Override
   public bud b(crc $$0, buc $$1) {
      bud $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (this.dV() instanceof arq $$3) {
         return cps.a($$3, this, $$0, $$1);
      } else {
         boolean $$4 = cps.b(this, $$0.b($$1)) && this.x() != cpt.d;
         return (bud)($$4 ? bud.a : bud.e);
      }
   }

   @Override
   public bwi e(bxq $$0) {
      return this.n_() ? bS : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(bH, $$0);
      if (!this.dV().C) {
         byg $$1 = this.g(byk.v);
         $$1.c(bL.a());
         if ($$0) {
            $$1.b(bL);
         }
      }
   }

   @Override
   public boolean n_() {
      return this.au().a(bH);
   }

   private void y(boolean $$0) {
      this.bV = $$0;
   }

   @Override
   protected boolean j() {
      return !this.bV;
   }

   @Override
   protected void a(arq $$0) {
      bqo $$1 = bqn.a();
      $$1.a("piglinBrain");
      this.ec().a($$0, this);
      $$1.c();
      cps.a(this);
      super.a($$0);
   }

   @Override
   protected int e(arq $$0) {
      return this.by;
   }

   @Override
   protected void g(arq $$0) {
      cps.a($$0, this);
      this.bU.f().forEach($$1 -> this.a($$0, $$1));
      super.g($$0);
   }

   private czd gx() {
      return (double)this.ae.i() < 0.5 ? new czd(czh.xg) : new czd(czh.pK);
   }

   @Nullable
   @Override
   public axr<cyz> Y() {
      return this.n_() ? null : axk.bV;
   }

   private boolean gy() {
      return this.al.a(bI);
   }

   @Override
   public void b(boolean $$0) {
      this.al.a(bI, $$0);
   }

   @Override
   public void a() {
      this.bd = 0;
   }

   @Override
   public cpt x() {
      if (this.gw()) {
         return cpt.e;
      } else if (cps.a(this.fc())) {
         return cpt.d;
      } else if (this.gi() && this.gr()) {
         return cpt.a;
      } else if (this.gy()) {
         return cpt.c;
      } else {
         return this.b(czh.xg) && cxw.g(this.dZ()) ? cpt.b : cpt.f;
      }
   }

   public boolean gw() {
      return this.al.a(bJ);
   }

   public void x(boolean $$0) {
      this.al.a(bJ, $$0);
   }

   @Override
   public boolean a(arq $$0, buu $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bxe $$4) {
         cps.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   public void a(bxe $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(czy $$0) {
      return $$0 == czh.xg;
   }

   protected void k(czd $$0) {
      this.b(bwp.a, $$0);
   }

   protected void l(czd $$0) {
      if ($$0.a(cps.c)) {
         this.a(bwp.b, $$0);
         this.g(bwp.b);
      } else {
         this.b(bwp.b, $$0);
      }
   }

   @Override
   public boolean c(arq $$0, czd $$1) {
      return $$0.O().c(diw.d) && this.fN() && cps.a(this, $$1);
   }

   protected boolean m(czd $$0) {
      bwp $$1 = this.f($$0);
      czd $$2 = this.a($$1);
      return this.a($$0, $$2, $$1);
   }

   @Override
   protected boolean a(czd $$0, czd $$1, bwp $$2) {
      if (dfs.a($$1, dfr.E)) {
         return false;
      } else {
         axr<cyz> $$3 = this.Y();
         boolean $$4 = cps.a($$0) || $$3 != null && $$0.a($$3);
         boolean $$5 = cps.a($$1) || $$3 != null && $$1.a($$3);
         if ($$4 && !$$5) {
            return true;
         } else {
            return !$$4 && $$5 ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(arq $$0, cnh $$1) {
      this.a($$1);
      cps.a($$0, this, $$1);
   }

   @Override
   public boolean a(bwf $$0, boolean $$1) {
      if (this.n_() && $$0.aq() == bwo.aj) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bwf b(bwf $$0, int $$1) {
      List<bwf> $$2 = $$0.cY();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.getFirst(), $$1 - 1) : $$0;
   }

   @Nullable
   @Override
   protected awm u() {
      return this.dV().C ? null : cps.b(this).orElse(null);
   }

   @Override
   protected awm e(buu $$0) {
      return awn.uz;
   }

   @Override
   protected awm l_() {
      return awn.ux;
   }

   @Override
   protected void b(iu $$0, eah $$1) {
      this.a(awn.uB, 0.15F, 1.0F);
   }

   @Override
   protected void gs() {
      this.b(awn.uC);
   }
}
