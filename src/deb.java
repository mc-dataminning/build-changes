import javax.annotation.Nullable;

public interface deb {
   static bsj a(dej $$0, @Nullable btr $$1) {
      return $$0.ak().d($$1, a($$1));
   }

   @Nullable
   static bun a(@Nullable btr $$0) {
      return switch ($$0) {
         case null, default -> null;
         case cki $$1 -> $$1.m();
         case bun $$2 -> $$2;
         case cor $$3 when $$3.s() instanceof bun $$4 -> $$4;
      };
   }

   deb.a a();

   @Nullable
   bun b();

   @Nullable
   btr c();

   float d();

   eyw e();

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
