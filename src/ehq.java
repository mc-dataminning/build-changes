import com.mojang.serialization.Codec;
import java.util.Optional;

public class ehq extends egu<ejh> {
   public ehq(Codec<ejh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egw<ejh> $$0) {
      dha $$1 = $$0.b();
      ji $$2 = $$0.e();
      azh $$3 = $$0.d();
      ejh $$4 = $$0.f();
      Optional<jn> $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         ji $$6 = $$2.a($$5.get().g());
         a($$1, $$3, $$6, $$4);
         int $$7 = $$3.i() < $$4.b && egp.c($$1.a_($$2.a($$5.get()))) ? 2 : 1;
         egp.a($$1, $$2, $$5.get(), $$7, false);
         return true;
      }
   }

   private static Optional<jn> a(dha $$0, ji $$1, azh $$2) {
      boolean $$3 = egp.b($$0.a_($$1.d()));
      boolean $$4 = egp.b($$0.a_($$1.e()));
      if ($$3 && $$4) {
         return Optional.of($$2.h() ? jn.a : jn.b);
      } else if ($$3) {
         return Optional.of(jn.a);
      } else {
         return $$4 ? Optional.of(jn.b) : Optional.empty();
      }
   }

   private static void a(dha $$0, azh $$1, ji $$2, ejh $$3) {
      egp.c($$0, $$2);

      for (jn $$4 : jn.c.a) {
         if (!($$1.i() > $$3.c)) {
            ji $$5 = $$2.a($$4);
            egp.c($$0, $$5);
            if (!($$1.i() > $$3.d)) {
               ji $$6 = $$5.a(jn.b($$1));
               egp.c($$0, $$6);
               if (!($$1.i() > $$3.e)) {
                  ji $$7 = $$6.a(jn.b($$1));
                  egp.c($$0, $$7);
               }
            }
         }
      }
   }
}
