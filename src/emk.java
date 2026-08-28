import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class emk extends ekw<enz> {
   public emk(Codec<enz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eky<enz> $$0) {
      dli $$1 = $$0.b();
      iw $$2 = $$0.e();
      enz $$3 = $$0.f();
      bai $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         iw $$6 = $$2.h($$5.getAsInt());
         kb $$7 = new kb($$3.c, $$3.c, $$3.c);
         esf $$8 = esf.a($$6.b($$7), $$6.a($$7));
         return iw.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dnq.lp.m(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(dli $$0, iw $$1, enz $$2) {
      Predicate<ebq> $$3 = $$0x -> $$0x.a(dnq.J);
      Predicate<ebq> $$4 = $$0x -> !$$0x.a(dnq.J);
      Optional<ehf> $$5 = ehf.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(ehf::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(dli $$0, iw $$1) {
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

   private boolean a(dkk $$0, iw $$1) {
      ebq $$2 = $$0.a_($$1);
      return $$2.a(dnq.J) || $$2.l();
   }
}
