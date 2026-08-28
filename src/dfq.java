import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dfq {
   ewf q_ = deu.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dso r_ = dsn.D;

   static bqp a(@Nullable bsp $$0, drx $$1, dbt $$2, iz $$3) {
      if ($$1.c(r_)) {
         deu.a($$2, $$3, new cuk(cun.ws, 1));
         float $$4 = ayu.b($$2.z, 0.8F, 1.2F);
         $$2.a(null, $$3, avw.ee, avx.e, 1.0F, $$4);
         drx $$5 = $$1.a(r_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(dwq.c, $$3, dwq.a.a($$0, $$5));
         return bqp.a($$2.B);
      } else {
         return bqp.e;
      }
   }

   static boolean h_(drx $$0) {
      return $$0.b(r_) && $$0.c(r_);
   }

   static ToIntFunction<drx> h_(int $$0) {
      return $$1 -> $$1.c(dsn.D) ? $$0 : 0;
   }
}
