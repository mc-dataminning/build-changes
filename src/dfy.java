import javax.annotation.Nullable;

public interface dfy {
   static bsz a(dgg $$0, @Nullable buj $$1) {
      return $$0.ak().d($$1, a($$1));
   }

   @Nullable
   static bvf a(@Nullable buj $$0) {
      return switch ($$0) {
         case null, default -> null;
         case clb $$1 -> $$1.l();
         case bvf $$2 -> $$2;
         case cpo $$3 when $$3.p() instanceof bvf $$4 -> $$4;
      };
   }

   arc a();

   dfy.a b();

   @Nullable
   bvf c();

   @Nullable
   buj d();

   float e();

   fay f();

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
