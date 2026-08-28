import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class clp extends brx implements cls, clt, dba {
   private static final ajp<Integer> cc = ajt.a(clp.class, ajr.b);
   private static final Logger cd = LogUtils.getLogger();
   public static final int ca = 300;
   private static final int ce = 8;
   @Nullable
   private cmh cf;
   @Nullable
   protected dbc cb;
   private final bqm cg = new bqm(8);

   public clp(bsj<? extends clp> $$0, dcd $$1) {
      super($$0, $$1);
      this.a(eos.n, 16.0F);
      this.a(eos.o, -1.0F);
   }

   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      if ($$3 == null) {
         $$3 = new brx.a(false);
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
   public void f(@Nullable cmh $$0) {
      this.cf = $$0;
   }

   @Nullable
   @Override
   public cmh gn() {
      return this.cf;
   }

   public boolean go() {
      return this.cf != null;
   }

   @Override
   public dbc gp() {
      if (this.cb == null) {
         this.cb = new dbc();
         this.gu();
      }

      return this.cb;
   }

   @Override
   public void a(@Nullable dbc $$0) {
   }

   @Override
   public void t(int $$0) {
   }

   @Override
   public void a(dbb $$0) {
      $$0.l();
      this.bO = -this.P();
      this.b($$0);
      if (this.cf instanceof aql) {
         am.t.a((aql)this.cf, this, $$0.f());
      }
   }

   protected abstract void b(dbb var1);

   @Override
   public boolean gq() {
      return true;
   }

   @Override
   public void n(cua $$0) {
      if (!this.dP().B && this.bO > -this.P() + 20) {
         this.bO = -this.P();
         this.b(this.w(!$$0.e()));
      }
   }

   @Override
   public ave gr() {
      return avf.AX;
   }

   protected ave w(boolean $$0) {
      return $$0 ? avf.AX : avf.AV;
   }

   public void gs() {
      this.b(avf.AS);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      dbc $$1 = this.gp();
      if (!$$1.isEmpty()) {
         $$0.a("Offers", (uu)dbc.a.encodeStart(this.dR().a(ul.a), $$1).getOrThrow());
      }

      this.b($$0, this.dR());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.e("Offers")) {
         dbc.a.parse(this.dR().a(ul.a), $$0.c("Offers")).resultOrPartial(ac.a("Failed to load offers: ", cd::warn)).ifPresent($$0x -> this.cb = $$0x);
      }

      this.a($$0, this.dR());
   }

   @Nullable
   @Override
   public bsd b(aqk $$0) {
      this.gt();
      return super.b($$0);
   }

   protected void gt() {
      this.f(null);
   }

   @Override
   public void a(bqw $$0) {
      super.a($$0);
      this.gt();
   }

   protected void a(lh $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ah.k() * 0.02;
         double $$3 = this.ah.k() * 0.02;
         double $$4 = this.ah.k() * 0.02;
         this.dP().a($$0, this.d(1.0), this.dx() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(cmh $$0) {
      return false;
   }

   @Override
   public bqm y() {
      return this.cg;
   }

   @Override
   public btq a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.cg.b() ? btq.a(this.cg, $$1) : super.a_($$0);
   }

   protected abstract void gu();

   protected void a(dbc $$0, cly.g[] $$1, int $$2) {
      ArrayList<cly.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         dbb $$5 = $$3.remove(this.ah.a($$3.size())).a(this, this.ah);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public evz r(float $$0) {
      float $$1 = aye.i($$0, this.aZ, this.aY) * (float) (Math.PI / 180.0);
      evz $$2 = new evz(0.0, this.cK().c() - 1.0, 0.2);
      return this.m($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gv() {
      return this.dP().B;
   }
}
