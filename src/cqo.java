import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import javax.annotation.Nullable;

public class cqo extends cqn implements coo, crj {
   private static final akn<Boolean> bI = akr.a(cqo.class, akp.k);
   private static final akn<Boolean> bJ = akr.a(cqo.class, akp.k);
   private static final akn<Boolean> bK = akr.a(cqo.class, akp.k);
   private static final alk bL = alk.b("baby");
   private static final bza bM = new bza(bL, 0.2F, bza.a.b);
   private static final int bN = 16;
   private static final float bO = 0.35F;
   private static final int bP = 5;
   private static final float bQ = 0.1F;
   private static final int bR = 3;
   private static final float bS = 0.2F;
   private static final bwy bT = bxe.aS.n().a(0.5F).b(0.97F);
   private static final double bU = 0.5;
   private static final boolean bV = false;
   private static final boolean bW = false;
   private final bva bX = new bva(8);
   private boolean bY = false;
   protected static final ImmutableList<cif<? extends cie<? super cqo>>> d = ImmutableList.of(cif.c, cif.d, cif.b, cif.f, cif.l);
   protected static final ImmutableList<cgy<?>> e = ImmutableList.of(
      cgy.o,
      cgy.w,
      cgy.g,
      cgy.h,
      cgy.k,
      cgy.l,
      cgy.ap,
      cgy.ao,
      cgy.M,
      cgy.aQ,
      cgy.y,
      cgy.z,
      new cgy[]{
         cgy.n,
         cgy.F,
         cgy.p,
         cgy.q,
         cgy.r,
         cgy.u,
         cgy.ac,
         cgy.ad,
         cgy.A,
         cgy.ae,
         cgy.af,
         cgy.ah,
         cgy.ag,
         cgy.aj,
         cgy.ak,
         cgy.ai,
         cgy.am,
         cgy.N,
         cgy.as,
         cgy.t,
         cgy.at,
         cgy.au,
         cgy.al,
         cgy.an,
         cgy.av,
         cgy.aw,
         cgy.ax
      }
   );

   public cqo(bxe<? extends cqn> $$0, djz $$1) {
      super($$0, $$1);
      this.bA = 5;
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.n_());
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

   @baz
   @Override
   public bva n() {
      return this.bX;
   }

   @Override
   protected void a(aru $$0, bvk $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof com $$4 && $$4.x()) {
         daa $$5 = new daa(dae.vB);
         $$4.gu();
         this.a($$0, $$5);
      }

