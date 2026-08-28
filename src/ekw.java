import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ekw extends eiq {
   public static final bor<ddp.c> d = bor.a(
      new ddp.c(bsj.i, 10, 2, 3), new ddp.c(bsj.bx, 5, 4, 4), new ddp.c(bsj.bq, 8, 5, 5), new ddp.c(bsj.aN, 2, 5, 5), new ddp.c(bsj.ap, 3, 4, 4)
   );
   public static final MapCodec<ekw> e = a(ekw::new);

   public ekw(eiq.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eiq.b> a(eiq.a $$0) {
      dbk $$1 = $$0.h();
      ja $$2 = new ja($$1.d(), 64, $$1.e());
      return Optional.of(new eiq.b($$2, (Consumer<eji>)($$1x -> a($$1x, $$0))));
   }

   private static void a(eji $$0, eiq.a $$1) {
      ekv.q $$2 = new ekv.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<eiu> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         eiu $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public eiz<?> e() {
      return eiz.d;
   }
}
