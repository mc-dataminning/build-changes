import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dww extends dux {
   public static final bfc<cqu.c> d = bfc.a(
      new cqu.c(bik.i, 10, 2, 3), new cqu.c(bik.bs, 5, 4, 4), new cqu.c(bik.bl, 8, 5, 5), new cqu.c(bik.aJ, 2, 5, 5), new cqu.c(bik.al, 3, 4, 4)
   );
   public static final Codec<dww> e = a(dww::new);

   public dww(dux.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dux.b> a(dux.a $$0) {
      cor $$1 = $$0.h();
      gv $$2 = new gv($$1.d(), 64, $$1.e());
      return Optional.of(new dux.b($$2, (Consumer<dvp>)($$1x -> a($$1x, $$0))));
   }

   private static void a(dvp $$0, dux.a $$1) {
      dwv.q $$2 = new dwv.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<dvb> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         dvb $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public dvg<?> e() {
      return dvg.d;
   }
}
