import javax.annotation.Nullable;

public record ajh(int b, @Nullable ajl c) implements zc<ajg> {
   public static final yt<vr, ajh> a = zc.a(ajh::c, ajh::a);
   private static final int d = 1048576;

   private static ajh a(vr $$0) {
      int $$1 = $$0.l();
      return new ajh($$1, a($$1, $$0));
   }

   private static ajl a(int $$0, vr $$1) {
      return b($$1);
   }

   private static ajl b(vr $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.k($$1);
         return ajn.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void c(vr $$0) {
      $$0.c(this.b);
      $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public ze<ajh> a() {
      return aje.f;
   }

   public void a(ajg $$0) {
      $$0.a(this);
   }

   @Nullable
   public ajl e() {
      return this.c;
   }
}
