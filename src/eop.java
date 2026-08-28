import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eop extends emi {
   public static final bqw<dha.c> d = bqw.a(
      new dha.c(bus.o, 10, 2, 3), new dha.c(bus.bN, 5, 4, 4), new dha.c(bus.bG, 8, 5, 5), new dha.c(bus.bb, 2, 5, 5), new dha.c(bus.ay, 3, 4, 4)
   );
   public static final MapCodec<eop> e = a(eop::new);

   public eop(emi.c $$0) {
      super($$0);
   }

   @Override
   public Optional<emi.b> a(emi.a $$0) {
      des $$1 = $$0.h();
      jh $$2 = new jh($$1.d(), 64, $$1.e());
      return Optional.of(new emi.b($$2, (Consumer<ena>)($$1x -> a($$1x, $$0))));
   }

   private static void a(ena $$0, emi.a $$1) {
      eoo.q $$2 = new eoo.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<emm> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         emm $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public emr<?> e() {
      return emr.d;
   }
}
