import javax.annotation.Nullable;

public interface djq {
   static bvi a(djx $$0, @Nullable bwt $$1) {
      return $$0.al().d($$1, a($$1));
   }

   @Nullable
   static bxu a(@Nullable bwt $$0) {
      return switch ($$0) {
         case null, default -> null;
         case cod $$1 -> $$1.f();
         case bxu $$2 -> $$2;
         case css $$3 when $$3.q() instanceof bxu $$4 -> $$4;
      };
   }

   ars a();

   djq.a b();

   @Nullable
   bxu c();

   @Nullable
   bwt d();

   float e();

   ffq f();

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
