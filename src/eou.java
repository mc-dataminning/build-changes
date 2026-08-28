import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eou extends emb {
   public static final MapCodec<eou> d = a(eou::new);

   public eou(emb.c $$0) {
      super($$0);
   }

   @Override
   public Optional<emb.b> a(emb.a $$0) {
      return Optional.of(new emb.b($$0.h().l(), (Consumer<emt>)($$1 -> a($$1, $$0))));
   }

   private static void a(emt $$0, emb.a $$1) {
      int $$2 = 0;

      eot.m $$3;
      do {
         $$0.b();
         $$1.f().c($$1.g() + (long)($$2++), $$1.h().g, $$1.h().h);
         eot.a();
         $$3 = new eot.m($$1.f(), $$1.h().a(2), $$1.h().b(2));
         $$0.a($$3);
         $$3.a($$3, $$0, $$1.f());
         List<emf> $$4 = $$3.c;

         while (!$$4.isEmpty()) {
            int $$5 = $$1.f().a($$4.size());
            emf $$6 = $$4.remove($$5);
            $$6.a($$3, $$0, $$1.f());
         }

         $$0.a($$1.b().f(), $$1.b().g(), $$1.f(), 10);
      } while ($$0.c() || $$3.b == null);
   }

   @Override
   public emk<?> e() {
      return emk.n;
   }
}
