import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class dss extends dsq {
   public dss(Codec<dsp> $$0) {
      super($$0);
      this.h = ImmutableSet.of(egq.e, egq.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(awo $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(dso $$0, dsp $$1, dnb $$2, Function<hz, ij<cwm>> $$3, dna $$4, hz.a $$5, hz.a $$6, dqa $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         dlf $$9;
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
