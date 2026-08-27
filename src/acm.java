public class acm implements ux<aaw> {
   private final gu a;
   private final aer b;
   private final aer c;
   private final aer d;
   private final String e;
   private final ddl.a f;

   public acm(gu $$0, aer $$1, aer $$2, aer $$3, String $$4, ddl.a $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public acm(si $$0) {
      this.a = $$0.e();
      this.b = $$0.s();
      this.c = $$0.s();
      this.d = $$0.s();
      this.e = $$0.r();
      this.f = ddl.a.a($$0.r()).orElse(ddl.a.b);
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f.c());
   }

   public void a(aaw $$0) {
      $$0.a(this);
   }

   public gu a() {
      return this.a;
   }

   public aer d() {
      return this.b;
   }

   public aer e() {
      return this.c;
   }

   public aer f() {
      return this.d;
   }

   public String g() {
      return this.e;
   }

   public ddl.a h() {
      return this.f;
   }
}
