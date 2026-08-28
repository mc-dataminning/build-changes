import com.mojang.serialization.MapCodec;

public class efr extends efp {
   public static final MapCodec<efr> a = MapCodec.unit(() -> efr.b);
   public static final efr b = new efr();

   @Override
   protected efq<?> a() {
      return efq.a;
   }

   @Override
   public void a(efp.a $$0) {
      azc $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            iz $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, dnq.d);
            }
         }

         if ($$1.a(3) > 0) {
            iz $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, dnq.f);
            }
         }

         if ($$1.a(3) > 0) {
            iz $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, dnq.e);
            }
         }

         if ($$1.a(3) > 0) {
            iz $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, dnq.c);
            }
         }
      });
   }
}
