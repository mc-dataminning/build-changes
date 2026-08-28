import javax.annotation.Nullable;

public interface dkc {
   static bvt a(dkj $$0, @Nullable bxe $$1) {
      return $$0.al().d($$1, a($$1));
   }

   @Nullable
   static byf a(@Nullable bxe $$0) {
      return switch ($$0) {
         case null, default -> null;
         case cop $$1 -> $$1.e();
         case byf $$2 -> $$2;
         case ctd $$3 when $$3.p() instanceof byf $$4 -> $$4;
      };
   }

   asb a();

   dkc.a b();

   @Nullable
   byf c();

   @Nullable
   bxe d();

   float e();

   fgc f();

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
