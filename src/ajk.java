import javax.annotation.Nullable;

public record ajk(int b, @Nullable ajo c) implements zf<ajj> {
   public static final yw<vu, ajk> a = zf.a(ajk::c, ajk::a);
   private static final int d = 1048576;

   private static ajk a(vu $$0) {
      int $$1 = $$0.l();
      return new ajk($$1, a($$1, $$0));
   }

   private static ajo a(int $$0, vu $$1) {
      return b($$1);
   }

   private static ajo b(vu $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.k($$1);
         return ajq.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void c(vu $$0) {
      $$0.c(this.b);
      $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zh<ajk> a() {
      return ajh.f;
   }

   public void a(ajj $$0) {
      $$0.a(this);
   }

   @Nullable
   public ajo e() {
      return this.c;
   }
}
