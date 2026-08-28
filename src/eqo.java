import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class eqo extends eod {
   public static final MapCodec<eqo> d = a(eqo::new);

   public eqo(eod.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eod.b> a(eod.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (jq<dib> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(axj.X)) {
            return Optional.empty();
         }
      }

      return a($$0, edj.a.c, $$1x -> a($$1x, $$0));
   }

   private static eoh a(dgf $$0, eei $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      jm $$4 = jm.c.a.a($$1);
      return new eqn.h($$1, $$2, $$3, $$4);
   }

   private static void a(eov $$0, eod.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static eos a(dgf $$0, long $$1, eos $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         eei $$3 = new eei(new edk(edy.a()));
         $$3.c($$1, $$0.h, $$0.i);
         eoh $$4 = $$2.c().get(0);
         env $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         jm $$8 = jm.c.a.a($$3);
         jm $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         eoh $$10 = new eqn.h($$3, $$6, $$7, $$9);
         eov $$11 = new eov();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public eom<?> e() {
      return eom.j;
   }
}
