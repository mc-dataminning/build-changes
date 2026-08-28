import com.mojang.serialization.MapCodec;

public class egc extends ega {
   public static final MapCodec<egc> a = MapCodec.unit(() -> egc.b);
   public static final egc b = new egc();

   @Override
   protected egb<?> a() {
      return egb.a;
   }

   @Override
   public void a(ega.a $$0) {
      aym $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            ja $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, dob.d);
            }
         }

         if ($$1.a(3) > 0) {
            ja $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, dob.f);
            }
         }

         if ($$1.a(3) > 0) {
            ja $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, dob.e);
            }
         }

         if ($$1.a(3) > 0) {
            ja $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, dob.c);
            }
         }
      });
   }
}
