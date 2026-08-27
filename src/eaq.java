import com.mojang.serialization.Codec;

public class eaq extends eao {
   public static final Codec<eaq> a = Codec.unit(() -> eaq.b);
   public static final eaq b = new eaq();

   @Override
   protected eap<?> a() {
      return eap.a;
   }

   @Override
   public void a(eao.a $$0) {
      axd $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            ib $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, dix.d);
            }
         }

         if ($$1.a(3) > 0) {
            ib $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, dix.f);
            }
         }

         if ($$1.a(3) > 0) {
            ib $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, dix.e);
            }
         }

         if ($$1.a(3) > 0) {
            ib $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, dix.c);
            }
         }
      });
   }
}
