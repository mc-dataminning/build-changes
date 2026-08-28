import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cnx extends btz implements coa, cob, deb {
   private static final ako<Integer> ca = aks.a(cnx.class, akq.b);
   private static final Logger cb = LogUtils.getLogger();
   public static final int bY = 300;
   private static final int cc = 8;
   @Nullable
   private cor cd;
   @Nullable
   protected ded bZ;
   private final bso ce = new bso(8);

   public cnx(bup<? extends cnx> $$0, dff $$1) {
      super($$0, $$1);
      this.a(esf.n, 16.0F);
      this.a(esf.o, -1.0F);
   }

   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      if ($$3 == null) {
         $$3 = new btz.a(false);
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
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(ca, 0);
   }

   @Override
   public void a(@Nullable cor $$0) {
      this.cd = $$0;
   }

   @Nullable
   @Override
   public cor gv() {
      return this.cd;
   }

   public boolean gw() {
      return this.cd != null;
   }

   @Override
   public ded gx() {
      if (this.dY().C) {
         throw new IllegalStateException("Cannot load Villager offers on the client");
      } else {
         if (this.bZ == null) {
            this.bZ = new ded();
            this.gC();
         }

         return this.bZ;
      }
   }

   @Override
   public void a(@Nullable ded $$0) {
   }

   @Override
   public void t(int $$0) {
   }

   @Override
   public void a(dec $$0) {
      $$0.l();
      this.bM = -this.T();
      this.b($$0);
      if (this.cd instanceof arr) {
         ao.t.a((arr)this.cd, this, $$0.f());
      }
   }

   protected abstract void b(dec var1);

   @Override
   public boolean gy() {
      return true;
   }

   @Override
   public void k(cwf $$0) {
      if (!this.dY().C && this.bM > -this.T() + 20) {
         this.bM = -this.T();
         this.b(this.x(!$$0.f()));
      }
   }

   @Override
   public awn gz() {
      return awo.Bc;
   }

   protected awn x(boolean $$0) {
      return $$0 ? awo.Bc : awo.Ba;
   }

   public void gA() {
      this.b(awo.AX);
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      if (!this.dY().C) {
         ded $$1 = this.gx();
         if (!$$1.isEmpty()) {
            $$0.a("Offers", (vk)ded.a.encodeStart(this.ea().a(vb.a), $$1).getOrThrow());
         }
      }

      this.b($$0, this.ea());
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      if ($$0.e("Offers")) {
         ded.a.parse(this.ea().a(vb.a), $$0.c("Offers")).resultOrPartial(ae.a("Failed to load offers: ", cb::warn)).ifPresent($$0x -> this.bZ = $$0x);
      }

      this.a($$0, this.ea());
   }

   @Nullable
   @Override
   public bui b(esm $$0) {
      this.gB();
      return super.b($$0);
   }

   protected void gB() {
      this.a(null);
   }

   @Override
   public void a(bsy $$0) {
      super.a($$0);
      this.gB();
   }

   protected void a(lq $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.af.k() * 0.02;
         double $$3 = this.af.k() * 0.02;
         double $$4 = this.af.k() * 0.02;
         this.dY().a($$0, this.d(1.0), this.dG() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean A() {
      return false;
   }

   @Override
   public bso y() {
      return this.ce;
   }

   @Override
   public bvw a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.ce.b() ? bvw.a(this.ce, $$1) : super.a_($$0);
   }

   protected abstract void gC();

   protected void a(ded $$0, cog.g[] $$1, int $$2) {
      ArrayList<cog.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         dec $$5 = $$3.remove(this.af.a($$3.size())).a(this, this.af);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public ezr u(float $$0) {
      float $$1 = azn.h($$0, this.aY, this.aX) * (float) (Math.PI / 180.0);
      ezr $$2 = new ezr(0.0, this.cT().c() - 1.0, 0.2);
      return this.o($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gD() {
      return this.dY().C;
   }
}
