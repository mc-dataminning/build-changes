import javax.annotation.Nullable;

public record ain(int b, @Nullable air c) implements zb<aim> {
   public static final ys<vu, ain> a = zb.a(ain::c, ain::a);
   private static final int d = 1048576;

   private static ain a(vu $$0) {
      int $$1 = $$0.l();
      return new ain($$1, a($$1, $$0));
   }

   private static air a(int $$0, vu $$1) {
      return b($$1);
   }

   private static air b(vu $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.j($$1);
         return ait.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void c(vu $$0) {
      $$0.c(this.b);
      $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zd<ain> a() {
      return aik.f;
   }

   public void a(aim $$0) {
      $$0.a(this);
   }

   @Nullable
   public air e() {
      return this.c;
   }
}
