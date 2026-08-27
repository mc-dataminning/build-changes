import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.Optional;

public class dxg extends dvd {
   public static final Codec<dxg> d = a(dxg::new);

   public dxg(dvd.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dvd.b> a(dvd.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (hg<cqo> $$4 : $$0.c().a($$1, $$0.b().e(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(apn.W)) {
            return Optional.empty();
         }
      }

      return a($$0, dkn.a.c, $$1x -> a($$1x, $$0));
   }

   private static dvh a(cox $$0, dlm $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      hc $$4 = hc.c.a.a($$1);
      return new dxf.h($$1, $$2, $$3, $$4);
   }

   private static void a(dvv $$0, dvd.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static dvs a(cox $$0, long $$1, dvs $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dlm $$3 = new dlm(new dko(dlc.a()));
         $$3.c($$1, $$0.e, $$0.f);
         dvh $$4 = $$2.c().get(0);
         duv $$5 = $$4.f();
         int $$6 = $$5.g();
         int $$7 = $$5.i();
         hc $$8 = hc.c.a.a($$3);
         hc $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         dvh $$10 = new dxf.h($$3, $$6, $$7, $$9);
         dvv $$11 = new dvv();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public dvm<?> e() {
      return dvm.j;
   }
}
