import javax.annotation.Nullable;

public interface den {
   static bsp a(dev $$0, @Nullable btz $$1) {
      return $$0.ak().d($$1, a($$1));
   }

   @Nullable
   static buv a(@Nullable btz $$0) {
      return switch ($$0) {
         case null, default -> null;
         case ckr $$1 -> $$1.m();
         case buv $$2 -> $$2;
         case cpb $$3 when $$3.s() instanceof buv $$4 -> $$4;
      };
   }

   den.a a();

   @Nullable
   buv b();

   @Nullable
   btz c();

   float d();

   ezh e();

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
