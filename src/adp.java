public class adp implements wb<aca> {
   private final ht a;
   private final afw b;
   private final afw c;
   private final afw d;
   private final String e;
   private final dew.a f;

   public adp(ht $$0, afw $$1, afw $$2, afw $$3, String $$4, dew.a $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public adp(tl $$0) {
      this.a = $$0.e();
      this.b = $$0.t();
      this.c = $$0.t();
      this.d = $$0.t();
      this.e = $$0.s();
      this.f = dew.a.a($$0.s()).orElse(dew.a.b);
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f.c());
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public ht a() {
      return this.a;
   }

   public afw d() {
      return this.b;
   }

   public afw e() {
      return this.c;
   }

   public afw f() {
      return this.d;
   }

   public String g() {
      return this.e;
   }

   public dew.a h() {
      return this.f;
   }
}
