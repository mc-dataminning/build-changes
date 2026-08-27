import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class dsz extends dsx {
   public dsz(Codec<dsw> $$0) {
      super($$0);
      this.h = ImmutableSet.of(egx.e, egx.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(awp $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(dsv $$0, dsw $$1, dnf $$2, Function<hz, ij<cwq>> $$3, dne $$4, hz.a $$5, hz.a $$6, dqh $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         dlj $$9;
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
