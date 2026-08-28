public class bqm implements bqn {
   private final bqn b;
   private final bqn c;

   public bqm(bqn $$0, bqn $$1) {
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

   public boolean a(bqn $$0) {
      return this.b == $$0 || this.c == $$0;
   }

   @Override
   public cup a(int $$0) {
      return $$0 >= this.b.b() ? this.c.a($$0 - this.b.b()) : this.b.a($$0);
   }

   @Override
   public cup a(int $$0, int $$1) {
      return $$0 >= this.b.b() ? this.c.a($$0 - this.b.b(), $$1) : this.b.a($$0, $$1);
   }

   @Override
   public cup b(int $$0) {
      return $$0 >= this.b.b() ? this.c.b($$0 - this.b.b()) : this.b.b($$0);
   }

   @Override
   public void a(int $$0, cup $$1) {
      if ($$0 >= this.b.b()) {
         this.c.a($$0 - this.b.b(), $$1);
      } else {
         this.b.a($$0, $$1);
      }
   }

   @Override
   public int ah_() {
      return this.b.ah_();
   }

   @Override
   public void e() {
      this.b.e();
      this.c.e();
   }

   @Override
   public boolean a(cmx $$0) {
      return this.b.a($$0) && this.c.a($$0);
   }

   @Override
   public void d_(cmx $$0) {
      this.b.d_($$0);
      this.c.d_($$0);
   }

   @Override
   public void c(cmx $$0) {
      this.b.c($$0);
      this.c.c($$0);
   }

   @Override
   public boolean b(int $$0, cup $$1) {
      return $$0 >= this.b.b() ? this.c.b($$0 - this.b.b(), $$1) : this.b.b($$0, $$1);
   }

   @Override
   public void a() {
      this.b.a();
      this.c.a();
   }
}
