import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class dtb extends drn<dup> {
   public dtb(Codec<dup> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drp<dup> $$0) {
      cud $$1 = $$0.b();
      hx $$2 = $$0.e();
      dup $$3 = $$0.f();
      aup $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         hx $$6 = $$2.h($$5.getAsInt());
         jb $$7 = new jb($$3.c, $$3.c, $$3.c);
         dyr $$8 = dyr.a($$6.b($$7), $$6.a($$7));
         return hx.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, cwl.kJ.o(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(cud $$0, hx $$1, dup $$2) {
      Predicate<dja> $$3 = $$0x -> $$0x.a(cwl.G);
      Predicate<dja> $$4 = $$0x -> !$$0x.a(cwl.G);
      Optional<dnz> $$5 = dnz.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(dnz::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(cud $$0, hx $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.d())) {
         for (ic $$2 : ic.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(ctj $$0, hx $$1) {
      dja $$2 = $$0.a_($$1);
      return $$2.a(cwl.G) || $$2.i();
   }
}
