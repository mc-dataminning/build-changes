import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eti extends erb {
   public static final bso<dkp.c> d = bso.<dkp.c>b()
      .a(new dkp.c(bwo.o, 2, 3), 10)
      .a(new dkp.c(bwo.bR, 4, 4), 5)
      .a(new dkp.c(bwo.bK, 5, 5), 8)
      .a(new dkp.c(bwo.bf, 5, 5), 2)
      .a(new dkp.c(bwo.az, 4, 4), 3)
      .a();
   public static final MapCodec<eti> e = a(eti::new);

   public eti(erb.c $$0) {
      super($$0);
   }

   @Override
   public Optional<erb.b> a(erb.a $$0) {
      dih $$1 = $$0.h();
      iu $$2 = new iu($$1.d(), 64, $$1.e());
      return Optional.of(new erb.b($$2, (Consumer<ert>)($$1x -> a($$1x, $$0))));
   }

   private static void a(ert $$0, erb.a $$1) {
      eth.q $$2 = new eth.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<erf> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         erf $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public erk<?> e() {
      return erk.d;
   }
}
