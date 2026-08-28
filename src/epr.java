import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class epr extends enk {
   public static final bqu<dhu.c> d = bqu.a(
      new dhu.c(buq.o, 10, 2, 3), new dhu.c(buq.bQ, 5, 4, 4), new dhu.c(buq.bJ, 8, 5, 5), new dhu.c(buq.be, 2, 5, 5), new dhu.c(buq.az, 3, 4, 4)
   );
   public static final MapCodec<epr> e = a(epr::new);

   public epr(enk.c $$0) {
      super($$0);
   }

   @Override
   public Optional<enk.b> a(enk.a $$0) {
      dfm $$1 = $$0.h();
      ji $$2 = new ji($$1.d(), 64, $$1.e());
      return Optional.of(new enk.b($$2, (Consumer<eoc>)($$1x -> a($$1x, $$0))));
   }

   private static void a(eoc $$0, enk.a $$1) {
      epq.q $$2 = new epq.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<eno> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         eno $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public ent<?> e() {
      return ent.d;
   }
}
