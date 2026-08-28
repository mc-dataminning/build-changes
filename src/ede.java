import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class ede extends edc {
   public ede(Codec<edb> $$0) {
      super($$0);
      this.h = ImmutableSet.of(erf.e, erf.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(azr $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(eda $$0, edb $$1, dwz $$2, Function<jg, jp<dfw>> $$3, dwy $$4, jg.a $$5, jg.a $$6, eal $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         dvd $$9;
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
