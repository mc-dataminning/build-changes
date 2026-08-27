import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class dmm extends dmk {
   public dmm(Codec<dmj> $$0) {
      super($$0);
      this.h = ImmutableSet.of(ead.e, ead.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(aru $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(dmi $$0, dmj $$1, dgv $$2, Function<gu, he<cqj>> $$3, dgu $$4, gu.a $$5, gu.a $$6, dju $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         dez $$9;
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
