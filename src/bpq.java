public abstract class bpq<E extends bmo> implements bog<E>, brv<E> {
   private bof.a a;

   public bpq() {
      this.a = bof.a.a;
   }

   @Override
   public final bof.a a() {
      return this.a;
   }

   @Override
   public final boolean e(ane $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bof.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(ane $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(ane $$0, E $$1, long $$2) {
      this.a = bof.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
