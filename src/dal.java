public interface dal extends czt<dam> {
   @Override
   default czz<?> e() {
      return czz.g;
   }

   @Override
   default boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 1;
   }

   @Override
   default cvl g() {
      return new cvl(dgx.ob);
   }

   default boolean a(dam $$0, dds $$1) {
      return this.a($$0.c()) && this.b($$0.d()) && this.c($$0.e());
   }

   boolean a(cvl var1);

   boolean b(cvl var1);

   boolean c(cvl var1);
}
