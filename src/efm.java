import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.Optional;

public class efm extends edc {
   public static final Codec<efm> d = a(efm::new);

   public efm(edc.c $$0) {
      super($$0);
   }

   @Override
   public Optional<edc.b> a(edc.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (il<cxy> $$4 : $$0.c().a($$1, $$0.b().e(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(aum.X)) {
            return Optional.empty();
         }
      }

      return a($$0, dsm.a.c, $$1x -> a($$1x, $$0));
   }

   private static edg a(cwg $$0, dtl $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      ih $$4 = ih.c.a.a($$1);
      return new efl.h($$1, $$2, $$3, $$4);
   }

   private static void a(edu $$0, edc.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static edr a(cwg $$0, long $$1, edr $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dtl $$3 = new dtl(new dsn(dtb.a()));
         $$3.c($$1, $$0.e, $$0.f);
         edg $$4 = $$2.c().get(0);
         ecu $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         ih $$8 = ih.c.a.a($$3);
         ih $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         edg $$10 = new efl.h($$3, $$6, $$7, $$9);
         edu $$11 = new edu();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public edl<?> e() {
      return edl.j;
   }
}
