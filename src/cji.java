import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cji extends bpu implements cjl, cjm, cyd {
   private static final aja<Integer> bZ = aje.a(cji.class, ajc.b);
   private static final Logger ca = LogUtils.getLogger();
   public static final int bX = 300;
   private static final int cb = 8;
   @Nullable
   private cka cc;
   @Nullable
   protected cyf bY;
   private final boo cd = new boo(8);

   public cji(bqg<? extends cji> $$0, czg $$1) {
      super($$0, $$1);
      this.a(els.n, 16.0F);
      this.a(els.o, -1.0F);
   }

   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      if ($$3 == null) {
         $$3 = new bpu.a(false);
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
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(bZ, 0);
   }

   @Override
   public void f(@Nullable cka $$0) {
      this.cc = $$0;
   }

   @Nullable
   @Override
   public cka gn() {
      return this.cc;
   }

   public boolean go() {
      return this.cc != null;
   }

   @Override
   public cyf gp() {
      if (this.bY == null) {
         this.bY = new cyf();
         this.gu();
      }

      return this.bY;
   }

   @Override
   public void a(@Nullable cyf $$0) {
   }

   @Override
   public void u(int $$0) {
   }

   @Override
   public void a(cye $$0) {
      $$0.l();
      this.bL = -this.O();
      this.b($$0);
      if (this.cc instanceof apv) {
         am.t.a((apv)this.cc, this, $$0.f());
      }
   }

   protected abstract void b(cye var1);

   @Override
   public boolean gq() {
      return true;
   }

   @Override
   public void n(crs $$0) {
      if (!this.dM().B && this.bL > -this.O() + 20) {
         this.bL = -this.O();
         this.b(this.w(!$$0.d()));
      }
   }

   @Override
   public aun gr() {
      return auo.AB;
   }

   protected aun w(boolean $$0) {
      return $$0 ? auo.AB : auo.Az;
   }

   public void gs() {
      this.b(auo.Aw);
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      cyf $$1 = this.gp();
      if (!$$1.isEmpty()) {
         $$0.a("Offers", ac.a(cyf.a.encodeStart(this.dO().a(uc.a), $$1), IllegalStateException::new));
      }

      this.b($$0, this.dO());
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      if ($$0.e("Offers")) {
         cyf.a.parse(this.dO().a(uc.a), $$0.c("Offers")).resultOrPartial(ac.a("Failed to load offers: ", ca::warn)).ifPresent($$0x -> this.bY = $$0x);
      }

      this.a($$0, this.dO());
   }

   @Nullable
   @Override
   public bqa b(apu $$0) {
      this.gt();
      return super.b($$0);
   }

   protected void gt() {
      this.f(null);
   }

   @Override
   public void a(boy $$0) {
      super.a($$0);
      this.gt();
   }

   protected void a(kl $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ag.k() * 0.02;
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         this.dM().a($$0, this.d(1.0), this.du() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(cka $$0) {
      return false;
   }

   @Override
   public boo y() {
      return this.cd;
   }

   @Override
   public brk a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.cd.b() ? brk.a(this.cd, $$1) : super.a_($$0);
   }

   protected abstract void gu();

   protected void a(cyf $$0, cjr.g[] $$1, int $$2) {
      ArrayList<cjr.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         cye $$5 = $$3.remove(this.ag.a($$3.size())).a(this, this.ag);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public esj q(float $$0) {
      float $$1 = axm.i($$0, this.aY, this.aX) * (float) (Math.PI / 180.0);
      esj $$2 = new esj(0.0, this.cH().c() - 1.0, 0.2);
      return this.l($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gv() {
      return this.dM().B;
   }
}
