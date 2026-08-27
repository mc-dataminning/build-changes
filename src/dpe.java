import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class dpe extends dnq<dqs> {
   public dpe(Codec<dqs> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dns<dqs> $$0) {
      cqv $$1 = $$0.b();
      gw $$2 = $$0.e();
      dqs $$3 = $$0.f();
      ash $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         gw $$6 = $$2.h($$5.getAsInt());
         hy $$7 = new hy($$3.c, $$3.c, $$3.c);
         ehc $$8 = new ehc($$6.b($$7), $$6.a($$7));
         return gw.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, cte.kJ.o(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(cqv $$0, gw $$1, dqs $$2) {
      Predicate<dfd> $$3 = $$0x -> $$0x.a(cte.G);
      Predicate<dfd> $$4 = $$0x -> !$$0x.a(cte.G);
      Optional<dkc> $$5 = dkc.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(dkc::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(cqv $$0, gw $$1) {
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

   private boolean a(cqc $$0, gw $$1) {
      dfd $$2 = $$0.a_($$1);
      return $$2.a(cte.G) || $$2.i();
   }
}
