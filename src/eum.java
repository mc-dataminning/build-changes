import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class eum extends esb {
   public static final MapCodec<eum> d = a(eum::new);

   public eum(esb.c $$0) {
      super($$0);
   }

   @Override
   public Optional<esb.b> a(esb.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (jf<dla> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(axd.X)) {
            return Optional.empty();
         }
      }

      return a($$0, ehd.a.c, $$1x -> a($$1x, $$0));
   }

   private static esf a(djc $$0, eic $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      jb $$4 = jb.c.a.a($$1);
      return new eul.h($$1, $$2, $$3, $$4);
   }

   private static void a(est $$0, esb.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static esq a(djc $$0, long $$1, esq $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         eic $$3 = new eic(new ehe(ehs.a()));
         $$3.c($$1, $$0.h, $$0.i);
         esf $$4 = $$2.c().get(0);
         ert $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         jb $$8 = jb.c.a.a($$3);
         jb $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         esf $$10 = new eul.h($$3, $$6, $$7, $$9);
         est $$11 = new est();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public esk<?> e() {
      return esk.j;
   }
}
