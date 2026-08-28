import com.mojang.serialization.MapCodec;

public class efw extends efu {
   public static final MapCodec<efw> a = MapCodec.unit(() -> efw.b);
   public static final efw b = new efw();

   @Override
   protected efv<?> a() {
      return efv.a;
   }

   @Override
   public void a(efu.a $$0) {
      azh $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            iz $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, dnv.d);
            }
         }

         if ($$1.a(3) > 0) {
            iz $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, dnv.f);
            }
         }

         if ($$1.a(3) > 0) {
            iz $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, dnv.e);
            }
         }

         if ($$1.a(3) > 0) {
            iz $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, dnv.c);
            }
         }
      });
   }
}
