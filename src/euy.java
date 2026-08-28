import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class euy extends esn {
   public static final MapCodec<euy> d = a(euy::new);

   public euy(esn.c $$0) {
      super($$0);
   }

   @Override
   public Optional<esn.b> a(esn.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (jg<dlm> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(axm.X)) {
            return Optional.empty();
         }
      }

      return a($$0, ehp.a.c, $$1x -> a($$1x, $$0));
   }

   private static esr a(djo $$0, eio $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      jc $$4 = jc.c.a.a($$1);
      return new eux.h($$1, $$2, $$3, $$4);
   }

   private static void a(etf $$0, esn.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static etc a(djo $$0, long $$1, etc $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         eio $$3 = new eio(new ehq(eie.a()));
         $$3.c($$1, $$0.h, $$0.i);
         esr $$4 = $$2.c().get(0);
         esf $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         jc $$8 = jc.c.a.a($$3);
         jc $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         esr $$10 = new eux.h($$3, $$6, $$7, $$9);
         etf $$11 = new etf();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public esw<?> e() {
      return esw.j;
   }
}
