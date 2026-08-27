import com.google.common.collect.Lists;
import java.util.ArrayList;
import javax.annotation.Nullable;

public abstract class cgt extends bnl implements cgw, cgx, cuo {
   private static final aie<Integer> bV = aih.a(cgt.class, aig.b);
   public static final int bT = 300;
   private static final int bW = 8;
   @Nullable
   private chl bX;
   @Nullable
   protected cuq bU;
   private final bmf bY = new bmf(8);

   public cgt(bnw<? extends cgt> $$0, cvr $$1) {
      super($$0, $$1);
      this.a(ehh.n, 16.0F);
      this.a(ehh.o, -1.0F);
   }

   @Override
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      if ($$3 == null) {
         $$3 = new bnl.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public int u() {
      return this.am.b(bV);
   }

   public void t(int $$0) {
      this.am.b(bV, $$0);
   }

   @Override
   public int w() {
      return 0;
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bV, 0);
   }

   @Override
   public void f(@Nullable chl $$0) {
      this.bX = $$0;
   }

   @Nullable
   @Override
   public chl gg() {
      return this.bX;
   }

   public boolean gh() {
      return this.bX != null;
   }

   @Override
   public cuq gi() {
      if (this.bU == null) {
         this.bU = new cuq();
         this.gn();
      }

      return this.bU;
   }

   @Override
   public void a(@Nullable cuq $$0) {
   }

   @Override
   public void u(int $$0) {
   }

   @Override
   public void a(cup $$0) {
      $$0.j();
      this.bI = -this.Q();
      this.b($$0);
      if (this.bX instanceof aox) {
         am.t.a((aox)this.bX, this, $$0.d());
      }
   }

   protected abstract void b(cup var1);

   @Override
   public boolean gj() {
      return true;
   }

   @Override
   public void l(cpd $$0) {
      if (!this.dM().B && this.bI > -this.Q() + 20) {
         this.bI = -this.Q();
         this.b(this.w(!$$0.b()));
      }
   }

   @Override
   public atk gk() {
      return atl.Ad;
   }

   protected atk w(boolean $$0) {
      return $$0 ? atl.Ad : atl.Ab;
   }

   public void gl() {
      this.b(atl.zY);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      cuq $$1 = this.gi();
      if (!$$1.isEmpty()) {
         $$0.a("Offers", $$1.a());
      }

      this.a_($$0);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.b("Offers", 10)) {
         this.bU = new cuq($$0.p("Offers"));
      }

      this.c($$0);
   }

   @Nullable
   @Override
   public bnq b(aow $$0) {
      this.gm();
      return super.b($$0);
   }

   protected void gm() {
      this.f(null);
   }

   @Override
   public void a(bmp $$0) {
      super.a($$0);
      this.gm();
   }

   protected void a(jx $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.af.k() * 0.02;
         double $$3 = this.af.k() * 0.02;
         double $$4 = this.af.k() * 0.02;
         this.dM().a($$0, this.d(1.0), this.du() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(chl $$0) {
      return false;
   }

   @Override
   public bmf A() {
      return this.bY;
   }

   @Override
   public boz a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bY.b() ? boz.a(this.bY, $$1) : super.a_($$0);
   }

   protected abstract void gn();

   protected void a(cuq $$0, chc.g[] $$1, int $$2) {
      ArrayList<chc.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         cup $$5 = $$3.remove(this.af.a($$3.size())).a(this, this.af);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public enz q(float $$0) {
      float $$1 = awi.i($$0, this.aV, this.aU) * (float) (Math.PI / 180.0);
      enz $$2 = new enz(0.0, this.cH().c() - 1.0, 0.2);
      return this.l($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean go() {
      return this.dM().B;
   }
}
