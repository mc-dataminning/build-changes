import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class ecy extends ebk<eem> {
   public ecy(Codec<eem> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebm<eem> $$0) {
      ddb $$1 = $$0.b();
      ja $$2 = $$0.e();
      eem $$3 = $$0.f();
      ayo $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         ja $$6 = $$2.h($$5.getAsInt());
         ke $$7 = new ke($$3.c, $$3.c, $$3.c);
         eio $$8 = eio.a($$6.b($$7), $$6.a($$7));
         return ja.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dfj.kJ.o(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(ddb $$0, ja $$1, eem $$2) {
      Predicate<dsk> $$3 = $$0x -> $$0x.a(dfj.G);
      Predicate<dsk> $$4 = $$0x -> !$$0x.a(dfj.G);
      Optional<dxv> $$5 = dxv.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(dxv::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(ddb $$0, ja $$1) {
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

   private boolean a(dcg $$0, ja $$1) {
      dsk $$2 = $$0.a_($$1);
      return $$2.a(dfj.G) || $$2.i();
   }
}
