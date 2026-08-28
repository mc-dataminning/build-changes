import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eld extends eil {
   public static final MapCodec<eld> d = a(eld::new);

   public eld(eil.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eil.b> a(eil.a $$0) {
      return Optional.of(new eil.b($$0.h().l(), (Consumer<ejd>)($$1 -> a($$1, $$0))));
   }

   private static void a(ejd $$0, eil.a $$1) {
      int $$2 = 0;

      elc.m $$3;
      do {
         $$0.b();
         $$1.f().c($$1.g() + (long)($$2++), $$1.h().e, $$1.h().f);
         elc.a();
         $$3 = new elc.m($$1.f(), $$1.h().a(2), $$1.h().b(2));
         $$0.a($$3);
         $$3.a($$3, $$0, $$1.f());
         List<eip> $$4 = $$3.c;

         while (!$$4.isEmpty()) {
            int $$5 = $$1.f().a($$4.size());
            eip $$6 = $$4.remove($$5);
            $$6.a($$3, $$0, $$1.f());
         }

         $$0.a($$1.b().f(), $$1.b().g(), $$1.f(), 10);
      } while ($$0.c() || $$3.b == null);
   }

   @Override
   public eiu<?> e() {
      return eiu.n;
   }
}
