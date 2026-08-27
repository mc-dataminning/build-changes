import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class dno extends dnm {
   public dno(Codec<dnl> $$0) {
      super($$0);
      this.h = ImmutableSet.of(ebf.e, ebf.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(ate $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(dnk $$0, dnl $$1, dhx $$2, Function<ht, ib<crx>> $$3, dhw $$4, ht.a $$5, ht.a $$6, dkw $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         dgb $$9;
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
