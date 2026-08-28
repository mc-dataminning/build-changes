import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eks extends eim {
   public static final bpk<ddl.c> d = bpk.a(
      new ddl.c(btc.i, 10, 2, 3), new ddl.c(btc.bx, 5, 4, 4), new ddl.c(btc.bq, 8, 5, 5), new ddl.c(btc.aN, 2, 5, 5), new ddl.c(btc.ap, 3, 4, 4)
   );
   public static final MapCodec<eks> e = a(eks::new);

   public eks(eim.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eim.b> a(eim.a $$0) {
      dbh $$1 = $$0.h();
      iz $$2 = new iz($$1.d(), 64, $$1.e());
      return Optional.of(new eim.b($$2, (Consumer<eje>)($$1x -> a($$1x, $$0))));
   }

   private static void a(eje $$0, eim.a $$1) {
      ekr.q $$2 = new ekr.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<eiq> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         eiq $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public eiv<?> e() {
      return eiv.d;
   }
}
