import com.mojang.serialization.MapCodec;

public class eon extends eol {
   public static final MapCodec<eon> a = MapCodec.unit(() -> eon.b);
   public static final eon b = new eon();

   @Override
   protected eom<?> a() {
      return eom.a;
   }

   @Override
   public void a(eol.a $$0) {
      azv $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            iu $$3 = $$2.h();
            if ($$0.a($$3)) {
               $$0.a($$3, dvs.d);
            }
         }

         if ($$1.a(3) > 0) {
            iu $$4 = $$2.i();
            if ($$0.a($$4)) {
               $$0.a($$4, dvs.f);
            }
         }

         if ($$1.a(3) > 0) {
            iu $$5 = $$2.f();
            if ($$0.a($$5)) {
               $$0.a($$5, dvs.e);
            }
         }

         if ($$1.a(3) > 0) {
            iu $$6 = $$2.g();
            if ($$0.a($$6)) {
               $$0.a($$6, dvs.c);
            }
         }
      });
   }
}
