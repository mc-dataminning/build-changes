import com.mojang.serialization.Codec;
import java.util.Optional;

public class ecz extends eca<eet> {
   public ecz(Codec<eet> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eet> $$0) {
      dcb $$1 = $$0.b();
      ir $$2 = $$0.e();
      ayt $$3 = $$0.d();
      eet $$4 = $$0.f();
      Optional<iw> $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         ir $$6 = $$2.a($$5.get().g());
         a($$1, $$3, $$6, $$4);
         int $$7 = $$3.i() < $$4.b && ebv.c($$1.a_($$2.a($$5.get()))) ? 2 : 1;
         ebv.a($$1, $$2, $$5.get(), $$7, false);
         return true;
      }
   }

   private static Optional<iw> a(dcb $$0, ir $$1, ayt $$2) {
      dla $$3 = (dla)dfe.tE;
      boolean $$4 = ebv.b($$0.a_($$1.c()));
      boolean $$5 = ebv.b($$0.a_($$1.d()));
      if ($$4 && $$5) {
         return Optional.of($$2.h() ? iw.a : iw.b);
      } else if ($$4) {
         return Optional.of(iw.a);
      } else {
         return $$5 ? Optional.of(iw.b) : Optional.empty();
      }
   }

   private static void a(dcb $$0, ayt $$1, ir $$2, eet $$3) {
      dfc $$4 = dfe.tE;
      ebv.c($$0, $$2);

      for (iw $$5 : iw.c.a) {
         if (!($$1.i() > $$3.c)) {
            ir $$6 = $$2.a($$5);
            ebv.c($$0, $$6);
            if (!($$1.i() > $$3.d)) {
               ir $$7 = $$6.a(iw.b($$1));
               ebv.c($$0, $$7);
               if (!($$1.i() > $$3.e)) {
                  ir $$8 = $$7.a(iw.b($$1));
                  ebv.c($$0, $$8);
               }
            }
         }
      }
   }
}
