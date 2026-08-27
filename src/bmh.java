public abstract class bmh<E extends bjg> implements bky<E>, bom<E> {
   private bkx.a a;

   public bmh() {
      this.a = bkx.a.a;
   }

   @Override
   public final bkx.a a() {
      return this.a;
   }

   @Override
   public final boolean e(akr $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bkx.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(akr $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(akr $$0, E $$1, long $$2) {
      this.a = bkx.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
