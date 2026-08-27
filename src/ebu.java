import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ebu extends dzo {
   public static final biq<cvi.c> d = biq.a(
      new cvi.c(bmc.j, 10, 2, 3), new cvi.c(bmc.bv, 5, 4, 4), new cvi.c(bmc.bo, 8, 5, 5), new cvi.c(bmc.aL, 2, 5, 5), new cvi.c(bmc.an, 3, 4, 4)
   );
   public static final Codec<ebu> e = a(ebu::new);

   public ebu(dzo.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dzo.b> a(dzo.a $$0) {
      cte $$1 = $$0.h();
      hx $$2 = new hx($$1.d(), 64, $$1.e());
      return Optional.of(new dzo.b($$2, (Consumer<eag>)($$1x -> a($$1x, $$0))));
   }

   private static void a(eag $$0, dzo.a $$1) {
      ebt.q $$2 = new ebt.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<dzs> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         dzs $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public dzx<?> e() {
      return dzx.d;
   }
}
