import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import javax.annotation.Nullable;

public class cqx extends cqw implements cox, crs {
   private static final aku<Boolean> bI = aky.a(cqx.class, akw.k);
   private static final aku<Boolean> bJ = aky.a(cqx.class, akw.k);
   private static final aku<Boolean> bK = aky.a(cqx.class, akw.k);
   private static final alr bL = alr.b("baby");
   private static final bzj bM = new bzj(bL, 0.2F, bzj.a.b);
   private static final int bN = 16;
   private static final float bO = 0.35F;
   private static final int bP = 5;
   private static final float bQ = 0.1F;
   private static final int bR = 3;
   private static final float bS = 0.2F;
   private static final bxh bT = bxn.aS.n().a(0.5F).b(0.97F);
   private static final double bU = 0.5;
   private static final boolean bV = false;
   private static final boolean bW = false;
   private final bvj bX = new bvj(8);
   private boolean bY = false;
   protected static final ImmutableList<cio<? extends cin<? super cqx>>> d = ImmutableList.of(cio.c, cio.d, cio.b, cio.f, cio.l);
   protected static final ImmutableList<chh<?>> e = ImmutableList.of(
      chh.o,
      chh.w,
      chh.g,
      chh.h,
      chh.k,
      chh.l,
      chh.ap,
      chh.ao,
      chh.M,
      chh.aQ,
      chh.y,
      chh.z,
      new chh[]{
         chh.n,
         chh.F,
         chh.p,
         chh.q,
         chh.r,
         chh.u,
         chh.ac,
         chh.ad,
         chh.A,
         chh.ae,
         chh.af,
         chh.ah,
         chh.ag,
         chh.aj,
         chh.ak,
         chh.ai,
         chh.am,
         chh.N,
         chh.as,
         chh.t,
         chh.at,
         chh.au,
         chh.al,
         chh.an,
         chh.av,
         chh.aw,
         chh.ax
      }
   );

