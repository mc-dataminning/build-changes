import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eqq extends eoj {
   public static final brj<dio.c> d = brj.<dio.c>b()
      .a(new dio.c(bvi.o, 2, 3), 10)
      .a(new dio.c(bvi.bQ, 4, 4), 5)
      .a(new dio.c(bvi.bJ, 5, 5), 8)
      .a(new dio.c(bvi.be, 5, 5), 2)
      .a(new dio.c(bvi.az, 4, 4), 3)
      .a();
   public static final MapCodec<eqq> e = a(eqq::new);

   public eqq(eoj.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eoj.b> a(eoj.a $$0) {
      dgg $$1 = $$0.h();
      ji $$2 = new ji($$1.d(), 64, $$1.e());
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
