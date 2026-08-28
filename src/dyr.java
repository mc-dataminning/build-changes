public interface dyr {
   void a(Throwable var1, dzc var2, del var3);

   void b(Throwable var1, dzc var2, del var3);

   static z a(del $$0, del $$1) {
      o $$2 = o.a(new IllegalStateException("Retrieved chunk position " + $$0 + " does not match requested " + $$1), "Chunk found in invalid location");
      p $$3 = $$2.a("Misplaced Chunk");
      $$3.a("Stored Position", $$0::toString);
      return new z($$2);
   }

   default void a(del $$0, del $$1, dzc $$2) {
      this.a(a($$0, $$1), $$2, $$1);
   }
}
