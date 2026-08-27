import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dul extends dsa {
   public static final Codec<dul> d = a(dul::new);

   public dul(dsa.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dsa.b> a(dsa.a $$0) {
      return Optional.of(new dsa.b($$0.h().l(), (Consumer<dss>)($$1 -> a($$1, $$0))));
   }

   private static void a(dss $$0, dsa.a $$1) {
      int $$2 = 0;

      duk.m $$3;
      do {
         $$0.b();
         $$1.f().c($$1.g() + (long)($$2++), $$1.h().e, $$1.h().f);
         duk.a();
         $$3 = new duk.m($$1.f(), $$1.h().a(2), $$1.h().b(2));
         $$0.a($$3);
         $$3.a($$3, $$0, $$1.f());
         List<dse> $$4 = $$3.c;

         while (!$$4.isEmpty()) {
            int $$5 = $$1.f().a($$4.size());
            dse $$6 = $$4.remove($$5);
            $$6.a($$3, $$0, $$1.f());
         }

         $$0.a($$1.b().e(), $$1.b().f(), $$1.f(), 10);
      } while ($$0.c() || $$3.b == null);
   }

   @Override
   public dsj<?> e() {
      return dsj.n;
   }
}
