import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cij extends cii implements cgm, cje {
   private static final aiy<Boolean> bY = ajc.a(cij.class, aja.k);
   private static final aiy<Boolean> bZ = ajc.a(cij.class, aja.k);
   private static final aiy<Boolean> ca = ajc.a(cij.class, aja.k);
   private static final UUID cb = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final brt cc = new brt(cb, "Baby speed boost", 0.2F, brt.a.b);
   private static final int cd = 16;
   private static final float ce = 0.35F;
   private static final int cf = 5;
   private static final float cg = 0.1F;
   private static final int ch = 3;
   private static final float ci = 0.2F;
   private static final bpy cj = bqb.az.n().a(0.5F).b(0.97F);
   private static final double ck = 0.5;
   private final boj cl = new boj(8);
   private boolean cm;
   protected static final ImmutableList<cay<? extends cax<? super cij>>> e = ImmutableList.of(cay.c, cay.d, cay.b, cay.f, cay.l);
   protected static final ImmutableList<bzr<?>> bX = ImmutableList.of(
      bzr.n,
      bzr.v,
      bzr.g,
      bzr.h,
      bzr.k,
      bzr.l,
      bzr.ao,
      bzr.an,
      bzr.L,
      bzr.aP,
      bzr.x,
      bzr.y,
      new bzr[]{
         bzr.m,
         bzr.E,
         bzr.o,
         bzr.p,
         bzr.q,
         bzr.t,
         bzr.ab,
         bzr.ac,
         bzr.z,
         bzr.ad,
         bzr.ae,
         bzr.ag,
         bzr.af,
         bzr.ai,
         bzr.aj,
         bzr.ah,
         bzr.al,
         bzr.M,
         bzr.ar,
         bzr.s,
         bzr.as,
         bzr.at,
         bzr.ak,
         bzr.am,
         bzr.au,
         bzr.av,
         bzr.aw
      }
   );

   public cij(bqb<? extends cii> $$0, cyx $$1) {
      super($$0, $$1);
      this.bM = 5;
   }

   @Override
   public void b(tm $$0) {
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
   public void a(tm $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.a($$0, this.dO());
   }

   @ayn
   @Override
   public boj y() {
      return this.cl;
   }

   @Override
   protected void a(bot $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cgl $$4 && $$4.go()) {
         crj $$5 = new crj(crm.up);
         $$4.gp();
         this.b($$5);
      }

      this.cl.f().forEach(this::b);
   }

   protected crj n(crj $$0) {
      return this.cl.a($$0);
   }

   protected boolean o(crj $$0) {
      return this.cl.b($$0);
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
      $$0.a(bZ, false);
      $$0.a(ca, false);
   }

   @Override
   public void a(aiy<?> $$0) {
      super.a($$0);
      if (bY.equals($$0)) {
         this.j_();
      }
   }

   public static bru.a gu() {
      return cgz.gt().a(brv.q, 16.0).a(brv.r, 0.35F).a(brv.c, 5.0);
   }

   public static boolean b(bqb<cij> $$0, cyy $$1, bqs $$2, ib $$3, axr $$4) {
      return !$$1.a_($$3.d()).a(dca.kK);
   }

   @Nullable
   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      axr $$4 = $$0.E_();
      if ($$2 != bqs.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.go()) {
            this.a(bqc.a, this.gw());
         }
      }

      cik.a(this, $$0.E_());
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
   protected void a(axr $$0, bny $$1) {
      if (this.go()) {
         this.a(bqc.f, new crj(crm.pN), $$0);
         this.a(bqc.e, new crj(crm.pO), $$0);
         this.a(bqc.d, new crj(crm.pP), $$0);
         this.a(bqc.c, new crj(crm.pQ), $$0);
      }
   }

   private void a(bqc $$0, crj $$1, axr $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected brp.b<cij> dQ() {
      return brp.a(bX, e);
   }

   @Override
   protected brp<?> a(Dynamic<?> $$0) {
      return cik.a(this, this.dQ().a($$0));
   }

   @Override
   public brp<cij> dP() {
      return (brp<cij>)super.dP();
   }

   @Override
   public boa b(cjt $$0, bnz $$1) {
      boa $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dM().B) {
         return cik.a(this, $$0, $$1);
      } else {
         boolean $$3 = cik.b(this, $$0.b($$1)) && this.gp() != cil.d;
         return $$3 ? boa.a : boa.d;
      }
   }

   @Override
   public bpy e(bqz $$0) {
      return this.p_() ? cj : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.an().a(bY, $$0);
      if (!this.dM().B) {
         brr $$1 = this.f(brv.r);
         $$1.b(cc.a());
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
      this.dP().a((aps)this.dM(), this);
      this.dM().af().c();
      cik.a(this);
      super.Y();
   }

   @Override
   public int eg() {
      return this.bM;
   }

   @Override
   protected void c(aps $$0) {
      cik.b(this);
      this.cl.f().forEach(this::b);
      super.c($$0);
   }

   private crj gw() {
      return (double)this.ag.i() < 0.5 ? new crj(crm.vR) : new crj(crm.oU);
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
   public cil gp() {
      if (this.gv()) {
         return cil.e;
      } else if (cik.a(this.eV())) {
         return cil.d;
      } else if (this.gf() && this.gq()) {
         return cil.a;
      } else if (this.gx()) {
         return cil.c;
      } else {
         return this.gf() && this.b(crm.vR) ? cil.b : cil.f;
      }
   }

   public boolean gv() {
      return this.an.a(ca);
   }

   public void x(boolean $$0) {
      this.an.a(ca, $$0);
   }

   @Override
   public boolean a(bot $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bqo) {
            cik.a(this, (bqo)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(bqo $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(crz $$0) {
      return $$0 == crm.vR;
   }

   protected void p(crj $$0) {
      this.b(bqc.a, $$0);
   }

   protected void q(crj $$0) {
      if ($$0.a(cik.c)) {
         this.a(bqc.b, $$0);
         this.f(bqc.b);
      } else {
         this.b(bqc.b, $$0);
      }
   }

   @Override
   public boolean k(crj $$0) {
      return this.dM().aa().b(cyt.c) && this.fT() && cik.a(this, $$0);
   }

   protected boolean r(crj $$0) {
      bqc $$1 = bqq.h($$0);
      crj $$2 = this.d($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(crj $$0, crj $$1) {
      if (cwr.e($$1)) {
         return false;
      } else {
         boolean $$2 = cik.a($$0) || $$0.a(crm.vR);
         boolean $$3 = cik.a($$1) || $$1.a(crm.vR);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.go() && !$$0.a(crm.vR) && $$1.a(crm.vR) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(cgd $$0) {
      this.a($$0);
      cik.a(this, $$0);
   }

   @Override
   public boolean a(bpv $$0, boolean $$1) {
      if (this.p_() && $$0.ai() == bqb.Z) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bpv b(bpv $$0, int $$1) {
      List<bpv> $$2 = $$0.cP();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected aul v() {
      return this.dM().B ? null : cik.c(this).orElse(null);
   }

   @Override
   protected aul d(bot $$0) {
      return aum.tp;
   }

   @Override
   protected aul o_() {
      return aum.tn;
   }

   @Override
   protected void b(ib $$0, doz $$1) {
      this.a(aum.tr, 0.15F, 1.0F);
   }

   @Override
   protected void gr() {
      this.b(aum.ts);
   }
}
