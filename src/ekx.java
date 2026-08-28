import com.mojang.serialization.MapCodec;

public class ekx extends ekv {
   public static final MapCodec<ekx> a = MapCodec.unit(() -> ekx.b);
   public static final ekx b = new ekx();

   @Override
   protected ekw<?> a() {
      return ekw.a;
   }

   @Override
   public void a(ekv.a $$0) {
      azh $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            ji $$3 = $$2.h();
            if ($$0.a($$3)) {
               $$0.a($$3, dsm.d);
            }
         }

         if ($$1.a(3) > 0) {
            ji $$4 = $$2.i();
            if ($$0.a($$4)) {
               $$0.a($$4, dsm.f);
            }
         }

         if ($$1.a(3) > 0) {
            ji $$5 = $$2.f();
            if ($$0.a($$5)) {
               $$0.a($$5, dsm.e);
            }
         }

         if ($$1.a(3) > 0) {
            ji $$6 = $$2.g();
            if ($$0.a($$6)) {
               $$0.a($$6, dsm.c);
            }
         }
      });
   }
}
