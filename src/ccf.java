import com.google.common.collect.Lists;
import java.util.ArrayList;
import javax.annotation.Nullable;

public abstract class ccf extends bjo implements cci, ccj, cpw {
   private static final afc<Integer> bV = aff.a(ccf.class, afe.b);
   public static final int bT = 300;
   private static final int bW = 8;
   @Nullable
   private ccx bX;
   @Nullable
   protected cpy bU;
   private final bii bY = new bii(8);

   public ccf(bjx<? extends ccf> $$0, cqz $$1) {
      super($$0, $$1);
      this.a(ebp.n, 16.0F);
      this.a(ebp.o, -1.0F);
   }

   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      if ($$3 == null) {
         $$3 = new bjo.a(false);
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
   protected float b(bkv $$0, bju $$1) {
      return this.n_() ? 0.81F : 1.62F;
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bV, 0);
   }

   @Override
   public void f(@Nullable ccx $$0) {
      this.bX = $$0;
   }

   @Nullable
   @Override
   public ccx ge() {
      return this.bX;
   }

   public boolean gf() {
      return this.bX != null;
   }

   @Override
   public cpy gg() {
      if (this.bU == null) {
         this.bU = new cpy();
         this.gl();
      }

      return this.bU;
   }

   @Override
   public void a(@Nullable cpy $$0) {
   }

   @Override
   public void t(int $$0) {
   }

   @Override
   public void a(cpx $$0) {
      $$0.j();
      this.bI = -this.O();
      this.b($$0);
      if (this.bX instanceof alr) {
         al.s.a((alr)this.bX, this, $$0.d());
      }
   }

   protected abstract void b(cpx var1);

   @Override
   public boolean gh() {
      return true;
   }

   @Override
   public void l(ckj $$0) {
      if (!this.dL().B && this.bI > -this.O() + 20) {
         this.bI = -this.O();
         this.a(this.w(!$$0.b()), this.eV(), this.eW());
      }
   }

   @Override
   public aqc gi() {
      return aqd.yP;
   }

   protected aqc w(boolean $$0) {
      return $$0 ? aqd.yP : aqd.yN;
   }

   public void gj() {
      this.a(aqd.yK, this.eV(), this.eW());
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      cpy $$1 = this.gg();
      if (!$$1.isEmpty()) {
         $$0.a("Offers", $$1.a());
      }

      this.a_($$0);
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      if ($$0.b("Offers", 10)) {
         this.bU = new cpy($$0.p("Offers"));
      }

      this.c($$0);
   }

   @Nullable
   @Override
   public bjt b(alq $$0) {
      this.gk();
      return super.b($$0);
   }

   protected void gk() {
      this.f(null);
   }

   @Override
   public void a(bir $$0) {
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
   public boolean a(ccx $$0) {
      return false;
   }

   @Override
   public bii y() {
      return this.bY;
   }

   @Override
   public blb a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bY.b() ? blb.a(this.bY, $$1) : super.a_($$0);
   }

   protected abstract void gl();

   protected void a(cpy $$0, cco.g[] $$1, int $$2) {
      ArrayList<cco.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         cpx $$5 = $$3.remove(this.ag.a($$3.size())).a(this, this.ag);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public eif q(float $$0) {
      float $$1 = asy.i($$0, this.aV, this.aU) * (float) (Math.PI / 180.0);
      eif $$2 = new eif(0.0, this.cG().c() - 1.0, 0.2);
      return this.l($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gm() {
      return this.dL().B;
   }
}
