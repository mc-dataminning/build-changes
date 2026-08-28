import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class elw extends ejp {
   public static final bpf<dei.c> d = bpf.a(
      new dei.c(bsx.i, 10, 2, 3), new dei.c(bsx.bx, 5, 4, 4), new dei.c(bsx.bq, 8, 5, 5), new dei.c(bsx.aN, 2, 5, 5), new dei.c(bsx.ap, 3, 4, 4)
   );
   public static final MapCodec<elw> e = a(elw::new);

   public elw(ejp.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ejp.b> a(ejp.a $$0) {
      dcd $$1 = $$0.h();
      jd $$2 = new jd($$1.d(), 64, $$1.e());
      return Optional.of(new ejp.b($$2, (Consumer<ekh>)($$1x -> a($$1x, $$0))));
   }

   private static void a(ekh $$0, ejp.a $$1) {
      elv.q $$2 = new elv.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<ejt> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         ejt $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public ejy<?> e() {
      return ejy.d;
   }
}
