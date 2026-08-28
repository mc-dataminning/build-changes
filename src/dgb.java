import javax.annotation.Nullable;

public interface dgb {
   static btc a(dgj $$0, @Nullable bum $$1) {
      return $$0.ak().d($$1, a($$1));
   }

   @Nullable
   static bvi a(@Nullable bum $$0) {
      return switch ($$0) {
         case null, default -> null;
         case cle $$1 -> $$1.l();
         case bvi $$2 -> $$2;
         case cpr $$3 when $$3.p() instanceof bvi $$4 -> $$4;
      };
   }

   ard a();

   dgb.a b();

   @Nullable
   bvi c();

   @Nullable
   bum d();

   float e();

   fbb f();

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
