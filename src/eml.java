import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eml extends ejt {
   public static final Codec<eml> d = a(eml::new);

   public eml(ejt.d $$0) {
      super($$0);
   }

   @Override
   public Optional<ejt.c> a(ejt.b $$0) {
      return Optional.of(new ejt.c($$0.h().l(), (Consumer<ekl>)($$1 -> a($$1, $$0))));
   }

   private static void a(ekl $$0, ejt.b $$1) {
      int $$2 = 0;

      emk.m $$3;
      do {
         $$0.b();
         $$1.f().c($$1.g() + (long)($$2++), $$1.h().e, $$1.h().f);
         emk.a();
         $$3 = new emk.m($$1.f(), $$1.h().a(2), $$1.h().b(2));
         $$0.a($$3);
         $$3.a($$3, $$0, $$1.f());
         List<ejx> $$4 = $$3.c;

         while (!$$4.isEmpty()) {
            int $$5 = $$1.f().a($$4.size());
            ejx $$6 = $$4.remove($$5);
            $$6.a($$3, $$0, $$1.f());
         }

         $$0.a($$1.b().e(), $$1.b().f(), $$1.f(), 10);
      } while ($$0.c() || $$3.b == null);
   }

   @Override
   public ekc<?> f() {
      return ekc.n;
   }
}
