import javax.annotation.Nullable;

public interface det {
   static bsu a(dfb $$0, @Nullable bue $$1) {
      return $$0.ai().d($$1, a($$1));
   }

   @Nullable
   static bva a(@Nullable bue $$0) {
      return switch ($$0) {
         case null, default -> null;
         case ckw $$1 -> $$1.m();
         case bva $$2 -> $$2;
         case cpg $$3 when $$3.s() instanceof bva $$4 -> $$4;
      };
   }

   det.a a();

   @Nullable
   bva b();

   @Nullable
   bue c();

   float d();

   ezn e();

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
