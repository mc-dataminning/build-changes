import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class clo extends cln implements cjr, cmj {
   private static final akk<Boolean> bZ = ako.a(clo.class, akm.k);
   private static final akk<Boolean> ca = ako.a(clo.class, akm.k);
   private static final akk<Boolean> cb = ako.a(clo.class, akm.k);
   private static final UUID cc = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final buw cd = new buw(cc, "Baby speed boost", 0.2F, buw.a.b);
   private static final int ce = 16;
   private static final float cf = 0.35F;
   private static final int cg = 5;
   private static final float ch = 0.1F;
   private static final int ci = 3;
   private static final float cj = 0.2F;
   private static final bsy ck = btb.aA.n().a(0.5F).b(0.97F);
   private static final double cl = 0.5;
   private final bre cm = new bre(8);
   private boolean cn;
   protected static final ImmutableList<ceb<? extends cea<? super clo>>> e = ImmutableList.of(ceb.c, ceb.d, ceb.b, ceb.f, ceb.l);
   protected static final ImmutableList<ccu<?>> bY = ImmutableList.of(
      ccu.n,
      ccu.v,
      ccu.g,
      ccu.h,
      ccu.k,
      ccu.l,
      ccu.ao,
      ccu.an,
      ccu.L,
      ccu.aP,
      ccu.x,
      ccu.y,
      new ccu[]{
         ccu.m,
         ccu.E,
         ccu.o,
         ccu.p,
         ccu.q,
         ccu.t,
         ccu.ab,
         ccu.ac,
         ccu.z,
         ccu.ad,
         ccu.ae,
         ccu.ag,
         ccu.af,
         ccu.ai,
         ccu.aj,
         ccu.ah,
         ccu.al,
         ccu.M,
         ccu.ar,
         ccu.s,
         ccu.as,
         ccu.at,
         ccu.ak,
         ccu.am,
         ccu.au,
         ccu.av,
         ccu.aw
      }
   );

   public clo(btb<? extends cln> $$0, dbz $$1) {
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
   public bre y() {
      return this.cm;
   }

   @Override
   protected void a(bro $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cjq $$4 && $$4.gr()) {
         cuq $$5 = new cuq(cut.ur);
         $$4.gs();
         this.b($$5);
      }

      this.cm.f().forEach(this::b);
   }

   protected cuq n(cuq $$0) {
      return this.cm.b($$0);
   }

   protected boolean o(cuq $$0) {
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

   public static bux.a gx() {
      return cke.gw().a(buy.q, 16.0).a(buy.r, 0.35F).a(buy.c, 5.0);
   }

   public static boolean b(btb<clo> $$0, dca $$1, btu $$2, iz $$3, azh $$4) {
      return !$$1.a_($$3.d()).a(dfc.kK);
   }

   @Nullable
   @Override
   public buj a(dco $$0, bqt $$1, btu $$2, @Nullable buj $$3) {
      azh $$4 = $$0.E_();
      if ($$2 != btu.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.gr()) {
            this.a(btc.a, this.gz());
         }
      }

      clp.a(this, $$0.E_());
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
   protected void a(azh $$0, bqt $$1) {
      if (this.gr()) {
         this.a(btc.f, new cuq(cut.pO), $$0);
         this.a(btc.e, new cuq(cut.pP), $$0);
         this.a(btc.d, new cuq(cut.pQ), $$0);
         this.a(btc.c, new cuq(cut.pR), $$0);
      }
   }

   private void a(btc $$0, cuq $$1, azh $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bus.b<clo> dT() {
      return bus.a(bY, e);
   }

   @Override
   protected bus<?> a(Dynamic<?> $$0) {
      return clp.a(this, this.dT().a($$0));
   }

   @Override
   public bus<clo> dS() {
      return (bus<clo>)super.dS();
   }

   @Override
   public bqv b(cmy $$0, bqu $$1) {
      bqv $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dP().B) {
         return clp.a(this, $$0, $$1);
      } else {
         boolean $$3 = clp.b(this, $$0.b($$1)) && this.gs() != clq.d;
         return $$3 ? bqv.a : bqv.e;
      }
   }

   @Override
   public bsy e(buc $$0) {
      return this.p_() ? ck : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.ap().a(bZ, $$0);
      if (!this.dP().B) {
         buu $$1 = this.f(buy.r);
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
      clp.a(this);
      super.Z();
   }

   @Override
   public int ej() {
      return this.bN;
   }

   @Override
   protected void c(arf $$0) {
      clp.b(this);
      this.cm.f().forEach(this::b);
      super.c($$0);
   }

   private cuq gz() {
      return (double)this.ah.i() < 0.5 ? new cuq(cut.vT) : new cuq(cut.oV);
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
   public clq gs() {
      if (this.gy()) {
         return clq.e;
      } else if (clp.a(this.eY())) {
         return clq.d;
      } else if (this.gi() && this.gt()) {
         return clq.a;
      } else if (this.gA()) {
         return clq.c;
      } else {
         return this.gi() && this.b(cut.vT) ? clq.b : clq.f;
      }
   }

   public boolean gy() {
      return this.ao.a(cb);
   }

   public void x(boolean $$0) {
      this.ao.a(cb, $$0);
   }

   @Override
   public boolean a(bro $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof btq) {
            clp.a(this, (btq)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(btq $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(cvj $$0) {
      return $$0 == cut.vT;
   }

   protected void p(cuq $$0) {
      this.b(btc.a, $$0);
   }

   protected void q(cuq $$0) {
      if ($$0.a(clp.c)) {
         this.a(btc.b, $$0);
         this.f(btc.b);
      } else {
         this.b(btc.b, $$0);
      }
   }

   @Override
   public boolean k(cuq $$0) {
      return this.dP().ab().b(dbv.c) && this.fV() && clp.a(this, $$0);
   }

   protected boolean r(cuq $$0) {
      btc $$1 = bts.h($$0);
      cuq $$2 = this.a($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(cuq $$0, cuq $$1) {
      if (dac.f($$1)) {
         return false;
      } else {
         boolean $$2 = clp.a($$0) || $$0.a(cut.vT);
         boolean $$3 = clp.a($$1) || $$1.a(cut.vT);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.gr() && !$$0.a(cut.vT) && $$1.a(cut.vT) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(cji $$0) {
      this.a($$0);
      clp.a(this, $$0);
   }

   @Override
   public boolean a(bsv $$0, boolean $$1) {
      if (this.p_() && $$0.ak() == btb.Z) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bsv b(bsv $$0, int $$1) {
      List<bsv> $$2 = $$0.cS();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected avz v() {
      return this.dP().B ? null : clp.c(this).orElse(null);
   }

   @Override
   protected avz d(bro $$0) {
      return awa.tI;
   }

   @Override
   protected avz o_() {
      return awa.tG;
   }

   @Override
   protected void b(iz $$0, dsd $$1) {
      this.a(awa.tK, 0.15F, 1.0F);
   }

   @Override
   protected void gu() {
      this.b(awa.tL);
   }
}
