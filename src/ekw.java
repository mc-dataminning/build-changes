import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class ekw extends eim {
   public static final MapCodec<ekw> d = a(ekw::new);

   public ekw(eim.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eim.b> a(eim.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (ji<dcz> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(awo.X)) {
            return Optional.empty();
         }
      }

      return a($$0, dxw.a.c, $$1x -> a($$1x, $$0));
   }

   private static eiq a(dbh $$0, dyv $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      je $$4 = je.c.a.a($$1);
      return new ekv.h($$1, $$2, $$3, $$4);
   }

   private static void a(eje $$0, eim.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static ejb a(dbh $$0, long $$1, ejb $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dyv $$3 = new dyv(new dxx(dyl.a()));
         $$3.c($$1, $$0.e, $$0.f);
         eiq $$4 = $$2.c().get(0);
         eie $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         je $$8 = je.c.a.a($$3);
         je $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         eiq $$10 = new ekv.h($$3, $$6, $$7, $$9);
         eje $$11 = new eje();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public eiv<?> e() {
      return eiv.j;
   }
}
