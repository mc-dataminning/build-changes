import com.mojang.serialization.MapCodec;

public class eex extends eev {
   public static final MapCodec<eex> a = MapCodec.unit(() -> eex.b);
   public static final eex b = new eex();

   @Override
   protected eew<?> a() {
      return eew.a;
   }

   @Override
   public void a(eev.a $$0) {
      aym $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            io $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, dmw.d);
            }
         }

         if ($$1.a(3) > 0) {
            io $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, dmw.f);
            }
         }

         if ($$1.a(3) > 0) {
            io $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, dmw.e);
            }
         }

         if ($$1.a(3) > 0) {
            io $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, dmw.c);
            }
         }
      });
   }
}
