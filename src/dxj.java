import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dxj extends dvk {
   public static final bfo<crh.c> d = bfo.a(
      new crh.c(biw.i, 10, 2, 3), new crh.c(biw.bs, 5, 4, 4), new crh.c(biw.bl, 8, 5, 5), new crh.c(biw.aJ, 2, 5, 5), new crh.c(biw.al, 3, 4, 4)
   );
   public static final Codec<dxj> e = a(dxj::new);

   public dxj(dvk.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dvk.b> a(dvk.a $$0) {
      cpe $$1 = $$0.h();
      gw $$2 = new gw($$1.d(), 64, $$1.e());
      return Optional.of(new dvk.b($$2, (Consumer<dwc>)($$1x -> a($$1x, $$0))));
   }

   private static void a(dwc $$0, dvk.a $$1) {
      dxi.q $$2 = new dxi.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<dvo> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         dvo $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public dvt<?> e() {
      return dvt.d;
   }
}
