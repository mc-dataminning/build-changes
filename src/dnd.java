import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dnd {
   ffk s_ = dmf.b(14.0, 0.0, 16.0);
   eay t_ = eax.b;

   static bud a(@Nullable bwf $$0, eah $$1, dja $$2, iu $$3) {
      if ($$1.c(t_)) {
         dmf.a($$2, $$3, new czd(czh.xH, 1));
         float $$4 = azm.b($$2.A, 0.8F, 1.2F);
         $$2.a(null, $$3, awn.ei, awo.e, 1.0F, $$4);
         eah $$5 = $$1.b(t_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(efh.c, $$3, efh.a.a($$0, $$5));
         return bud.a;
      } else {
         return bud.e;
      }
   }

   static boolean j_(eah $$0) {
      return $$0.b(t_) && $$0.c(t_);
   }

   static ToIntFunction<eah> i_(int $$0) {
      return $$1 -> $$1.c(eax.b) ? $$0 : 0;
   }
}
