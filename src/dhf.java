public enum dhf {
   a {
      @Override
      public boolean a(dme $$0, cvk $$1, ib $$2, ih $$3) {
         return czf.a($$0.l($$1, $$2), $$3);
      }
   },
   b {
      private final int d = 1;
      private final epo e = czf.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0);

      @Override
      public boolean a(dme $$0, cvk $$1, ib $$2, ih $$3) {
         return !epl.c($$0.l($$1, $$2).a($$3), this.e, eoz.c);
      }
   },
   c {
      private final int d = 2;
      private final epo e = epl.a(epl.b(), czf.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0), eoz.e);

      @Override
      public boolean a(dme $$0, cvk $$1, ib $$2, ih $$3) {
         return !epl.c($$0.l($$1, $$2).a($$3), this.e, eoz.c);
      }
   };

   public abstract boolean a(dme var1, cvk var2, ib var3, ih var4);
}
