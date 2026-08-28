import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class efi extends edu<egw> {
   public efi(Codec<egw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(edw<egw> $$0) {
      dfg $$1 = $$0.b();
      jf $$2 = $$0.e();
      egw $$3 = $$0.f();
      azn $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         jf $$6 = $$2.h($$5.getAsInt());
         kj $$7 = new kj($$3.c, $$3.c, $$3.c);
         eky $$8 = eky.a($$6.b($$7), $$6.a($$7));
         return jf.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dho.kJ.n(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(dfg $$0, jf $$1, egw $$2) {
      Predicate<dus> $$3 = $$0x -> $$0x.a(dho.G);
      Predicate<dus> $$4 = $$0x -> !$$0x.a(dho.G);
      Optional<eae> $$5 = eae.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(eae::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(dfg $$0, jf $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.e())) {
         for (jk $$2 : jk.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dek $$0, jf $$1) {
      dus $$2 = $$0.a_($$1);
      return $$2.a(dho.G) || $$2.l();
   }
}
