import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cnt extends btv implements cnw, cnx, ddx {
   private static final akl<Integer> ca = akp.a(cnt.class, akn.b);
   private static final Logger cb = LogUtils.getLogger();
   public static final int bY = 300;
   private static final int cc = 8;
   @Nullable
   private com cd;
   @Nullable
   protected ddz bZ;
   private final bsk ce = new bsk(8);

   public cnt(bul<? extends cnt> $$0, dfb $$1) {
      super($$0, $$1);
      this.a(esb.n, 16.0F);
      this.a(esb.o, -1.0F);
   }

   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      if ($$3 == null) {
         $$3 = new btv.a(false);
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
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(ca, 0);
   }

   @Override
   public void a(@Nullable com $$0) {
      this.cd = $$0;
   }

   @Nullable
   @Override
   public com gu() {
      return this.cd;
   }

   public boolean gv() {
      return this.cd != null;
   }

   @Override
   public ddz gw() {
      if (this.dX().C) {
         throw new IllegalStateException("Cannot load Villager offers on the client");
      } else {
         if (this.bZ == null) {
            this.bZ = new ddz();
            this.gB();
         }

         return this.bZ;
      }
   }

   @Override
   public void a(@Nullable ddz $$0) {
   }

   @Override
   public void t(int $$0) {
   }

   @Override
   public void a(ddy $$0) {
      $$0.l();
      this.bM = -this.T();
      this.b($$0);
      if (this.cd instanceof aro) {
         ao.t.a((aro)this.cd, this, $$0.f());
      }
   }

   protected abstract void b(ddy var1);

   @Override
   public boolean gx() {
      return true;
   }

   @Override
   public void k(cwb $$0) {
      if (!this.dX().C && this.bM > -this.T() + 20) {
         this.bM = -this.T();
         this.b(this.x(!$$0.f()));
      }
   }

   @Override
   public awk gy() {
      return awl.Bc;
   }

   protected awk x(boolean $$0) {
      return $$0 ? awl.Bc : awl.Ba;
   }

   public void gz() {
      this.b(awl.AX);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      if (!this.dX().C) {
         ddz $$1 = this.gw();
         if (!$$1.isEmpty()) {
            $$0.a("Offers", (vh)ddz.a.encodeStart(this.dZ().a(uy.a), $$1).getOrThrow());
         }
      }

      this.b($$0, this.dZ());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.e("Offers")) {
         ddz.a.parse(this.dZ().a(uy.a), $$0.c("Offers")).resultOrPartial(ae.a("Failed to load offers: ", cb::warn)).ifPresent($$0x -> this.bZ = $$0x);
      }

      this.a($$0, this.dZ());
   }

   @Nullable
   @Override
   public bue b(esi $$0) {
      this.gA();
      return super.b($$0);
   }

   protected void gA() {
      this.a(null);
   }

   @Override
   public void a(bsu $$0) {
      super.a($$0);
      this.gA();
   }

   protected void a(lp $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.af.k() * 0.02;
         double $$3 = this.af.k() * 0.02;
         double $$4 = this.af.k() * 0.02;
         this.dX().a($$0, this.d(1.0), this.dF() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean A() {
      return false;
   }

   @Override
   public bsk y() {
      return this.ce;
   }

   @Override
   public bvs a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.ce.b() ? bvs.a(this.ce, $$1) : super.a_($$0);
   }

   protected abstract void gB();

   protected void a(ddz $$0, coc.g[] $$1, int $$2) {
      ArrayList<coc.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         ddy $$5 = $$3.remove(this.af.a($$3.size())).a(this, this.af);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public ezn u(float $$0) {
      float $$1 = azk.h($$0, this.aY, this.aX) * (float) (Math.PI / 180.0);
      ezn $$2 = new ezn(0.0, this.cS().c() - 1.0, 0.2);
      return this.o($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gC() {
      return this.dX().C;
   }
}
