import com.google.common.collect.Lists;
import java.util.ArrayList;
import javax.annotation.Nullable;

public abstract class cej extends blk implements cem, cen, csf {
   private static final agj<Integer> bV = agm.a(cej.class, agl.b);
   public static final int bT = 300;
   private static final int bW = 8;
   @Nullable
   private cfb bX;
   @Nullable
   protected csh bU;
   private final bkd bY = new bkd(8);

   public cej(blt<? extends cej> $$0, cti $$1) {
      super($$0, $$1);
      this.a(eev.n, 16.0F);
      this.a(eev.o, -1.0F);
   }

   @Override
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      if ($$3 == null) {
         $$3 = new blk.a(false);
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
   protected float b(bmr $$0, blq $$1) {
      return this.o_() ? 0.81F : 1.62F;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bV, 0);
   }

   @Override
   public void f(@Nullable cfb $$0) {
      this.bX = $$0;
   }

   @Nullable
   @Override
   public cfb ge() {
      return this.bX;
   }

   public boolean gf() {
      return this.bX != null;
   }

   @Override
   public csh gg() {
      if (this.bU == null) {
         this.bU = new csh();
         this.gl();
      }

      return this.bU;
   }

   @Override
   public void a(@Nullable csh $$0) {
   }

   @Override
   public void t(int $$0) {
   }

   @Override
   public void a(csg $$0) {
      $$0.j();
      this.bI = -this.Q();
      this.b($$0);
      if (this.bX instanceof ana) {
         am.t.a((ana)this.bX, this, $$0.d());
      }
   }

   protected abstract void b(csg var1);

   @Override
   public boolean gh() {
      return true;
   }

   @Override
   public void l(cmr $$0) {
      if (!this.dM().B && this.bI > -this.Q() + 20) {
         this.bI = -this.Q();
         this.a(this.w(!$$0.b()), this.eW(), this.eX());
      }
   }

   @Override
   public arl gi() {
      return arm.zN;
   }

   protected arl w(boolean $$0) {
      return $$0 ? arm.zN : arm.zL;
   }

   public void gj() {
      this.a(arm.zI, this.eW(), this.eX());
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      csh $$1 = this.gg();
      if (!$$1.isEmpty()) {
         $$0.a("Offers", $$1.a());
      }

      this.a_($$0);
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      if ($$0.b("Offers", 10)) {
         this.bU = new csh($$0.p("Offers"));
      }

      this.c($$0);
   }

   @Nullable
   @Override
   public blp b(amz $$0) {
      this.gk();
      return super.b($$0);
   }

   protected void gk() {
      this.f(null);
   }

   @Override
   public void a(bkn $$0) {
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
   public boolean a(cfb $$0) {
      return false;
   }

   @Override
   public bkd A() {
      return this.bY;
   }

   @Override
   public bmx a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bY.b() ? bmx.a(this.bY, $$1) : super.a_($$0);
   }

   protected abstract void gl();

   protected void a(csh $$0, ces.g[] $$1, int $$2) {
      ArrayList<ces.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         csg $$5 = $$3.remove(this.ag.a($$3.size())).a(this, this.ag);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public elm q(float $$0) {
      float $$1 = aui.i($$0, this.aV, this.aU) * (float) (Math.PI / 180.0);
      elm $$2 = new elm(0.0, this.cH().c() - 1.0, 0.2);
      return this.l($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gm() {
      return this.dM().B;
   }
}
