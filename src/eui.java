import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eui extends esb {
   public static final btb<dlm.c> d = btb.<dlm.c>b()
      .a(new dlm.c(bxc.p, 2, 3), 10)
      .a(new dlm.c(bxc.bS, 4, 4), 5)
      .a(new dlm.c(bxc.bL, 5, 5), 8)
      .a(new dlm.c(bxc.bg, 5, 5), 2)
      .a(new dlm.c(bxc.aA, 4, 4), 3)
      .a();
   public static final MapCodec<eui> e = a(eui::new);

   public eui(esb.c $$0) {
      super($$0);
   }

   @Override
   public Optional<esb.b> a(esb.a $$0) {
      djc $$1 = $$0.h();
      iv $$2 = new iv($$1.d(), 64, $$1.e());
      return Optional.of(new esb.b($$2, (Consumer<est>)($$1x -> a($$1x, $$0))));
   }

   private static void a(est $$0, esb.a $$1) {
      euh.q $$2 = new euh.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<esf> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         esf $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public esk<?> e() {
      return esk.d;
   }
}
