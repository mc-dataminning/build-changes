import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class coc extends bub implements cof, cog, dfd {
   private static final ajy<Integer> ca = akc.a(coc.class, aka.b);
   private static final Logger cb = LogUtils.getLogger();
   public static final int bY = 300;
   private static final int cc = 8;
   @Nullable
   private cow cd;
   @Nullable
   protected dff bZ;
   private final bsq ce = new bsq(8);

   public coc(bur<? extends coc> $$0, dgh $$1) {
      super($$0, $$1);
      this.a(etp.n, 16.0F);
      this.a(etp.o, -1.0F);
   }

   @Override
   public bvz a(dgy $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
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
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(ca, 0);
   }

   @Override
   public void a(@Nullable cow $$0) {
      this.cd = $$0;
   }

   @Nullable
   @Override
   public cow gs() {
      return this.cd;
   }

   public boolean gt() {
      return this.cd != null;
   }

   @Override
   public dff gu() {
      if (this.dV().C) {
         throw new IllegalStateException("Cannot load Villager offers on the client");
      } else {
         if (this.bZ == null) {
            this.bZ = new dff();
            this.gz();
         }

         return this.bZ;
      }
   }

   @Override
   public void a(@Nullable dff $$0) {
   }

   @Override
   public void s(int $$0) {
   }

   @Override
   public void a(dfe $$0) {
      $$0.l();
      this.bM = -this.T();
      this.b($$0);
      if (this.cd instanceof are) {
         ap.t.a((are)this.cd, this, $$0.f());
      }
   }

   protected abstract void b(dfe var1);

   @Override
   public boolean gv() {
      return true;
   }

   @Override
   public void i(cwo $$0) {
      if (!this.dV().C && this.bM > -this.T() + 20) {
         this.bM = -this.T();
         this.b(this.x(!$$0.f()));
      }
   }

   @Override
   public avz gw() {
      return awa.BM;
   }

   protected avz x(boolean $$0) {
      return $$0 ? awa.BM : awa.BK;
   }

   public void gx() {
      this.b(awa.BH);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      if (!this.dV().C) {
         dff $$1 = this.gu();
         if (!$$1.isEmpty()) {
            $$0.a("Offers", (un)dff.a.encodeStart(this.dX().a(ue.a), $$1).getOrThrow());
         }
      }

      this.b($$0, this.dX());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.e("Offers")) {
         dff.a.parse(this.dX().a(ue.a), $$0.c("Offers")).resultOrPartial(af.a("Failed to load offers: ", cb::warn)).ifPresent($$0x -> this.bZ = $$0x);
      }

      this.a($$0, this.dX());
   }

   @Nullable
   @Override
   public buk b(ety $$0) {
      this.gy();
      return super.b($$0);
   }

   protected void gy() {
      this.a(null);
   }

   @Override
   public void a(bta $$0) {
      super.a($$0);
      this.gy();
   }

   protected void a(lr $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ae.k() * 0.02;
         double $$3 = this.ae.k() * 0.02;
         double $$4 = this.ae.k() * 0.02;
         this.dV().a($$0, this.d(1.0), this.dD() + 1.0, this.g(1.0), $$2, $$3, $$4);
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

   protected abstract void gz();

   protected void a(dff $$0, col.g[] $$1, int $$2) {
      ArrayList<col.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         dfe $$5 = $$3.remove(this.ae.a($$3.size())).a(this, this.ae);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public faz u(float $$0) {
      float $$1 = ayz.h($$0, this.aY, this.aX) * (float) (Math.PI / 180.0);
      faz $$2 = new faz(0.0, this.cR().c() - 1.0, 0.2);
      return this.o($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gA() {
      return this.dV().C;
   }

   @Override
   public boolean f(cow $$0) {
      return this.gs() == $$0 && this.bL() && $$0.b(this, 4.0);
   }
}
