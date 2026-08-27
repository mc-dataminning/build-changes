import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dxb extends dvc {
   public static final bfs<crl.c> d = bfs.a(
      new crl.c(bja.i, 10, 2, 3), new crl.c(bja.bs, 5, 4, 4), new crl.c(bja.bl, 8, 5, 5), new crl.c(bja.aJ, 2, 5, 5), new crl.c(bja.al, 3, 4, 4)
   );
   public static final Codec<dxb> e = a(dxb::new);

   public dxb(dvc.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dvc.b> a(dvc.a $$0) {
      cpi $$1 = $$0.h();
      gw $$2 = new gw($$1.d(), 64, $$1.e());
      return Optional.of(new dvc.b($$2, (Consumer<dvu>)($$1x -> a($$1x, $$0))));
   }

   private static void a(dvu $$0, dvc.a $$1) {
      dxa.q $$2 = new dxa.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<dvg> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         dvg $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public dvl<?> e() {
      return dvl.d;
   }
}
