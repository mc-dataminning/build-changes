import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class dzz extends dzx {
   public dzz(Codec<dzw> $$0) {
      super($$0);
      this.h = ImmutableSet.of(enx.e, enx.c);
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

   protected boolean a(dzv $$0, dzw $$1, dtz $$2, Function<iz, ji<dcy>> $$3, dty $$4, iz.a $$5, iz.a $$6, dxh $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         dsd $$9;
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
