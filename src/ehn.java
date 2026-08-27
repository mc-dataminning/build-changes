import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ehn extends efh {
   public static final bmo<dai.c> d = bmo.a(
      new dai.c(bqb.i, 10, 2, 3), new dai.c(bqb.bw, 5, 4, 4), new dai.c(bqb.bp, 8, 5, 5), new dai.c(bqb.aM, 2, 5, 5), new dai.c(bqb.ao, 3, 4, 4)
   );
   public static final Codec<ehn> e = a(ehn::new);

   public ehn(efh.c $$0) {
      super($$0);
   }

   @Override
   public Optional<efh.b> a(efh.a $$0) {
      cye $$1 = $$0.h();
      ib $$2 = new ib($$1.d(), 64, $$1.e());
      return Optional.of(new efh.b($$2, (Consumer<efz>)($$1x -> a($$1x, $$0))));
   }

   private static void a(efz $$0, efh.a $$1) {
      ehm.q $$2 = new ehm.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<efl> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         efl $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public efq<?> e() {
      return efq.d;
   }
}
