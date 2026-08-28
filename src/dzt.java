import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class dzt extends dzr {
   public dzt(Codec<dzq> $$0) {
      super($$0);
      this.h = ImmutableSet.of(enr.e, enr.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(azc $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(dzp $$0, dzq $$1, dtt $$2, Function<iz, ji<dcs>> $$3, dts $$4, iz.a $$5, iz.a $$6, dxb $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         drx $$9;
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
