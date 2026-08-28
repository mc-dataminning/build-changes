import javax.annotation.Nullable;

public record ajn(int b, @Nullable ajr c) implements zq<ajm> {
   public static final zh<wg, ajn> a = zq.a(ajn::c, ajn::a);
   private static final int d = 1048576;

   private static ajn a(wg $$0) {
      int $$1 = $$0.l();
      return new ajn($$1, a($$1, $$0));
   }

   private static ajr a(int $$0, wg $$1) {
      return b($$1);
   }

   private static ajr b(wg $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.k($$1);
         return ajt.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void c(wg $$0) {
      $$0.c(this.b);
      $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zs<ajn> a() {
      return ajk.f;
   }

   public void a(ajm $$0) {
      $$0.a(this);
   }

   @Nullable
   public ajr e() {
      return this.c;
   }
}
