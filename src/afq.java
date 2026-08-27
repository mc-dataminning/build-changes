import javax.annotation.Nullable;

public record afq(int a, @Nullable afu b) implements xd<afp> {
   private static final int c = 1048576;

   public static afq b(ug $$0) {
      int $$1 = $$0.n();
      return new afq($$1, a($$1, $$0));
   }

   private static afu a(int $$0, ug $$1) {
      return c($$1);
   }

   private static afu c(ug $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.j($$1);
         return afw.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(ug $$0) {
      $$0.c(this.a);
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(afp $$0) {
      $$0.a(this);
   }

   @Nullable
   public afu d() {
      return this.b;
   }
}
