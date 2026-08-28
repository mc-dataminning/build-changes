import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eny extends elr {
   public static final bqk<dgi.c> d = bqk.a(
      new dgi.c(bug.i, 10, 2, 3), new dgi.c(bug.bx, 5, 4, 4), new dgi.c(bug.bq, 8, 5, 5), new dgi.c(bug.aN, 2, 5, 5), new dgi.c(bug.ap, 3, 4, 4)
   );
   public static final MapCodec<eny> e = a(eny::new);

   public eny(elr.c $$0) {
      super($$0);
   }

   @Override
   public Optional<elr.b> a(elr.a $$0) {
      deb $$1 = $$0.h();
      jg $$2 = new jg($$1.d(), 64, $$1.e());
      return Optional.of(new elr.b($$2, (Consumer<emj>)($$1x -> a($$1x, $$0))));
   }

   private static void a(emj $$0, elr.a $$1) {
      enx.q $$2 = new enx.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<elv> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         elv $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public ema<?> e() {
      return ema.d;
   }
}
