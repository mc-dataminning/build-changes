import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class cav extends bid implements cay, caz, coi {
   private static final adz<Integer> bV = aec.a(cav.class, aeb.b);
   public static final int bT = 300;
   private static final int bW = 8;
   @Nullable
   private cbn bX;
   @Nullable
   protected cok bU;
   private final bgx bY = new bgx(8);

   public cav(bim<? extends cav> $$0, cpm $$1) {
      super($$0, $$1);
      this.a(eao.n, 16.0F);
      this.a(eao.o, -1.0F);
   }

   @Override
   public bjs a(cqb $$0, bgo $$1, bjc $$2, @Nullable bjs $$3, @Nullable qr $$4) {
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
   public void f(@Nullable cbn $$0) {
      this.bX = $$0;
   }

   @Nullable
   @Override
   public cbn fZ() {
      return this.bX;
   }

   public boolean ga() {
      return this.bX != null;
   }

   @Override
   public cok gb() {
      if (this.bU == null) {
         this.bU = new cok();
         this.gg();
      }

      return this.bU;
   }

   @Override
   public void a(@Nullable cok $$0) {
   }

   @Override
   public void t(int $$0) {
   }

   @Override
   public void a(coj $$0) {
      $$0.j();
      this.bI = -this.L();
      this.b($$0);
      if (this.bX instanceof akl) {
         ai.s.a((akl)this.bX, this, $$0.d());
      }
   }

   protected abstract void b(coj var1);

   @Override
   public boolean gc() {
      return true;
   }

   @Override
   public void l(ciy $$0) {
      if (!this.dK().B && this.bI > -this.L() + 20) {
         this.bI = -this.L();
         this.a(this.w(!$$0.b()), this.eU(), this.eV());
      }
   }

   @Override
   public aov gd() {
      return aow.yI;
   }

   protected aov w(boolean $$0) {
      return $$0 ? aow.yI : aow.yG;
   }

   public void ge() {
      this.a(aow.yD, this.eU(), this.eV());
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      cok $$1 = this.gb();
      if (!$$1.isEmpty()) {
         $$0.a("Offers", $$1.a());
      }

      this.a_($$0);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("Offers", 10)) {
         this.bU = new cok($$0.p("Offers"));
      }

      this.c($$0);
   }

   @Nullable
   @Override
   public bii b(akk $$0) {
      this.gf();
      return super.b($$0);
   }

   protected void gf() {
      this.f(null);
   }

   @Override
   public void a(bhg $$0) {
      super.a($$0);
      this.gf();
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
   public boolean a(cbn $$0) {
      return false;
   }

   @Override
   public bgx t() {
      return this.bY;
   }

   @Override
   public bjr a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bY.b() ? bjr.a(this.bY, $$1) : super.a_($$0);
   }

   protected abstract void gg();

   protected void a(cok $$0, cbe.f[] $$1, int $$2) {
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
         cbe.f $$6 = $$1[$$5];
         coj $$7 = $$6.a(this, this.ag);
         if ($$7 != null) {
            $$0.add($$7);
         }
      }
   }

   @Override
   public ehe q(float $$0) {
      float $$1 = arp.i($$0, this.aV, this.aU) * (float) (Math.PI / 180.0);
      ehe $$2 = new ehe(0.0, this.cG().c() - 1.0, 0.2);
      return this.l($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gh() {
      return this.dK().B;
   }
}
