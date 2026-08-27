import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dxo extends dvd {
   public static final Codec<dxo> d = a(dxo::new);

   public dxo(dvd.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dvd.b> a(dvd.a $$0) {
      return Optional.of(new dvd.b($$0.h().l(), (Consumer<dvv>)($$1 -> a($$1, $$0))));
   }

   private static void a(dvv $$0, dvd.a $$1) {
      int $$2 = 0;

      dxn.m $$3;
      do {
         $$0.b();
         $$1.f().c($$1.g() + (long)($$2++), $$1.h().e, $$1.h().f);
         dxn.a();
         $$3 = new dxn.m($$1.f(), $$1.h().a(2), $$1.h().b(2));
         $$0.a($$3);
         $$3.a($$3, $$0, $$1.f());
         List<dvh> $$4 = $$3.c;

         while (!$$4.isEmpty()) {
            int $$5 = $$1.f().a($$4.size());
            dvh $$6 = $$4.remove($$5);
            $$6.a($$3, $$0, $$1.f());
         }

         $$0.a($$1.b().e(), $$1.b().f(), $$1.f(), 10);
      } while ($$0.c() || $$3.b == null);
   }

   @Override
   public dvm<?> e() {
      return dvm.n;
   }
}
