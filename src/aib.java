public class aib implements zl<agl> {
   public static final zc<we, aib> a = zl.a(aib::a, aib::new);
   private final ir b;
   private final akt c;
   private final akt d;
   private final akt e;
   private final String f;
   private final dre.a g;
   private final int h;
   private final int i;

   public aib(ir $$0, akt $$1, akt $$2, akt $$3, String $$4, dre.a $$5, int $$6, int $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   private aib(we $$0) {
      this.b = $$0.e();
      this.c = $$0.q();
      this.d = $$0.q();
      this.e = $$0.q();
      this.f = $$0.p();
      this.g = dre.a.a($$0.p()).orElse(dre.a.b);
      this.h = $$0.l();
      this.i = $$0.l();
   }

   private void a(we $$0) {
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
   public zn<aib> a() {
      return agj.bX;
   }

   public void a(agl $$0) {
      $$0.a(this);
   }

   public ir b() {
      return this.b;
   }

   public akt e() {
      return this.c;
   }

   public akt f() {
      return this.d;
   }

   public akt g() {
      return this.e;
   }

   public String h() {
      return this.f;
   }

   public dre.a i() {
      return this.g;
   }

   public int j() {
      return this.h;
   }

   public int k() {
      return this.i;
   }
}
