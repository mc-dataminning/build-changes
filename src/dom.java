import com.mojang.serialization.Codec;
import java.util.Optional;

public class dom extends dnq<dqd> {
   public dom(Codec<dqd> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dns<dqd> $$0) {
      cqc $$1 = $$0.b();
      gw $$2 = $$0.e();
      ash $$3 = $$0.d();
      dqd $$4 = $$0.f();
      Optional<ha> $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         gw $$6 = $$2.a($$5.get().g());
         a($$1, $$3, $$6, $$4);
         int $$7 = $$3.i() < $$4.b && dnm.c($$1.a_($$2.a($$5.get()))) ? 2 : 1;
         dnm.a($$1, $$2, $$5.get(), $$7, false);
         return true;
      }
   }

   private static Optional<ha> a(cqc $$0, gw $$1, ash $$2) {
      boolean $$3 = dnm.b($$0.a_($$1.c()));
      boolean $$4 = dnm.b($$0.a_($$1.d()));
      if ($$3 && $$4) {
         return Optional.of($$2.h() ? ha.a : ha.b);
      } else if ($$3) {
         return Optional.of(ha.a);
      } else {
         return $$4 ? Optional.of(ha.b) : Optional.empty();
      }
   }

   private static void a(cqc $$0, ash $$1, gw $$2, dqd $$3) {
      dnm.c($$0, $$2);

      for (ha $$4 : ha.c.a) {
         if (!($$1.i() > $$3.c)) {
            gw $$5 = $$2.a($$4);
            dnm.c($$0, $$5);
            if (!($$1.i() > $$3.d)) {
               gw $$6 = $$5.a(ha.b($$1));
               dnm.c($$0, $$6);
               if (!($$1.i() > $$3.e)) {
                  gw $$7 = $$6.a(ha.b($$1));
                  dnm.c($$0, $$7);
               }
            }
         }
      }
   }
}
