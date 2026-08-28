import com.mojang.serialization.MapCodec;

public class eis extends eiq {
   public static final MapCodec<eis> a = MapCodec.unit(() -> eis.b);
   public static final eis b = new eis();

   @Override
   protected eir<?> a() {
      return eir.a;
   }

   @Override
   public void a(eiq.a $$0) {
      azn $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            jf $$3 = $$2.h();
            if ($$0.a($$3)) {
               $$0.a($$3, dqj.d);
            }
         }

         if ($$1.a(3) > 0) {
            jf $$4 = $$2.i();
            if ($$0.a($$4)) {
               $$0.a($$4, dqj.f);
            }
         }

         if ($$1.a(3) > 0) {
            jf $$5 = $$2.f();
            if ($$0.a($$5)) {
               $$0.a($$5, dqj.e);
            }
         }

         if ($$1.a(3) > 0) {
            jf $$6 = $$2.g();
            if ($$0.a($$6)) {
               $$0.a($$6, dqj.c);
            }
         }
      });
   }
}
