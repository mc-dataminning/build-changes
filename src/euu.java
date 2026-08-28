import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class euu extends esb {
   public static final MapCodec<euu> d = a(euu::new);

   public euu(esb.c $$0) {
      super($$0);
   }

   @Override
   public Optional<esb.b> a(esb.a $$0) {
      return Optional.of(new esb.b($$0.h().l(), (Consumer<est>)($$1 -> a($$1, $$0))));
   }

   private static void a(est $$0, esb.a $$1) {
      int $$2 = 0;

      eut.m $$3;
      do {
         $$0.b();
         $$1.f().c($$1.g() + (long)($$2++), $$1.h().h, $$1.h().i);
         eut.a();
         $$3 = new eut.m($$1.f(), $$1.h().a(2), $$1.h().b(2));
         $$0.a($$3);
         $$3.a($$3, $$0, $$1.f());
         List<esf> $$4 = $$3.c;

         while (!$$4.isEmpty()) {
            int $$5 = $$1.f().a($$4.size());
            esf $$6 = $$4.remove($$5);
            $$6.a($$3, $$0, $$1.f());
         }

         $$0.a($$1.b().f(), $$1.b().g(), $$1.f(), 10);
      } while ($$0.c() || $$3.b == null);
   }

   @Override
   public esk<?> e() {
      return esk.n;
   }
}
