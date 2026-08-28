import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dgd {
   ewy q_ = dfh.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dtb r_ = dta.D;

   static bqg a(@Nullable bsg $$0, dsk $$1, dcf $$2, ja $$3) {
      if ($$1.c(r_)) {
         dfh.a($$2, $$3, new cuc(cuf.wv, 1));
         float $$4 = ayg.b($$2.z, 0.8F, 1.2F);
         $$2.a(null, $$3, avh.ee, avi.e, 1.0F, $$4);
         dsk $$5 = $$1.a(r_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(dxg.c, $$3, dxg.a.a($$0, $$5));
         return bqg.a($$2.B);
      } else {
         return bqg.e;
      }
   }

   static boolean h_(dsk $$0) {
      return $$0.b(r_) && $$0.c(r_);
   }

   static ToIntFunction<dsk> h_(int $$0) {
      return $$1 -> $$1.c(dta.D) ? $$0 : 0;
   }
}
