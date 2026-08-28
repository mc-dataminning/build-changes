import com.google.common.collect.Lists;
import java.util.ArrayList;
import javax.annotation.Nullable;

public abstract class crp extends bwu implements crs, crt, dje {
   private static final aku<Integer> bK = aky.a(crp.class, akw.b);
   public static final int bI = 300;
   private static final int bL = 8;
   @Nullable
   private csi bM;
   @Nullable
   protected djg bJ;
   private final bvj bN = new bvj(8);

   public crp(bxn<? extends crp> $$0, dkj $$1) {
      super($$0, $$1);
      this.a(eyr.n, 16.0F);
      this.a(eyr.o, -1.0F);
   }

   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      if ($$3 == null) {
         $$3 = new bwu.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public int q() {
      return this.al.a(bK);
   }

   public void r(int $$0) {
      this.al.a(bK, $$0);
   }

   @Override
   public int t() {
      return 0;
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(bK, 0);
   }

   @Override
   public void a(@Nullable csi $$0) {
      this.bM = $$0;
   }

   @Nullable
   @Override
   public csi x() {
      return this.bM;
   }

   public boolean gu() {
      return this.bM != null;
   }

   @Override
   public djg gv() {
      if (this.dV().C) {
         throw new IllegalStateException("Cannot load Villager offers on the client");
      } else {
         if (this.bJ == null) {
            this.bJ = new djg();
            this.gA();
         }

         return this.bJ;
      }
   }

   @Override
   public void a(@Nullable djg $$0) {
   }

   @Override
   public void s(int $$0) {
   }

   @Override
   public void a(djf $$0) {
      $$0.l();
      this.bz = -this.S();
      this.b($$0);
      if (this.bM instanceof asc) {
         aq.t.a((asc)this.bM, this, $$0.f());
      }
   }

   protected abstract void b(djf var1);

   @Override
   public boolean gw() {
      return true;
   }

   @Override
   public void i(dak $$0) {
      if (!this.dV().C && this.bz > -this.S() + 20) {
         this.bz = -this.S();
         this.b(this.w(!$$0.f()));
      }
   }

   @Override
   public awx gx() {
      return awy.Cc;
   }

   protected awx w(boolean $$0) {
      return $$0 ? awy.Cc : awy.Ca;
   }

   public void gy() {
      this.b(awy.BX);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      if (!this.dV().C) {
         djg $$1 = this.gv();
         if (!$$1.isEmpty()) {
            $$0.a("Offers", djg.a, this.dX().a(uo.a), $$1);
         }
      }

      this.b($$0, this.dX());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.bJ = $$0.<djg>a("Offers", djg.a, this.dX().a(uo.a)).orElse(null);
      this.a($$0, this.dX());
   }

   @Nullable
   @Override
   public bxe b(eza $$0) {
      this.gz();
      return super.b($$0);
   }

   protected void gz() {
      this.a(null);
   }

   @Override
   public void a(bvt $$0) {
      super.a($$0);
      this.gz();
   }

   protected void a(lx $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ae.k() * 0.02;
         double $$3 = this.ae.k() * 0.02;
         double $$4 = this.ae.k() * 0.02;
         this.dV().a($$0, this.d(1.0), this.dD() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean w() {
      return false;
   }

   @Override
   public bvj n() {
      return this.bN;
   }

   @Override
   public byw a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bN.b() ? byw.a(this.bN, $$1) : super.a_($$0);
   }

   protected abstract void gA();

   protected void a(djg $$0, cry.g[] $$1, int $$2) {
      ArrayList<cry.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         djf $$5 = $$3.remove(this.ae.a($$3.size())).a(this, this.ae);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public fgc v(float $$0) {
      float $$1 = azz.h($$0, this.aW, this.aV) * (float) (Math.PI / 180.0);
      fgc $$2 = new fgc(0.0, this.cR().c() - 1.0, 0.2);
      return this.p($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gB() {
      return this.dV().C;
   }

   @Override
   public boolean e(csi $$0) {
      return this.x() == $$0 && this.bJ() && $$0.b(this, 4.0);
   }
}
