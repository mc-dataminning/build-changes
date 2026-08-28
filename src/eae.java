import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class eae extends eac {
   public eae(Codec<eab> $$0) {
      super($$0);
      this.h = ImmutableSet.of(eoc.e, eoc.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(aym $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(eaa $$0, eab $$1, dud $$2, Function<ja, jj<ddd>> $$3, duc $$4, ja.a $$5, ja.a $$6, dxl $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         dsh $$9;
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
