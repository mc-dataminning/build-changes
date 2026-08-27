public abstract class bjb<E extends bfz> implements bhs<E>, blg<E> {
   private bhr.a a;

   public bjb() {
      this.a = bhr.a.a;
   }

   @Override
   public final bhr.a a() {
      return this.a;
   }

   @Override
   public final boolean e(aif $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bhr.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aif $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(aif $$0, E $$1, long $$2) {
      this.a = bhr.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
