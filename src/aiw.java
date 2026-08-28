import javax.annotation.Nullable;

public record aiw(int b, @Nullable aja c) implements zf<aiv> {
   public static final yw<vv, aiw> a = zf.a(aiw::c, aiw::a);
   private static final int d = 1048576;

   private static aiw a(vv $$0) {
      int $$1 = $$0.l();
      return new aiw($$1, a($$1, $$0));
   }

   private static aja a(int $$0, vv $$1) {
      return b($$1);
   }

   private static aja b(vv $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.j($$1);
         return ajc.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void c(vv $$0) {
      $$0.c(this.b);
      $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zh<aiw> a() {
      return ait.f;
   }

   public void a(aiv $$0) {
      $$0.a(this);
   }

   @Nullable
   public aja e() {
      return this.c;
   }
}
