public class ahd implements yp<afn> {
   public static final yg<vi, ahd> a = yp.a(ahd::a, ahd::new);
   private final id b;
   private final ajv c;
   private final ajv d;
   private final ajv e;
   private final String f;
   private final dno.a g;
   private final int h;
   private final int i;

   public ahd(id $$0, ajv $$1, ajv $$2, ajv $$3, String $$4, dno.a $$5, int $$6, int $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   private ahd(vi $$0) {
      this.b = $$0.e();
      this.c = $$0.q();
      this.d = $$0.q();
      this.e = $$0.q();
      this.f = $$0.p();
      this.g = dno.a.a($$0.p()).orElse(dno.a.b);
      this.h = $$0.l();
      this.i = $$0.l();
   }

   private void a(vi $$0) {
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
   public yr<ahd> a() {
      return afl.bV;
   }

   public void a(afn $$0) {
      $$0.a(this);
   }

   public id b() {
      return this.b;
   }

   public ajv e() {
      return this.c;
   }

   public ajv f() {
      return this.d;
   }

   public ajv g() {
      return this.e;
   }

   public String h() {
      return this.f;
   }

   public dno.a i() {
      return this.g;
   }

   public int j() {
      return this.h;
   }

   public int k() {
      return this.i;
   }
}
