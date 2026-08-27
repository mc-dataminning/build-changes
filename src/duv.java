import com.mojang.serialization.Codec;
import java.util.Optional;

public class duv extends dtz<dwm> {
   public duv(Codec<dwm> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dub<dwm> $$0) {
      cvs $$1 = $$0.b();
      hz $$2 = $$0.e();
      awp $$3 = $$0.d();
      dwm $$4 = $$0.f();
      Optional<ie> $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         hz $$6 = $$2.a($$5.get().g());
         a($$1, $$3, $$6, $$4);
         int $$7 = $$3.i() < $$4.b && dtv.c($$1.a_($$2.a($$5.get()))) ? 2 : 1;
         dtv.a($$1, $$2, $$5.get(), $$7, false);
         return true;
      }
   }

   private static Optional<ie> a(cvs $$0, hz $$1, awp $$2) {
      boolean $$3 = dtv.b($$0.a_($$1.c()));
      boolean $$4 = dtv.b($$0.a_($$1.d()));
      if ($$3 && $$4) {
         return Optional.of($$2.h() ? ie.a : ie.b);
      } else if ($$3) {
         return Optional.of(ie.a);
      } else {
         return $$4 ? Optional.of(ie.b) : Optional.empty();
      }
   }

   private static void a(cvs $$0, awp $$1, hz $$2, dwm $$3) {
      dtv.c($$0, $$2);

      for (ie $$4 : ie.c.a) {
         if (!($$1.i() > $$3.c)) {
            hz $$5 = $$2.a($$4);
            dtv.c($$0, $$5);
            if (!($$1.i() > $$3.d)) {
               hz $$6 = $$5.a(ie.b($$1));
               dtv.c($$0, $$6);
               if (!($$1.i() > $$3.e)) {
                  hz $$7 = $$6.a(ie.b($$1));
                  dtv.c($$0, $$7);
               }
            }
         }
      }
   }
}
