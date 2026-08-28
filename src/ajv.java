import javax.annotation.Nullable;

public record ajv(int b, @Nullable ajz c) implements zo<aju> {
   public static final ze<vy, ajv> a = zo.a(ajv::c, ajv::a);
   private static final int d = 1048576;

   private static ajv a(vy $$0) {
      int $$1 = $$0.l();
      return new ajv($$1, a($$1, $$0));
   }

   private static ajz a(int $$0, vy $$1) {
      return b($$1);
   }

   private static ajz b(vy $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.k($$1);
         return akb.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void c(vy $$0) {
      $$0.c(this.b);
      $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zq<ajv> a() {
      return ajs.f;
   }

   public void a(aju $$0) {
      $$0.a(this);
   }

   @Nullable
   public ajz e() {
      return this.c;
   }
}
