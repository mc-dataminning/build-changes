import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class coa extends buc implements cod, coe, dei {
   private static final akm<Integer> ca = akq.a(coa.class, ako.b);
   private static final Logger cb = LogUtils.getLogger();
   public static final int bY = 300;
   private static final int cc = 8;
   @Nullable
   private cou cd;
   @Nullable
   protected dek bZ;
   private final bsr ce = new bsr(8);

   public coa(bus<? extends coa> $$0, dfm $$1) {
      super($$0, $$1);
      this.a(esm.n, 16.0F);
      this.a(esm.o, -1.0F);
   }

   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      if ($$3 == null) {
         $$3 = new buc.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public int n() {
      return this.al.a(ca);
   }

   public void r(int $$0) {
      this.al.a(ca, $$0);
   }

   @Override
   public int q() {
      return 0;
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(ca, 0);
   }

   @Override
   public void a(@Nullable cou $$0) {
      this.cd = $$0;
   }

   @Nullable
   @Override
   public cou gm() {
      return this.cd;
   }

   public boolean gn() {
      return this.cd != null;
   }

   @Override
   public dek go() {
      if (this.dV().C) {
         throw new IllegalStateException("Cannot load Villager offers on the client");
      } else {
         if (this.bZ == null) {
            this.bZ = new dek();
            this.gt();
         }

         return this.bZ;
      }
   }

   @Override
   public void a(@Nullable dek $$0) {
   }

   @Override
   public void s(int $$0) {
   }

   @Override
   public void a(dej $$0) {
      $$0.l();
      this.bM = -this.Q();
      this.b($$0);
      if (this.cd instanceof arq) {
         ao.t.a((arq)this.cd, this, $$0.f());
      }
   }

   protected abstract void b(dej var1);

   @Override
   public boolean gp() {
      return true;
   }

   @Override
   public void i(cwm $$0) {
      if (!this.dV().C && this.bM > -this.Q() + 20) {
         this.bM = -this.Q();
         this.b(this.x(!$$0.f()));
      }
   }

   @Override
   public awm gq() {
      return awn.Bc;
   }

   protected awm x(boolean $$0) {
      return $$0 ? awn.Bc : awn.Ba;
   }

   public void gr() {
      this.b(awn.AX);
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      if (!this.dV().C) {
         dek $$1 = this.go();
         if (!$$1.isEmpty()) {
            $$0.a("Offers", (vi)dek.a.encodeStart(this.dX().a(uz.a), $$1).getOrThrow());
         }
      }

      this.b($$0, this.dX());
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      if ($$0.e("Offers")) {
         dek.a.parse(this.dX().a(uz.a), $$0.c("Offers")).resultOrPartial(ae.a("Failed to load offers: ", cb::warn)).ifPresent($$0x -> this.bZ = $$0x);
      }

      this.a($$0, this.dX());
   }

   @Nullable
   @Override
   public bul b(est $$0) {
      this.gs();
      return super.b($$0);
   }

   protected void gs() {
      this.a(null);
   }

   @Override
   public void a(btb $$0) {
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
   public bsr v() {
      return this.ce;
   }

   @Override
   public bvz a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.ce.b() ? bvz.a(this.ce, $$1) : super.a_($$0);
   }

   protected abstract void gt();

   protected void a(dek $$0, coj.g[] $$1, int $$2) {
      ArrayList<coj.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         dej $$5 = $$3.remove(this.ae.a($$3.size())).a(this, this.ae);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public ezy u(float $$0) {
      float $$1 = azm.h($$0, this.aX, this.aW) * (float) (Math.PI / 180.0);
      ezy $$2 = new ezy(0.0, this.cR().c() - 1.0, 0.2);
      return this.o($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gu() {
      return this.dV().C;
   }
}
