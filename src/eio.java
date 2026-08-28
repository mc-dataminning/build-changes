import com.mojang.serialization.MapCodec;

public class eio extends eim {
   public static final MapCodec<eio> a = MapCodec.unit(() -> eio.b);
   public static final eio b = new eio();

   @Override
   protected ein<?> a() {
      return ein.a;
   }

   @Override
   public void a(eim.a $$0) {
      azl $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            je $$3 = $$2.h();
            if ($$0.a($$3)) {
               $$0.a($$3, dqg.d);
            }
         }

         if ($$1.a(3) > 0) {
            je $$4 = $$2.i();
            if ($$0.a($$4)) {
               $$0.a($$4, dqg.f);
            }
         }

         if ($$1.a(3) > 0) {
            je $$5 = $$2.f();
            if ($$0.a($$5)) {
               $$0.a($$5, dqg.e);
            }
         }

         if ($$1.a(3) > 0) {
            je $$6 = $$2.g();
            if ($$0.a($$6)) {
               $$0.a($$6, dqg.c);
            }
         }
      });
   }
}
