import javax.annotation.Nullable;

public record adm(int a, @Nullable adq b) implements ve<adl> {
   private static final int c = 1048576;

   public static adm b(sp $$0) {
      int $$1 = $$0.m();
      return new adm($$1, a($$1, $$0));
   }

   private static adq a(int $$0, sp $$1) {
      return c($$1);
   }

   private static adq c(sp $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.j($$1);
         return ads.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(sp $$0) {
      $$0.c(this.a);
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(adl $$0) {
      $$0.a(this);
   }

   @Nullable
   public adq d() {
      return this.b;
   }
}
