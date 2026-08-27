import javax.annotation.Nullable;

public record ahf(int b, @Nullable ahj c) implements xx<ahe> {
   public static final xo<uq, ahf> a = xx.a(ahf::c, ahf::a);
   private static final int d = 1048576;

   private static ahf a(uq $$0) {
      int $$1 = $$0.n();
      return new ahf($$1, a($$1, $$0));
   }

   private static ahj a(int $$0, uq $$1) {
      return b($$1);
   }

   private static ahj b(uq $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.j($$1);
         return ahl.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void c(uq $$0) {
      $$0.c(this.b);
      $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public xz<ahf> a() {
      return ahc.f;
   }

   public void a(ahe $$0) {
      $$0.a(this);
   }

   @Nullable
   public ahj e() {
      return this.c;
   }
}
