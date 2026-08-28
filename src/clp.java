import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class clp extends clo implements cjs, cmk {
   private static final akk<Boolean> bZ = ako.a(clp.class, akm.k);
   private static final akk<Boolean> ca = ako.a(clp.class, akm.k);
   private static final akk<Boolean> cb = ako.a(clp.class, akm.k);
   private static final UUID cc = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final bux cd = new bux(cc, "Baby speed boost", 0.2F, bux.a.b);
   private static final int ce = 16;
   private static final float cf = 0.35F;
   private static final int cg = 5;
   private static final float ch = 0.1F;
   private static final int ci = 3;
   private static final float cj = 0.2F;
   private static final bsz ck = btc.aA.n().a(0.5F).b(0.97F);
   private static final double cl = 0.5;
   private final brf cm = new brf(8);
   private boolean cn;
   protected static final ImmutableList<cec<? extends ceb<? super clp>>> e = ImmutableList.of(cec.c, cec.d, cec.b, cec.f, cec.l);
   protected static final ImmutableList<ccv<?>> bY = ImmutableList.of(
      ccv.n,
      ccv.v,
      ccv.g,
      ccv.h,
      ccv.k,
      ccv.l,
      ccv.ao,
      ccv.an,
      ccv.L,
      ccv.aP,
      ccv.x,
      ccv.y,
      new ccv[]{
         ccv.m,
         ccv.E,
         ccv.o,
         ccv.p,
         ccv.q,
         ccv.t,
         ccv.ab,
         ccv.ac,
         ccv.z,
         ccv.ad,
         ccv.ae,
         ccv.ag,
         ccv.af,
         ccv.ai,
         ccv.aj,
         ccv.ah,
         ccv.al,
         ccv.M,
         ccv.ar,
         ccv.s,
         ccv.as,
         ccv.at,
         ccv.ak,
         ccv.am,
         ccv.au,
         ccv.av,
         ccv.aw
      }
   );

   public clp(btc<? extends clo> $$0, dca $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      if (this.p_()) {
         $$0.a("IsBaby", true);
      }

      if (this.cn) {
         $$0.a("CannotHunt", true);
      }

      this.b($$0, this.dR());
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.a($$0, this.dR());
   }

   @bad
   @Override
   public brf y() {
      return this.cm;
   }

   @Override
   protected void a(brp $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cjr $$4 && $$4.gr()) {
         cur $$5 = new cur(cuu.ur);
         $$4.gs();
         this.b($$5);
      }

      this.cm.f().forEach(this::b);
   }

   protected cur n(cur $$0) {
      return this.cm.b($$0);
   }

   protected boolean o(cur $$0) {
      return this.cm.c($$0);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
      $$0.a(ca, false);
      $$0.a(cb, false);
   }

   @Override
   public void a(akk<?> $$0) {
      super.a($$0);
      if (bZ.equals($$0)) {
         this.j_();
      }
   }

   public static buy.a gx() {
      return ckf.gw().a(buz.q, 16.0).a(buz.r, 0.35F).a(buz.c, 5.0);
   }

   public static boolean b(btc<clp> $$0, dcb $$1, btv $$2, iz $$3, azh $$4) {
      return !$$1.a_($$3.d()).a(dfd.kK);
   }

   @Nullable
   @Override
   public buk a(dcp $$0, bqu $$1, btv $$2, @Nullable buk $$3) {
      azh $$4 = $$0.E_();
      if ($$2 != btv.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.gr()) {
            this.a(btd.a, this.gz());
         }
      }

      clq.a(this, $$0.E_());
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean X() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.fW();
   }

   @Override
   protected void a(azh $$0, bqu $$1) {
      if (this.gr()) {
         this.a(btd.f, new cur(cuu.pO), $$0);
         this.a(btd.e, new cur(cuu.pP), $$0);
         this.a(btd.d, new cur(cuu.pQ), $$0);
         this.a(btd.c, new cur(cuu.pR), $$0);
      }
   }

   private void a(btd $$0, cur $$1, azh $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected but.b<clp> dT() {
      return but.a(bY, e);
   }

   @Override
   protected but<?> a(Dynamic<?> $$0) {
      return clq.a(this, this.dT().a($$0));
   }

   @Override
   public but<clp> dS() {
      return (but<clp>)super.dS();
   }

   @Override
   public bqw b(cmz $$0, bqv $$1) {
      bqw $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dP().B) {
         return clq.a(this, $$0, $$1);
      } else {
         boolean $$3 = clq.b(this, $$0.b($$1)) && this.gs() != clr.d;
         return $$3 ? bqw.a : bqw.e;
      }
   }

   @Override
   public bsz e(bud $$0) {
      return this.p_() ? ck : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.ap().a(bZ, $$0);
      if (!this.dP().B) {
         buv $$1 = this.f(buz.r);
         $$1.b(cd.b());
         if ($$0) {
            $$1.c(cd);
         }
      }
   }

   @Override
   public boolean p_() {
      return this.ap().a(bZ);
   }

   private void y(boolean $$0) {
      this.cn = $$0;
   }

   @Override
   protected boolean s() {
      return !this.cn;
   }

   @Override
   protected void Z() {
      this.dP().ag().a("piglinBrain");
      this.dS().a((arf)this.dP(), this);
      this.dP().ag().c();
      clq.a(this);
      super.Z();
   }

   @Override
   public int ej() {
      return this.bN;
   }

   @Override
   protected void c(arf $$0) {
      clq.b(this);
      this.cm.f().forEach(this::b);
      super.c($$0);
   }

   private cur gz() {
      return (double)this.ah.i() < 0.5 ? new cur(cuu.vT) : new cur(cuu.oV);
   }

   private boolean gA() {
      return this.ao.a(ca);
   }

   @Override
   public void b(boolean $$0) {
      this.ao.a(ca, $$0);
   }

   @Override
   public void a() {
      this.bf = 0;
   }

   @Override
   public clr gs() {
      if (this.gy()) {
         return clr.e;
      } else if (clq.a(this.eY())) {
         return clr.d;
      } else if (this.gi() && this.gt()) {
         return clr.a;
      } else if (this.gA()) {
         return clr.c;
      } else {
         return this.gi() && this.b(cuu.vT) ? clr.b : clr.f;
      }
   }

   public boolean gy() {
      return this.ao.a(cb);
   }

   public void x(boolean $$0) {
      this.ao.a(cb, $$0);
   }

   @Override
   public boolean a(brp $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof btr) {
            clq.a(this, (btr)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(btr $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(cvk $$0) {
      return $$0 == cuu.vT;
   }

   protected void p(cur $$0) {
      this.b(btd.a, $$0);
   }

   protected void q(cur $$0) {
      if ($$0.a(clq.c)) {
         this.a(btd.b, $$0);
         this.f(btd.b);
      } else {
         this.b(btd.b, $$0);
      }
   }

   @Override
   public boolean k(cur $$0) {
      return this.dP().ab().b(dbw.c) && this.fV() && clq.a(this, $$0);
   }

   protected boolean r(cur $$0) {
      btd $$1 = btt.h($$0);
      cur $$2 = this.a($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(cur $$0, cur $$1) {
      if (dad.f($$1)) {
         return false;
      } else {
         boolean $$2 = clq.a($$0) || $$0.a(cuu.vT);
         boolean $$3 = clq.a($$1) || $$1.a(cuu.vT);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.gr() && !$$0.a(cuu.vT) && $$1.a(cuu.vT) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(cjj $$0) {
      this.a($$0);
      clq.a(this, $$0);
   }

   @Override
   public boolean a(bsw $$0, boolean $$1) {
      if (this.p_() && $$0.ak() == btc.Z) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bsw b(bsw $$0, int $$1) {
      List<bsw> $$2 = $$0.cS();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected avz v() {
      return this.dP().B ? null : clq.c(this).orElse(null);
   }

   @Override
   protected avz d(brp $$0) {
      return awa.tI;
   }

   @Override
   protected avz o_() {
      return awa.tG;
   }

   @Override
   protected void b(iz $$0, dse $$1) {
      this.a(awa.tK, 0.15F, 1.0F);
   }

   @Override
   protected void gu() {
      this.b(awa.tL);
   }
}
