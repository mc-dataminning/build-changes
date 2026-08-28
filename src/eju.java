import com.mojang.serialization.MapCodec;

public class eju extends ejs {
   public static final MapCodec<eju> a = MapCodec.unit(() -> eju.b);
   public static final eju b = new eju();

   @Override
   protected ejt<?> a() {
      return ejt.a;
   }

   @Override
   public void a(ejs.a $$0) {
      azu $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            jh $$3 = $$2.h();
            if ($$0.a($$3)) {
               $$0.a($$3, drm.d);
            }
         }

         if ($$1.a(3) > 0) {
            jh $$4 = $$2.i();
            if ($$0.a($$4)) {
               $$0.a($$4, drm.f);
            }
         }

         if ($$1.a(3) > 0) {
            jh $$5 = $$2.f();
            if ($$0.a($$5)) {
               $$0.a($$5, drm.e);
            }
         }

         if ($$1.a(3) > 0) {
            jh $$6 = $$2.g();
            if ($$0.a($$6)) {
               $$0.a($$6, drm.c);
            }
         }
      });
   }
}
