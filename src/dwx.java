import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dwx extends duy {
   public static final bfe<cqv.c> d = bfe.a(
      new cqv.c(bim.i, 10, 2, 3), new cqv.c(bim.bs, 5, 4, 4), new cqv.c(bim.bl, 8, 5, 5), new cqv.c(bim.aJ, 2, 5, 5), new cqv.c(bim.al, 3, 4, 4)
   );
   public static final Codec<dwx> e = a(dwx::new);

   public dwx(duy.c $$0) {
      super($$0);
   }

   @Override
   public Optional<duy.b> a(duy.a $$0) {
      cos $$1 = $$0.h();
      gu $$2 = new gu($$1.d(), 64, $$1.e());
      return Optional.of(new duy.b($$2, (Consumer<dvq>)($$1x -> a($$1x, $$0))));
   }

   private static void a(dvq $$0, duy.a $$1) {
      dww.q $$2 = new dww.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<dvc> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         dvc $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public dvh<?> e() {
      return dvh.d;
   }
}
