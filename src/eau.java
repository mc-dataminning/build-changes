import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eau extends dyo {
   public static final bhz<cuj.c> d = bhz.a(
      new cuj.c(blj.i, 10, 2, 3), new cuj.c(blj.bu, 5, 4, 4), new cuj.c(blj.bn, 8, 5, 5), new cuj.c(blj.aK, 2, 5, 5), new cuj.c(blj.am, 3, 4, 4)
   );
   public static final Codec<eau> e = a(eau::new);

   public eau(dyo.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dyo.b> a(dyo.a $$0) {
      csf $$1 = $$0.h();
      hv $$2 = new hv($$1.d(), 64, $$1.e());
      return Optional.of(new dyo.b($$2, (Consumer<dzg>)($$1x -> a($$1x, $$0))));
   }

   private static void a(dzg $$0, dyo.a $$1) {
      eat.q $$2 = new eat.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<dys> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         dys $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public dyx<?> e() {
      return dyx.d;
   }
}
