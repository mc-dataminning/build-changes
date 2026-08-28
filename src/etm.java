import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class etm extends erb {
   public static final MapCodec<etm> d = a(etm::new);

   public etm(erb.c $$0) {
      super($$0);
   }

   @Override
   public Optional<erb.b> a(erb.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (je<dkd> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(axb.X)) {
            return Optional.empty();
         }
      }

      return a($$0, egg.a.c, $$1x -> a($$1x, $$0));
   }

   private static erf a(dih $$0, ehf $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      ja $$4 = ja.c.a.a($$1);
      return new etl.h($$1, $$2, $$3, $$4);
   }

   private static void a(ert $$0, erb.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static erq a(dih $$0, long $$1, erq $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         ehf $$3 = new ehf(new egh(egv.a()));
         $$3.c($$1, $$0.h, $$0.i);
         erf $$4 = $$2.c().get(0);
         eqt $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         ja $$8 = ja.c.a.a($$3);
         ja $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         erf $$10 = new etl.h($$3, $$6, $$7, $$9);
         ert $$11 = new ert();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public erk<?> e() {
      return erk.j;
   }
}
