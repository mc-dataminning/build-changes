import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class eid extends eib {
   public eid(Codec<eia> $$0) {
      super($$0);
      this.h = ImmutableSet.of(ewh.e, ewh.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(azv $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(ehz $$0, eia $$1, ebw $$2, Function<iu, je<djy>> $$3, ebv $$4, iu.a $$5, iu.a $$6, efk $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         dzz $$9;
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
