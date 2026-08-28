public class buu implements buv {
   private final buv b;
   private final buv c;

   public buu(buv $$0, buv $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public int b() {
      return this.b.b() + this.c.b();
   }

   @Override
   public boolean c() {
      return this.b.c() && this.c.c();
   }

   public boolean a(buv $$0) {
      return this.b == $$0 || this.c == $$0;
   }

   @Override
   public dak a(int $$0) {
      return $$0 >= this.b.b() ? this.c.a($$0 - this.b.b()) : this.b.a($$0);
   }

   @Override
   public dak a(int $$0, int $$1) {
      return $$0 >= this.b.b() ? this.c.a($$0 - this.b.b(), $$1) : this.b.a($$0, $$1);
   }

   @Override
   public dak b(int $$0) {
      return $$0 >= this.b.b() ? this.c.b($$0 - this.b.b()) : this.b.b($$0);
   }

   @Override
   public void a(int $$0, dak $$1) {
      if ($$0 >= this.b.b()) {
         this.c.a($$0 - this.b.b(), $$1);
      } else {
         this.b.a($$0, $$1);
      }
   }

   @Override
   public int ak_() {
      return this.b.ak_();
   }

   @Override
   public void e() {
      this.b.e();
      this.c.e();
   }

   @Override
   public boolean a(csi $$0) {
      return this.b.a($$0) && this.c.a($$0);
   }

   @Override
   public void c_(csi $$0) {
      this.b.c_($$0);
      this.c.c_($$0);
   }

   @Override
   public void c(csi $$0) {
      this.b.c($$0);
      this.c.c($$0);
   }

   @Override
   public boolean b(int $$0, dak $$1) {
      return $$0 >= this.b.b() ? this.c.b($$0 - this.b.b(), $$1) : this.b.b($$0, $$1);
   }

   @Override
   public void a() {
      this.b.a();
      this.c.a();
   }
}
