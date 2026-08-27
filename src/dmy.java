import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class dmy extends dmw {
   public dmy(Codec<dmv> $$0) {
      super($$0);
      this.h = ImmutableSet.of(eap.e, eap.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(ase $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(dmu $$0, dmv $$1, dhh $$2, Function<gw, hg<cqv>> $$3, dhg $$4, gw.a $$5, gw.a $$6, dkg $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         dfl $$9;
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
