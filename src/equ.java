import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class equ extends eoj {
   public static final MapCodec<equ> d = a(equ::new);

   public equ(eoj.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eoj.b> a(eoj.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (jq<dij> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(axt.X)) {
            return Optional.empty();
         }
      }

      return a($$0, edp.a.c, $$1x -> a($$1x, $$0));
   }

   private static eon a(dgn $$0, eeo $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      jm $$4 = jm.c.a.a($$1);
      return new eqt.h($$1, $$2, $$3, $$4);
   }

   private static void a(epb $$0, eoj.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static eoy a(dgn $$0, long $$1, eoy $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         eeo $$3 = new eeo(new edq(eee.a()));
         $$3.c($$1, $$0.h, $$0.i);
         eon $$4 = $$2.c().get(0);
         eob $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         jm $$8 = jm.c.a.a($$3);
         jm $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         eon $$10 = new eqt.h($$3, $$6, $$7, $$9);
         epb $$11 = new epb();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public eos<?> e() {
      return eos.j;
   }
}
