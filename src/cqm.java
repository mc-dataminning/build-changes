import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import javax.annotation.Nullable;

public class cqm extends cql implements col, crh {
   private static final akl<Boolean> bI = akp.a(cqm.class, akn.k);
   private static final akl<Boolean> bJ = akp.a(cqm.class, akn.k);
   private static final akl<Boolean> bK = akp.a(cqm.class, akn.k);
   private static final ali bL = ali.b("baby");
   private static final byy bM = new byy(bL, 0.2F, byy.a.b);
   private static final int bN = 16;
   private static final float bO = 0.35F;
   private static final int bP = 5;
   private static final float bQ = 0.1F;
   private static final int bR = 3;
   private static final float bS = 0.2F;
   private static final bww bT = bxc.aS.n().a(0.5F).b(0.97F);
   private static final double bU = 0.5;
   private static final boolean bV = false;
   private static final boolean bW = false;
   private final buy bX = new buy(8);
   private boolean bY = false;
   protected static final ImmutableList<cid<? extends cic<? super cqm>>> d = ImmutableList.of(cid.c, cid.d, cid.b, cid.f, cid.l);
   protected static final ImmutableList<cgw<?>> e = ImmutableList.of(
      cgw.o,
      cgw.w,
      cgw.g,
      cgw.h,
      cgw.k,
      cgw.l,
      cgw.ap,
      cgw.ao,
      cgw.M,
      cgw.aQ,
      cgw.y,
      cgw.z,
      new cgw[]{
         cgw.n,
         cgw.F,
         cgw.p,
         cgw.q,
         cgw.r,
         cgw.u,
         cgw.ac,
         cgw.ad,
         cgw.A,
         cgw.ae,
         cgw.af,
         cgw.ah,
         cgw.ag,
         cgw.aj,
         cgw.ak,
         cgw.ai,
         cgw.am,
         cgw.N,
         cgw.as,
         cgw.t,
         cgw.at,
         cgw.au,
         cgw.al,
         cgw.an,
         cgw.av,
         cgw.aw,
         cgw.ax
      }
   );

