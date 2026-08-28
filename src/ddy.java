import javax.annotation.Nullable;

public interface ddy {
   static bsg a(deg $$0, @Nullable bto $$1) {
      return $$0.ak().d($$1, a($$1));
   }

   @Nullable
   static buk a(@Nullable bto $$0) {
      return switch ($$0) {
         case null, default -> null;
         case ckf $$1 -> $$1.m();
         case buk $$2 -> $$2;
         case coo $$3 when $$3.s() instanceof buk $$4 -> $$4;
      };
   }

   ddy.a a();

   @Nullable
   buk b();

   @Nullable
   bto c();

   float d();

   eys e();

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
