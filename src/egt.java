import com.mojang.serialization.Codec;
import java.util.Optional;

public class egt extends efx<eik> {
   public egt(Codec<eik> $$0) {
      super($$0);
   }

   @Override
   public boolean a(efz<eik> $$0) {
      dgi $$1 = $$0.b();
      ji $$2 = $$0.e();
      azh $$3 = $$0.d();
      eik $$4 = $$0.f();
      Optional<jn> $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         ji $$6 = $$2.a($$5.get().g());
         a($$1, $$3, $$6, $$4);
         int $$7 = $$3.i() < $$4.b && efs.c($$1.a_($$2.a($$5.get()))) ? 2 : 1;
         efs.a($$1, $$2, $$5.get(), $$7, false);
         return true;
      }
   }

   private static Optional<jn> a(dgi $$0, ji $$1, azh $$2) {
      boolean $$3 = efs.b($$0.a_($$1.d()));
      boolean $$4 = efs.b($$0.a_($$1.e()));
      if ($$3 && $$4) {
         return Optional.of($$2.h() ? jn.a : jn.b);
      } else if ($$3) {
         return Optional.of(jn.a);
      } else {
         return $$4 ? Optional.of(jn.b) : Optional.empty();
      }
   }

   private static void a(dgi $$0, azh $$1, ji $$2, eik $$3) {
      efs.c($$0, $$2);

      for (jn $$4 : jn.c.a) {
         if (!($$1.i() > $$3.c)) {
            ji $$5 = $$2.a($$4);
            efs.c($$0, $$5);
            if (!($$1.i() > $$3.d)) {
               ji $$6 = $$5.a(jn.b($$1));
               efs.c($$0, $$6);
               if (!($$1.i() > $$3.e)) {
                  ji $$7 = $$6.a(jn.b($$1));
                  efs.c($$0, $$7);
               }
            }
         }
      }
   }
}
