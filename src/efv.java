import com.mojang.serialization.MapCodec;

public class efv extends eft {
   public static final MapCodec<efv> a = MapCodec.unit(() -> efv.b);
   public static final efv b = new efv();

   @Override
   protected efu<?> a() {
      return efu.a;
   }

   @Override
   public void a(eft.a $$0) {
      azg $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            iz $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, dnu.d);
            }
         }

         if ($$1.a(3) > 0) {
            iz $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, dnu.f);
            }
         }

         if ($$1.a(3) > 0) {
            iz $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, dnu.e);
            }
         }

         if ($$1.a(3) > 0) {
            iz $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, dnu.c);
            }
         }
      });
   }
}
