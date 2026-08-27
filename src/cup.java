public class cup {
   public static final xo<vb, cup> a = xo.a(cup::a, cup::a);
   private final cpd b;
   private final cpd c;
   private final cpd d;
   private int e;
   private final int f;
   private boolean g = true;
   private int h;
   private int i;
   private float j;
   private int k = 1;
   private final boolean l;

   public cup(sw $$0) {
      this.b = cpd.a($$0.p("buy"));
      this.c = cpd.a($$0.p("buyB"));
      this.d = cpd.a($$0.p("sell"));
      this.e = $$0.h("uses");
      if ($$0.b("maxUses", 99)) {
         this.f = $$0.h("maxUses");
      } else {
         this.f = 4;
      }

      if ($$0.b("rewardExp", 1)) {
         this.g = $$0.q("rewardExp");
      }

      if ($$0.b("xp", 3)) {
         this.k = $$0.h("xp");
      }

      if ($$0.b("priceMultiplier", 5)) {
         this.j = $$0.j("priceMultiplier");
      }

      this.h = $$0.h("specialPrice");
      this.i = $$0.h("demand");
      this.l = $$0.q("ignore_tags");
   }

   public cup(cpd $$0, cpd $$1, int $$2, int $$3, float $$4) {
      this($$0, cpd.h, $$1, $$2, $$3, $$4);
   }

   public cup(cpd $$0, cpd $$1, cpd $$2, int $$3, int $$4, float $$5) {
      this($$0, $$1, $$2, 0, $$3, $$4, $$5);
   }

   public cup(cpd $$0, cpd $$1, cpd $$2, int $$3, int $$4, int $$5, float $$6) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0);
   }

   public cup(cpd $$0, cpd $$1, cpd $$2, int $$3, int $$4, int $$5, float $$6, int $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, false);
   }

   public cup(cpd $$0, cpd $$1, cpd $$2, int $$3, int $$4, int $$5, float $$6, int $$7, boolean $$8) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.k = $$5;
      this.j = $$6;
      this.i = $$7;
      this.l = $$8;
   }

   private cup(cup $$0) {
      this.b = $$0.b.q();
      this.c = $$0.c.q();
      this.d = $$0.d.q();
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
      this.j = $$0.j;
      this.k = $$0.k;
      this.l = $$0.l;
   }

   public cpd a() {
      return this.b;
   }

   public cpd b() {
      if (this.b.b()) {
         return cpd.h;
      } else {
         int $$0 = this.b.M();
         int $$1 = Math.max(0, awi.d((float)($$0 * this.i) * this.j));
         return this.b.c(awi.a($$0 + $$1 + this.h, 1, this.b.d().k()));
      }
   }

   public cpd c() {
      return this.c;
   }

   public cpd d() {
      return this.d;
   }

   public void e() {
      this.i = this.i + this.e - (this.f - this.e);
   }

   public cpd f() {
      return this.d.q();
   }

   public int g() {
      return this.e;
   }

   public void h() {
      this.e = 0;
   }

   public int i() {
      return this.f;
   }

   public void j() {
      this.e++;
   }

   public int k() {
      return this.i;
   }

   public boolean l() {
      return this.l;
   }

   public void a(int $$0) {
      this.h += $$0;
   }

   public void m() {
      this.h = 0;
   }

   public int n() {
      return this.h;
   }

   public void b(int $$0) {
      this.h = $$0;
   }

   public float o() {
      return this.j;
   }

   public int p() {
      return this.k;
   }

   public boolean q() {
      return this.e >= this.f;
   }

   public void r() {
      this.e = this.f;
   }

   public boolean s() {
      return this.e > 0;
   }

   public boolean t() {
      return this.g;
   }

   public sw u() {
      sw $$0 = new sw();
      $$0.a("buy", this.b.b(new sw()));
      $$0.a("sell", this.d.b(new sw()));
      $$0.a("buyB", this.c.b(new sw()));
      $$0.a("uses", this.e);
      $$0.a("maxUses", this.f);
      $$0.a("rewardExp", this.g);
      $$0.a("xp", this.k);
      $$0.a("priceMultiplier", this.j);
      $$0.a("specialPrice", this.h);
      $$0.a("demand", this.i);
      $$0.a("ignore_tags", this.l);
      return $$0;
   }

   public boolean a(cpd $$0, cpd $$1) {
      return a($$0, this.b(), this.l) && $$0.M() >= this.b().M() && a($$1, this.c, this.l) && $$1.M() >= this.c.M();
   }

   public static boolean a(cpd $$0, cpd $$1, boolean $$2) {
      if ($$1.b() && $$0.b()) {
         return true;
      } else {
         cpd $$3 = $$0.q();
         cpd $$4 = $$1.q();
         if ($$3.d().n()) {
            $$3.b($$3.l());
         }

         return $$2 ? cpd.b($$3, $$4) : cpd.b($$3, $$4) && (!$$4.v() || $$3.v() && tl.a($$4.w(), $$3.w(), false));
      }
   }

   public boolean b(cpd $$0, cpd $$1) {
      if (!this.a($$0, $$1)) {
         return false;
      } else {
         $$0.h(this.b().M());
         if (!this.c().b()) {
            $$1.h(this.c().M());
         }

         return true;
      }
   }

   public cup v() {
      return new cup(this);
   }

   private static void a(vb $$0, cup $$1) {
      cpd.f.encode($$0, $$1.a());
      cpd.f.encode($$0, $$1.d());
      cpd.f.encode($$0, $$1.c());
      $$0.a($$1.q());
      $$0.p($$1.g());
      $$0.p($$1.i());
      $$0.p($$1.p());
      $$0.p($$1.n());
      $$0.a($$1.o());
      $$0.p($$1.k());
      $$0.a($$1.l());
   }

   public static cup a(vb $$0) {
      cpd $$1 = cpd.f.decode($$0);
      cpd $$2 = cpd.f.decode($$0);
      cpd $$3 = cpd.f.decode($$0);
      boolean $$4 = $$0.readBoolean();
      int $$5 = $$0.readInt();
      int $$6 = $$0.readInt();
      int $$7 = $$0.readInt();
      int $$8 = $$0.readInt();
      float $$9 = $$0.readFloat();
      int $$10 = $$0.readInt();
      boolean $$11 = $$0.readBoolean();
      cup $$12 = new cup($$1, $$3, $$2, $$5, $$6, $$7, $$9, $$10, $$11);
      if ($$4) {
         $$12.r();
      }

      $$12.b($$8);
      return $$12;
   }
}
