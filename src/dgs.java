import javax.annotation.Nullable;

public interface dgs {
   static btp a(dgz $$0, @Nullable bva $$1) {
      return $$0.al().d($$1, a($$1));
   }

   @Nullable
   static bvy a(@Nullable bva $$0) {
      return switch ($$0) {
         case null, default -> null;
         case clx $$1 -> $$1.f();
         case bvy $$2 -> $$2;
         case cqk $$3 when $$3.q() instanceof bvy $$4 -> $$4;
      };
   }

   ard a();

   dgs.a b();

   @Nullable
   bvy c();

   @Nullable
   bva d();

   float e();

   fbx f();

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
