public interface dyn {
   void a(Throwable var1, dyy var2, deh var3);

   void b(Throwable var1, dyy var2, deh var3);

   static z a(deh $$0, deh $$1) {
      o $$2 = o.a(new IllegalStateException("Retrieved chunk position " + $$0 + " does not match requested " + $$1), "Chunk found in invalid location");
      p $$3 = $$2.a("Misplaced Chunk");
      $$3.a("Stored Position", $$0::toString);
      return new z($$2);
   }

   default void a(deh $$0, deh $$1, dyy $$2) {
      this.a(a($$0, $$1), $$2, $$1);
   }
}
