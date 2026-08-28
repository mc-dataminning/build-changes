public abstract class cag<E extends bxe> implements byw<E>, ccl<E> {
   private byv.a a;

   public cag() {
      this.a = byv.a.a;
   }

   @Override
   public final byv.a a() {
      return this.a;
   }

   @Override
   public final boolean e(arq $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = byv.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(arq $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(arq $$0, E $$1, long $$2) {
      this.a = byv.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