   public cqm(bxc<? extends cql> $$0, djx $$1) {
      super($$0, $$1);
      this.bA = 5;
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.n_());
      $$0.a("CannotHunt", this.bY);
      this.b($$0, this.dX());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0.b("IsBaby", false));
      this.y($$0.b("CannotHunt", false));
      this.a($$0, this.dX());
   }

   @bax
   @Override
   public buy n() {
      return this.bX;
   }

   @Override
   protected void a(ars $$0, bvi $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cok $$4 && $$4.x()) {
         czy $$5 = new czy(dac.vB);
         $$4.gu();
         this.a($$0, $$5);
      }

      this.bX.f().forEach($$1x -> this.a($$0, $$1x));
   }

   protected czy i(czy $$0) {
      return this.bX.b($$0);
   }

   protected boolean j(czy $$0) {
      return this.bX.c($$0);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bI, false);
      $$0.a(bJ, false);
      $$0.a(bK, false);
   }

   @Override
   public void a(akl<?> $$0) {
      super.a($$0);
      if (bI.equals($$0)) {
         this.i_();
      }
   }

   public static byz.a gy() {
      return coz.gx().a(bza.s, 16.0).a(bza.v, 0.35F).a(bza.c, 5.0);
   }

   public static boolean b(bxc<cqm> $$0, djy $$1, bxb $$2, iv $$3, azx $$4) {
      return !$$1.a_($$3.e()).a(dne.lq);
   }

   @Nullable
   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      azx $$4 = $$0.G_();
      if ($$2 != bxb.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.t()) {
            this.a(bxd.a, this.gA());
         }
      }

      cqn.a(this, $$0.G_());
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
   protected void a(azx $$0, bup $$1) {
      if (this.t()) {
         this.a(bxd.f, new czy(dac.qC), $$0);
         this.a(bxd.e, new czy(dac.qD), $$0);
         this.a(bxd.d, new czy(dac.qE), $$0);
         this.a(bxd.c, new czy(dac.qF), $$0);
      }
   }

   private void a(bxd $$0, czy $$1, azx $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected byu.b<cqm> ed() {
      return byu.a(e, d);
   }

   @Override
   protected byu<?> a(Dynamic<?> $$0) {
      return cqn.a(this, this.ed().a($$0));
   }

   @Override
   public byu<cqm> ec() {
      return (byu<cqm>)super.ec();
   }

   @Override
   public bur b(crx $$0, buq $$1) {
      bur $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (this.dV() instanceof ars $$3) {
         return cqn.a($$3, this, $$0, $$1);
      } else {
         boolean $$4 = cqn.b(this, $$0.b($$1)) && this.x() != cqo.d;
         return (bur)($$4 ? bur.a : bur.e);
      }
   }

   @Override
   public bww e(byg $$0) {
      return this.n_() ? bT : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.ar().a(bI, $$0);
      if (!this.dV().C) {
         byw $$1 = this.g(bza.v);
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
   protected void a(ars $$0) {
      brb $$1 = bra.a();
      $$1.a("piglinBrain");
      this.ec().a($$0, this);
      $$1.c();
      cqn.a(this);
      super.a($$0);
   }

   @Override
   protected int e(ars $$0) {
      return this.bA;
   }

   @Override
   protected void g(ars $$0) {
      cqn.a($$0, this);
      this.bX.f().forEach($$1 -> this.a($$0, $$1));
      super.g($$0);
   }

   private czy gA() {
      return (double)this.ae.i() < 0.5 ? new czy(dac.xg) : new czy(dac.pK);
   }

   @Nullable
   @Override
   public axt<czu> Y() {
      return this.n_() ? null : axm.bV;
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
   public cqo x() {
      if (this.gz()) {
         return cqo.e;
      } else if (cqn.a(this.fc())) {
         return cqo.d;
      } else if (this.gl() && this.gu()) {
         return cqo.a;
      } else if (this.gB()) {
         return cqo.c;
      } else {
         return this.b(dac.xg) && cyr.g(this.dZ()) ? cqo.b : cqo.f;
      }
   }

   public boolean gz() {
      return this.al.a(bK);
   }

   public void x(boolean $$0) {
      this.al.a(bK, $$0);
   }

   @Override
   public boolean a(ars $$0, bvi $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bxu $$4) {
         cqn.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   public void a(bxu $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(dat $$0) {
      return $$0 == dac.xg;
   }

   protected void k(czy $$0) {
      this.b(bxd.a, $$0);
   }

   protected void l(czy $$0) {
      if ($$0.a(cqn.c)) {
         this.a(bxd.b, $$0);
         this.g(bxd.b);
      } else {
         this.b(bxd.b, $$0);
      }
   }

   @Override
   public boolean c(ars $$0, czy $$1) {
      return $$0.O().c(djt.d) && this.fN() && cqn.a(this, $$1);
   }

   protected boolean m(czy $$0) {
      bxd $$1 = this.f($$0);
      czy $$2 = this.a($$1);
      return this.a($$0, $$2, $$1);
   }

   @Override
   protected boolean a(czy $$0, czy $$1, bxd $$2) {
      if (dgn.a($$1, dgm.E)) {
         return false;
      } else {
         axt<czu> $$3 = this.Y();
         boolean $$4 = cqn.a($$0) || $$3 != null && $$0.a($$3);
         boolean $$5 = cqn.a($$1) || $$3 != null && $$1.a($$3);
         if ($$4 && !$$5) {
            return true;
         } else {
            return !$$4 && $$5 ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(ars $$0, coc $$1) {
      this.a($$1);
      cqn.a($$0, this, $$1);
   }

   @Override
   public boolean a(bwt $$0, boolean $$1) {
      if (this.n_() && $$0.an() == bxc.ak) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bwt b(bwt $$0, int $$1) {
      List<bwt> $$2 = $$0.cY();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.getFirst(), $$1 - 1) : $$0;
   }

   @Nullable
   @Override
   protected awo u() {
      return this.dV().C ? null : cqn.b(this).orElse(null);
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.uz;
   }

   @Override
   protected awo l_() {
      return awp.ux;
   }

   @Override
   protected void b(iv $$0, ebe $$1) {
      this.a(awp.uB, 0.15F, 1.0F);
   }

   @Override
   protected void gv() {
      this.b(awp.uC);
   }
}
