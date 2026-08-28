import javax.annotation.Nullable;

public record ajl(int b, @Nullable ajp c) implements zo<ajk> {
   public static final zf<we, ajl> a = zo.a(ajl::c, ajl::a);
   private static final int d = 1048576;

   private static ajl a(we $$0) {
      int $$1 = $$0.l();
      return new ajl($$1, a($$1, $$0));
   }

   private static ajp a(int $$0, we $$1) {
      return b($$1);
   }

   private static ajp b(we $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.k($$1);
         return ajr.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void c(we $$0) {
      $$0.c(this.b);
      $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zq<ajl> a() {
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
