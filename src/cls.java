import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cls extends bsa implements clv, clw, dbc {
   private static final ajp<Integer> cc = ajt.a(cls.class, ajr.b);
   private static final Logger cd = LogUtils.getLogger();
   public static final int ca = 300;
   private static final int ce = 8;
   @Nullable
   private cmk cf;
   @Nullable
   protected dbe cb;
   private final bqp cg = new bqp(8);

   public cls(bsm<? extends cls> $$0, dcf $$1) {
      super($$0, $$1);
      this.a(eoy.n, 16.0F);
      this.a(eoy.o, -1.0F);
   }

   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      if ($$3 == null) {
         $$3 = new bsa.a(false);
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
   public int u() {
      return 0;
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cc, 0);
   }

   @Override
   public void f(@Nullable cmk $$0) {
      this.cf = $$0;
   }

   @Nullable
   @Override
   public cmk go() {
      return this.cf;
   }

   public boolean gp() {
      return this.cf != null;
   }

   @Override
   public dbe gq() {
      if (this.dQ().B) {
         throw new IllegalStateException("Cannot load Villager offers on the client");
      } else {
         if (this.cb == null) {
            this.cb = new dbe();
            this.gv();
         }

         return this.cb;
      }
   }

   @Override
   public void a(@Nullable dbe $$0) {
   }

   @Override
   public void t(int $$0) {
   }

   @Override
   public void a(dbd $$0) {
      $$0.l();
      this.bO = -this.P();
      this.b($$0);
      if (this.cf instanceof aqn) {
         am.t.a((aqn)this.cf, this, $$0.f());
      }
   }

   protected abstract void b(dbd var1);

   @Override
   public boolean gr() {
      return true;
   }

   @Override
   public void n(cuc $$0) {
      if (!this.dQ().B && this.bO > -this.P() + 20) {
         this.bO = -this.P();
         this.b(this.w(!$$0.e()));
      }
   }

   @Override
   public avg gs() {
      return avh.AX;
   }

   protected avg w(boolean $$0) {
      return $$0 ? avh.AX : avh.AV;
   }

   public void gt() {
      this.b(avh.AS);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      dbe $$1 = this.gq();
      if (!$$1.isEmpty()) {
         $$0.a("Offers", (uu)dbe.a.encodeStart(this.dS().a(ul.a), $$1).getOrThrow());
      }

      this.b($$0, this.dS());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.e("Offers")) {
         dbe.a.parse(this.dS().a(ul.a), $$0.c("Offers")).resultOrPartial(ac.a("Failed to load offers: ", cd::warn)).ifPresent($$0x -> this.cb = $$0x);
      }

      this.a($$0, this.dS());
   }

   @Nullable
   @Override
   public bsg b(aqm $$0) {
      this.gu();
      return super.b($$0);
   }

   protected void gu() {
      this.f(null);
   }

   @Override
   public void a(bqz $$0) {
      super.a($$0);
      this.gu();
   }

   protected void a(lh $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ah.k() * 0.02;
         double $$3 = this.ah.k() * 0.02;
         double $$4 = this.ah.k() * 0.02;
         this.dQ().a($$0, this.d(1.0), this.dy() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(cmk $$0) {
      return false;
   }

   @Override
   public bqp y() {
      return this.cg;
   }

   @Override
   public btt a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.cg.b() ? btt.a(this.cg, $$1) : super.a_($$0);
   }

   protected abstract void gv();

   protected void a(dbe $$0, cmb.g[] $$1, int $$2) {
      ArrayList<cmb.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         dbd $$5 = $$3.remove(this.ah.a($$3.size())).a(this, this.ah);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public ewf r(float $$0) {
      float $$1 = ayg.i($$0, this.aZ, this.aY) * (float) (Math.PI / 180.0);
      ewf $$2 = new ewf(0.0, this.cL().c() - 1.0, 0.2);
      return this.m($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gw() {
      return this.dQ().B;
   }
}
