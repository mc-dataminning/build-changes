import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cic extends bos implements cif, cig, cvy {
   private static final aim<Integer> bZ = aiq.a(cic.class, aio.b);
   private static final Logger ca = LogUtils.getLogger();
   public static final int bX = 300;
   private static final int cb = 8;
   @Nullable
   private ciu cc;
   @Nullable
   protected cwa bY;
   private final bnm cd = new bnm(8);

   public cic(bpd<? extends cic> $$0, cxb $$1) {
      super($$0, $$1);
      this.a(ejg.n, 16.0F);
      this.a(ejg.o, -1.0F);
   }

   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      if ($$3 == null) {
         $$3 = new bos.a(false);
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
   public void f(@Nullable ciu $$0) {
      this.cc = $$0;
   }

   @Nullable
   @Override
   public ciu gn() {
      return this.cc;
   }

   public boolean go() {
      return this.cc != null;
   }

   @Override
   public cwa gp() {
      if (this.bY == null) {
         this.bY = new cwa();
         this.gu();
      }

      return this.bY;
   }

   @Override
   public void a(@Nullable cwa $$0) {
   }

   @Override
   public void u(int $$0) {
   }

   @Override
   public void a(cvz $$0) {
      $$0.j();
      this.bL = -this.O();
      this.b($$0);
      if (this.cc instanceof apg) {
         am.t.a((apg)this.cc, this, $$0.d());
      }
   }

   protected abstract void b(cvz var1);

   @Override
   public boolean gq() {
      return true;
   }

   @Override
   public void n(cqm $$0) {
      if (!this.dM().B && this.bL > -this.O() + 20) {
         this.bL = -this.O();
         this.b(this.w(!$$0.b()));
      }
   }

   @Override
   public atx gr() {
      return aty.Ay;
   }

   protected atx w(boolean $$0) {
      return $$0 ? aty.Ay : aty.Aw;
   }

   public void gs() {
      this.b(aty.At);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      cwa $$1 = this.gp();
      if (!$$1.isEmpty()) {
         $$0.a("Offers", ac.a(cwa.a.encodeStart(to.a, $$1), IllegalStateException::new));
      }

      this.a_($$0);
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      if ($$0.e("Offers")) {
         cwa.a.parse(to.a, $$0.c("Offers")).resultOrPartial(ac.a("Failed to load offers: ", ca::warn)).ifPresent($$0x -> this.bY = $$0x);
      }

      this.c($$0);
   }

   @Nullable
   @Override
   public box b(apf $$0) {
      this.gt();
      return super.b($$0);
   }

   protected void gt() {
      this.f(null);
   }

   @Override
   public void a(bnw $$0) {
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
   public boolean a(ciu $$0) {
      return false;
   }

   @Override
   public bnm y() {
      return this.cd;
   }

   @Override
   public bqg a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.cd.b() ? bqg.a(this.cd, $$1) : super.a_($$0);
   }

   protected abstract void gu();

   protected void a(cwa $$0, cil.g[] $$1, int $$2) {
      ArrayList<cil.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         cvz $$5 = $$3.remove(this.ag.a($$3.size())).a(this, this.ag);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public ept q(float $$0) {
      float $$1 = aww.i($$0, this.aY, this.aX) * (float) (Math.PI / 180.0);
      ept $$2 = new ept(0.0, this.cH().c() - 1.0, 0.2);
      return this.l($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gv() {
      return this.dM().B;
   }
}
