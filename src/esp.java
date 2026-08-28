import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class esp extends eqi {
   public static final bsj<dke.c> d = bsj.<dke.c>b()
      .a(new dke.c(bwj.o, 2, 3), 10)
      .a(new dke.c(bwj.bR, 4, 4), 5)
      .a(new dke.c(bwj.bK, 5, 5), 8)
      .a(new dke.c(bwj.bf, 5, 5), 2)
      .a(new dke.c(bwj.az, 4, 4), 3)
      .a();
   public static final MapCodec<esp> e = a(esp::new);

   public esp(eqi.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eqi.b> a(eqi.a $$0) {
      dhw $$1 = $$0.h();
      iu $$2 = new iu($$1.d(), 64, $$1.e());
      return Optional.of(new eqi.b($$2, (Consumer<era>)($$1x -> a($$1x, $$0))));
   }

   private static void a(era $$0, eqi.a $$1) {
      eso.q $$2 = new eso.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<eqm> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         eqm $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public eqr<?> e() {
      return eqr.d;
   }
}
