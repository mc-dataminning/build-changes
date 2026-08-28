import javax.annotation.Nullable;

public interface dgz {
   static btz a(dhh $$0, @Nullable bvj $$1) {
      return $$0.aj().d($$1, a($$1));
   }

   @Nullable
   static bwf a(@Nullable bvj $$0) {
      return switch ($$0) {
         case null, default -> null;
         case cmb $$1 -> $$1.l();
         case bwf $$2 -> $$2;
         case cqp $$3 when $$3.p() instanceof bwf $$4 -> $$4;
      };
   }

   ash a();

   dgz.a b();

   @Nullable
   bwf c();

   @Nullable
   bvj d();

   float e();

   fbx f();

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
