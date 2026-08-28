import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cmx extends btc implements cna, cnb, dco {
   private static final akg<Integer> cb = akk.a(cmx.class, aki.b);
   private static final Logger cc = LogUtils.getLogger();
   public static final int bZ = 300;
   private static final int cd = 8;
   @Nullable
   private cnp ce;
   @Nullable
   protected dcq ca;
   private final brr cf = new brr(8);

   public cmx(btq<? extends cmx> $$0, dds $$1) {
      super($$0, $$1);
      this.a(eqs.n, 16.0F);
      this.a(eqs.o, -1.0F);
   }

   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      if ($$3 == null) {
         $$3 = new btc.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public int q() {
      return this.am.a(cb);
   }

   public void s(int $$0) {
      this.am.a(cb, $$0);
   }

   @Override
   public int t() {
      return 0;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cb, 0);
   }

   @Override
   public void a(@Nullable cnp $$0) {
      this.ce = $$0;
   }

   @Nullable
   @Override
   public cnp go() {
      return this.ce;
   }

   public boolean gp() {
      return this.ce != null;
   }

   @Override
   public dcq gq() {
      if (this.dS().B) {
         throw new IllegalStateException("Cannot load Villager offers on the client");
      } else {
         if (this.ca == null) {
            this.ca = new dcq();
            this.gv();
         }

         return this.ca;
      }
   }

   @Override
   public void a(@Nullable dcq $$0) {
   }

   @Override
   public void t(int $$0) {
   }

   @Override
   public void a(dcp $$0) {
      $$0.l();
      this.bN = -this.T();
      this.b($$0);
      if (this.ce instanceof arh) {
         an.t.a((arh)this.ce, this, $$0.f());
      }
   }

   protected abstract void b(dcp var1);

   @Override
   public boolean gr() {
      return true;
   }

   @Override
   public void o(cvl $$0) {
      if (!this.dS().B && this.bN > -this.T() + 20) {
         this.bN = -this.T();
         this.b(this.x(!$$0.f()));
      }
   }

   @Override
   public awc gs() {
      return awd.Be;
   }

   protected awc x(boolean $$0) {
      return $$0 ? awd.Be : awd.Bc;
   }

   public void gt() {
      this.b(awd.AZ);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      if (!this.dS().B) {
         dcq $$1 = this.gq();
         if (!$$1.isEmpty()) {
            $$0.a("Offers", (vc)dcq.a.encodeStart(this.dU().a(ut.a), $$1).getOrThrow());
         }
      }

      this.b($$0, this.dU());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.e("Offers")) {
         dcq.a.parse(this.dU().a(ut.a), $$0.c("Offers")).resultOrPartial(ad.a("Failed to load offers: ", cc::warn)).ifPresent($$0x -> this.ca = $$0x);
      }

      this.a($$0, this.dU());
   }

   @Nullable
   @Override
   public btj b(eqz $$0) {
      this.gu();
      return super.b($$0);
   }

   protected void gu() {
      this.a(null);
   }

   @Override
   public void a(bsb $$0) {
      super.a($$0);
      this.gu();
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
   public brr y() {
      return this.cf;
   }

   @Override
   public buw a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.cf.b() ? buw.a(this.cf, $$1) : super.a_($$0);
   }

   protected abstract void gv();

   protected void a(dcq $$0, cng.g[] $$1, int $$2) {
      ArrayList<cng.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         dcp $$5 = $$3.remove(this.af.a($$3.size())).a(this, this.af);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public eye u(float $$0) {
      float $$1 = azc.h($$0, this.aV, this.aU) * (float) (Math.PI / 180.0);
      eye $$2 = new eye(0.0, this.cO().c() - 1.0, 0.2);
      return this.o($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gw() {
      return this.dS().B;
   }
}
