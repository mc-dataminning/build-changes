import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class clm extends cll implements cjp, cmh {
   private static final akj<Boolean> bZ = akn.a(clm.class, akl.k);
   private static final akj<Boolean> ca = akn.a(clm.class, akl.k);
   private static final akj<Boolean> cb = akn.a(clm.class, akl.k);
   private static final UUID cc = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final buu cd = new buu(cc, "Baby speed boost", 0.2F, buu.a.b);
   private static final int ce = 16;
   private static final float cf = 0.35F;
   private static final int cg = 5;
   private static final float ch = 0.1F;
   private static final int ci = 3;
   private static final float cj = 0.2F;
   private static final bsw ck = bsz.aA.n().a(0.5F).b(0.97F);
   private static final double cl = 0.5;
   private final brc cm = new brc(8);
   private boolean cn;
   protected static final ImmutableList<cdz<? extends cdy<? super clm>>> e = ImmutableList.of(cdz.c, cdz.d, cdz.b, cdz.f, cdz.l);
   protected static final ImmutableList<ccs<?>> bY = ImmutableList.of(
      ccs.n,
      ccs.v,
      ccs.g,
      ccs.h,
      ccs.k,
      ccs.l,
      ccs.ao,
      ccs.an,
      ccs.L,
      ccs.aP,
      ccs.x,
      ccs.y,
      new ccs[]{
         ccs.m,
         ccs.E,
         ccs.o,
         ccs.p,
         ccs.q,
         ccs.t,
         ccs.ab,
         ccs.ac,
         ccs.z,
         ccs.ad,
         ccs.ae,
         ccs.ag,
         ccs.af,
         ccs.ai,
         ccs.aj,
         ccs.ah,
         ccs.al,
         ccs.M,
         ccs.ar,
         ccs.s,
         ccs.as,
         ccs.at,
         ccs.ak,
         ccs.am,
         ccs.au,
         ccs.av,
         ccs.aw
      }
   );

   public clm(bsz<? extends cll> $$0, dbx $$1) {
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

   @bac
   @Override
   public brc y() {
      return this.cm;
   }

   @Override
   protected void a(brm $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cjo $$4 && $$4.gr()) {
         cuo $$5 = new cuo(cur.ur);
         $$4.gs();
         this.b($$5);
      }

      this.cm.f().forEach(this::b);
   }

   protected cuo n(cuo $$0) {
      return this.cm.b($$0);
   }

   protected boolean o(cuo $$0) {
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

   public static buv.a gx() {
      return ckc.gw().a(buw.q, 16.0).a(buw.r, 0.35F).a(buw.c, 5.0);
   }

   public static boolean b(bsz<clm> $$0, dby $$1, bts $$2, iz $$3, azg $$4) {
      return !$$1.a_($$3.d()).a(dfa.kK);
   }

   @Nullable
   @Override
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
      azg $$4 = $$0.E_();
      if ($$2 != bts.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.gr()) {
            this.a(bta.a, this.gz());
         }
      }

      cln.a(this, $$0.E_());
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
   protected void a(azg $$0, bqr $$1) {
      if (this.gr()) {
         this.a(bta.f, new cuo(cur.pO), $$0);
         this.a(bta.e, new cuo(cur.pP), $$0);
         this.a(bta.d, new cuo(cur.pQ), $$0);
         this.a(bta.c, new cuo(cur.pR), $$0);
      }
   }

   private void a(bta $$0, cuo $$1, azg $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected buq.b<clm> dT() {
      return buq.a(bY, e);
   }

   @Override
   protected buq<?> a(Dynamic<?> $$0) {
      return cln.a(this, this.dT().a($$0));
   }

   @Override
   public buq<clm> dS() {
      return (buq<clm>)super.dS();
   }

   @Override
   public bqt b(cmw $$0, bqs $$1) {
      bqt $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dP().B) {
         return cln.a(this, $$0, $$1);
      } else {
         boolean $$3 = cln.b(this, $$0.b($$1)) && this.gs() != clo.d;
         return $$3 ? bqt.a : bqt.e;
      }
   }

   @Override
   public bsw e(bua $$0) {
      return this.p_() ? ck : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.ap().a(bZ, $$0);
      if (!this.dP().B) {
         bus $$1 = this.f(buw.r);
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
      cln.a(this);
      super.Z();
   }

   @Override
   public int ej() {
      return this.bN;
   }

   @Override
   protected void c(are $$0) {
      cln.b(this);
      this.cm.f().forEach(this::b);
      super.c($$0);
   }

   private cuo gz() {
      return (double)this.ah.i() < 0.5 ? new cuo(cur.vT) : new cuo(cur.oV);
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
   public clo gs() {
      if (this.gy()) {
         return clo.e;
      } else if (cln.a(this.eY())) {
         return clo.d;
      } else if (this.gi() && this.gt()) {
         return clo.a;
      } else if (this.gA()) {
         return clo.c;
      } else {
         return this.gi() && this.b(cur.vT) ? clo.b : clo.f;
      }
   }

   public boolean gy() {
      return this.ao.a(cb);
   }

   public void x(boolean $$0) {
      this.ao.a(cb, $$0);
   }

   @Override
   public boolean a(brm $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bto) {
            cln.a(this, (bto)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(bto $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(cvh $$0) {
      return $$0 == cur.vT;
   }

   protected void p(cuo $$0) {
      this.b(bta.a, $$0);
   }

   protected void q(cuo $$0) {
      if ($$0.a(cln.c)) {
         this.a(bta.b, $$0);
         this.f(bta.b);
      } else {
         this.b(bta.b, $$0);
      }
   }

   @Override
   public boolean k(cuo $$0) {
      return this.dP().ab().b(dbt.c) && this.fV() && cln.a(this, $$0);
   }

   protected boolean r(cuo $$0) {
      bta $$1 = btq.h($$0);
      cuo $$2 = this.a($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(cuo $$0, cuo $$1) {
      if (daa.f($$1)) {
         return false;
      } else {
         boolean $$2 = cln.a($$0) || $$0.a(cur.vT);
         boolean $$3 = cln.a($$1) || $$1.a(cur.vT);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.gr() && !$$0.a(cur.vT) && $$1.a(cur.vT) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(cjg $$0) {
      this.a($$0);
      cln.a(this, $$0);
   }

   @Override
   public boolean a(bst $$0, boolean $$1) {
      if (this.p_() && $$0.ak() == bsz.Z) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bst b(bst $$0, int $$1) {
      List<bst> $$2 = $$0.cS();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected avy v() {
      return this.dP().B ? null : cln.c(this).orElse(null);
   }

   @Override
   protected avy d(brm $$0) {
      return avz.tI;
   }

   @Override
   protected avy o_() {
      return avz.tG;
   }

   @Override
   protected void b(iz $$0, dsb $$1) {
      this.a(avz.tK, 0.15F, 1.0F);
   }

   @Override
   protected void gu() {
      this.b(avz.tL);
   }
}
