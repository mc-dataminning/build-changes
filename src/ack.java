public class ack implements uw<aav> {
   private final gv a;
   private final aep b;
   private final aep c;
   private final aep d;
   private final String e;
   private final ddj.a f;

   public ack(gv $$0, aep $$1, aep $$2, aep $$3, String $$4, ddj.a $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public ack(sh $$0) {
      this.a = $$0.e();
      this.b = $$0.s();
      this.c = $$0.s();
      this.d = $$0.s();
      this.e = $$0.r();
      this.f = ddj.a.a($$0.r()).orElse(ddj.a.b);
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f.c());
   }

   public void a(aav $$0) {
      $$0.a(this);
   }

   public gv a() {
      return this.a;
   }

   public aep d() {
      return this.b;
   }

   public aep e() {
      return this.c;
   }

   public aep f() {
      return this.d;
   }

   public String g() {
      return this.e;
   }

   public ddj.a h() {
      return this.f;
   }
}
