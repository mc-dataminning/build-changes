public class bib implements bhs<bfz> {
   private final int a;
   private final int b;
   private bhr.a c = bhr.a.a;
   private long d;

   public bib(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bhr.a a() {
      return this.c;
   }

   @Override
   public final boolean e(aif $$0, bfz $$1, long $$2) {
      this.c = bhr.a.b;
      int $$3 = this.a + $$0.y_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(aif $$0, bfz $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(aif $$0, bfz $$1, long $$2) {
      this.c = bhr.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
