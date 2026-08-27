import com.mojang.serialization.Codec;
import java.util.Optional;

public class dqw extends dqa<dsn> {
   public dqw(Codec<dsn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dqc<dsn> $$0) {
      csg $$1 = $$0.b();
      hx $$2 = $$0.e();
      atw $$3 = $$0.d();
      dsn $$4 = $$0.f();
      Optional<ib> $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         hx $$6 = $$2.a($$5.get().g());
         a($$1, $$3, $$6, $$4);
         int $$7 = $$3.i() < $$4.b && dpw.c($$1.a_($$2.a($$5.get()))) ? 2 : 1;
         dpw.a($$1, $$2, $$5.get(), $$7, false);
         return true;
      }
   }

   private static Optional<ib> a(csg $$0, hx $$1, atw $$2) {
      boolean $$3 = dpw.b($$0.a_($$1.c()));
      boolean $$4 = dpw.b($$0.a_($$1.d()));
      if ($$3 && $$4) {
         return Optional.of($$2.h() ? ib.a : ib.b);
      } else if ($$3) {
         return Optional.of(ib.a);
      } else {
         return $$4 ? Optional.of(ib.b) : Optional.empty();
      }
   }

   private static void a(csg $$0, atw $$1, hx $$2, dsn $$3) {
      dpw.c($$0, $$2);

      for (ib $$4 : ib.c.a) {
         if (!($$1.i() > $$3.c)) {
            hx $$5 = $$2.a($$4);
            dpw.c($$0, $$5);
            if (!($$1.i() > $$3.d)) {
               hx $$6 = $$5.a(ib.b($$1));
               dpw.c($$0, $$6);
               if (!($$1.i() > $$3.e)) {
                  hx $$7 = $$6.a(ib.b($$1));
                  dpw.c($$0, $$7);
               }
            }
         }
      }
   }
}
