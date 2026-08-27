import com.mojang.serialization.Codec;

public class ect extends ecr {
   public static final Codec<ect> a = Codec.unit(() -> ect.b);
   public static final ect b = new ect();

   @Override
   protected ecs<?> a() {
      return ecs.a;
   }

   @Override
   public void a(ecr.a $$0) {
      axr $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            ib $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, dkt.d);
            }
         }

         if ($$1.a(3) > 0) {
            ib $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, dkt.f);
            }
         }

         if ($$1.a(3) > 0) {
            ib $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, dkt.e);
            }
         }

         if ($$1.a(3) > 0) {
            ib $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, dkt.c);
            }
         }
      });
   }
}
