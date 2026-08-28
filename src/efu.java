import com.mojang.serialization.MapCodec;

public class efu extends efs {
   public static final MapCodec<efu> a = MapCodec.unit(() -> efu.b);
   public static final efu b = new efu();

   @Override
   protected eft<?> a() {
      return eft.a;
   }

   @Override
   public void a(efs.a $$0) {
      azf $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            iz $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, dnt.d);
            }
         }

         if ($$1.a(3) > 0) {
            iz $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, dnt.f);
            }
         }

         if ($$1.a(3) > 0) {
            iz $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, dnt.e);
            }
         }

         if ($$1.a(3) > 0) {
            iz $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, dnt.c);
            }
         }
      });
   }
}
