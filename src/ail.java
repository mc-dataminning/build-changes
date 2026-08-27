import javax.annotation.Nullable;

public record ail(int b, @Nullable aip c) implements yz<aik> {
   public static final yq<vs, ail> a = yz.a(ail::c, ail::a);
   private static final int d = 1048576;

   private static ail a(vs $$0) {
      int $$1 = $$0.l();
      return new ail($$1, a($$1, $$0));
   }

   private static aip a(int $$0, vs $$1) {
      return b($$1);
   }

   private static aip b(vs $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.j($$1);
         return air.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void c(vs $$0) {
      $$0.c(this.b);
      $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zb<ail> a() {
      return aii.f;
   }

   public void a(aik $$0) {
      $$0.a(this);
   }

   @Nullable
   public aip e() {
      return this.c;
   }
}
