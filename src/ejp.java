import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ejp extends ehj {
   public static final boi<dci.c> d = boi.a(
      new dci.c(bsa.i, 10, 2, 3), new dci.c(bsa.bx, 5, 4, 4), new dci.c(bsa.bq, 8, 5, 5), new dci.c(bsa.aN, 2, 5, 5), new dci.c(bsa.ap, 3, 4, 4)
   );
   public static final MapCodec<ejp> e = a(ejp::new);

   public ejp(ehj.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ehj.b> a(ehj.a $$0) {
      dae $$1 = $$0.h();
      io $$2 = new io($$1.d(), 64, $$1.e());
      return Optional.of(new ehj.b($$2, (Consumer<eib>)($$1x -> a($$1x, $$0))));
   }

   private static void a(eib $$0, ehj.a $$1) {
      ejo.q $$2 = new ejo.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<ehn> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         ehn $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public ehs<?> e() {
      return ehs.d;
   }
}
