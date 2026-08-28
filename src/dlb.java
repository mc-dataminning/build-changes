import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dlb {
   fcm s_ = dke.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dye t_ = dyd.E;

   static bte a(@Nullable bvf $$0, dxn $$1, dha $$2, jh $$3) {
      if ($$1.c(t_)) {
         dke.a($$2, $$3, new cxk(cxo.xm, 1));
         float $$4 = bae.b($$2.A, 0.8F, 1.2F);
         $$2.a(null, $$3, axf.ef, axg.e, 1.0F, $$4);
         dxn $$5 = $$1.b(t_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(ecj.c, $$3, ecj.a.a($$0, $$5));
         return bte.a;
      } else {
         return bte.e;
      }
   }

   static boolean j_(dxn $$0) {
      return $$0.b(t_) && $$0.c(t_);
   }

   static ToIntFunction<dxn> i_(int $$0) {
      return $$1 -> $$1.c(dyd.E) ? $$0 : 0;
   }
}
