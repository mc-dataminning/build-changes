import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class ejv extends ehl {
   public static final MapCodec<ejv> d = a(ejv::new);

   public ejv(ehl.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ehl.b> a(ehl.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (ix<dby> $$4 : $$0.c().a($$1, $$0.b().e(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(avw.X)) {
            return Optional.empty();
         }
      }

      return a($$0, dwv.a.c, $$1x -> a($$1x, $$0));
   }

   private static ehp a(dag $$0, dxu $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      it $$4 = it.c.a.a($$1);
      return new eju.h($$1, $$2, $$3, $$4);
   }

   private static void a(eid $$0, ehl.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static eia a(dag $$0, long $$1, eia $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dxu $$3 = new dxu(new dww(dxk.a()));
         $$3.c($$1, $$0.e, $$0.f);
         ehp $$4 = $$2.c().get(0);
         ehd $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         it $$8 = it.c.a.a($$3);
         it $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         ehp $$10 = new eju.h($$3, $$6, $$7, $$9);
         eid $$11 = new eid();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public ehu<?> e() {
      return ehu.j;
   }
}
