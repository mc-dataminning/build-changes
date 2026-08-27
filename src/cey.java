import com.google.common.collect.Lists;
import java.util.ArrayList;
import javax.annotation.Nullable;

public abstract class cey extends blr implements cfb, cfc, csu {
   private static final agn<Integer> bW = agq.a(cey.class, agp.b);
   public static final int bU = 300;
   private static final int bX = 8;
   @Nullable
   private cfq bY;
   @Nullable
   protected csw bV;
   private final bkl bZ = new bkl(8);

   public cey(bmc<? extends cey> $$0, ctx $$1) {
      super($$0, $$1);
      this.a(efk.n, 16.0F);
      this.a(efk.o, -1.0F);
   }

   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      if ($$3 == null) {
         $$3 = new blr.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public int u() {
      return this.an.b(bW);
   }

   public void s(int $$0) {
      this.an.b(bW, $$0);
   }

   @Override
   public int w() {
      return 0;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bW, 0);
   }

   @Override
   public void f(@Nullable cfq $$0) {
      this.bY = $$0;
   }

   @Nullable
   @Override
   public cfq gf() {
      return this.bY;
   }

   public boolean gg() {
      return this.bY != null;
   }

   @Override
   public csw gh() {
      if (this.bV == null) {
         this.bV = new csw();
         this.gm();
      }

      return this.bV;
   }

   @Override
   public void a(@Nullable csw $$0) {
   }

   @Override
   public void t(int $$0) {
   }

   @Override
   public void a(csv $$0) {
      $$0.j();
      this.bJ = -this.Q();
      this.b($$0);
      if (this.bY instanceof anf) {
         am.t.a((anf)this.bY, this, $$0.d());
      }
   }

   protected abstract void b(csv var1);

   @Override
   public boolean gi() {
      return true;
   }

   @Override
   public void l(cng $$0) {
      if (!this.dL().B && this.bJ > -this.Q() + 20) {
         this.bJ = -this.Q();
         this.a(this.w(!$$0.b()), this.eW(), this.eX());
      }
   }

   @Override
   public ars gj() {
      return art.Ac;
   }

   protected ars w(boolean $$0) {
      return $$0 ? art.Ac : art.Aa;
   }

   public void gk() {
      this.a(art.zX, this.eW(), this.eX());
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      csw $$1 = this.gh();
      if (!$$1.isEmpty()) {
         $$0.a("Offers", $$1.a());
      }

      this.a_($$0);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      if ($$0.b("Offers", 10)) {
         this.bV = new csw($$0.p("Offers"));
      }

      this.c($$0);
   }

   @Nullable
   @Override
   public blw b(ane $$0) {
      this.gl();
      return super.b($$0);
   }

   protected void gl() {
      this.f(null);
   }

   @Override
   public void a(bkv $$0) {
      super.a($$0);
      this.gl();
   }

   protected void a(jv $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ag.k() * 0.02;
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         this.dL().a($$0, this.d(1.0), this.dt() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(cfq $$0) {
      return false;
   }

   @Override
   public bkl A() {
      return this.bZ;
   }

   @Override
   public bng a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bZ.b() ? bng.a(this.bZ, $$1) : super.a_($$0);
   }

   protected abstract void gm();

   protected void a(csw $$0, cfh.g[] $$1, int $$2) {
      ArrayList<cfh.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         csv $$5 = $$3.remove(this.ag.a($$3.size())).a(this, this.ag);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public emc q(float $$0) {
      float $$1 = aup.i($$0, this.aV, this.aU) * (float) (Math.PI / 180.0);
      emc $$2 = new emc(0.0, this.cH().c() - 1.0, 0.2);
      return this.l($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gn() {
      return this.dL().B;
   }
}
