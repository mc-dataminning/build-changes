import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.Optional;

public class ebq extends dzg {
   public static final Codec<ebq> d = a(ebq::new);

   public ebq(dzg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dzg.b> a(dzg.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (ih<cuo> $$4 : $$0.c().a($$1, $$0.b().e(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(asg.X)) {
            return Optional.empty();
         }
      }

      return a($$0, doq.a.c, $$1x -> a($$1x, $$0));
   }

   private static dzk a(csw $$0, dpp $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      ic $$4 = ic.c.a.a($$1);
      return new ebp.h($$1, $$2, $$3, $$4);
   }

   private static void a(dzy $$0, dzg.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static dzv a(csw $$0, long $$1, dzv $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dpp $$3 = new dpp(new dor(dpf.a()));
         $$3.c($$1, $$0.e, $$0.f);
         dzk $$4 = $$2.c().get(0);
         dyy $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         ic $$8 = ic.c.a.a($$3);
         ic $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         dzk $$10 = new ebp.h($$3, $$6, $$7, $$9);
         dzy $$11 = new dzy();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public dzp<?> e() {
      return dzp.j;
   }
}
