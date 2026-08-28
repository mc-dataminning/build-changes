import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface djm {
   fas s_ = diq.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dwm t_ = dwl.D;

   static bsk a(@Nullable bul $$0, dvv $$1, dfm $$2, jh $$3) {
      if ($$1.c(t_)) {
         diq.a($$2, $$3, new cwm(cwq.wO, 1));
         float $$4 = azm.b($$2.A, 0.8F, 1.2F);
         $$2.a(null, $$3, awn.ef, awo.e, 1.0F, $$4);
         dvv $$5 = $$1.b(t_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(ear.c, $$3, ear.a.a($$0, $$5));
         return bsk.a;
      } else {
         return bsk.e;
      }
   }

   static boolean j_(dvv $$0) {
      return $$0.b(t_) && $$0.c(t_);
   }

   static ToIntFunction<dvv> i_(int $$0) {
      return $$1 -> $$1.c(dwl.D) ? $$0 : 0;
   }
}
