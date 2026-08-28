import com.mojang.serialization.MapCodec;

public class eky extends ekw {
   public static final MapCodec<eky> a = MapCodec.unit(() -> eky.b);
   public static final eky b = new eky();

   @Override
   protected ekx<?> a() {
      return ekx.a;
   }

   @Override
   public void a(ekw.a $$0) {
      azh $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            ji $$3 = $$2.h();
            if ($$0.a($$3)) {
               $$0.a($$3, dsn.d);
            }
         }

         if ($$1.a(3) > 0) {
            ji $$4 = $$2.i();
            if ($$0.a($$4)) {
               $$0.a($$4, dsn.f);
            }
         }

         if ($$1.a(3) > 0) {
            ji $$5 = $$2.f();
            if ($$0.a($$5)) {
               $$0.a($$5, dsn.e);
            }
         }

         if ($$1.a(3) > 0) {
            ji $$6 = $$2.g();
            if ($$0.a($$6)) {
               $$0.a($$6, dsn.c);
            }
         }
      });
   }
}
