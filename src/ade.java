import javax.annotation.Nullable;

public record ade(int a, @Nullable adi b) implements uw<add> {
   private static final int c = 1048576;

   public static ade b(sh $$0) {
      int $$1 = $$0.m();
      return new ade($$1, a($$1, $$0));
   }

   private static adi a(int $$0, sh $$1) {
      return c($$1);
   }

   private static adi c(sh $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.j($$1);
         return adk.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(sh $$0) {
      $$0.c(this.a);
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(add $$0) {
      $$0.a(this);
   }

   @Nullable
   public adi d() {
      return this.b;
   }
}
