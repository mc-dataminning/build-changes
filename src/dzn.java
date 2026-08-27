import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dzn extends dwv {
   public static final Codec<dzn> d = a(dzn::new);

   public dzn(dwv.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dwv.b> a(dwv.a $$0) {
      return Optional.of(new dwv.b($$0.h().l(), (Consumer<dxn>)($$1 -> a($$1, $$0))));
   }

   private static void a(dxn $$0, dwv.a $$1) {
      int $$2 = 0;

      dzm.m $$3;
      do {
         $$0.b();
         $$1.f().c($$1.g() + (long)($$2++), $$1.h().e, $$1.h().f);
         dzm.a();
         $$3 = new dzm.m($$1.f(), $$1.h().a(2), $$1.h().b(2));
         $$0.a($$3);
         $$3.a($$3, $$0, $$1.f());
         List<dwz> $$4 = $$3.c;

         while (!$$4.isEmpty()) {
            int $$5 = $$1.f().a($$4.size());
            dwz $$6 = $$4.remove($$5);
            $$6.a($$3, $$0, $$1.f());
         }

         $$0.a($$1.b().e(), $$1.b().f(), $$1.f(), 10);
      } while ($$0.c() || $$3.b == null);
   }

   @Override
   public dxe<?> e() {
      return dxe.n;
   }
}
