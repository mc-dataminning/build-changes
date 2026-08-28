import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dfu {
   ewj q_ = dey.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dss r_ = dsr.D;

   static bqt a(@Nullable bst $$0, dsb $$1, dbx $$2, iz $$3) {
      if ($$1.c(r_)) {
         dey.a($$2, $$3, new cuo(cur.ws, 1));
         float $$4 = ayy.b($$2.z, 0.8F, 1.2F);
         $$2.a(null, $$3, avz.ee, awa.e, 1.0F, $$4);
         dsb $$5 = $$1.a(r_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(dwu.c, $$3, dwu.a.a($$0, $$5));
         return bqt.a($$2.B);
      } else {
         return bqt.e;
      }
   }

   static boolean h_(dsb $$0) {
      return $$0.b(r_) && $$0.c(r_);
   }

   static ToIntFunction<dsb> h_(int $$0) {
      return $$1 -> $$1.c(dsr.D) ? $$0 : 0;
   }
}
