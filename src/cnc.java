import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cnc extends bth implements cnf, cng, ddc {
   private static final akg<Integer> ca = akk.a(cnc.class, aki.b);
   private static final Logger cb = LogUtils.getLogger();
   public static final int bY = 300;
   private static final int cc = 8;
   @Nullable
   private cnu cd;
   @Nullable
   protected dde bZ;
   private final brw ce = new brw(8);

   public cnc(btv<? extends cnc> $$0, deg $$1) {
      super($$0, $$1);
      this.a(erg.n, 16.0F);
      this.a(erg.o, -1.0F);
   }

   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      if ($$3 == null) {
         $$3 = new bth.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public int q() {
      return this.am.a(ca);
   }

   public void s(int $$0) {
      this.am.a(ca, $$0);
   }

   @Override
   public int t() {
      return 0;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(ca, 0);
   }

   @Override
   public void a(@Nullable cnu $$0) {
      this.cd = $$0;
   }

   @Nullable
   @Override
   public cnu gp() {
      return this.cd;
   }

   public boolean gq() {
      return this.cd != null;
   }

   @Override
   public dde gr() {
      if (this.dS().B) {
         throw new IllegalStateException("Cannot load Villager offers on the client");
      } else {
         if (this.bZ == null) {
            this.bZ = new dde();
            this.gw();
         }

         return this.bZ;
      }
   }

   @Override
   public void a(@Nullable dde $$0) {
   }

   @Override
   public void t(int $$0) {
   }

   @Override
   public void a(ddd $$0) {
      $$0.l();
      this.bM = -this.T();
      this.b($$0);
      if (this.cd instanceof ari) {
         an.t.a((ari)this.cd, this, $$0.f());
      }
   }

   protected abstract void b(ddd var1);

   @Override
   public boolean gs() {
      return true;
   }

   @Override
   public void m(cvp $$0) {
      if (!this.dS().B && this.bM > -this.T() + 20) {
         this.bM = -this.T();
         this.b(this.x(!$$0.f()));
      }
   }

   @Override
   public awd gt() {
      return awe.Be;
   }

   protected awd x(boolean $$0) {
      return $$0 ? awe.Be : awe.Bc;
   }

   public void gu() {
      this.b(awe.AZ);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      if (!this.dS().B) {
         dde $$1 = this.gr();
         if (!$$1.isEmpty()) {
            $$0.a("Offers", (vc)dde.a.encodeStart(this.dU().a(ut.a), $$1).getOrThrow());
         }
      }

      this.b($$0, this.dU());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.e("Offers")) {
         dde.a.parse(this.dU().a(ut.a), $$0.c("Offers")).resultOrPartial(ad.a("Failed to load offers: ", cb::warn)).ifPresent($$0x -> this.bZ = $$0x);
      }

      this.a($$0, this.dU());
   }

   @Nullable
   @Override
   public bto b(ern $$0) {
      this.gv();
      return super.b($$0);
   }

   protected void gv() {
      this.a(null);
   }

   @Override
   public void a(bsg $$0) {
      super.a($$0);
      this.gv();
   }

   protected void a(ll $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.af.k() * 0.02;
         double $$3 = this.af.k() * 0.02;
         double $$4 = this.af.k() * 0.02;
         this.dS().a($$0, this.d(1.0), this.dA() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean A() {
      return false;
   }

   @Override
   public brw y() {
      return this.ce;
   }

   @Override
   public bvb a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.ce.b() ? bvb.a(this.ce, $$1) : super.a_($$0);
   }

   protected abstract void gw();

   protected void a(dde $$0, cnl.g[] $$1, int $$2) {
      ArrayList<cnl.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         ddd $$5 = $$3.remove(this.af.a($$3.size())).a(this, this.af);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public eys u(float $$0) {
      float $$1 = azd.h($$0, this.aU, this.aT) * (float) (Math.PI / 180.0);
      eys $$2 = new eys(0.0, this.cO().c() - 1.0, 0.2);
      return this.o($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gx() {
      return this.dS().B;
   }
}
