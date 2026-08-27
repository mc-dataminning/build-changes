import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.Optional;

public class dud extends dsa {
   public static final Codec<dud> d = a(dud::new);

   public dud(dsa.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dsa.b> a(dsa.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (he<cnk> $$4 : $$0.c().a($$1, $$0.b().e(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(amv.W)) {
            return Optional.empty();
         }
      }

      return a($$0, dhk.a.c, $$1x -> a($$1x, $$0));
   }

   private static dse a(clt $$0, dij $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      ha $$4 = ha.c.a.a($$1);
      return new duc.h($$1, $$2, $$3, $$4);
   }

   private static void a(dss $$0, dsa.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static dsp a(clt $$0, long $$1, dsp $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dij $$3 = new dij(new dhl(dhz.a()));
         $$3.c($$1, $$0.e, $$0.f);
         dse $$4 = $$2.c().get(0);
         drs $$5 = $$4.f();
         int $$6 = $$5.g();
         int $$7 = $$5.i();
         ha $$8 = ha.c.a.a($$3);
         ha $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         dse $$10 = new duc.h($$3, $$6, $$7, $$9);
         dss $$11 = new dss();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public dsj<?> e() {
      return dsj.j;
   }
}
