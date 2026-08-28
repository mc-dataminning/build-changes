import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class eew extends eeu {
   public eew(Codec<eet> $$0) {
      super($$0);
      this.h = ImmutableSet.of(esz.e, esz.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(azh $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(ees $$0, eet $$1, dyr $$2, Function<ji, jr<dhj>> $$3, dyq $$4, ji.a $$5, ji.a $$6, ecd $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         dww $$9;
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
