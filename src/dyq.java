import com.mojang.serialization.Codec;

public class dyq extends dyo {
   public static final Codec<dyq> a = Codec.unit(() -> dyq.b);
   public static final dyq b = new dyq();

   @Override
   protected dyp<?> a() {
      return dyp.a;
   }

   @Override
   public void a(dyo.a $$0) {
      awo $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            hz $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, dhi.d);
            }
         }

         if ($$1.a(3) > 0) {
            hz $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, dhi.f);
            }
         }

         if ($$1.a(3) > 0) {
            hz $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, dhi.e);
            }
         }

         if ($$1.a(3) > 0) {
            hz $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, dhi.c);
            }
         }
      });
   }
}
