import com.google.common.collect.Lists;
import java.util.ArrayList;
import javax.annotation.Nullable;

public abstract class ceq extends blq implements cet, ceu, csm {
   private static final agm<Integer> bV = agp.a(ceq.class, ago.b);
   public static final int bT = 300;
   private static final int bW = 8;
   @Nullable
   private cfi bX;
   @Nullable
   protected cso bU;
   private final bkj bY = new bkj(8);

   public ceq(blz<? extends ceq> $$0, ctp $$1) {
      super($$0, $$1);
      this.a(efc.n, 16.0F);
      this.a(efc.o, -1.0F);
   }

   @Override
   public bne a(cue $$0, bjz $$1, bmp $$2, @Nullable bne $$3, @Nullable sn $$4) {
      if ($$3 == null) {
         $$3 = new blq.a(false);
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
   protected float b(bmx $$0, blw $$1) {
      return this.o_() ? 0.81F : 1.62F;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bV, 0);
   }

   @Override
   public void f(@Nullable cfi $$0) {
      this.bX = $$0;
   }

   @Nullable
   @Override
   public cfi ge() {
      return this.bX;
   }

   public boolean gf() {
      return this.bX != null;
   }

   @Override
   public cso gg() {
      if (this.bU == null) {
         this.bU = new cso();
         this.gl();
      }

      return this.bU;
   }

   @Override
   public void a(@Nullable cso $$0) {
   }

   @Override
   public void t(int $$0) {
   }

   @Override
   public void a(csn $$0) {
      $$0.j();
      this.bI = -this.Q();
      this.b($$0);
      if (this.bX instanceof ane) {
         am.t.a((ane)this.bX, this, $$0.d());
      }
   }

   protected abstract void b(csn var1);

   @Override
   public boolean gh() {
      return true;
   }

   @Override
   public void l(cmy $$0) {
      if (!this.dM().B && this.bI > -this.Q() + 20) {
         this.bI = -this.Q();
         this.a(this.w(!$$0.b()), this.eW(), this.eX());
      }
   }

   @Override
   public arr gi() {
      return ars.zN;
   }

   protected arr w(boolean $$0) {
      return $$0 ? ars.zN : ars.zL;
   }

   public void gj() {
      this.a(ars.zI, this.eW(), this.eX());
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      cso $$1 = this.gg();
      if (!$$1.isEmpty()) {
         $$0.a("Offers", $$1.a());
      }

      this.a_($$0);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      if ($$0.b("Offers", 10)) {
         this.bU = new cso($$0.p("Offers"));
      }

      this.c($$0);
   }

   @Nullable
   @Override
   public blv b(and $$0) {
      this.gk();
      return super.b($$0);
   }

   protected void gk() {
      this.f(null);
   }

   @Override
   public void a(bkt $$0) {
      super.a($$0);
      this.gk();
   }

   protected void a(jv $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ag.k() * 0.02;
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         this.dM().a($$0, this.d(1.0), this.du() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(cfi $$0) {
      return false;
   }

   @Override
   public bkj A() {
      return this.bY;
   }

   @Override
   public bnd a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bY.b() ? bnd.a(this.bY, $$1) : super.a_($$0);
   }

   protected abstract void gl();

   protected void a(cso $$0, cez.g[] $$1, int $$2) {
      ArrayList<cez.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         csn $$5 = $$3.remove(this.ag.a($$3.size())).a(this, this.ag);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public elt q(float $$0) {
      float $$1 = auo.i($$0, this.aV, this.aU) * (float) (Math.PI / 180.0);
      elt $$2 = new elt(0.0, this.cH().c() - 1.0, 0.2);
      return this.l($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gm() {
      return this.dM().B;
   }
}
