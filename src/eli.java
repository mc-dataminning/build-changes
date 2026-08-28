import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class eli extends eix {
   public static final MapCodec<eli> d = a(eli::new);

   public eli(eix.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eix.b> a(eix.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (jj<ddg> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(avv.X)) {
            return Optional.empty();
         }
      }

      return a($$0, dyg.a.c, $$1x -> a($$1x, $$0));
   }

   private static ejb a(dbn $$0, dzf $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      jf $$4 = jf.c.a.a($$1);
      return new elh.h($$1, $$2, $$3, $$4);
   }

   private static void a(ejp $$0, eix.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static ejm a(dbn $$0, long $$1, ejm $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dzf $$3 = new dzf(new dyh(dyv.a()));
         $$3.c($$1, $$0.e, $$0.f);
         ejb $$4 = $$2.c().get(0);
         eip $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         jf $$8 = jf.c.a.a($$3);
         jf $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         ejb $$10 = new elh.h($$3, $$6, $$7, $$9);
         ejp $$11 = new ejp();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public ejg<?> e() {
      return ejg.j;
   }
}
