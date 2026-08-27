import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class dyd extends dyb {
   public dyd(Codec<dya> $$0) {
      super($$0);
      this.h = ImmutableSet.of(emb.e, emb.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(ayg $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(dxz $$0, dya $$1, dsd $$2, Function<in, iw<dbc>> $$3, dsc $$4, in.a $$5, in.a $$6, dvl $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         dqh $$9;
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
