import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class ekh extends eit<elv> {
   public ekh(Codec<elv> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eiv<elv> $$0) {
      djo $$1 = $$0.b();
      iu $$2 = $$0.e();
      elv $$3 = $$0.f();
      azt $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         iu $$6 = $$2.h($$5.getAsInt());
         jz $$7 = new jz($$3.c, $$3.c, $$3.c);
         eqa $$8 = eqa.a($$6.b($$7), $$6.a($$7));
         return iu.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dlw.ll.m(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(djo $$0, iu $$1, elv $$2) {
      Predicate<dzo> $$3 = $$0x -> $$0x.a(dlw.J);
      Predicate<dzo> $$4 = $$0x -> !$$0x.a(dlw.J);
      Optional<efd> $$5 = efd.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(efd::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(djo $$0, iu $$1) {
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

   private boolean a(diq $$0, iu $$1) {
      dzo $$2 = $$0.a_($$1);
      return $$2.a(dlw.J) || $$2.l();
   }
}
