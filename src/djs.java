import javax.annotation.Nullable;

public interface djs {
   static bvk a(djz $$0, @Nullable bwv $$1) {
      return $$0.al().d($$1, a($$1));
   }

   @Nullable
   static bxw a(@Nullable bwv $$0) {
      return switch ($$0) {
         case null, default -> null;
         case cof $$1 -> $$1.f();
         case bxw $$2 -> $$2;
         case csu $$3 when $$3.q() instanceof bxw $$4 -> $$4;
      };
   }

   aru a();

   djs.a b();

   @Nullable
   bxw c();

   @Nullable
   bwv d();

   float e();

   ffs f();

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
