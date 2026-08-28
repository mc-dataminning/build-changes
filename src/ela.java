import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ela extends eii {
   public static final MapCodec<ela> d = a(ela::new);

   public ela(eii.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eii.b> a(eii.a $$0) {
      return Optional.of(new eii.b($$0.h().l(), (Consumer<eja>)($$1 -> a($$1, $$0))));
   }

   private static void a(eja $$0, eii.a $$1) {
      int $$2 = 0;

      ekz.m $$3;
      do {
         $$0.b();
         $$1.f().c($$1.g() + (long)($$2++), $$1.h().e, $$1.h().f);
         ekz.a();
         $$3 = new ekz.m($$1.f(), $$1.h().a(2), $$1.h().b(2));
         $$0.a($$3);
         $$3.a($$3, $$0, $$1.f());
         List<eim> $$4 = $$3.c;

         while (!$$4.isEmpty()) {
            int $$5 = $$1.f().a($$4.size());
            eim $$6 = $$4.remove($$5);
            $$6.a($$3, $$0, $$1.f());
         }

         $$0.a($$1.b().f(), $$1.b().g(), $$1.f(), 10);
      } while ($$0.c() || $$3.b == null);
   }

   @Override
   public eir<?> e() {
      return eir.n;
   }
}
