public enum dtb {
   a {
      @Override
      public boolean a(dym $$0, dgv $$1, jj $$2, jo $$3) {
         return dku.a($$0.h($$1, $$2), $$3);
      }
   },
   b {
      private final fdo d = dku.b(2.0, 0.0, 10.0);

      @Override
      public boolean a(dym $$0, dgv $$1, jj $$2, jo $$3) {
         return !fdl.c($$0.h($$1, $$2).a($$3), this.d, fcy.c);
      }
   },
   c {
      private final fdo d = fdl.a(fdl.b(), dku.b(12.0, 0.0, 16.0), fcy.e);

      @Override
      public boolean a(dym $$0, dgv $$1, jj $$2, jo $$3) {
         return !fdl.c($$0.h($$1, $$2).a($$3), this.d, fcy.c);
      }
   };

   public abstract boolean a(dym var1, dgv var2, jj var3, jo var4);
}
