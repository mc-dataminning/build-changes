import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class drc extends drn<dty> {
   public drc(Codec<dty> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drp<dty> $$0) {
      aup $$1 = $$0.d();
      cud $$2 = $$0.b();
      hx $$3 = $$0.e();
      Optional<cwj> $$4 = kd.e.b(asb.ap).flatMap($$1x -> $$1x.a($$1)).map(ih::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().o());
   }

   protected abstract boolean a(ctj var1, aup var2, hx var3, dja var4);

   protected boolean b(ctj $$0, aup $$1, hx $$2, dja $$3) {
      hx $$4 = $$2.c();
      dja $$5 = $$0.a_($$2);
      if (($$5.a(cwl.G) || $$5.a(asb.as)) && $$0.a_($$4).a(cwl.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            kd.e.b(asb.as).flatMap($$1x -> $$1x.a($$1)).map(ih::a).ifPresent($$2x -> $$0.a($$4, $$2x.o(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, cwl.mV.o().a(ddf.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (ic $$6 : ic.c.a) {
            if ($$1.i() < 0.2F) {
               hx $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(cwl.G)) {
                  kd.e.b(asb.aq).flatMap($$1x -> $$1x.a($$1)).map(ih::a).ifPresent($$3x -> {
                     dja $$4x = $$3x.o();
                     if ($$4x.b(cvu.c)) {
                        $$4x = $$4x.a(cvu.c, $$6);
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
