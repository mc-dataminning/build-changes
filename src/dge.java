import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dge {
   exa q_ = dfi.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dtc r_ = dtb.D;

   static bqh a(@Nullable bsh $$0, dsl $$1, dcg $$2, ja $$3) {
      if ($$1.c(r_)) {
         dfi.a($$2, $$3, new cud(cug.wv, 1));
         float $$4 = ayg.b($$2.z, 0.8F, 1.2F);
         $$2.a(null, $$3, avh.ee, avi.e, 1.0F, $$4);
         dsl $$5 = $$1.a(r_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(dxh.c, $$3, dxh.a.a($$0, $$5));
         return bqh.a($$2.B);
      } else {
         return bqh.e;
      }
   }

   static boolean h_(dsl $$0) {
      return $$0.b(r_) && $$0.c(r_);
   }

   static ToIntFunction<dsl> h_(int $$0) {
      return $$1 -> $$1.c(dtb.D) ? $$0 : 0;
   }
}
