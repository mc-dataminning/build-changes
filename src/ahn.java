import javax.annotation.Nullable;

public record ahn(int b, @Nullable ahr c) implements yb<ahm> {
   public static final xs<uu, ahn> a = yb.a(ahn::c, ahn::a);
   private static final int d = 1048576;

   private static ahn a(uu $$0) {
      int $$1 = $$0.l();
      return new ahn($$1, a($$1, $$0));
   }

   private static ahr a(int $$0, uu $$1) {
      return b($$1);
   }

   private static ahr b(uu $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.j($$1);
         return aht.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void c(uu $$0) {
      $$0.c(this.b);
      $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public yd<ahn> a() {
      return ahk.f;
   }

   public void a(ahm $$0) {
      $$0.a(this);
   }

   @Nullable
   public ahr e() {
      return this.c;
   }
}
