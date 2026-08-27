import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class cax extends big implements cba, cbb, com {
   private static final aec<Integer> bV = aef.a(cax.class, aee.b);
   public static final int bT = 300;
   private static final int bW = 8;
   @Nullable
   private cbp bX;
   @Nullable
   protected cop bU;
   private final bha bY = new bha(8);

   public cax(bip<? extends cax> $$0, cpq $$1) {
      super($$0, $$1);
      this.a(eas.n, 16.0F);
      this.a(eas.o, -1.0F);
   }

   @Override
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      if ($$3 == null) {
         $$3 = new big.a(false);
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
   protected float b(bjn $$0, bim $$1) {
      return this.i_() ? 0.81F : 1.62F;
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bV, 0);
   }

   @Override
   public void f(@Nullable cbp $$0) {
      this.bX = $$0;
   }

   @Nullable
   @Override
   public cbp ga() {
      return this.bX;
   }

   public boolean gb() {
      return this.bX != null;
   }

   @Override
   public cop gc() {
      if (this.bU == null) {
         this.bU = new cop();
         this.gh();
      }

      return this.bU;
   }

   @Override
   public void a(@Nullable cop $$0) {
   }

   @Override
   public void t(int $$0) {
   }

   @Override
   public void a(coo $$0) {
      $$0.j();
      this.bI = -this.L();
      this.b($$0);
      if (this.bX instanceof ako) {
         al.s.a((ako)this.bX, this, $$0.d());
      }
   }

   protected abstract void b(coo var1);

   @Override
   public boolean gd() {
      return true;
   }

   @Override
   public void l(cja $$0) {
      if (!this.dK().B && this.bI > -this.L() + 20) {
         this.bI = -this.L();
         this.a(this.w(!$$0.b()), this.eU(), this.eV());
      }
   }

   @Override
   public aoy ge() {
      return aoz.yN;
   }

   protected aoy w(boolean $$0) {
      return $$0 ? aoz.yN : aoz.yL;
   }

   public void gf() {
      this.a(aoz.yI, this.eU(), this.eV());
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      cop $$1 = this.gc();
      if (!$$1.isEmpty()) {
         $$0.a("Offers", $$1.a());
      }

      this.a_($$0);
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      if ($$0.b("Offers", 10)) {
         this.bU = new cop($$0.p("Offers"));
      }

      this.c($$0);
   }

   @Nullable
   @Override
   public bil b(akn $$0) {
      this.gg();
      return super.b($$0);
   }

   protected void gg() {
      this.f(null);
   }

   @Override
   public void a(bhj $$0) {
      super.a($$0);
      this.gg();
   }

   protected void a(iv $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ag.k() * 0.02;
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         this.dK().a($$0, this.d(1.0), this.ds() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(cbp $$0) {
      return false;
   }

   @Override
   public bha t() {
      return this.bY;
   }

   @Override
   public bjt a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bY.b() ? bjt.a(this.bY, $$1) : super.a_($$0);
   }

   protected abstract void gh();

   protected void a(cop $$0, cbg.f[] $$1, int $$2) {
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
         cbg.f $$6 = $$1[$$5];
         coo $$7 = $$6.a(this, this.ag);
         if ($$7 != null) {
            $$0.add($$7);
         }
      }
   }

   @Override
   public ehi q(float $$0) {
      float $$1 = ars.i($$0, this.aV, this.aU) * (float) (Math.PI / 180.0);
      ehi $$2 = new ehi(0.0, this.cG().c() - 1.0, 0.2);
      return this.l($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gi() {
      return this.dK().B;
   }
}
