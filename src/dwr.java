import com.mojang.serialization.Codec;

public class dwr extends dwp {
   public static final Codec<dwr> a = Codec.unit(() -> dwr.b);
   public static final dwr b = new dwr();

   @Override
   protected dwq<?> a() {
      return dwq.a;
   }

   @Override
   public void a(dwp.a $$0) {
      auu $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            hx $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, dfj.d);
            }
         }

         if ($$1.a(3) > 0) {
            hx $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, dfj.f);
            }
         }

         if ($$1.a(3) > 0) {
            hx $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, dfj.e);
            }
         }

         if ($$1.a(3) > 0) {
            hx $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, dfj.c);
            }
         }
      });
   }
}
