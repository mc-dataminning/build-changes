import com.mojang.serialization.MapCodec;

public class efx extends efv {
   public static final MapCodec<efx> a = MapCodec.unit(() -> efx.b);
   public static final efx b = new efx();

   @Override
   protected efw<?> a() {
      return efw.a;
   }

   @Override
   public void a(efv.a $$0) {
      azh $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            iz $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, dnw.d);
            }
         }

         if ($$1.a(3) > 0) {
            iz $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, dnw.f);
            }
         }

         if ($$1.a(3) > 0) {
            iz $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, dnw.e);
            }
         }

         if ($$1.a(3) > 0) {
            iz $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, dnw.c);
            }
         }
      });
   }
}
