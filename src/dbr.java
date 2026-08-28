public interface dbr extends dba<dbs> {
   @Override
   default dbg<?> e() {
      return dbg.g;
   }

   @Override
   default boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 1;
   }

   @Override
   default cwm g() {
      return new cwm(dis.ob);
   }

   default boolean a(dbs $$0, dfm $$1) {
      return this.a($$0.c()) && this.b($$0.d()) && this.c($$0.e());
   }

   boolean a(cwm var1);

   boolean b(cwm var1);

   boolean c(cwm var1);
}
