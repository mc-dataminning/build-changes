import javax.annotation.Nullable;

public record aev(int a, @Nullable aez b) implements wk<aeu> {
   private static final int c = 1048576;

   public static aev b(tu $$0) {
      int $$1 = $$0.n();
      return new aev($$1, a($$1, $$0));
   }

   private static aez a(int $$0, tu $$1) {
      return c($$1);
   }

   private static aez c(tu $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.j($$1);
         return afb.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(tu $$0) {
      $$0.c(this.a);
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(aeu $$0) {
      $$0.a(this);
   }

   @Nullable
   public aez d() {
      return this.b;
   }
}
