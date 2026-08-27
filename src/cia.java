import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cia extends bor implements cid, cie, cvw {
   private static final aim<Integer> bZ = aiq.a(cia.class, aio.b);
   private static final Logger ca = LogUtils.getLogger();
   public static final int bX = 300;
   private static final int cb = 8;
   @Nullable
   private cis cc;
   @Nullable
   protected cvy bY;
   private final bnl cd = new bnl(8);

   public cia(bpc<? extends cia> $$0, cwz $$1) {
      super($$0, $$1);
      this.a(eiy.n, 16.0F);
      this.a(eiy.o, -1.0F);
   }

   @Override
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
      if ($$3 == null) {
         $$3 = new bor.a(false);
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
   public int s() {
      return 0;
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(bZ, 0);
   }

   @Override
   public void f(@Nullable cis $$0) {
      this.cc = $$0;
   }

   @Nullable
   @Override
   public cis gn() {
      return this.cc;
   }

   public boolean go() {
      return this.cc != null;
   }

   @Override
   public cvy gp() {
      if (this.bY == null) {
         this.bY = new cvy();
         this.gu();
      }

      return this.bY;
   }

   @Override
   public void a(@Nullable cvy $$0) {
   }

   @Override
   public void u(int $$0) {
   }

   @Override
   public void a(cvx $$0) {
      $$0.j();
      this.bL = -this.O();
      this.b($$0);
      if (this.cc instanceof apg) {
         am.t.a((apg)this.cc, this, $$0.d());
      }
   }

   protected abstract void b(cvx var1);

   @Override
   public boolean gq() {
      return true;
   }

   @Override
   public void n(cqk $$0) {
      if (!this.dM().B && this.bL > -this.O() + 20) {
         this.bL = -this.O();
         this.b(this.w(!$$0.b()));
      }
   }

   @Override
   public atx gr() {
      return aty.At;
   }

   protected atx w(boolean $$0) {
      return $$0 ? aty.At : aty.Ar;
   }

   public void gs() {
      this.b(aty.Ao);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      cvy $$1 = this.gp();
      if (!$$1.isEmpty()) {
         $$0.a("Offers", ac.a(cvy.a.encodeStart(to.a, $$1), IllegalStateException::new));
      }

      this.a_($$0);
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      if ($$0.e("Offers")) {
         cvy.a.parse(to.a, $$0.c("Offers")).resultOrPartial(ac.a("Failed to load offers: ", ca::warn)).ifPresent($$0x -> this.bY = $$0x);
      }

      this.c($$0);
   }

   @Nullable
   @Override
   public bow b(apf $$0) {
      this.gt();
      return super.b($$0);
   }

   protected void gt() {
      this.f(null);
   }

   @Override
   public void a(bnv $$0) {
      super.a($$0);
      this.gt();
   }

   protected void a(ka $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ag.k() * 0.02;
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         this.dM().a($$0, this.d(1.0), this.du() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(cis $$0) {
      return false;
   }

   @Override
   public bnl y() {
      return this.cd;
   }

   @Override
   public bqf a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.cd.b() ? bqf.a(this.cd, $$1) : super.a_($$0);
   }

   protected abstract void gu();

   protected void a(cvy $$0, cij.g[] $$1, int $$2) {
      ArrayList<cij.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         cvx $$5 = $$3.remove(this.ag.a($$3.size())).a(this, this.ag);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public epr q(float $$0) {
      float $$1 = aww.i($$0, this.aY, this.aX) * (float) (Math.PI / 180.0);
      epr $$2 = new epr(0.0, this.cH().c() - 1.0, 0.2);
      return this.l($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gv() {
      return this.dM().B;
   }
}
