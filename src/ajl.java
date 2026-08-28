import javax.annotation.Nullable;

public record ajl(int b, @Nullable ajp c) implements zw<ajk> {
   public static final zn<wm, ajl> a = zw.a(ajl::c, ajl::a);
   private static final int d = 1048576;

   private static ajl a(wm $$0) {
      int $$1 = $$0.l();
      return new ajl($$1, a($$1, $$0));
   }

   private static ajp a(int $$0, wm $$1) {
      return b($$1);
   }

   private static ajp b(wm $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.j($$1);
         return ajr.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void c(wm $$0) {
      $$0.c(this.b);
      $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zy<ajl> a() {
      return aji.f;
   }

   public void a(ajk $$0) {
      $$0.a(this);
   }

   @Nullable
   public ajp e() {
      return this.c;
   }
}
