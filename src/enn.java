import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class enn extends elg {
   public static final bqg<dfw.c> d = bqg.a(
      new dfw.c(bty.i, 10, 2, 3), new dfw.c(bty.bx, 5, 4, 4), new dfw.c(bty.bq, 8, 5, 5), new dfw.c(bty.aN, 2, 5, 5), new dfw.c(bty.ap, 3, 4, 4)
   );
   public static final MapCodec<enn> e = a(enn::new);

   public enn(elg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<elg.b> a(elg.a $$0) {
      ddp $$1 = $$0.h();
      jf $$2 = new jf($$1.d(), 64, $$1.e());
      return Optional.of(new elg.b($$2, (Consumer<ely>)($$1x -> a($$1x, $$0))));
   }

   private static void a(ely $$0, elg.a $$1) {
      enm.q $$2 = new enm.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<elk> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         elk $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public elp<?> e() {
      return elp.d;
   }
}
