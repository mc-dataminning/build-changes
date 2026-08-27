import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class cau extends bid implements cax, cay, coh {
   private static final adz<Integer> bV = aec.a(cau.class, aeb.b);
   public static final int bT = 300;
   private static final int bW = 8;
   @Nullable
   private cbm bX;
   @Nullable
   protected coj bU;
   private final bgx bY = new bgx(8);

   public cau(bim<? extends cau> $$0, cpl $$1) {
      super($$0, $$1);
      this.a(ean.n, 16.0F);
      this.a(ean.o, -1.0F);
   }

   @Override
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
      if ($$3 == null) {
         $$3 = new bid.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public int p() {
      return this.an.b(bV);
   }

   public void s(int $$0) {
      this.an.b(bV, $$0);
   }

   @Override
   public int q() {
      return 0;
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return this.i_() ? 0.81F : 1.62F;
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bV, 0);
   }

   @Override
   public void f(@Nullable cbm $$0) {
      this.bX = $$0;
   }

   @Nullable
   @Override
   public cbm ga() {
      return this.bX;
   }

   public boolean gb() {
      return this.bX != null;
   }

   @Override
   public coj gc() {
      if (this.bU == null) {
         this.bU = new coj();
         this.gh();
      }

      return this.bU;
   }

   @Override
   public void a(@Nullable coj $$0) {
   }

   @Override
   public void t(int $$0) {
   }

   @Override
   public void a(coi $$0) {
      $$0.j();
      this.bI = -this.L();
      this.b($$0);
      if (this.bX instanceof akl) {
         ai.s.a((akl)this.bX, this, $$0.d());
      }
   }

   protected abstract void b(coi var1);

   @Override
   public boolean gd() {
      return true;
   }

   @Override
   public void l(cix $$0) {
      if (!this.dK().B && this.bI > -this.L() + 20) {
         this.bI = -this.L();
         this.a(this.w(!$$0.b()), this.eU(), this.eV());
      }
   }

   @Override
   public aov ge() {
      return aow.yN;
   }

   protected aov w(boolean $$0) {
      return $$0 ? aow.yN : aow.yL;
   }

   public void gf() {
      this.a(aow.yI, this.eU(), this.eV());
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      coj $$1 = this.gc();
      if (!$$1.isEmpty()) {
         $$0.a("Offers", $$1.a());
      }

      this.a_($$0);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("Offers", 10)) {
         this.bU = new coj($$0.p("Offers"));
      }

      this.c($$0);
   }

   @Nullable
   @Override
   public bii b(akk $$0) {
      this.gg();
      return super.b($$0);
   }

   protected void gg() {
      this.f(null);
   }

   @Override
   public void a(bhg $$0) {
      super.a($$0);
      this.gg();
   }

   protected void a(it $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ag.k() * 0.02;
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         this.dK().a($$0, this.d(1.0), this.ds() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(cbm $$0) {
      return false;
   }

   @Override
   public bgx t() {
      return this.bY;
   }

   @Override
   public bjq a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bY.b() ? bjq.a(this.bY, $$1) : super.a_($$0);
   }

   protected abstract void gh();

   protected void a(coj $$0, cbd.f[] $$1, int $$2) {
      Set<Integer> $$3 = Sets.newHashSet();
      if ($$1.length > $$2) {
         while ($$3.size() < $$2) {
            $$3.add(this.ag.a($$1.length));
         }
      } else {
         for (int $$4 = 0; $$4 < $$1.length; $$4++) {
            $$3.add($$4);
         }
      }

      for (Integer $$5 : $$3) {
         cbd.f $$6 = $$1[$$5];
         coi $$7 = $$6.a(this, this.ag);
         if ($$7 != null) {
            $$0.add($$7);
         }
      }
   }

   @Override
   public ehd q(float $$0) {
      float $$1 = arp.i($$0, this.aV, this.aU) * (float) (Math.PI / 180.0);
      ehd $$2 = new ehd(0.0, this.cG().c() - 1.0, 0.2);
      return this.l($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gi() {
      return this.dK().B;
   }
}
