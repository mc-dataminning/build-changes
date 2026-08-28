import javax.annotation.Nullable;

public interface dfe {
   static btb a(dfm $$0, @Nullable bul $$1) {
      return $$0.ai().d($$1, a($$1));
   }

   @Nullable
   static bvh a(@Nullable bul $$0) {
      return switch ($$0) {
         case null, default -> null;
         case cld $$1 -> $$1.j();
         case bvh $$2 -> $$2;
         case cpn $$3 when $$3.p() instanceof bvh $$4 -> $$4;
      };
   }

   arp a();

   dfe.a b();

   @Nullable
   bvh c();

   @Nullable
   bul d();

   float e();

   ezy f();

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
