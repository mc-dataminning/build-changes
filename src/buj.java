public class buj implements buk {
   private final buk b;
   private final buk c;

   public buj(buk $$0, buk $$1) {
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

   public boolean a(buk $$0) {
      return this.b == $$0 || this.c == $$0;
   }

   @Override
   public czy a(int $$0) {
      return $$0 >= this.b.b() ? this.c.a($$0 - this.b.b()) : this.b.a($$0);
   }

   @Override
   public czy a(int $$0, int $$1) {
      return $$0 >= this.b.b() ? this.c.a($$0 - this.b.b(), $$1) : this.b.a($$0, $$1);
   }

   @Override
   public czy b(int $$0) {
      return $$0 >= this.b.b() ? this.c.b($$0 - this.b.b()) : this.b.b($$0);
   }

   @Override
   public void a(int $$0, czy $$1) {
      if ($$0 >= this.b.b()) {
         this.c.a($$0 - this.b.b(), $$1);
      } else {
         this.b.a($$0, $$1);
      }
   }

   @Override
   public int ao_() {
      return this.b.ao_();
   }

   @Override
   public void e() {
      this.b.e();
      this.c.e();
   }

   @Override
   public boolean a(crx $$0) {
      return this.b.a($$0) && this.c.a($$0);
   }

   @Override
   public void c_(crx $$0) {
      this.b.c_($$0);
      this.c.c_($$0);
   }

   @Override
   public void c(crx $$0) {
      this.b.c($$0);
      this.c.c($$0);
   }

   @Override
   public boolean b(int $$0, czy $$1) {
      return $$0 >= this.b.b() ? this.c.b($$0 - this.b.b(), $$1) : this.b.b($$0, $$1);
   }

   @Override
   public void a() {
      this.b.a();
      this.c.a();
   }
}
