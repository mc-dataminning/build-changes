import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eem extends ecg {
   public static final bkz<cxp.c> d = bkz.a(
      new cxp.c(bol.j, 10, 2, 3), new cxp.c(bol.bv, 5, 4, 4), new cxp.c(bol.bo, 8, 5, 5), new cxp.c(bol.aL, 2, 5, 5), new cxp.c(bol.an, 3, 4, 4)
   );
   public static final Codec<eem> e = a(eem::new);

   public eem(ecg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ecg.b> a(ecg.a $$0) {
      cvl $$1 = $$0.h();
      ib $$2 = new ib($$1.d(), 64, $$1.e());
      return Optional.of(new ecg.b($$2, (Consumer<ecy>)($$1x -> a($$1x, $$0))));
   }

   private static void a(ecy $$0, ecg.a $$1) {
      eel.q $$2 = new eel.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<eck> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         eck $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public ecp<?> e() {
      return ecp.d;
   }
}
