import javax.annotation.Nullable;

public interface dgr {
   static btr a(dgz $$0, @Nullable bvb $$1) {
      return $$0.ak().d($$1, a($$1));
   }

   @Nullable
   static bvx a(@Nullable bvb $$0) {
      return switch ($$0) {
         case null, default -> null;
         case clt $$1 -> $$1.l();
         case bvx $$2 -> $$2;
         case cqh $$3 when $$3.p() instanceof bvx $$4 -> $$4;
      };
   }

   arx a();

   dgr.a b();

   @Nullable
   bvx c();

   @Nullable
   bvb d();

   float e();

   fbr f();

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
