import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class erd extends eok {
   public static final MapCodec<erd> d = a(erd::new);

   public erd(eok.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eok.b> a(eok.a $$0) {
      return Optional.of(new eok.b($$0.h().l(), (Consumer<epc>)($$1 -> a($$1, $$0))));
   }

   private static void a(epc $$0, eok.a $$1) {
      int $$2 = 0;

      erc.m $$3;
      do {
         $$0.b();
         $$1.f().c($$1.g() + (long)($$2++), $$1.h().h, $$1.h().i);
         erc.a();
         $$3 = new erc.m($$1.f(), $$1.h().a(2), $$1.h().b(2));
         $$0.a($$3);
         $$3.a($$3, $$0, $$1.f());
         List<eoo> $$4 = $$3.c;

         while (!$$4.isEmpty()) {
            int $$5 = $$1.f().a($$4.size());
            eoo $$6 = $$4.remove($$5);
            $$6.a($$3, $$0, $$1.f());
         }

         $$0.a($$1.b().f(), $$1.b().g(), $$1.f(), 10);
      } while ($$0.c() || $$3.b == null);
   }

   @Override
   public eot<?> e() {
      return eot.n;
   }
}
