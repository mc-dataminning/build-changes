import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ele extends eix {
   public static final bov<dds.c> d = bov.a(
      new dds.c(bsn.i, 10, 2, 3), new dds.c(bsn.bx, 5, 4, 4), new dds.c(bsn.bq, 8, 5, 5), new dds.c(bsn.aN, 2, 5, 5), new dds.c(bsn.ap, 3, 4, 4)
   );
   public static final MapCodec<ele> e = a(ele::new);

   public ele(eix.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eix.b> a(eix.a $$0) {
      dbn $$1 = $$0.h();
      ja $$2 = new ja($$1.d(), 64, $$1.e());
      return Optional.of(new eix.b($$2, (Consumer<ejp>)($$1x -> a($$1x, $$0))));
   }

   private static void a(ejp $$0, eix.a $$1) {
      eld.q $$2 = new eld.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<ejb> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         ejb $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public ejg<?> e() {
      return ejg.d;
   }
}
