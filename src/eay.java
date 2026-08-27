import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class eay extends eaw {
   public eay(Codec<eav> $$0) {
      super($$0);
      this.h = ImmutableSet.of(epf.e, epf.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(ayt $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(eau $$0, eav $$1, duy $$2, Function<ir, ja<dcz>> $$3, dux $$4, ir.a $$5, ir.a $$6, dyg $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         dtc $$9;
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
