import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class dzj extends dxv<eax> {
   public dzj(Codec<eax> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dxx<eax> $$0) {
      czs $$1 = $$0.b();
      ib $$2 = $$0.e();
      eax $$3 = $$0.f();
      axr $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         ib $$6 = $$2.h($$5.getAsInt());
         jg $$7 = new jg($$3.c, $$3.c, $$3.c);
         eez $$8 = eez.a($$6.b($$7), $$6.a($$7));
         return ib.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dca.kJ.n(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(czs $$0, ib $$1, eax $$2) {
      Predicate<doz> $$3 = $$0x -> $$0x.a(dca.G);
      Predicate<doz> $$4 = $$0x -> !$$0x.a(dca.G);
      Optional<duh> $$5 = duh.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(duh::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(czs $$0, ib $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.d())) {
         for (ih $$2 : ih.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(cyy $$0, ib $$1) {
      doz $$2 = $$0.a_($$1);
      return $$2.a(dca.G) || $$2.i();
   }
}
