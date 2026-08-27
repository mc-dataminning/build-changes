import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cck extends ccj implements cav, cdf {
   private static final afo<Boolean> bV = afr.a(cck.class, afq.k);
   private static final afo<Boolean> bW = afr.a(cck.class, afq.k);
   private static final afo<Boolean> bX = afr.a(cck.class, afq.k);
   private static final UUID bY = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final bmk bZ = new bmk(bY, "Baby speed boost", 0.2F, bmk.a.b);
   private static final int ca = 16;
   private static final float cb = 0.35F;
   private static final int cc = 5;
   private static final float cd = 1.6F;
   private static final float ce = 0.1F;
   private static final int cf = 3;
   private static final float cg = 0.2F;
   private static final float ch = 0.82F;
   private static final double ci = 0.5;
   private final bje cj = new bje(8);
   private boolean ck;
   protected static final ImmutableList<bvm<? extends bvl<? super cck>>> bT = ImmutableList.of(bvm.c, bvm.d, bvm.b, bvm.f, bvm.k);
   protected static final ImmutableList<buh<?>> bU = ImmutableList.of(
      buh.n,
      buh.v,
      buh.g,
      buh.h,
      buh.k,
      buh.l,
      buh.an,
      buh.am,
      buh.K,
      buh.aO,
      buh.x,
      buh.y,
      new buh[]{
         buh.m,
         buh.E,
         buh.o,
         buh.p,
         buh.q,
         buh.t,
         buh.aa,
         buh.ab,
         buh.z,
         buh.ac,
         buh.ad,
         buh.af,
         buh.ae,
         buh.ah,
         buh.ai,
         buh.ag,
         buh.ak,
         buh.L,
         buh.aq,
         buh.s,
         buh.ar,
         buh.as,
         buh.aj,
         buh.al,
         buh.at,
         buh.au,
         buh.av
      }
   );

   public cck(bku<? extends ccj> $$0, csa $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      if (this.n_()) {
         $$0.a("IsBaby", true);
      }

      if (this.ck) {
         $$0.a("CannotHunt", true);
      }

      this.a_($$0);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.c($$0);
   }

   @aup
   @Override
   public bje A() {
      return this.cj;
   }

   @Override
   protected void a(bjo $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cau $$4 && $$4.gg()) {
         clj $$5 = new clj(clm.uj);
         $$4.gh();
         this.b($$5);
      }

      this.cj.f().forEach(this::b);
   }

   protected clj l(clj $$0) {
      return this.cj.a($$0);
   }

   protected boolean m(clj $$0) {
      return this.cj.b($$0);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bV, false);
      this.an.a(bW, false);
      this.an.a(bX, false);
   }

   @Override
   public void a(afo<?> $$0) {
      super.a($$0);
      if (bV.equals($$0)) {
         this.j_();
      }
   }

   public static bml.a gm() {
      return cbi.gl().a(bmm.l, 16.0).a(bmm.m, 0.35F).a(bmm.c, 5.0);
   }

   public static boolean b(bku<cck> $$0, csb $$1, blk $$2, ht $$3, ats $$4) {
      return !$$1.a_($$3.d()).a(cvc.kK);
   }

   @Nullable
   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      ats $$5 = $$0.E_();
      if ($$2 != blk.d) {
         if ($$5.i() < 0.2F) {
            this.a(true);
         } else if (this.gg()) {
            this.a(bkv.a, this.go());
         }
      }

      ccl.a(this, $$0.E_());
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
   protected void a(ats $$0, biv $$1) {
      if (this.gg()) {
         this.a(bkv.f, new clj(clm.pL), $$0);
         this.a(bkv.e, new clj(clm.pM), $$0);
         this.a(bkv.d, new clj(clm.pN), $$0);
         this.a(bkv.c, new clj(clm.pO), $$0);
      }
   }

   private void a(bkv $$0, clj $$1, ats $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bmg.b<cck> dQ() {
      return bmg.a(bU, bT);
   }

   @Override
   protected bmg<?> a(Dynamic<?> $$0) {
      return ccl.a(this, this.dQ().a($$0));
   }

   @Override
   public bmg<cck> dP() {
      return (bmg<cck>)super.dP();
   }

   @Override
   public bix b(cdu $$0, biw $$1) {
      bix $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dN().B) {
         return ccl.a(this, $$0, $$1);
      } else {
         boolean $$3 = ccl.b(this, $$0.b($$1)) && this.gh() != ccm.d;
         return $$3 ? bix.a : bix.d;
      }
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
      float $$2 = super.b($$0, $$1);
      return this.n_() ? $$2 - 0.82F : $$2;
   }

   @Override
   public void a(boolean $$0) {
      this.an().b(bV, $$0);
      if (!this.dN().B) {
         bmi $$1 = this.a(bmm.m);
         $$1.b(bZ.a());
         if ($$0) {
            $$1.b(bZ);
         }
      }
   }

   @Override
   public boolean n_() {
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
      this.dP().a((ame)this.dN(), this);
      this.dN().ae().c();
      ccl.a(this);
      super.Z();
   }

   @Override
   public int ef() {
      return this.bJ;
   }

   @Override
   protected void c(ame $$0) {
      ccl.b(this);
      this.cj.f().forEach(this::b);
      super.c($$0);
   }

   private clj go() {
      return (double)this.ag.i() < 0.5 ? new clj(clm.vL) : new clj(clm.oS);
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
   public ccm gh() {
      if (this.gn()) {
         return ccm.e;
      } else if (ccl.a(this.eV())) {
         return ccm.d;
      } else if (this.fX() && this.gi()) {
         return ccm.a;
      } else if (this.gp()) {
         return ccm.c;
      } else {
         return this.fX() && this.b(clm.vL) ? ccm.b : ccm.f;
      }
   }

   public boolean gn() {
      return this.an.b(bX);
   }

   public void x(boolean $$0) {
      this.an.b(bX, $$0);
   }

   @Override
   public boolean a(bjo $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dN().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof blg) {
            ccl.a(this, (blg)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(blg $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(blg $$0, clj $$1, cem $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public boolean a(clz $$0) {
      return $$0 == clm.vL;
   }

   protected void n(clj $$0) {
      this.b(bkv.a, $$0);
   }

   protected void o(clj $$0) {
      if ($$0.a(ccl.c)) {
         this.a(bkv.b, $$0);
         this.e(bkv.b);
      } else {
         this.b(bkv.b, $$0);
      }
   }

   @Override
   public boolean k(clj $$0) {
      return this.dN().Y().b(crw.c) && this.fL() && ccl.a(this, $$0);
   }

   protected boolean p(clj $$0) {
      bkv $$1 = bli.h($$0);
      clj $$2 = this.c($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(clj $$0, clj $$1) {
      if (cpw.d($$1)) {
         return false;
      } else {
         boolean $$2 = ccl.a($$0) || $$0.a(clm.vL);
         boolean $$3 = ccl.a($$1) || $$1.a(clm.vL);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.gg() && !$$0.a(clm.vL) && $$1.a(clm.vL) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(can $$0) {
      this.a($$0);
      ccl.a(this, $$0);
   }

   @Override
   public boolean a(bkq $$0, boolean $$1) {
      if (this.n_() && $$0.ai() == bku.W) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bkq b(bkq $$0, int $$1) {
      List<bkq> $$2 = $$0.cQ();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected aqq y() {
      return this.dN().B ? null : ccl.c(this).orElse(null);
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.st;
   }

   @Override
   protected aqq m_() {
      return aqr.sr;
   }

   @Override
   protected void b(ht $$0, dhi $$1) {
      this.a(aqr.sv, 0.15F, 1.0F);
   }

   protected void b(aqq $$0) {
      this.a($$0, this.eX(), this.eY());
   }

   @Override
   protected void gj() {
      this.b(aqr.sw);
   }
}
