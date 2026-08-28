import javax.annotation.Nullable;

public record ajt(int b, @Nullable ajx c) implements zr<ajs> {
   public static final zi<wh, ajt> a = zr.a(ajt::c, ajt::a);
   private static final int d = 1048576;

   private static ajt a(wh $$0) {
      int $$1 = $$0.l();
      return new ajt($$1, a($$1, $$0));
   }

   private static ajx a(int $$0, wh $$1) {
      return b($$1);
   }

   private static ajx b(wh $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.k($$1);
         return ajz.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void c(wh $$0) {
      $$0.c(this.b);
      $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zt<ajt> a() {
      return ajq.f;
   }

   public void a(ajs $$0) {
      $$0.a(this);
   }

   @Nullable
   public ajx e() {
      return this.c;
   }
}
