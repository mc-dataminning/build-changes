public class aeb implements wk<acl> {
   private final ht a;
   private final agi b;
   private final agi c;
   private final agi d;
   private final String e;
   private final dgd.a f;
   private final int g;
   private final int h;

   public aeb(ht $$0, agi $$1, agi $$2, agi $$3, String $$4, dgd.a $$5, int $$6, int $$7) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
      this.h = $$7;
   }

   public aeb(tu $$0) {
      this.a = $$0.e();
      this.b = $$0.t();
      this.c = $$0.t();
      this.d = $$0.t();
      this.e = $$0.s();
      this.f = dgd.a.a($$0.s()).orElse(dgd.a.b);
      this.g = $$0.n();
      this.h = $$0.n();
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f.c());
      $$0.c(this.g);
      $$0.c(this.h);
   }

   public void a(acl $$0) {
      $$0.a(this);
   }

   public ht a() {
      return this.a;
   }

   public agi d() {
      return this.b;
   }

   public agi e() {
      return this.c;
   }

   public agi f() {
      return this.d;
   }

   public String g() {
      return this.e;
   }

   public dgd.a h() {
      return this.f;
   }

   public int i() {
      return this.g;
   }

   public int j() {
      return this.h;
   }
}
