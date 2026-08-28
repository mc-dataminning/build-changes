public class ces extends cdr {
   private final boolean a;
   private int b;

   public ces(bxg $$0, boolean $$1) {
      super($$0);
      this.d = $$0;
      this.a = $$1;
   }

   @Override
   public boolean c() {
      return this.a && this.b > 0 && super.c();
   }

   @Override
   public void d() {
      this.b = 20;
      this.a(true);
   }

   @Override
   public void e() {
      this.a(false);
   }

   @Override
   public void a() {
      this.b--;
      super.a();
   }
}
