import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eko extends eii {
   public static final bpg<ddh.c> d = bpg.a(
      new ddh.c(bsy.i, 10, 2, 3), new ddh.c(bsy.bx, 5, 4, 4), new ddh.c(bsy.bq, 8, 5, 5), new ddh.c(bsy.aN, 2, 5, 5), new ddh.c(bsy.ap, 3, 4, 4)
   );
   public static final MapCodec<eko> e = a(eko::new);

   public eko(eii.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eii.b> a(eii.a $$0) {
      dbd $$1 = $$0.h();
      iz $$2 = new iz($$1.d(), 64, $$1.e());
      return Optional.of(new eii.b($$2, (Consumer<eja>)($$1x -> a($$1x, $$0))));
   }

   private static void a(eja $$0, eii.a $$1) {
      ekn.q $$2 = new ekn.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<eim> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         eim $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public eir<?> e() {
      return eir.d;
   }
}
