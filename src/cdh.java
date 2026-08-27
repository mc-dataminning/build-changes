import com.google.common.collect.Lists;
import java.util.ArrayList;
import javax.annotation.Nullable;

public abstract class cdh extends bkq implements cdk, cdl, crc {
   private static final afs<Integer> bV = afv.a(cdh.class, afu.b);
   public static final int bT = 300;
   private static final int bW = 8;
   @Nullable
   private cdz bX;
   @Nullable
   protected cre bU;
   private final bjj bY = new bjj(8);

   public cdh(bkz<? extends cdh> $$0, csf $$1) {
      super($$0, $$1);
      this.a(edi.n, 16.0F);
      this.a(edi.o, -1.0F);
   }

   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      if ($$3 == null) {
         $$3 = new bkq.a(false);
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
   protected float b(blx $$0, bkw $$1) {
      return this.o_() ? 0.81F : 1.62F;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bV, 0);
   }

   @Override
   public void f(@Nullable cdz $$0) {
      this.bX = $$0;
   }

   @Nullable
   @Override
   public cdz gf() {
      return this.bX;
   }

   public boolean gg() {
      return this.bX != null;
   }

   @Override
   public cre gh() {
      if (this.bU == null) {
         this.bU = new cre();
         this.gm();
      }

      return this.bU;
   }

   @Override
   public void a(@Nullable cre $$0) {
   }

   @Override
   public void t(int $$0) {
   }

   @Override
   public void a(crd $$0) {
      $$0.j();
      this.bI = -this.Q();
      this.b($$0);
      if (this.bX instanceof amj) {
         al.s.a((amj)this.bX, this, $$0.d());
      }
   }

   protected abstract void b(crd var1);

   @Override
   public boolean gi() {
      return true;
   }

   @Override
   public void l(clo $$0) {
      if (!this.dN().B && this.bI > -this.Q() + 20) {
         this.bI = -this.Q();
         this.a(this.w(!$$0.b()), this.eX(), this.eY());
      }
   }

   @Override
   public aqu gj() {
      return aqv.zs;
   }

   protected aqu w(boolean $$0) {
      return $$0 ? aqv.zs : aqv.zq;
   }

   public void gk() {
      this.a(aqv.zn, this.eX(), this.eY());
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      cre $$1 = this.gh();
      if (!$$1.isEmpty()) {
         $$0.a("Offers", $$1.a());
      }

      this.a_($$0);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      if ($$0.b("Offers", 10)) {
         this.bU = new cre($$0.p("Offers"));
      }

      this.c($$0);
   }

   @Nullable
   @Override
   public bkv b(ami $$0) {
      this.gl();
      return super.b($$0);
   }

   protected void gl() {
      this.f(null);
   }

   @Override
   public void a(bjt $$0) {
      super.a($$0);
      this.gl();
   }

   protected void a(ju $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ag.k() * 0.02;
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         this.dN().a($$0, this.d(1.0), this.dv() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(cdz $$0) {
      return false;
   }

   @Override
   public bjj A() {
      return this.bY;
   }

   @Override
   public bmd a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bY.b() ? bmd.a(this.bY, $$1) : super.a_($$0);
   }

   protected abstract void gm();

   protected void a(cre $$0, cdq.g[] $$1, int $$2) {
      ArrayList<cdq.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         crd $$5 = $$3.remove(this.ag.a($$3.size())).a(this, this.ag);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public ejz q(float $$0) {
      float $$1 = atq.i($$0, this.aV, this.aU) * (float) (Math.PI / 180.0);
      ejz $$2 = new ejz(0.0, this.cH().c() - 1.0, 0.2);
      return this.l($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gn() {
      return this.dN().B;
   }
}
