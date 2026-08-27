import javax.annotation.Nullable;

public record aib(int b, @Nullable aif c) implements yp<aia> {
   public static final yg<vi, aib> a = yp.a(aib::c, aib::a);
   private static final int d = 1048576;

   private static aib a(vi $$0) {
      int $$1 = $$0.l();
      return new aib($$1, a($$1, $$0));
   }

   private static aif a(int $$0, vi $$1) {
      return b($$1);
   }

   private static aif b(vi $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.j($$1);
         return aih.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void c(vi $$0) {
      $$0.c(this.b);
      $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public yr<aib> a() {
      return ahy.f;
   }

   public void a(aia $$0) {
      $$0.a(this);
   }

   @Nullable
   public aif e() {
      return this.c;
   }
}
