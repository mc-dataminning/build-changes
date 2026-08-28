import com.mojang.serialization.MapCodec;

public class elo extends elm {
   public static final MapCodec<elo> a = MapCodec.unit(() -> elo.b);
   public static final elo b = new elo();

   @Override
   protected eln<?> a() {
      return eln.a;
   }

   @Override
   public void a(elm.a $$0) {
      bam $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            jh $$3 = $$2.h();
            if ($$0.a($$3)) {
               $$0.a($$3, dtd.d);
            }
         }

         if ($$1.a(3) > 0) {
            jh $$4 = $$2.i();
            if ($$0.a($$4)) {
               $$0.a($$4, dtd.f);
            }
         }

         if ($$1.a(3) > 0) {
            jh $$5 = $$2.f();
            if ($$0.a($$5)) {
               $$0.a($$5, dtd.e);
            }
         }

         if ($$1.a(3) > 0) {
            jh $$6 = $$2.g();
            if ($$0.a($$6)) {
               $$0.a($$6, dtd.c);
            }
         }
      });
   }
}
