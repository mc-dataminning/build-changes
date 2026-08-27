public class bht implements bhu {
   private final bhu c;
   private final bhu d;

   public bht(bhu $$0, bhu $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public int b() {
      return this.c.b() + this.d.b();
   }

   @Override
   public boolean ai_() {
      return this.c.ai_() && this.d.ai_();
   }

   public boolean a(bhu $$0) {
      return this.c == $$0 || this.d == $$0;
   }

   @Override
   public ckj a(int $$0) {
      return $$0 >= this.c.b() ? this.d.a($$0 - this.c.b()) : this.c.a($$0);
   }

   @Override
   public ckj a(int $$0, int $$1) {
      return $$0 >= this.c.b() ? this.d.a($$0 - this.c.b(), $$1) : this.c.a($$0, $$1);
   }

   @Override
   public ckj b(int $$0) {
      return $$0 >= this.c.b() ? this.d.b($$0 - this.c.b()) : this.c.b($$0);
   }

   @Override
   public void a(int $$0, ckj $$1) {
      if ($$0 >= this.c.b()) {
         this.d.a($$0 - this.c.b(), $$1);
      } else {
         this.c.a($$0, $$1);
      }
   }

   @Override
   public int aj_() {
      return this.c.aj_();
   }

   @Override
   public void e() {
      this.c.e();
      this.d.e();
   }

   @Override
   public boolean a(ccx $$0) {
      return this.c.a($$0) && this.d.a($$0);
   }

   @Override
   public void d_(ccx $$0) {
      this.c.d_($$0);
      this.d.d_($$0);
   }

   @Override
   public void c(ccx $$0) {
      this.c.c($$0);
      this.d.c($$0);
   }

   @Override
   public boolean b(int $$0, ckj $$1) {
      return $$0 >= this.c.b() ? this.d.b($$0 - this.c.b(), $$1) : this.c.b($$0, $$1);
   }

   @Override
   public void a() {
      this.c.a();
      this.d.a();
   }
}
