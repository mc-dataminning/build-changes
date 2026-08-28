import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ely extends ejr {
   public static final bpf<dei.c> d = bpf.a(
      new dei.c(bsx.i, 10, 2, 3), new dei.c(bsx.bx, 5, 4, 4), new dei.c(bsx.bq, 8, 5, 5), new dei.c(bsx.aN, 2, 5, 5), new dei.c(bsx.ap, 3, 4, 4)
   );
   public static final MapCodec<ely> e = a(ely::new);

   public ely(ejr.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ejr.b> a(ejr.a $$0) {
      dcd $$1 = $$0.h();
      jd $$2 = new jd($$1.d(), 64, $$1.e());
      return Optional.of(new ejr.b($$2, (Consumer<ekj>)($$1x -> a($$1x, $$0))));
   }

   private static void a(ekj $$0, ejr.a $$1) {
      elx.q $$2 = new elx.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<ejv> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         ejv $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public eka<?> e() {
      return eka.d;
   }
}
