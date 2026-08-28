import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dmr {
   feq s_ = dlu.b(14.0, 0.0, 16.0);
   eaf t_ = eae.b;

   static bty a(@Nullable bwa $$0, dzo $$1, dip $$2, iu $$3) {
      if ($$1.c(t_)) {
         dlu.a($$2, $$3, new cys(cyw.xA, 1));
         float $$4 = azk.b($$2.A, 0.8F, 1.2F);
         $$2.a(null, $$3, awl.eg, awm.e, 1.0F, $$4);
         dzo $$5 = $$1.b(t_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(eeo.c, $$3, eeo.a.a($$0, $$5));
         return bty.a;
      } else {
         return bty.e;
      }
   }

   static boolean j_(dzo $$0) {
      return $$0.b(t_) && $$0.c(t_);
   }

   static ToIntFunction<dzo> i_(int $$0) {
      return $$1 -> $$1.c(eae.b) ? $$0 : 0;
   }
}
