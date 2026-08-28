import javax.annotation.Nullable;

public interface dga {
   static btb a(dgi $$0, @Nullable bul $$1) {
      return $$0.ak().d($$1, a($$1));
   }

   @Nullable
   static bvh a(@Nullable bul $$0) {
      return switch ($$0) {
         case null, default -> null;
         case cld $$1 -> $$1.l();
         case bvh $$2 -> $$2;
         case cpq $$3 when $$3.p() instanceof bvh $$4 -> $$4;
      };
   }

   ard a();

   dga.a b();

   @Nullable
   bvh c();

   @Nullable
   bul d();

   float e();

   fba f();

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
