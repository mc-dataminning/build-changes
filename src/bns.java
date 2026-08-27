public class bns implements bnt {
   private final bnt c;
   private final bnt d;

   public bns(bnt $$0, bnt $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public int b() {
      return this.c.b() + this.d.b();
   }

   @Override
   public boolean ah_() {
      return this.c.ah_() && this.d.ah_();
   }

   public boolean a(bnt $$0) {
      return this.c == $$0 || this.d == $$0;
   }

   @Override
   public crj a(int $$0) {
      return $$0 >= this.c.b() ? this.d.a($$0 - this.c.b()) : this.c.a($$0);
   }

   @Override
   public crj a(int $$0, int $$1) {
      return $$0 >= this.c.b() ? this.d.a($$0 - this.c.b(), $$1) : this.c.a($$0, $$1);
   }

   @Override
   public crj b(int $$0) {
      return $$0 >= this.c.b() ? this.d.b($$0 - this.c.b()) : this.c.b($$0);
   }

   @Override
   public void a(int $$0, crj $$1) {
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
   public boolean a(cjt $$0) {
      return this.c.a($$0) && this.d.a($$0);
   }

   @Override
   public void d_(cjt $$0) {
      this.c.d_($$0);
      this.d.d_($$0);
   }

   @Override
   public void c(cjt $$0) {
      this.c.c($$0);
      this.d.c($$0);
   }

   @Override
   public boolean b(int $$0, crj $$1) {
      return $$0 >= this.c.b() ? this.d.b($$0 - this.c.b(), $$1) : this.c.b($$0, $$1);
   }

   @Override
   public void a() {
      this.c.a();
      this.d.a();
   }
}
