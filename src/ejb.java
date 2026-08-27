public class ejb {
   private final eje a;
   private final String b;
   private final ejh c;
   private ui d;
   private ui e;
   private ejh.a f;

   public ejb(eje $$0, String $$1, ejh $$2, ui $$3, ejh.a $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.g();
      this.f = $$4;
   }

   public eje a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public ejh c() {
      return this.c;
   }

   public ui d() {
      return this.d;
   }

   private ui g() {
      return ul.a((ui)this.d.f().a($$0 -> $$0.a(new uo(uo.a.a, ui.b(this.b)))));
   }

   public ui e() {
      return this.e;
   }

   public void a(ui $$0) {
      this.d = $$0;
      this.e = this.g();
      this.a.b(this);
   }

   public ejh.a f() {
      return this.f;
   }

   public void a(ejh.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }
}
