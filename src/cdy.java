import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cdy extends cdx implements ccc, cet {
   private static final agm<Boolean> bV = agp.a(cdy.class, ago.k);
   private static final agm<Boolean> bW = agp.a(cdy.class, ago.k);
   private static final agm<Boolean> bX = agp.a(cdy.class, ago.k);
   private static final UUID bY = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final bnp bZ = new bnp(bY, "Baby speed boost", 0.2F, bnp.a.b);
   private static final int ca = 16;
   private static final float cb = 0.35F;
   private static final int cc = 5;
   private static final float cd = 1.6F;
   private static final float ce = 0.1F;
   private static final int cf = 3;
   private static final float cg = 0.2F;
   private static final float ch = 0.82F;
   private static final double ci = 0.5;
   private final bkj cj = new bkj(8);
   private boolean ck;
   protected static final ImmutableList<bwt<? extends bws<? super cdy>>> bT = ImmutableList.of(bwt.c, bwt.d, bwt.b, bwt.f, bwt.k);
   protected static final ImmutableList<bvn<?>> bU = ImmutableList.of(
      bvn.n,
      bvn.v,
      bvn.g,
      bvn.h,
      bvn.k,
      bvn.l,
      bvn.an,
      bvn.am,
      bvn.K,
      bvn.aO,
      bvn.x,
      bvn.y,
      new bvn[]{
         bvn.m,
         bvn.E,
         bvn.o,
         bvn.p,
         bvn.q,
         bvn.t,
         bvn.aa,
         bvn.ab,
         bvn.z,
         bvn.ac,
         bvn.ad,
         bvn.af,
         bvn.ae,
         bvn.ah,
         bvn.ai,
         bvn.ag,
         bvn.ak,
         bvn.L,
         bvn.aq,
         bvn.s,
         bvn.ar,
         bvn.as,
         bvn.aj,
         bvn.al,
         bvn.at,
         bvn.au,
         bvn.av
      }
   );

   public cdy(blz<? extends cdx> $$0, ctp $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      if (this.o_()) {
         $$0.a("IsBaby", true);
      }

      if (this.ck) {
         $$0.a("CannotHunt", true);
      }

      this.a_($$0);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.c($$0);
   }

   @avt
   @Override
   public bkj A() {
      return this.cj;
   }

   @Override
   protected void a(bkt $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof ccb $$4 && $$4.gf()) {
         cmy $$5 = new cmy(cnb.uk);
         $$4.gg();
         this.b($$5);
      }

      this.cj.f().forEach(this::b);
   }

   protected cmy l(cmy $$0) {
      return this.cj.a($$0);
   }

   protected boolean m(cmy $$0) {
      return this.cj.b($$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bV, false);
      this.an.a(bW, false);
      this.an.a(bX, false);
   }

   @Override
   public void a(agm<?> $$0) {
      super.a($$0);
      if (bV.equals($$0)) {
         this.k_();
      }
   }

   public static bnq.a gl() {
      return ccp.gk().a(bnr.l, 16.0).a(bnr.m, 0.35F).a(bnr.c, 5.0);
   }

   public static boolean b(blz<cdy> $$0, ctq $$1, bmp $$2, hx $$3, auv $$4) {
      return !$$1.a_($$3.d()).a(cws.kK);
   }

   @Nullable
   @Override
   public bne a(cue $$0, bjz $$1, bmp $$2, @Nullable bne $$3, @Nullable sn $$4) {
      auv $$5 = $$0.F_();
      if ($$2 != bmp.d) {
         if ($$5.i() < 0.2F) {
            this.a(true);
         } else if (this.gf()) {
            this.a(bma.a, this.gn());
         }
      }

      cdz.a(this, $$0.F_());
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean X() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.fL();
   }

   @Override
   protected void a(auv $$0, bjz $$1) {
      if (this.gf()) {
         this.a(bma.f, new cmy(cnb.pL), $$0);
         this.a(bma.e, new cmy(cnb.pM), $$0);
         this.a(bma.d, new cmy(cnb.pN), $$0);
         this.a(bma.c, new cmy(cnb.pO), $$0);
      }
   }

   private void a(bma $$0, cmy $$1, auv $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bnl.b<cdy> dP() {
      return bnl.a(bU, bT);
   }

   @Override
   protected bnl<?> a(Dynamic<?> $$0) {
      return cdz.a(this, this.dP().a($$0));
   }

   @Override
   public bnl<cdy> dO() {
      return (bnl<cdy>)super.dO();
   }

   @Override
   public bkb b(cfi $$0, bka $$1) {
      bkb $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dM().B) {
         return cdz.a(this, $$0, $$1);
      } else {
         boolean $$3 = cdz.b(this, $$0.b($$1)) && this.gg() != cea.d;
         return $$3 ? bkb.a : bkb.d;
      }
   }

   @Override
   protected float b(bmx $$0, blw $$1) {
      float $$2 = super.b($$0, $$1);
      return this.o_() ? $$2 - 0.82F : $$2;
   }

   @Override
   public void a(boolean $$0) {
      this.an().b(bV, $$0);
      if (!this.dM().B) {
         bnn $$1 = this.a(bnr.m);
         $$1.b(bZ.a());
         if ($$0) {
            $$1.b(bZ);
         }
      }
   }

   @Override
   public boolean o_() {
      return this.an().b(bV);
   }

   private void y(boolean $$0) {
      this.ck = $$0;
   }

   @Override
   protected boolean u() {
      return !this.ck;
   }

   @Override
   protected void Z() {
      this.dM().af().a("piglinBrain");
      this.dO().a((and)this.dM(), this);
      this.dM().af().c();
      cdz.a(this);
      super.Z();
   }

   @Override
   public int ee() {
      return this.bJ;
   }

   @Override
   protected void c(and $$0) {
      cdz.b(this);
      this.cj.f().forEach(this::b);
      super.c($$0);
   }

   private cmy gn() {
      return (double)this.ag.i() < 0.5 ? new cmy(cnb.vM) : new cmy(cnb.oS);
   }

   private boolean go() {
      return this.an.b(bW);
   }

   @Override
   public void b(boolean $$0) {
      this.an.b(bW, $$0);
   }

   @Override
   public void a() {
      this.bb = 0;
   }

   @Override
   public cea gg() {
      if (this.gm()) {
         return cea.e;
      } else if (cdz.a(this.eU())) {
         return cea.d;
      } else if (this.fW() && this.gh()) {
         return cea.a;
      } else if (this.go()) {
         return cea.c;
      } else {
         return this.fW() && this.b(cnb.vM) ? cea.b : cea.f;
      }
   }

   public boolean gm() {
      return this.an.b(bX);
   }

   public void x(boolean $$0) {
      this.an.b(bX, $$0);
   }

   @Override
   public boolean a(bkt $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bml) {
            cdz.a(this, (bml)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(bml $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(bml $$0, cmy $$1, cga $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public boolean a(cno $$0) {
      return $$0 == cnb.vM;
   }

   protected void n(cmy $$0) {
      this.b(bma.a, $$0);
   }

   protected void o(cmy $$0) {
      if ($$0.a(cdz.c)) {
         this.a(bma.b, $$0);
         this.e(bma.b);
      } else {
         this.b(bma.b, $$0);
      }
   }

   @Override
   public boolean k(cmy $$0) {
      return this.dM().Z().b(ctl.c) && this.fK() && cdz.a(this, $$0);
   }

   protected boolean p(cmy $$0) {
      bma $$1 = bmn.h($$0);
      cmy $$2 = this.c($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(cmy $$0, cmy $$1) {
      if (crl.d($$1)) {
         return false;
      } else {
         boolean $$2 = cdz.a($$0) || $$0.a(cnb.vM);
         boolean $$3 = cdz.a($$1) || $$1.a(cnb.vM);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.gf() && !$$0.a(cnb.vM) && $$1.a(cnb.vM) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(cbu $$0) {
      this.a($$0);
      cdz.a(this, $$0);
   }

   @Override
   public boolean a(blv $$0, boolean $$1) {
      if (this.o_() && $$0.ai() == blz.X) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private blv b(blv $$0, int $$1) {
      List<blv> $$2 = $$0.cP();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected arr y() {
      return this.dM().B ? null : cdz.c(this).orElse(null);
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.sO;
   }

   @Override
   protected arr n_() {
      return ars.sM;
   }

   @Override
   protected void b(hx $$0, djh $$1) {
      this.a(ars.sQ, 0.15F, 1.0F);
   }

   protected void b(arr $$0) {
      this.a($$0, this.eW(), this.eX());
   }

   @Override
   protected void gi() {
      this.b(ars.sR);
   }
}
