public class eia {
   private final eid a;
   private final String b;
   private final eig c;
   private tf d;
   private tf e;
   private eig.a f;

   public eia(eid $$0, String $$1, eig $$2, tf $$3, eig.a $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.g();
      this.f = $$4;
   }

   public eid a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public eig c() {
      return this.c;
   }

   public tf d() {
      return this.d;
   }

   private tf g() {
      return th.a((tf)this.d.e().a($$0 -> $$0.a(new tk(tk.a.a, tf.b(this.b)))));
   }

   public tf e() {
      return this.e;
   }

   public void a(tf $$0) {
      this.d = $$0;
      this.e = this.g();
      this.a.b(this);
   }

   public eig.a f() {
      return this.f;
   }

   public void a(eig.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }
}
