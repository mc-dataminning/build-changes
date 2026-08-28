import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cmd extends bsk implements cmg, cmh, dbr {
   private static final ajv<Integer> cc = ajz.a(cmd.class, ajx.b);
   private static final Logger cd = LogUtils.getLogger();
   public static final int ca = 300;
   private static final int ce = 8;
   @Nullable
   private cmv cf;
   @Nullable
   protected dbt cb;
   private final bqz cg = new bqz(8);

   public cmd(bsw<? extends cmd> $$0, dcu $$1) {
      super($$0, $$1);
      this.a(epp.n, 16.0F);
      this.a(epp.o, -1.0F);
   }

   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      if ($$3 == null) {
         $$3 = new bsk.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public int s() {
      return this.ao.a(cc);
   }

   public void s(int $$0) {
      this.ao.a(cc, $$0);
   }

   @Override
   public int t() {
      return 0;
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(cc, 0);
   }

   @Override
   public void f(@Nullable cmv $$0) {
      this.cf = $$0;
   }

   @Nullable
   @Override
   public cmv gm() {
      return this.cf;
   }

   public boolean gn() {
      return this.cf != null;
   }

   @Override
   public dbt go() {
      if (this.dQ().B) {
         throw new IllegalStateException("Cannot load Villager offers on the client");
      } else {
         if (this.cb == null) {
            this.cb = new dbt();
            this.gt();
         }

         return this.cb;
      }
   }

   @Override
   public void a(@Nullable dbt $$0) {
   }

   @Override
   public void t(int $$0) {
   }

   @Override
   public void a(dbs $$0) {
      $$0.l();
      this.bO = -this.P();
      this.b($$0);
      if (this.cf instanceof aqu) {
         an.t.a((aqu)this.cf, this, $$0.f());
      }
   }

   protected abstract void b(dbs var1);

   @Override
   public boolean gp() {
      return true;
   }

   @Override
   public void n(cuo $$0) {
      if (!this.dQ().B && this.bO > -this.P() + 20) {
         this.bO = -this.P();
         this.b(this.w(!$$0.e()));
      }
   }

   @Override
   public avn gq() {
      return avo.AY;
   }

   protected avn w(boolean $$0) {
      return $$0 ? avo.AY : avo.AW;
   }

   public void gr() {
      this.b(avo.AT);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      if (!this.dQ().B) {
         dbt $$1 = this.go();
         if (!$$1.isEmpty()) {
            $$0.a("Offers", (ux)dbt.a.encodeStart(this.dS().a(uo.a), $$1).getOrThrow());
         }
      }

      this.b($$0, this.dS());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.e("Offers")) {
         dbt.a.parse(this.dS().a(uo.a), $$0.c("Offers")).resultOrPartial(ad.a("Failed to load offers: ", cd::warn)).ifPresent($$0x -> this.cb = $$0x);
      }

      this.a($$0, this.dS());
   }

   @Nullable
   @Override
   public bsq a(epw $$0) {
      this.gs();
      return super.a($$0);
   }

   protected void gs() {
      this.f(null);
   }

   @Override
   public void a(brj $$0) {
      super.a($$0);
      this.gs();
   }

   protected void a(lk $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ah.k() * 0.02;
         double $$3 = this.ah.k() * 0.02;
         double $$4 = this.ah.k() * 0.02;
         this.dQ().a($$0, this.d(1.0), this.dy() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(cmv $$0) {
      return false;
   }

   @Override
   public bqz x() {
      return this.cg;
   }

   @Override
   public bue a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.cg.b() ? bue.a(this.cg, $$1) : super.a_($$0);
   }

   protected abstract void gt();

   protected void a(dbt $$0, cmm.g[] $$1, int $$2) {
      ArrayList<cmm.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         dbs $$5 = $$3.remove(this.ah.a($$3.size())).a(this, this.ah);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public eww r(float $$0) {
      float $$1 = ayn.i($$0, this.aZ, this.aY) * (float) (Math.PI / 180.0);
      eww $$2 = new eww(0.0, this.cL().c() - 1.0, 0.2);
      return this.m($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gu() {
      return this.dQ().B;
   }
}
