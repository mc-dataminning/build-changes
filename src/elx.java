import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class elx extends ejm {
   public static final MapCodec<elx> d = a(elx::new);

   public elx(ejm.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ejm.b> a(ejm.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (jm<ddu> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(awc.X)) {
            return Optional.empty();
         }
      }

      return a($$0, dyv.a.c, $$1x -> a($$1x, $$0));
   }

   private static ejq a(dcb $$0, dzu $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      ji $$4 = ji.c.a.a($$1);
      return new elw.h($$1, $$2, $$3, $$4);
   }

   private static void a(eke $$0, ejm.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static ekb a(dcb $$0, long $$1, ekb $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dzu $$3 = new dzu(new dyw(dzk.a()));
         $$3.c($$1, $$0.e, $$0.f);
         ejq $$4 = $$2.c().get(0);
         eje $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         ji $$8 = ji.c.a.a($$3);
         ji $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         ejq $$10 = new elw.h($$3, $$6, $$7, $$9);
         eke $$11 = new eke();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public ejv<?> e() {
      return ejv.j;
   }
}
