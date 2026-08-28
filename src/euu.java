import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class euu extends esn {
   public static final btm<dly.c> d = btm.<dly.c>b()
      .a(new dly.c(bxn.p, 2, 3), 10)
      .a(new dly.c(bxn.bS, 4, 4), 5)
      .a(new dly.c(bxn.bL, 5, 5), 8)
      .a(new dly.c(bxn.bg, 5, 5), 2)
      .a(new dly.c(bxn.aA, 4, 4), 3)
      .a();
   public static final MapCodec<euu> e = a(euu::new);

   public euu(esn.c $$0) {
      super($$0);
   }

   @Override
   public Optional<esn.b> a(esn.a $$0) {
      djo $$1 = $$0.h();
      iw $$2 = new iw($$1.d(), 64, $$1.e());
      return Optional.of(new esn.b($$2, (Consumer<etf>)($$1x -> a($$1x, $$0))));
   }

   private static void a(etf $$0, esn.a $$1) {
      eut.q $$2 = new eut.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<esr> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         esr $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public esw<?> e() {
      return esw.d;
   }
}
