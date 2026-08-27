import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ekd extends ehl {
   public static final MapCodec<ekd> d = a(ekd::new);

   public ekd(ehl.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ehl.b> a(ehl.a $$0) {
      return Optional.of(new ehl.b($$0.h().l(), (Consumer<eid>)($$1 -> a($$1, $$0))));
   }

   private static void a(eid $$0, ehl.a $$1) {
      int $$2 = 0;

      ekc.m $$3;
      do {
         $$0.b();
         $$1.f().c($$1.g() + (long)($$2++), $$1.h().e, $$1.h().f);
         ekc.a();
         $$3 = new ekc.m($$1.f(), $$1.h().a(2), $$1.h().b(2));
         $$0.a($$3);
         $$3.a($$3, $$0, $$1.f());
         List<ehp> $$4 = $$3.c;

         while (!$$4.isEmpty()) {
            int $$5 = $$1.f().a($$4.size());
            ehp $$6 = $$4.remove($$5);
            $$6.a($$3, $$0, $$1.f());
         }

         $$0.a($$1.b().e(), $$1.b().f(), $$1.f(), 10);
      } while ($$0.c() || $$3.b == null);
   }

   @Override
   public ehu<?> e() {
      return ehu.n;
   }
}
