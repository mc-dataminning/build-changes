import javax.annotation.Nullable;

public interface dgs {
   static btv a(dha $$0, @Nullable bvf $$1) {
      return $$0.aj().d($$1, a($$1));
   }

   @Nullable
   static bwb a(@Nullable bvf $$0) {
      return switch ($$0) {
         case null, default -> null;
         case clx $$1 -> $$1.l();
         case bwb $$2 -> $$2;
         case cql $$3 when $$3.p() instanceof bwb $$4 -> $$4;
      };
   }

   ash a();

   dgs.a b();

   @Nullable
   bwb c();

   @Nullable
   bvf d();

   float e();

   fbs f();

   boolean g();

   boolean h();

   public static enum a {
      a(false),
      b(true),
      c(true),
      d(false);

      private final boolean e;

      private a(final boolean $$0) {
         this.e = $$0;
      }

      public boolean a() {
         return this.e;
      }
   }
}
