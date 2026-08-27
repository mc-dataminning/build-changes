import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class elz extends ejt {
   public static final boo<ddl.c> d = boo.a(
      new ddl.c(bsb.k, 10, 2, 3), new ddl.c(bsb.bC, 5, 4, 4), new ddl.c(bsb.bu, 8, 5, 5), new ddl.c(bsb.aP, 2, 5, 5), new ddl.c(bsb.aq, 3, 4, 4)
   );
   public static final Codec<elz> e = a(elz::new);

   public elz(ejt.d $$0) {
      super($$0);
   }

   @Override
   public Optional<ejt.c> a(ejt.b $$0) {
      dbh $$1 = $$0.h();
      ir $$2 = new ir($$1.d(), 64, $$1.e());
      return Optional.of(new ejt.c($$2, (Consumer<ekl>)($$1x -> a($$1x, $$0))));
   }

   private static void a(ekl $$0, ejt.b $$1) {
      ely.q $$2 = new ely.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<ejx> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         ejx $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public ekc<?> f() {
      return ekc.d;
   }
}
