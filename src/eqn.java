import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class eqn extends eoc {
   public static final MapCodec<eqn> d = a(eqn::new);

   public eqn(eoc.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eoc.b> a(eoc.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (jq<dic> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(axt.X)) {
            return Optional.empty();
         }
      }

      return a($$0, edi.a.c, $$1x -> a($$1x, $$0));
   }

   private static eog a(dgg $$0, eeh $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      jm $$4 = jm.c.a.a($$1);
      return new eqm.h($$1, $$2, $$3, $$4);
   }

   private static void a(eou $$0, eoc.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static eor a(dgg $$0, long $$1, eor $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         eeh $$3 = new eeh(new edj(edx.a()));
         $$3.c($$1, $$0.g, $$0.h);
         eog $$4 = $$2.c().get(0);
         enu $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         jm $$8 = jm.c.a.a($$3);
         jm $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         eog $$10 = new eqm.h($$3, $$6, $$7, $$9);
         eou $$11 = new eou();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public eol<?> e() {
      return eol.j;
   }
}
