import com.mojang.serialization.MapCodec;

public class enu extends ens {
   public static final MapCodec<enu> a = MapCodec.unit(() -> enu.b);
   public static final enu b = new enu();

   @Override
   protected ent<?> a() {
      return ent.a;
   }

   @Override
   public void a(ens.a $$0) {
      azt $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            iu $$3 = $$2.h();
            if ($$0.a($$3)) {
               $$0.a($$3, dva.d);
            }
         }

         if ($$1.a(3) > 0) {
            iu $$4 = $$2.i();
            if ($$0.a($$4)) {
               $$0.a($$4, dva.f);
            }
         }

         if ($$1.a(3) > 0) {
            iu $$5 = $$2.f();
            if ($$0.a($$5)) {
               $$0.a($$5, dva.e);
            }
         }

         if ($$1.a(3) > 0) {
            iu $$6 = $$2.g();
            if ($$0.a($$6)) {
               $$0.a($$6, dva.c);
            }
         }
      });
   }
}
