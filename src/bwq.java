public abstract class bwq<E extends btl> implements bvg<E>, byv<E> {
   private bvf.a a;

   public bwq() {
      this.a = bvf.a.a;
   }

   @Override
   public final bvf.a a() {
      return this.a;
   }

   @Override
   public final boolean e(aqt $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bvf.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aqt $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(aqt $$0, E $$1, long $$2) {
      this.a = bvf.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
