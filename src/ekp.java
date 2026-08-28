import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ekp extends eij {
   public static final bph<ddi.c> d = bph.a(
      new ddi.c(bsz.i, 10, 2, 3), new ddi.c(bsz.bx, 5, 4, 4), new ddi.c(bsz.bq, 8, 5, 5), new ddi.c(bsz.aN, 2, 5, 5), new ddi.c(bsz.ap, 3, 4, 4)
   );
   public static final MapCodec<ekp> e = a(ekp::new);

   public ekp(eij.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eij.b> a(eij.a $$0) {
      dbe $$1 = $$0.h();
      iz $$2 = new iz($$1.d(), 64, $$1.e());
      return Optional.of(new eij.b($$2, (Consumer<ejb>)($$1x -> a($$1x, $$0))));
   }

   private static void a(ejb $$0, eij.a $$1) {
      eko.q $$2 = new eko.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<ein> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         ein $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public eis<?> e() {
      return eis.d;
   }
}
