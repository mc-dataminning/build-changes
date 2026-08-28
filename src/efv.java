import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class efv extends eft {
   public efv(Codec<efs> $$0) {
      super($$0);
      this.h = ImmutableSet.of(ety.e, ety.c);
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

   protected boolean a(efr $$0, efs $$1, dzq $$2, Function<jh, jq<dik>> $$3, dzp $$4, jh.a $$5, jh.a $$6, edc $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         dxv $$9;
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
