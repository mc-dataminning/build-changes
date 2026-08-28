import com.mojang.serialization.MapCodec;

public class ehb extends egz {
   public static final MapCodec<ehb> a = MapCodec.unit(() -> ehb.b);
   public static final ehb b = new ehb();

   @Override
   protected eha<?> a() {
      return eha.a;
   }

   @Override
   public void a(egz.a $$0) {
      ayw $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            jd $$3 = $$2.h();
            if ($$0.a($$3)) {
               $$0.a($$3, dov.d);
            }
         }

         if ($$1.a(3) > 0) {
            jd $$4 = $$2.i();
            if ($$0.a($$4)) {
               $$0.a($$4, dov.f);
            }
         }

         if ($$1.a(3) > 0) {
            jd $$5 = $$2.f();
            if ($$0.a($$5)) {
               $$0.a($$5, dov.e);
            }
         }

         if ($$1.a(3) > 0) {
            jd $$6 = $$2.g();
            if ($$0.a($$6)) {
               $$0.a($$6, dov.c);
            }
         }
      });
   }
}
