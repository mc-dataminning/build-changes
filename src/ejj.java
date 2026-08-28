import com.mojang.serialization.MapCodec;

public class ejj extends ejh {
   public static final MapCodec<ejj> a = MapCodec.unit(() -> ejj.b);
   public static final ejj b = new ejj();

   @Override
   protected eji<?> a() {
      return eji.a;
   }

   @Override
   public void a(ejh.a $$0) {
      azs $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            jh $$3 = $$2.h();
            if ($$0.a($$3)) {
               $$0.a($$3, dra.d);
            }
         }

         if ($$1.a(3) > 0) {
            jh $$4 = $$2.i();
            if ($$0.a($$4)) {
               $$0.a($$4, dra.f);
            }
         }

         if ($$1.a(3) > 0) {
            jh $$5 = $$2.f();
            if ($$0.a($$5)) {
               $$0.a($$5, dra.e);
            }
         }

         if ($$1.a(3) > 0) {
            jh $$6 = $$2.g();
            if ($$0.a($$6)) {
               $$0.a($$6, dra.c);
            }
         }
      });
   }
}
