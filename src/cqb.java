import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import javax.annotation.Nullable;

public class cqb extends cqa implements coa, cqw {
   private static final akj<Boolean> bH = akn.a(cqb.class, akl.k);
   private static final akj<Boolean> bI = akn.a(cqb.class, akl.k);
   private static final akj<Boolean> bJ = akn.a(cqb.class, akl.k);
   private static final alg bK = alg.b("baby");
   private static final byn bL = new byn(bK, 0.2F, byn.a.b);
   private static final int bM = 16;
   private static final float bN = 0.35F;
   private static final int bO = 5;
   private static final float bP = 0.1F;
   private static final int bQ = 3;
   private static final float bR = 0.2F;
   private static final bwl bS = bwr.aR.n().a(0.5F).b(0.97F);
   private static final double bT = 0.5;
   private final bun bU = new bun(8);
   private boolean bV;
   protected static final ImmutableList<chs<? extends chr<? super cqb>>> d = ImmutableList.of(chs.c, chs.d, chs.b, chs.f, chs.l);
   protected static final ImmutableList<cgl<?>> bG = ImmutableList.of(
      cgl.o,
      cgl.w,
      cgl.g,
      cgl.h,
      cgl.k,
      cgl.l,
      cgl.ap,
      cgl.ao,
      cgl.M,
      cgl.aQ,
      cgl.y,
      cgl.z,
      new cgl[]{
         cgl.n,
         cgl.F,
         cgl.p,
         cgl.q,
         cgl.r,
         cgl.u,
         cgl.ac,
         cgl.ad,
         cgl.A,
         cgl.ae,
         cgl.af,
         cgl.ah,
         cgl.ag,
         cgl.aj,
         cgl.ak,
         cgl.ai,
         cgl.am,
         cgl.N,
         cgl.as,
         cgl.t,
         cgl.at,
         cgl.au,
         cgl.al,
         cgl.an,
         cgl.av,
         cgl.aw,
         cgl.ax
      }
   );

