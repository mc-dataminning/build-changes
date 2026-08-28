import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cpd extends bva implements cpg, cph, dgd {
   private static final alc<Integer> cb = alg.a(cpd.class, ale.b);
   private static final Logger cc = LogUtils.getLogger();
   public static final int bZ = 300;
   private static final int cd = 8;
   @Nullable
   private cpw ce;
   @Nullable
   protected dgf ca;
   private final btp cf = new btp(8);

   public cpd(bvq<? extends cpd> $$0, dhh $$1) {
      super($$0, $$1);
      this.a(eun.n, 16.0F);
      this.a(eun.o, -1.0F);
   }

   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      if ($$3 == null) {
         $$3 = new bva.a(false);
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
   public void a(@Nullable cpw $$0) {
      this.ce = $$0;
   }

   @Nullable
   @Override
   public cpw go() {
      return this.ce;
   }

   public boolean gp() {
      return this.ce != null;
   }

   @Override
   public dgf gq() {
      if (this.dW().C) {
         throw new IllegalStateException("Cannot load Villager offers on the client");
      } else {
         if (this.ca == null) {
            this.ca = new dgf();
            this.gv();
         }

         return this.ca;
      }
   }

   @Override
   public void a(@Nullable dgf $$0) {
   }

   @Override
   public void s(int $$0) {
   }

   @Override
   public void a(dge $$0) {
      $$0.l();
      this.bN = -this.Q();
      this.b($$0);
      if (this.ce instanceof asi) {
         ao.t.a((asi)this.ce, this, $$0.f());
      }
   }

   protected abstract void b(dge var1);

   @Override
   public boolean gr() {
      return true;
   }

   @Override
   public void i(cxo $$0) {
      if (!this.dW().C && this.bN > -this.Q() + 20) {
         this.bN = -this.Q();
         this.b(this.x(!$$0.f()));
      }
   }

   @Override
   public axe gs() {
      return axf.Bx;
   }

   protected axe x(boolean $$0) {
      return $$0 ? axf.Bx : axf.Bv;
   }

   public void gt() {
      this.b(axf.Bs);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      if (!this.dW().C) {
         dgf $$1 = this.gq();
         if (!$$1.isEmpty()) {
            $$0.a("Offers", (vu)dgf.a.encodeStart(this.dY().a(vl.a), $$1).getOrThrow());
         }
      }

      this.b($$0, this.dY());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      if ($$0.e("Offers")) {
         dgf.a.parse(this.dY().a(vl.a), $$0.c("Offers")).resultOrPartial(ae.a("Failed to load offers: ", cc::warn)).ifPresent($$0x -> this.ca = $$0x);
      }

      this.a($$0, this.dY());
   }

   @Nullable
   @Override
   public bvj b(euw $$0) {
      this.gu();
      return super.b($$0);
   }

   protected void gu() {
      this.a(null);
   }

   @Override
   public void a(btz $$0) {
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
   public btp t() {
      return this.cf;
   }

   @Override
   public bwx a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.cf.b() ? bwx.a(this.cf, $$1) : super.a_($$0);
   }

   protected abstract void gv();

   protected void a(dgf $$0, cpm.g[] $$1, int $$2) {
      ArrayList<cpm.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         dge $$5 = $$3.remove(this.ae.a($$3.size())).a(this, this.ae);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public fbx u(float $$0) {
      float $$1 = bae.h($$0, this.aY, this.aX) * (float) (Math.PI / 180.0);
      fbx $$2 = new fbx(0.0, this.cR().c() - 1.0, 0.2);
      return this.o($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gw() {
      return this.dW().C;
   }
}
