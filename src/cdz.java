import com.google.common.collect.Lists;
import java.util.ArrayList;
import javax.annotation.Nullable;

public abstract class cdz extends bla implements cec, ced, crv {
   private static final afz<Integer> bV = agc.a(cdz.class, agb.b);
   public static final int bT = 300;
   private static final int bW = 8;
   @Nullable
   private cer bX;
   @Nullable
   protected crx bU;
   private final bjt bY = new bjt(8);

   public cdz(blj<? extends cdz> $$0, csy $$1) {
      super($$0, $$1);
      this.a(eek.n, 16.0F);
      this.a(eek.o, -1.0F);
   }

   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      if ($$3 == null) {
         $$3 = new bla.a(false);
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
   protected float b(bmh $$0, blg $$1) {
      return this.o_() ? 0.81F : 1.62F;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bV, 0);
   }

   @Override
   public void f(@Nullable cer $$0) {
      this.bX = $$0;
   }

   @Nullable
   @Override
   public cer ge() {
      return this.bX;
   }

   public boolean gf() {
      return this.bX != null;
   }

   @Override
   public crx gg() {
      if (this.bU == null) {
         this.bU = new crx();
         this.gl();
      }

      return this.bU;
   }

   @Override
   public void a(@Nullable crx $$0) {
   }

   @Override
   public void t(int $$0) {
   }

   @Override
   public void a(crw $$0) {
      $$0.j();
      this.bI = -this.Q();
      this.b($$0);
      if (this.bX instanceof amq) {
         am.t.a((amq)this.bX, this, $$0.d());
      }
   }

   protected abstract void b(crw var1);

   @Override
   public boolean gh() {
      return true;
   }

   @Override
   public void l(cmh $$0) {
      if (!this.dM().B && this.bI > -this.Q() + 20) {
         this.bI = -this.Q();
         this.a(this.w(!$$0.b()), this.eW(), this.eX());
      }
   }

   @Override
   public arb gi() {
      return arc.zN;
   }

   protected arb w(boolean $$0) {
      return $$0 ? arc.zN : arc.zL;
   }

   public void gj() {
      this.a(arc.zI, this.eW(), this.eX());
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      crx $$1 = this.gg();
      if (!$$1.isEmpty()) {
         $$0.a("Offers", $$1.a());
      }

      this.a_($$0);
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      if ($$0.b("Offers", 10)) {
         this.bU = new crx($$0.p("Offers"));
      }

      this.c($$0);
   }

   @Nullable
   @Override
   public blf b(amp $$0) {
      this.gk();
      return super.b($$0);
   }

   protected void gk() {
      this.f(null);
   }

   @Override
   public void a(bkd $$0) {
      super.a($$0);
      this.gk();
   }

   protected void a(jt $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ag.k() * 0.02;
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         this.dM().a($$0, this.d(1.0), this.du() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(cer $$0) {
      return false;
   }

   @Override
   public bjt A() {
      return this.bY;
   }

   @Override
   public bmn a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bY.b() ? bmn.a(this.bY, $$1) : super.a_($$0);
   }

   protected abstract void gl();

   protected void a(crx $$0, cei.g[] $$1, int $$2) {
      ArrayList<cei.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         crw $$5 = $$3.remove(this.ag.a($$3.size())).a(this, this.ag);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public elb q(float $$0) {
      float $$1 = aty.i($$0, this.aV, this.aU) * (float) (Math.PI / 180.0);
      elb $$2 = new elb(0.0, this.cH().c() - 1.0, 0.2);
      return this.l($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gm() {
      return this.dM().B;
   }
}
