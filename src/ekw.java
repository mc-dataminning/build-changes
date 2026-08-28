import com.mojang.serialization.MapCodec;

public class ekw extends eku {
   public static final MapCodec<ekw> a = MapCodec.unit(() -> ekw.b);
   public static final ekw b = new ekw();

   @Override
   protected ekv<?> a() {
      return ekv.a;
   }

   @Override
   public void a(eku.a $$0) {
      azg $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            ji $$3 = $$2.h();
            if ($$0.a($$3)) {
               $$0.a($$3, dsl.d);
            }
         }

         if ($$1.a(3) > 0) {
            ji $$4 = $$2.i();
            if ($$0.a($$4)) {
               $$0.a($$4, dsl.f);
            }
         }

         if ($$1.a(3) > 0) {
            ji $$5 = $$2.f();
            if ($$0.a($$5)) {
               $$0.a($$5, dsl.e);
            }
         }

         if ($$1.a(3) > 0) {
            ji $$6 = $$2.g();
            if ($$0.a($$6)) {
               $$0.a($$6, dsl.c);
            }
         }
      });
   }
}
