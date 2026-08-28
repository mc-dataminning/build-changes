import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class eba extends eay {
   public eba(Codec<eax> $$0) {
      super($$0);
      this.h = ImmutableSet.of(eoz.e, eoz.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(ayv $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(eaw $$0, eax $$1, duw $$2, Function<jd, jm<ddu>> $$3, duv $$4, jd.a $$5, jd.a $$6, dyh $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         dta $$9;
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
