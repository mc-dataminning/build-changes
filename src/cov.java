import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cov extends bus implements coy, coz, dfv {
   private static final aks<Integer> cb = akw.a(cov.class, aku.b);
   private static final Logger cc = LogUtils.getLogger();
   public static final int bZ = 300;
   private static final int cd = 8;
   @Nullable
   private cpo ce;
   @Nullable
   protected dfx ca;
   private final bth cf = new bth(8);

   public cov(bvi<? extends cov> $$0, dgz $$1) {
      super($$0, $$1);
      this.a(euh.n, 16.0F);
      this.a(euh.o, -1.0F);
   }

   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      if ($$3 == null) {
         $$3 = new bus.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public int p() {
      return this.al.a(cb);
   }

   public void r(int $$0) {
      this.al.a(cb, $$0);
   }

   @Override
   public int x() {
      return 0;
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(cb, 0);
   }

   @Override
   public void a(@Nullable cpo $$0) {
      this.ce = $$0;
   }

   @Nullable
   @Override
   public cpo go() {
      return this.ce;
   }

   public boolean gp() {
      return this.ce != null;
   }

   @Override
   public dfx gq() {
      if (this.dW().C) {
         throw new IllegalStateException("Cannot load Villager offers on the client");
      } else {
         if (this.ca == null) {
            this.ca = new dfx();
            this.gv();
         }

         return this.ca;
      }
   }

   @Override
   public void a(@Nullable dfx $$0) {
   }

   @Override
   public void s(int $$0) {
   }

   @Override
   public void a(dfw $$0) {
      $$0.l();
      this.bN = -this.Q();
      this.b($$0);
      if (this.ce instanceof ary) {
         ao.t.a((ary)this.ce, this, $$0.f());
      }
   }

   protected abstract void b(dfw var1);

   @Override
   public boolean gr() {
      return true;
   }

   @Override
   public void i(cxg $$0) {
      if (!this.dW().C && this.bN > -this.Q() + 20) {
         this.bN = -this.Q();
         this.b(this.x(!$$0.f()));
      }
   }

   @Override
   public awu gs() {
      return awv.BN;
   }

   protected awu x(boolean $$0) {
      return $$0 ? awv.BN : awv.BL;
   }

   public void gt() {
      this.b(awv.BI);
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      if (!this.dW().C) {
         dfx $$1 = this.gq();
         if (!$$1.isEmpty()) {
            $$0.a("Offers", (vj)dfx.a.encodeStart(this.dY().a(va.a), $$1).getOrThrow());
         }
      }

      this.b($$0, this.dY());
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      if ($$0.e("Offers")) {
         dfx.a.parse(this.dY().a(va.a), $$0.c("Offers")).resultOrPartial(ae.a("Failed to load offers: ", cc::warn)).ifPresent($$0x -> this.ca = $$0x);
      }

      this.a($$0, this.dY());
   }

   @Nullable
   @Override
   public bvb b(euq $$0) {
      this.gu();
      return super.b($$0);
   }

   protected void gu() {
      this.a(null);
   }

   @Override
   public void a(btr $$0) {
      super.a($$0);
      this.gu();
   }

   protected void a(lq $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ae.k() * 0.02;
         double $$3 = this.ae.k() * 0.02;
         double $$4 = this.ae.k() * 0.02;
         this.dW().a($$0, this.d(1.0), this.dE() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean y() {
      return false;
   }

   @Override
   public bth t() {
      return this.cf;
   }

   @Override
   public bwp a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.cf.b() ? bwp.a(this.cf, $$1) : super.a_($$0);
   }

   protected abstract void gv();

   protected void a(dfx $$0, cpe.g[] $$1, int $$2) {
      ArrayList<cpe.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         dfw $$5 = $$3.remove(this.ae.a($$3.size())).a(this, this.ae);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public fbr u(float $$0) {
      float $$1 = azu.h($$0, this.aY, this.aX) * (float) (Math.PI / 180.0);
      fbr $$2 = new fbr(0.0, this.cR().c() - 1.0, 0.2);
      return this.o($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gw() {
      return this.dW().C;
   }

   @Override
   public boolean f(cpo $$0) {
      return this.go() == $$0 && this.bL() && $$0.b(this, 4.0);
   }
}
