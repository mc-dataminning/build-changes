public class bgi implements bgj {
   private final bgj c;
   private final bgj d;

   public bgi(bgj $$0, bgj $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public int b() {
      return this.c.b() + this.d.b();
   }

   @Override
   public boolean aa_() {
      return this.c.aa_() && this.d.aa_();
   }

   public boolean a(bgj $$0) {
      return this.c == $$0 || this.d == $$0;
   }

   @Override
   public cix a(int $$0) {
      return $$0 >= this.c.b() ? this.d.a($$0 - this.c.b()) : this.c.a($$0);
   }

   @Override
   public cix a(int $$0, int $$1) {
      return $$0 >= this.c.b() ? this.d.a($$0 - this.c.b(), $$1) : this.c.a($$0, $$1);
   }

   @Override
   public cix b(int $$0) {
      return $$0 >= this.c.b() ? this.d.b($$0 - this.c.b()) : this.c.b($$0);
   }

   @Override
   public void a(int $$0, cix $$1) {
      if ($$0 >= this.c.b()) {
         this.d.a($$0 - this.c.b(), $$1);
      } else {
         this.c.a($$0, $$1);
      }
   }

   @Override
   public int ab_() {
      return this.c.ab_();
   }

   @Override
   public void e() {
      this.c.e();
      this.d.e();
   }

   @Override
   public boolean a(cbm $$0) {
      return this.c.a($$0) && this.d.a($$0);
   }

   @Override
   public void d_(cbm $$0) {
      this.c.d_($$0);
      this.d.d_($$0);
   }

   @Override
   public void c(cbm $$0) {
      this.c.c($$0);
      this.d.c($$0);
   }

   @Override
   public boolean b(int $$0, cix $$1) {
      return $$0 >= this.c.b() ? this.d.b($$0 - this.c.b(), $$1) : this.c.b($$0, $$1);
   }

   @Override
   public void a() {
      this.c.a();
      this.d.a();
   }
}
