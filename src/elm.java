import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class elm extends ejy<ena> {
   public elm(Codec<ena> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eka<ena> $$0) {
      dkl $$1 = $$0.b();
      iv $$2 = $$0.e();
      ena $$3 = $$0.f();
      azv $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         iv $$6 = $$2.h($$5.getAsInt());
         ka $$7 = new ka($$3.c, $$3.c, $$3.c);
         erf $$8 = erf.a($$6.b($$7), $$6.a($$7));
         return iv.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dmt.lp.m(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(dkl $$0, iv $$1, ena $$2) {
      Predicate<eat> $$3 = $$0x -> $$0x.a(dmt.J);
      Predicate<eat> $$4 = $$0x -> !$$0x.a(dmt.J);
      Optional<egi> $$5 = egi.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(egi::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(dkl $$0, iv $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.e())) {
         for (jb $$2 : jb.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(djn $$0, iv $$1) {
      eat $$2 = $$0.a_($$1);
      return $$2.a(dmt.J) || $$2.l();
   }
}
