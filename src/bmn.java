public abstract class bmn<E extends bjm> implements ble<E>, bos<E> {
   private bld.a a;

   public bmn() {
      this.a = bld.a.a;
   }

   @Override
   public final bld.a a() {
      return this.a;
   }

   @Override
   public final boolean e(akt $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bld.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(akt $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(akt $$0, E $$1, long $$2) {
      this.a = bld.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
