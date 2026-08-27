import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cdr extends cdq implements cbw, cem {
   private static final agj<Boolean> bV = agm.a(cdr.class, agl.k);
   private static final agj<Boolean> bW = agm.a(cdr.class, agl.k);
   private static final agj<Boolean> bX = agm.a(cdr.class, agl.k);
   private static final UUID bY = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final bnj bZ = new bnj(bY, "Baby speed boost", 0.2F, bnj.a.b);
   private static final int ca = 16;
   private static final float cb = 0.35F;
   private static final int cc = 5;
   private static final float cd = 1.6F;
   private static final float ce = 0.1F;
   private static final int cf = 3;
   private static final float cg = 0.2F;
   private static final float ch = 0.82F;
   private static final double ci = 0.5;
   private final bkd cj = new bkd(8);
   private boolean ck;
   protected static final ImmutableList<bwn<? extends bwm<? super cdr>>> bT = ImmutableList.of(bwn.c, bwn.d, bwn.b, bwn.f, bwn.k);
   protected static final ImmutableList<bvh<?>> bU = ImmutableList.of(
      bvh.n,
      bvh.v,
      bvh.g,
      bvh.h,
      bvh.k,
      bvh.l,
      bvh.an,
      bvh.am,
      bvh.K,
      bvh.aO,
      bvh.x,
      bvh.y,
      new bvh[]{
         bvh.m,
         bvh.E,
         bvh.o,
         bvh.p,
         bvh.q,
         bvh.t,
         bvh.aa,
         bvh.ab,
         bvh.z,
         bvh.ac,
         bvh.ad,
         bvh.af,
         bvh.ae,
         bvh.ah,
         bvh.ai,
         bvh.ag,
         bvh.ak,
         bvh.L,
         bvh.aq,
         bvh.s,
         bvh.ar,
         bvh.as,
         bvh.aj,
         bvh.al,
         bvh.at,
         bvh.au,
         bvh.av
      }
   );

   public cdr(blt<? extends cdq> $$0, cti $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public void b(sl $$0) {
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
   public void a(sl $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.c($$0);
   }

   @avn
   @Override
   public bkd A() {
      return this.cj;
   }

   @Override
   protected void a(bkn $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cbv $$4 && $$4.gf()) {
         cmr $$5 = new cmr(cmu.uk);
         $$4.gg();
         this.b($$5);
      }

      this.cj.f().forEach(this::b);
   }

   protected cmr l(cmr $$0) {
      return this.cj.a($$0);
   }

   protected boolean m(cmr $$0) {
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
   public void a(agj<?> $$0) {
      super.a($$0);
      if (bV.equals($$0)) {
         this.k_();
      }
   }

   public static bnk.a gl() {
      return ccj.gk().a(bnl.l, 16.0).a(bnl.m, 0.35F).a(bnl.c, 5.0);
   }

   public static boolean b(blt<cdr> $$0, ctj $$1, bmj $$2, hx $$3, aup $$4) {
      return !$$1.a_($$3.d()).a(cwl.kK);
   }

   @Nullable
   @Override
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      aup $$5 = $$0.F_();
      if ($$2 != bmj.d) {
         if ($$5.i() < 0.2F) {
            this.a(true);
         } else if (this.gf()) {
            this.a(blu.a, this.gn());
         }
      }

      cds.a(this, $$0.F_());
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
   protected void a(aup $$0, bjt $$1) {
      if (this.gf()) {
         this.a(blu.f, new cmr(cmu.pL), $$0);
         this.a(blu.e, new cmr(cmu.pM), $$0);
         this.a(blu.d, new cmr(cmu.pN), $$0);
         this.a(blu.c, new cmr(cmu.pO), $$0);
      }
   }

   private void a(blu $$0, cmr $$1, aup $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bnf.b<cdr> dP() {
      return bnf.a(bU, bT);
   }

   @Override
   protected bnf<?> a(Dynamic<?> $$0) {
      return cds.a(this, this.dP().a($$0));
   }

   @Override
   public bnf<cdr> dO() {
      return (bnf<cdr>)super.dO();
   }

   @Override
   public bjv b(cfb $$0, bju $$1) {
      bjv $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dM().B) {
         return cds.a(this, $$0, $$1);
      } else {
         boolean $$3 = cds.b(this, $$0.b($$1)) && this.gg() != cdt.d;
         return $$3 ? bjv.a : bjv.d;
      }
   }

   @Override
   protected float b(bmr $$0, blq $$1) {
      float $$2 = super.b($$0, $$1);
      return this.o_() ? $$2 - 0.82F : $$2;
   }

   @Override
   public void a(boolean $$0) {
      this.an().b(bV, $$0);
      if (!this.dM().B) {
         bnh $$1 = this.a(bnl.m);
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
      this.dO().a((amz)this.dM(), this);
      this.dM().af().c();
      cds.a(this);
      super.Z();
   }

   @Override
   public int ee() {
      return this.bJ;
   }

   @Override
   protected void c(amz $$0) {
      cds.b(this);
      this.cj.f().forEach(this::b);
      super.c($$0);
   }

   private cmr gn() {
      return (double)this.ag.i() < 0.5 ? new cmr(cmu.vM) : new cmr(cmu.oS);
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
   public cdt gg() {
      if (this.gm()) {
         return cdt.e;
      } else if (cds.a(this.eU())) {
         return cdt.d;
      } else if (this.fW() && this.gh()) {
         return cdt.a;
      } else if (this.go()) {
         return cdt.c;
      } else {
         return this.fW() && this.b(cmu.vM) ? cdt.b : cdt.f;
      }
   }

   public boolean gm() {
      return this.an.b(bX);
   }

   public void x(boolean $$0) {
      this.an.b(bX, $$0);
   }

   @Override
   public boolean a(bkn $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bmf) {
            cds.a(this, (bmf)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(bmf $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(bmf $$0, cmr $$1, cft $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public boolean a(cnh $$0) {
      return $$0 == cmu.vM;
   }

   protected void n(cmr $$0) {
      this.b(blu.a, $$0);
   }

   protected void o(cmr $$0) {
      if ($$0.a(cds.c)) {
         this.a(blu.b, $$0);
         this.e(blu.b);
      } else {
         this.b(blu.b, $$0);
      }
   }

   @Override
   public boolean k(cmr $$0) {
      return this.dM().Z().b(cte.c) && this.fK() && cds.a(this, $$0);
   }

   protected boolean p(cmr $$0) {
      blu $$1 = bmh.h($$0);
      cmr $$2 = this.c($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(cmr $$0, cmr $$1) {
      if (cre.d($$1)) {
         return false;
      } else {
         boolean $$2 = cds.a($$0) || $$0.a(cmu.vM);
         boolean $$3 = cds.a($$1) || $$1.a(cmu.vM);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.gf() && !$$0.a(cmu.vM) && $$1.a(cmu.vM) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(cbo $$0) {
      this.a($$0);
      cds.a(this, $$0);
   }

   @Override
   public boolean a(blp $$0, boolean $$1) {
      if (this.o_() && $$0.ai() == blt.X) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private blp b(blp $$0, int $$1) {
      List<blp> $$2 = $$0.cP();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected arl y() {
      return this.dM().B ? null : cds.c(this).orElse(null);
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.sO;
   }

   @Override
   protected arl n_() {
      return arm.sM;
   }

   @Override
   protected void b(hx $$0, dja $$1) {
      this.a(arm.sQ, 0.15F, 1.0F);
   }

   protected void b(arl $$0) {
      this.a($$0, this.eW(), this.eX());
   }

   @Override
   protected void gi() {
      this.b(arm.sR);
   }
}
