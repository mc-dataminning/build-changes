import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class dmn extends dml {
   public dmn(Codec<dmk> $$0) {
      super($$0);
      this.h = ImmutableSet.of(eae.e, eae.c);
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

   protected boolean a(dmj $$0, dmk $$1, dgw $$2, Function<gu, he<cqk>> $$3, dgv $$4, gu.a $$5, gu.a $$6, djv $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         dfa $$9;
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
