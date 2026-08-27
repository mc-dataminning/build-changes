import javax.annotation.Nullable;

public record ahj(int b, @Nullable ahn c) implements xz<ahi> {
   public static final xq<us, ahj> a = xz.a(ahj::c, ahj::a);
   private static final int d = 1048576;

   private static ahj a(us $$0) {
      int $$1 = $$0.l();
      return new ahj($$1, a($$1, $$0));
   }

   private static ahn a(int $$0, us $$1) {
      return b($$1);
   }

   private static ahn b(us $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.j($$1);
         return ahp.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void c(us $$0) {
      $$0.c(this.b);
      $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public yb<ahj> a() {
      return ahg.f;
   }

   public void a(ahi $$0) {
      $$0.a(this);
   }

   @Nullable
   public ahn e() {
      return this.c;
   }
}
