import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class dqr extends drc<dtn> {
   public dqr(Codec<dtn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dre<dtn> $$0) {
      auf $$1 = $$0.d();
      ctt $$2 = $$0.b();
      hv $$3 = $$0.e();
      Optional<cvz> $$4 = kb.e.b(arr.ap).flatMap($$1x -> $$1x.a($$1)).map(ie::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().o());
   }

   protected abstract boolean a(csz var1, auf var2, hv var3, dip var4);

   protected boolean b(csz $$0, auf $$1, hv $$2, dip $$3) {
      hv $$4 = $$2.c();
      dip $$5 = $$0.a_($$2);
      if (($$5.a(cwb.G) || $$5.a(arr.as)) && $$0.a_($$4).a(cwb.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            kb.e.b(arr.as).flatMap($$1x -> $$1x.a($$1)).map(ie::a).ifPresent($$2x -> $$0.a($$4, $$2x.o(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, cwb.mV.o().a(dcv.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (ia $$6 : ia.c.a) {
            if ($$1.i() < 0.2F) {
               hv $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(cwb.G)) {
                  kb.e.b(arr.aq).flatMap($$1x -> $$1x.a($$1)).map(ie::a).ifPresent($$3x -> {
                     dip $$4x = $$3x.o();
                     if ($$4x.b(cvk.c)) {
                        $$4x = $$4x.a(cvk.c, $$6);
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
