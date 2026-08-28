import com.mojang.serialization.MapCodec;

public class eof extends eod {
   public static final MapCodec<eof> a = MapCodec.unit(() -> eof.b);
   public static final eof b = new eof();

   @Override
   protected eoe<?> a() {
      return eoe.a;
   }

   @Override
   public void a(eod.a $$0) {
      azv $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            iu $$3 = $$2.h();
            if ($$0.a($$3)) {
               $$0.a($$3, dvk.d);
            }
         }

         if ($$1.a(3) > 0) {
            iu $$4 = $$2.i();
            if ($$0.a($$4)) {
               $$0.a($$4, dvk.f);
            }
         }

         if ($$1.a(3) > 0) {
            iu $$5 = $$2.f();
            if ($$0.a($$5)) {
               $$0.a($$5, dvk.e);
            }
         }

         if ($$1.a(3) > 0) {
            iu $$6 = $$2.g();
            if ($$0.a($$6)) {
               $$0.a($$6, dvk.c);
            }
         }
      });
   }
}
