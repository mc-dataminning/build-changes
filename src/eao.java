import com.mojang.serialization.Codec;

public class eao extends eam {
   public static final Codec<eao> a = Codec.unit(() -> eao.b);
   public static final eao b = new eao();

   @Override
   protected ean<?> a() {
      return ean.a;
   }

   @Override
   public void a(eam.a $$0) {
      axd $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            ib $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, div.d);
            }
         }

         if ($$1.a(3) > 0) {
            ib $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, div.f);
            }
         }

         if ($$1.a(3) > 0) {
            ib $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, div.e);
            }
         }

         if ($$1.a(3) > 0) {
            ib $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, div.c);
            }
         }
      });
   }
}
