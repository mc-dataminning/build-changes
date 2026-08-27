import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface ctl {
   eib r_ = csq.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dfv s_ = dfu.D;

   static bgt a(@Nullable bil $$0, dfe $$1, cpq $$2, gw $$3) {
      if ($$1.c(s_)) {
         csq.a($$2, $$3, new cja(cjd.vw, 1));
         float $$4 = ars.b($$2.z, 0.8F, 1.2F);
         $$2.a(null, $$3, aoz.dx, apa.e, 1.0F, $$4);
         dfe $$5 = $$1.a(s_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(djo.c, $$3, djo.a.a($$0, $$5));
         return bgt.a($$2.B);
      } else {
         return bgt.d;
      }
   }

   static boolean h_(dfe $$0) {
      return $$0.b(s_) && $$0.c(s_);
   }

   static ToIntFunction<dfe> h_(int $$0) {
      return $$1 -> $$1.c(dfu.D) ? $$0 : 0;
   }
}
