import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class dqc extends dqa {
   public dqc(Codec<dpz> $$0) {
      super($$0);
      this.h = ImmutableSet.of(eea.e, eea.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(auf $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(dpy $$0, dpz $$1, dkl $$2, Function<hv, ie<ctx>> $$3, dkk $$4, hv.a $$5, hv.a $$6, dnk $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         dip $$9;
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
