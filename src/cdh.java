import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cdh extends cdg implements cbm, cec {
   private static final afz<Boolean> bV = agc.a(cdh.class, agb.k);
   private static final afz<Boolean> bW = agc.a(cdh.class, agb.k);
   private static final afz<Boolean> bX = agc.a(cdh.class, agb.k);
   private static final UUID bY = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final bmz bZ = new bmz(bY, "Baby speed boost", 0.2F, bmz.a.b);
   private static final int ca = 16;
   private static final float cb = 0.35F;
   private static final int cc = 5;
   private static final float cd = 1.6F;
   private static final float ce = 0.1F;
   private static final int cf = 3;
   private static final float cg = 0.2F;
   private static final float ch = 0.82F;
   private static final double ci = 0.5;
   private final bjt cj = new bjt(8);
   private boolean ck;
   protected static final ImmutableList<bwd<? extends bwc<? super cdh>>> bT = ImmutableList.of(bwd.c, bwd.d, bwd.b, bwd.f, bwd.k);
   protected static final ImmutableList<bux<?>> bU = ImmutableList.of(
      bux.n,
      bux.v,
      bux.g,
      bux.h,
      bux.k,
      bux.l,
      bux.an,
      bux.am,
      bux.K,
      bux.aO,
      bux.x,
      bux.y,
      new bux[]{
         bux.m,
         bux.E,
         bux.o,
         bux.p,
         bux.q,
         bux.t,
         bux.aa,
         bux.ab,
         bux.z,
         bux.ac,
         bux.ad,
         bux.af,
         bux.ae,
         bux.ah,
         bux.ai,
         bux.ag,
         bux.ak,
         bux.L,
         bux.aq,
         bux.s,
         bux.ar,
         bux.as,
         bux.aj,
         bux.al,
         bux.at,
         bux.au,
         bux.av
      }
   );

   public cdh(blj<? extends cdg> $$0, csy $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public void b(sj $$0) {
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
   public void a(sj $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.c($$0);
   }

   @avd
   @Override
   public bjt A() {
      return this.cj;
   }

   @Override
   protected void a(bkd $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cbl $$4 && $$4.gf()) {
         cmh $$5 = new cmh(cmk.uk);
         $$4.gg();
         this.b($$5);
      }

      this.cj.f().forEach(this::b);
   }

   protected cmh l(cmh $$0) {
      return this.cj.a($$0);
   }

   protected boolean m(cmh $$0) {
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
   public void a(afz<?> $$0) {
      super.a($$0);
      if (bV.equals($$0)) {
         this.k_();
      }
   }

   public static bna.a gl() {
      return cbz.gk().a(bnb.l, 16.0).a(bnb.m, 0.35F).a(bnb.c, 5.0);
   }

   public static boolean b(blj<cdh> $$0, csz $$1, blz $$2, hv $$3, auf $$4) {
      return !$$1.a_($$3.d()).a(cwb.kK);
   }

   @Nullable
   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      auf $$5 = $$0.F_();
      if ($$2 != blz.d) {
         if ($$5.i() < 0.2F) {
            this.a(true);
         } else if (this.gf()) {
            this.a(blk.a, this.gn());
         }
      }

      cdi.a(this, $$0.F_());
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
   protected void a(auf $$0, bjj $$1) {
      if (this.gf()) {
         this.a(blk.f, new cmh(cmk.pL), $$0);
         this.a(blk.e, new cmh(cmk.pM), $$0);
         this.a(blk.d, new cmh(cmk.pN), $$0);
         this.a(blk.c, new cmh(cmk.pO), $$0);
      }
   }

   private void a(blk $$0, cmh $$1, auf $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bmv.b<cdh> dP() {
      return bmv.a(bU, bT);
   }

   @Override
   protected bmv<?> a(Dynamic<?> $$0) {
      return cdi.a(this, this.dP().a($$0));
   }

   @Override
   public bmv<cdh> dO() {
      return (bmv<cdh>)super.dO();
   }

   @Override
   public bjl b(cer $$0, bjk $$1) {
      bjl $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dM().B) {
         return cdi.a(this, $$0, $$1);
      } else {
         boolean $$3 = cdi.b(this, $$0.b($$1)) && this.gg() != cdj.d;
         return $$3 ? bjl.a : bjl.d;
      }
   }

   @Override
   protected float b(bmh $$0, blg $$1) {
      float $$2 = super.b($$0, $$1);
      return this.o_() ? $$2 - 0.82F : $$2;
   }

   @Override
   public void a(boolean $$0) {
      this.an().b(bV, $$0);
      if (!this.dM().B) {
         bmx $$1 = this.a(bnb.m);
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
      this.dM().ae().a("piglinBrain");
      this.dO().a((amp)this.dM(), this);
      this.dM().ae().c();
      cdi.a(this);
      super.Z();
   }

   @Override
   public int ee() {
      return this.bJ;
   }

   @Override
   protected void c(amp $$0) {
      cdi.b(this);
      this.cj.f().forEach(this::b);
      super.c($$0);
   }

   private cmh gn() {
      return (double)this.ag.i() < 0.5 ? new cmh(cmk.vM) : new cmh(cmk.oS);
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
   public cdj gg() {
      if (this.gm()) {
         return cdj.e;
      } else if (cdi.a(this.eU())) {
         return cdj.d;
      } else if (this.fW() && this.gh()) {
         return cdj.a;
      } else if (this.go()) {
         return cdj.c;
      } else {
         return this.fW() && this.b(cmk.vM) ? cdj.b : cdj.f;
      }
   }

   public boolean gm() {
      return this.an.b(bX);
   }

   public void x(boolean $$0) {
      this.an.b(bX, $$0);
   }

   @Override
   public boolean a(bkd $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof blv) {
            cdi.a(this, (blv)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(blv $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(blv $$0, cmh $$1, cfj $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public boolean a(cmx $$0) {
      return $$0 == cmk.vM;
   }

   protected void n(cmh $$0) {
      this.b(blk.a, $$0);
   }

   protected void o(cmh $$0) {
      if ($$0.a(cdi.c)) {
         this.a(blk.b, $$0);
         this.e(blk.b);
      } else {
         this.b(blk.b, $$0);
      }
   }

   @Override
   public boolean k(cmh $$0) {
      return this.dM().Y().b(csu.c) && this.fK() && cdi.a(this, $$0);
   }

   protected boolean p(cmh $$0) {
      blk $$1 = blx.h($$0);
      cmh $$2 = this.c($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(cmh $$0, cmh $$1) {
      if (cqu.d($$1)) {
         return false;
      } else {
         boolean $$2 = cdi.a($$0) || $$0.a(cmk.vM);
         boolean $$3 = cdi.a($$1) || $$1.a(cmk.vM);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.gf() && !$$0.a(cmk.vM) && $$1.a(cmk.vM) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(cbe $$0) {
      this.a($$0);
      cdi.a(this, $$0);
   }

   @Override
   public boolean a(blf $$0, boolean $$1) {
      if (this.o_() && $$0.ai() == blj.X) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private blf b(blf $$0, int $$1) {
      List<blf> $$2 = $$0.cP();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected arb y() {
      return this.dM().B ? null : cdi.c(this).orElse(null);
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.sO;
   }

   @Override
   protected arb n_() {
      return arc.sM;
   }

   @Override
   protected void b(hv $$0, dip $$1) {
      this.a(arc.sQ, 0.15F, 1.0F);
   }

   protected void b(arb $$0) {
      this.a($$0, this.eW(), this.eX());
   }

   @Override
   protected void gi() {
      this.b(arc.sR);
   }
}
