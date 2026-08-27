import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class dmq extends dmo {
   public dmq(Codec<dmn> $$0) {
      super($$0);
      this.h = ImmutableSet.of(eah.e, eah.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(ash $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(dmm $$0, dmn $$1, dgz $$2, Function<gw, he<cqz>> $$3, dgy $$4, gw.a $$5, gw.a $$6, djy $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         dfd $$9;
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
