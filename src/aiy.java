import javax.annotation.Nullable;

public record aiy(int b, @Nullable ajc c) implements yv<aix> {
   public static final ym<vl, aiy> a = yv.a(aiy::c, aiy::a);
   private static final int d = 1048576;

   private static aiy a(vl $$0) {
      int $$1 = $$0.l();
      return new aiy($$1, a($$1, $$0));
   }

   private static ajc a(int $$0, vl $$1) {
      return b($$1);
   }

   private static ajc b(vl $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.k($$1);
         return aje.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void c(vl $$0) {
      $$0.c(this.b);
      $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public yx<aiy> a() {
      return aiv.f;
   }

   public void a(aix $$0) {
      $$0.a(this);
   }

   @Nullable
   public ajc e() {
      return this.c;
   }
}
