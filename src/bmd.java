public class bmd implements bme {
   private final bme c;
   private final bme d;

   public bmd(bme $$0, bme $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public int b() {
      return this.c.b() + this.d.b();
   }

   @Override
   public boolean aj_() {
      return this.c.aj_() && this.d.aj_();
   }

   public boolean a(bme $$0) {
      return this.c == $$0 || this.d == $$0;
   }

   @Override
   public cpq a(int $$0) {
      return $$0 >= this.c.b() ? this.d.a($$0 - this.c.b()) : this.c.a($$0);
   }

   @Override
   public cpq a(int $$0, int $$1) {
      return $$0 >= this.c.b() ? this.d.a($$0 - this.c.b(), $$1) : this.c.a($$0, $$1);
   }

   @Override
   public cpq b(int $$0) {
      return $$0 >= this.c.b() ? this.d.b($$0 - this.c.b()) : this.c.b($$0);
   }

   @Override
   public void a(int $$0, cpq $$1) {
      if ($$0 >= this.c.b()) {
         this.d.a($$0 - this.c.b(), $$1);
      } else {
         this.c.a($$0, $$1);
      }
   }

   @Override
   public int al_() {
      return this.c.al_();
   }

   @Override
   public void e() {
      this.c.e();
      this.d.e();
   }

   @Override
   public boolean a(cia $$0) {
      return this.c.a($$0) && this.d.a($$0);
   }

   @Override
   public void d_(cia $$0) {
      this.c.d_($$0);
      this.d.d_($$0);
   }

   @Override
   public void c(cia $$0) {
      this.c.c($$0);
      this.d.c($$0);
   }

   @Override
   public boolean b(int $$0, cpq $$1) {
      return $$0 >= this.c.b() ? this.d.b($$0 - this.c.b(), $$1) : this.c.b($$0, $$1);
   }

   @Override
   public void a() {
      this.c.a();
      this.d.a();
   }
}
