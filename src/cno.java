import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cno extends btq implements cnr, cns, ddr {
   private static final akk<Integer> ca = ako.a(cno.class, akm.b);
   private static final Logger cb = LogUtils.getLogger();
   public static final int bY = 300;
   private static final int cc = 8;
   @Nullable
   private coh cd;
   @Nullable
   protected ddt bZ;
   private final bsf ce = new bsf(8);

   public cno(bug<? extends cno> $$0, dev $$1) {
      super($$0, $$1);
      this.a(erv.n, 16.0F);
      this.a(erv.o, -1.0F);
   }

   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      if ($$3 == null) {
         $$3 = new btq.a(false);
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
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(ca, 0);
   }

   @Override
   public void a(@Nullable coh $$0) {
      this.cd = $$0;
   }

   @Nullable
   @Override
   public coh gv() {
      return this.cd;
   }

   public boolean gw() {
      return this.cd != null;
   }

   @Override
   public ddt gx() {
      if (this.dX().C) {
         throw new IllegalStateException("Cannot load Villager offers on the client");
      } else {
         if (this.bZ == null) {
            this.bZ = new ddt();
            this.gC();
         }

         return this.bZ;
      }
   }

   @Override
   public void a(@Nullable ddt $$0) {
   }

   @Override
   public void t(int $$0) {
   }

   @Override
   public void a(dds $$0) {
      $$0.l();
      this.bM = -this.T();
      this.b($$0);
      if (this.cd instanceof arn) {
         an.t.a((arn)this.cd, this, $$0.f());
      }
   }

   protected abstract void b(dds var1);

   @Override
   public boolean gy() {
      return true;
   }

   @Override
   public void k(cvx $$0) {
      if (!this.dX().C && this.bM > -this.T() + 20) {
         this.bM = -this.T();
         this.b(this.x(!$$0.f()));
      }
   }

   @Override
   public awj gz() {
      return awk.Bc;
   }

   protected awj x(boolean $$0) {
      return $$0 ? awk.Bc : awk.Ba;
   }

   public void gA() {
      this.b(awk.AX);
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      if (!this.dX().C) {
         ddt $$1 = this.gx();
         if (!$$1.isEmpty()) {
            $$0.a("Offers", (vg)ddt.a.encodeStart(this.dZ().a(ux.a), $$1).getOrThrow());
         }
      }

      this.b($$0, this.dZ());
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      if ($$0.e("Offers")) {
         ddt.a.parse(this.dZ().a(ux.a), $$0.c("Offers")).resultOrPartial(ad.a("Failed to load offers: ", cb::warn)).ifPresent($$0x -> this.bZ = $$0x);
      }

      this.a($$0, this.dZ());
   }

   @Nullable
   @Override
   public btz b(esc $$0) {
      this.gB();
      return super.b($$0);
   }

   protected void gB() {
      this.a(null);
   }

   @Override
   public void a(bsp $$0) {
      super.a($$0);
      this.gB();
   }

   protected void a(lo $$0) {
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
   public bsf y() {
      return this.ce;
   }

   @Override
   public bvn a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.ce.b() ? bvn.a(this.ce, $$1) : super.a_($$0);
   }

   protected abstract void gC();

   protected void a(ddt $$0, cnx.g[] $$1, int $$2) {
      ArrayList<cnx.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         dds $$5 = $$3.remove(this.af.a($$3.size())).a(this, this.af);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public ezh u(float $$0) {
      float $$1 = azj.h($$0, this.aV, this.aU) * (float) (Math.PI / 180.0);
      ezh $$2 = new ezh(0.0, this.cS().c() - 1.0, 0.2);
      return this.o($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gD() {
      return this.dX().C;
   }
}
