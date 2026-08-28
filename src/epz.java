import com.mojang.serialization.MapCodec;

public class epz extends epx {
   public static final MapCodec<epz> a = MapCodec.unit(() -> epz.b);
   public static final epz b = new epz();

   @Override
   protected epy<?> a() {
      return epy.a;
   }

   @Override
   public void a(epx.a $$0) {
      bai $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            iw $$3 = $$2.h();
            if ($$0.a($$3)) {
               $$0.a($$3, dxb.d);
            }
         }

         if ($$1.a(3) > 0) {
            iw $$4 = $$2.i();
            if ($$0.a($$4)) {
               $$0.a($$4, dxb.f);
            }
         }

         if ($$1.a(3) > 0) {
            iw $$5 = $$2.f();
            if ($$0.a($$5)) {
               $$0.a($$5, dxb.e);
            }
         }

         if ($$1.a(3) > 0) {
            iw $$6 = $$2.g();
            if ($$0.a($$6)) {
               $$0.a($$6, dxb.c);
            }
         }
      });
   }
}
