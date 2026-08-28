import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class eji extends ejg {
   public eji(Codec<ejf> $$0) {
      super($$0);
      this.h = ImmutableSet.of(exp.e, exp.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(azx $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(eje $$0, ejf $$1, edb $$2, Function<iv, jf<dla>> $$3, eda $$4, iv.a $$5, iv.a $$6, egp $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         ebe $$9;
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
