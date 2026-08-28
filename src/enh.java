import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class enh extends eko {
   public static final MapCodec<enh> d = a(enh::new);

   public enh(eko.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eko.b> a(eko.a $$0) {
      return Optional.of(new eko.b($$0.h().l(), (Consumer<elg>)($$1 -> a($$1, $$0))));
   }

   private static void a(elg $$0, eko.a $$1) {
      int $$2 = 0;

      eng.m $$3;
      do {
         $$0.b();
         $$1.f().c($$1.g() + (long)($$2++), $$1.h().e, $$1.h().f);
         eng.a();
         $$3 = new eng.m($$1.f(), $$1.h().a(2), $$1.h().b(2));
         $$0.a($$3);
         $$3.a($$3, $$0, $$1.f());
         List<eks> $$4 = $$3.c;

         while (!$$4.isEmpty()) {
            int $$5 = $$1.f().a($$4.size());
            eks $$6 = $$4.remove($$5);
            $$6.a($$3, $$0, $$1.f());
         }

         $$0.a($$1.b().f(), $$1.b().g(), $$1.f(), 10);
      } while ($$0.c() || $$3.b == null);
   }

   @Override
   public ekx<?> e() {
      return ekx.n;
   }
}
