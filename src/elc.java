import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class elc extends eiw {
   public static final bou<ddr.c> d = bou.a(
      new ddr.c(bsm.i, 10, 2, 3), new ddr.c(bsm.bx, 5, 4, 4), new ddr.c(bsm.bq, 8, 5, 5), new ddr.c(bsm.aN, 2, 5, 5), new ddr.c(bsm.ap, 3, 4, 4)
   );
   public static final MapCodec<elc> e = a(elc::new);

   public elc(eiw.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eiw.b> a(eiw.a $$0) {
      dbm $$1 = $$0.h();
      ja $$2 = new ja($$1.d(), 64, $$1.e());
      return Optional.of(new eiw.b($$2, (Consumer<ejo>)($$1x -> a($$1x, $$0))));
   }

   private static void a(ejo $$0, eiw.a $$1) {
      elb.q $$2 = new elb.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<eja> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         eja $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public ejf<?> e() {
      return ejf.d;
   }
}
