import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class eqv extends eok {
   public static final MapCodec<eqv> d = a(eqv::new);

   public eqv(eok.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eok.b> a(eok.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (jq<dik> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(axt.X)) {
            return Optional.empty();
         }
      }

      return a($$0, edq.a.c, $$1x -> a($$1x, $$0));
   }

   private static eoo a(dgo $$0, eep $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      jm $$4 = jm.c.a.a($$1);
      return new equ.h($$1, $$2, $$3, $$4);
   }

   private static void a(epc $$0, eok.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static eoz a(dgo $$0, long $$1, eoz $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         eep $$3 = new eep(new edr(eef.a()));
         $$3.c($$1, $$0.h, $$0.i);
         eoo $$4 = $$2.c().get(0);
         eoc $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         jm $$8 = jm.c.a.a($$3);
         jm $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         eoo $$10 = new equ.h($$3, $$6, $$7, $$9);
         epc $$11 = new epc();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public eot<?> e() {
      return eot.j;
   }
}
