public interface dxa {
   dxa.a b();

   dxa.b c();

   public static enum a {
      a,
      b,
      c;
   }

   public static record b(iu a, jz b) {
      public static dxa.b a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = Math.min($$0, $$3);
         int $$7 = Math.min($$1, $$4);
         int $$8 = Math.min($$2, $$5);
         return new dxa.b(new iu($$6, $$7, $$8), new jz(Math.max($$0, $$3) - $$6, Math.max($$1, $$4) - $$7, Math.max($$2, $$5) - $$8));
      }
   }
}
