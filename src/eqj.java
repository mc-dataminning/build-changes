import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eqj extends eoc {
   public static final brq<dio.c> d = brq.a(
      new dio.c(bvm.o, 10, 2, 3), new dio.c(bvm.bR, 5, 4, 4), new dio.c(bvm.bK, 8, 5, 5), new dio.c(bvm.bf, 2, 5, 5), new dio.c(bvm.aA, 3, 4, 4)
   );
   public static final MapCodec<eqj> e = a(eqj::new);

   public eqj(eoc.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eoc.b> a(eoc.a $$0) {
      dgg $$1 = $$0.h();
      jh $$2 = new jh($$1.d(), 64, $$1.e());
      return Optional.of(new eoc.b($$2, (Consumer<eou>)($$1x -> a($$1x, $$0))));
   }

   private static void a(eou $$0, eoc.a $$1) {
      eqi.q $$2 = new eqi.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<eog> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         eog $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public eol<?> e() {
      return eol.d;
   }
}
