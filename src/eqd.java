import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eqd extends enk {
   public static final MapCodec<eqd> d = a(eqd::new);

   public eqd(enk.c $$0) {
      super($$0);
   }

   @Override
   public Optional<enk.b> a(enk.a $$0) {
      return Optional.of(new enk.b($$0.h().l(), (Consumer<eoc>)($$1 -> a($$1, $$0))));
   }

   private static void a(eoc $$0, enk.a $$1) {
      int $$2 = 0;

      eqc.m $$3;
      do {
         $$0.b();
         $$1.f().c($$1.g() + (long)($$2++), $$1.h().h, $$1.h().i);
         eqc.a();
         $$3 = new eqc.m($$1.f(), $$1.h().a(2), $$1.h().b(2));
         $$0.a($$3);
         $$3.a($$3, $$0, $$1.f());
         List<eno> $$4 = $$3.c;

         while (!$$4.isEmpty()) {
            int $$5 = $$1.f().a($$4.size());
            eno $$6 = $$4.remove($$5);
            $$6.a($$3, $$0, $$1.f());
         }

         $$0.a($$1.b().f(), $$1.b().g(), $$1.f(), 10);
      } while ($$0.c() || $$3.b == null);
   }

   @Override
   public ent<?> e() {
      return ent.n;
   }
}
