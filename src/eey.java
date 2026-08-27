import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eey extends ecg {
   public static final Codec<eey> d = a(eey::new);

   public eey(ecg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ecg.b> a(ecg.a $$0) {
      return Optional.of(new ecg.b($$0.h().l(), (Consumer<ecy>)($$1 -> a($$1, $$0))));
   }

   private static void a(ecy $$0, ecg.a $$1) {
      int $$2 = 0;

      eex.m $$3;
      do {
         $$0.b();
         $$1.f().c($$1.g() + (long)($$2++), $$1.h().e, $$1.h().f);
         eex.a();
         $$3 = new eex.m($$1.f(), $$1.h().a(2), $$1.h().b(2));
         $$0.a($$3);
         $$3.a($$3, $$0, $$1.f());
         List<eck> $$4 = $$3.c;

         while (!$$4.isEmpty()) {
            int $$5 = $$1.f().a($$4.size());
            eck $$6 = $$4.remove($$5);
            $$6.a($$3, $$0, $$1.f());
         }

         $$0.a($$1.b().e(), $$1.b().f(), $$1.f(), 10);
      } while ($$0.c() || $$3.b == null);
   }

   @Override
   public ecp<?> e() {
      return ecp.n;
   }
}
