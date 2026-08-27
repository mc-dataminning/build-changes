import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cac extends cab implements byn, cax {
   private static final adz<Boolean> bV = aec.a(cac.class, aeb.k);
   private static final adz<Boolean> bW = aec.a(cac.class, aeb.k);
   private static final adz<Boolean> bX = aec.a(cac.class, aeb.k);
   private static final UUID bY = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final bkc bZ = new bkc(bY, "Baby speed boost", 0.2F, bkc.a.b);
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
   protected static final ImmutableList<bte<? extends btd<? super cac>>> bT = ImmutableList.of(bte.c, bte.d, bte.b, bte.f, bte.k);
   protected static final ImmutableList<brz<?>> bU = ImmutableList.of(
      brz.n,
      brz.v,
      brz.g,
      brz.h,
      brz.k,
      brz.l,
      brz.an,
      brz.am,
      brz.K,
      brz.aO,
      brz.x,
      brz.y,
      new brz[]{
         brz.m,
         brz.E,
         brz.o,
         brz.p,
         brz.q,
         brz.t,
         brz.aa,
         brz.ab,
         brz.z,
         brz.ac,
         brz.ad,
         brz.af,
         brz.ae,
         brz.ah,
         brz.ai,
         brz.ag,
         brz.ak,
         brz.L,
         brz.aq,
         brz.s,
         brz.ar,
         brz.as,
         brz.aj,
         brz.al,
         brz.at,
         brz.au,
         brz.av
      }
   );

   public cac(bim<? extends cab> $$0, cpl $$1) {
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
      if ($$0.d() instanceof bym $$4 && $$4.gb()) {
         cix $$5 = new cix(cja.tx);
         $$4.gc();
         this.b($$5);
      }

      this.cj.f().forEach(this::b);
   }

   protected cix l(cix $$0) {
      return this.cj.a($$0);
   }

   protected boolean m(cix $$0) {
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

   public static bkd.a gh() {
      return bza.gg().a(bke.a, 16.0).a(bke.d, 0.35F).a(bke.f, 5.0);
   }

   public static boolean b(bim<cac> $$0, cpm $$1, bjc $$2, gu $$3, aru $$4) {
      return !$$1.a_($$3.d()).a(csm.kK);
   }

   @Nullable
   @Override
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
      aru $$5 = $$0.y_();
      if ($$2 != bjc.d) {
         if ($$5.i() < 0.2F) {
            this.a(true);
         } else if (this.gb()) {
            this.a(bin.a, this.gj());
         }
      }

      cad.a(this, $$0.y_());
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
      if (this.gb()) {
         this.a(bin.f, new cix(cja.pa), $$0);
         this.a(bin.e, new cix(cja.pb), $$0);
         this.a(bin.d, new cix(cja.pc), $$0);
         this.a(bin.c, new cix(cja.pd), $$0);
      }
   }

   private void a(bin $$0, cix $$1, aru $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bjy.b<cac> dN() {
      return bjy.a(bU, bT);
   }

   @Override
   protected bjy<?> a(Dynamic<?> $$0) {
      return cad.a(this, this.dN().a($$0));
   }

   @Override
   public bjy<cac> dM() {
      return (bjy<cac>)super.dM();
   }

   @Override
   public bgq b(cbm $$0, bgp $$1) {
      bgq $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dK().B) {
         return cad.a(this, $$0, $$1);
      } else {
         boolean $$3 = cad.b(this, $$0.b($$1)) && this.gc() != cae.d;
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
         bka $$1 = this.a(bke.d);
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
      cad.a(this);
      super.V();
   }

   @Override
   public int ec() {
      return this.bJ;
   }

   @Override
   protected void c(akk $$0) {
      cad.b(this);
      this.cj.f().forEach(this::b);
      super.c($$0);
   }

   private cix gj() {
      return (double)this.ag.i() < 0.5 ? new cix(cja.uZ) : new cix(cja.oh);
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
   public cae gc() {
      if (this.gi()) {
         return cae.e;
      } else if (cad.a(this.eS())) {
         return cae.d;
      } else if (this.fS() && this.gd()) {
         return cae.a;
      } else if (this.gk()) {
         return cae.c;
      } else {
         return this.fS() && this.b(cja.uZ) ? cae.b : cae.f;
      }
   }

   public boolean gi() {
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
            cad.a(this, (biy)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(biy $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(biy $$0, cix $$1, cce $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public boolean a(cjn $$0) {
      return $$0 == cja.uZ;
   }

   protected void n(cix $$0) {
      this.b(bin.a, $$0);
   }

   protected void o(cix $$0) {
      if ($$0.a(cad.c)) {
         this.a(bin.b, $$0);
         this.e(bin.b);
      } else {
         this.b(bin.b, $$0);
      }
   }

   @Override
   public boolean k(cix $$0) {
      return this.dK().X().b(cph.c) && this.fG() && cad.a(this, $$0);
   }

   protected boolean p(cix $$0) {
      bin $$1 = bja.h($$0);
      cix $$2 = this.c($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(cix $$0, cix $$1) {
      if (cng.d($$1)) {
         return false;
      } else {
         boolean $$2 = cad.a($$0) || $$0.a(cja.uZ);
         boolean $$3 = cad.a($$1) || $$1.a(cja.uZ);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.gb() && !$$0.a(cja.uZ) && $$1.a(cja.uZ) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(byf $$0) {
      this.a($$0);
      cad.a(this, $$0);
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
      return this.dK().B ? null : cad.c(this).orElse(null);
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
   protected void b(gu $$0, dez $$1) {
      this.a(aow.sb, 0.15F, 1.0F);
   }

   protected void b(aov $$0) {
      this.a($$0, this.eU(), this.eV());
   }

   @Override
   protected void ge() {
      this.b(aow.sc);
   }
}
