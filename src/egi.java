import com.mojang.serialization.MapCodec;

public class egi extends egg {
   public static final MapCodec<egi> a = MapCodec.unit(() -> egi.b);
   public static final egi b = new egi();

   @Override
   protected egh<?> a() {
      return egh.a;
   }

   @Override
   public void a(egg.a $$0) {
      ayo $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            ja $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, dod.d);
            }
         }

         if ($$1.a(3) > 0) {
            ja $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, dod.f);
            }
         }

         if ($$1.a(3) > 0) {
            ja $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, dod.e);
            }
         }

         if ($$1.a(3) > 0) {
            ja $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, dod.c);
            }
         }
      });
   }
}
