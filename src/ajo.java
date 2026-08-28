import javax.annotation.Nullable;

public record ajo(int b, @Nullable ajs c) implements zj<ajn> {
   public static final za<vy, ajo> a = zj.a(ajo::c, ajo::a);
   private static final int d = 1048576;

   private static ajo a(vy $$0) {
      int $$1 = $$0.l();
      return new ajo($$1, a($$1, $$0));
   }

   private static ajs a(int $$0, vy $$1) {
      return b($$1);
   }

   private static ajs b(vy $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.k($$1);
         return aju.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void c(vy $$0) {
      $$0.c(this.b);
      $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zl<ajo> a() {
      return ajl.f;
   }

   public void a(ajn $$0) {
      $$0.a(this);
   }

   @Nullable
   public ajs e() {
      return this.c;
   }
}
