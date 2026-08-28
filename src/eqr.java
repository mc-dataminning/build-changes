import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eqr extends eok {
   public static final brv<diw.c> d = brv.a(
      new diw.c(bvr.o, 10, 2, 3), new diw.c(bvr.bR, 5, 4, 4), new diw.c(bvr.bK, 8, 5, 5), new diw.c(bvr.bf, 2, 5, 5), new diw.c(bvr.aA, 3, 4, 4)
   );
   public static final MapCodec<eqr> e = a(eqr::new);

   public eqr(eok.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eok.b> a(eok.a $$0) {
      dgo $$1 = $$0.h();
      jh $$2 = new jh($$1.d(), 64, $$1.e());
      return Optional.of(new eok.b($$2, (Consumer<epc>)($$1x -> a($$1x, $$0))));
   }

   private static void a(epc $$0, eok.a $$1) {
      eqq.q $$2 = new eqq.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<eoo> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         eoo $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public eot<?> e() {
      return eot.d;
   }
}
