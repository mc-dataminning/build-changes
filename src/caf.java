import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class caf extends cae implements byq, cba {
   private static final aec<Boolean> bV = aef.a(caf.class, aee.k);
   private static final aec<Boolean> bW = aef.a(caf.class, aee.k);
   private static final aec<Boolean> bX = aef.a(caf.class, aee.k);
   private static final UUID bY = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final bkf bZ = new bkf(bY, "Baby speed boost", 0.2F, bkf.a.b);
   private static final int ca = 16;
   private static final float cb = 0.35F;
   private static final int cc = 5;
   private static final float cd = 1.6F;
   private static final float ce = 0.1F;
   private static final int cf = 3;
   private static final float cg = 0.2F;
   private static final float ch = 0.82F;
   private static final double ci = 0.5;
   private final bha cj = new bha(8);
   private boolean ck;
   protected static final ImmutableList<bth<? extends btg<? super caf>>> bT = ImmutableList.of(bth.c, bth.d, bth.b, bth.f, bth.k);
   protected static final ImmutableList<bsc<?>> bU = ImmutableList.of(
      bsc.n,
      bsc.v,
      bsc.g,
      bsc.h,
      bsc.k,
      bsc.l,
      bsc.an,
      bsc.am,
      bsc.K,
      bsc.aO,
      bsc.x,
      bsc.y,
      new bsc[]{
         bsc.m,
         bsc.E,
         bsc.o,
         bsc.p,
         bsc.q,
         bsc.t,
         bsc.aa,
         bsc.ab,
         bsc.z,
         bsc.ac,
         bsc.ad,
         bsc.af,
         bsc.ae,
         bsc.ah,
         bsc.ai,
         bsc.ag,
         bsc.ak,
         bsc.L,
         bsc.aq,
         bsc.s,
         bsc.ar,
         bsc.as,
         bsc.aj,
         bsc.al,
         bsc.at,
         bsc.au,
         bsc.av
      }
   );

   public caf(bip<? extends cae> $$0, cpq $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      if (this.i_()) {
         $$0.a("IsBaby", true);
      }

      if (this.ck) {
         $$0.a("CannotHunt", true);
      }

      this.a_($$0);
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.c($$0);
   }

   @ast
   @Override
   public bha t() {
      return this.cj;
   }

   @Override
   protected void a(bhj $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof byp $$4 && $$4.gb()) {
         cja $$5 = new cja(cjd.tx);
         $$4.gc();
         this.b($$5);
      }

      this.cj.f().forEach(this::b);
   }

   protected cja l(cja $$0) {
      return this.cj.a($$0);
   }

   protected boolean m(cja $$0) {
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
   public void a(aec<?> $$0) {
      super.a($$0);
      if (bV.equals($$0)) {
         this.e_();
      }
   }

   public static bkg.a gh() {
      return bzd.gg().a(bkh.a, 16.0).a(bkh.d, 0.35F).a(bkh.f, 5.0);
   }

   public static boolean b(bip<caf> $$0, cpr $$1, bjf $$2, gw $$3, arx $$4) {
      return !$$1.a_($$3.d()).a(csr.kK);
   }

   @Nullable
   @Override
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      arx $$5 = $$0.y_();
      if ($$2 != bjf.d) {
         if ($$5.i() < 0.2F) {
            this.a(true);
         } else if (this.gb()) {
            this.a(biq.a, this.gj());
         }
      }

      cag.a(this, $$0.y_());
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean S() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.fH();
   }

   @Override
   protected void a(arx $$0, bgr $$1) {
      if (this.gb()) {
         this.a(biq.f, new cja(cjd.pa), $$0);
         this.a(biq.e, new cja(cjd.pb), $$0);
         this.a(biq.d, new cja(cjd.pc), $$0);
         this.a(biq.c, new cja(cjd.pd), $$0);
      }
   }

   private void a(biq $$0, cja $$1, arx $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bkb.b<caf> dN() {
      return bkb.a(bU, bT);
   }

   @Override
   protected bkb<?> a(Dynamic<?> $$0) {
      return cag.a(this, this.dN().a($$0));
   }

   @Override
   public bkb<caf> dM() {
      return (bkb<caf>)super.dM();
   }

   @Override
   public bgt b(cbp $$0, bgs $$1) {
      bgt $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dK().B) {
         return cag.a(this, $$0, $$1);
      } else {
         boolean $$3 = cag.b(this, $$0.b($$1)) && this.gc() != cah.d;
         return $$3 ? bgt.a : bgt.d;
      }
   }

   @Override
   protected float b(bjn $$0, bim $$1) {
      float $$2 = super.b($$0, $$1);
      return this.i_() ? $$2 - 0.82F : $$2;
   }

   @Override
   public void a(boolean $$0) {
      this.al().b(bV, $$0);
      if (!this.dK().B) {
         bkd $$1 = this.a(bkh.d);
         $$1.b(bZ.a());
         if ($$0) {
            $$1.b(bZ);
         }
      }
   }

   @Override
   public boolean i_() {
      return this.al().b(bV);
   }

   private void y(boolean $$0) {
      this.ck = $$0;
   }

   @Override
   protected boolean p() {
      return !this.ck;
   }

   @Override
   protected void V() {
      this.dK().ad().a("piglinBrain");
      this.dM().a((akn)this.dK(), this);
      this.dK().ad().c();
      cag.a(this);
      super.V();
   }

   @Override
   public int ec() {
      return this.bJ;
   }

   @Override
   protected void c(akn $$0) {
      cag.b(this);
      this.cj.f().forEach(this::b);
      super.c($$0);
   }

   private cja gj() {
      return (double)this.ag.i() < 0.5 ? new cja(cjd.uZ) : new cja(cjd.oh);
   }

   private boolean gk() {
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
   public cah gc() {
      if (this.gi()) {
         return cah.e;
      } else if (cag.a(this.eS())) {
         return cah.d;
      } else if (this.fS() && this.gd()) {
         return cah.a;
      } else if (this.gk()) {
         return cah.c;
      } else {
         return this.fS() && this.b(cjd.uZ) ? cah.b : cah.f;
      }
   }

   public boolean gi() {
      return this.an.b(bX);
   }

   public void x(boolean $$0) {
      this.an.b(bX, $$0);
   }

   @Override
   public boolean a(bhj $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dK().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bjb) {
            cag.a(this, (bjb)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(bjb $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(bjb $$0, cja $$1, cch $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public boolean a(cjq $$0) {
      return $$0 == cjd.uZ;
   }

   protected void n(cja $$0) {
      this.b(biq.a, $$0);
   }

   protected void o(cja $$0) {
      if ($$0.a(cag.c)) {
         this.a(biq.b, $$0);
         this.e(biq.b);
      } else {
         this.b(biq.b, $$0);
      }
   }

   @Override
   public boolean k(cja $$0) {
      return this.dK().X().b(cpm.c) && this.fG() && cag.a(this, $$0);
   }

   protected boolean p(cja $$0) {
      biq $$1 = bjd.h($$0);
      cja $$2 = this.c($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(cja $$0, cja $$1) {
      if (cnl.d($$1)) {
         return false;
      } else {
         boolean $$2 = cag.a($$0) || $$0.a(cjd.uZ);
         boolean $$3 = cag.a($$1) || $$1.a(cjd.uZ);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.gb() && !$$0.a(cjd.uZ) && $$1.a(cjd.uZ) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(byi $$0) {
      this.a($$0);
      cag.a(this, $$0);
   }

   @Override
   public boolean a(bil $$0, boolean $$1) {
      if (this.i_() && $$0.ag() == bip.W) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bil b(bil $$0, int $$1) {
      List<bil> $$2 = $$0.cP();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected aoy r() {
      return this.dK().B ? null : cag.c(this).orElse(null);
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.rZ;
   }

   @Override
   protected aoy h_() {
      return aoz.rX;
   }

   @Override
   protected void b(gw $$0, dfe $$1) {
      this.a(aoz.sb, 0.15F, 1.0F);
   }

   protected void b(aoy $$0) {
      this.a($$0, this.eU(), this.eV());
   }

   @Override
   protected void ge() {
      this.b(aoz.sc);
   }
}
