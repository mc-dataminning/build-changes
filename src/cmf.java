import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cmf extends bso implements cmi, cmj, dav {
   private static final akk<Integer> ca = ako.a(cmf.class, akm.b);
   private static final Logger cb = LogUtils.getLogger();
   public static final int bY = 300;
   private static final int cc = 8;
   @Nullable
   private cmx cd;
   @Nullable
   protected dax bZ;
   private final brd ce = new brd(8);

   public cmf(bta<? extends cmf> $$0, dby $$1) {
      super($$0, $$1);
      this.a(eom.n, 16.0F);
      this.a(eom.o, -1.0F);
   }

   @Override
   public bui a(dcn $$0, bqs $$1, btt $$2, @Nullable bui $$3) {
      if ($$3 == null) {
         $$3 = new bso.a(false);
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
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(ca, 0);
   }

   @Override
   public void f(@Nullable cmx $$0) {
      this.cd = $$0;
   }

   @Nullable
   @Override
   public cmx gq() {
      return this.cd;
   }

   public boolean gr() {
      return this.cd != null;
   }

   @Override
   public dax gs() {
      if (this.bZ == null) {
         this.bZ = new dax();
         this.gx();
      }

      return this.bZ;
   }

   @Override
   public void a(@Nullable dax $$0) {
   }

   @Override
   public void u(int $$0) {
   }

   @Override
   public void a(daw $$0) {
      $$0.l();
      this.bM = -this.P();
      this.b($$0);
      if (this.cd instanceof arg) {
         am.t.a((arg)this.cd, this, $$0.f());
      }
   }

   protected abstract void b(daw var1);

   @Override
   public boolean gt() {
      return true;
   }

   @Override
   public void n(cup $$0) {
      if (!this.dP().B && this.bM > -this.P() + 20) {
         this.bM = -this.P();
         this.b(this.w(!$$0.e()));
      }
   }

   @Override
   public avz gu() {
      return awa.AU;
   }

   protected avz w(boolean $$0) {
      return $$0 ? awa.AU : awa.AS;
   }

   public void gv() {
      this.b(awa.AP);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      dax $$1 = this.gs();
      if (!$$1.isEmpty()) {
         $$0.a("Offers", (vp)dax.a.encodeStart(this.dR().a(vg.a), $$1).getOrThrow());
      }

      this.b($$0, this.dR());
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      if ($$0.e("Offers")) {
         dax.a.parse(this.dR().a(vg.a), $$0.c("Offers")).resultOrPartial(ac.a("Failed to load offers: ", cb::warn)).ifPresent($$0x -> this.bZ = $$0x);
      }

      this.a($$0, this.dR());
   }

   @Nullable
   @Override
   public bsu b(arf $$0) {
      this.gw();
      return super.b($$0);
   }

   protected void gw() {
      this.f(null);
   }

   @Override
   public void a(brn $$0) {
      super.a($$0);
      this.gw();
   }

   protected void a(lg $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ah.k() * 0.02;
         double $$3 = this.ah.k() * 0.02;
         double $$4 = this.ah.k() * 0.02;
         this.dP().a($$0, this.d(1.0), this.dx() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(cmx $$0) {
      return false;
   }

   @Override
   public brd y() {
      return this.ce;
   }

   @Override
   public buh a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.ce.b() ? buh.a(this.ce, $$1) : super.a_($$0);
   }

   protected abstract void gx();

   protected void a(dax $$0, cmo.g[] $$1, int $$2) {
      ArrayList<cmo.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         daw $$5 = $$3.remove(this.ah.a($$3.size())).a(this, this.ah);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public evr q(float $$0) {
      float $$1 = ayz.i($$0, this.aZ, this.aY) * (float) (Math.PI / 180.0);
      evr $$2 = new evr(0.0, this.cK().c() - 1.0, 0.2);
      return this.l($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gy() {
      return this.dP().B;
   }
}
