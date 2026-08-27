import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class ccc extends ccb implements can, ccx {
   private static final afm<Boolean> bV = afp.a(ccc.class, afo.k);
   private static final afm<Boolean> bW = afp.a(ccc.class, afo.k);
   private static final afm<Boolean> bX = afp.a(ccc.class, afo.k);
   private static final UUID bY = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final bmc bZ = new bmc(bY, "Baby speed boost", 0.2F, bmc.a.b);
   private static final int ca = 16;
   private static final float cb = 0.35F;
   private static final int cc = 5;
   private static final float cd = 1.6F;
   private static final float ce = 0.1F;
   private static final int cf = 3;
   private static final float cg = 0.2F;
   private static final float ch = 0.82F;
   private static final double ci = 0.5;
   private final bix cj = new bix(8);
   private boolean ck;
   protected static final ImmutableList<bve<? extends bvd<? super ccc>>> bT = ImmutableList.of(bve.c, bve.d, bve.b, bve.f, bve.k);
   protected static final ImmutableList<btz<?>> bU = ImmutableList.of(
      btz.n,
      btz.v,
      btz.g,
      btz.h,
      btz.k,
      btz.l,
      btz.an,
      btz.am,
      btz.K,
      btz.aO,
      btz.x,
      btz.y,
      new btz[]{
         btz.m,
         btz.E,
         btz.o,
         btz.p,
         btz.q,
         btz.t,
         btz.aa,
         btz.ab,
         btz.z,
         btz.ac,
         btz.ad,
         btz.af,
         btz.ae,
         btz.ah,
         btz.ai,
         btz.ag,
         btz.ak,
         btz.L,
         btz.aq,
         btz.s,
         btz.ar,
         btz.as,
         btz.aj,
         btz.al,
         btz.at,
         btz.au,
         btz.av
      }
   );

   public ccc(bkm<? extends ccb> $$0, crs $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public void b(rz $$0) {
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
   public void a(rz $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.c($$0);
   }

   @auk
   @Override
   public bix y() {
      return this.cj;
   }

   @Override
   protected void a(bjg $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cam $$4 && $$4.gf()) {
         clb $$5 = new clb(cle.ty);
         $$4.gg();
         this.b($$5);
      }

      this.cj.f().forEach(this::b);
   }

   protected clb l(clb $$0) {
      return this.cj.a($$0);
   }

   protected boolean m(clb $$0) {
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
   public void a(afm<?> $$0) {
      super.a($$0);
      if (bV.equals($$0)) {
         this.j_();
      }
   }

   public static bmd.a gl() {
      return cba.gk().a(bme.l, 16.0).a(bme.m, 0.35F).a(bme.c, 5.0);
   }

   public static boolean b(bkm<ccc> $$0, crt $$1, blc $$2, ht $$3, ato $$4) {
      return !$$1.a_($$3.d()).a(cuv.kK);
   }

   @Nullable
   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      ato $$5 = $$0.E_();
      if ($$2 != blc.d) {
         if ($$5.i() < 0.2F) {
            this.a(true);
         } else if (this.gf()) {
            this.a(bkn.a, this.gn());
         }
      }

      ccd.a(this, $$0.E_());
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
   protected void a(ato $$0, bio $$1) {
      if (this.gf()) {
         this.a(bkn.f, new clb(cle.pa), $$0);
         this.a(bkn.e, new clb(cle.pb), $$0);
         this.a(bkn.d, new clb(cle.pc), $$0);
         this.a(bkn.c, new clb(cle.pd), $$0);
      }
   }

   private void a(bkn $$0, clb $$1, ato $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bly.b<ccc> dO() {
      return bly.a(bU, bT);
   }

   @Override
   protected bly<?> a(Dynamic<?> $$0) {
      return ccd.a(this, this.dO().a($$0));
   }

   @Override
   public bly<ccc> dN() {
      return (bly<ccc>)super.dN();
   }

   @Override
   public biq b(cdm $$0, bip $$1) {
      biq $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dL().B) {
         return ccd.a(this, $$0, $$1);
      } else {
         boolean $$3 = ccd.b(this, $$0.b($$1)) && this.gg() != cce.d;
         return $$3 ? biq.a : biq.d;
      }
   }

   @Override
   protected float b(blk $$0, bkj $$1) {
      float $$2 = super.b($$0, $$1);
      return this.n_() ? $$2 - 0.82F : $$2;
   }

   @Override
   public void a(boolean $$0) {
      this.al().b(bV, $$0);
      if (!this.dL().B) {
         bma $$1 = this.a(bme.m);
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
      this.dN().a((ama)this.dL(), this);
      this.dL().ad().c();
      ccd.a(this);
      super.X();
   }

   @Override
   public int ed() {
      return this.bJ;
   }

   @Override
   protected void c(ama $$0) {
      ccd.b(this);
      this.cj.f().forEach(this::b);
      super.c($$0);
   }

   private clb gn() {
      return (double)this.ag.i() < 0.5 ? new clb(cle.va) : new clb(cle.oh);
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
   public cce gg() {
      if (this.gm()) {
         return cce.e;
      } else if (ccd.a(this.eT())) {
         return cce.d;
      } else if (this.fW() && this.gh()) {
         return cce.a;
      } else if (this.go()) {
         return cce.c;
      } else {
         return this.fW() && this.b(cle.va) ? cce.b : cce.f;
      }
   }

   public boolean gm() {
      return this.an.b(bX);
   }

   public void x(boolean $$0) {
      this.an.b(bX, $$0);
   }

   @Override
   public boolean a(bjg $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dL().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bky) {
            ccd.a(this, (bky)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(bky $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(bky $$0, clb $$1, cee $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public boolean a(clr $$0) {
      return $$0 == cle.va;
   }

   protected void n(clb $$0) {
      this.b(bkn.a, $$0);
   }

   protected void o(clb $$0) {
      if ($$0.a(ccd.c)) {
         this.a(bkn.b, $$0);
         this.e(bkn.b);
      } else {
         this.b(bkn.b, $$0);
      }
   }

   @Override
   public boolean k(clb $$0) {
      return this.dL().X().b(cro.c) && this.fK() && ccd.a(this, $$0);
   }

   protected boolean p(clb $$0) {
      bkn $$1 = bla.h($$0);
      clb $$2 = this.c($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(clb $$0, clb $$1) {
      if (cpo.d($$1)) {
         return false;
      } else {
         boolean $$2 = ccd.a($$0) || $$0.a(cle.va);
         boolean $$3 = ccd.a($$1) || $$1.a(cle.va);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.gf() && !$$0.a(cle.va) && $$1.a(cle.va) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(caf $$0) {
      this.a($$0);
      ccd.a(this, $$0);
   }

   @Override
   public boolean a(bki $$0, boolean $$1) {
      if (this.n_() && $$0.ag() == bkm.W) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bki b(bki $$0, int $$1) {
      List<bki> $$2 = $$0.cP();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected aqm w() {
      return this.dL().B ? null : ccd.c(this).orElse(null);
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.sd;
   }

   @Override
   protected aqm m_() {
      return aqn.sb;
   }

   @Override
   protected void b(ht $$0, dgw $$1) {
      this.a(aqn.sf, 0.15F, 1.0F);
   }

   protected void b(aqm $$0) {
      this.a($$0, this.eV(), this.eW());
   }

   @Override
   protected void gi() {
      this.b(aqn.sg);
   }
}
