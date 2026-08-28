import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class eil extends eij {
   public eil(Codec<eii> $$0) {
      super($$0);
      this.h = ImmutableSet.of(ewp.e, ewp.c);
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

   protected boolean a(eih $$0, eii $$1, ece $$2, Function<iu, je<dkd>> $$3, ecd $$4, iu.a $$5, iu.a $$6, efs $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         eah $$9;
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
