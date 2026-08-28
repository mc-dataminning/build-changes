import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class eat extends ebe<edp> {
   public eat(Codec<edp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebg<edp> $$0) {
      aym $$1 = $$0.d();
      dcz $$2 = $$0.b();
      ja $$3 = $$0.e();
      Optional<dff> $$4 = lq.e.a(avu.aq, $$1).map(jj::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().o());
   }

   protected abstract boolean a(dce var1, aym var2, ja var3, dsh var4);

   protected boolean b(dce $$0, aym $$1, ja $$2, dsh $$3) {
      ja $$4 = $$2.c();
      dsh $$5 = $$0.a_($$2);
      if (($$5.a(dfh.G) || $$5.a(avu.at)) && $$0.a_($$4).a(dfh.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            lq.e.a(avu.at, $$1).map(jj::a).ifPresent($$2x -> $$0.a($$4, $$2x.o(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dfh.mV.o().a(dmc.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (jf $$6 : jf.c.a) {
            if ($$1.i() < 0.2F) {
               ja $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dfh.G)) {
                  lq.e.a(avu.ar, $$1).map(jj::a).ifPresent($$3x -> {
                     dsh $$4x = $$3x.o();
                     if ($$4x.b(deq.c)) {
                        $$4x = $$4x.a(deq.c, $$6);
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
