import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class coz extends buw implements cpc, cpd, dfw {
   private static final alc<Integer> cb = alg.a(coz.class, ale.b);
   private static final Logger cc = LogUtils.getLogger();
   public static final int bZ = 300;
   private static final int cd = 8;
   @Nullable
   private cps ce;
   @Nullable
   protected dfy ca;
   private final btl cf = new btl(8);

   public coz(bvm<? extends coz> $$0, dha $$1) {
      super($$0, $$1);
      this.a(eug.n, 16.0F);
      this.a(eug.o, -1.0F);
   }

   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      if ($$3 == null) {
         $$3 = new buw.a(false);
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
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(cb, 0);
   }

   @Override
   public void a(@Nullable cps $$0) {
      this.ce = $$0;
   }

   @Nullable
   @Override
   public cps gm() {
      return this.ce;
   }

   public boolean gn() {
      return this.ce != null;
   }

   @Override
   public dfy go() {
      if (this.dV().C) {
         throw new IllegalStateException("Cannot load Villager offers on the client");
      } else {
         if (this.ca == null) {
            this.ca = new dfy();
            this.gt();
         }

         return this.ca;
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
      this.bN = -this.Q();
      this.b($$0);
      if (this.ce instanceof asi) {
         ao.t.a((asi)this.ce, this, $$0.f());
      }
   }

   protected abstract void b(dfx var1);

   @Override
   public boolean gp() {
      return true;
   }

   @Override
   public void i(cxk $$0) {
      if (!this.dV().C && this.bN > -this.Q() + 20) {
         this.bN = -this.Q();
         this.b(this.x(!$$0.f()));
      }
   }

   @Override
   public axe gq() {
      return axf.Bw;
   }

   protected axe x(boolean $$0) {
      return $$0 ? axf.Bw : axf.Bu;
   }

   public void gr() {
      this.b(axf.Br);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      if (!this.dV().C) {
         dfy $$1 = this.go();
         if (!$$1.isEmpty()) {
            $$0.a("Offers", (vu)dfy.a.encodeStart(this.dX().a(vl.a), $$1).getOrThrow());
         }
      }

      this.b($$0, this.dX());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      if ($$0.e("Offers")) {
         dfy.a.parse(this.dX().a(vl.a), $$0.c("Offers")).resultOrPartial(ae.a("Failed to load offers: ", cc::warn)).ifPresent($$0x -> this.ca = $$0x);
      }

      this.a($$0, this.dX());
   }

   @Nullable
   @Override
   public bvf b(eup $$0) {
      this.gs();
      return super.b($$0);
   }

   protected void gs() {
      this.a(null);
   }

   @Override
   public void a(btv $$0) {
      super.a($$0);
      this.gs();
   }

   protected void a(lq $$0) {
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
   public btl t() {
      return this.cf;
   }

   @Override
   public bwt a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.cf.b() ? bwt.a(this.cf, $$1) : super.a_($$0);
   }

   protected abstract void gt();

   protected void a(dfy $$0, cpi.g[] $$1, int $$2) {
      ArrayList<cpi.g> $$3 = Lists.newArrayList($$1);
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
   public fbs u(float $$0) {
      float $$1 = bae.h($$0, this.aY, this.aX) * (float) (Math.PI / 180.0);
      fbs $$2 = new fbs(0.0, this.cR().c() - 1.0, 0.2);
      return this.o($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gu() {
      return this.dV().C;
   }
}
