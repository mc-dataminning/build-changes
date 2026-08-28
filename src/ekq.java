import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ekq extends eik {
   public static final bpi<ddj.c> d = bpi.a(
      new ddj.c(bta.i, 10, 2, 3), new ddj.c(bta.bx, 5, 4, 4), new ddj.c(bta.bq, 8, 5, 5), new ddj.c(bta.aN, 2, 5, 5), new ddj.c(bta.ap, 3, 4, 4)
   );
   public static final MapCodec<ekq> e = a(ekq::new);

   public ekq(eik.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eik.b> a(eik.a $$0) {
      dbf $$1 = $$0.h();
      iz $$2 = new iz($$1.d(), 64, $$1.e());
      return Optional.of(new eik.b($$2, (Consumer<ejc>)($$1x -> a($$1x, $$0))));
   }

   private static void a(ejc $$0, eik.a $$1) {
      ekp.q $$2 = new ekp.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<eio> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         eio $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public eit<?> e() {
      return eit.d;
   }
}
