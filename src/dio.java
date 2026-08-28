import javax.annotation.Nullable;

public interface dio {
   static bus a(div $$0, @Nullable bwd $$1) {
      return $$0.al().d($$1, a($$1));
   }

   @Nullable
   static bxc a(@Nullable bwd $$0) {
      return switch ($$0) {
         case null, default -> null;
         case cne $$1 -> $$1.f();
         case bxc $$2 -> $$2;
         case crs $$3 when $$3.q() instanceof bxc $$4 -> $$4;
      };
   }

   arq a();

   dio.a b();

   @Nullable
   bxc c();

   @Nullable
   bwd d();

   float e();

   fei f();

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
