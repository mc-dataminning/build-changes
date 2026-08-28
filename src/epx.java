import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class epx extends enm {
   public static final MapCodec<epx> d = a(epx::new);

   public epx(enm.c $$0) {
      super($$0);
   }

   @Override
   public Optional<enm.b> a(enm.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (jr<dhk> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(awo.X)) {
            return Optional.empty();
         }
      }

      return a($$0, ecs.a.c, $$1x -> a($$1x, $$0));
   }

   private static enq a(dfo $$0, edr $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      jn $$4 = jn.c.a.a($$1);
      return new epw.h($$1, $$2, $$3, $$4);
   }

   private static void a(eoe $$0, enm.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static eob a(dfo $$0, long $$1, eob $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         edr $$3 = new edr(new ect(edh.a()));
         $$3.c($$1, $$0.h, $$0.i);
         enq $$4 = $$2.c().get(0);
         ene $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         jn $$8 = jn.c.a.a($$3);
         jn $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         enq $$10 = new epw.h($$3, $$6, $$7, $$9);
         eoe $$11 = new eoe();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public env<?> e() {
      return env.j;
   }
}
