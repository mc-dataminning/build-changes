public class bjs implements bjt {
   private final bjt c;
   private final bjt d;

   public bjs(bjt $$0, bjt $$1) {
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

   public boolean a(bjt $$0) {
      return this.c == $$0 || this.d == $$0;
   }

   @Override
   public cmx a(int $$0) {
      return $$0 >= this.c.b() ? this.d.a($$0 - this.c.b()) : this.c.a($$0);
   }

   @Override
   public cmx a(int $$0, int $$1) {
      return $$0 >= this.c.b() ? this.d.a($$0 - this.c.b(), $$1) : this.c.a($$0, $$1);
   }

   @Override
   public cmx b(int $$0) {
      return $$0 >= this.c.b() ? this.d.b($$0 - this.c.b()) : this.c.b($$0);
   }

   @Override
   public void a(int $$0, cmx $$1) {
      if ($$0 >= this.c.b()) {
         this.d.a($$0 - this.c.b(), $$1);
      } else {
         this.c.a($$0, $$1);
      }
   }

   @Override
   public int ak_() {
      return this.c.ak_();
   }

   @Override
   public void e() {
      this.c.e();
      this.d.e();
   }

   @Override
   public boolean a(cfh $$0) {
      return this.c.a($$0) && this.d.a($$0);
   }

   @Override
   public void d_(cfh $$0) {
      this.c.d_($$0);
      this.d.d_($$0);
   }

   @Override
   public void c(cfh $$0) {
      this.c.c($$0);
      this.d.c($$0);
   }

   @Override
   public boolean b(int $$0, cmx $$1) {
      return $$0 >= this.c.b() ? this.d.b($$0 - this.c.b(), $$1) : this.c.b($$0, $$1);
   }

   @Override
   public void a() {
      this.c.a();
      this.d.a();
   }
}
