import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzx extends buk implements byt, bzz {
   private static final adz<Boolean> bW = aec.a(bzx.class, aeb.k);
   private static final float bX = 0.2F;
   private static final int bY = 40;
   private static final float bZ = 0.3F;
   private static final int ca = 1;
   private static final float cb = 0.6F;
   private static final int cc = 6;
   private static final float cd = 0.5F;
   private static final int ce = 300;
   private int cf;
   private int cg;
   private boolean ch;
   protected static final ImmutableList<? extends btf<? extends bte<? super bzx>>> bT = ImmutableList.of(btf.c, btf.d, btf.n, btf.m);
   protected static final ImmutableList<? extends bsa<?>> bU = ImmutableList.of(
      bsa.r, bsa.g, bsa.h, bsa.k, bsa.l, bsa.n, bsa.m, bsa.E, bsa.t, bsa.o, bsa.p, bsa.ap, new bsa[]{bsa.z, bsa.ar, bsa.as, bsa.ao, bsa.J, bsa.av, bsa.aw}
   );

   public bzx(bim<? extends bzx> $$0, cpm $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public boolean a(cbn $$0) {
      return !this.fO();
   }

   public static bke.a p() {
      return bzb.gf().a(bkf.a, 40.0).a(bkf.d, 0.3F).a(bkf.c, 0.6F).a(bkf.g, 1.0).a(bkf.f, 6.0);
   }

   @Override
   public boolean C(bii $$0) {
      if (!($$0 instanceof biy)) {
         return false;
      } else {
         this.cf = 10;
         this.dK().a(this, (byte)4);
         this.a(aow.kO, 1.0F, this.eV());
         bzy.a(this, (biy)$$0);
         return bzz.a(this, (biy)$$0);
      }
   }

   @Override
   protected void e(biy $$0) {
      if (this.q()) {
         bzz.b(this, $$0);
      }
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dK().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof biy) {
            bzy.b(this, (biy)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bjz.b<bzx> dN() {
      return bjz.a(bU, bT);
   }

   @Override
   protected bjz<?> a(Dynamic<?> $$0) {
      return bzy.a(this.dN().a($$0));
   }

   @Override
   public bjz<bzx> dM() {
      return (bjz<bzx>)super.dM();
   }

   @Override
   protected void V() {
      this.dK().ad().a("hoglinBrain");
      this.dM().a((akk)this.dK(), this);
      this.dK().ad().c();
      bzy.a(this);
      if (this.t()) {
         this.cg++;
         if (this.cg > 300) {
            this.b(aow.kP);
            this.c((akk)this.dK());
         }
      } else {
         this.cg = 0;
      }
   }

   @Override
   public void b_() {
      if (this.cf > 0) {
         this.cf--;
      }

      super.b_();
   }

   @Override
   protected void m() {
      if (this.i_()) {
         this.bJ = 3;
         this.a(bkf.f).a(0.5);
      } else {
         this.bJ = 5;
         this.a(bkf.f).a(6.0);
      }
   }

   public static boolean c(bim<bzx> $$0, cpn $$1, bjc $$2, gu $$3, aru $$4) {
      return !$$1.a_($$3.d()).a(csn.kK);
   }

   @Nullable
   @Override
   public bjs a(cqb $$0, bgo $$1, bjc $$2, @Nullable bjs $$3, @Nullable qr $$4) {
      if ($$0.y_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.fH();
   }

   @Override
   public float a(gu $$0, cpp $$1) {
      if (bzy.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(csn.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.09375F * $$2, 0.0F);
   }

   @Override
   public bgq b(cbn $$0, bgp $$1) {
      bgq $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fF();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cf = 10;
         this.a(aow.kO, 1.0F, this.eV());
      } else {
         super.b($$0);
      }
   }

   @Override
   public int fZ() {
      return this.cf;
   }

   @Override
   public boolean ea() {
      return true;
   }

   @Override
   public int ec() {
      return this.bJ;
   }

   private void c(akk $$0) {
      bzt $$1 = this.a(bim.bo, true);
      if ($$1 != null) {
         $$1.b(new bhv(bhx.i, 200, 0));
      }
   }

   @Override
   public boolean m(ciy $$0) {
      return $$0.a(cjb.dg);
   }

   public boolean q() {
      return !this.i_();
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bW, false);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      if (this.gg()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.cg);
      if (this.ch) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.cg = $$0.h("TimeInOverworld");
      this.x($$0.q("CannotBeHunted"));
   }

   public void w(boolean $$0) {
      this.al().b(bW, $$0);
   }

   private boolean gg() {
      return this.al().b(bW);
   }

   public boolean t() {
      return !this.dK().x_().b() && !this.gg() && !this.fQ();
   }

   private void x(boolean $$0) {
      this.ch = $$0;
   }

   public boolean gf() {
      return this.q() && !this.ch;
   }

   @Nullable
   @Override
   public bid a(akk $$0, bid $$1) {
      bzx $$2 = bim.W.a((cpm)$$0);
      if ($$2 != null) {
         $$2.fF();
      }

      return $$2;
   }

   @Override
   public boolean ga() {
      return !bzy.c(this) && super.ga();
   }

   @Override
   public aox da() {
      return aox.f;
   }

   @Override
   protected aov r() {
      return this.dK().B ? null : bzy.b(this).orElse(null);
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.kR;
   }

   @Override
   protected aov h_() {
      return aow.kQ;
   }

   @Override
   protected aov aL() {
      return aow.lw;
   }

   @Override
   protected aov aM() {
      return aow.lv;
   }

   @Override
   protected void b(gu $$0, dfa $$1) {
      this.a(aow.kT, 0.15F, 1.0F);
   }

   protected void b(aov $$0) {
      this.a($$0, this.eU(), this.eV());
   }

   @Override
   protected void T() {
      super.T();
      aav.a(this);
   }
}
