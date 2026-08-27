import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cbn extends cbm implements bzy, cci {
   private static final afc<Boolean> bV = aff.a(cbn.class, afe.k);
   private static final afc<Boolean> bW = aff.a(cbn.class, afe.k);
   private static final afc<Boolean> bX = aff.a(cbn.class, afe.k);
   private static final UUID bY = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final bln bZ = new bln(bY, "Baby speed boost", 0.2F, bln.a.b);
   private static final int ca = 16;
   private static final float cb = 0.35F;
   private static final int cc = 5;
   private static final float cd = 1.6F;
   private static final float ce = 0.1F;
   private static final int cf = 3;
   private static final float cg = 0.2F;
   private static final float ch = 0.82F;
   private static final double ci = 0.5;
   private final bii cj = new bii(8);
   private boolean ck;
   protected static final ImmutableList<bup<? extends buo<? super cbn>>> bT = ImmutableList.of(bup.c, bup.d, bup.b, bup.f, bup.k);
   protected static final ImmutableList<btk<?>> bU = ImmutableList.of(
      btk.n,
      btk.v,
      btk.g,
      btk.h,
      btk.k,
      btk.l,
      btk.an,
      btk.am,
      btk.K,
      btk.aO,
      btk.x,
      btk.y,
      new btk[]{
         btk.m,
         btk.E,
         btk.o,
         btk.p,
         btk.q,
         btk.t,
         btk.aa,
         btk.ab,
         btk.z,
         btk.ac,
         btk.ad,
         btk.af,
         btk.ae,
         btk.ah,
         btk.ai,
         btk.ag,
         btk.ak,
         btk.L,
         btk.aq,
         btk.s,
         btk.ar,
         btk.as,
         btk.aj,
         btk.al,
         btk.at,
         btk.au,
         btk.av
      }
   );

   public cbn(bjx<? extends cbm> $$0, cqz $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public void b(rt $$0) {
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
   public void a(rt $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.c($$0);
   }

   @aua
   @Override
   public bii y() {
      return this.cj;
   }

   @Override
   protected void a(bir $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof bzx $$4 && $$4.gf()) {
         ckj $$5 = new ckj(ckm.tx);
         $$4.gg();
         this.b($$5);
      }

      this.cj.f().forEach(this::b);
   }

   protected ckj l(ckj $$0) {
      return this.cj.a($$0);
   }

   protected boolean m(ckj $$0) {
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
   public void a(afc<?> $$0) {
      super.a($$0);
      if (bV.equals($$0)) {
         this.j_();
      }
   }

   public static blo.a gl() {
      return cal.gk().a(blp.l, 16.0).a(blp.m, 0.35F).a(blp.c, 5.0);
   }

   public static boolean b(bjx<cbn> $$0, cra $$1, bkn $$2, ht $$3, ate $$4) {
      return !$$1.a_($$3.d()).a(cuc.kK);
   }

   @Nullable
   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      ate $$5 = $$0.E_();
      if ($$2 != bkn.d) {
         if ($$5.i() < 0.2F) {
            this.a(true);
         } else if (this.gf()) {
            this.a(bjy.a, this.gn());
         }
      }

      cbo.a(this, $$0.E_());
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean V() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.fL();
   }

   @Override
   protected void a(ate $$0, bhz $$1) {
      if (this.gf()) {
         this.a(bjy.f, new ckj(ckm.pa), $$0);
         this.a(bjy.e, new ckj(ckm.pb), $$0);
         this.a(bjy.d, new ckj(ckm.pc), $$0);
         this.a(bjy.c, new ckj(ckm.pd), $$0);
      }
   }

   private void a(bjy $$0, ckj $$1, ate $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected blj.b<cbn> dO() {
      return blj.a(bU, bT);
   }

   @Override
   protected blj<?> a(Dynamic<?> $$0) {
      return cbo.a(this, this.dO().a($$0));
   }

   @Override
   public blj<cbn> dN() {
      return (blj<cbn>)super.dN();
   }

   @Override
   public bib b(ccx $$0, bia $$1) {
      bib $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dL().B) {
         return cbo.a(this, $$0, $$1);
      } else {
         boolean $$3 = cbo.b(this, $$0.b($$1)) && this.gg() != cbp.d;
         return $$3 ? bib.a : bib.d;
      }
   }

   @Override
   protected float b(bkv $$0, bju $$1) {
      float $$2 = super.b($$0, $$1);
      return this.n_() ? $$2 - 0.82F : $$2;
   }

   @Override
   public void a(boolean $$0) {
      this.al().b(bV, $$0);
      if (!this.dL().B) {
         bll $$1 = this.a(blp.m);
         $$1.b(bZ.a());
         if ($$0) {
            $$1.b(bZ);
         }
      }
   }

   @Override
   public boolean n_() {
      return this.al().b(bV);
   }

   private void y(boolean $$0) {
      this.ck = $$0;
   }

   @Override
   protected boolean s() {
      return !this.ck;
   }

   @Override
   protected void X() {
      this.dL().ad().a("piglinBrain");
      this.dN().a((alq)this.dL(), this);
      this.dL().ad().c();
      cbo.a(this);
      super.X();
   }

   @Override
   public int ed() {
      return this.bJ;
   }

   @Override
   protected void c(alq $$0) {
      cbo.b(this);
      this.cj.f().forEach(this::b);
      super.c($$0);
   }

   private ckj gn() {
      return (double)this.ag.i() < 0.5 ? new ckj(ckm.uZ) : new ckj(ckm.oh);
   }

   private boolean go() {
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
   public cbp gg() {
      if (this.gm()) {
         return cbp.e;
      } else if (cbo.a(this.eT())) {
         return cbp.d;
      } else if (this.fW() && this.gh()) {
         return cbp.a;
      } else if (this.go()) {
         return cbp.c;
      } else {
         return this.fW() && this.b(ckm.uZ) ? cbp.b : cbp.f;
      }
   }

   public boolean gm() {
      return this.an.b(bX);
   }

   public void x(boolean $$0) {
      this.an.b(bX, $$0);
   }

   @Override
   public boolean a(bir $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dL().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bkj) {
            cbo.a(this, (bkj)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(bkj $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(bkj $$0, ckj $$1, cdp $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public boolean a(ckz $$0) {
      return $$0 == ckm.uZ;
   }

   protected void n(ckj $$0) {
      this.b(bjy.a, $$0);
   }

   protected void o(ckj $$0) {
      if ($$0.a(cbo.c)) {
         this.a(bjy.b, $$0);
         this.e(bjy.b);
      } else {
         this.b(bjy.b, $$0);
      }
   }

   @Override
   public boolean k(ckj $$0) {
      return this.dL().X().b(cqv.c) && this.fK() && cbo.a(this, $$0);
   }

   protected boolean p(ckj $$0) {
      bjy $$1 = bkl.h($$0);
      ckj $$2 = this.c($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(ckj $$0, ckj $$1) {
      if (cov.d($$1)) {
         return false;
      } else {
         boolean $$2 = cbo.a($$0) || $$0.a(ckm.uZ);
         boolean $$3 = cbo.a($$1) || $$1.a(ckm.uZ);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.gf() && !$$0.a(ckm.uZ) && $$1.a(ckm.uZ) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(bzq $$0) {
      this.a($$0);
      cbo.a(this, $$0);
   }

   @Override
   public boolean a(bjt $$0, boolean $$1) {
      if (this.n_() && $$0.ag() == bjx.W) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bjt b(bjt $$0, int $$1) {
      List<bjt> $$2 = $$0.cP();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected aqc w() {
      return this.dL().B ? null : cbo.c(this).orElse(null);
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.sb;
   }

   @Override
   protected aqc m_() {
      return aqd.rZ;
   }

   @Override
   protected void b(ht $$0, dgb $$1) {
      this.a(aqd.sd, 0.15F, 1.0F);
   }

   protected void b(aqc $$0) {
      this.a($$0, this.eV(), this.eW());
   }

   @Override
   protected void gi() {
      this.b(aqd.se);
   }
}
