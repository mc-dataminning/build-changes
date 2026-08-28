import javax.annotation.Nullable;

public interface ddk {
   static bsb a(dds $$0, @Nullable btj $$1) {
      return $$0.ak().d($$1, a($$1));
   }

   @Nullable
   static buf a(@Nullable btj $$0) {
      return switch ($$0) {
         case null, default -> null;
         case cka $$1 -> $$1.m();
         case buf $$2 -> $$2;
         case coi $$3 when $$3.s() instanceof buf $$4 -> $$4;
      };
   }

   ddk.a a();

   @Nullable
   buf b();

   @Nullable
   btj c();

   float d();

   eye e();

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
