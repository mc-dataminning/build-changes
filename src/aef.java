public class aef implements wo<acp> {
   private final hx a;
   private final agm b;
   private final agm c;
   private final agm d;
   private final String e;
   private final dgi.a f;
   private final int g;
   private final int h;

   public aef(hx $$0, agm $$1, agm $$2, agm $$3, String $$4, dgi.a $$5, int $$6, int $$7) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
      this.h = $$7;
   }

   public aef(ty $$0) {
      this.a = $$0.e();
      this.b = $$0.t();
      this.c = $$0.t();
      this.d = $$0.t();
      this.e = $$0.s();
      this.f = dgi.a.a($$0.s()).orElse(dgi.a.b);
      this.g = $$0.n();
      this.h = $$0.n();
   }

   @Override
   public void a(ty $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f.c());
      $$0.c(this.g);
      $$0.c(this.h);
   }

   public void a(acp $$0) {
      $$0.a(this);
   }

   public hx a() {
      return this.a;
   }

   public agm d() {
      return this.b;
   }

   public agm e() {
      return this.c;
   }

   public agm f() {
      return this.d;
   }

   public String g() {
      return this.e;
   }

   public dgi.a h() {
      return this.f;
   }

   public int i() {
      return this.g;
   }

   public int j() {
      return this.h;
   }
}
