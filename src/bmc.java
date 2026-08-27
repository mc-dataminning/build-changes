public abstract class bmc<E extends bjb> implements bkt<E>, boh<E> {
   private bks.a a;

   public bmc() {
      this.a = bks.a.a;
   }

   @Override
   public final bks.a a() {
      return this.a;
   }

   @Override
   public final boolean e(akn $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bks.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(akn $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(akn $$0, E $$1, long $$2) {
      this.a = bks.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
