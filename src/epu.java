import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class epu extends enn {
   public static final bqx<dhx.c> d = bqx.a(
      new dhx.c(but.o, 10, 2, 3), new dhx.c(but.bQ, 5, 4, 4), new dhx.c(but.bJ, 8, 5, 5), new dhx.c(but.be, 2, 5, 5), new dhx.c(but.az, 3, 4, 4)
   );
   public static final MapCodec<epu> e = a(epu::new);

   public epu(enn.c $$0) {
      super($$0);
   }

   @Override
   public Optional<enn.b> a(enn.a $$0) {
      dfp $$1 = $$0.h();
      ji $$2 = new ji($$1.d(), 64, $$1.e());
      return Optional.of(new enn.b($$2, (Consumer<eof>)($$1x -> a($$1x, $$0))));
   }

   private static void a(eof $$0, enn.a $$1) {
      ept.q $$2 = new ept.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<enr> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         enr $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public enw<?> e() {
      return enw.d;
   }
}
