import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class ect extends ecr {
   public ect(Codec<ecq> $$0) {
      super($$0);
      this.h = ImmutableSet.of(equ.e, equ.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(azn $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(ecp $$0, ecq $$1, dwo $$2, Function<jf, jo<dfk>> $$3, dwn $$4, jf.a $$5, jf.a $$6, eaa $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         dus $$9;
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
