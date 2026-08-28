public interface ect {
   void a(Throwable var1, ede var2, dhw var3);

   void b(Throwable var1, ede var2, dhw var3);

   static z a(dhw $$0, dhw $$1) {
      o $$2 = o.a(new IllegalStateException("Retrieved chunk position " + $$0 + " does not match requested " + $$1), "Chunk found in invalid location");
      p $$3 = $$2.a("Misplaced Chunk");
      $$3.a("Stored Position", $$0::toString);
      return new z($$2);
   }

   default void a(dhw $$0, dhw $$1, ede $$2) {
      this.a(a($$0, $$1), $$2, $$1);
   }
}
