import com.mojang.serialization.Codec;
import java.util.Optional;

public class dlk extends dko<dnb> {
   public dlk(Codec<dnb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dkq<dnb> $$0) {
      cmn $$1 = $$0.b();
      gu $$2 = $$0.e();
      apf $$3 = $$0.d();
      dnb $$4 = $$0.f();
      Optional<ha> $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         gu $$6 = $$2.a($$5.get().g());
         a($$1, $$3, $$6, $$4);
         int $$7 = $$3.i() < $$4.b && dkk.c($$1.a_($$2.a($$5.get()))) ? 2 : 1;
         dkk.a($$1, $$2, $$5.get(), $$7, false);
         return true;
      }
   }

   private static Optional<ha> a(cmn $$0, gu $$1, apf $$2) {
      boolean $$3 = dkk.b($$0.a_($$1.c()));
      boolean $$4 = dkk.b($$0.a_($$1.d()));
      if ($$3 && $$4) {
         return Optional.of($$2.h() ? ha.a : ha.b);
      } else if ($$3) {
         return Optional.of(ha.a);
      } else {
         return $$4 ? Optional.of(ha.b) : Optional.empty();
      }
   }

   private static void a(cmn $$0, apf $$1, gu $$2, dnb $$3) {
      dkk.c($$0, $$2);

      for (ha $$4 : ha.c.a) {
         if (!($$1.i() > $$3.c)) {
            gu $$5 = $$2.a($$4);
            dkk.c($$0, $$5);
            if (!($$1.i() > $$3.d)) {
               gu $$6 = $$5.a(ha.b($$1));
               dkk.c($$0, $$6);
               if (!($$1.i() > $$3.e)) {
                  gu $$7 = $$6.a(ha.b($$1));
                  dkk.c($$0, $$7);
               }
            }
         }
      }
   }
}
