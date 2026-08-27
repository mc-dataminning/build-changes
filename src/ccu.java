import com.google.common.collect.Lists;
import java.util.ArrayList;
import javax.annotation.Nullable;

public abstract class ccu extends bkd implements ccx, ccy, cqp {
   private static final afm<Integer> bV = afp.a(ccu.class, afo.b);
   public static final int bT = 300;
   private static final int bW = 8;
   @Nullable
   private cdm bX;
   @Nullable
   protected cqr bU;
   private final bix bY = new bix(8);

   public ccu(bkm<? extends ccu> $$0, crs $$1) {
      super($$0, $$1);
      this.a(ecr.n, 16.0F);
      this.a(ecr.o, -1.0F);
   }

   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      if ($$3 == null) {
         $$3 = new bkd.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public int s() {
      return this.an.b(bV);
   }

   public void s(int $$0) {
      this.an.b(bV, $$0);
   }

   @Override
   public int t() {
      return 0;
   }

   @Override
   protected float b(blk $$0, bkj $$1) {
      return this.n_() ? 0.81F : 1.62F;
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bV, 0);
   }

   @Override
   public void f(@Nullable cdm $$0) {
      this.bX = $$0;
   }

   @Nullable
   @Override
   public cdm ge() {
      return this.bX;
   }

   public boolean gf() {
      return this.bX != null;
   }

   @Override
   public cqr gg() {
      if (this.bU == null) {
         this.bU = new cqr();
         this.gl();
      }

      return this.bU;
   }

   @Override
   public void a(@Nullable cqr $$0) {
   }

   @Override
   public void t(int $$0) {
   }

   @Override
   public void a(cqq $$0) {
      $$0.j();
      this.bI = -this.O();
      this.b($$0);
      if (this.bX instanceof amb) {
         al.s.a((amb)this.bX, this, $$0.d());
      }
   }

   protected abstract void b(cqq var1);

   @Override
   public boolean gh() {
      return true;
   }

   @Override
   public void l(clb $$0) {
      if (!this.dL().B && this.bI > -this.O() + 20) {
         this.bI = -this.O();
         this.a(this.w(!$$0.b()), this.eV(), this.eW());
      }
   }

   @Override
   public aqm gi() {
      return aqn.yR;
   }

   protected aqm w(boolean $$0) {
      return $$0 ? aqn.yR : aqn.yP;
   }

   public void gj() {
      this.a(aqn.yM, this.eV(), this.eW());
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      cqr $$1 = this.gg();
      if (!$$1.isEmpty()) {
         $$0.a("Offers", $$1.a());
      }

      this.a_($$0);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.b("Offers", 10)) {
         this.bU = new cqr($$0.p("Offers"));
      }

      this.c($$0);
   }

   @Nullable
   @Override
   public bki b(ama $$0) {
      this.gk();
      return super.b($$0);
   }

   protected void gk() {
      this.f(null);
   }

   @Override
   public void a(bjg $$0) {
      super.a($$0);
      this.gk();
   }

   protected void a(jq $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ag.k() * 0.02;
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         this.dL().a($$0, this.d(1.0), this.dt() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(cdm $$0) {
      return false;
   }

   @Override
   public bix y() {
      return this.bY;
   }

   @Override
   public blq a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bY.b() ? blq.a(this.bY, $$1) : super.a_($$0);
   }

   protected abstract void gl();

   protected void a(cqr $$0, cdd.g[] $$1, int $$2) {
      ArrayList<cdd.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         cqq $$5 = $$3.remove(this.ag.a($$3.size())).a(this, this.ag);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public eji q(float $$0) {
      float $$1 = ati.i($$0, this.aV, this.aU) * (float) (Math.PI / 180.0);
      eji $$2 = new eji(0.0, this.cG().c() - 1.0, 0.2);
      return this.l($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gm() {
      return this.dL().B;
   }
}
