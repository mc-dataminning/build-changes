import com.mojang.serialization.Codec;
import java.util.Optional;

public class dqf extends dpj<drw> {
   public dqf(Codec<drw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dpl<drw> $$0) {
      crt $$1 = $$0.b();
      ht $$2 = $$0.e();
      ato $$3 = $$0.d();
      drw $$4 = $$0.f();
      Optional<hx> $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         ht $$6 = $$2.a($$5.get().g());
         a($$1, $$3, $$6, $$4);
         int $$7 = $$3.i() < $$4.b && dpf.c($$1.a_($$2.a($$5.get()))) ? 2 : 1;
         dpf.a($$1, $$2, $$5.get(), $$7, false);
         return true;
      }
   }

   private static Optional<hx> a(crt $$0, ht $$1, ato $$2) {
      boolean $$3 = dpf.b($$0.a_($$1.c()));
      boolean $$4 = dpf.b($$0.a_($$1.d()));
      if ($$3 && $$4) {
         return Optional.of($$2.h() ? hx.a : hx.b);
      } else if ($$3) {
         return Optional.of(hx.a);
      } else {
         return $$4 ? Optional.of(hx.b) : Optional.empty();
      }
   }

   private static void a(crt $$0, ato $$1, ht $$2, drw $$3) {
      dpf.c($$0, $$2);

      for (hx $$4 : hx.c.a) {
         if (!($$1.i() > $$3.c)) {
            ht $$5 = $$2.a($$4);
            dpf.c($$0, $$5);
            if (!($$1.i() > $$3.d)) {
               ht $$6 = $$5.a(hx.b($$1));
               dpf.c($$0, $$6);
               if (!($$1.i() > $$3.e)) {
                  ht $$7 = $$6.a(hx.b($$1));
                  dpf.c($$0, $$7);
               }
            }
         }
      }
   }
}
