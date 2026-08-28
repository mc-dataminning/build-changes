import com.mojang.serialization.MapCodec;

public class egj extends egh {
   public static final MapCodec<egj> a = MapCodec.unit(() -> egj.b);
   public static final egj b = new egj();

   @Override
   protected egi<?> a() {
      return egi.a;
   }

   @Override
   public void a(egh.a $$0) {
      ayo $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            ja $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, doe.d);
            }
         }

         if ($$1.a(3) > 0) {
            ja $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, doe.f);
            }
         }

         if ($$1.a(3) > 0) {
            ja $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, doe.e);
            }
         }

         if ($$1.a(3) > 0) {
            ja $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, doe.c);
            }
         }
      });
   }
}
