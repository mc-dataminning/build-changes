import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class ecp extends ecn {
   public ecp(Codec<ecm> $$0) {
      super($$0);
      this.h = ImmutableSet.of(eqq.e, eqq.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(azl $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(ecl $$0, ecm $$1, dwk $$2, Function<je, jn<dfh>> $$3, dwj $$4, je.a $$5, je.a $$6, dzw $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         duo $$9;
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
