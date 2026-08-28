import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class efo extends efm {
   public efo(Codec<efl> $$0) {
      super($$0);
      this.h = ImmutableSet.of(etr.e, etr.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(bac $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(efk $$0, efl $$1, dzj $$2, Function<jh, jq<dib>> $$3, dzi $$4, jh.a $$5, jh.a $$6, ecv $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         dxo $$9;
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
