import com.google.common.collect.Lists;
import java.util.ArrayList;
import javax.annotation.Nullable;

public abstract class cbe extends bin implements cbh, cbi, cou {
   private static final aeg<Integer> bV = aej.a(cbe.class, aei.b);
   public static final int bT = 300;
   private static final int bW = 8;
   @Nullable
   private cbw bX;
   @Nullable
   protected cow bU;
   private final bhh bY = new bhh(8);

   public cbe(biw<? extends cbe> $$0, cpx $$1) {
      super($$0, $$1);
      this.a(eaz.n, 16.0F);
      this.a(eaz.o, -1.0F);
   }

   @Override
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      if ($$3 == null) {
         $$3 = new bin.a(false);
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
   protected float b(bju $$0, bit $$1) {
      return this.m_() ? 0.81F : 1.62F;
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bV, 0);
   }

   @Override
   public void f(@Nullable cbw $$0) {
      this.bX = $$0;
   }

   @Nullable
   @Override
   public cbw gd() {
      return this.bX;
   }

   public boolean ge() {
      return this.bX != null;
   }

   @Override
   public cow gf() {
      if (this.bU == null) {
         this.bU = new cow();
         this.gk();
      }

      return this.bU;
   }

   @Override
   public void a(@Nullable cow $$0) {
   }

   @Override
   public void t(int $$0) {
   }

   @Override
   public void a(cov $$0) {
      $$0.j();
      this.bI = -this.O();
      this.b($$0);
      if (this.bX instanceof akt) {
         al.s.a((akt)this.bX, this, $$0.d());
      }
   }

   protected abstract void b(cov var1);

   @Override
   public boolean gg() {
      return true;
   }

   @Override
   public void l(cjh $$0) {
      if (!this.dL().B && this.bI > -this.O() + 20) {
         this.bI = -this.O();
         this.a(this.w(!$$0.b()), this.eV(), this.eW());
      }
   }

   @Override
   public ape gh() {
      return apf.yN;
   }

   protected ape w(boolean $$0) {
      return $$0 ? apf.yN : apf.yL;
   }

   public void gi() {
      this.a(apf.yI, this.eV(), this.eW());
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      cow $$1 = this.gf();
      if (!$$1.isEmpty()) {
         $$0.a("Offers", $$1.a());
      }

      this.a_($$0);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      if ($$0.b("Offers", 10)) {
         this.bU = new cow($$0.p("Offers"));
      }

      this.c($$0);
   }

   @Nullable
   @Override
   public bis b(aks $$0) {
      this.gj();
      return super.b($$0);
   }

   protected void gj() {
      this.f(null);
   }

   @Override
   public void a(bhq $$0) {
      super.a($$0);
      this.gj();
   }

   protected void a(iv $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ag.k() * 0.02;
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         this.dL().a($$0, this.d(1.0), this.dt() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(cbw $$0) {
      return false;
   }

   @Override
   public bhh y() {
      return this.bY;
   }

   @Override
   public bka a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bY.b() ? bka.a(this.bY, $$1) : super.a_($$0);
   }

   protected abstract void gk();

   protected void a(cow $$0, cbn.g[] $$1, int $$2) {
      ArrayList<cbn.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         cov $$5 = $$3.remove(this.ag.a($$3.size())).a(this, this.ag);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public ehp q(float $$0) {
      float $$1 = ary.i($$0, this.aV, this.aU) * (float) (Math.PI / 180.0);
      ehp $$2 = new ehp(0.0, this.cG().c() - 1.0, 0.2);
      return this.l($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gl() {
      return this.dL().B;
   }
}
