import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dxz extends dwa {
   public static final bgp<csj.c> d = bgp.a(
      new csj.c(bjx.i, 10, 2, 3), new csj.c(bjx.bs, 5, 4, 4), new csj.c(bjx.bl, 8, 5, 5), new csj.c(bjx.aJ, 2, 5, 5), new csj.c(bjx.al, 3, 4, 4)
   );
   public static final Codec<dxz> e = a(dxz::new);

   public dxz(dwa.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dwa.b> a(dwa.a $$0) {
      cqg $$1 = $$0.h();
      ht $$2 = new ht($$1.d(), 64, $$1.e());
      return Optional.of(new dwa.b($$2, (Consumer<dws>)($$1x -> a($$1x, $$0))));
   }

   private static void a(dws $$0, dwa.a $$1) {
      dxy.q $$2 = new dxy.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<dwe> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         dwe $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public dwj<?> e() {
      return dwj.d;
   }
}
