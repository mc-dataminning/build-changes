import com.mojang.serialization.Codec;

public class dpm extends dpk {
   public static final Codec<dpm> a = Codec.unit(() -> dpm.b);
   public static final dpm b = new dpm();

   @Override
   protected dpl<?> a() {
      return dpl.a;
   }

   @Override
   public void a(dpk.a $$0) {
      apf $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            gu $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, cyh.c);
            }
         }

         if ($$1.a(3) > 0) {
            gu $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, cyh.e);
            }
         }

         if ($$1.a(3) > 0) {
            gu $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, cyh.d);
            }
         }

         if ($$1.a(3) > 0) {
            gu $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, cyh.b);
            }
         }
      });
   }
}
