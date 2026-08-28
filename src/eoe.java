import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eoe extends elx {
   public static final bqp<dgo.c> d = bqp.a(
      new dgo.c(bul.i, 10, 2, 3), new dgo.c(bul.bx, 5, 4, 4), new dgo.c(bul.bq, 8, 5, 5), new dgo.c(bul.aN, 2, 5, 5), new dgo.c(bul.ap, 3, 4, 4)
   );
   public static final MapCodec<eoe> e = a(eoe::new);

   public eoe(elx.c $$0) {
      super($$0);
   }

   @Override
   public Optional<elx.b> a(elx.a $$0) {
      deh $$1 = $$0.h();
      jh $$2 = new jh($$1.d(), 64, $$1.e());
      return Optional.of(new elx.b($$2, (Consumer<emp>)($$1x -> a($$1x, $$0))));
   }

   private static void a(emp $$0, elx.a $$1) {
      eod.q $$2 = new eod.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<emb> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         emb $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public emg<?> e() {
      return emg.d;
   }
}
