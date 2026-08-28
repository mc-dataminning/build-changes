import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cln extends clm implements cjq, cmi {
   private static final akk<Boolean> bZ = ako.a(cln.class, akm.k);
   private static final akk<Boolean> ca = ako.a(cln.class, akm.k);
   private static final akk<Boolean> cb = ako.a(cln.class, akm.k);
   private static final UUID cc = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final buv cd = new buv(cc, "Baby speed boost", 0.2F, buv.a.b);
   private static final int ce = 16;
   private static final float cf = 0.35F;
   private static final int cg = 5;
   private static final float ch = 0.1F;
   private static final int ci = 3;
   private static final float cj = 0.2F;
   private static final bsx ck = bta.aA.n().a(0.5F).b(0.97F);
   private static final double cl = 0.5;
   private final brd cm = new brd(8);
   private boolean cn;
   protected static final ImmutableList<cea<? extends cdz<? super cln>>> e = ImmutableList.of(cea.c, cea.d, cea.b, cea.f, cea.l);
   protected static final ImmutableList<cct<?>> bY = ImmutableList.of(
      cct.n,
      cct.v,
      cct.g,
      cct.h,
      cct.k,
      cct.l,
      cct.ao,
      cct.an,
      cct.L,
      cct.aP,
      cct.x,
      cct.y,
      new cct[]{
         cct.m,
         cct.E,
         cct.o,
         cct.p,
         cct.q,
         cct.t,
         cct.ab,
         cct.ac,
         cct.z,
         cct.ad,
         cct.ae,
         cct.ag,
         cct.af,
         cct.ai,
         cct.aj,
         cct.ah,
         cct.al,
         cct.M,
         cct.ar,
         cct.s,
         cct.as,
         cct.at,
         cct.ak,
         cct.am,
         cct.au,
         cct.av,
         cct.aw
      }
   );

   public cln(bta<? extends clm> $$0, dby $$1) {
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
   public brd y() {
      return this.cm;
   }

   @Override
   protected void a(brn $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cjp $$4 && $$4.gr()) {
         cup $$5 = new cup(cus.ur);
         $$4.gs();
         this.b($$5);
      }

      this.cm.f().forEach(this::b);
   }

   protected cup n(cup $$0) {
      return this.cm.b($$0);
   }

   protected boolean o(cup $$0) {
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

   public static buw.a gx() {
      return ckd.gw().a(bux.q, 16.0).a(bux.r, 0.35F).a(bux.c, 5.0);
   }

   public static boolean b(bta<cln> $$0, dbz $$1, btt $$2, iz $$3, azh $$4) {
      return !$$1.a_($$3.d()).a(dfb.kK);
   }

   @Nullable
   @Override
   public bui a(dcn $$0, bqs $$1, btt $$2, @Nullable bui $$3) {
      azh $$4 = $$0.E_();
      if ($$2 != btt.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.gr()) {
            this.a(btb.a, this.gz());
         }
      }

      clo.a(this, $$0.E_());
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
   protected void a(azh $$0, bqs $$1) {
      if (this.gr()) {
         this.a(btb.f, new cup(cus.pO), $$0);
         this.a(btb.e, new cup(cus.pP), $$0);
         this.a(btb.d, new cup(cus.pQ), $$0);
         this.a(btb.c, new cup(cus.pR), $$0);
      }
   }

   private void a(btb $$0, cup $$1, azh $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bur.b<cln> dT() {
      return bur.a(bY, e);
   }

   @Override
   protected bur<?> a(Dynamic<?> $$0) {
      return clo.a(this, this.dT().a($$0));
   }

   @Override
   public bur<cln> dS() {
      return (bur<cln>)super.dS();
   }

   @Override
   public bqu b(cmx $$0, bqt $$1) {
      bqu $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dP().B) {
         return clo.a(this, $$0, $$1);
      } else {
         boolean $$3 = clo.b(this, $$0.b($$1)) && this.gs() != clp.d;
         return $$3 ? bqu.a : bqu.e;
      }
   }

   @Override
   public bsx e(bub $$0) {
      return this.p_() ? ck : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.ap().a(bZ, $$0);
      if (!this.dP().B) {
         but $$1 = this.f(bux.r);
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
      clo.a(this);
      super.Z();
   }

   @Override
   public int ej() {
      return this.bN;
   }

   @Override
   protected void c(arf $$0) {
      clo.b(this);
      this.cm.f().forEach(this::b);
      super.c($$0);
   }

   private cup gz() {
      return (double)this.ah.i() < 0.5 ? new cup(cus.vT) : new cup(cus.oV);
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
   public clp gs() {
      if (this.gy()) {
         return clp.e;
      } else if (clo.a(this.eY())) {
         return clp.d;
      } else if (this.gi() && this.gt()) {
         return clp.a;
      } else if (this.gA()) {
         return clp.c;
      } else {
         return this.gi() && this.b(cus.vT) ? clp.b : clp.f;
      }
   }

   public boolean gy() {
      return this.ao.a(cb);
   }

   public void x(boolean $$0) {
      this.ao.a(cb, $$0);
   }

   @Override
   public boolean a(brn $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof btp) {
            clo.a(this, (btp)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(btp $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(cvi $$0) {
      return $$0 == cus.vT;
   }

   protected void p(cup $$0) {
      this.b(btb.a, $$0);
   }

   protected void q(cup $$0) {
      if ($$0.a(clo.c)) {
         this.a(btb.b, $$0);
         this.f(btb.b);
      } else {
         this.b(btb.b, $$0);
      }
   }

   @Override
   public boolean k(cup $$0) {
      return this.dP().ab().b(dbu.c) && this.fV() && clo.a(this, $$0);
   }

   protected boolean r(cup $$0) {
      btb $$1 = btr.h($$0);
      cup $$2 = this.a($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(cup $$0, cup $$1) {
      if (dab.f($$1)) {
         return false;
      } else {
         boolean $$2 = clo.a($$0) || $$0.a(cus.vT);
         boolean $$3 = clo.a($$1) || $$1.a(cus.vT);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.gr() && !$$0.a(cus.vT) && $$1.a(cus.vT) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(cjh $$0) {
      this.a($$0);
      clo.a(this, $$0);
   }

   @Override
   public boolean a(bsu $$0, boolean $$1) {
      if (this.p_() && $$0.ak() == bta.Z) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bsu b(bsu $$0, int $$1) {
      List<bsu> $$2 = $$0.cS();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected avz v() {
      return this.dP().B ? null : clo.c(this).orElse(null);
   }

   @Override
   protected avz d(brn $$0) {
      return awa.tI;
   }

   @Override
   protected avz o_() {
      return awa.tG;
   }

   @Override
   protected void b(iz $$0, dsc $$1) {
      this.a(awa.tK, 0.15F, 1.0F);
   }

   @Override
   protected void gu() {
      this.b(awa.tL);
   }
}
