import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class eis extends eiq {
   public eis(Codec<eip> $$0) {
      super($$0);
      this.h = ImmutableSet.of(eww.e, eww.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(azv $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(eio $$0, eip $$1, ecl $$2, Function<iv, jf<dkk>> $$3, eck $$4, iv.a $$5, iv.a $$6, efz $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         eao $$9;
         if ($$5.v() <= $$0.a() + 31) {
            $$9 = g.g();
         } else {
            $$9 = e;
         }

         $$2.a($$5, $$9);
         return true;
      } else {
         return false;
      }
   }
}
