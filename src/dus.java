import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class dus extends duq {
   public dus(Codec<dup> $$0) {
      super($$0);
      this.h = ImmutableSet.of(eiq.e, eiq.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(axd $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(duo $$0, dup $$1, dox $$2, Function<ib, il<cya>> $$3, dow $$4, ib.a $$5, ib.a $$6, dsa $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         dnb $$9;
         if ($$5.v() <= $$0.a() + 31) {
            $$9 = g.g();
         } else {
            $$9 = e;
         }

         $$2.a($$5, $$9, false);
         return true;
      } else {
         return false;
      }
   }
}
