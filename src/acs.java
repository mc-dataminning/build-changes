public class acs implements ve<abd> {
   private final gw a;
   private final aex b;
   private final aex c;
   private final aex d;
   private final String e;
   private final ddu.a f;

   public acs(gw $$0, aex $$1, aex $$2, aex $$3, String $$4, ddu.a $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public acs(sp $$0) {
      this.a = $$0.e();
      this.b = $$0.s();
      this.c = $$0.s();
      this.d = $$0.s();
      this.e = $$0.r();
      this.f = ddu.a.a($$0.r()).orElse(ddu.a.b);
   }

   @Override
   public void a(sp $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f.c());
   }

   public void a(abd $$0) {
      $$0.a(this);
   }

   public gw a() {
      return this.a;
   }

   public aex d() {
      return this.b;
   }

   public aex e() {
      return this.c;
   }

   public aex f() {
      return this.d;
   }

   public String g() {
      return this.e;
   }

   public ddu.a h() {
      return this.f;
   }
}
