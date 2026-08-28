import javax.annotation.Nullable;

public interface djf {
   static bux a(djm $$0, @Nullable bwi $$1) {
      return $$0.al().d($$1, a($$1));
   }

   @Nullable
   static bxj a(@Nullable bwi $$0) {
      return switch ($$0) {
         case null, default -> null;
         case cns $$1 -> $$1.f();
         case bxj $$2 -> $$2;
         case csh $$3 when $$3.q() instanceof bxj $$4 -> $$4;
      };
   }

   arq a();

   djf.a b();

   @Nullable
   bxj c();

   @Nullable
   bwi d();

   float e();

   ffc f();

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
