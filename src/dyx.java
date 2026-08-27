import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class dyx extends dyv {
   public dyx(Codec<dyu> $$0) {
      super($$0);
      this.h = ImmutableSet.of(emv.e, emv.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(ayk $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(dyt $$0, dyu $$1, dsx $$2, Function<io, ix<dbw>> $$3, dsw $$4, io.a $$5, io.a $$6, dwf $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         drb $$9;
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
