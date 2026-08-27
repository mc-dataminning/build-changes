import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cdx extends cdw implements ccb, ces {
   private static final agm<Boolean> bV = agp.a(cdx.class, ago.k);
   private static final agm<Boolean> bW = agp.a(cdx.class, ago.k);
   private static final agm<Boolean> bX = agp.a(cdx.class, ago.k);
   private static final UUID bY = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final bno bZ = new bno(bY, "Baby speed boost", 0.2F, bno.a.b);
   private static final int ca = 16;
   private static final float cb = 0.35F;
   private static final int cc = 5;
   private static final float cd = 1.6F;
   private static final float ce = 0.1F;
   private static final int cf = 3;
   private static final float cg = 0.2F;
   private static final float ch = 0.82F;
   private static final double ci = 0.5;
   private final bki cj = new bki(8);
   private boolean ck;
   protected static final ImmutableList<bws<? extends bwr<? super cdx>>> bT = ImmutableList.of(bws.c, bws.d, bws.b, bws.f, bws.k);
   protected static final ImmutableList<bvm<?>> bU = ImmutableList.of(
      bvm.n,
      bvm.v,
      bvm.g,
      bvm.h,
      bvm.k,
      bvm.l,
      bvm.an,
      bvm.am,
      bvm.K,
      bvm.aO,
      bvm.x,
      bvm.y,
      new bvm[]{
         bvm.m,
         bvm.E,
         bvm.o,
         bvm.p,
         bvm.q,
         bvm.t,
         bvm.aa,
         bvm.ab,
         bvm.z,
         bvm.ac,
         bvm.ad,
         bvm.af,
         bvm.ae,
         bvm.ah,
         bvm.ai,
         bvm.ag,
         bvm.ak,
         bvm.L,
         bvm.aq,
         bvm.s,
         bvm.ar,
         bvm.as,
         bvm.aj,
         bvm.al,
         bvm.at,
         bvm.au,
         bvm.av
      }
   );

   public cdx(bly<? extends cdw> $$0, cto $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      if (this.o_()) {
         $$0.a("IsBaby", true);
      }

      if (this.ck) {
         $$0.a("CannotHunt", true);
      }

      this.a_($$0);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.c($$0);
   }

   @avs
   @Override
   public bki A() {
      return this.cj;
   }

   @Override
   protected void a(bks $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cca $$4 && $$4.gf()) {
         cmx $$5 = new cmx(cna.uk);
         $$4.gg();
         this.b($$5);
      }

      this.cj.f().forEach(this::b);
   }

   protected cmx l(cmx $$0) {
      return this.cj.a($$0);
   }

   protected boolean m(cmx $$0) {
      return this.cj.b($$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bV, false);
      this.an.a(bW, false);
      this.an.a(bX, false);
   }

   @Override
   public void a(agm<?> $$0) {
      super.a($$0);
      if (bV.equals($$0)) {
         this.k_();
      }
   }

   public static bnp.a gl() {
      return cco.gk().a(bnq.l, 16.0).a(bnq.m, 0.35F).a(bnq.c, 5.0);
   }

   public static boolean b(bly<cdx> $$0, ctp $$1, bmo $$2, hx $$3, auu $$4) {
      return !$$1.a_($$3.d()).a(cwr.kK);
   }

   @Nullable
   @Override
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      auu $$5 = $$0.F_();
      if ($$2 != bmo.d) {
         if ($$5.i() < 0.2F) {
            this.a(true);
         } else if (this.gf()) {
            this.a(blz.a, this.gn());
         }
      }

      cdy.a(this, $$0.F_());
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean X() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.fL();
   }

   @Override
   protected void a(auu $$0, bjy $$1) {
      if (this.gf()) {
         this.a(blz.f, new cmx(cna.pL), $$0);
         this.a(blz.e, new cmx(cna.pM), $$0);
         this.a(blz.d, new cmx(cna.pN), $$0);
         this.a(blz.c, new cmx(cna.pO), $$0);
      }
   }

   private void a(blz $$0, cmx $$1, auu $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bnk.b<cdx> dP() {
      return bnk.a(bU, bT);
   }

   @Override
   protected bnk<?> a(Dynamic<?> $$0) {
      return cdy.a(this, this.dP().a($$0));
   }

   @Override
   public bnk<cdx> dO() {
      return (bnk<cdx>)super.dO();
   }

   @Override
   public bka b(cfh $$0, bjz $$1) {
      bka $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dM().B) {
         return cdy.a(this, $$0, $$1);
      } else {
         boolean $$3 = cdy.b(this, $$0.b($$1)) && this.gg() != cdz.d;
         return $$3 ? bka.a : bka.d;
      }
   }

   @Override
   protected float b(bmw $$0, blv $$1) {
      float $$2 = super.b($$0, $$1);
      return this.o_() ? $$2 - 0.82F : $$2;
   }

   @Override
   public void a(boolean $$0) {
      this.an().b(bV, $$0);
      if (!this.dM().B) {
         bnm $$1 = this.a(bnq.m);
         $$1.b(bZ.a());
         if ($$0) {
            $$1.b(bZ);
         }
      }
   }

   @Override
   public boolean o_() {
      return this.an().b(bV);
   }

   private void y(boolean $$0) {
      this.ck = $$0;
   }

   @Override
   protected boolean u() {
      return !this.ck;
   }

   @Override
   protected void Z() {
      this.dM().af().a("piglinBrain");
      this.dO().a((and)this.dM(), this);
      this.dM().af().c();
      cdy.a(this);
      super.Z();
   }

   @Override
   public int ee() {
      return this.bJ;
   }

   @Override
   protected void c(and $$0) {
      cdy.b(this);
      this.cj.f().forEach(this::b);
      super.c($$0);
   }

   private cmx gn() {
      return (double)this.ag.i() < 0.5 ? new cmx(cna.vM) : new cmx(cna.oS);
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
   public cdz gg() {
      if (this.gm()) {
         return cdz.e;
      } else if (cdy.a(this.eU())) {
         return cdz.d;
      } else if (this.fW() && this.gh()) {
         return cdz.a;
      } else if (this.go()) {
         return cdz.c;
      } else {
         return this.fW() && this.b(cna.vM) ? cdz.b : cdz.f;
      }
   }

   public boolean gm() {
      return this.an.b(bX);
   }

   public void x(boolean $$0) {
      this.an.b(bX, $$0);
   }

   @Override
   public boolean a(bks $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bmk) {
            cdy.a(this, (bmk)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(bmk $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(bmk $$0, cmx $$1, cfz $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public boolean a(cnn $$0) {
      return $$0 == cna.vM;
   }

   protected void n(cmx $$0) {
      this.b(blz.a, $$0);
   }

   protected void o(cmx $$0) {
      if ($$0.a(cdy.c)) {
         this.a(blz.b, $$0);
         this.e(blz.b);
      } else {
         this.b(blz.b, $$0);
      }
   }

   @Override
   public boolean k(cmx $$0) {
      return this.dM().Z().b(ctk.c) && this.fK() && cdy.a(this, $$0);
   }

   protected boolean p(cmx $$0) {
      blz $$1 = bmm.h($$0);
      cmx $$2 = this.c($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(cmx $$0, cmx $$1) {
      if (crk.d($$1)) {
         return false;
      } else {
         boolean $$2 = cdy.a($$0) || $$0.a(cna.vM);
         boolean $$3 = cdy.a($$1) || $$1.a(cna.vM);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.gf() && !$$0.a(cna.vM) && $$1.a(cna.vM) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(cbt $$0) {
      this.a($$0);
      cdy.a(this, $$0);
   }

   @Override
   public boolean a(blu $$0, boolean $$1) {
      if (this.o_() && $$0.ai() == bly.X) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private blu b(blu $$0, int $$1) {
      List<blu> $$2 = $$0.cP();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected arq y() {
      return this.dM().B ? null : cdy.c(this).orElse(null);
   }

   @Override
   protected arq d(bks $$0) {
      return arr.sO;
   }

   @Override
   protected arq n_() {
      return arr.sM;
   }

   @Override
   protected void b(hx $$0, djg $$1) {
      this.a(arr.sQ, 0.15F, 1.0F);
   }

   protected void b(arq $$0) {
      this.a($$0, this.eW(), this.eX());
   }

   @Override
   protected void gi() {
      this.b(arr.sR);
   }
}
