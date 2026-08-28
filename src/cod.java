import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cod extends bub implements cog, coh, dfe {
   private static final ajx<Integer> ca = akb.a(cod.class, ajz.b);
   private static final Logger cb = LogUtils.getLogger();
   public static final int bY = 300;
   private static final int cc = 8;
   @Nullable
   private cox cd;
   @Nullable
   protected dfg bZ;
   private final bsq ce = new bsq(8);

   public cod(bur<? extends cod> $$0, dgi $$1) {
      super($$0, $$1);
      this.a(etq.n, 16.0F);
      this.a(etq.o, -1.0F);
   }

   @Override
   public bvz a(dgz $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      if ($$3 == null) {
         $$3 = new bub.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public int p() {
      return this.al.a(ca);
   }

   public void r(int $$0) {
      this.al.a(ca, $$0);
   }

   @Override
   public int x() {
      return 0;
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(ca, 0);
   }

   @Override
   public void a(@Nullable cox $$0) {
      this.cd = $$0;
   }

   @Nullable
   @Override
   public cox gp() {
      return this.cd;
   }

   public boolean gq() {
      return this.cd != null;
   }

   @Override
   public dfg gr() {
      if (this.dW().C) {
         throw new IllegalStateException("Cannot load Villager offers on the client");
      } else {
         if (this.bZ == null) {
            this.bZ = new dfg();
            this.gw();
         }

         return this.bZ;
      }
   }

   @Override
   public void a(@Nullable dfg $$0) {
   }

   @Override
   public void s(int $$0) {
   }

   @Override
   public void a(dff $$0) {
      $$0.l();
      this.bM = -this.Q();
      this.b($$0);
      if (this.cd instanceof ard) {
         ap.t.a((ard)this.cd, this, $$0.f());
      }
   }

   protected abstract void b(dff var1);

   @Override
   public boolean gs() {
      return true;
   }

   @Override
   public void i(cwp $$0) {
      if (!this.dW().C && this.bM > -this.Q() + 20) {
         this.bM = -this.Q();
         this.b(this.x(!$$0.f()));
      }
   }

   @Override
   public avz gt() {
      return awa.BN;
   }

   protected avz x(boolean $$0) {
      return $$0 ? awa.BN : awa.BL;
   }

   public void gu() {
      this.b(awa.BI);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      if (!this.dW().C) {
         dfg $$1 = this.gr();
         if (!$$1.isEmpty()) {
            $$0.a("Offers", (un)dfg.a.encodeStart(this.dY().a(ue.a), $$1).getOrThrow());
         }
      }

      this.b($$0, this.dY());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.e("Offers")) {
         dfg.a.parse(this.dY().a(ue.a), $$0.c("Offers")).resultOrPartial(af.a("Failed to load offers: ", cb::warn)).ifPresent($$0x -> this.bZ = $$0x);
      }

      this.a($$0, this.dY());
   }

   @Nullable
   @Override
   public buk b(etz $$0) {
      this.gv();
      return super.b($$0);
   }

   protected void gv() {
      this.a(null);
   }

   @Override
   public void a(bta $$0) {
      super.a($$0);
      this.gv();
   }

   protected void a(lr $$0) {
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
   public bsq t() {
      return this.ce;
   }

   @Override
   public bvy a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.ce.b() ? bvy.a(this.ce, $$1) : super.a_($$0);
   }

   protected abstract void gw();

   protected void a(dfg $$0, com.g[] $$1, int $$2) {
      ArrayList<com.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         dff $$5 = $$3.remove(this.ae.a($$3.size())).a(this, this.ae);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public fba u(float $$0) {
      float $$1 = ayz.h($$0, this.aY, this.aX) * (float) (Math.PI / 180.0);
      fba $$2 = new fba(0.0, this.cR().c() - 1.0, 0.2);
      return this.o($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gx() {
      return this.dW().C;
   }

   @Override
   public boolean f(cox $$0) {
      return this.gp() == $$0 && this.bL() && $$0.b(this, 4.0);
   }
}
