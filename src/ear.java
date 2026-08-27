import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class ear extends dzd<ecf> {
   public ear(Codec<ecf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzf<ecf> $$0) {
      day $$1 = $$0.b();
      in $$2 = $$0.e();
      ecf $$3 = $$0.f();
      ayg $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         in $$6 = $$2.h($$5.getAsInt());
         jr $$7 = new jr($$3.c, $$3.c, $$3.c);
         egh $$8 = egh.a($$6.b($$7), $$6.a($$7));
         return in.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, ddg.kJ.n(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(day $$0, in $$1, ecf $$2) {
      Predicate<dqh> $$3 = $$0x -> $$0x.a(ddg.G);
      Predicate<dqh> $$4 = $$0x -> !$$0x.a(ddg.G);
      Optional<dvp> $$5 = dvp.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(dvp::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(day $$0, in $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.d())) {
         for (is $$2 : is.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dae $$0, in $$1) {
      dqh $$2 = $$0.a_($$1);
      return $$2.a(ddg.G) || $$2.i();
   }
}
