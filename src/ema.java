import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class ema extends ekm<enp> {
   public ema(Codec<enp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eko<enp> $$0) {
      dky $$1 = $$0.b();
      iw $$2 = $$0.e();
      enp $$3 = $$0.f();
      azz $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         iw $$6 = $$2.h($$5.getAsInt());
         kb $$7 = new kb($$3.c, $$3.c, $$3.c);
         erv $$8 = erv.a($$6.b($$7), $$6.a($$7));
         return iw.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dng.lp.m(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(dky $$0, iw $$1, enp $$2) {
      Predicate<ebg> $$3 = $$0x -> $$0x.a(dng.J);
      Predicate<ebg> $$4 = $$0x -> !$$0x.a(dng.J);
      Optional<egv> $$5 = egv.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(egv::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(dky $$0, iw $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.e())) {
         for (jc $$2 : jc.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dka $$0, iw $$1) {
      ebg $$2 = $$0.a_($$1);
      return $$2.a(dng.J) || $$2.l();
   }
}
