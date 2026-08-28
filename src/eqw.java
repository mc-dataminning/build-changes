import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eqw extends eod {
   public static final MapCodec<eqw> d = a(eqw::new);

   public eqw(eod.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eod.b> a(eod.a $$0) {
      return Optional.of(new eod.b($$0.h().l(), (Consumer<eov>)($$1 -> a($$1, $$0))));
   }

   private static void a(eov $$0, eod.a $$1) {
      int $$2 = 0;

      eqv.m $$3;
      do {
         $$0.b();
         $$1.f().c($$1.g() + (long)($$2++), $$1.h().h, $$1.h().i);
         eqv.a();
         $$3 = new eqv.m($$1.f(), $$1.h().a(2), $$1.h().b(2));
         $$0.a($$3);
         $$3.a($$3, $$0, $$1.f());
         List<eoh> $$4 = $$3.c;

         while (!$$4.isEmpty()) {
            int $$5 = $$1.f().a($$4.size());
            eoh $$6 = $$4.remove($$5);
            $$6.a($$3, $$0, $$1.f());
         }

         $$0.a($$1.b().f(), $$1.b().g(), $$1.f(), 10);
      } while ($$0.c() || $$3.b == null);
   }

   @Override
   public eom<?> e() {
      return eom.n;
   }
}
