import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cli extends clh implements cjl, cmd {
   private static final akg<Boolean> bZ = akk.a(cli.class, aki.k);
   private static final akg<Boolean> ca = akk.a(cli.class, aki.k);
   private static final akg<Boolean> cb = akk.a(cli.class, aki.k);
   private static final UUID cc = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final buq cd = new buq(cc, "Baby speed boost", 0.2F, buq.a.b);
   private static final int ce = 16;
   private static final float cf = 0.35F;
   private static final int cg = 5;
   private static final float ch = 0.1F;
   private static final int ci = 3;
   private static final float cj = 0.2F;
   private static final bss ck = bsv.aA.n().a(0.5F).b(0.97F);
   private static final double cl = 0.5;
   private final bqy cm = new bqy(8);
   private boolean cn;
   protected static final ImmutableList<cdv<? extends cdu<? super cli>>> e = ImmutableList.of(cdv.c, cdv.d, cdv.b, cdv.f, cdv.l);
   protected static final ImmutableList<cco<?>> bY = ImmutableList.of(
      cco.n,
      cco.v,
      cco.g,
      cco.h,
      cco.k,
      cco.l,
      cco.ao,
      cco.an,
      cco.L,
      cco.aP,
      cco.x,
      cco.y,
      new cco[]{
         cco.m,
         cco.E,
         cco.o,
         cco.p,
         cco.q,
         cco.t,
         cco.ab,
         cco.ac,
         cco.z,
         cco.ad,
         cco.ae,
         cco.ag,
         cco.af,
         cco.ai,
         cco.aj,
         cco.ah,
         cco.al,
         cco.M,
         cco.ar,
         cco.s,
         cco.as,
         cco.at,
         cco.ak,
         cco.am,
         cco.au,
         cco.av,
         cco.aw
      }
   );

   public cli(bsv<? extends clh> $$0, dbt $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public void b(ur $$0) {
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
   public void a(ur $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.a($$0, this.dR());
   }

   @azy
   @Override
   public bqy y() {
      return this.cm;
   }

   @Override
   protected void a(bri $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cjk $$4 && $$4.gr()) {
         cuk $$5 = new cuk(cun.ur);
         $$4.gs();
         this.b($$5);
      }

      this.cm.f().forEach(this::b);
   }

   protected cuk n(cuk $$0) {
      return this.cm.b($$0);
   }

   protected boolean o(cuk $$0) {
      return this.cm.c($$0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
      $$0.a(ca, false);
      $$0.a(cb, false);
   }

   @Override
   public void a(akg<?> $$0) {
      super.a($$0);
      if (bZ.equals($$0)) {
         this.j_();
      }
   }

   public static bur.a gx() {
      return cjy.gw().a(bus.q, 16.0).a(bus.r, 0.35F).a(bus.c, 5.0);
   }

   public static boolean b(bsv<cli> $$0, dbu $$1, bto $$2, iz $$3, azc $$4) {
      return !$$1.a_($$3.d()).a(dew.kK);
   }

   @Nullable
   @Override
   public bud a(dci $$0, bqn $$1, bto $$2, @Nullable bud $$3) {
      azc $$4 = $$0.E_();
      if ($$2 != bto.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.gr()) {
            this.a(bsw.a, this.gz());
         }
      }

      clj.a(this, $$0.E_());
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
   protected void a(azc $$0, bqn $$1) {
      if (this.gr()) {
         this.a(bsw.f, new cuk(cun.pO), $$0);
         this.a(bsw.e, new cuk(cun.pP), $$0);
         this.a(bsw.d, new cuk(cun.pQ), $$0);
         this.a(bsw.c, new cuk(cun.pR), $$0);
      }
   }

   private void a(bsw $$0, cuk $$1, azc $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bum.b<cli> dT() {
      return bum.a(bY, e);
   }

   @Override
   protected bum<?> a(Dynamic<?> $$0) {
      return clj.a(this, this.dT().a($$0));
   }

   @Override
   public bum<cli> dS() {
      return (bum<cli>)super.dS();
   }

   @Override
   public bqp b(cms $$0, bqo $$1) {
      bqp $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dP().B) {
         return clj.a(this, $$0, $$1);
      } else {
         boolean $$3 = clj.b(this, $$0.b($$1)) && this.gs() != clk.d;
         return $$3 ? bqp.a : bqp.e;
      }
   }

   @Override
   public bss e(btw $$0) {
      return this.p_() ? ck : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.ap().a(bZ, $$0);
      if (!this.dP().B) {
         buo $$1 = this.f(bus.r);
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
      this.dS().a((arb)this.dP(), this);
      this.dP().ag().c();
      clj.a(this);
      super.Z();
   }

   @Override
   public int ej() {
      return this.bN;
   }

   @Override
   protected void c(arb $$0) {
      clj.b(this);
      this.cm.f().forEach(this::b);
      super.c($$0);
   }

   private cuk gz() {
      return (double)this.ah.i() < 0.5 ? new cuk(cun.vT) : new cuk(cun.oV);
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
   public clk gs() {
      if (this.gy()) {
         return clk.e;
      } else if (clj.a(this.eY())) {
         return clk.d;
      } else if (this.gi() && this.gt()) {
         return clk.a;
      } else if (this.gA()) {
         return clk.c;
      } else {
         return this.gi() && this.b(cun.vT) ? clk.b : clk.f;
      }
   }

   public boolean gy() {
      return this.ao.a(cb);
   }

   public void x(boolean $$0) {
      this.ao.a(cb, $$0);
   }

   @Override
   public boolean a(bri $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof btk) {
            clj.a(this, (btk)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(btk $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(cvd $$0) {
      return $$0 == cun.vT;
   }

   protected void p(cuk $$0) {
      this.b(bsw.a, $$0);
   }

   protected void q(cuk $$0) {
      if ($$0.a(clj.c)) {
         this.a(bsw.b, $$0);
         this.f(bsw.b);
      } else {
         this.b(bsw.b, $$0);
      }
   }

   @Override
   public boolean k(cuk $$0) {
      return this.dP().ab().b(dbp.c) && this.fV() && clj.a(this, $$0);
   }

   protected boolean r(cuk $$0) {
      bsw $$1 = btm.h($$0);
      cuk $$2 = this.a($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(cuk $$0, cuk $$1) {
      if (czw.f($$1)) {
         return false;
      } else {
         boolean $$2 = clj.a($$0) || $$0.a(cun.vT);
         boolean $$3 = clj.a($$1) || $$1.a(cun.vT);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.gr() && !$$0.a(cun.vT) && $$1.a(cun.vT) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(cjc $$0) {
      this.a($$0);
      clj.a(this, $$0);
   }

   @Override
   public boolean a(bsp $$0, boolean $$1) {
      if (this.p_() && $$0.ak() == bsv.Z) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bsp b(bsp $$0, int $$1) {
      List<bsp> $$2 = $$0.cS();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected avv v() {
      return this.dP().B ? null : clj.c(this).orElse(null);
   }

   @Override
   protected avv d(bri $$0) {
      return avw.tI;
   }

   @Override
   protected avv o_() {
      return avw.tG;
   }

   @Override
   protected void b(iz $$0, drx $$1) {
      this.a(avw.tK, 0.15F, 1.0F);
   }

   @Override
   protected void gu() {
      this.b(avw.tL);
   }
}
