import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cjb extends bpp implements cje, cjf, cxu {
   private static final aiy<Integer> bZ = ajc.a(cjb.class, aja.b);
   private static final Logger ca = LogUtils.getLogger();
   public static final int bX = 300;
   private static final int cb = 8;
   @Nullable
   private cjt cc;
   @Nullable
   protected cxw bY;
   private final boj cd = new boj(8);

   public cjb(bqb<? extends cjb> $$0, cyx $$1) {
      super($$0, $$1);
      this.a(elj.n, 16.0F);
      this.a(elj.o, -1.0F);
   }

   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      if ($$3 == null) {
         $$3 = new bpp.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public int r() {
      return this.an.a(bZ);
   }

   public void t(int $$0) {
      this.an.a(bZ, $$0);
   }

   @Override
   public int u() {
      return 0;
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(bZ, 0);
   }

   @Override
   public void f(@Nullable cjt $$0) {
      this.cc = $$0;
   }

   @Nullable
   @Override
   public cjt gn() {
      return this.cc;
   }

   public boolean go() {
      return this.cc != null;
   }

   @Override
   public cxw gp() {
      if (this.bY == null) {
         this.bY = new cxw();
         this.gu();
      }

      return this.bY;
   }

   @Override
   public void a(@Nullable cxw $$0) {
   }

   @Override
   public void u(int $$0) {
   }

   @Override
   public void a(cxv $$0) {
      $$0.l();
      this.bL = -this.O();
      this.b($$0);
      if (this.cc instanceof apt) {
         am.t.a((apt)this.cc, this, $$0.f());
      }
   }

   protected abstract void b(cxv var1);

   @Override
   public boolean gq() {
      return true;
   }

   @Override
   public void n(crj $$0) {
      if (!this.dM().B && this.bL > -this.O() + 20) {
         this.bL = -this.O();
         this.b(this.w(!$$0.d()));
      }
   }

   @Override
   public aul gr() {
      return aum.AB;
   }

   protected aul w(boolean $$0) {
      return $$0 ? aum.AB : aum.Az;
   }

   public void gs() {
      this.b(aum.Aw);
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      cxw $$1 = this.gp();
      if (!$$1.isEmpty()) {
         $$0.a("Offers", ac.a(cxw.a.encodeStart(this.dO().a(ua.a), $$1), IllegalStateException::new));
      }

      this.b($$0, this.dO());
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      if ($$0.e("Offers")) {
         cxw.a.parse(this.dO().a(ua.a), $$0.c("Offers")).resultOrPartial(ac.a("Failed to load offers: ", ca::warn)).ifPresent($$0x -> this.bY = $$0x);
      }

      this.a($$0, this.dO());
   }

   @Nullable
   @Override
   public bpv b(aps $$0) {
      this.gt();
      return super.b($$0);
   }

   protected void gt() {
      this.f(null);
   }

   @Override
   public void a(bot $$0) {
      super.a($$0);
      this.gt();
   }

   protected void a(kj $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ag.k() * 0.02;
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         this.dM().a($$0, this.d(1.0), this.du() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(cjt $$0) {
      return false;
   }

   @Override
   public boj y() {
      return this.cd;
   }

   @Override
   public brf a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.cd.b() ? brf.a(this.cd, $$1) : super.a_($$0);
   }

   protected abstract void gu();

   protected void a(cxw $$0, cjk.g[] $$1, int $$2) {
      ArrayList<cjk.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         cxv $$5 = $$3.remove(this.ag.a($$3.size())).a(this, this.ag);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public esa q(float $$0) {
      float $$1 = axk.i($$0, this.aY, this.aX) * (float) (Math.PI / 180.0);
      esa $$2 = new esa(0.0, this.cH().c() - 1.0, 0.2);
      return this.l($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gv() {
      return this.dM().B;
   }
}
