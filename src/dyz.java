import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class dyz extends dyx {
   public dyz(Codec<dyw> $$0) {
      super($$0);
      this.h = ImmutableSet.of(emx.e, emx.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(aym $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(dyv $$0, dyw $$1, dsz $$2, Function<io, ix<dby>> $$3, dsy $$4, io.a $$5, io.a $$6, dwh $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         drd $$9;
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
