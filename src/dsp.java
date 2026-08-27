import com.mojang.serialization.Codec;

public class dsp extends dsn {
   public static final Codec<dsp> a = Codec.unit(() -> dsp.b);
   public static final dsp b = new dsp();

   @Override
   protected dso<?> a() {
      return dso.a;
   }

   @Override
   public void a(dsn.a $$0) {
      arx $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            gw $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, dbk.c);
            }
         }

         if ($$1.a(3) > 0) {
            gw $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, dbk.e);
            }
         }

         if ($$1.a(3) > 0) {
            gw $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, dbk.d);
            }
         }

         if ($$1.a(3) > 0) {
            gw $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, dbk.b);
            }
         }
      });
   }
}
