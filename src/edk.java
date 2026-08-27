import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class edk extends ebe {
   public static final bki<cwy.c> d = bki.a(
      new cwy.c(bnu.j, 10, 2, 3), new cwy.c(bnu.bv, 5, 4, 4), new cwy.c(bnu.bo, 8, 5, 5), new cwy.c(bnu.aL, 2, 5, 5), new cwy.c(bnu.an, 3, 4, 4)
   );
   public static final Codec<edk> e = a(edk::new);

   public edk(ebe.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ebe.b> a(ebe.a $$0) {
      cuu $$1 = $$0.h();
      hz $$2 = new hz($$1.d(), 64, $$1.e());
      return Optional.of(new ebe.b($$2, (Consumer<ebw>)($$1x -> a($$1x, $$0))));
   }

   private static void a(ebw $$0, ebe.a $$1) {
      edj.q $$2 = new edj.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<ebi> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         ebi $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public ebn<?> e() {
      return ebn.d;
   }
}
