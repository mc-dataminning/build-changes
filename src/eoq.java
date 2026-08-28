import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eoq extends elx {
   public static final MapCodec<eoq> d = a(eoq::new);

   public eoq(elx.c $$0) {
      super($$0);
   }

   @Override
   public Optional<elx.b> a(elx.a $$0) {
      return Optional.of(new elx.b($$0.h().l(), (Consumer<emp>)($$1 -> a($$1, $$0))));
   }

   private static void a(emp $$0, elx.a $$1) {
      int $$2 = 0;

      eop.m $$3;
      do {
         $$0.b();
         $$1.f().c($$1.g() + (long)($$2++), $$1.h().g, $$1.h().h);
         eop.a();
         $$3 = new eop.m($$1.f(), $$1.h().a(2), $$1.h().b(2));
         $$0.a($$3);
         $$3.a($$3, $$0, $$1.f());
         List<emb> $$4 = $$3.c;

         while (!$$4.isEmpty()) {
            int $$5 = $$1.f().a($$4.size());
            emb $$6 = $$4.remove($$5);
            $$6.a($$3, $$0, $$1.f());
         }

         $$0.a($$1.b().f(), $$1.b().g(), $$1.f(), 10);
      } while ($$0.c() || $$3.b == null);
   }

   @Override
   public emg<?> e() {
      return emg.n;
   }
}
