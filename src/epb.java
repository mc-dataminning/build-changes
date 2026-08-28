import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class epb extends emi {
   public static final MapCodec<epb> d = a(epb::new);

   public epb(emi.c $$0) {
      super($$0);
   }

   @Override
   public Optional<emi.b> a(emi.a $$0) {
      return Optional.of(new emi.b($$0.h().l(), (Consumer<ena>)($$1 -> a($$1, $$0))));
   }

   private static void a(ena $$0, emi.a $$1) {
      int $$2 = 0;

      epa.m $$3;
      do {
         $$0.b();
         $$1.f().c($$1.g() + (long)($$2++), $$1.h().g, $$1.h().h);
         epa.a();
         $$3 = new epa.m($$1.f(), $$1.h().a(2), $$1.h().b(2));
         $$0.a($$3);
         $$3.a($$3, $$0, $$1.f());
         List<emm> $$4 = $$3.c;

         while (!$$4.isEmpty()) {
            int $$5 = $$1.f().a($$4.size());
            emm $$6 = $$4.remove($$5);
            $$6.a($$3, $$0, $$1.f());
         }

         $$0.a($$1.b().f(), $$1.b().g(), $$1.f(), 10);
      } while ($$0.c() || $$3.b == null);
   }

   @Override
   public emr<?> e() {
      return emr.n;
   }
}
