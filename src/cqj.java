import com.google.common.collect.Lists;
import java.util.ArrayList;
import javax.annotation.Nullable;

public abstract class cqj extends bvv implements cqm, cqn, dhx {
   private static final akj<Integer> bI = akn.a(cqj.class, akl.b);
   public static final int bG = 300;
   private static final int bJ = 8;
   @Nullable
   private crc bK;
   @Nullable
   protected dhz bH;
   private final buk bL = new buk(8);

   public cqj(bwo<? extends cqj> $$0, dja $$1) {
      super($$0, $$1);
      this.a(exf.n, 16.0F);
      this.a(exf.o, -1.0F);
   }

   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      if ($$3 == null) {
         $$3 = new bvv.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public int q() {
      return this.al.a(bI);
   }

   public void r(int $$0) {
      this.al.a(bI, $$0);
   }

   @Override
   public int t() {
      return 0;
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bI, 0);
   }

   @Override
   public void a(@Nullable crc $$0) {
      this.bK = $$0;
   }

   @Nullable
   @Override
   public crc x() {
      return this.bK;
   }

   public boolean gr() {
      return this.bK != null;
   }

   @Override
   public dhz gs() {
      if (this.dV().C) {
         throw new IllegalStateException("Cannot load Villager offers on the client");
      } else {
         if (this.bH == null) {
            this.bH = new dhz();
            this.gx();
         }

         return this.bH;
      }
   }

   @Override
   public void a(@Nullable dhz $$0) {
   }

   @Override
   public void s(int $$0) {
   }

   @Override
   public void a(dhy $$0) {
      $$0.l();
      this.bx = -this.S();
      this.b($$0);
      if (this.bK instanceof arr) {
         ap.t.a((arr)this.bK, this, $$0.f());
      }
   }

   protected abstract void b(dhy var1);

   @Override
   public boolean gt() {
      return true;
   }

   @Override
   public void i(czd $$0) {
      if (!this.dV().C && this.bx > -this.S() + 20) {
         this.bx = -this.S();
         this.b(this.w(!$$0.f()));
      }
   }

   @Override
   public awm gu() {
      return awn.Cc;
   }

   protected awm w(boolean $$0) {
      return $$0 ? awn.Cc : awn.Ca;
   }

   public void gv() {
      this.b(awn.BX);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      if (!this.dV().C) {
         dhz $$1 = this.gs();
         if (!$$1.isEmpty()) {
            $$0.a("Offers", dhz.a, this.dX().a(un.a), $$1);
         }
      }

      this.b($$0, this.dX());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.bH = $$0.<dhz>a("Offers", dhz.a, this.dX().a(un.a)).orElse(null);
      this.a($$0, this.dX());
   }

   @Nullable
   @Override
   public bwf b(exo $$0) {
      this.gw();
      return super.b($$0);
   }

   protected void gw() {
      this.a(null);
   }

   @Override
   public void a(buu $$0) {
      super.a($$0);
      this.gw();
   }

   protected void a(lv $$0) {
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
   public buk n() {
      return this.bL;
   }

   @Override
   public bxv a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bL.b() ? bxv.a(this.bL, $$1) : super.a_($$0);
   }

   protected abstract void gx();

   protected void a(dhz $$0, cqs.g[] $$1, int $$2) {
      ArrayList<cqs.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         dhy $$5 = $$3.remove(this.ae.a($$3.size())).a(this, this.ae);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public feq v(float $$0) {
      float $$1 = azm.h($$0, this.aW, this.aV) * (float) (Math.PI / 180.0);
      feq $$2 = new feq(0.0, this.cR().c() - 1.0, 0.2);
      return this.p($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gy() {
      return this.dV().C;
   }

   @Override
   public boolean e(crc $$0) {
      return this.x() == $$0 && this.bK() && $$0.b(this, 4.0);
   }
}
