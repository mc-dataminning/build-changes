import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dxc extends dvd {
   public static final bfh<cra.c> d = bfh.a(
      new cra.c(bip.i, 10, 2, 3), new cra.c(bip.bs, 5, 4, 4), new cra.c(bip.bl, 8, 5, 5), new cra.c(bip.aJ, 2, 5, 5), new cra.c(bip.al, 3, 4, 4)
   );
   public static final Codec<dxc> e = a(dxc::new);

   public dxc(dvd.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dvd.b> a(dvd.a $$0) {
      cox $$1 = $$0.h();
      gw $$2 = new gw($$1.d(), 64, $$1.e());
      return Optional.of(new dvd.b($$2, (Consumer<dvv>)($$1x -> a($$1x, $$0))));
   }

   private static void a(dvv $$0, dvd.a $$1) {
      dxb.q $$2 = new dxb.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<dvh> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         dvh $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public dvm<?> e() {
      return dvm.d;
   }
}
