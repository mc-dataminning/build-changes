import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class eot extends emi {
   public static final MapCodec<eot> d = a(eot::new);

   public eot(emi.c $$0) {
      super($$0);
   }

   @Override
   public Optional<emi.b> a(emi.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (jq<dgo> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(axb.X)) {
            return Optional.empty();
         }
      }

      return a($$0, ebq.a.c, $$1x -> a($$1x, $$0));
   }

   private static emm a(des $$0, ecp $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      jm $$4 = jm.c.a.a($$1);
      return new eos.h($$1, $$2, $$3, $$4);
   }

   private static void a(ena $$0, emi.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static emx a(des $$0, long $$1, emx $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         ecp $$3 = new ecp(new ebr(ecf.a()));
         $$3.c($$1, $$0.g, $$0.h);
         emm $$4 = $$2.c().get(0);
         ema $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         jm $$8 = jm.c.a.a($$3);
         jm $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         emm $$10 = new eos.h($$3, $$6, $$7, $$9);
         ena $$11 = new ena();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public emr<?> e() {
      return emr.j;
   }
}
