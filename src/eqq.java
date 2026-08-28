import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eqq extends eoj {
   public static final bru<div.c> d = bru.a(
      new div.c(bvq.o, 10, 2, 3), new div.c(bvq.bR, 5, 4, 4), new div.c(bvq.bK, 8, 5, 5), new div.c(bvq.bf, 2, 5, 5), new div.c(bvq.aA, 3, 4, 4)
   );
   public static final MapCodec<eqq> e = a(eqq::new);

   public eqq(eoj.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eoj.b> a(eoj.a $$0) {
      dgn $$1 = $$0.h();
      jh $$2 = new jh($$1.d(), 64, $$1.e());
      return Optional.of(new eoj.b($$2, (Consumer<epb>)($$1x -> a($$1x, $$0))));
   }

   private static void a(epb $$0, eoj.a $$1) {
      eqp.q $$2 = new eqp.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<eon> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         eon $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public eos<?> e() {
      return eos.d;
   }
}
