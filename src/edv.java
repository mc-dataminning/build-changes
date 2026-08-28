import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class edv extends edt {
   public edv(Codec<eds> $$0) {
      super($$0);
      this.h = ImmutableSet.of(erw.e, erw.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(azu $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(edr $$0, eds $$1, dxq $$2, Function<jh, jq<dgo>> $$3, dxp $$4, jh.a $$5, jh.a $$6, ebc $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         dvv $$9;
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
