import com.mojang.serialization.MapCodec;

public class ejn extends ejl {
   public static final MapCodec<ejn> a = MapCodec.unit(() -> ejn.b);
   public static final ejn b = new ejn();

   @Override
   protected ejm<?> a() {
      return ejm.a;
   }

   @Override
   public void a(ejl.a $$0) {
      azv $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            jh $$3 = $$2.h();
            if ($$0.a($$3)) {
               $$0.a($$3, drf.d);
            }
         }

         if ($$1.a(3) > 0) {
            jh $$4 = $$2.i();
            if ($$0.a($$4)) {
               $$0.a($$4, drf.f);
            }
         }

         if ($$1.a(3) > 0) {
            jh $$5 = $$2.f();
            if ($$0.a($$5)) {
               $$0.a($$5, drf.e);
            }
         }

         if ($$1.a(3) > 0) {
            jh $$6 = $$2.g();
            if ($$0.a($$6)) {
               $$0.a($$6, drf.c);
            }
         }
      });
   }
}
