import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class edk extends edi {
   public edk(Codec<edh> $$0) {
      super($$0);
      this.h = ImmutableSet.of(erl.e, erl.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(azs $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(edg $$0, edh $$1, dxf $$2, Function<jh, jq<dgc>> $$3, dxe $$4, jh.a $$5, jh.a $$6, ear $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         dvj $$9;
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
