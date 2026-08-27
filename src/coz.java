public class coz {
   private final cjl a;
   private final cjl b;
   private final cjl c;
   private int d;
   private final int e;
   private boolean f = true;
   private int g;
   private int h;
   private float i;
   private int j = 1;

   public coz(qw $$0) {
      this.a = cjl.a($$0.p("buy"));
      this.b = cjl.a($$0.p("buyB"));
      this.c = cjl.a($$0.p("sell"));
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

   public coz(cjl $$0, cjl $$1, int $$2, int $$3, float $$4) {
      this($$0, cjl.b, $$1, $$2, $$3, $$4);
   }

   public coz(cjl $$0, cjl $$1, cjl $$2, int $$3, int $$4, float $$5) {
      this($$0, $$1, $$2, 0, $$3, $$4, $$5);
   }

   public coz(cjl $$0, cjl $$1, cjl $$2, int $$3, int $$4, int $$5, float $$6) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0);
   }

   public coz(cjl $$0, cjl $$1, cjl $$2, int $$3, int $$4, int $$5, float $$6, int $$7) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.j = $$5;
      this.i = $$6;
      this.h = $$7;
   }

   private coz(coz $$0) {
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

   public cjl a() {
      return this.a;
   }

   public cjl b() {
      if (this.a.b()) {
         return cjl.b;
      } else {
         int $$0 = this.a.L();
         int $$1 = Math.max(0, asb.d((float)($$0 * this.h) * this.i));
         return this.a.c(asb.a($$0 + $$1 + this.g, 1, this.a.d().l()));
      }
   }

   public cjl c() {
      return this.b;
   }

   public cjl d() {
      return this.c;
   }

   public void e() {
      this.h = this.h + this.d - (this.e - this.d);
   }

   public cjl f() {
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

   public qw t() {
      qw $$0 = new qw();
      $$0.a("buy", this.a.b(new qw()));
      $$0.a("sell", this.c.b(new qw()));
      $$0.a("buyB", this.b.b(new qw()));
      $$0.a("uses", this.d);
      $$0.a("maxUses", this.e);
      $$0.a("rewardExp", this.f);
      $$0.a("xp", this.j);
      $$0.a("priceMultiplier", this.i);
      $$0.a("specialPrice", this.g);
      $$0.a("demand", this.h);
      return $$0;
   }

   public boolean a(cjl $$0, cjl $$1) {
      return this.c($$0, this.b()) && $$0.L() >= this.b().L() && this.c($$1, this.b) && $$1.L() >= this.b.L();
   }

   private boolean c(cjl $$0, cjl $$1) {
      if ($$1.b() && $$0.b()) {
         return true;
      } else {
         cjl $$2 = $$0.p();
         if ($$2.d().o()) {
            $$2.b($$2.k());
         }

         return cjl.b($$2, $$1) && (!$$1.u() || $$2.u() && rj.a($$1.v(), $$2.v(), false));
      }
   }

   public boolean b(cjl $$0, cjl $$1) {
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

   public coz u() {
      return new coz(this);
   }
}
