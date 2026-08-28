import com.mojang.serialization.MapCodec;

public class eia extends ehy {
   public static final MapCodec<eia> a = MapCodec.unit(() -> eia.b);
   public static final eia b = new eia();

   @Override
   protected ehz<?> a() {
      return ehz.a;
   }

   @Override
   public void a(ehy.a $$0) {
      azk $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            je $$3 = $$2.h();
            if ($$0.a($$3)) {
               $$0.a($$3, dps.d);
            }
         }

         if ($$1.a(3) > 0) {
            je $$4 = $$2.i();
            if ($$0.a($$4)) {
               $$0.a($$4, dps.f);
            }
         }

         if ($$1.a(3) > 0) {
            je $$5 = $$2.f();
            if ($$0.a($$5)) {
               $$0.a($$5, dps.e);
            }
         }

         if ($$1.a(3) > 0) {
            je $$6 = $$2.g();
            if ($$0.a($$6)) {
               $$0.a($$6, dps.c);
            }
         }
      });
   }
}
