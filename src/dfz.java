import javax.annotation.Nullable;

public interface dfz {
   static bta a(dgh $$0, @Nullable buk $$1) {
      return $$0.ak().d($$1, a($$1));
   }

   @Nullable
   static bvg a(@Nullable buk $$0) {
      return switch ($$0) {
         case null, default -> null;
         case clc $$1 -> $$1.l();
         case bvg $$2 -> $$2;
         case cpp $$3 when $$3.p() instanceof bvg $$4 -> $$4;
      };
   }

   ard a();

   dfz.a b();

   @Nullable
   bvg c();

   @Nullable
   buk d();

   float e();

   faz f();

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
