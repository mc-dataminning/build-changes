import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eok extends elr {
   public static final MapCodec<eok> d = a(eok::new);

   public eok(elr.c $$0) {
      super($$0);
   }

   @Override
   public Optional<elr.b> a(elr.a $$0) {
      return Optional.of(new elr.b($$0.h().l(), (Consumer<emj>)($$1 -> a($$1, $$0))));
   }

   private static void a(emj $$0, elr.a $$1) {
      int $$2 = 0;

      eoj.m $$3;
      do {
         $$0.b();
         $$1.f().c($$1.g() + (long)($$2++), $$1.h().e, $$1.h().f);
         eoj.a();
         $$3 = new eoj.m($$1.f(), $$1.h().a(2), $$1.h().b(2));
         $$0.a($$3);
         $$3.a($$3, $$0, $$1.f());
         List<elv> $$4 = $$3.c;

         while (!$$4.isEmpty()) {
            int $$5 = $$1.f().a($$4.size());
            elv $$6 = $$4.remove($$5);
            $$6.a($$3, $$0, $$1.f());
         }

         $$0.a($$1.b().f(), $$1.b().g(), $$1.f(), 10);
      } while ($$0.c() || $$3.b == null);
   }

   @Override
   public ema<?> e() {
      return ema.n;
   }
}
