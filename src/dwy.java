import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dwy extends duz {
   public static final bfe<cqw.c> d = bfe.a(
      new cqw.c(bim.i, 10, 2, 3), new cqw.c(bim.bs, 5, 4, 4), new cqw.c(bim.bl, 8, 5, 5), new cqw.c(bim.aJ, 2, 5, 5), new cqw.c(bim.al, 3, 4, 4)
   );
   public static final Codec<dwy> e = a(dwy::new);

   public dwy(duz.c $$0) {
      super($$0);
   }

   @Override
   public Optional<duz.b> a(duz.a $$0) {
      cot $$1 = $$0.h();
      gu $$2 = new gu($$1.d(), 64, $$1.e());
      return Optional.of(new duz.b($$2, (Consumer<dvr>)($$1x -> a($$1x, $$0))));
   }

   private static void a(dvr $$0, duz.a $$1) {
      dwx.q $$2 = new dwx.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<dvd> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         dvd $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public dvi<?> e() {
      return dvi.d;
   }
}
