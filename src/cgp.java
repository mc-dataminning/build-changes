import com.google.common.collect.Lists;
import java.util.ArrayList;
import javax.annotation.Nullable;

public abstract class cgp extends bnj implements cgs, cgt, cuk {
   private static final aie<Integer> bV = aih.a(cgp.class, aig.b);
   public static final int bT = 300;
   private static final int bW = 8;
   @Nullable
   private chh bX;
   @Nullable
   protected cum bU;
   private final bmd bY = new bmd(8);

   public cgp(bnu<? extends cgp> $$0, cvn $$1) {
      super($$0, $$1);
      this.a(eha.n, 16.0F);
      this.a(eha.o, -1.0F);
   }

   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      if ($$3 == null) {
         $$3 = new bnj.a(false);
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
   public void f(@Nullable chh $$0) {
      this.bX = $$0;
   }

   @Nullable
   @Override
   public chh gg() {
      return this.bX;
   }

   public boolean gh() {
      return this.bX != null;
   }

   @Override
   public cum gi() {
      if (this.bU == null) {
         this.bU = new cum();
         this.gn();
      }

      return this.bU;
   }

   @Override
   public void a(@Nullable cum $$0) {
   }

   @Override
   public void u(int $$0) {
   }

   @Override
   public void a(cul $$0) {
      $$0.j();
      this.bI = -this.Q();
      this.b($$0);
      if (this.bX instanceof aow) {
         am.t.a((aow)this.bX, this, $$0.d());
      }
   }

   protected abstract void b(cul var1);

   @Override
   public boolean gj() {
      return true;
   }

   @Override
   public void l(coz $$0) {
      if (!this.dM().B && this.bI > -this.Q() + 20) {
         this.bI = -this.Q();
         this.b(this.w(!$$0.b()));
      }
   }

   @Override
   public atj gk() {
      return atk.Ac;
   }

   protected atj w(boolean $$0) {
      return $$0 ? atk.Ac : atk.Aa;
   }

   public void gl() {
      this.b(atk.zX);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      cum $$1 = this.gi();
      if (!$$1.isEmpty()) {
         $$0.a("Offers", $$1.a());
      }

      this.a_($$0);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.b("Offers", 10)) {
         this.bU = new cum($$0.p("Offers"));
      }

      this.c($$0);
   }

   @Nullable
   @Override
   public bno b(aov $$0) {
      this.gm();
      return super.b($$0);
   }

   protected void gm() {
      this.f(null);
   }

   @Override
   public void a(bmn $$0) {
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
   public boolean a(chh $$0) {
      return false;
   }

   @Override
   public bmd A() {
      return this.bY;
   }

   @Override
   public box a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bY.b() ? box.a(this.bY, $$1) : super.a_($$0);
   }

   protected abstract void gn();

   protected void a(cum $$0, cgy.g[] $$1, int $$2) {
      ArrayList<cgy.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         cul $$5 = $$3.remove(this.af.a($$3.size())).a(this, this.af);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public ens q(float $$0) {
      float $$1 = awh.i($$0, this.aV, this.aU) * (float) (Math.PI / 180.0);
      ens $$2 = new ens(0.0, this.cH().c() - 1.0, 0.2);
      return this.l($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean go() {
      return this.dM().B;
   }
}
