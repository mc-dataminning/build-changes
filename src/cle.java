import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cle extends bro implements clh, cli, czu {
   private static final ajr<Integer> ca = ajv.a(cle.class, ajt.b);
   private static final Logger cb = LogUtils.getLogger();
   public static final int bY = 300;
   private static final int cc = 8;
   @Nullable
   private clw cd;
   @Nullable
   protected czw bZ;
   private final bqd ce = new bqd(8);

   public cle(bsa<? extends cle> $$0, dax $$1) {
      super($$0, $$1);
      this.a(enl.n, 16.0F);
      this.a(enl.o, -1.0F);
   }

   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      if ($$3 == null) {
         $$3 = new bro.a(false);
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
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(ca, 0);
   }

   @Override
   public void f(@Nullable clw $$0) {
      this.cd = $$0;
   }

   @Nullable
   @Override
   public clw gp() {
      return this.cd;
   }

   public boolean gq() {
      return this.cd != null;
   }

   @Override
   public czw gr() {
      if (this.bZ == null) {
         this.bZ = new czw();
         this.gw();
      }

      return this.bZ;
   }

   @Override
   public void a(@Nullable czw $$0) {
   }

   @Override
   public void u(int $$0) {
   }

   @Override
   public void a(czv $$0) {
      $$0.l();
      this.bM = -this.O();
      this.b($$0);
      if (this.cd instanceof aqn) {
         am.t.a((aqn)this.cd, this, $$0.f());
      }
   }

   protected abstract void b(czv var1);

   @Override
   public boolean gs() {
      return true;
   }

   @Override
   public void n(cto $$0) {
      if (!this.dP().B && this.bM > -this.O() + 20) {
         this.bM = -this.O();
         this.b(this.w(!$$0.e()));
      }
   }

   @Override
   public avg gt() {
      return avh.AU;
   }

   protected avg w(boolean $$0) {
      return $$0 ? avh.AU : avh.AS;
   }

   public void gu() {
      this.b(avh.AP);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      czw $$1 = this.gr();
      if (!$$1.isEmpty()) {
         $$0.a("Offers", (va)czw.a.encodeStart(this.dR().a(ur.a), $$1).getOrThrow());
      }

      this.b($$0, this.dR());
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      if ($$0.e("Offers")) {
         czw.a.parse(this.dR().a(ur.a), $$0.c("Offers")).resultOrPartial(ac.a("Failed to load offers: ", cb::warn)).ifPresent($$0x -> this.bZ = $$0x);
      }

      this.a($$0, this.dR());
   }

   @Nullable
   @Override
   public bru b(aqm $$0) {
      this.gv();
      return super.b($$0);
   }

   protected void gv() {
      this.f(null);
   }

   @Override
   public void a(bqn $$0) {
      super.a($$0);
      this.gv();
   }

   protected void a(kw $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ah.k() * 0.02;
         double $$3 = this.ah.k() * 0.02;
         double $$4 = this.ah.k() * 0.02;
         this.dP().a($$0, this.d(1.0), this.dx() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(clw $$0) {
      return false;
   }

   @Override
   public bqd y() {
      return this.ce;
   }

   @Override
   public btg a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.ce.b() ? btg.a(this.ce, $$1) : super.a_($$0);
   }

   protected abstract void gw();

   protected void a(czw $$0, cln.g[] $$1, int $$2) {
      ArrayList<cln.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         czv $$5 = $$3.remove(this.ah.a($$3.size())).a(this, this.ah);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public euk q(float $$0) {
      float $$1 = ayd.i($$0, this.ba, this.aZ) * (float) (Math.PI / 180.0);
      euk $$2 = new euk(0.0, this.cK().c() - 1.0, 0.2);
      return this.l($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gx() {
      return this.dP().B;
   }
}
