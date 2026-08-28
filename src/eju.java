import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class eju extends ejs {
   public eju(Codec<ejr> $$0) {
      super($$0);
      this.h = ImmutableSet.of(eyb.e, eyb.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(bai $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(ejq $$0, ejr $$1, edn $$2, Function<iw, jg<dlm>> $$3, edm $$4, iw.a $$5, iw.a $$6, ehb $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         ebq $$9;
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
