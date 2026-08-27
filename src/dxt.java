import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dxt extends dvi {
   public static final Codec<dxt> d = a(dxt::new);

   public dxt(dvi.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dvi.b> a(dvi.a $$0) {
      return Optional.of(new dvi.b($$0.h().l(), (Consumer<dwa>)($$1 -> a($$1, $$0))));
   }

   private static void a(dwa $$0, dvi.a $$1) {
      int $$2 = 0;

      dxs.m $$3;
      do {
         $$0.b();
         $$1.f().c($$1.g() + (long)($$2++), $$1.h().e, $$1.h().f);
         dxs.a();
         $$3 = new dxs.m($$1.f(), $$1.h().a(2), $$1.h().b(2));
         $$0.a($$3);
         $$3.a($$3, $$0, $$1.f());
         List<dvm> $$4 = $$3.c;

         while (!$$4.isEmpty()) {
            int $$5 = $$1.f().a($$4.size());
            dvm $$6 = $$4.remove($$5);
            $$6.a($$3, $$0, $$1.f());
         }

         $$0.a($$1.b().e(), $$1.b().f(), $$1.f(), 10);
      } while ($$0.c() || $$3.b == null);
   }

   @Override
   public dvr<?> e() {
      return dvr.n;
   }
}
