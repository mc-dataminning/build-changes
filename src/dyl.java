import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dyl extends dwa {
   public static final Codec<dyl> d = a(dyl::new);

   public dyl(dwa.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dwa.b> a(dwa.a $$0) {
      return Optional.of(new dwa.b($$0.h().l(), (Consumer<dws>)($$1 -> a($$1, $$0))));
   }

   private static void a(dws $$0, dwa.a $$1) {
      int $$2 = 0;

      dyk.m $$3;
      do {
         $$0.b();
         $$1.f().c($$1.g() + (long)($$2++), $$1.h().e, $$1.h().f);
         dyk.a();
         $$3 = new dyk.m($$1.f(), $$1.h().a(2), $$1.h().b(2));
         $$0.a($$3);
         $$3.a($$3, $$0, $$1.f());
         List<dwe> $$4 = $$3.c;

         while (!$$4.isEmpty()) {
            int $$5 = $$1.f().a($$4.size());
            dwe $$6 = $$4.remove($$5);
            $$6.a($$3, $$0, $$1.f());
         }

         $$0.a($$1.b().e(), $$1.b().f(), $$1.f(), 10);
      } while ($$0.c() || $$3.b == null);
   }

   @Override
   public dwj<?> e() {
      return dwj.n;
   }
}
