import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class ekp extends eif {
   public static final MapCodec<ekp> d = a(ekp::new);

   public ekp(eif.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eif.b> a(eif.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (ji<dcs> $$4 : $$0.c().a($$1, $$0.b().e(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(awk.X)) {
            return Optional.empty();
         }
      }

      return a($$0, dxp.a.c, $$1x -> a($$1x, $$0));
   }

   private static eij a(dba $$0, dyo $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      je $$4 = je.c.a.a($$1);
      return new eko.h($$1, $$2, $$3, $$4);
   }

   private static void a(eix $$0, eif.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static eiu a(dba $$0, long $$1, eiu $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dyo $$3 = new dyo(new dxq(dye.a()));
         $$3.c($$1, $$0.e, $$0.f);
         eij $$4 = $$2.c().get(0);
         ehx $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         je $$8 = je.c.a.a($$3);
         je $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         eij $$10 = new eko.h($$3, $$6, $$7, $$9);
         eix $$11 = new eix();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public eio<?> e() {
      return eio.j;
   }
}
