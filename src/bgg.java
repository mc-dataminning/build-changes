public class bgg implements bgh {
   private final bgh c;
   private final bgh d;

   public bgg(bgh $$0, bgh $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public int b() {
      return this.c.b() + this.d.b();
   }

   @Override
   public boolean ab_() {
      return this.c.ab_() && this.d.ab_();
   }

   public boolean a(bgh $$0) {
      return this.c == $$0 || this.d == $$0;
   }

   @Override
   public ciw a(int $$0) {
      return $$0 >= this.c.b() ? this.d.a($$0 - this.c.b()) : this.c.a($$0);
   }

   @Override
   public ciw a(int $$0, int $$1) {
      return $$0 >= this.c.b() ? this.d.a($$0 - this.c.b(), $$1) : this.c.a($$0, $$1);
   }

   @Override
   public ciw b(int $$0) {
      return $$0 >= this.c.b() ? this.d.b($$0 - this.c.b()) : this.c.b($$0);
   }

   @Override
   public void a(int $$0, ciw $$1) {
      if ($$0 >= this.c.b()) {
         this.d.a($$0 - this.c.b(), $$1);
      } else {
         this.c.a($$0, $$1);
      }
   }

   @Override
   public int ac_() {
      return this.c.ac_();
   }

   @Override
   public void e() {
      this.c.e();
      this.d.e();
   }

   @Override
   public boolean a(cbl $$0) {
      return this.c.a($$0) && this.d.a($$0);
   }

   @Override
   public void d_(cbl $$0) {
      this.c.d_($$0);
      this.d.d_($$0);
   }

   @Override
   public void c(cbl $$0) {
      this.c.c($$0);
      this.d.c($$0);
   }

   @Override
   public boolean b(int $$0, ciw $$1) {
      return $$0 >= this.c.b() ? this.d.b($$0 - this.c.b(), $$1) : this.c.b($$0, $$1);
   }

   @Override
   public void a() {
      this.c.a();
      this.d.a();
   }
}
