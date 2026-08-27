import javax.annotation.Nullable;

public record adg(int a, @Nullable adk b) implements ux<adf> {
   private static final int c = 1048576;

   public static adg b(si $$0) {
      int $$1 = $$0.m();
      return new adg($$1, a($$1, $$0));
   }

   private static adk a(int $$0, si $$1) {
      return c($$1);
   }

   private static adk c(si $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.j($$1);
         return adm.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(si $$0) {
      $$0.c(this.a);
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(adf $$0) {
      $$0.a(this);
   }

   @Nullable
   public adk d() {
      return this.b;
   }
}
