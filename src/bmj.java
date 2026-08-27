public abstract class bmj<E extends bji> implements bla<E>, boo<E> {
   private bkz.a a;

   public bmj() {
      this.a = bkz.a.a;
   }

   @Override
   public final bkz.a a() {
      return this.a;
   }

   @Override
   public final boolean e(aks $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bkz.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aks $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(aks $$0, E $$1, long $$2) {
      this.a = bkz.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
