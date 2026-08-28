import javax.annotation.Nullable;

public interface dex {
   static bsy a(dff $$0, @Nullable bui $$1) {
      return $$0.ai().d($$1, a($$1));
   }

   @Nullable
   static bve a(@Nullable bui $$0) {
      return switch ($$0) {
         case null, default -> null;
         case cla $$1 -> $$1.m();
         case bve $$2 -> $$2;
         case cpk $$3 when $$3.s() instanceof bve $$4 -> $$4;
      };
   }

   dex.a a();

   @Nullable
   bve b();

   @Nullable
   bui c();

   float d();

   ezr e();

   boolean f();

   boolean g();

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
