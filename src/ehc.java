import com.mojang.serialization.MapCodec;

public class ehc extends eha {
   public static final MapCodec<ehc> a = MapCodec.unit(() -> ehc.b);
   public static final ehc b = new ehc();

   @Override
   protected ehb<?> a() {
      return ehb.a;
   }

   @Override
   public void a(eha.a $$0) {
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
