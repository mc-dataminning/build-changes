import com.mojang.serialization.MapCodec;

public class efy extends efw {
   public static final MapCodec<efy> a = MapCodec.unit(() -> efy.b);
   public static final efy b = new efy();

   @Override
   protected efx<?> a() {
      return efx.a;
   }

   @Override
   public void a(efw.a $$0) {
      azh $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            iz $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, dnx.d);
            }
         }

         if ($$1.a(3) > 0) {
            iz $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, dnx.f);
            }
         }

         if ($$1.a(3) > 0) {
            iz $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, dnx.e);
            }
         }

         if ($$1.a(3) > 0) {
            iz $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, dnx.c);
            }
         }
      });
   }
}
