import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ebm extends dzg {
   public static final bip<cva.c> d = bip.a(
      new cva.c(blz.i, 10, 2, 3), new cva.c(blz.bu, 5, 4, 4), new cva.c(blz.bn, 8, 5, 5), new cva.c(blz.aK, 2, 5, 5), new cva.c(blz.am, 3, 4, 4)
   );
   public static final Codec<ebm> e = a(ebm::new);

   public ebm(dzg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dzg.b> a(dzg.a $$0) {
      csw $$1 = $$0.h();
      hx $$2 = new hx($$1.d(), 64, $$1.e());
      return Optional.of(new dzg.b($$2, (Consumer<dzy>)($$1x -> a($$1x, $$0))));
   }

   private static void a(dzy $$0, dzg.a $$1) {
      ebl.q $$2 = new ebl.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<dzk> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         dzk $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public dzp<?> e() {
      return dzp.d;
   }
}
