import javax.annotation.Nullable;

public interface dit {
   static buu a(dja $$0, @Nullable bwf $$1) {
      return $$0.al().d($$1, a($$1));
   }

   @Nullable
   static bxe a(@Nullable bwf $$0) {
      return switch ($$0) {
         case null, default -> null;
         case cni $$1 -> $$1.f();
         case bxe $$2 -> $$2;
         case crx $$3 when $$3.q() instanceof bxe $$4 -> $$4;
      };
   }

   arq a();

   dit.a b();

   @Nullable
   bxe c();

   @Nullable
   bwf d();

   float e();

   feq f();

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
