import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class eks extends eje<emg> {
   public eks(Codec<emg> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejg<emg> $$0) {
      dju $$1 = $$0.b();
      iu $$2 = $$0.e();
      emg $$3 = $$0.f();
      azv $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         iu $$6 = $$2.h($$5.getAsInt());
         jz $$7 = new jz($$3.c, $$3.c, $$3.c);
         eql $$8 = eql.a($$6.b($$7), $$6.a($$7));
         return iu.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dmc.lm.m(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(dju $$0, iu $$1, emg $$2) {
      Predicate<dzz> $$3 = $$0x -> $$0x.a(dmc.J);
      Predicate<dzz> $$4 = $$0x -> !$$0x.a(dmc.J);
      Optional<efo> $$5 = efo.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(efo::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(dju $$0, iu $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.e())) {
         for (ja $$2 : ja.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(diw $$0, iu $$1) {
      dzz $$2 = $$0.a_($$1);
      return $$2.a(dmc.J) || $$2.l();
   }
}
