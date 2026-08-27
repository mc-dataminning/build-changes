import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class drr extends dsc<dun> {
   public drr(Codec<dun> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dse<dun> $$0) {
      auw $$1 = $$0.d();
      cus $$2 = $$0.b();
      hx $$3 = $$0.e();
      Optional<cwy> $$4 = kd.e.b(asi.ap).flatMap($$1x -> $$1x.a($$1)).map(ih::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().o());
   }

   protected abstract boolean a(cty var1, auw var2, hx var3, djp var4);

   protected boolean b(cty $$0, auw $$1, hx $$2, djp $$3) {
      hx $$4 = $$2.c();
      djp $$5 = $$0.a_($$2);
      if (($$5.a(cxa.G) || $$5.a(asi.as)) && $$0.a_($$4).a(cxa.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            kd.e.b(asi.as).flatMap($$1x -> $$1x.a($$1)).map(ih::a).ifPresent($$2x -> $$0.a($$4, $$2x.o(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, cxa.mV.o().a(ddu.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (ic $$6 : ic.c.a) {
            if ($$1.i() < 0.2F) {
               hx $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(cxa.G)) {
                  kd.e.b(asi.aq).flatMap($$1x -> $$1x.a($$1)).map(ih::a).ifPresent($$3x -> {
                     djp $$4x = $$3x.o();
                     if ($$4x.b(cwj.c)) {
                        $$4x = $$4x.a(cwj.c, $$6);
                     }

                     $$0.a($$7, $$4x, 2);
                  });
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }
}
