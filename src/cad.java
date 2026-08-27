import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cad extends cac implements byo, cay {
   private static final adz<Boolean> bV = aec.a(cad.class, aeb.k);
   private static final adz<Boolean> bW = aec.a(cad.class, aeb.k);
   private static final adz<Boolean> bX = aec.a(cad.class, aeb.k);
   private static final UUID bY = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final bkd bZ = new bkd(bY, "Baby speed boost", 0.2F, bkd.a.b);
   private static final int ca = 16;
   private static final float cb = 0.35F;
   private static final int cc = 5;
   private static final float cd = 1.6F;
   private static final float ce = 0.1F;
   private static final int cf = 3;
   private static final float cg = 0.2F;
   private static final float ch = 0.82F;
   private static final double ci = 0.5;
   private final bgx cj = new bgx(8);
   private boolean ck;
   protected static final ImmutableList<btf<? extends bte<? super cad>>> bT = ImmutableList.of(btf.c, btf.d, btf.b, btf.f, btf.k);
   protected static final ImmutableList<bsa<?>> bU = ImmutableList.of(
      bsa.n,
      bsa.v,
      bsa.g,
      bsa.h,
      bsa.k,
      bsa.l,
      bsa.an,
      bsa.am,
      bsa.K,
      bsa.aO,
      bsa.x,
      bsa.y,
      new bsa[]{
         bsa.m,
         bsa.E,
         bsa.o,
         bsa.p,
         bsa.q,
         bsa.t,
         bsa.aa,
         bsa.ab,
         bsa.z,
         bsa.ac,
         bsa.ad,
         bsa.af,
         bsa.ae,
         bsa.ah,
         bsa.ai,
         bsa.ag,
         bsa.ak,
         bsa.L,
         bsa.aq,
         bsa.s,
         bsa.ar,
         bsa.as,
         bsa.aj,
         bsa.al,
         bsa.at,
         bsa.au,
         bsa.av
      }
   );

   public cad(bim<? extends cac> $$0, cpm $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public void b(qr $$0) {
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
   public void a(qr $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.c($$0);
   }

   @asq
   @Override
   public bgx t() {
      return this.cj;
   }

   @Override
   protected void a(bhg $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof byn $$4 && $$4.ga()) {
         ciy $$5 = new ciy(cjb.tx);
         $$4.gb();
         this.b($$5);
      }

      this.cj.f().forEach(this::b);
   }

   protected ciy l(ciy $$0) {
      return this.cj.a($$0);
   }

   protected boolean m(ciy $$0) {
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
   public void a(adz<?> $$0) {
      super.a($$0);
      if (bV.equals($$0)) {
         this.e_();
      }
   }

   public static bke.a gg() {
      return bzb.gf().a(bkf.a, 16.0).a(bkf.d, 0.35F).a(bkf.f, 5.0);
   }

   public static boolean b(bim<cad> $$0, cpn $$1, bjc $$2, gu $$3, aru $$4) {
      return !$$1.a_($$3.d()).a(csn.kK);
   }

   @Nullable
   @Override
   public bjs a(cqb $$0, bgo $$1, bjc $$2, @Nullable bjs $$3, @Nullable qr $$4) {
      aru $$5 = $$0.y_();
      if ($$2 != bjc.d) {
         if ($$5.i() < 0.2F) {
            this.a(true);
         } else if (this.ga()) {
            this.a(bin.a, this.gi());
         }
      }

      cae.a(this, $$0.y_());
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
   protected void a(aru $$0, bgo $$1) {
      if (this.ga()) {
         this.a(bin.f, new ciy(cjb.pa), $$0);
         this.a(bin.e, new ciy(cjb.pb), $$0);
         this.a(bin.d, new ciy(cjb.pc), $$0);
         this.a(bin.c, new ciy(cjb.pd), $$0);
      }
   }

   private void a(bin $$0, ciy $$1, aru $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bjz.b<cad> dN() {
      return bjz.a(bU, bT);
   }

   @Override
   protected bjz<?> a(Dynamic<?> $$0) {
      return cae.a(this, this.dN().a($$0));
   }

   @Override
   public bjz<cad> dM() {
      return (bjz<cad>)super.dM();
   }

   @Override
   public bgq b(cbn $$0, bgp $$1) {
      bgq $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dK().B) {
         return cae.a(this, $$0, $$1);
      } else {
         boolean $$3 = cae.b(this, $$0.b($$1)) && this.gb() != caf.d;
         return $$3 ? bgq.a : bgq.d;
      }
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      float $$2 = super.b($$0, $$1);
      return this.i_() ? $$2 - 0.82F : $$2;
   }

   @Override
   public void a(boolean $$0) {
      this.al().b(bV, $$0);
      if (!this.dK().B) {
         bkb $$1 = this.a(bkf.d);
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
      this.dM().a((akk)this.dK(), this);
      this.dK().ad().c();
      cae.a(this);
      super.V();
   }

   @Override
   public int ec() {
      return this.bJ;
   }

   @Override
   protected void c(akk $$0) {
      cae.b(this);
      this.cj.f().forEach(this::b);
      super.c($$0);
   }

   private ciy gi() {
      return (double)this.ag.i() < 0.5 ? new ciy(cjb.uZ) : new ciy(cjb.oh);
   }

   private boolean gj() {
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
   public caf gb() {
      if (this.gh()) {
         return caf.e;
      } else if (cae.a(this.eS())) {
         return caf.d;
      } else if (this.fS() && this.gc()) {
         return caf.a;
      } else if (this.gj()) {
         return caf.c;
      } else {
         return this.fS() && this.b(cjb.uZ) ? caf.b : caf.f;
      }
   }

   public boolean gh() {
      return this.an.b(bX);
   }

   public void x(boolean $$0) {
      this.an.b(bX, $$0);
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dK().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof biy) {
            cae.a(this, (biy)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(biy $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(biy $$0, ciy $$1, ccf $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public boolean a(cjo $$0) {
      return $$0 == cjb.uZ;
   }

   protected void n(ciy $$0) {
      this.b(bin.a, $$0);
   }

   protected void o(ciy $$0) {
      if ($$0.a(cae.c)) {
         this.a(bin.b, $$0);
         this.e(bin.b);
      } else {
         this.b(bin.b, $$0);
      }
   }

   @Override
   public boolean k(ciy $$0) {
      return this.dK().X().b(cpi.c) && this.fG() && cae.a(this, $$0);
   }

   protected boolean p(ciy $$0) {
      bin $$1 = bja.h($$0);
      ciy $$2 = this.c($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(ciy $$0, ciy $$1) {
      if (cnh.d($$1)) {
         return false;
      } else {
         boolean $$2 = cae.a($$0) || $$0.a(cjb.uZ);
         boolean $$3 = cae.a($$1) || $$1.a(cjb.uZ);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.ga() && !$$0.a(cjb.uZ) && $$1.a(cjb.uZ) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(byg $$0) {
      this.a($$0);
      cae.a(this, $$0);
   }

   @Override
   public boolean a(bii $$0, boolean $$1) {
      if (this.i_() && $$0.ag() == bim.W) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bii b(bii $$0, int $$1) {
      List<bii> $$2 = $$0.cP();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected aov r() {
      return this.dK().B ? null : cae.c(this).orElse(null);
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.rZ;
   }

   @Override
   protected aov h_() {
      return aow.rX;
   }

   @Override
   protected void b(gu $$0, dfa $$1) {
      this.a(aow.sb, 0.15F, 1.0F);
   }

   protected void b(aov $$0) {
      this.a($$0, this.eU(), this.eV());
   }

   @Override
   protected void gd() {
      this.b(aow.sc);
   }
}
