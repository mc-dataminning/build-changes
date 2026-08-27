import javax.annotation.Nullable;

public record aet(int a, @Nullable aex b) implements wk<aes> {
   private static final int c = 1048576;

   public static aet b(tu $$0) {
      int $$1 = $$0.n();
      return new aet($$1, a($$1, $$0));
   }

   private static aex a(int $$0, tu $$1) {
      return c($$1);
   }

   private static aex c(tu $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.j($$1);
         return aez.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(tu $$0) {
      $$0.c(this.a);
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(aes $$0) {
      $$0.a(this);
   }

   @Nullable
   public aex d() {
      return this.b;
   }
}
