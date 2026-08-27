import com.google.common.collect.Lists;
import java.util.ArrayList;
import javax.annotation.Nullable;

public abstract class cdc extends bkl implements cdf, cdg, cqx {
   private static final afo<Integer> bV = afr.a(cdc.class, afq.b);
   public static final int bT = 300;
   private static final int bW = 8;
   @Nullable
   private cdu bX;
   @Nullable
   protected cqz bU;
   private final bje bY = new bje(8);

   public cdc(bku<? extends cdc> $$0, csa $$1) {
      super($$0, $$1);
      this.a(edd.n, 16.0F);
      this.a(edd.o, -1.0F);
   }

   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      if ($$3 == null) {
         $$3 = new bkl.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public int u() {
      return this.an.b(bV);
   }

   public void s(int $$0) {
      this.an.b(bV, $$0);
   }

   @Override
   public int w() {
      return 0;
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
      return this.n_() ? 0.81F : 1.62F;
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bV, 0);
   }

   @Override
   public void f(@Nullable cdu $$0) {
      this.bX = $$0;
   }

   @Nullable
   @Override
   public cdu gf() {
      return this.bX;
   }

   public boolean gg() {
      return this.bX != null;
   }

   @Override
   public cqz gh() {
      if (this.bU == null) {
         this.bU = new cqz();
         this.gm();
      }

      return this.bU;
   }

   @Override
   public void a(@Nullable cqz $$0) {
   }

   @Override
   public void t(int $$0) {
   }

   @Override
   public void a(cqy $$0) {
      $$0.j();
      this.bI = -this.Q();
      this.b($$0);
      if (this.bX instanceof amf) {
         al.s.a((amf)this.bX, this, $$0.d());
      }
   }

   protected abstract void b(cqy var1);

   @Override
   public boolean gi() {
      return true;
   }

   @Override
   public void l(clj $$0) {
      if (!this.dN().B && this.bI > -this.Q() + 20) {
         this.bI = -this.Q();
         this.a(this.w(!$$0.b()), this.eX(), this.eY());
      }
   }

   @Override
   public aqq gj() {
      return aqr.zs;
   }

   protected aqq w(boolean $$0) {
      return $$0 ? aqr.zs : aqr.zq;
   }

   public void gk() {
      this.a(aqr.zn, this.eX(), this.eY());
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      cqz $$1 = this.gh();
      if (!$$1.isEmpty()) {
         $$0.a("Offers", $$1.a());
      }

      this.a_($$0);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.b("Offers", 10)) {
         this.bU = new cqz($$0.p("Offers"));
      }

      this.c($$0);
   }

   @Nullable
   @Override
   public bkq b(ame $$0) {
      this.gl();
      return super.b($$0);
   }

   protected void gl() {
      this.f(null);
   }

   @Override
   public void a(bjo $$0) {
      super.a($$0);
      this.gl();
   }

   protected void a(jq $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ag.k() * 0.02;
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         this.dN().a($$0, this.d(1.0), this.dv() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(cdu $$0) {
      return false;
   }

   @Override
   public bje A() {
      return this.bY;
   }

   @Override
   public bly a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bY.b() ? bly.a(this.bY, $$1) : super.a_($$0);
   }

   protected abstract void gm();

   protected void a(cqz $$0, cdl.g[] $$1, int $$2) {
      ArrayList<cdl.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         cqy $$5 = $$3.remove(this.ag.a($$3.size())).a(this, this.ag);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public eju q(float $$0) {
      float $$1 = atm.i($$0, this.aV, this.aU) * (float) (Math.PI / 180.0);
      eju $$2 = new eju(0.0, this.cH().c() - 1.0, 0.2);
      return this.l($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gn() {
      return this.dN().B;
   }
}
