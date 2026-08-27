import javax.annotation.Nullable;

public record afu(int a, @Nullable afy b) implements xg<aft> {
   private static final int c = 1048576;

   public static afu b(uj $$0) {
      int $$1 = $$0.n();
      return new afu($$1, a($$1, $$0));
   }

   private static afy a(int $$0, uj $$1) {
      return c($$1);
   }

   private static afy c(uj $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.j($$1);
         return aga.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(uj $$0) {
      $$0.c(this.a);
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(aft $$0) {
      $$0.a(this);
   }

   @Nullable
   public afy d() {
      return this.b;
   }
}
