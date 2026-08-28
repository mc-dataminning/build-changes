public interface dbh extends dap<dbi> {
   @Override
   default dav<?> e() {
      return dav.g;
   }

   @Override
   default boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 1;
   }

   @Override
   default cwb g() {
      return new cwb(dig.ob);
   }

   default boolean a(dbi $$0, dfb $$1) {
      return this.a($$0.c()) && this.b($$0.d()) && this.c($$0.e());
   }

   boolean a(cwb var1);

   boolean b(cwb var1);

   boolean c(cwb var1);
}
