import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class ccp extends cco implements cba, cdk {
   private static final afs<Boolean> bV = afv.a(ccp.class, afu.k);
   private static final afs<Boolean> bW = afv.a(ccp.class, afu.k);
   private static final afs<Boolean> bX = afv.a(ccp.class, afu.k);
   private static final UUID bY = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final bmp bZ = new bmp(bY, "Baby speed boost", 0.2F, bmp.a.b);
   private static final int ca = 16;
   private static final float cb = 0.35F;
   private static final int cc = 5;
   private static final float cd = 1.6F;
   private static final float ce = 0.1F;
   private static final int cf = 3;
   private static final float cg = 0.2F;
   private static final float ch = 0.82F;
   private static final double ci = 0.5;
   private final bjj cj = new bjj(8);
   private boolean ck;
   protected static final ImmutableList<bvr<? extends bvq<? super ccp>>> bT = ImmutableList.of(bvr.c, bvr.d, bvr.b, bvr.f, bvr.k);
   protected static final ImmutableList<bum<?>> bU = ImmutableList.of(
      bum.n,
      bum.v,
      bum.g,
      bum.h,
      bum.k,
      bum.l,
      bum.an,
      bum.am,
      bum.K,
      bum.aO,
      bum.x,
      bum.y,
      new bum[]{
         bum.m,
         bum.E,
         bum.o,
         bum.p,
         bum.q,
         bum.t,
         bum.aa,
         bum.ab,
         bum.z,
         bum.ac,
         bum.ad,
         bum.af,
         bum.ae,
         bum.ah,
         bum.ai,
         bum.ag,
         bum.ak,
         bum.L,
         bum.aq,
         bum.s,
         bum.ar,
         bum.as,
         bum.aj,
         bum.al,
         bum.at,
         bum.au,
         bum.av
      }
   );

   public ccp(bkz<? extends cco> $$0, csf $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public void b(sd $$0) {
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
   public void a(sd $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.c($$0);
   }

   @aut
   @Override
   public bjj A() {
      return this.cj;
   }

   @Override
   protected void a(bjt $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof caz $$4 && $$4.gg()) {
         clo $$5 = new clo(clr.uj);
         $$4.gh();
         this.b($$5);
      }

      this.cj.f().forEach(this::b);
   }

   protected clo l(clo $$0) {
      return this.cj.a($$0);
   }

   protected boolean m(clo $$0) {
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
   public void a(afs<?> $$0) {
      super.a($$0);
      if (bV.equals($$0)) {
         this.k_();
      }
   }

   public static bmq.a gm() {
      return cbn.gl().a(bmr.l, 16.0).a(bmr.m, 0.35F).a(bmr.c, 5.0);
   }

   public static boolean b(bkz<ccp> $$0, csg $$1, blp $$2, hx $$3, atw $$4) {
      return !$$1.a_($$3.d()).a(cvh.kK);
   }

   @Nullable
   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      atw $$5 = $$0.F_();
      if ($$2 != blp.d) {
         if ($$5.i() < 0.2F) {
            this.a(true);
         } else if (this.gg()) {
            this.a(bla.a, this.go());
         }
      }

      ccq.a(this, $$0.F_());
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
      return !this.fM();
   }

   @Override
   protected void a(atw $$0, biz $$1) {
      if (this.gg()) {
         this.a(bla.f, new clo(clr.pL), $$0);
         this.a(bla.e, new clo(clr.pM), $$0);
         this.a(bla.d, new clo(clr.pN), $$0);
         this.a(bla.c, new clo(clr.pO), $$0);
      }
   }

   private void a(bla $$0, clo $$1, atw $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bml.b<ccp> dQ() {
      return bml.a(bU, bT);
   }

   @Override
   protected bml<?> a(Dynamic<?> $$0) {
      return ccq.a(this, this.dQ().a($$0));
   }

   @Override
   public bml<ccp> dP() {
      return (bml<ccp>)super.dP();
   }

   @Override
   public bjb b(cdz $$0, bja $$1) {
      bjb $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dN().B) {
         return ccq.a(this, $$0, $$1);
      } else {
         boolean $$3 = ccq.b(this, $$0.b($$1)) && this.gh() != ccr.d;
         return $$3 ? bjb.a : bjb.d;
      }
   }

   @Override
   protected float b(blx $$0, bkw $$1) {
      float $$2 = super.b($$0, $$1);
      return this.o_() ? $$2 - 0.82F : $$2;
   }

   @Override
   public void a(boolean $$0) {
      this.an().b(bV, $$0);
      if (!this.dN().B) {
         bmn $$1 = this.a(bmr.m);
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
      this.dN().ae().a("piglinBrain");
      this.dP().a((ami)this.dN(), this);
      this.dN().ae().c();
      ccq.a(this);
      super.Z();
   }

   @Override
   public int ef() {
      return this.bJ;
   }

   @Override
   protected void c(ami $$0) {
      ccq.b(this);
      this.cj.f().forEach(this::b);
      super.c($$0);
   }

   private clo go() {
      return (double)this.ag.i() < 0.5 ? new clo(clr.vL) : new clo(clr.oS);
   }

   private boolean gp() {
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
   public ccr gh() {
      if (this.gn()) {
         return ccr.e;
      } else if (ccq.a(this.eV())) {
         return ccr.d;
      } else if (this.fX() && this.gi()) {
         return ccr.a;
      } else if (this.gp()) {
         return ccr.c;
      } else {
         return this.fX() && this.b(clr.vL) ? ccr.b : ccr.f;
      }
   }

   public boolean gn() {
      return this.an.b(bX);
   }

   public void x(boolean $$0) {
      this.an.b(bX, $$0);
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dN().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bll) {
            ccq.a(this, (bll)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(bll $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(bll $$0, clo $$1, cer $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public boolean a(cme $$0) {
      return $$0 == clr.vL;
   }

   protected void n(clo $$0) {
      this.b(bla.a, $$0);
   }

   protected void o(clo $$0) {
      if ($$0.a(ccq.c)) {
         this.a(bla.b, $$0);
         this.e(bla.b);
      } else {
         this.b(bla.b, $$0);
      }
   }

   @Override
   public boolean k(clo $$0) {
      return this.dN().Y().b(csb.c) && this.fL() && ccq.a(this, $$0);
   }

   protected boolean p(clo $$0) {
      bla $$1 = bln.h($$0);
      clo $$2 = this.c($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(clo $$0, clo $$1) {
      if (cqb.d($$1)) {
         return false;
      } else {
         boolean $$2 = ccq.a($$0) || $$0.a(clr.vL);
         boolean $$3 = ccq.a($$1) || $$1.a(clr.vL);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.gg() && !$$0.a(clr.vL) && $$1.a(clr.vL) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(cas $$0) {
      this.a($$0);
      ccq.a(this, $$0);
   }

   @Override
   public boolean a(bkv $$0, boolean $$1) {
      if (this.o_() && $$0.ai() == bkz.W) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bkv b(bkv $$0, int $$1) {
      List<bkv> $$2 = $$0.cQ();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected aqu y() {
      return this.dN().B ? null : ccq.c(this).orElse(null);
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.st;
   }

   @Override
   protected aqu n_() {
      return aqv.sr;
   }

   @Override
   protected void b(hx $$0, dhn $$1) {
      this.a(aqv.sv, 0.15F, 1.0F);
   }

   protected void b(aqu $$0) {
      this.a($$0, this.eX(), this.eY());
   }

   @Override
   protected void gj() {
      this.b(aqv.sw);
   }
}
