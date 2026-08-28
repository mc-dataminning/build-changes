import com.google.common.collect.Lists;
import java.util.ArrayList;
import javax.annotation.Nullable;

public abstract class cqq extends bvy implements cqt, cqu, die {
   private static final akj<Integer> bI = akn.a(cqq.class, akl.b);
   public static final int bG = 300;
   private static final int bJ = 8;
   @Nullable
   private crj bK;
   @Nullable
   protected dig bH;
   private final bun bL = new bun(8);

   public cqq(bwr<? extends cqq> $$0, djh $$1) {
      super($$0, $$1);
      this.a(exm.n, 16.0F);
      this.a(exm.o, -1.0F);
   }

   @Override
   public byb a(djy $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      if ($$3 == null) {
         $$3 = new bvy.a(false);
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
   public void a(@Nullable crj $$0) {
      this.bK = $$0;
   }

   @Nullable
   @Override
   public crj x() {
      return this.bK;
   }

   public boolean gt() {
      return this.bK != null;
   }

   @Override
   public dig gu() {
      if (this.dU().C) {
         throw new IllegalStateException("Cannot load Villager offers on the client");
      } else {
         if (this.bH == null) {
            this.bH = new dig();
            this.gz();
         }

         return this.bH;
      }
   }

   @Override
   public void a(@Nullable dig $$0) {
   }

   @Override
   public void s(int $$0) {
   }

   @Override
   public void a(dif $$0) {
      $$0.l();
      this.bx = -this.S();
      this.b($$0);
      if (this.bK instanceof arr) {
         aq.t.a((arr)this.bK, this, $$0.f());
      }
   }

   protected abstract void b(dif var1);

   @Override
   public boolean gv() {
      return true;
   }

   @Override
   public void i(czk $$0) {
      if (!this.dU().C && this.bx > -this.S() + 20) {
         this.bx = -this.S();
         this.b(this.w(!$$0.f()));
      }
   }

   @Override
   public awm gw() {
      return awn.Cc;
   }

   protected awm w(boolean $$0) {
      return $$0 ? awn.Cc : awn.Ca;
   }

   public void gx() {
      this.b(awn.BX);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      if (!this.dU().C) {
         dig $$1 = this.gu();
         if (!$$1.isEmpty()) {
            $$0.a("Offers", dig.a, this.dW().a(un.a), $$1);
         }
      }

      this.b($$0, this.dW());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.bH = $$0.<dig>a("Offers", dig.a, this.dW().a(un.a)).orElse(null);
      this.a($$0, this.dW());
   }

   @Nullable
   @Override
   public bwi b(exv $$0) {
      this.gy();
      return super.b($$0);
   }

   protected void gy() {
      this.a(null);
   }

   @Override
   public void a(bux $$0) {
      super.a($$0);
      this.gy();
   }

   protected void a(lw $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ae.k() * 0.02;
         double $$3 = this.ae.k() * 0.02;
         double $$4 = this.ae.k() * 0.02;
         this.dU().a($$0, this.d(1.0), this.dC() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean w() {
      return false;
   }

   @Override
   public bun n() {
      return this.bL;
   }

   @Override
   public bya a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bL.b() ? bya.a(this.bL, $$1) : super.a_($$0);
   }

   protected abstract void gz();

   protected void a(dig $$0, cqz.g[] $$1, int $$2) {
      ArrayList<cqz.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         dif $$5 = $$3.remove(this.ae.a($$3.size())).a(this, this.ae);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public fex v(float $$0) {
      float $$1 = azm.h($$0, this.aW, this.aV) * (float) (Math.PI / 180.0);
      fex $$2 = new fex(0.0, this.cQ().c() - 1.0, 0.2);
      return this.p($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gA() {
      return this.dU().C;
   }

   @Override
   public boolean e(crj $$0) {
      return this.x() == $$0 && this.bI() && $$0.b(this, 4.0);
   }
}
