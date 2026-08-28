import javax.annotation.Nullable;

public interface dhi {
   static buh a(dhp $$0, @Nullable bvs $$1) {
      return $$0.al().d($$1, a($$1));
   }

   @Nullable
   static bwr a(@Nullable bvs $$0) {
      return switch ($$0) {
         case null, default -> null;
         case cmo $$1 -> $$1.f();
         case bwr $$2 -> $$2;
         case crb $$3 when $$3.q() instanceof bwr $$4 -> $$4;
      };
   }

   arn a();

   dhi.a b();

   @Nullable
   bwr c();

   @Nullable
   bvs d();

   float e();

   fcu f();

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
