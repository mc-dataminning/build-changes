import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class ety extends ern {
   public static final MapCodec<ety> d = a(ety::new);

   public ety(ern.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ern.b> a(ern.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (jf<dkp> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(axb.X)) {
            return Optional.empty();
         }
      }

      return a($$0, egs.a.c, $$1x -> a($$1x, $$0));
   }

   private static err a(dir $$0, ehr $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      jb $$4 = jb.c.a.a($$1);
      return new etx.h($$1, $$2, $$3, $$4);
   }

   private static void a(esf $$0, ern.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static esc a(dir $$0, long $$1, esc $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         ehr $$3 = new ehr(new egt(ehh.a()));
         $$3.c($$1, $$0.h, $$0.i);
         err $$4 = $$2.c().get(0);
         erf $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         jb $$8 = jb.c.a.a($$3);
         jb $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         err $$10 = new etx.h($$3, $$6, $$7, $$9);
         esf $$11 = new esf();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public erw<?> e() {
      return erw.j;
   }
}
