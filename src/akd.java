import javax.annotation.Nullable;

public record akd(int b, @Nullable akh c) implements aac<akc> {
   public static final zt<ws, akd> a = aac.a(akd::c, akd::a);
   private static final int d = 1048576;

   private static akd a(ws $$0) {
      int $$1 = $$0.l();
      return new akd($$1, a($$1, $$0));
   }

   private static akh a(int $$0, ws $$1) {
      return b($$1);
   }

   private static akh b(ws $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.k($$1);
         return akj.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void c(ws $$0) {
      $$0.c(this.b);
      $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public aae<akd> a() {
      return aka.f;
   }

   public void a(akc $$0) {
      $$0.a(this);
   }

   @Nullable
   public akh e() {
      return this.c;
   }
}
