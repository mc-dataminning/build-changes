import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class ecb extends ebz {
   public ecb(Codec<eby> $$0) {
      super($$0);
      this.h = ImmutableSet.of(eqc.e, eqc.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(azk $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(ebx $$0, eby $$1, dvw $$2, Function<je, jn<det>> $$3, dvv $$4, je.a $$5, je.a $$6, dzi $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         dua $$9;
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
