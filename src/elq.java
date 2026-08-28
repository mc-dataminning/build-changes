import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class elq extends eix {
   public static final MapCodec<elq> d = a(elq::new);

   public elq(eix.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eix.b> a(eix.a $$0) {
      return Optional.of(new eix.b($$0.h().l(), (Consumer<ejp>)($$1 -> a($$1, $$0))));
   }

   private static void a(ejp $$0, eix.a $$1) {
      int $$2 = 0;

      elp.m $$3;
      do {
         $$0.b();
         $$1.f().c($$1.g() + (long)($$2++), $$1.h().e, $$1.h().f);
         elp.a();
         $$3 = new elp.m($$1.f(), $$1.h().a(2), $$1.h().b(2));
         $$0.a($$3);
         $$3.a($$3, $$0, $$1.f());
         List<ejb> $$4 = $$3.c;

         while (!$$4.isEmpty()) {
            int $$5 = $$1.f().a($$4.size());
            ejb $$6 = $$4.remove($$5);
            $$6.a($$3, $$0, $$1.f());
         }

         $$0.a($$1.b().f(), $$1.b().g(), $$1.f(), 10);
      } while ($$0.c() || $$3.b == null);
   }

   @Override
   public ejg<?> e() {
      return ejg.n;
   }
}
