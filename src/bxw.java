import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class bxw extends bfe implements bxz, bya, clj {
   private static final aby<Integer> bV = acb.a(bxw.class, aca.b);
   public static final int bT = 300;
   private static final int bW = 8;
   @Nullable
   private byo bX;
   @Nullable
   protected cll bU;
   private final bee bY = new bee(8);

   public bxw(bfn<? extends bxw> $$0, cmm $$1) {
      super($$0, $$1);
      this.a(dxp.n, 16.0F);
      this.a(dxp.o, -1.0F);
   }

   @Override
   public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
      if ($$3 == null) {
         $$3 = new bfe.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public int q() {
      return this.am.b(bV);
   }

   public void s(int $$0) {
      this.am.b(bV, $$0);
   }

   @Override
   public int r() {
      return 0;
   }

   @Override
   protected float b(bgl $$0, bfk $$1) {
      return this.h_() ? 0.81F : 1.62F;
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(bV, 0);
   }

   @Override
   public void f(@Nullable byo $$0) {
      this.bX = $$0;
   }

   @Nullable
   @Override
   public byo fY() {
      return this.bX;
   }

   public boolean fZ() {
      return this.bX != null;
   }

   @Override
   public cll ga() {
      if (this.bU == null) {
         this.bU = new cll();
         this.gf();
      }

      return this.bU;
   }

   @Override
   public void a(@Nullable cll $$0) {
   }

   @Override
   public void t(int $$0) {
   }

   @Override
   public void a(clk $$0) {
      $$0.j();
      this.bI = -this.M();
      this.b($$0);
      if (this.bX instanceof aig) {
         ai.s.a((aig)this.bX, this, $$0.d());
      }
   }

   protected abstract void b(clk var1);

   @Override
   public boolean gb() {
      return true;
   }

   @Override
   public void l(cfz $$0) {
      if (!this.dI().B && this.bI > -this.M() + 20) {
         this.bI = -this.M();
         this.a(this.w(!$$0.b()), this.eR(), this.eS());
      }
   }

   @Override
   public amg gc() {
      return amh.yH;
   }

   protected amg w(boolean $$0) {
      return $$0 ? amh.yH : amh.yF;
   }

   public void gd() {
      this.a(amh.yC, this.eR(), this.eS());
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      cll $$1 = this.ga();
      if (!$$1.isEmpty()) {
         $$0.a("Offers", $$1.a());
      }

      this.a_($$0);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("Offers", 10)) {
         this.bU = new cll($$0.p("Offers"));
      }

      this.c($$0);
   }

   @Nullable
   @Override
   public bfj b(aif $$0) {
      this.ge();
      return super.b($$0);
   }

   protected void ge() {
      this.f(null);
   }

   @Override
   public void a(ben $$0) {
      super.a($$0);
      this.ge();
   }

   protected void a(it $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.af.k() * 0.02;
         double $$3 = this.af.k() * 0.02;
         double $$4 = this.af.k() * 0.02;
         this.dI().a($$0, this.d(1.0), this.dq() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(byo $$0) {
      return false;
   }

   @Override
   public bee w() {
      return this.bY;
   }

   @Override
   public bgs a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bY.b() ? bgs.a(this.bY, $$1) : super.a_($$0);
   }

   protected abstract void gf();

   protected void a(cll $$0, byf.f[] $$1, int $$2) {
      Set<Integer> $$3 = Sets.newHashSet();
      if ($$1.length > $$2) {
         while ($$3.size() < $$2) {
            $$3.add(this.af.a($$1.length));
         }
      } else {
         for (int $$4 = 0; $$4 < $$1.length; $$4++) {
            $$3.add($$4);
         }
      }

      for (Integer $$5 : $$3) {
         byf.f $$6 = $$1[$$5];
         clk $$7 = $$6.a(this, this.af);
         if ($$7 != null) {
            $$0.add($$7);
         }
      }
   }

   @Override
   public eei q(float $$0) {
      float $$1 = apa.i($$0, this.aW, this.aV) * (float) (Math.PI / 180.0);
      eei $$2 = new eei(0.0, this.cE().c() - 1.0, 0.2);
      return this.l($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gg() {
      return this.dI().B;
   }
}
