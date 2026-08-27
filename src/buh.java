public abstract class buh<E extends bre> implements bsx<E>, bwm<E> {
   private bsw.a a;

   public buh() {
      this.a = bsw.a.a;
   }

   @Override
   public final bsw.a a() {
      return this.a;
   }

   @Override
   public final boolean e(aqe $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bsw.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aqe $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(aqe $$0, E $$1, long $$2) {
      this.a = bsw.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
