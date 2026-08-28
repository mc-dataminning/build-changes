import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class erz extends epg {
   public static final MapCodec<erz> d = a(erz::new);

   public erz(epg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<epg.b> a(epg.a $$0) {
      return Optional.of(new epg.b($$0.h().l(), (Consumer<epy>)($$1 -> a($$1, $$0))));
   }

   private static void a(epy $$0, epg.a $$1) {
      int $$2 = 0;

      ery.m $$3;
      do {
         $$0.b();
         $$1.f().c($$1.g() + (long)($$2++), $$1.h().h, $$1.h().i);
         ery.a();
         $$3 = new ery.m($$1.f(), $$1.h().a(2), $$1.h().b(2));
         $$0.a($$3);
         $$3.a($$3, $$0, $$1.f());
         List<epk> $$4 = $$3.c;

         while (!$$4.isEmpty()) {
            int $$5 = $$1.f().a($$4.size());
            epk $$6 = $$4.remove($$5);
            $$6.a($$3, $$0, $$1.f());
         }

         $$0.a($$1.b().f(), $$1.b().g(), $$1.f(), 10);
      } while ($$0.c() || $$3.b == null);
   }

   @Override
   public epp<?> e() {
      return epp.n;
   }
}
