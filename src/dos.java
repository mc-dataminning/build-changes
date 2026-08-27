import com.mojang.serialization.Codec;
import java.util.Optional;

public class dos extends dnw<dqj> {
   public dos(Codec<dqj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dny<dqj> $$0) {
      cpw $$1 = $$0.b();
      gw $$2 = $$0.e();
      asc $$3 = $$0.d();
      dqj $$4 = $$0.f();
      Optional<hc> $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         gw $$6 = $$2.a($$5.get().g());
         a($$1, $$3, $$6, $$4);
         int $$7 = $$3.i() < $$4.b && dns.c($$1.a_($$2.a($$5.get()))) ? 2 : 1;
         dns.a($$1, $$2, $$5.get(), $$7, false);
         return true;
      }
   }

   private static Optional<hc> a(cpw $$0, gw $$1, asc $$2) {
      boolean $$3 = dns.b($$0.a_($$1.c()));
      boolean $$4 = dns.b($$0.a_($$1.d()));
      if ($$3 && $$4) {
         return Optional.of($$2.h() ? hc.a : hc.b);
      } else if ($$3) {
         return Optional.of(hc.a);
      } else {
         return $$4 ? Optional.of(hc.b) : Optional.empty();
      }
   }

   private static void a(cpw $$0, asc $$1, gw $$2, dqj $$3) {
      dns.c($$0, $$2);

      for (hc $$4 : hc.c.a) {
         if (!($$1.i() > $$3.c)) {
            gw $$5 = $$2.a($$4);
            dns.c($$0, $$5);
            if (!($$1.i() > $$3.d)) {
               gw $$6 = $$5.a(hc.b($$1));
               dns.c($$0, $$6);
               if (!($$1.i() > $$3.e)) {
                  gw $$7 = $$6.a(hc.b($$1));
                  dns.c($$0, $$7);
               }
            }
         }
      }
   }
}
