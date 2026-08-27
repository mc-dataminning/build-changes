import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class dpk extends dnw<dqy> {
   public dpk(Codec<dqy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dny<dqy> $$0) {
      cqp $$1 = $$0.b();
      gw $$2 = $$0.e();
      dqy $$3 = $$0.f();
      asc $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         gw $$6 = $$2.h($$5.getAsInt());
         hy $$7 = new hy($$3.c, $$3.c, $$3.c);
         ehi $$8 = new ehi($$6.b($$7), $$6.a($$7));
         return gw.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, csw.kJ.n(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(cqp $$0, gw $$1, dqy $$2) {
      Predicate<dfj> $$3 = $$0x -> $$0x.a(csw.G);
      Predicate<dfj> $$4 = $$0x -> !$$0x.a(csw.G);
      Optional<dki> $$5 = dki.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(dki::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(cqp $$0, gw $$1) {
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

   private boolean a(cpw $$0, gw $$1) {
      dfj $$2 = $$0.a_($$1);
      return $$2.a(csw.G) || $$2.i();
   }
}
