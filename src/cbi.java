import com.google.common.collect.Lists;
import java.util.ArrayList;
import javax.annotation.Nullable;

public abstract class cbi extends bir implements cbl, cbm, coy {
   private static final aef<Integer> bV = aei.a(cbi.class, aeh.b);
   public static final int bT = 300;
   private static final int bW = 8;
   @Nullable
   private cca bX;
   @Nullable
   protected cpa bU;
   private final bhl bY = new bhl(8);

   public cbi(bja<? extends cbi> $$0, cqb $$1) {
      super($$0, $$1);
      this.a(ear.n, 16.0F);
      this.a(ear.o, -1.0F);
   }

   @Override
   public bkf a(cqq $$0, bhc $$1, bjq $$2, @Nullable bkf $$3, @Nullable qw $$4) {
      if ($$3 == null) {
         $$3 = new bir.a(false);
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
   protected float b(bjy $$0, bix $$1) {
      return this.m_() ? 0.81F : 1.62F;
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bV, 0);
   }

   @Override
   public void f(@Nullable cca $$0) {
      this.bX = $$0;
   }

   @Nullable
   @Override
   public cca ge() {
      return this.bX;
   }

   public boolean gf() {
      return this.bX != null;
   }

   @Override
   public cpa gg() {
      if (this.bU == null) {
         this.bU = new cpa();
         this.gl();
      }

      return this.bU;
   }

   @Override
   public void a(@Nullable cpa $$0) {
   }

   @Override
   public void t(int $$0) {
   }

   @Override
   public void a(coz $$0) {
      $$0.j();
      this.bI = -this.O();
      this.b($$0);
      if (this.bX instanceof aku) {
         al.s.a((aku)this.bX, this, $$0.d());
      }
   }

   protected abstract void b(coz var1);

   @Override
   public boolean gh() {
      return true;
   }

   @Override
   public void l(cjl $$0) {
      if (!this.dL().B && this.bI > -this.O() + 20) {
         this.bI = -this.O();
         this.a(this.w(!$$0.b()), this.eV(), this.eW());
      }
   }

   @Override
   public apf gi() {
      return apg.yN;
   }

   protected apf w(boolean $$0) {
      return $$0 ? apg.yN : apg.yL;
   }

   public void gj() {
      this.a(apg.yI, this.eV(), this.eW());
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      cpa $$1 = this.gg();
      if (!$$1.isEmpty()) {
         $$0.a("Offers", $$1.a());
      }

      this.a_($$0);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      if ($$0.b("Offers", 10)) {
         this.bU = new cpa($$0.p("Offers"));
      }

      this.c($$0);
   }

   @Nullable
   @Override
   public biw b(akt $$0) {
      this.gk();
      return super.b($$0);
   }

   protected void gk() {
      this.f(null);
   }

   @Override
   public void a(bhu $$0) {
      super.a($$0);
      this.gk();
   }

   protected void a(it $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ag.k() * 0.02;
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         this.dL().a($$0, this.d(1.0), this.dt() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(cca $$0) {
      return false;
   }

   @Override
   public bhl y() {
      return this.bY;
   }

   @Override
   public bke a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bY.b() ? bke.a(this.bY, $$1) : super.a_($$0);
   }

   protected abstract void gl();

   protected void a(cpa $$0, cbr.g[] $$1, int $$2) {
      ArrayList<cbr.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         coz $$5 = $$3.remove(this.ag.a($$3.size())).a(this, this.ag);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public ehh q(float $$0) {
      float $$1 = asb.i($$0, this.aV, this.aU) * (float) (Math.PI / 180.0);
      ehh $$2 = new ehh(0.0, this.cG().c() - 1.0, 0.2);
      return this.l($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gm() {
      return this.dL().B;
   }
}
