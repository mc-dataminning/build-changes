import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class dqn extends dql {
   public dqn(Codec<dqk> $$0) {
      super($$0);
      this.h = ImmutableSet.of(eel.e, eel.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(aup $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(dqj $$0, dqk $$1, dkw $$2, Function<hx, ih<cuh>> $$3, dkv $$4, hx.a $$5, hx.a $$6, dnv $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         dja $$9;
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