   public cqx(bxn<? extends cqw> $$0, dkj $$1) {
      super($$0, $$1);
      this.bA = 5;
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.e_());
      $$0.a("CannotHunt", this.bY);
      this.b($$0, this.dX());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a($$0.b("IsBaby", false));
      this.y($$0.b("CannotHunt", false));
      this.a($$0, this.dX());
   }

   @bbi
   @Override
   public bvj u() {
      return this.bX;
   }

   @Override
   protected void a(asb $$0, bvt $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cow $$4 && $$4.gw()) {
         dak $$5 = new dak(dao.vB);
         $$4.gx();
         this.a($$0, $$5);
      }

      this.bX.f().forEach($$1x -> this.a($$0, $$1x));
   }

   protected dak i(dak $$0) {
      return this.bX.b($$0);
   }

   protected boolean j(dak $$0) {
      return this.bX.c($$0);
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(bI, false);
      $$0.a(bJ, false);
      $$0.a(bK, false);
   }

   @Override
   public void a(aku<?> $$0) {
      super.a($$0);
      if (bI.equals($$0)) {
         this.h_();
      }
   }

   public static bzk.a gB() {
      return cpk.gA().a(bzl.s, 16.0).a(bzl.v, 0.35F).a(bzl.c, 5.0);
   }

   public static boolean b(bxn<cqx> $$0, dkk $$1, bxm $$2, iw $$3, bai $$4) {
      return !$$1.a_($$3.e()).a(dnq.lq);
   }

   @Nullable
   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      bai $$4 = $$0.G_();
      if ($$2 != bxm.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.gv()) {
            this.a(bxo.a, this.gD());
         }
      }

      cqy.a(this, $$0.G_());
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean Z() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.gd();
   }

   @Override
   protected void a(bai $$0, bva $$1) {
      if (this.gv()) {
         this.a(bxo.f, new dak(dao.qC), $$0);
         this.a(bxo.e, new dak(dao.qD), $$0);
         this.a(bxo.d, new dak(dao.qE), $$0);
         this.a(bxo.c, new dak(dao.qF), $$0);
      }
   }

   private void a(bxo $$0, dak $$1, bai $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bzf.b<cqx> ed() {
      return bzf.a(e, d);
   }

   @Override
   protected bzf<?> a(Dynamic<?> $$0) {
      return cqy.a(this, this.ed().a($$0));
   }

   @Override
   public bzf<cqx> ec() {
      return (bzf<cqx>)super.ec();
   }

   @Override
   public bvc b(csi $$0, bvb $$1) {
      bvc $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (this.dV() instanceof asb $$3) {
         return cqy.a($$3, this, $$0, $$1);
      } else {
         boolean $$4 = cqy.b(this, $$0.b($$1)) && this.gw() != cqz.d;
         return (bvc)($$4 ? bvc.a : bvc.e);
      }
   }

   @Override
   public bxh e(byr $$0) {
      return this.e_() ? bT : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.ar().a(bI, $$0);
      if (!this.dV().C) {
         bzh $$1 = this.g(bzl.v);
         $$1.c(bM.a());
         if ($$0) {
            $$1.b(bM);
         }
      }
   }

   @Override
   public boolean e_() {
      return this.ar().a(bI);
   }

   private void y(boolean $$0) {
      this.bY = $$0;
   }

   @Override
   protected boolean m() {
      return !this.bY;
   }

   @Override
   protected void a(asb $$0) {
      brm $$1 = brl.a();
      $$1.a("piglinBrain");
      this.ec().a($$0, this);
      $$1.c();
      cqy.a(this);
      super.a($$0);
   }

   @Override
   protected int e(asb $$0) {
      return this.bA;
   }

   @Override
   protected void g(asb $$0) {
      cqy.a($$0, this);
      this.bX.f().forEach($$1 -> this.a($$0, $$1));
      super.g($$0);
   }

   private dak gD() {
      return (double)this.ae.i() < 0.5 ? new dak(dao.xg) : new dak(dao.pK);
   }

   @Nullable
   @Override
   public ayc<dag> X() {
      return this.e_() ? null : axv.bW;
   }

   private boolean gE() {
      return this.al.a(bJ);
   }

   @Override
   public void b(boolean $$0) {
      this.al.a(bJ, $$0);
   }

   @Override
   public void a() {
      this.bd = 0;
   }

   @Override
   public cqz gw() {
      if (this.gC()) {
         return cqz.e;
      } else if (cqy.a(this.fc())) {
         return cqz.d;
      } else if (this.gl() && this.gx()) {
         return cqz.a;
      } else if (this.gE()) {
         return cqz.c;
      } else {
         return this.b(dao.xg) && czd.g(this.dZ()) ? cqz.b : cqz.f;
      }
   }

   public boolean gC() {
      return this.al.a(bK);
   }

   public void x(boolean $$0) {
      this.al.a(bK, $$0);
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof byf $$4) {
         cqy.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   public void a(byf $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(dbf $$0) {
      return $$0 == dao.xg;
   }

   protected void k(dak $$0) {
      this.b(bxo.a, $$0);
   }

   protected void l(dak $$0) {
      if ($$0.a(cqy.c)) {
         this.a(bxo.b, $$0);
         this.g(bxo.b);
      } else {
         this.b(bxo.b, $$0);
      }
   }

   @Override
   public boolean c(asb $$0, dak $$1) {
      return $$0.O().c(dkf.d) && this.fN() && cqy.a(this, $$1);
   }

   protected boolean m(dak $$0) {
      bxo $$1 = this.f($$0);
      dak $$2 = this.a($$1);
      return this.a($$0, $$2, $$1);
   }

   @Override
   protected boolean a(dak $$0, dak $$1, bxo $$2) {
      if (dgz.a($$1, dgy.E)) {
         return false;
      } else {
         ayc<dag> $$3 = this.X();
         boolean $$4 = cqy.a($$0) || $$3 != null && $$0.a($$3);
         boolean $$5 = cqy.a($$1) || $$3 != null && $$1.a($$3);
         if ($$4 && !$$5) {
            return true;
         } else {
            return !$$4 && $$5 ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(asb $$0, coo $$1) {
      this.a($$1);
      cqy.a($$0, this, $$1);
   }

   @Override
   public boolean a(bxe $$0, boolean $$1) {
      if (this.e_() && $$0.an() == bxn.ak) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bxe b(bxe $$0, int $$1) {
      List<bxe> $$2 = $$0.cY();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.getFirst(), $$1 - 1) : $$0;
   }

   @Nullable
   @Override
   protected awx s() {
      return this.dV().C ? null : cqy.b(this).orElse(null);
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.uz;
   }

   @Override
   protected awx j_() {
      return awy.ux;
   }

   @Override
   protected void b(iw $$0, ebq $$1) {
      this.a(awy.uB, 0.15F, 1.0F);
   }

   @Override
   protected void gy() {
      this.b(awy.uC);
   }
}
