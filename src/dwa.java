import com.mojang.serialization.Codec;

public class dwa extends dvy {
   public static final Codec<dwa> a = Codec.unit(() -> dwa.b);
   public static final dwa b = new dwa();

   @Override
   protected dvz<?> a() {
      return dvz.a;
   }

   @Override
   public void a(dvy.a $$0) {
      auf $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            hv $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, det.d);
            }
         }

         if ($$1.a(3) > 0) {
            hv $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, det.f);
            }
         }

         if ($$1.a(3) > 0) {
            hv $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, det.e);
            }
         }

         if ($$1.a(3) > 0) {
            hv $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, det.c);
            }
         }
      });
   }
}
