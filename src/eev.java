import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class eev extends eet {
   public eev(Codec<ees> $$0) {
      super($$0);
      this.h = ImmutableSet.of(esy.e, esy.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(azg $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(eer $$0, ees $$1, dyq $$2, Function<ji, jr<dhi>> $$3, dyp $$4, ji.a $$5, ji.a $$6, ecc $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         dwv $$9;
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
