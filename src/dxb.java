import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.Optional;

public class dxb extends duy {
   public static final Codec<dxb> d = a(dxb::new);

   public dxb(duy.c $$0) {
      super($$0);
   }

   @Override
   public Optional<duy.b> a(duy.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (he<cqj> $$4 : $$0.c().a($$1, $$0.b().e(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(apk.W)) {
            return Optional.empty();
         }
      }

      return a($$0, dki.a.c, $$1x -> a($$1x, $$0));
   }

   private static dvc a(cos $$0, dlh $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      ha $$4 = ha.c.a.a($$1);
      return new dxa.h($$1, $$2, $$3, $$4);
   }

   private static void a(dvq $$0, duy.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static dvn a(cos $$0, long $$1, dvn $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dlh $$3 = new dlh(new dkj(dkx.a()));
         $$3.c($$1, $$0.e, $$0.f);
         dvc $$4 = $$2.c().get(0);
         duq $$5 = $$4.f();
         int $$6 = $$5.g();
         int $$7 = $$5.i();
         ha $$8 = ha.c.a.a($$3);
         ha $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         dvc $$10 = new dxa.h($$3, $$6, $$7, $$9);
         dvq $$11 = new dvq();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public dvh<?> e() {
      return dvh.j;
   }
}
