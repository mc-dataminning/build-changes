import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cmf extends bsl implements cmi, cmj, dbt {
   private static final ajw<Integer> cc = aka.a(cmf.class, ajy.b);
   private static final Logger cd = LogUtils.getLogger();
   public static final int ca = 300;
   private static final int ce = 8;
   @Nullable
   private cmx cf;
   @Nullable
   protected dbv cb;
   private final bra cg = new bra(8);

   public cmf(bsx<? extends cmf> $$0, dcw $$1) {
      super($$0, $$1);
      this.a(ept.n, 16.0F);
      this.a(ept.o, -1.0F);
   }

   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      if ($$3 == null) {
         $$3 = new bsl.a(false);
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
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(cc, 0);
   }

   @Override
   public void a(@Nullable cmx $$0) {
      this.cf = $$0;
   }

   @Nullable
   @Override
   public cmx gl() {
      return this.cf;
   }

   public boolean gm() {
      return this.cf != null;
   }

   @Override
   public dbv gn() {
      if (this.dP().B) {
         throw new IllegalStateException("Cannot load Villager offers on the client");
      } else {
         if (this.cb == null) {
            this.cb = new dbv();
            this.gs();
         }

         return this.cb;
      }
   }

   @Override
   public void a(@Nullable dbv $$0) {
   }

   @Override
   public void t(int $$0) {
   }

   @Override
   public void a(dbu $$0) {
      $$0.l();
      this.bO = -this.R();
      this.b($$0);
      if (this.cf instanceof aqv) {
         an.t.a((aqv)this.cf, this, $$0.f());
      }
   }

   protected abstract void b(dbu var1);

   @Override
   public boolean go() {
      return true;
   }

   @Override
   public void n(cuq $$0) {
      if (!this.dP().B && this.bO > -this.R() + 20) {
         this.bO = -this.R();
         this.b(this.w(!$$0.e()));
      }
   }

   @Override
   public avo gp() {
      return avp.AY;
   }

   protected avo w(boolean $$0) {
      return $$0 ? avp.AY : avp.AW;
   }

   public void gq() {
      this.b(avp.AT);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      if (!this.dP().B) {
         dbv $$1 = this.gn();
         if (!$$1.isEmpty()) {
            $$0.a("Offers", (uy)dbv.a.encodeStart(this.dR().a(up.a), $$1).getOrThrow());
         }
      }

      this.b($$0, this.dR());
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      if ($$0.e("Offers")) {
         dbv.a.parse(this.dR().a(up.a), $$0.c("Offers")).resultOrPartial(ad.a("Failed to load offers: ", cd::warn)).ifPresent($$0x -> this.cb = $$0x);
      }

      this.a($$0, this.dR());
   }

   @Nullable
   @Override
   public bsr a(eqa $$0) {
      this.gr();
      return super.a($$0);
   }

   protected void gr() {
      this.a(null);
   }

   @Override
   public void a(brk $$0) {
      super.a($$0);
      this.gr();
   }

   protected void a(lk $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ah.k() * 0.02;
         double $$3 = this.ah.k() * 0.02;
         double $$4 = this.ah.k() * 0.02;
         this.dP().a($$0, this.d(1.0), this.dx() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean y() {
      return false;
   }

   @Override
   public bra x() {
      return this.cg;
   }

   @Override
   public bug a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.cg.b() ? bug.a(this.cg, $$1) : super.a_($$0);
   }

   protected abstract void gs();

   protected void a(dbv $$0, cmo.g[] $$1, int $$2) {
      ArrayList<cmo.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         dbu $$5 = $$3.remove(this.ah.a($$3.size())).a(this, this.ah);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public exa s(float $$0) {
      float $$1 = ayo.i($$0, this.aZ, this.aY) * (float) (Math.PI / 180.0);
      exa $$2 = new exa(0.0, this.cL().c() - 1.0, 0.2);
      return this.m($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gt() {
      return this.dP().B;
   }
}
