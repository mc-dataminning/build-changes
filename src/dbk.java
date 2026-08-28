public interface dbk extends dat<dbl> {
   @Override
   default daz<?> e() {
      return daz.g;
   }

   @Override
   default boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 1;
   }

   @Override
   default cwf g() {
      return new cwf(dil.ob);
   }

   default boolean a(dbl $$0, dff $$1) {
      return this.a($$0.c()) && this.b($$0.d()) && this.c($$0.e());
   }

   boolean a(cwf var1);

   boolean b(cwf var1);

   boolean c(cwf var1);
}
