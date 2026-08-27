public class aez implements xf<adj> {
   private final hx a;
   private final ahg b;
   private final ahg c;
   private final ahg d;
   private final String e;
   private final dhv.a f;
   private final int g;
   private final int h;

   public aez(hx $$0, ahg $$1, ahg $$2, ahg $$3, String $$4, dhv.a $$5, int $$6, int $$7) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
      this.h = $$7;
   }

   public aez(ui $$0) {
      this.a = $$0.e();
      this.b = $$0.t();
      this.c = $$0.t();
      this.d = $$0.t();
      this.e = $$0.s();
      this.f = dhv.a.a($$0.s()).orElse(dhv.a.b);
      this.g = $$0.n();
      this.h = $$0.n();
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f.c());
      $$0.c(this.g);
      $$0.c(this.h);
   }

   public void a(adj $$0) {
      $$0.a(this);
   }

   public hx a() {
      return this.a;
   }

   public ahg d() {
      return this.b;
   }

   public ahg e() {
      return this.c;
   }

   public ahg f() {
      return this.d;
   }

   public String g() {
      return this.e;
   }

   public dhv.a h() {
      return this.f;
   }

   public int i() {
      return this.g;
   }

   public int j() {
      return this.h;
   }
}
