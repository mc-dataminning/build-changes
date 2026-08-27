import com.mojang.serialization.Codec;

public class dsl extends dsj {
   public static final Codec<dsl> a = Codec.unit(() -> dsl.b);
   public static final dsl b = new dsl();

   @Override
   protected dsk<?> a() {
      return dsk.a;
   }

   @Override
   public void a(dsj.a $$0) {
      aru $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            gu $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, dbg.c);
            }
         }

         if ($$1.a(3) > 0) {
            gu $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, dbg.e);
            }
         }

         if ($$1.a(3) > 0) {
            gu $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, dbg.d);
            }
         }

         if ($$1.a(3) > 0) {
            gu $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, dbg.b);
            }
         }
      });
   }
}
