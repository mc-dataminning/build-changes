import com.mojang.serialization.Codec;
import java.util.Optional;

public class dqr extends dpv<dsi> {
   public dqr(Codec<dsi> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dpx<dsi> $$0) {
      csb $$1 = $$0.b();
      ht $$2 = $$0.e();
      ats $$3 = $$0.d();
      dsi $$4 = $$0.f();
      Optional<hx> $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         ht $$6 = $$2.a($$5.get().g());
         a($$1, $$3, $$6, $$4);
         int $$7 = $$3.i() < $$4.b && dpr.c($$1.a_($$2.a($$5.get()))) ? 2 : 1;
         dpr.a($$1, $$2, $$5.get(), $$7, false);
         return true;
      }
   }

   private static Optional<hx> a(csb $$0, ht $$1, ats $$2) {
      boolean $$3 = dpr.b($$0.a_($$1.c()));
      boolean $$4 = dpr.b($$0.a_($$1.d()));
      if ($$3 && $$4) {
         return Optional.of($$2.h() ? hx.a : hx.b);
      } else if ($$3) {
         return Optional.of(hx.a);
      } else {
         return $$4 ? Optional.of(hx.b) : Optional.empty();
      }
   }

   private static void a(csb $$0, ats $$1, ht $$2, dsi $$3) {
      dpr.c($$0, $$2);

      for (hx $$4 : hx.c.a) {
         if (!($$1.i() > $$3.c)) {
            ht $$5 = $$2.a($$4);
            dpr.c($$0, $$5);
            if (!($$1.i() > $$3.d)) {
               ht $$6 = $$5.a(hx.b($$1));
               dpr.c($$0, $$6);
               if (!($$1.i() > $$3.e)) {
                  ht $$7 = $$6.a(hx.b($$1));
                  dpr.c($$0, $$7);
               }
            }
         }
      }
   }
}
