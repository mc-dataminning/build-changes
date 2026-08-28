import com.mojang.serialization.MapCodec;

public class egy extends egw {
   public static final MapCodec<egy> a = MapCodec.unit(() -> egy.b);
   public static final egy b = new egy();

   @Override
   protected egx<?> a() {
      return egx.a;
   }

   @Override
   public void a(egw.a $$0) {
      ayv $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            jd $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, dot.d);
            }
         }

         if ($$1.a(3) > 0) {
            jd $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, dot.f);
            }
         }

         if ($$1.a(3) > 0) {
            jd $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, dot.e);
            }
         }

         if ($$1.a(3) > 0) {
            jd $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, dot.c);
            }
         }
      });
   }
}
