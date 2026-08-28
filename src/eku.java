import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class eku extends eik {
   public static final MapCodec<eku> d = a(eku::new);

   public eku(eik.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eik.b> a(eik.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (ji<dcx> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(awo.X)) {
            return Optional.empty();
         }
      }

      return a($$0, dxu.a.c, $$1x -> a($$1x, $$0));
   }

   private static eio a(dbf $$0, dyt $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      je $$4 = je.c.a.a($$1);
      return new ekt.h($$1, $$2, $$3, $$4);
   }

   private static void a(ejc $$0, eik.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static eiz a(dbf $$0, long $$1, eiz $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dyt $$3 = new dyt(new dxv(dyj.a()));
         $$3.c($$1, $$0.e, $$0.f);
         eio $$4 = $$2.c().get(0);
         eic $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         je $$8 = je.c.a.a($$3);
         je $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         eio $$10 = new ekt.h($$3, $$6, $$7, $$9);
         ejc $$11 = new ejc();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public eit<?> e() {
      return eit.j;
   }
}
