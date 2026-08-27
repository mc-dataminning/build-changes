import com.mojang.serialization.Codec;

public class eeb extends edz {
   public static final Codec<eeb> a = Codec.unit(() -> eeb.b);
   public static final eeb b = new eeb();

   @Override
   protected eea<?> a() {
      return eea.a;
   }

   @Override
   public void a(edz.a $$0) {
      ayg $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            in $$3 = $$2.g();
            if ($$0.a($$3)) {
               $$0.a($$3, dma.d);
            }
         }

         if ($$1.a(3) > 0) {
            in $$4 = $$2.h();
            if ($$0.a($$4)) {
               $$0.a($$4, dma.f);
            }
         }

         if ($$1.a(3) > 0) {
            in $$5 = $$2.e();
            if ($$0.a($$5)) {
               $$0.a($$5, dma.e);
            }
         }

         if ($$1.a(3) > 0) {
            in $$6 = $$2.f();
            if ($$0.a($$6)) {
               $$0.a($$6, dma.c);
            }
         }
      });
   }
}
