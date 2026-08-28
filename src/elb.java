import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class elb extends eij {
   public static final MapCodec<elb> d = a(elb::new);

   public elb(eij.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eij.b> a(eij.a $$0) {
      return Optional.of(new eij.b($$0.h().l(), (Consumer<ejb>)($$1 -> a($$1, $$0))));
   }

   private static void a(ejb $$0, eij.a $$1) {
      int $$2 = 0;

      ela.m $$3;
      do {
         $$0.b();
         $$1.f().c($$1.g() + (long)($$2++), $$1.h().e, $$1.h().f);
         ela.a();
         $$3 = new ela.m($$1.f(), $$1.h().a(2), $$1.h().b(2));
         $$0.a($$3);
         $$3.a($$3, $$0, $$1.f());
         List<ein> $$4 = $$3.c;

         while (!$$4.isEmpty()) {
            int $$5 = $$1.f().a($$4.size());
            ein $$6 = $$4.remove($$5);
            $$6.a($$3, $$0, $$1.f());
         }

         $$0.a($$1.b().f(), $$1.b().g(), $$1.f(), 10);
      } while ($$0.c() || $$3.b == null);
   }

   @Override
   public eis<?> e() {
      return eis.n;
   }
}
