import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.Optional;

public class dxn extends dvk {
   public static final Codec<dxn> d = a(dxn::new);

   public dxn(dvk.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dvk.b> a(dvk.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (hg<cqv> $$4 : $$0.c().a($$1, $$0.b().e(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(apt.W)) {
            return Optional.empty();
         }
      }

      return a($$0, dku.a.c, $$1x -> a($$1x, $$0));
   }

   private static dvo a(cpe $$0, dlt $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      hc $$4 = hc.c.a.a($$1);
      return new dxm.h($$1, $$2, $$3, $$4);
   }

   private static void a(dwc $$0, dvk.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static dvz a(cpe $$0, long $$1, dvz $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dlt $$3 = new dlt(new dkv(dlj.a()));
         $$3.c($$1, $$0.e, $$0.f);
         dvo $$4 = $$2.c().get(0);
         dvc $$5 = $$4.f();
         int $$6 = $$5.g();
         int $$7 = $$5.i();
         hc $$8 = hc.c.a.a($$3);
         hc $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         dvo $$10 = new dxm.h($$3, $$6, $$7, $$9);
         dwc $$11 = new dwc();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public dvt<?> e() {
      return dvt.j;
   }
}
