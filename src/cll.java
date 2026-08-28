import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cll extends clk implements cjo, cmg {
   private static final akj<Boolean> bZ = akn.a(cll.class, akl.k);
   private static final akj<Boolean> ca = akn.a(cll.class, akl.k);
   private static final akj<Boolean> cb = akn.a(cll.class, akl.k);
   private static final UUID cc = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final but cd = new but(cc, "Baby speed boost", 0.2F, but.a.b);
   private static final int ce = 16;
   private static final float cf = 0.35F;
   private static final int cg = 5;
   private static final float ch = 0.1F;
   private static final int ci = 3;
   private static final float cj = 0.2F;
   private static final bsv ck = bsy.aA.n().a(0.5F).b(0.97F);
   private static final double cl = 0.5;
   private final brb cm = new brb(8);
   private boolean cn;
   protected static final ImmutableList<cdy<? extends cdx<? super cll>>> e = ImmutableList.of(cdy.c, cdy.d, cdy.b, cdy.f, cdy.l);
   protected static final ImmutableList<ccr<?>> bY = ImmutableList.of(
      ccr.n,
      ccr.v,
      ccr.g,
      ccr.h,
      ccr.k,
      ccr.l,
      ccr.ao,
      ccr.an,
      ccr.L,
      ccr.aP,
      ccr.x,
      ccr.y,
      new ccr[]{
         ccr.m,
         ccr.E,
         ccr.o,
         ccr.p,
         ccr.q,
         ccr.t,
         ccr.ab,
         ccr.ac,
         ccr.z,
         ccr.ad,
         ccr.ae,
         ccr.ag,
         ccr.af,
         ccr.ai,
         ccr.aj,
         ccr.ah,
         ccr.al,
         ccr.M,
         ccr.ar,
         ccr.s,
         ccr.as,
         ccr.at,
         ccr.ak,
         ccr.am,
         ccr.au,
         ccr.av,
         ccr.aw
      }
   );

   public cll(bsy<? extends clk> $$0, dbw $$1) {
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

   @bab
   @Override
   public brb y() {
      return this.cm;
   }

   @Override
   protected void a(brl $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cjn $$4 && $$4.gr()) {
         cun $$5 = new cun(cuq.ur);
         $$4.gs();
         this.b($$5);
      }

      this.cm.f().forEach(this::b);
   }

   protected cun n(cun $$0) {
      return this.cm.b($$0);
   }

   protected boolean o(cun $$0) {
      return this.cm.c($$0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
      $$0.a(ca, false);
      $$0.a(cb, false);
   }

   @Override
   public void a(akj<?> $$0) {
      super.a($$0);
      if (bZ.equals($$0)) {
         this.j_();
      }
   }

   public static buu.a gx() {
      return ckb.gw().a(buv.q, 16.0).a(buv.r, 0.35F).a(buv.c, 5.0);
   }

   public static boolean b(bsy<cll> $$0, dbx $$1, btr $$2, iz $$3, azf $$4) {
      return !$$1.a_($$3.d()).a(dez.kK);
   }

   @Nullable
   @Override
   public bug a(dcl $$0, bqq $$1, btr $$2, @Nullable bug $$3) {
      azf $$4 = $$0.E_();
      if ($$2 != btr.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.gr()) {
            this.a(bsz.a, this.gz());
         }
      }

      clm.a(this, $$0.E_());
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
   protected void a(azf $$0, bqq $$1) {
      if (this.gr()) {
         this.a(bsz.f, new cun(cuq.pO), $$0);
         this.a(bsz.e, new cun(cuq.pP), $$0);
         this.a(bsz.d, new cun(cuq.pQ), $$0);
         this.a(bsz.c, new cun(cuq.pR), $$0);
      }
   }

   private void a(bsz $$0, cun $$1, azf $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bup.b<cll> dT() {
      return bup.a(bY, e);
   }

   @Override
   protected bup<?> a(Dynamic<?> $$0) {
      return clm.a(this, this.dT().a($$0));
   }

   @Override
   public bup<cll> dS() {
      return (bup<cll>)super.dS();
   }

   @Override
   public bqs b(cmv $$0, bqr $$1) {
      bqs $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dP().B) {
         return clm.a(this, $$0, $$1);
      } else {
         boolean $$3 = clm.b(this, $$0.b($$1)) && this.gs() != cln.d;
         return $$3 ? bqs.a : bqs.e;
      }
   }

   @Override
   public bsv e(btz $$0) {
      return this.p_() ? ck : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.ap().a(bZ, $$0);
      if (!this.dP().B) {
         bur $$1 = this.f(buv.r);
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
      this.dS().a((are)this.dP(), this);
      this.dP().ag().c();
      clm.a(this);
      super.Z();
   }

   @Override
   public int ej() {
      return this.bN;
   }

   @Override
   protected void c(are $$0) {
      clm.b(this);
      this.cm.f().forEach(this::b);
      super.c($$0);
   }

   private cun gz() {
      return (double)this.ah.i() < 0.5 ? new cun(cuq.vT) : new cun(cuq.oV);
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
   public cln gs() {
      if (this.gy()) {
         return cln.e;
      } else if (clm.a(this.eY())) {
         return cln.d;
      } else if (this.gi() && this.gt()) {
         return cln.a;
      } else if (this.gA()) {
         return cln.c;
      } else {
         return this.gi() && this.b(cuq.vT) ? cln.b : cln.f;
      }
   }

   public boolean gy() {
      return this.ao.a(cb);
   }

   public void x(boolean $$0) {
      this.ao.a(cb, $$0);
   }

   @Override
   public boolean a(brl $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof btn) {
            clm.a(this, (btn)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(btn $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(cvg $$0) {
      return $$0 == cuq.vT;
   }

   protected void p(cun $$0) {
      this.b(bsz.a, $$0);
   }

   protected void q(cun $$0) {
      if ($$0.a(clm.c)) {
         this.a(bsz.b, $$0);
         this.f(bsz.b);
      } else {
         this.b(bsz.b, $$0);
      }
   }

   @Override
   public boolean k(cun $$0) {
      return this.dP().ab().b(dbs.c) && this.fV() && clm.a(this, $$0);
   }

   protected boolean r(cun $$0) {
      bsz $$1 = btp.h($$0);
      cun $$2 = this.a($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(cun $$0, cun $$1) {
      if (czz.f($$1)) {
         return false;
      } else {
         boolean $$2 = clm.a($$0) || $$0.a(cuq.vT);
         boolean $$3 = clm.a($$1) || $$1.a(cuq.vT);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.gr() && !$$0.a(cuq.vT) && $$1.a(cuq.vT) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(cjf $$0) {
      this.a($$0);
      clm.a(this, $$0);
   }

   @Override
   public boolean a(bss $$0, boolean $$1) {
      if (this.p_() && $$0.ak() == bsy.Z) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bss b(bss $$0, int $$1) {
      List<bss> $$2 = $$0.cS();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected avy v() {
      return this.dP().B ? null : clm.c(this).orElse(null);
   }

   @Override
   protected avy d(brl $$0) {
      return avz.tI;
   }

   @Override
   protected avy o_() {
      return avz.tG;
   }

   @Override
   protected void b(iz $$0, dsa $$1) {
      this.a(avz.tK, 0.15F, 1.0F);
   }

   @Override
   protected void gu() {
      this.b(avz.tL);
   }
}
