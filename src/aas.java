public class aas implements uo<zb> {
   private final gu a;
   private final acq b;
   private final acq c;
   private final acq d;
   private final String e;
   private final dam.a f;

   public aas(gu $$0, acq $$1, acq $$2, acq $$3, String $$4, dam.a $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public aas(sf $$0) {
      this.a = $$0.f();
      this.b = $$0.t();
      this.c = $$0.t();
      this.d = $$0.t();
      this.e = $$0.s();
      this.f = dam.a.a($$0.s()).orElse(dam.a.b);
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f.c());
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public gu a() {
      return this.a;
   }

   public acq c() {
      return this.b;
   }

   public acq d() {
      return this.c;
   }

   public acq e() {
      return this.d;
   }

   public String f() {
      return this.e;
   }

   public dam.a g() {
      return this.f;
   }
}
