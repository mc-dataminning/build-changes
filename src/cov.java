public class cov {
   private final cjh a;
   private final cjh b;
   private final cjh c;
   private int d;
   private final int e;
   private boolean f = true;
   private int g;
   private int h;
   private float i;
   private int j = 1;

   public cov(qy $$0) {
      this.a = cjh.a($$0.p("buy"));
      this.b = cjh.a($$0.p("buyB"));
      this.c = cjh.a($$0.p("sell"));
      this.d = $$0.h("uses");
      if ($$0.b("maxUses", 99)) {
         this.e = $$0.h("maxUses");
      } else {
         this.e = 4;
      }

      if ($$0.b("rewardExp", 1)) {
         this.f = $$0.q("rewardExp");
      }

      if ($$0.b("xp", 3)) {
         this.j = $$0.h("xp");
      }

      if ($$0.b("priceMultiplier", 5)) {
         this.i = $$0.j("priceMultiplier");
      }

      this.g = $$0.h("specialPrice");
      this.h = $$0.h("demand");
   }

   public cov(cjh $$0, cjh $$1, int $$2, int $$3, float $$4) {
      this($$0, cjh.b, $$1, $$2, $$3, $$4);
   }

   public cov(cjh $$0, cjh $$1, cjh $$2, int $$3, int $$4, float $$5) {
      this($$0, $$1, $$2, 0, $$3, $$4, $$5);
   }

   public cov(cjh $$0, cjh $$1, cjh $$2, int $$3, int $$4, int $$5, float $$6) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0);
   }

   public cov(cjh $$0, cjh $$1, cjh $$2, int $$3, int $$4, int $$5, float $$6, int $$7) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.j = $$5;
      this.i = $$6;
      this.h = $$7;
   }

   private cov(cov $$0) {
      this.a = $$0.a.p();
      this.b = $$0.b.p();
      this.c = $$0.c.p();
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
      this.j = $$0.j;
   }

   public cjh a() {
      return this.a;
   }

   public cjh b() {
      if (this.a.b()) {
         return cjh.b;
      } else {
         int $$0 = this.a.L();
         int $$1 = Math.max(0, ary.d((float)($$0 * this.h) * this.i));
         return this.a.c(ary.a($$0 + $$1 + this.g, 1, this.a.d().l()));
      }
   }

   public cjh c() {
      return this.b;
   }

   public cjh d() {
      return this.c;
   }

   public void e() {
      this.h = this.h + this.d - (this.e - this.d);
   }

   public cjh f() {
      return this.c.p();
   }

   public int g() {
      return this.d;
   }

   public void h() {
      this.d = 0;
   }

   public int i() {
      return this.e;
   }

   public void j() {
      this.d++;
   }

   public int k() {
      return this.h;
   }

   public void a(int $$0) {
      this.g += $$0;
   }

   public void l() {
      this.g = 0;
   }

   public int m() {
      return this.g;
   }

   public void b(int $$0) {
      this.g = $$0;
   }

   public float n() {
      return this.i;
   }

   public int o() {
      return this.j;
   }

   public boolean p() {
      return this.d >= this.e;
   }

   public void q() {
      this.d = this.e;
   }

   public boolean r() {
      return this.d > 0;
   }

   public boolean s() {
      return this.f;
   }

   public qy t() {
      qy $$0 = new qy();
      $$0.a("buy", this.a.b(new qy()));
      $$0.a("sell", this.c.b(new qy()));
      $$0.a("buyB", this.b.b(new qy()));
      $$0.a("uses", this.d);
      $$0.a("maxUses", this.e);
      $$0.a("rewardExp", this.f);
      $$0.a("xp", this.j);
      $$0.a("priceMultiplier", this.i);
      $$0.a("specialPrice", this.g);
      $$0.a("demand", this.h);
      return $$0;
   }

   public boolean a(cjh $$0, cjh $$1) {
      return this.c($$0, this.b()) && $$0.L() >= this.b().L() && this.c($$1, this.b) && $$1.L() >= this.b.L();
   }

   private boolean c(cjh $$0, cjh $$1) {
      if ($$1.b() && $$0.b()) {
         return true;
      } else {
         cjh $$2 = $$0.p();
         if ($$2.d().o()) {
            $$2.b($$2.k());
         }

         return cjh.b($$2, $$1) && (!$$1.u() || $$2.u() && rl.a($$1.v(), $$2.v(), false));
      }
   }

   public boolean b(cjh $$0, cjh $$1) {
      if (!this.a($$0, $$1)) {
         return false;
      } else {
         $$0.h(this.b().L());
         if (!this.c().b()) {
            $$1.h(this.c().L());
         }

         return true;
      }
   }

   public cov u() {
      return new cov(this);
   }
}
