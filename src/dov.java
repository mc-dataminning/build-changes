import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class dov extends dot {
   public dov(Codec<dos> $$0) {
      super($$0);
      this.h = ImmutableSet.of(ect.e, ect.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(ats $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(dor $$0, dos $$1, dje $$2, Function<ht, ib<csy>> $$3, djd $$4, ht.a $$5, ht.a $$6, dmd $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         dhi $$9;
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
