import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class ete extends eqt {
   public static final MapCodec<ete> d = a(ete::new);

   public ete(eqt.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eqt.b> a(eqt.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (je<djy> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(axb.X)) {
            return Optional.empty();
         }
      }

      return a($$0, efy.a.c, $$1x -> a($$1x, $$0));
   }

   private static eqx a(dic $$0, egx $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      ja $$4 = ja.c.a.a($$1);
      return new etd.h($$1, $$2, $$3, $$4);
   }

   private static void a(erl $$0, eqt.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static eri a(dic $$0, long $$1, eri $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         egx $$3 = new egx(new efz(egn.a()));
         $$3.c($$1, $$0.h, $$0.i);
         eqx $$4 = $$2.c().get(0);
         eql $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         ja $$8 = ja.c.a.a($$3);
         ja $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         eqx $$10 = new etd.h($$3, $$6, $$7, $$9);
         erl $$11 = new erl();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public erc<?> e() {
      return erc.j;
   }
}
