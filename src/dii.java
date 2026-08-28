import javax.annotation.Nullable;

public interface dii {
   static bup a(dip $$0, @Nullable bwa $$1) {
      return $$0.al().d($$1, a($$1));
   }

   @Nullable
   static bwz a(@Nullable bwa $$0) {
      return switch ($$0) {
         case null, default -> null;
         case cmy $$1 -> $$1.f();
         case bwz $$2 -> $$2;
         case crm $$3 when $$3.q() instanceof bwz $$4 -> $$4;
      };
   }

   aro a();

   dii.a b();

   @Nullable
   bwz c();

   @Nullable
   bwa d();

   float e();

   fdw f();

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
