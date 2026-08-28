import com.mojang.serialization.MapCodec;

public class eou extends eos {
   public static final MapCodec<eou> a = MapCodec.unit(() -> eou.b);
   public static final eou b = new eou();

   @Override
   protected eot<?> a() {
      return eot.a;
   }

   @Override
   public void a(eos.a $$0) {
      azv $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            iv $$3 = $$2.h();
            if ($$0.a($$3)) {
               $$0.a($$3, dvz.d);
            }
         }

         if ($$1.a(3) > 0) {
            iv $$4 = $$2.i();
            if ($$0.a($$4)) {
               $$0.a($$4, dvz.f);
            }
         }

         if ($$1.a(3) > 0) {
            iv $$5 = $$2.f();
            if ($$0.a($$5)) {
               $$0.a($$5, dvz.e);
            }
         }

         if ($$1.a(3) > 0) {
            iv $$6 = $$2.g();
            if ($$0.a($$6)) {
               $$0.a($$6, dvz.c);
            }
         }
      });
   }
}
