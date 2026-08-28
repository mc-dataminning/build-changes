import com.mojang.serialization.MapCodec;

public class eoz extends eox {
   public static final MapCodec<eoz> a = MapCodec.unit(() -> eoz.b);
   public static final eoz b = new eoz();

   @Override
   protected eoy<?> a() {
      return eoy.a;
   }

   @Override
   public void a(eox.a $$0) {
      azv $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            iv $$3 = $$2.h();
            if ($$0.a($$3)) {
               $$0.a($$3, dwe.d);
            }
         }

         if ($$1.a(3) > 0) {
            iv $$4 = $$2.i();
            if ($$0.a($$4)) {
               $$0.a($$4, dwe.f);
            }
         }

         if ($$1.a(3) > 0) {
            iv $$5 = $$2.f();
            if ($$0.a($$5)) {
               $$0.a($$5, dwe.e);
            }
         }

         if ($$1.a(3) > 0) {
            iv $$6 = $$2.g();
            if ($$0.a($$6)) {
               $$0.a($$6, dwe.c);
            }
         }
      });
   }
}
