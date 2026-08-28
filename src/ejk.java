import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class ejk extends eji {
   public ejk(Codec<ejh> $$0) {
      super($$0);
      this.h = ImmutableSet.of(exr.e, exr.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(azz $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(ejg $$0, ejh $$1, edd $$2, Function<iw, jg<dlc>> $$3, edc $$4, iw.a $$5, iw.a $$6, egr $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         ebg $$9;
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
