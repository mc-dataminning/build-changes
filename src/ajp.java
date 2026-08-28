import javax.annotation.Nullable;

public record ajp(int b, @Nullable ajt c) implements zs<ajo> {
   public static final zj<wi, ajp> a = zs.a(ajp::c, ajp::a);
   private static final int d = 1048576;

   private static ajp a(wi $$0) {
      int $$1 = $$0.l();
      return new ajp($$1, a($$1, $$0));
   }

   private static ajt a(int $$0, wi $$1) {
      return b($$1);
   }

   private static ajt b(wi $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.k($$1);
         return ajv.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void c(wi $$0) {
      $$0.c(this.b);
      $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zu<ajp> a() {
      return ajm.f;
   }

   public void a(ajo $$0) {
      $$0.a(this);
   }

   @Nullable
   public ajt e() {
      return this.c;
   }
}
