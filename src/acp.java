public class acp implements va<aaz> {
   private final gw a;
   private final aeu b;
   private final aeu c;
   private final aeu d;
   private final String e;
   private final ddp.a f;

   public acp(gw $$0, aeu $$1, aeu $$2, aeu $$3, String $$4, ddp.a $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public acp(sl $$0) {
      this.a = $$0.e();
      this.b = $$0.s();
      this.c = $$0.s();
      this.d = $$0.s();
      this.e = $$0.r();
      this.f = ddp.a.a($$0.r()).orElse(ddp.a.b);
   }

   @Override
   public void a(sl $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f.c());
   }

   public void a(aaz $$0) {
      $$0.a(this);
   }

   public gw a() {
      return this.a;
   }

   public aeu d() {
      return this.b;
   }

   public aeu e() {
      return this.c;
   }

   public aeu f() {
      return this.d;
   }

   public String g() {
      return this.e;
   }

   public ddp.a h() {
      return this.f;
   }
}
