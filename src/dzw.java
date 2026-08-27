import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.Optional;

public class dzw extends dxm {
   public static final Codec<dzw> d = a(dzw::new);

   public dzw(dxm.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dxm.b> a(dxm.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (ig<ctd> $$4 : $$0.c().a($$1, $$0.b().e(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(arj.W)) {
            return Optional.empty();
         }
      }

      return a($$0, dmw.a.c, $$1x -> a($$1x, $$0));
   }

   private static dxq a(crm $$0, dnv $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      ib $$4 = ib.c.a.a($$1);
      return new dzv.h($$1, $$2, $$3, $$4);
   }

   private static void a(dye $$0, dxm.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static dyb a(crm $$0, long $$1, dyb $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dnv $$3 = new dnv(new dmx(dnl.a()));
         $$3.c($$1, $$0.e, $$0.f);
         dxq $$4 = $$2.c().get(0);
         dxe $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         ib $$8 = ib.c.a.a($$3);
         ib $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         dxq $$10 = new dzv.h($$3, $$6, $$7, $$9);
         dye $$11 = new dye();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public dxv<?> e() {
      return dxv.j;
   }
}
