import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class efk extends ede {
   public static final blr<cym.c> d = blr.a(
      new cym.c(bpd.j, 10, 2, 3), new cym.c(bpd.bx, 5, 4, 4), new cym.c(bpd.bq, 8, 5, 5), new cym.c(bpd.aN, 2, 5, 5), new cym.c(bpd.ap, 3, 4, 4)
   );
   public static final Codec<efk> e = a(efk::new);

   public efk(ede.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ede.b> a(ede.a $$0) {
      cwi $$1 = $$0.h();
      ib $$2 = new ib($$1.d(), 64, $$1.e());
      return Optional.of(new ede.b($$2, (Consumer<edw>)($$1x -> a($$1x, $$0))));
   }

   private static void a(edw $$0, ede.a $$1) {
      efj.q $$2 = new efj.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<edi> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         edi $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public edn<?> e() {
      return edn.d;
   }
}
