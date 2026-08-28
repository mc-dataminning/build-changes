import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class eix extends eiv {
   public eix(Codec<eiu> $$0) {
      super($$0);
      this.h = ImmutableSet.of(exb.e, exb.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(azv $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(eit $$0, eiu $$1, ecq $$2, Function<iv, jf<dkp>> $$3, ecp $$4, iv.a $$5, iv.a $$6, ege $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         eat $$9;
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
