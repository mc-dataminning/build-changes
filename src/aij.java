public class aij implements zk<agq> {
   public static final zb<wa, aij> a = zk.a(aij::a, aij::new);
   private final je b;
   private final alc c;
   private final alc d;
   private final alc e;
   private final String f;
   private final dsu.a g;
   private final int h;
   private final int i;

   public aij(je $$0, alc $$1, alc $$2, alc $$3, String $$4, dsu.a $$5, int $$6, int $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   private aij(wa $$0) {
      this.b = $$0.e();
      this.c = $$0.q();
      this.d = $$0.q();
      this.e = $$0.q();
      this.f = $$0.p();
      this.g = dsu.a.a($$0.p()).orElse(dsu.a.b);
      this.h = $$0.l();
      this.i = $$0.l();
   }

   private void a(wa $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g.c());
      $$0.c(this.h);
      $$0.c(this.i);
   }

   @Override
   public zm<aij> a() {
      return ago.ca;
   }

   public void a(agq $$0) {
      $$0.a(this);
   }

   public je b() {
      return this.b;
   }

   public alc e() {
      return this.c;
   }

   public alc f() {
      return this.d;
   }

   public alc g() {
      return this.e;
   }

   public String h() {
      return this.f;
   }

   public dsu.a i() {
      return this.g;
   }

   public int j() {
      return this.h;
   }

   public int k() {
      return this.i;
   }
}
