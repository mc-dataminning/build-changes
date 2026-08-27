import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ejr extends ehl {
   public static final bok<dck.c> d = bok.a(
      new dck.c(bsc.i, 10, 2, 3), new dck.c(bsc.bx, 5, 4, 4), new dck.c(bsc.bq, 8, 5, 5), new dck.c(bsc.aN, 2, 5, 5), new dck.c(bsc.ap, 3, 4, 4)
   );
   public static final MapCodec<ejr> e = a(ejr::new);

   public ejr(ehl.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ehl.b> a(ehl.a $$0) {
      dag $$1 = $$0.h();
      io $$2 = new io($$1.d(), 64, $$1.e());
      return Optional.of(new ehl.b($$2, (Consumer<eid>)($$1x -> a($$1x, $$0))));
   }

   private static void a(eid $$0, ehl.a $$1) {
      ejq.q $$2 = new ejq.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<ehp> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         ehp $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public ehu<?> e() {
      return ehu.d;
   }
}
