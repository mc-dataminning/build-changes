import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class dml extends dmj {
   public dml(Codec<dmi> $$0) {
      super($$0);
      this.h = ImmutableSet.of(eac.e, eac.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(art $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(dmh $$0, dmi $$1, dgu $$2, Function<gv, hf<cqi>> $$3, dgt $$4, gv.a $$5, gv.a $$6, djt $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         dey $$9;
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
