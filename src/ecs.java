import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class ecs extends ebe<eeg> {
   public ecs(Codec<eeg> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebg<eeg> $$0) {
      dcz $$1 = $$0.b();
      ja $$2 = $$0.e();
      eeg $$3 = $$0.f();
      aym $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         ja $$6 = $$2.h($$5.getAsInt());
         ke $$7 = new ke($$3.c, $$3.c, $$3.c);
         eii $$8 = eii.a($$6.b($$7), $$6.a($$7));
         return ja.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dfh.kJ.o(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(dcz $$0, ja $$1, eeg $$2) {
      Predicate<dsh> $$3 = $$0x -> $$0x.a(dfh.G);
      Predicate<dsh> $$4 = $$0x -> !$$0x.a(dfh.G);
      Optional<dxp> $$5 = dxp.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(dxp::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(dcz $$0, ja $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.d())) {
         for (jf $$2 : jf.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dce $$0, ja $$1) {
      dsh $$2 = $$0.a_($$1);
      return $$2.a(dfh.G) || $$2.i();
   }
}
