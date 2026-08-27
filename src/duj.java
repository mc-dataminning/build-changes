import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class duj extends duu<dxf> {
   public duj(Codec<dxf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(duw<dxf> $$0) {
      awt $$1 = $$0.d();
      cwz $$2 = $$0.b();
      ib $$3 = $$0.e();
      Optional<czf> $$4 = kh.e.a(aue.ap, $$1).map(il::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().o());
   }

   protected abstract boolean a(cwf var1, awt var2, ib var3, dme var4);

   protected boolean b(cwf $$0, awt $$1, ib $$2, dme $$3) {
      ib $$4 = $$2.c();
      dme $$5 = $$0.a_($$2);
      if (($$5.a(czh.G) || $$5.a(aue.as)) && $$0.a_($$4).a(czh.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            kh.e.a(aue.as, $$1).map(il::a).ifPresent($$2x -> $$0.a($$4, $$2x.o(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, czh.mV.o().a(dgb.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (ih $$6 : ih.c.a) {
            if ($$1.i() < 0.2F) {
               ib $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(czh.G)) {
                  kh.e.a(aue.aq, $$1).map(il::a).ifPresent($$3x -> {
                     dme $$4x = $$3x.o();
                     if ($$4x.b(cyq.c)) {
                        $$4x = $$4x.a(cyq.c, $$6);
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
