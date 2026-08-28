import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class est extends eqi {
   public static final MapCodec<est> d = a(est::new);

   public est(eqi.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eqi.b> a(eqi.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (je<djs> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(awz.X)) {
            return Optional.empty();
         }
      }

      return a($$0, efn.a.c, $$1x -> a($$1x, $$0));
   }

   private static eqm a(dhw $$0, egm $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      ja $$4 = ja.c.a.a($$1);
      return new ess.h($$1, $$2, $$3, $$4);
   }

   private static void a(era $$0, eqi.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static eqx a(dhw $$0, long $$1, eqx $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         egm $$3 = new egm(new efo(egc.a()));
         $$3.c($$1, $$0.h, $$0.i);
         eqm $$4 = $$2.c().get(0);
         eqa $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         ja $$8 = ja.c.a.a($$3);
         ja $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         eqm $$10 = new ess.h($$3, $$6, $$7, $$9);
         era $$11 = new era();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public eqr<?> e() {
      return eqr.j;
   }
}
