import com.mojang.serialization.Codec;
import java.util.Optional;

public class dou extends dny<dql> {
   public dou(Codec<dql> $$0) {
      super($$0);
   }

   @Override
   public boolean a(doa<dql> $$0) {
      cpy $$1 = $$0.b();
      gw $$2 = $$0.e();
      ase $$3 = $$0.d();
      dql $$4 = $$0.f();
      Optional<hc> $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         gw $$6 = $$2.a($$5.get().g());
         a($$1, $$3, $$6, $$4);
         int $$7 = $$3.i() < $$4.b && dnu.c($$1.a_($$2.a($$5.get()))) ? 2 : 1;
         dnu.a($$1, $$2, $$5.get(), $$7, false);
         return true;
      }
   }

   private static Optional<hc> a(cpy $$0, gw $$1, ase $$2) {
      boolean $$3 = dnu.b($$0.a_($$1.c()));
      boolean $$4 = dnu.b($$0.a_($$1.d()));
      if ($$3 && $$4) {
         return Optional.of($$2.h() ? hc.a : hc.b);
      } else if ($$3) {
         return Optional.of(hc.a);
      } else {
         return $$4 ? Optional.of(hc.b) : Optional.empty();
      }
   }

   private static void a(cpy $$0, ase $$1, gw $$2, dql $$3) {
      dnu.c($$0, $$2);

      for (hc $$4 : hc.c.a) {
         if (!($$1.i() > $$3.c)) {
            gw $$5 = $$2.a($$4);
            dnu.c($$0, $$5);
            if (!($$1.i() > $$3.d)) {
               gw $$6 = $$5.a(hc.b($$1));
               dnu.c($$0, $$6);
               if (!($$1.i() > $$3.e)) {
                  gw $$7 = $$6.a(hc.b($$1));
                  dnu.c($$0, $$7);
               }
            }
         }
      }
   }
}
