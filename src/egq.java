import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class egq extends ego {
   public egq(Codec<egn> $$0) {
      super($$0);
      this.h = ImmutableSet.of(euu.e, euu.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(azs $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(egm $$0, egn $$1, eaj $$2, Function<jj, js<dis>> $$3, eai $$4, jj.a $$5, jj.a $$6, edx $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         dym $$9;
         if ($$5.v() <= $$0.a() + 31) {
            $$9 = g.g();
         } else {
            $$9 = e;
         }

         $$2.a($$5, $$9);
         return true;
      } else {
         return false;
      }
   }
}
