import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class dpb extends dnn<dqp> {
   public dpb(Codec<dqp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnp<dqp> $$0) {
      cqg $$1 = $$0.b();
      gu $$2 = $$0.e();
      dqp $$3 = $$0.f();
      aru $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         gu $$6 = $$2.h($$5.getAsInt());
         hz $$7 = new hz($$3.c, $$3.c, $$3.c);
         egz $$8 = new egz($$6.b($$7), $$6.a($$7));
         return gu.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, csn.kJ.n(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(cqg $$0, gu $$1, dqp $$2) {
      Predicate<dfa> $$3 = $$0x -> $$0x.a(csn.G);
      Predicate<dfa> $$4 = $$0x -> !$$0x.a(csn.G);
      Optional<djz> $$5 = djz.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(djz::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(cqg $$0, gu $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.d())) {
         for (ha $$2 : ha.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(cpn $$0, gu $$1) {
      dfa $$2 = $$0.a_($$1);
      return $$2.a(csn.G) || $$2.i();
   }
}
