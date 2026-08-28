import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class euk extends esd {
   public static final btd<dlo.c> d = btd.<dlo.c>b()
      .a(new dlo.c(bxe.p, 2, 3), 10)
      .a(new dlo.c(bxe.bS, 4, 4), 5)
      .a(new dlo.c(bxe.bL, 5, 5), 8)
      .a(new dlo.c(bxe.bg, 5, 5), 2)
      .a(new dlo.c(bxe.aA, 4, 4), 3)
      .a();
   public static final MapCodec<euk> e = a(euk::new);

   public euk(esd.c $$0) {
      super($$0);
   }

   @Override
   public Optional<esd.b> a(esd.a $$0) {
      dje $$1 = $$0.h();
      iw $$2 = new iw($$1.d(), 64, $$1.e());
      return Optional.of(new esd.b($$2, (Consumer<esv>)($$1x -> a($$1x, $$0))));
   }

   private static void a(esv $$0, esd.a $$1) {
      euj.q $$2 = new euj.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<esh> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         esh $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public esm<?> e() {
      return esm.d;
   }
}
