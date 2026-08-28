import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class elt extends ejm {
   public static final bpe<deg.c> d = bpe.a(
      new deg.c(bsw.i, 10, 2, 3), new deg.c(bsw.bx, 5, 4, 4), new deg.c(bsw.bq, 8, 5, 5), new deg.c(bsw.aN, 2, 5, 5), new deg.c(bsw.ap, 3, 4, 4)
   );
   public static final MapCodec<elt> e = a(elt::new);

   public elt(ejm.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ejm.b> a(ejm.a $$0) {
      dcb $$1 = $$0.h();
      jd $$2 = new jd($$1.d(), 64, $$1.e());
      return Optional.of(new ejm.b($$2, (Consumer<eke>)($$1x -> a($$1x, $$0))));
   }

   private static void a(eke $$0, ejm.a $$1) {
      els.q $$2 = new els.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<ejq> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         ejq $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public ejv<?> e() {
      return ejv.d;
   }
}
