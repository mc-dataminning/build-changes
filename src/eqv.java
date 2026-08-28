import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eqv extends eoc {
   public static final MapCodec<eqv> d = a(eqv::new);

   public eqv(eoc.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eoc.b> a(eoc.a $$0) {
      return Optional.of(new eoc.b($$0.h().l(), (Consumer<eou>)($$1 -> a($$1, $$0))));
   }

   private static void a(eou $$0, eoc.a $$1) {
      int $$2 = 0;

      equ.m $$3;
      do {
         $$0.b();
         $$1.f().c($$1.g() + (long)($$2++), $$1.h().g, $$1.h().h);
         equ.a();
         $$3 = new equ.m($$1.f(), $$1.h().a(2), $$1.h().b(2));
         $$0.a($$3);
         $$3.a($$3, $$0, $$1.f());
         List<eog> $$4 = $$3.c;

         while (!$$4.isEmpty()) {
            int $$5 = $$1.f().a($$4.size());
            eog $$6 = $$4.remove($$5);
            $$6.a($$3, $$0, $$1.f());
         }

         $$0.a($$1.b().f(), $$1.b().g(), $$1.f(), 10);
      } while ($$0.c() || $$3.b == null);
   }

   @Override
   public eol<?> e() {
      return eol.n;
   }
}
