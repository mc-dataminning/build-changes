import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dmx {
   ffc s_ = dma.b(14.0, 0.0, 16.0);
   eaq t_ = eap.b;

   static bub a(@Nullable bwd $$0, dzz $$1, div $$2, iu $$3) {
      if ($$1.c(t_)) {
         dma.a($$2, $$3, new cyy(czc.xC, 1));
         float $$4 = azm.b($$2.A, 0.8F, 1.2F);
         $$2.a(null, $$3, awn.eg, awo.e, 1.0F, $$4);
         dzz $$5 = $$1.b(t_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(eez.c, $$3, eez.a.a($$0, $$5));
         return bub.a;
      } else {
         return bub.e;
      }
   }

   static boolean j_(dzz $$0) {
      return $$0.b(t_) && $$0.c(t_);
   }

   static ToIntFunction<dzz> i_(int $$0) {
      return $$1 -> $$1.c(eap.b) ? $$0 : 0;
   }
}
