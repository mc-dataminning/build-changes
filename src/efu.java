import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class efu extends efs {
   public efu(Codec<efr> $$0) {
      super($$0);
      this.h = ImmutableSet.of(etx.e, etx.c);
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

   protected boolean a(efq $$0, efr $$1, dzp $$2, Function<jh, jq<dij>> $$3, dzo $$4, jh.a $$5, jh.a $$6, edb $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         dxu $$9;
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
