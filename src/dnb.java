public enum dnb {
   a {
      @Override
      public boolean a(dsd $$0, dbf $$1, iz $$2, je $$3) {
         return dfa.a($$0.l($$1, $$2), $$3);
      }
   },
   b {
      private final int d = 1;
      private final ewl e = dfa.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0);

      @Override
      public boolean a(dsd $$0, dbf $$1, iz $$2, je $$3) {
         return !ewi.c($$0.l($$1, $$2).a($$3), this.e, evw.c);
      }
   },
   c {
      private final int d = 2;
      private final ewl e = ewi.a(ewi.b(), dfa.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0), evw.e);

      @Override
      public boolean a(dsd $$0, dbf $$1, iz $$2, je $$3) {
         return !ewi.c($$0.l($$1, $$2).a($$3), this.e, evw.c);
      }
   };

   public abstract boolean a(dsd var1, dbf var2, iz var3, je var4);
}
