public enum dia {
   a {
      @Override
      public boolean a(dmz $$0, cwf $$1, ib $$2, ih $$3) {
         return daa.a($$0.l($$1, $$2), $$3);
      }
   },
   b {
      private final int d = 1;
      private final eqk e = daa.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0);

      @Override
      public boolean a(dmz $$0, cwf $$1, ib $$2, ih $$3) {
         return !eqh.c($$0.l($$1, $$2).a($$3), this.e, epv.c);
      }
   },
   c {
      private final int d = 2;
      private final eqk e = eqh.a(eqh.b(), daa.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0), epv.e);

      @Override
      public boolean a(dmz $$0, cwf $$1, ib $$2, ih $$3) {
         return !eqh.c($$0.l($$1, $$2).a($$3), this.e, epv.c);
      }
   };

   public abstract boolean a(dmz var1, cwf var2, ib var3, ih var4);
}
