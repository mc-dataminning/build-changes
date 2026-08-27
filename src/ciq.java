import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class ciq extends cip implements cgt, cjl {
   private static final aja<Boolean> bY = aje.a(ciq.class, ajc.k);
   private static final aja<Boolean> bZ = aje.a(ciq.class, ajc.k);
   private static final aja<Boolean> ca = aje.a(ciq.class, ajc.k);
   private static final UUID cb = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final bry cc = new bry(cb, "Baby speed boost", 0.2F, bry.a.b);
   private static final int cd = 16;
   private static final float ce = 0.35F;
   private static final int cf = 5;
   private static final float cg = 0.1F;
   private static final int ch = 3;
   private static final float ci = 0.2F;
   private static final bqd cj = bqg.az.n().a(0.5F).b(0.97F);
   private static final double ck = 0.5;
   private final boo cl = new boo(8);
   private boolean cm;
   protected static final ImmutableList<cbd<? extends cbc<? super ciq>>> e = ImmutableList.of(cbd.c, cbd.d, cbd.b, cbd.f, cbd.l);
   protected static final ImmutableList<bzw<?>> bX = ImmutableList.of(
      bzw.n,
      bzw.v,
      bzw.g,
      bzw.h,
      bzw.k,
      bzw.l,
      bzw.ao,
      bzw.an,
      bzw.L,
      bzw.aP,
      bzw.x,
      bzw.y,
      new bzw[]{
         bzw.m,
         bzw.E,
         bzw.o,
         bzw.p,
         bzw.q,
         bzw.t,
         bzw.ab,
         bzw.ac,
         bzw.z,
         bzw.ad,
         bzw.ae,
         bzw.ag,
         bzw.af,
         bzw.ai,
         bzw.aj,
         bzw.ah,
         bzw.al,
         bzw.M,
         bzw.ar,
         bzw.s,
         bzw.as,
         bzw.at,
         bzw.ak,
         bzw.am,
         bzw.au,
         bzw.av,
         bzw.aw
      }
   );

   public ciq(bqg<? extends cip> $$0, czg $$1) {
      super($$0, $$1);
      this.bM = 5;
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      if (this.p_()) {
         $$0.a("IsBaby", true);
      }

      if (this.cm) {
         $$0.a("CannotHunt", true);
      }

      this.b($$0, this.dO());
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.a($$0, this.dO());
   }

   @ayp
   @Override
   public boo y() {
      return this.cl;
   }

   @Override
   protected void a(boy $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cgs $$4 && $$4.go()) {
         crs $$5 = new crs(crv.up);
         $$4.gp();
         this.b($$5);
      }

      this.cl.f().forEach(this::b);
   }

   protected crs n(crs $$0) {
      return this.cl.a($$0);
   }

   protected boolean o(crs $$0) {
      return this.cl.b($$0);
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
      $$0.a(bZ, false);
      $$0.a(ca, false);
   }

   @Override
   public void a(aja<?> $$0) {
      super.a($$0);
      if (bY.equals($$0)) {
         this.j_();
      }
   }

   public static brz.a gu() {
      return chg.gt().a(bsa.q, 16.0).a(bsa.r, 0.35F).a(bsa.c, 5.0);
   }

   public static boolean b(bqg<ciq> $$0, czh $$1, bqx $$2, id $$3, axt $$4) {
      return !$$1.a_($$3.d()).a(dcj.kK);
   }

   @Nullable
   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      axt $$4 = $$0.E_();
      if ($$2 != bqx.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.go()) {
            this.a(bqh.a, this.gw());
         }
      }

      cir.a(this, $$0.E_());
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean W() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.fU();
   }

   @Override
   protected void a(axt $$0, bod $$1) {
      if (this.go()) {
         this.a(bqh.f, new crs(crv.pN), $$0);
         this.a(bqh.e, new crs(crv.pO), $$0);
         this.a(bqh.d, new crs(crv.pP), $$0);
         this.a(bqh.c, new crs(crv.pQ), $$0);
      }
   }

   private void a(bqh $$0, crs $$1, axt $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bru.b<ciq> dQ() {
      return bru.a(bX, e);
   }

   @Override
   protected bru<?> a(Dynamic<?> $$0) {
      return cir.a(this, this.dQ().a($$0));
   }

   @Override
   public bru<ciq> dP() {
      return (bru<ciq>)super.dP();
   }

   @Override
   public bof b(cka $$0, boe $$1) {
      bof $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dM().B) {
         return cir.a(this, $$0, $$1);
      } else {
         boolean $$3 = cir.b(this, $$0.b($$1)) && this.gp() != cis.d;
         return $$3 ? bof.a : bof.d;
      }
   }

   @Override
   public bqd e(bre $$0) {
      return this.p_() ? cj : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.an().a(bY, $$0);
      if (!this.dM().B) {
         brw $$1 = this.f(bsa.r);
         $$1.b(cc.b());
         if ($$0) {
            $$1.c(cc);
         }
      }
   }

   @Override
   public boolean p_() {
      return this.an().a(bY);
   }

   private void y(boolean $$0) {
      this.cm = $$0;
   }

   @Override
   protected boolean r() {
      return !this.cm;
   }

   @Override
   protected void Y() {
      this.dM().af().a("piglinBrain");
      this.dP().a((apu)this.dM(), this);
      this.dM().af().c();
      cir.a(this);
      super.Y();
   }

   @Override
   public int eg() {
      return this.bM;
   }

   @Override
   protected void c(apu $$0) {
      cir.b(this);
      this.cl.f().forEach(this::b);
      super.c($$0);
   }

   private crs gw() {
      return (double)this.ag.i() < 0.5 ? new crs(crv.vR) : new crs(crv.oU);
   }

   private boolean gx() {
      return this.an.a(bZ);
   }

   @Override
   public void b(boolean $$0) {
      this.an.a(bZ, $$0);
   }

   @Override
   public void a() {
      this.be = 0;
   }

   @Override
   public cis gp() {
      if (this.gv()) {
         return cis.e;
      } else if (cir.a(this.eV())) {
         return cis.d;
      } else if (this.gf() && this.gq()) {
         return cis.a;
      } else if (this.gx()) {
         return cis.c;
      } else {
         return this.gf() && this.b(crv.vR) ? cis.b : cis.f;
      }
   }

   public boolean gv() {
      return this.an.a(ca);
   }

   public void x(boolean $$0) {
      this.an.a(ca, $$0);
   }

   @Override
   public boolean a(boy $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bqt) {
            cir.a(this, (bqt)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(bqt $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(csi $$0) {
      return $$0 == crv.vR;
   }

   protected void p(crs $$0) {
      this.b(bqh.a, $$0);
   }

   protected void q(crs $$0) {
      if ($$0.a(cir.c)) {
         this.a(bqh.b, $$0);
         this.f(bqh.b);
      } else {
         this.b(bqh.b, $$0);
      }
   }

   @Override
   public boolean k(crs $$0) {
      return this.dM().aa().b(czc.c) && this.fT() && cir.a(this, $$0);
   }

   protected boolean r(crs $$0) {
      bqh $$1 = bqv.h($$0);
      crs $$2 = this.d($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(crs $$0, crs $$1) {
      if (cxa.f($$1)) {
         return false;
      } else {
         boolean $$2 = cir.a($$0) || $$0.a(crv.vR);
         boolean $$3 = cir.a($$1) || $$1.a(crv.vR);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.go() && !$$0.a(crv.vR) && $$1.a(crv.vR) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(cgk $$0) {
      this.a($$0);
      cir.a(this, $$0);
   }

   @Override
   public boolean a(bqa $$0, boolean $$1) {
      if (this.p_() && $$0.ai() == bqg.Z) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bqa b(bqa $$0, int $$1) {
      List<bqa> $$2 = $$0.cP();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected aun v() {
      return this.dM().B ? null : cir.c(this).orElse(null);
   }

   @Override
   protected aun d(boy $$0) {
      return auo.tp;
   }

   @Override
   protected aun o_() {
      return auo.tn;
   }

   @Override
   protected void b(id $$0, dpi $$1) {
      this.a(auo.tr, 0.15F, 1.0F);
   }

   @Override
   protected void gr() {
      this.b(auo.ts);
   }
}
