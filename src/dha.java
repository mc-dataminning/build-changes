import javax.annotation.Nullable;

public interface dha {
   static bua a(dhi $$0, @Nullable bvk $$1) {
      return $$0.aj().d($$1, a($$1));
   }

   @Nullable
   static bwg a(@Nullable bvk $$0) {
      return switch ($$0) {
         case null, default -> null;
         case cmc $$1 -> $$1.l();
         case bwg $$2 -> $$2;
         case cqq $$3 when $$3.p() instanceof bwg $$4 -> $$4;
      };
   }

   ash a();

   dha.a b();

   @Nullable
   bwg c();

   @Nullable
   bvk d();

   float e();

   fby f();

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
