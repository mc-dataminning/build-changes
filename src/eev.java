import com.mojang.serialization.MapCodec;

public class eev extends eet {
   public static final MapCodec<eev> a = MapCodec.unit(() -> eev.b);
   public static final eev b = new eev();

   @Override
   protected eeu<?> a() {
      return eeu.a;
   }

   @Override
   public void a(eet.a $$0) {
      ayk $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            io $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, dmu.d);
            }
         }

         if ($$1.a(3) > 0) {
            io $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, dmu.f);
            }
         }

         if ($$1.a(3) > 0) {
            io $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, dmu.e);
            }
         }

         if ($$1.a(3) > 0) {
            io $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, dmu.c);
            }
         }
      });
   }
}
