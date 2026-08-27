import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cak extends caj implements byv, cbf {
   private static final aef<Boolean> bV = aei.a(cak.class, aeh.k);
   private static final aef<Boolean> bW = aei.a(cak.class, aeh.k);
   private static final aef<Boolean> bX = aei.a(cak.class, aeh.k);
   private static final UUID bY = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final bkk bZ = new bkk(bY, "Baby speed boost", 0.2F, bkk.a.b);
   private static final int ca = 16;
   private static final float cb = 0.35F;
   private static final int cc = 5;
   private static final float cd = 1.6F;
   private static final float ce = 0.1F;
   private static final int cf = 3;
   private static final float cg = 0.2F;
   private static final float ch = 0.82F;
   private static final double ci = 0.5;
   private final bhf cj = new bhf(8);
   private boolean ck;
   protected static final ImmutableList<btm<? extends btl<? super cak>>> bT = ImmutableList.of(btm.c, btm.d, btm.b, btm.f, btm.k);
   protected static final ImmutableList<bsh<?>> bU = ImmutableList.of(
      bsh.n,
      bsh.v,
      bsh.g,
      bsh.h,
      bsh.k,
      bsh.l,
      bsh.an,
      bsh.am,
      bsh.K,
      bsh.aO,
      bsh.x,
      bsh.y,
      new bsh[]{
         bsh.m,
         bsh.E,
         bsh.o,
         bsh.p,
         bsh.q,
         bsh.t,
         bsh.aa,
         bsh.ab,
         bsh.z,
         bsh.ac,
         bsh.ad,
         bsh.af,
         bsh.ae,
         bsh.ah,
         bsh.ai,
         bsh.ag,
         bsh.ak,
         bsh.L,
         bsh.aq,
         bsh.s,
         bsh.ar,
         bsh.as,
         bsh.aj,
         bsh.al,
         bsh.at,
         bsh.au,
         bsh.av
      }
   );

   public cak(biu<? extends caj> $$0, cpv $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      if (this.m_()) {
         $$0.a("IsBaby", true);
      }

      if (this.ck) {
         $$0.a("CannotHunt", true);
      }

      this.a_($$0);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.c($$0);
   }

   @asy
   @Override
   public bhf y() {
      return this.cj;
   }

   @Override
   protected void a(bho $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof byu $$4 && $$4.ge()) {
         cjf $$5 = new cjf(cji.tx);
         $$4.gf();
         this.b($$5);
      }

      this.cj.f().forEach(this::b);
   }

   protected cjf l(cjf $$0) {
      return this.cj.a($$0);
   }

   protected boolean m(cjf $$0) {
      return this.cj.b($$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bV, false);
      this.an.a(bW, false);
      this.an.a(bX, false);
   }

   @Override
   public void a(aef<?> $$0) {
      super.a($$0);
      if (bV.equals($$0)) {
         this.i_();
      }
   }

   public static bkl.a gk() {
      return bzi.gj().a(bkm.a, 16.0).a(bkm.d, 0.35F).a(bkm.f, 5.0);
   }

   public static boolean b(biu<cak> $$0, cpw $$1, bjk $$2, gw $$3, asc $$4) {
      return !$$1.a_($$3.d()).a(csw.kK);
   }

   @Nullable
   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qy $$4) {
      asc $$5 = $$0.D_();
      if ($$2 != bjk.d) {
         if ($$5.i() < 0.2F) {
            this.a(true);
         } else if (this.ge()) {
            this.a(biv.a, this.gm());
         }
      }

      cal.a(this, $$0.D_());
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
      return !this.fK();
   }

   @Override
   protected void a(asc $$0, bgw $$1) {
      if (this.ge()) {
         this.a(biv.f, new cjf(cji.pa), $$0);
         this.a(biv.e, new cjf(cji.pb), $$0);
         this.a(biv.d, new cjf(cji.pc), $$0);
         this.a(biv.c, new cjf(cji.pd), $$0);
      }
   }

   private void a(biv $$0, cjf $$1, asc $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bkg.b<cak> dO() {
      return bkg.a(bU, bT);
   }

   @Override
   protected bkg<?> a(Dynamic<?> $$0) {
      return cal.a(this, this.dO().a($$0));
   }

   @Override
   public bkg<cak> dN() {
      return (bkg<cak>)super.dN();
   }

   @Override
   public bgy b(cbu $$0, bgx $$1) {
      bgy $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dL().B) {
         return cal.a(this, $$0, $$1);
      } else {
         boolean $$3 = cal.b(this, $$0.b($$1)) && this.gf() != cam.d;
         return $$3 ? bgy.a : bgy.d;
      }
   }

   @Override
   protected float b(bjs $$0, bir $$1) {
      float $$2 = super.b($$0, $$1);
      return this.m_() ? $$2 - 0.82F : $$2;
   }

   @Override
   public void a(boolean $$0) {
      this.al().b(bV, $$0);
      if (!this.dL().B) {
         bki $$1 = this.a(bkm.d);
         $$1.b(bZ.a());
         if ($$0) {
            $$1.b(bZ);
         }
      }
   }

   @Override
   public boolean m_() {
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
      this.dN().a((akr)this.dL(), this);
      this.dL().ad().c();
      cal.a(this);
      super.X();
   }

   @Override
   public int ed() {
      return this.bJ;
   }

   @Override
   protected void c(akr $$0) {
      cal.b(this);
      this.cj.f().forEach(this::b);
      super.c($$0);
   }

   private cjf gm() {
      return (double)this.ag.i() < 0.5 ? new cjf(cji.uZ) : new cjf(cji.oh);
   }

   private boolean gn() {
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
   public cam gf() {
      if (this.gl()) {
         return cam.e;
      } else if (cal.a(this.eT())) {
         return cam.d;
      } else if (this.fV() && this.gg()) {
         return cam.a;
      } else if (this.gn()) {
         return cam.c;
      } else {
         return this.fV() && this.b(cji.uZ) ? cam.b : cam.f;
      }
   }

   public boolean gl() {
      return this.an.b(bX);
   }

   public void x(boolean $$0) {
      this.an.b(bX, $$0);
   }

   @Override
   public boolean a(bho $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dL().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bjg) {
            cal.a(this, (bjg)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(bjg $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(bjg $$0, cjf $$1, ccm $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public boolean a(cjv $$0) {
      return $$0 == cji.uZ;
   }

   protected void n(cjf $$0) {
      this.b(biv.a, $$0);
   }

   protected void o(cjf $$0) {
      if ($$0.a(cal.c)) {
         this.a(biv.b, $$0);
         this.e(biv.b);
      } else {
         this.b(biv.b, $$0);
      }
   }

   @Override
   public boolean k(cjf $$0) {
      return this.dL().X().b(cpr.c) && this.fJ() && cal.a(this, $$0);
   }

   protected boolean p(cjf $$0) {
      biv $$1 = bji.h($$0);
      cjf $$2 = this.c($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(cjf $$0, cjf $$1) {
      if (cnq.d($$1)) {
         return false;
      } else {
         boolean $$2 = cal.a($$0) || $$0.a(cji.uZ);
         boolean $$3 = cal.a($$1) || $$1.a(cji.uZ);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.ge() && !$$0.a(cji.uZ) && $$1.a(cji.uZ) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(byn $$0) {
      this.a($$0);
      cal.a(this, $$0);
   }

   @Override
   public boolean a(biq $$0, boolean $$1) {
      if (this.m_() && $$0.ag() == biu.W) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private biq b(biq $$0, int $$1) {
      List<biq> $$2 = $$0.cP();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected apd w() {
      return this.dL().B ? null : cal.c(this).orElse(null);
   }

   @Override
   protected apd d(bho $$0) {
      return ape.rZ;
   }

   @Override
   protected apd l_() {
      return ape.rX;
   }

   @Override
   protected void b(gw $$0, dfj $$1) {
      this.a(ape.sb, 0.15F, 1.0F);
   }

   protected void b(apd $$0) {
      this.a($$0, this.eV(), this.eW());
   }

   @Override
   protected void gh() {
      this.b(ape.sc);
   }
}
