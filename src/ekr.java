import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ekr extends eil {
   public static final bpj<ddk.c> d = bpj.a(
      new ddk.c(btb.i, 10, 2, 3), new ddk.c(btb.bx, 5, 4, 4), new ddk.c(btb.bq, 8, 5, 5), new ddk.c(btb.aN, 2, 5, 5), new ddk.c(btb.ap, 3, 4, 4)
   );
   public static final MapCodec<ekr> e = a(ekr::new);

   public ekr(eil.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eil.b> a(eil.a $$0) {
      dbg $$1 = $$0.h();
      iz $$2 = new iz($$1.d(), 64, $$1.e());
      return Optional.of(new eil.b($$2, (Consumer<ejd>)($$1x -> a($$1x, $$0))));
   }

   private static void a(ejd $$0, eil.a $$1) {
      ekq.q $$2 = new ekq.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<eip> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         eip $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public eiu<?> e() {
      return eiu.d;
   }
}
