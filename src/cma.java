import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cma extends bsj implements cmd, cme, daq {
   private static final akg<Integer> ca = akk.a(cma.class, aki.b);
   private static final Logger cb = LogUtils.getLogger();
   public static final int bY = 300;
   private static final int cc = 8;
   @Nullable
   private cms cd;
   @Nullable
   protected das bZ;
   private final bqy ce = new bqy(8);

   public cma(bsv<? extends cma> $$0, dbt $$1) {
      super($$0, $$1);
      this.a(eoh.n, 16.0F);
      this.a(eoh.o, -1.0F);
   }

   @Override
   public bud a(dci $$0, bqn $$1, bto $$2, @Nullable bud $$3) {
      if ($$3 == null) {
         $$3 = new bsj.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public int s() {
      return this.ao.a(ca);
   }

   public void t(int $$0) {
      this.ao.a(ca, $$0);
   }

   @Override
   public int u() {
      return 0;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(ca, 0);
   }

   @Override
   public void f(@Nullable cms $$0) {
      this.cd = $$0;
   }

   @Nullable
   @Override
   public cms gq() {
      return this.cd;
   }

   public boolean gr() {
      return this.cd != null;
   }

   @Override
   public das gs() {
      if (this.bZ == null) {
         this.bZ = new das();
         this.gx();
      }

      return this.bZ;
   }

   @Override
   public void a(@Nullable das $$0) {
   }

   @Override
   public void u(int $$0) {
   }

   @Override
   public void a(dar $$0) {
      $$0.l();
      this.bM = -this.P();
      this.b($$0);
      if (this.cd instanceof arc) {
         am.t.a((arc)this.cd, this, $$0.f());
      }
   }

   protected abstract void b(dar var1);

   @Override
   public boolean gt() {
      return true;
   }

   @Override
   public void n(cuk $$0) {
      if (!this.dP().B && this.bM > -this.P() + 20) {
         this.bM = -this.P();
         this.b(this.w(!$$0.e()));
      }
   }

   @Override
   public avv gu() {
      return avw.AU;
   }

   protected avv w(boolean $$0) {
      return $$0 ? avw.AU : avw.AS;
   }

   public void gv() {
      this.b(avw.AP);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      das $$1 = this.gs();
      if (!$$1.isEmpty()) {
         $$0.a("Offers", (vo)das.a.encodeStart(this.dR().a(vf.a), $$1).getOrThrow());
      }

      this.b($$0, this.dR());
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      if ($$0.e("Offers")) {
         das.a.parse(this.dR().a(vf.a), $$0.c("Offers")).resultOrPartial(ac.a("Failed to load offers: ", cb::warn)).ifPresent($$0x -> this.bZ = $$0x);
      }

      this.a($$0, this.dR());
   }

   @Nullable
   @Override
   public bsp b(arb $$0) {
      this.gw();
      return super.b($$0);
   }

   protected void gw() {
      this.f(null);
   }

   @Override
   public void a(bri $$0) {
      super.a($$0);
      this.gw();
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
   public boolean a(cms $$0) {
      return false;
   }

   @Override
   public bqy y() {
      return this.ce;
   }

   @Override
   public buc a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.ce.b() ? buc.a(this.ce, $$1) : super.a_($$0);
   }

   protected abstract void gx();

   protected void a(das $$0, cmj.g[] $$1, int $$2) {
      ArrayList<cmj.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         dar $$5 = $$3.remove(this.ah.a($$3.size())).a(this, this.ah);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public evm q(float $$0) {
      float $$1 = ayu.i($$0, this.aZ, this.aY) * (float) (Math.PI / 180.0);
      evm $$2 = new evm(0.0, this.cK().c() - 1.0, 0.2);
      return this.l($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gy() {
      return this.dP().B;
   }
}
