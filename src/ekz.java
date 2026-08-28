import com.mojang.serialization.MapCodec;

public class ekz extends ekx {
   public static final MapCodec<ekz> a = MapCodec.unit(() -> ekz.b);
   public static final ekz b = new ekz();

   @Override
   protected eky<?> a() {
      return eky.a;
   }

   @Override
   public void a(ekx.a $$0) {
      azh $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            ji $$3 = $$2.h();
            if ($$0.a($$3)) {
               $$0.a($$3, dso.d);
            }
         }

         if ($$1.a(3) > 0) {
            ji $$4 = $$2.i();
            if ($$0.a($$4)) {
               $$0.a($$4, dso.f);
            }
         }

         if ($$1.a(3) > 0) {
            ji $$5 = $$2.f();
            if ($$0.a($$5)) {
               $$0.a($$5, dso.e);
            }
         }

         if ($$1.a(3) > 0) {
            ji $$6 = $$2.g();
            if ($$0.a($$6)) {
               $$0.a($$6, dso.c);
            }
         }
      });
   }
}