      this.bX.f().forEach($$1x -> this.a($$0, $$1x));
   }

   protected daa i(daa $$0) {
      return this.bX.b($$0);
   }

   protected boolean j(daa $$0) {
      return this.bX.c($$0);
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(bI, false);
      $$0.a(bJ, false);
      $$0.a(bK, false);
   }

   @Override
   public void a(akn<?> $$0) {
      super.a($$0);
      if (bI.equals($$0)) {
         this.i_();
      }
   }

   public static bzb.a gy() {
      return cpb.gx().a(bzc.s, 16.0).a(bzc.v, 0.35F).a(bzc.c, 5.0);
   }

   public static boolean b(bxe<cqo> $$0, dka $$1, bxd $$2, iw $$3, azz $$4) {
      return !$$1.a_($$3.e()).a(dng.lq);
   }

   @Nullable
   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      azz $$4 = $$0.G_();
      if ($$2 != bxd.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.t()) {
            this.a(bxf.a, this.gA());
         }
      }

      cqp.a(this, $$0.G_());
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
      return !this.gd();
   }

   @Override
   protected void a(azz $$0, bur $$1) {
      if (this.t()) {
         this.a(bxf.f, new daa(dae.qC), $$0);
         this.a(bxf.e, new daa(dae.qD), $$0);
         this.a(bxf.d, new daa(dae.qE), $$0);
         this.a(bxf.c, new daa(dae.qF), $$0);
      }
   }

   private void a(bxf $$0, daa $$1, azz $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected byw.b<cqo> ed() {
      return byw.a(e, d);
   }

   @Override
   protected byw<?> a(Dynamic<?> $$0) {
      return cqp.a(this, this.ed().a($$0));
   }

   @Override
   public byw<cqo> ec() {
      return (byw<cqo>)super.ec();
   }

   @Override
   public but b(crz $$0, bus $$1) {
      but $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (this.dV() instanceof aru $$3) {
         return cqp.a($$3, this, $$0, $$1);
      } else {
         boolean $$4 = cqp.b(this, $$0.b($$1)) && this.x() != cqq.d;
         return (but)($$4 ? but.a : but.e);
      }
   }

   @Override
   public bwy e(byi $$0) {
      return this.n_() ? bT : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.ar().a(bI, $$0);
      if (!this.dV().C) {
         byy $$1 = this.g(bzc.v);
         $$1.c(bM.a());
         if ($$0) {
            $$1.b(bM);
         }
      }
   }

   @Override
   public boolean n_() {
      return this.ar().a(bI);
   }

   private void y(boolean $$0) {
      this.bY = $$0;
   }

   @Override
   protected boolean j() {
      return !this.bY;
   }

   @Override
   protected void a(aru $$0) {
      brd $$1 = brc.a();
      $$1.a("piglinBrain");
      this.ec().a($$0, this);
      $$1.c();
      cqp.a(this);
      super.a($$0);
   }

   @Override
   protected int e(aru $$0) {
      return this.bA;
   }

   @Override
   protected void g(aru $$0) {
      cqp.a($$0, this);
      this.bX.f().forEach($$1 -> this.a($$0, $$1));
      super.g($$0);
   }

   private daa gA() {
      return (double)this.ae.i() < 0.5 ? new daa(dae.xg) : new daa(dae.pK);
   }

   @Nullable
   @Override
   public axv<czw> Y() {
      return this.n_() ? null : axo.bW;
   }

   private boolean gB() {
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
   public cqq x() {
      if (this.gz()) {
         return cqq.e;
      } else if (cqp.a(this.fc())) {
         return cqq.d;
      } else if (this.gl() && this.gu()) {
         return cqq.a;
      } else if (this.gB()) {
         return cqq.c;
      } else {
         return this.b(dae.xg) && cyt.g(this.dZ()) ? cqq.b : cqq.f;
      }
   }

   public boolean gz() {
      return this.al.a(bK);
   }

   public void x(boolean $$0) {
      this.al.a(bK, $$0);
   }

   @Override
   public boolean a(aru $$0, bvk $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bxw $$4) {
         cqp.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   public void a(bxw $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(dav $$0) {
      return $$0 == dae.xg;
   }

   protected void k(daa $$0) {
      this.b(bxf.a, $$0);
   }

   protected void l(daa $$0) {
      if ($$0.a(cqp.c)) {
         this.a(bxf.b, $$0);
         this.g(bxf.b);
      } else {
         this.b(bxf.b, $$0);
      }
   }

   @Override
   public boolean c(aru $$0, daa $$1) {
      return $$0.O().c(djv.d) && this.fN() && cqp.a(this, $$1);
   }

   protected boolean m(daa $$0) {
      bxf $$1 = this.f($$0);
      daa $$2 = this.a($$1);
      return this.a($$0, $$2, $$1);
   }

   @Override
   protected boolean a(daa $$0, daa $$1, bxf $$2) {
      if (dgp.a($$1, dgo.E)) {
         return false;
      } else {
         axv<czw> $$3 = this.Y();
         boolean $$4 = cqp.a($$0) || $$3 != null && $$0.a($$3);
         boolean $$5 = cqp.a($$1) || $$3 != null && $$1.a($$3);
         if ($$4 && !$$5) {
            return true;
         } else {
            return !$$4 && $$5 ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(aru $$0, coe $$1) {
      this.a($$1);
      cqp.a($$0, this, $$1);
   }

   @Override
   public boolean a(bwv $$0, boolean $$1) {
      if (this.n_() && $$0.an() == bxe.ak) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bwv b(bwv $$0, int $$1) {
      List<bwv> $$2 = $$0.cY();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.getFirst(), $$1 - 1) : $$0;
   }

   @Nullable
   @Override
   protected awq u() {
      return this.dV().C ? null : cqp.b(this).orElse(null);
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.uz;
   }

   @Override
   protected awq l_() {
      return awr.ux;
   }

   @Override
   protected void b(iw $$0, ebg $$1) {
      this.a(awr.uB, 0.15F, 1.0F);
   }

   @Override
   protected void gv() {
      this.b(awr.uC);
   }
}
