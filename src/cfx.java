import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cfx extends cfw implements cea, cgs {
   private static final aie<Boolean> bU = aih.a(cfx.class, aig.k);
   private static final aie<Boolean> bV = aih.a(cfx.class, aig.k);
   private static final aie<Boolean> bW = aih.a(cfx.class, aig.k);
   private static final UUID bX = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final bpj bY = new bpj(bX, "Baby speed boost", 0.2F, bpj.a.b);
   private static final int bZ = 16;
   private static final float ca = 0.35F;
   private static final int cb = 5;
   private static final float cc = 1.6F;
   private static final float cd = 0.1F;
   private static final int ce = 3;
   private static final float cf = 0.2F;
   private static final bnr cg = bnu.ay.n().a(0.5F).b(0.97F);
   private static final double ch = 0.5;
   private final bmd ci = new bmd(8);
   private boolean cj;
   protected static final ImmutableList<byo<? extends byn<? super cfx>>> e = ImmutableList.of(byo.c, byo.d, byo.b, byo.f, byo.l);
   protected static final ImmutableList<bxh<?>> bT = ImmutableList.of(
      bxh.n,
      bxh.v,
      bxh.g,
      bxh.h,
      bxh.k,
      bxh.l,
      bxh.ao,
      bxh.an,
      bxh.L,
      bxh.aP,
      bxh.x,
      bxh.y,
      new bxh[]{
         bxh.m,
         bxh.E,
         bxh.o,
         bxh.p,
         bxh.q,
         bxh.t,
         bxh.ab,
         bxh.ac,
         bxh.z,
         bxh.ad,
         bxh.ae,
         bxh.ag,
         bxh.af,
         bxh.ai,
         bxh.aj,
         bxh.ah,
         bxh.al,
         bxh.M,
         bxh.ar,
         bxh.s,
         bxh.as,
         bxh.at,
         bxh.ak,
         bxh.am,
         bxh.au,
         bxh.av,
         bxh.aw
      }
   );

   public cfx(bnu<? extends cfw> $$0, cvn $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      if (this.o_()) {
         $$0.a("IsBaby", true);
      }

      if (this.cj) {
         $$0.a("CannotHunt", true);
      }

      this.a_($$0);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.c($$0);
   }

   @axl
   @Override
   public bmd A() {
      return this.ci;
   }

   @Override
   protected void a(bmn $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cdz $$4 && $$4.gh()) {
         coz $$5 = new coz(cpc.un);
         $$4.gi();
         this.b($$5);
      }

      this.ci.f().forEach(this::b);
   }

   protected coz l(coz $$0) {
      return this.ci.a($$0);
   }

   protected boolean m(coz $$0) {
      return this.ci.b($$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bU, false);
      this.am.a(bV, false);
      this.am.a(bW, false);
   }

   @Override
   public void a(aie<?> $$0) {
      super.a($$0);
      if (bU.equals($$0)) {
         this.k_();
      }
   }

   public static bpk.a gn() {
      return cen.gm().a(bpl.n, 16.0).a(bpl.o, 0.35F).a(bpl.c, 5.0);
   }

   public static boolean b(bnu<cfx> $$0, cvo $$1, bok $$2, hz $$3, awo $$4) {
      return !$$1.a_($$3.d()).a(cyq.kK);
   }

   @Nullable
   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      awo $$5 = $$0.F_();
      if ($$2 != bok.d) {
         if ($$5.i() < 0.2F) {
            this.a(true);
         } else if (this.gh()) {
            this.a(bnv.a, this.gp());
         }
      }

      cfy.a(this, $$0.F_());
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean Y() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.fN();
   }

   @Override
   protected void a(awo $$0, bls $$1) {
      if (this.gh()) {
         this.a(bnv.f, new coz(cpc.pN), $$0);
         this.a(bnv.e, new coz(cpc.pO), $$0);
         this.a(bnv.d, new coz(cpc.pP), $$0);
         this.a(bnv.c, new coz(cpc.pQ), $$0);
      }
   }

   private void a(bnv $$0, coz $$1, awo $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bpf.b<cfx> dP() {
      return bpf.a(bT, e);
   }

   @Override
   protected bpf<?> a(Dynamic<?> $$0) {
      return cfy.a(this, this.dP().a($$0));
   }

   @Override
   public bpf<cfx> dO() {
      return (bpf<cfx>)super.dO();
   }

   @Override
   public blu b(chh $$0, blt $$1) {
      blu $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dM().B) {
         return cfy.a(this, $$0, $$1);
      } else {
         boolean $$3 = cfy.b(this, $$0.b($$1)) && this.gi() != cfz.d;
         return $$3 ? blu.a : blu.d;
      }
   }

   @Override
   public bnr e(bor $$0) {
      return this.o_() ? cg : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.an().b(bU, $$0);
      if (!this.dM().B) {
         bph $$1 = this.f(bpl.o);
         $$1.b(bY.a());
         if ($$0) {
            $$1.c(bY);
         }
      }
   }

   @Override
   public boolean o_() {
      return this.an().b(bU);
   }

   private void y(boolean $$0) {
      this.cj = $$0;
   }

   @Override
   protected boolean u() {
      return !this.cj;
   }

   @Override
   protected void aa() {
      this.dM().af().a("piglinBrain");
      this.dO().a((aov)this.dM(), this);
      this.dM().af().c();
      cfy.a(this);
      super.aa();
   }

   @Override
   public int ef() {
      return this.bJ;
   }

   @Override
   protected void c(aov $$0) {
      cfy.b(this);
      this.ci.f().forEach(this::b);
      super.c($$0);
   }

   private coz gp() {
      return (double)this.af.i() < 0.5 ? new coz(cpc.vP) : new coz(cpc.oU);
   }

   private boolean gq() {
      return this.am.b(bV);
   }

   @Override
   public void b(boolean $$0) {
      this.am.b(bV, $$0);
   }

   @Override
   public void a() {
      this.bb = 0;
   }

   @Override
   public cfz gi() {
      if (this.go()) {
         return cfz.e;
      } else if (cfy.a(this.eU())) {
         return cfz.d;
      } else if (this.fY() && this.gj()) {
         return cfz.a;
      } else if (this.gq()) {
         return cfz.c;
      } else {
         return this.fY() && this.b(cpc.vP) ? cfz.b : cfz.f;
      }
   }

   public boolean go() {
      return this.am.b(bW);
   }

   public void x(boolean $$0) {
      this.am.b(bW, $$0);
   }

   @Override
   public boolean a(bmn $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bog) {
            cfy.a(this, (bog)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(bog $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(bog $$0, coz $$1, chz $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public boolean a(cpp $$0) {
      return $$0 == cpc.vP;
   }

   protected void n(coz $$0) {
      this.b(bnv.a, $$0);
   }

   protected void o(coz $$0) {
      if ($$0.a(cfy.c)) {
         this.a(bnv.b, $$0);
         this.e(bnv.b);
      } else {
         this.b(bnv.b, $$0);
      }
   }

   @Override
   public boolean k(coz $$0) {
      return this.dM().Z().b(cvj.c) && this.fM() && cfy.a(this, $$0);
   }

   protected boolean p(coz $$0) {
      bnv $$1 = boi.h($$0);
      coz $$2 = this.c($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(coz $$0, coz $$1) {
      if (ctj.d($$1)) {
         return false;
      } else {
         boolean $$2 = cfy.a($$0) || $$0.a(cpc.vP);
         boolean $$3 = cfy.a($$1) || $$1.a(cpc.vP);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.gh() && !$$0.a(cpc.vP) && $$1.a(cpc.vP) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(cds $$0) {
      this.a($$0);
      cfy.a(this, $$0);
   }

   @Override
   public boolean a(bno $$0, boolean $$1) {
      if (this.o_() && $$0.ai() == bnu.Y) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bno b(bno $$0, int $$1) {
      List<bno> $$2 = $$0.cP();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected atj y() {
      return this.dM().B ? null : cfy.c(this).orElse(null);
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.td;
   }

   @Override
   protected atj n_() {
      return atk.tb;
   }

   @Override
   protected void b(hz $$0, dlf $$1) {
      this.a(atk.tf, 0.15F, 1.0F);
   }

   @Override
   protected void gk() {
      this.b(atk.tg);
   }
}
