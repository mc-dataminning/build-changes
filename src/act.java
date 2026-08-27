public class act implements vf<abe> {
   private final gw a;
   private final aey b;
   private final aey c;
   private final aey d;
   private final String e;
   private final ddw.a f;

   public act(gw $$0, aey $$1, aey $$2, aey $$3, String $$4, ddw.a $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public act(sq $$0) {
      this.a = $$0.e();
      this.b = $$0.s();
      this.c = $$0.s();
      this.d = $$0.s();
      this.e = $$0.r();
      this.f = ddw.a.a($$0.r()).orElse(ddw.a.b);
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f.c());
   }

   public void a(abe $$0) {
      $$0.a(this);
   }

   public gw a() {
      return this.a;
   }

   public aey d() {
      return this.b;
   }

   public aey e() {
      return this.c;
   }

   public aey f() {
      return this.d;
   }

   public String g() {
      return this.e;
   }

   public ddw.a h() {
      return this.f;
   }
}
