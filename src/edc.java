import com.mojang.serialization.Codec;

public class edc extends eda {
   public static final Codec<edc> a = Codec.unit(() -> edc.b);
   public static final edc b = new edc();

   @Override
   protected edb<?> a() {
      return edb.a;
   }

   @Override
   public void a(eda.a $$0) {
      axt $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            id $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, dlc.d);
            }
         }

         if ($$1.a(3) > 0) {
            id $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, dlc.f);
            }
         }

         if ($$1.a(3) > 0) {
            id $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, dlc.e);
            }
         }

         if ($$1.a(3) > 0) {
            id $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, dlc.c);
            }
         }
      });
   }
}
