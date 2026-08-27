import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ebx extends dzf {
   public static final Codec<ebx> d = a(ebx::new);

   public ebx(dzf.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dzf.b> a(dzf.a $$0) {
      return Optional.of(new dzf.b($$0.h().l(), (Consumer<dzx>)($$1 -> a($$1, $$0))));
   }

   private static void a(dzx $$0, dzf.a $$1) {
      int $$2 = 0;

      ebw.m $$3;
      do {
         $$0.b();
         $$1.f().c($$1.g() + (long)($$2++), $$1.h().e, $$1.h().f);
         ebw.a();
         $$3 = new ebw.m($$1.f(), $$1.h().a(2), $$1.h().b(2));
         $$0.a($$3);
         $$3.a($$3, $$0, $$1.f());
         List<dzj> $$4 = $$3.c;

         while (!$$4.isEmpty()) {
            int $$5 = $$1.f().a($$4.size());
            dzj $$6 = $$4.remove($$5);
            $$6.a($$3, $$0, $$1.f());
         }

         $$0.a($$1.b().e(), $$1.b().f(), $$1.f(), 10);
      } while ($$0.c() || $$3.b == null);
   }

   @Override
   public dzo<?> e() {
      return dzo.n;
   }
}
