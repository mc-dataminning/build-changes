import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dgb {
   ews q_ = dff.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dsy r_ = dsx.D;

   static bqd a(@Nullable bsd $$0, dsh $$1, dcd $$2, ja $$3) {
      if ($$1.c(r_)) {
         dff.a($$2, $$3, new cua(cud.wv, 1));
         float $$4 = aye.b($$2.z, 0.8F, 1.2F);
         $$2.a(null, $$3, avf.ee, avg.e, 1.0F, $$4);
         dsh $$5 = $$1.a(r_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(dxa.c, $$3, dxa.a.a($$0, $$5));
         return bqd.a($$2.B);
      } else {
         return bqd.e;
      }
   }

   static boolean h_(dsh $$0) {
      return $$0.b(r_) && $$0.c(r_);
   }

   static ToIntFunction<dsh> h_(int $$0) {
      return $$1 -> $$1.c(dsx.D) ? $$0 : 0;
   }
}
