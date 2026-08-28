public enum dpo {
   a {
      @Override
      public boolean a(dus $$0, ddo $$1, jf $$2, jk $$3) {
         return dhm.a($$0.h($$1, $$2), $$3);
      }
   },
   b {
      private final int d = 1;
      private final ezq e = dhm.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0);

      @Override
      public boolean a(dus $$0, ddo $$1, jf $$2, jk $$3) {
         return !ezn.c($$0.h($$1, $$2).a($$3), this.e, eza.c);
      }
   },
   c {
      private final int d = 2;
      private final ezq e = ezn.a(ezn.b(), dhm.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0), eza.e);

      @Override
      public boolean a(dus $$0, ddo $$1, jf $$2, jk $$3) {
         return !ezn.c($$0.h($$1, $$2).a($$3), this.e, eza.c);
      }
   };

   public abstract boolean a(dus var1, ddo var2, jf var3, jk var4);
}
