import com.google.common.collect.Lists;
import java.util.ArrayList;
import javax.annotation.Nullable;

public abstract class cqf extends bvt implements cqi, cqj, dhs {
   private static final akj<Integer> bH = akn.a(cqf.class, akl.b);
   public static final int bF = 300;
   private static final int bI = 8;
   @Nullable
   private cqy bJ;
   @Nullable
   protected dhu bG;
   private final bui bK = new bui(8);

   public cqf(bwm<? extends cqf> $$0, div $$1) {
      super($$0, $$1);
      this.a(ewx.n, 16.0F);
      this.a(ewx.o, -1.0F);
   }

   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      if ($$3 == null) {
         $$3 = new bvt.a(false);
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
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bH, 0);
   }

   @Override
   public void a(@Nullable cqy $$0) {
      this.bJ = $$0;
   }

   @Nullable
   @Override
   public cqy x() {
      return this.bJ;
   }

   public boolean gq() {
      return this.bJ != null;
   }

   @Override
   public dhu gr() {
      if (this.dV().C) {
         throw new IllegalStateException("Cannot load Villager offers on the client");
      } else {
         if (this.bG == null) {
            this.bG = new dhu();
            this.gw();
         }

         return this.bG;
      }
   }

   @Override
   public void a(@Nullable dhu $$0) {
   }

   @Override
   public void s(int $$0) {
   }

   @Override
   public void a(dht $$0) {
      $$0.l();
      this.bw = -this.S();
      this.b($$0);
      if (this.bJ instanceof arr) {
         ap.t.a((arr)this.bJ, this, $$0.f());
      }
   }

   protected abstract void b(dht var1);

   @Override
   public boolean gs() {
      return true;
   }

   @Override
   public void j(cyy $$0) {
      if (!this.dV().C && this.bw > -this.S() + 20) {
         this.bw = -this.S();
         this.b(this.w(!$$0.f()));
      }
   }

   @Override
   public awm gt() {
      return awn.BZ;
   }

   protected awm w(boolean $$0) {
      return $$0 ? awn.BZ : awn.BX;
   }

   public void gu() {
      this.b(awn.BU);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      if (!this.dV().C) {
         dhu $$1 = this.gr();
         if (!$$1.isEmpty()) {
            $$0.a("Offers", dhu.a, this.dX().a(un.a), $$1);
         }
      }

      this.b($$0, this.dX());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.bG = $$0.<dhu>a("Offers", dhu.a, this.dX().a(un.a)).orElse(null);
      this.a($$0, this.dX());
   }

   @Nullable
   @Override
   public bwd b(exg $$0) {
      this.gv();
      return super.b($$0);
   }

   protected void gv() {
      this.a(null);
   }

   @Override
   public void a(bus $$0) {
      super.a($$0);
      this.gv();
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
   public bui n() {
      return this.bK;
   }

   @Override
   public bxt a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bK.b() ? bxt.a(this.bK, $$1) : super.a_($$0);
   }

   protected abstract void gw();

   protected void a(dhu $$0, cqo.g[] $$1, int $$2) {
      ArrayList<cqo.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         dht $$5 = $$3.remove(this.ae.a($$3.size())).a(this, this.ae);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public fei v(float $$0) {
      float $$1 = azm.h($$0, this.aW, this.aV) * (float) (Math.PI / 180.0);
      fei $$2 = new fei(0.0, this.cR().c() - 1.0, 0.2);
      return this.p($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gx() {
      return this.dV().C;
   }

   @Override
   public boolean e(cqy $$0) {
      return this.x() == $$0 && this.bK() && $$0.b(this, 4.0);
   }
}