   public cqb(bwr<? extends cqa> $$0, djm $$1) {
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

      this.b($$0, this.dW());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0.o("IsBaby"));
      this.y($$0.o("CannotHunt"));
      this.a($$0, this.dW());
   }

   @bav
   @Override
   public bun n() {
      return this.bU;
   }

   @Override
   protected void a(arq $$0, bux $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cnz $$4 && $$4.x()) {
         czn $$5 = new czn(czr.vB);
         $$4.gt();
         this.a($$0, $$5);
      }

      this.bU.f().forEach($$1x -> this.a($$0, $$1x));
   }

   protected czn i(czn $$0) {
      return this.bU.b($$0);
   }

   protected boolean j(czn $$0) {
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

   public static byo.a gx() {
      return coo.gw().a(byp.s, 16.0).a(byp.v, 0.35F).a(byp.c, 5.0);
   }

   public static boolean b(bwr<cqb> $$0, djn $$1, bwq $$2, iv $$3, azv $$4) {
      return !$$1.a_($$3.e()).a(dmt.lq);
   }

   @Nullable
   @Override
   public byb a(dkd $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      azv $$4 = $$0.C_();
      if ($$2 != bwq.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.t()) {
            this.a(bws.a, this.gz());
         }
      }

      cqc.a(this, $$0.C_());
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
      return !this.gc();
   }

   @Override
   protected void a(azv $$0, bue $$1) {
      if (this.t()) {
         this.a(bws.f, new czn(czr.qC), $$0);
         this.a(bws.e, new czn(czr.qD), $$0);
         this.a(bws.d, new czn(czr.qE), $$0);
         this.a(bws.c, new czn(czr.qF), $$0);
      }
   }

   private void a(bws $$0, czn $$1, azv $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected byj.b<cqb> ec() {
      return byj.a(bG, d);
   }

   @Override
   protected byj<?> a(Dynamic<?> $$0) {
      return cqc.a(this, this.ec().a($$0));
   }

   @Override
   public byj<cqb> eb() {
      return (byj<cqb>)super.eb();
   }

   @Override
   public bug b(crm $$0, buf $$1) {
      bug $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (this.dU() instanceof arq $$3) {
         return cqc.a($$3, this, $$0, $$1);
      } else {
         boolean $$4 = cqc.b(this, $$0.b($$1)) && this.x() != cqd.d;
         return (bug)($$4 ? bug.a : bug.e);
      }
   }

   @Override
   public bwl e(bxv $$0) {
      return this.n_() ? bS : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.ar().a(bH, $$0);
      if (!this.dU().C) {
         byl $$1 = this.g(byp.v);
         $$1.c(bL.a());
         if ($$0) {
            $$1.b(bL);
         }
      }
   }

   @Override
   public boolean n_() {
      return this.ar().a(bH);
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
      bqq $$1 = bqp.a();
      $$1.a("piglinBrain");
      this.eb().a($$0, this);
      $$1.c();
      cqc.a(this);
      super.a($$0);
   }

   @Override
   protected int e(arq $$0) {
      return this.by;
   }

   @Override
   protected void g(arq $$0) {
      cqc.a($$0, this);
      this.bU.f().forEach($$1 -> this.a($$0, $$1));
      super.g($$0);
   }

   private czn gz() {
      return (double)this.ae.i() < 0.5 ? new czn(czr.xg) : new czn(czr.pK);
   }

   @Nullable
   @Override
   public axr<czj> Y() {
      return this.n_() ? null : axk.bV;
   }

   private boolean gA() {
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
   public cqd x() {
      if (this.gy()) {
         return cqd.e;
      } else if (cqc.a(this.fb())) {
         return cqd.d;
      } else if (this.gk() && this.gt()) {
         return cqd.a;
      } else if (this.gA()) {
         return cqd.c;
      } else {
         return this.b(czr.xg) && cyg.g(this.dY()) ? cqd.b : cqd.f;
      }
   }

   public boolean gy() {
      return this.al.a(bJ);
   }

   public void x(boolean $$0) {
      this.al.a(bJ, $$0);
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bxj $$4) {
         cqc.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   public void a(bxj $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(dai $$0) {
      return $$0 == czr.xg;
   }

   protected void k(czn $$0) {
      this.b(bws.a, $$0);
   }

   protected void l(czn $$0) {
      if ($$0.a(cqc.c)) {
         this.a(bws.b, $$0);
         this.g(bws.b);
      } else {
         this.b(bws.b, $$0);
      }
   }

   @Override
   public boolean c(arq $$0, czn $$1) {
      return $$0.O().c(dji.d) && this.fM() && cqc.a(this, $$1);
   }

   protected boolean m(czn $$0) {
      bws $$1 = this.f($$0);
      czn $$2 = this.a($$1);
      return this.a($$0, $$2, $$1);
   }

   @Override
   protected boolean a(czn $$0, czn $$1, bws $$2) {
      if (dgc.a($$1, dgb.E)) {
         return false;
      } else {
         axr<czj> $$3 = this.Y();
         boolean $$4 = cqc.a($$0) || $$3 != null && $$0.a($$3);
         boolean $$5 = cqc.a($$1) || $$3 != null && $$1.a($$3);
         if ($$4 && !$$5) {
            return true;
         } else {
            return !$$4 && $$5 ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(arq $$0, cnr $$1) {
      this.a($$1);
      cqc.a($$0, this, $$1);
   }

   @Override
   public boolean a(bwi $$0, boolean $$1) {
      if (this.n_() && $$0.an() == bwr.aj) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bwi b(bwi $$0, int $$1) {
      List<bwi> $$2 = $$0.cX();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.getFirst(), $$1 - 1) : $$0;
   }

   @Nullable
   @Override
   protected awm u() {
      return this.dU().C ? null : cqc.b(this).orElse(null);
   }

   @Override
   protected awm e(bux $$0) {
      return awn.uz;
   }

   @Override
   protected awm l_() {
      return awn.ux;
   }

   @Override
   protected void b(iv $$0, eat $$1) {
      this.a(awn.uB, 0.15F, 1.0F);
   }

   @Override
   protected void gu() {
      this.b(awn.uC);
   }
}
