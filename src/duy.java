import com.mojang.serialization.Codec;

public class duy extends duw {
   public static final Codec<duy> a = Codec.unit(() -> duy.b);
   public static final duy b = new duy();

   @Override
   protected dux<?> a() {
      return dux.a;
   }

   @Override
   public void a(duw.a $$0) {
      atw $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            hx $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, ddy.d);
            }
         }

         if ($$1.a(3) > 0) {
            hx $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, ddy.f);
            }
         }

         if ($$1.a(3) > 0) {
            hx $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, ddy.e);
            }
         }

         if ($$1.a(3) > 0) {
            hx $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, ddy.c);
            }
         }
      });
   }
}
