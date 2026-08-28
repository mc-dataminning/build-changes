import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dnk {
   ffr s_ = dmm.b(14.0, 0.0, 16.0);
   ebf t_ = ebe.b;

   static bug a(@Nullable bwi $$0, eao $$1, djh $$2, iv $$3) {
      if ($$1.c(t_)) {
         dmm.a($$2, $$3, new czk(czo.xH, 1));
         float $$4 = azm.b($$2.A, 0.8F, 1.2F);
         $$2.a(null, $$3, awn.ei, awo.e, 1.0F, $$4);
         eao $$5 = $$1.b(t_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(efo.c, $$3, efo.a.a($$0, $$5));
         return bug.a;
      } else {
         return bug.e;
      }
   }

   static boolean j_(eao $$0) {
      return $$0.b(t_) && $$0.c(t_);
   }

   static ToIntFunction<eao> i_(int $$0) {
      return $$1 -> $$1.c(ebe.b) ? $$0 : 0;
   }
}
