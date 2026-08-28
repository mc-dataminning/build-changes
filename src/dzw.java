import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class dzw extends dzu {
   public dzw(Codec<dzt> $$0) {
      super($$0);
      this.h = ImmutableSet.of(enu.e, enu.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(azf $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(dzs $$0, dzt $$1, dtw $$2, Function<iz, ji<dcv>> $$3, dtv $$4, iz.a $$5, iz.a $$6, dxe $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         dsa $$9;
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
