public interface eev {
   void a(Throwable var1, efg var2, djo var3);

   void b(Throwable var1, efg var2, djo var3);

   static aa a(djo $$0, djo $$1) {
      p $$2 = p.a(new IllegalStateException("Retrieved chunk position " + $$0 + " does not match requested " + $$1), "Chunk found in invalid location");
      q $$3 = $$2.a("Misplaced Chunk");
      $$3.a("Stored Position", $$0::toString);
      return new aa($$2);
   }

   default void a(djo $$0, djo $$1, efg $$2) {
      this.a(a($$0, $$1), $$2, $$1);
   }
}
