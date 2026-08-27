import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class dxe extends dxc {
   public dxe(Codec<dxb> $$0) {
      super($$0);
      this.h = ImmutableSet.of(elc.e, elc.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(axt $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(dxa $$0, dxb $$1, dre $$2, Function<id, in<daf>> $$3, drd $$4, id.a $$5, id.a $$6, dum $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         dpi $$9;
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
