import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class efn extends efl {
   public efn(Codec<efk> $$0) {
      super($$0);
      this.h = ImmutableSet.of(etq.e, etq.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(bam $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(efj $$0, efk $$1, dzi $$2, Function<jh, jq<dic>> $$3, dzh $$4, jh.a $$5, jh.a $$6, ecu $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         dxn $$9;
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
