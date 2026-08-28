import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ekl extends eif {
   public static final bpd<dde.c> d = bpd.a(
      new dde.c(bsv.i, 10, 2, 3), new dde.c(bsv.bx, 5, 4, 4), new dde.c(bsv.bq, 8, 5, 5), new dde.c(bsv.aN, 2, 5, 5), new dde.c(bsv.ap, 3, 4, 4)
   );
   public static final MapCodec<ekl> e = a(ekl::new);

   public ekl(eif.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eif.b> a(eif.a $$0) {
      dba $$1 = $$0.h();
      iz $$2 = new iz($$1.d(), 64, $$1.e());
      return Optional.of(new eif.b($$2, (Consumer<eix>)($$1x -> a($$1x, $$0))));
   }

   private static void a(eix $$0, eif.a $$1) {
      ekk.q $$2 = new ekk.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<eij> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         eij $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public eio<?> e() {
      return eio.d;
   }
}
