import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class ekv extends eil {
   public static final MapCodec<ekv> d = a(ekv::new);

   public ekv(eil.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eil.b> a(eil.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (ji<dcy> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(awo.X)) {
            return Optional.empty();
         }
      }

      return a($$0, dxv.a.c, $$1x -> a($$1x, $$0));
   }

   private static eip a(dbg $$0, dyu $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      je $$4 = je.c.a.a($$1);
      return new eku.h($$1, $$2, $$3, $$4);
   }

   private static void a(ejd $$0, eil.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static eja a(dbg $$0, long $$1, eja $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dyu $$3 = new dyu(new dxw(dyk.a()));
         $$3.c($$1, $$0.e, $$0.f);
         eip $$4 = $$2.c().get(0);
         eid $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         je $$8 = je.c.a.a($$3);
         je $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         eip $$10 = new eku.h($$3, $$6, $$7, $$9);
         ejd $$11 = new ejd();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public eiu<?> e() {
      return eiu.j;
   }
}
