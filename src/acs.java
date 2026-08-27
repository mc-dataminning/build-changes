public class acs implements ve<abd> {
   private final gw a;
   private final aez b;
   private final aez c;
   private final aez d;
   private final String e;
   private final ddy.a f;

   public acs(gw $$0, aez $$1, aez $$2, aez $$3, String $$4, ddy.a $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public acs(so $$0) {
      this.a = $$0.e();
      this.b = $$0.t();
      this.c = $$0.t();
      this.d = $$0.t();
      this.e = $$0.s();
      this.f = ddy.a.a($$0.s()).orElse(ddy.a.b);
   }

   @Override
   public void a(so $$0) {
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

   public aez d() {
      return this.b;
   }

   public aez e() {
      return this.c;
   }

   public aez f() {
      return this.d;
   }

   public String g() {
      return this.e;
   }

   public ddy.a h() {
      return this.f;
   }
}
