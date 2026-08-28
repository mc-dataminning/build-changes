import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class coy extends buq implements cpb, cpc, dfw {
   private static final ajx<Integer> bH = akb.a(coy.class, ajz.b);
   private static final Logger bI = LogUtils.getLogger();
   public static final int bF = 300;
   private static final int bJ = 8;
   @Nullable
   private cpr bK;
   @Nullable
   protected dfy bG;
   private final btf bL = new btf(8);

   public coy(bvi<? extends coy> $$0, dgz $$1) {
      super($$0, $$1);
      this.a(eun.n, 16.0F);
      this.a(eun.o, -1.0F);
   }

   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      if ($$3 == null) {
         $$3 = new buq.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public int q() {
      return this.al.a(bH);
   }

   public void r(int $$0) {
      this.al.a(bH, $$0);
   }

   @Override
   public int t() {
      return 0;
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bH, 0);
   }

   @Override
   public void a(@Nullable cpr $$0) {
      this.bK = $$0;
   }

   @Nullable
   @Override
   public cpr x() {
      return this.bK;
   }

   public boolean gs() {
      return this.bK != null;
   }

   @Override
   public dfy gt() {
      if (this.dU().C) {
         throw new IllegalStateException("Cannot load Villager offers on the client");
      } else {
         if (this.bG == null) {
            this.bG = new dfy();
            this.gy();
         }

         return this.bG;
      }
   }

   @Override
   public void a(@Nullable dfy $$0) {
   }

   @Override
   public void s(int $$0) {
   }

   @Override
   public void a(dfx $$0) {
      $$0.l();
      this.bw = -this.S();
      this.b($$0);
      if (this.bK instanceof are) {
         ap.t.a((are)this.bK, this, $$0.f());
      }
   }

   protected abstract void b(dfx var1);

   @Override
   public boolean gu() {
      return true;
   }

   @Override
   public void i(cxh $$0) {
      if (!this.dU().C && this.bw > -this.S() + 20) {
         this.bw = -this.S();
         this.b(this.w(!$$0.f()));
      }
   }

   @Override
   public avz gv() {
      return awa.BW;
   }

   protected avz w(boolean $$0) {
      return $$0 ? awa.BW : awa.BU;
   }

   public void gw() {
      this.b(awa.BR);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      if (!this.dU().C) {
         dfy $$1 = this.gt();
         if (!$$1.isEmpty()) {
            $$0.a("Offers", (un)dfy.a.encodeStart(this.dW().a(ue.a), $$1).getOrThrow());
         }
      }

      this.b($$0, this.dW());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.e("Offers")) {
         dfy.a.parse(this.dW().a(ue.a), $$0.c("Offers")).resultOrPartial(af.a("Failed to load offers: ", bI::warn)).ifPresent($$0x -> this.bG = $$0x);
      }

      this.a($$0, this.dW());
   }

   @Nullable
   @Override
   public bva b(euw $$0) {
      this.gx();
      return super.b($$0);
   }

   protected void gx() {
      this.a(null);
   }

   @Override
   public void a(btp $$0) {
      super.a($$0);
      this.gx();
   }

   protected void a(lr $$0) {
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
   public btf n() {
      return this.bL;
   }

   @Override
   public bwq a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bL.b() ? bwq.a(this.bL, $$1) : super.a_($$0);
   }

   protected abstract void gy();

   protected void a(dfy $$0, cph.g[] $$1, int $$2) {
      ArrayList<cph.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         dfx $$5 = $$3.remove(this.ae.a($$3.size())).a(this, this.ae);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public fbx v(float $$0) {
      float $$1 = ayz.h($$0, this.aW, this.aV) * (float) (Math.PI / 180.0);
      fbx $$2 = new fbx(0.0, this.cQ().c() - 1.0, 0.2);
      return this.p($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gz() {
      return this.dU().C;
   }

   @Override
   public boolean e(cpr $$0) {
      return this.x() == $$0 && this.bJ() && $$0.b(this, 4.0);
   }
}
