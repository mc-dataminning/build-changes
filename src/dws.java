import com.mojang.serialization.Codec;

public class dws extends dwq {
   public static final Codec<dws> a = Codec.unit(() -> dws.b);
   public static final dws b = new dws();

   @Override
   protected dwr<?> a() {
      return dwr.a;
   }

   @Override
   public void a(dwq.a $$0) {
      auv $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            hx $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, dfk.d);
            }
         }

         if ($$1.a(3) > 0) {
            hx $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, dfk.f);
            }
         }

         if ($$1.a(3) > 0) {
            hx $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, dfk.e);
            }
         }

         if ($$1.a(3) > 0) {
            hx $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, dfk.c);
            }
         }
      });
   }
}
