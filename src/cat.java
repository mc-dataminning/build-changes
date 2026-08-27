import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class cat extends bib implements caw, cax, cog {
   private static final adx<Integer> bV = aea.a(cat.class, adz.b);
   public static final int bT = 300;
   private static final int bW = 8;
   @Nullable
   private cbl bX;
   @Nullable
   protected coi bU;
   private final bgv bY = new bgv(8);

   public cat(bik<? extends cat> $$0, cpk $$1) {
      super($$0, $$1);
      this.a(eam.n, 16.0F);
      this.a(eam.o, -1.0F);
   }

   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      if ($$3 == null) {
         $$3 = new bib.a(false);
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
   protected float b(bji $$0, bih $$1) {
      return this.i_() ? 0.81F : 1.62F;
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bV, 0);
   }

   @Override
   public void f(@Nullable cbl $$0) {
      this.bX = $$0;
   }

   @Nullable
   @Override
   public cbl fZ() {
      return this.bX;
   }

   public boolean ga() {
      return this.bX != null;
   }

   @Override
   public coi gb() {
      if (this.bU == null) {
         this.bU = new coi();
         this.gg();
      }

      return this.bU;
   }

   @Override
   public void a(@Nullable coi $$0) {
   }

   @Override
   public void t(int $$0) {
   }

   @Override
   public void a(coh $$0) {
      $$0.j();
      this.bI = -this.L();
      this.b($$0);
      if (this.bX instanceof akj) {
         ai.s.a((akj)this.bX, this, $$0.d());
      }
   }

   protected abstract void b(coh var1);

   @Override
   public boolean gc() {
      return true;
   }

   @Override
   public void l(ciw $$0) {
      if (!this.dK().B && this.bI > -this.L() + 20) {
         this.bI = -this.L();
         this.a(this.w(!$$0.b()), this.eU(), this.eV());
      }
   }

   @Override
   public aot gd() {
      return aou.yI;
   }

   protected aot w(boolean $$0) {
      return $$0 ? aou.yI : aou.yG;
   }

   public void ge() {
      this.a(aou.yD, this.eU(), this.eV());
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      coi $$1 = this.gb();
      if (!$$1.isEmpty()) {
         $$0.a("Offers", $$1.a());
      }

      this.a_($$0);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      if ($$0.b("Offers", 10)) {
         this.bU = new coi($$0.p("Offers"));
      }

      this.c($$0);
   }

   @Nullable
   @Override
   public big b(aki $$0) {
      this.gf();
      return super.b($$0);
   }

   protected void gf() {
      this.f(null);
   }

   @Override
   public void a(bhe $$0) {
      super.a($$0);
      this.gf();
   }

   protected void a(iu $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ag.k() * 0.02;
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         this.dK().a($$0, this.d(1.0), this.ds() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(cbl $$0) {
      return false;
   }

   @Override
   public bgv t() {
      return this.bY;
   }

   @Override
   public bjp a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bY.b() ? bjp.a(this.bY, $$1) : super.a_($$0);
   }

   protected abstract void gg();

   protected void a(coi $$0, cbc.f[] $$1, int $$2) {
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
         cbc.f $$6 = $$1[$$5];
         coh $$7 = $$6.a(this, this.ag);
         if ($$7 != null) {
            $$0.add($$7);
         }
      }
   }

   @Override
   public ehf q(float $$0) {
      float $$1 = aro.i($$0, this.aV, this.aU) * (float) (Math.PI / 180.0);
      ehf $$2 = new ehf(0.0, this.cG().c() - 1.0, 0.2);
      return this.l($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gh() {
      return this.dK().B;
   }
}
