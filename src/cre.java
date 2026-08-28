import com.google.common.collect.Lists;
import java.util.ArrayList;
import javax.annotation.Nullable;

public abstract class cre extends bwj implements crh, cri, dis {
   private static final akl<Integer> bK = akp.a(cre.class, akn.b);
   public static final int bI = 300;
   private static final int bL = 8;
   @Nullable
   private crx bM;
   @Nullable
   protected diu bJ;
   private final buy bN = new buy(8);

   public cre(bxc<? extends cre> $$0, djx $$1) {
      super($$0, $$1);
      this.a(eyf.n, 16.0F);
      this.a(eyf.o, -1.0F);
   }

   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      if ($$3 == null) {
         $$3 = new bwj.a(false);
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
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bK, 0);
   }

   @Override
   public void a(@Nullable crx $$0) {
      this.bM = $$0;
   }

   @Nullable
   @Override
   public crx x() {
      return this.bM;
   }

   public boolean gu() {
      return this.bM != null;
   }

   @Override
   public diu gv() {
      if (this.dV().C) {
         throw new IllegalStateException("Cannot load Villager offers on the client");
      } else {
         if (this.bJ == null) {
            this.bJ = new diu();
            this.gA();
         }

         return this.bJ;
      }
   }

   @Override
   public void a(@Nullable diu $$0) {
   }

   @Override
   public void s(int $$0) {
   }

   @Override
   public void a(dit $$0) {
      $$0.l();
      this.bz = -this.S();
      this.b($$0);
      if (this.bM instanceof art) {
         aq.t.a((art)this.bM, this, $$0.f());
      }
   }

   protected abstract void b(dit var1);

   @Override
   public boolean gw() {
      return true;
   }

   @Override
   public void i(czy $$0) {
      if (!this.dV().C && this.bz > -this.S() + 20) {
         this.bz = -this.S();
         this.b(this.w(!$$0.f()));
      }
   }

   @Override
   public awo gx() {
      return awp.Cc;
   }

   protected awo w(boolean $$0) {
      return $$0 ? awp.Cc : awp.Ca;
   }

   public void gy() {
      this.b(awp.BX);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      if (!this.dV().C) {
         diu $$1 = this.gv();
         if (!$$1.isEmpty()) {
            $$0.a("Offers", diu.a, this.dX().a(un.a), $$1);
         }
      }

      this.b($$0, this.dX());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.bJ = $$0.<diu>a("Offers", diu.a, this.dX().a(un.a)).orElse(null);
      this.a($$0, this.dX());
   }

   @Nullable
   @Override
   public bwt b(eyo $$0) {
      this.gz();
      return super.b($$0);
   }

   protected void gz() {
      this.a(null);
   }

   @Override
   public void a(bvi $$0) {
      super.a($$0);
      this.gz();
   }

   protected void a(lw $$0) {
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
   public buy n() {
      return this.bN;
   }

   @Override
   public byl a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bN.b() ? byl.a(this.bN, $$1) : super.a_($$0);
   }

   protected abstract void gA();

   protected void a(diu $$0, crn.g[] $$1, int $$2) {
      ArrayList<crn.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         dit $$5 = $$3.remove(this.ae.a($$3.size())).a(this, this.ae);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public ffq v(float $$0) {
      float $$1 = azo.h($$0, this.aW, this.aV) * (float) (Math.PI / 180.0);
      ffq $$2 = new ffq(0.0, this.cR().c() - 1.0, 0.2);
      return this.p($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gB() {
      return this.dV().C;
   }

   @Override
   public boolean e(crx $$0) {
      return this.x() == $$0 && this.bJ() && $$0.b(this, 4.0);
   }
}
