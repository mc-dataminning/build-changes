import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class dqt extends dqr {
   public dqt(Codec<dqq> $$0) {
      super($$0);
      this.h = ImmutableSet.of(eer.e, eer.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(auu $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(dqp $$0, dqq $$1, dlc $$2, Function<hx, ih<cun>> $$3, dlb $$4, hx.a $$5, hx.a $$6, dob $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         djg $$9;
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
