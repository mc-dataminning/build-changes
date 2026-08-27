import javax.annotation.Nullable;

public record aez(int a, @Nullable afd b) implements wo<aey> {
   private static final int c = 1048576;

   public static aez b(ty $$0) {
      int $$1 = $$0.n();
      return new aez($$1, a($$1, $$0));
   }

   private static afd a(int $$0, ty $$1) {
      return c($$1);
   }

   private static afd c(ty $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.j($$1);
         return aff.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(ty $$0) {
      $$0.c(this.a);
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(aey $$0) {
      $$0.a(this);
   }

   @Nullable
   public afd d() {
      return this.b;
   }
}
